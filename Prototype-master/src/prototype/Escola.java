package prototype;

public class Escola {

    public class Escola implements Cloneable {
        private String endereco;
        private Integer numero;

        public Escola(String endereco, Integer numero) {
            super();
            this.endereco = endereco;
            this.numero = numero;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Escola{" +
                    "endereco='" + endereco + '\'' +
                    ", numero=" + numero +
                    '}';
        }
    }
