import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        //System.out.println(curseA);
        //System.out.println(curseB);
        //System.out.println(mentorA);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curseA);
        bootcamp.getConteudos().add(curseB);
        bootcamp.getConteudos().add(mentorA);

        Dev devEmanoel = new Dev();
        devEmanoel.setNome("Emanoel");
        devEmanoel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Emanoel:" + devEmanoel.getConteudosInscritos());
        devEmanoel.progredir();
        devEmanoel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Emanoel:" + devEmanoel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Emanoel:" + devEmanoel.getConteudosConcluidos());
        System.out.println("XP:" + devEmanoel.calcularTotalXp());

        System.out.println("========================");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

    }
}
