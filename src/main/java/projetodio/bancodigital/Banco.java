package projetodio.bancodigital;

import java.util.List;

public class Banco {
    private static final String BANCOBAI = "Banco BAI";
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.nome = BANCOBAI;
        System.out.println(BANCOBAI);
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private List<Conta> getContas() {
        return contas;
    }

    private void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}

