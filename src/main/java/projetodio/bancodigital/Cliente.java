package projetodio.bancodigital;

public class Cliente {

        private String nome;
        private int numTel;
        private String numBI;
        private String nif;
        private String morada;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNumTel() {
            return numTel;
        }

        public void setNumTel(int numTel) {
            this.numTel = numTel;
        }

        public String getNumBI() {
            return numBI;
        }

        public void setNumBI(String numBI) {
            this.numBI = numBI;
        }

        public String getNif() {
            return nif;
        }

        public void setNif(String nif) {
            this.nif = nif;
        }

        public String getMorada() {
            return morada;
        }

        public void setMorada(String morada) {
            this.morada = morada;
        }
}
