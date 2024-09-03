import java.util.ArrayList;

public class equipoFutbol{
    public static void main(String[] args) throws Exception {
        
        // instanciamos jugadores

        Futbolista futbolista1 = new Futbolista("Lionel", "Messi", 40000000f, 750, 55); 
        Futbolista futbolista2 = new Futbolista("Cristiano", "Ronaldo", 45000000f, 800, 70);
        Futbolista futbolista3 = new Futbolista("Neymar", "Junior", 35000000f, 300, 80);
        Futbolista futbolista4 =  new Futbolista("Luka", "Modric", 18000000f, 80, 35);
        Futbolista futbolista5 = new Futbolista("Kevin", "De Bruyne",25000000f, 300, 80);
        Futbolista futbolista6 = new Futbolista("Kylian", "Mbappe", 30000000f, 250, 30); 
        Futbolista futbolista7 =  new Futbolista("Erling", "Haaland", 28000000f, 180, 15);
        Futbolista futbolista8 = new Futbolista("Mohamed", "Salah", 20000000f, 200, 25); 
        Futbolista futbolista9 = new Futbolista("Robert", "Lewandowski", 22000000f, 400, 45);
        Futbolista futbolista10 = new Futbolista("Sergio", "Ramos", 15000000f, 100, 200);
        Futbolista futbolista11 =  new Futbolista("Virgil", "Van Dijk", 16000000f, 30, 50);
    
        // instanciamos directivos

        Directivo directivo1 = new Directivo("Florentino", "Perez", 30000000f, true);

        // instanciamos entrenadores

        Entrenador entrenador1 = new Entrenador("Pep", "Guardiola", 18000000f, 15);
        Entrenador entrenador2 = new Entrenador("Jurgen", "Klopp", 17000000f, 20);

        // mostrar todos los trabajadores

        ArrayList <Futbolista> listaFutbolistas = new ArrayList<>();
        ArrayList <Directivo> listaDiretivos = new ArrayList<>();
        ArrayList <Entrenador> listaEntrenadores = new ArrayList<>();

        // añado a listas

        listaFutbolistas.add(futbolista1);
        listaFutbolistas.add(futbolista2);
        listaFutbolistas.add(futbolista3);
        listaFutbolistas.add(futbolista4);
        listaFutbolistas.add(futbolista5);
        listaFutbolistas.add(futbolista6);
        listaFutbolistas.add(futbolista7);
        listaFutbolistas.add(futbolista8);
        listaFutbolistas.add(futbolista9);
        listaFutbolistas.add(futbolista10);
        listaFutbolistas.add(futbolista11);

        listaDiretivos.add(directivo1);

        listaEntrenadores.add(entrenador1);
        listaEntrenadores.add(entrenador2);

        // mostrar todos los trabajadores

        for (Futbolista futbo : listaFutbolistas){
            System.out.println(futbo);
        }

        for (Directivo direc : listaDiretivos){
            System.out.println(direc);
        }

        for (Entrenador entre : listaEntrenadores){
            System.out.println(entre);
        }

        // Futbolista 1 celebra el gol:

        futbolista1.celebrarGol();

        // media salarios futbolistas

        float sumaSalariosFutbolistas = 0;
        for (Futbolista futboSalario : listaFutbolistas) {
            sumaSalariosFutbolistas += futboSalario.getSalarioFutbolista();
        }
        float mediaSalariosFutbolistas = sumaSalariosFutbolistas / listaFutbolistas.size();
        System.out.println("Media de salarios de Futbolistas: " + mediaSalariosFutbolistas);

        // media salarios entrenadores

        float sumaSalariosEntrenadores = 0;
        for (Entrenador entreSalario : listaEntrenadores) {
            sumaSalariosEntrenadores += entreSalario.getSalarioEntrenador();
        }
        float mediaSalariosEntrenadores = sumaSalariosEntrenadores / listaEntrenadores.size();
        System.out.println("Media de salarios de Entrenadores: " + mediaSalariosEntrenadores);

        // media salarios directivos

        float sumaSalariosDirectivos = 0;
        for (Directivo direcSalario : listaDiretivos) {
            sumaSalariosDirectivos += direcSalario.getSalarioDirectivo();
        }
        float mediaSalariosDirectivos = sumaSalariosDirectivos / listaDiretivos.size();
        System.out.println("Media de salarios de Directivos: " + mediaSalariosDirectivos);

        // mostrar la media de salarios de todos los trabajadores

        float sumaTotalSalarios = sumaSalariosFutbolistas + sumaSalariosEntrenadores + sumaSalariosDirectivos;
        int totalTrabajadores = listaFutbolistas.size() + listaEntrenadores.size() + listaDiretivos.size();
        float mediaTotalSalarios = sumaTotalSalarios / totalTrabajadores;
        System.out.println("Media de salarios de todos los trabajadores: " + mediaTotalSalarios);

    }

}