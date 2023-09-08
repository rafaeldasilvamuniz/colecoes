import java.util.*;

public class genero {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        java.util.List<Pessoa> h = new ArrayList<>();
        java.util.List<Pessoa> m = new ArrayList<>();
        java.util.List<Pessoa> o = new ArrayList<>();
        Set<String> lista = new HashSet<String>();

        while (true) {

            Pessoa pe = new Pessoa();
            System.out.println("Digite os nomes separados por vírgula e o seu genero (F,M,O) (exemplos: Marcelo-O,Larissa-F ");
            String no = sc.next();
            String[] vet = no.split(",");

            if (no.equalsIgnoreCase("sair")) {
                break;
            }

            /*java.util.List<String> gen = new ArrayList<String>();
            String ge = sc.next();
            pe.setGenero(ge);
            gen.add(pe.getGenero());*/

            int i;
            for (i = 0; i < vet.length; i++) {
                pe.setNome(vet[i]);
                lista.add(pe.getNome());

                if (no.contains("-F")) {
                    m.add(pe);
                } else if (no.contains("-M")) {
                    h.add(pe);
                } else if (no.contains("-O")) {
                    o.add(pe);
                }

                System.out.println(vet[i]);
                //System.out.println(vet[1]);
                //System.out.println(pe.getNome());

            }

        }
        for (Pessoa pessoa : o) {
            System.out.println("Outro : ");
            System.out.println(pessoa.getNome());
        }
        for (Pessoa pessoa:m){
            System.out.println("Feminino : ");
            System.out.println(pessoa.getNome());
        }
        for (Pessoa pessoa:h){
            System.out.println("Masculino : ");
            System.out.println(pessoa.getNome());
        }
    }
}




