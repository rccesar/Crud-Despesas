package br.com.indice;

import br.com.indice.dao.DespesaDAO;
import br.com.indice.model.Categoria;
import br.com.indice.model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesa {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> despesaOptional = dao.findById(1L);

        Despesa despesa = despesaOptional.get();
        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

        despesa.setDescricao("Gasto com Supermecado");
        despesa.setData(LocalDate.of(2021,8,20));
        despesa.setValor(300);
        despesa.setCategoria(Categoria.ALIMENTACAO);

        dao.update(despesa);




    }
}
