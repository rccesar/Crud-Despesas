package br.com.indice;

import br.com.indice.dao.DespesaDAO;

public class RemoverDespesa {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        dao.delete(4l);
    }
}
