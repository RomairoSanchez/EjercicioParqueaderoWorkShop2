public class Parqueadero {

        private Carro[][] matrizParqueadero;
        private int tarifaPorHora;

        public Parqueadero(int filas, int columnas, int tarifaPorHora) {
            this.matrizParqueadero = new Carro[filas][columnas];
            this.tarifaPorHora = tarifaPorHora;
        }

        public boolean parquearCarro(Carro carro, int fila, int columna) {
            if (fila >= 0 && fila < this.matrizParqueadero.length && columna >= 0 && columna < this.matrizParqueadero[0].length && this.matrizParqueadero[fila][columna] == null) {
                this.matrizParqueadero[fila][columna] = carro;
                return true;
            } else {
                return false;
            }
        }

        public double cobrarPorTiempo(Carro carro) {
            int horas = carro.getHorasEstacionado();
            return (double) (this.tarifaPorHora * horas);
        }

        public void mostrarEstadoParqueadero() {
            for (int fila = 0; fila < this.matrizParqueadero.length; ++fila) {
                for (int columna = 0; columna < this.matrizParqueadero[0].length; ++columna) {
                    if (this.matrizParqueadero[fila][columna] == null) {
                        System.out.print("  ");
                    } else {
                        System.out.print("X ");
                    }
                }

                System.out.println(" ");
            }

        }
    }

