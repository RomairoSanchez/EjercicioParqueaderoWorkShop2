public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 20000);
        Carro carroFerrari = new Carro("ABC123", "Ferrari", "TheBest");
        Carro carroKia = new Carro("XYZ789", "Kia", "Sport");
        Carro carroFord = new Carro("DEF456", "Ford", "Mustang");
        parqueadero.parquearCarro(carroFerrari, 2, 3);
        parqueadero.parquearCarro(carroKia, 1, 8);
        parqueadero.parquearCarro(carroFord, 4, 5);
        System.out.println("Estado del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
        System.out.println("\nCosto por tiempo de estacionamiento:");
        carroFerrari.setHorasEstacionado(4);
        carroKia.setHorasEstacionado(12);
        carroFord.setHorasEstacionado(7);
        System.out.println("" + carroFerrari + " debe pagar: $" + parqueadero.cobrarPorTiempo(carroFerrari));
        System.out.println("" + carroKia + " debe pagar: $" + parqueadero.cobrarPorTiempo(carroKia));
        System.out.println("" + carroFord + " debe pagar: $" + parqueadero.cobrarPorTiempo(carroFord));
    }
}


