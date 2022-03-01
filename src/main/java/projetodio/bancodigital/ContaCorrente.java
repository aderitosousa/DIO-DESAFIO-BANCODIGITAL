package projetodio.bancodigital;


public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    protected void extrato() {
        System.out.println("-------Extrato conta corrrente-------");
        super.extrato();
    }
}
