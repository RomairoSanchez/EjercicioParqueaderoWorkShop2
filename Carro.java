public class Carro {
        private String placa;
        private String marca;
        private String modelo;
        private int horasEstacionado;

        public Carro(String placa, String marca, String modelo) {
            this.placa = placa;
            this.marca = marca;
            this.modelo = modelo;
            this.horasEstacionado = 0;
        }

        public String getPlaca() {
            return this.placa;
        }

        public int getHorasEstacionado() {
            return this.horasEstacionado;
        }

        public void setHorasEstacionado(int horas) {
            this.horasEstacionado = horas;
        }

        public String toString() {
            return this.marca + " " + this.modelo + " (" + this.placa + ")";
        }

    }

