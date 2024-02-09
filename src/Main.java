import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaDeNomesMasculinos = new ArrayList<>();
        ArrayList<String> listaDeNomesFemininos = new ArrayList<>();

        listaDeNomesMasculinos.add("João");
        listaDeNomesMasculinos.add("Pedro");
        listaDeNomesFemininos.add("Maria");
        listaDeNomesFemininos.add("Ana");

        adicionarNomes(listaDeNomesMasculinos, listaDeNomesFemininos, "Paulo-M", "Carla-F");

        System.out.println("Nomes do grupo Masculino:");
        for (String nome : listaDeNomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes do grupo Feminino:");
        for (String nome : listaDeNomesFemininos) {
            System.out.println(nome);
        }
    }

    public static void adicionarNomes(ArrayList<String> listaDeNomesMasculinos, ArrayList<String> listaDeNomesFemininos, String... nomes) {
        for (String nome : nomes) {
            String[] partes = nome.split("-");
            if (partes.length != 2) {
                System.out.println("Formato inválido para: " + nome);
                continue;
            }
            String nomeSemEspaco = partes[0].trim();
            String sexo = partes[1].trim();
            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Sexo inválido para: " + nome);
                continue;
            }
            if (sexo.equalsIgnoreCase("M")) {
                listaDeNomesMasculinos.add(nomeSemEspaco);
            } else {
                listaDeNomesFemininos.add(nomeSemEspaco);
            }
        }
    }
}