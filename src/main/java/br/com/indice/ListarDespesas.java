package br.com.indice;

import br.com.indice.dao.DespesaDAO;
import br.com.indice.model.Categoria;
import br.com.indice.model.Despesa;

import java.util.List;

public class ListarDespesas {

    public static void main(String[] args) {

         DespesaDAO dao = new DespesaDAO();
        //List<Despesa> despesas = dao.findAll();

        //for (Despesa despesa : despesas) {
        // System.out.println(" ID " + despesa.getId());
        //  System.out.println(" Descricao " + despesa.getDescricao());
        //   System.out.println(" Valor " + despesa.getValor());

        //  System.out.println("============================================");


        //Optional<Despesa> despesaOptional = dao.findById(2L);
        // despesaOptional.ifPresent(despesa -> {
        //   System.out.println(" ID " + despesa.getId());
        // System.out.println(" Descricao " + despesa.getDescricao());
        // System.out.println(" Valor " + despesa.getValor());

        //  });

    //  Despesa despesa = new Despesa();
    //   despesa.setDescricao("Indice Da Netflix");
    //   despesa.setCategoria(Categoria.MORADIA);
    //   despesa.setValor(40);
    //    despesa.setData(LocalDate.of(2021,5,20));
    //     Despesa despesaInserida = dao.save(despesa);
    //     System.out.println("Foi inserida a despesa com id: "+ despesaInserida.getId());

        List<Despesa> despesas = dao.findByCategoria(Categoria.MORADIA);
        for (Despesa despesa : despesas){
            System.out.println(" ID " + despesa.getId());
            System.out.println(" Descricao " + despesa.getDescricao());
            System.out.println(" Categoria "+despesa.getCategoria());
            System.out.println(" Valor " + despesa.getValor());

            System.out.println("============================================");

        }

    }
}
