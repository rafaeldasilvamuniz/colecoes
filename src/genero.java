mport java.util.*;



public class Genero {



    public static void main(String args[]) {



        Scanner sc = new Scanner(System.in);

        java.util.List<Pessoa> h = new ArrayList<>();

        java.util.List<Pessoa> m = new ArrayList<>();

        java.util.List<Pessoa> o = new ArrayList<>();

        Set<String> lista = new HashSet<String>();



        while (true) {



            Pessoa pe = new Pessoa();

            System.out.println("Digite o nome seguido de -F, -M ou -O (exemplos: Marcelo-O, Larissa-F)");

            String entrada = sc.next();



            if (entrada.equalsIgnoreCase("sair")) {

                break;

            }



            String[] partes = entrada.split("-");

            String nome = partes[0];

            String genero = partes[1];



            pe.setNome(nome);



            lista.add(pe.getNome());



            if (genero.equalsIgnoreCase("F")) {

                m.add(pe);

            } else if (genero.equalsIgnoreCase("M")) {

                h.add(pe);

            } else if (genero.equalsIgnoreCase("O")) {

                o.add(pe);

            }



            System.out.println(pe.getNome());

        }



        for (Pessoa pessoa : o) {

            System.out.println("Outro : ");

            System.out.println(pessoa.getNome());

        }

        for (Pessoa pessoa : m) {

            System.out.println("Feminino : ");

            System.out.println(pessoa.getNome());

        }

        for (Pessoa pessoa : h) {

            System.out.println("Masculino : ");
