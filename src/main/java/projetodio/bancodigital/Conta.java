package projetodio.bancodigital;
public abstract class Conta {

        private static int SEQUENCIA = 1;
        private static final int AGENCIA_PADRAO = 1;
        protected int agencia;
        protected int numeroDeConta;
        protected double saldo;
        protected Cliente cliente;


        public Conta(Cliente cliente) {
            this.agencia = Conta.AGENCIA_PADRAO;
            this.numeroDeConta = SEQUENCIA++;
            this.cliente = cliente;
        }


        public void levantamento(double valor) {

            this.saldo = saldo - valor;
        }

        public void depositar(double valor) {
            this.saldo = saldo + valor;

        }
        public void transferir (double valor, Conta contaDestino) {
            this.levantamento(valor);
            contaDestino.depositar(valor);
        }
        protected void extrato (){
            System.out.println("      -Extrato bancario-");
            System.out.println( String.format("Cliente: %s", this.cliente.getNome()));
            System.out.println( String.format("Agencia: %d", this.agencia));
            System.out.println( String.format("Saldo : %.2f", this.saldo));
            System.out.println( String.format("Numero de conta: %d", this.numeroDeConta));

        }

        public int getAgencia() {
            return agencia;
        }

        public int getNumeroDeConta() {
            return numeroDeConta;
        }

        public double getSaldo() {
            return saldo;
        }

        protected Cliente getCliente() {
            return cliente;
        }

        protected void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
}
