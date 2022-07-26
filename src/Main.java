import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curseA = new Curso();
        curseA.setTitulo("Curso JAVA");
        curseA.setDescricao("Descrição do Curso JAVA");
        curseA.setCargaHoraria(8);

        Curso curseB = new Curso();
        curseB.setTitulo("Curso JavaScript");
        curseB.setDescricao("Descrição do Curso JavaSript");
        curseB.setCargaHoraria(4);

        Mentoria mentorA = new Mentoria();
        mentorA.setTitulo("Mentoria Java");
        mentorA.setDescricao("Descrição da Mentoria JAVA");
        mentorA.setData(LocalDate.now());

        System.out.println(curseA);
        System.out.println(curseB);
        System.out.println(mentorA);

    }
}
