import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java I");
        curso1.setDescricao("descrição: curso java básico");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição: curso javaScript");
        curso2.setCargaHoraria(8);

        Curso curso3 = new Curso();

        curso3.setTitulo("Fundamentos de QA");
        curso3.setDescricao("descrição: Fundamentos de Qualidade e Desenvolvimento de Software");
        curso3.setCargaHoraria(10);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição: mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcampGFT = new Bootcamp();
        bootcampGFT.setNome("GFT Quality Assurance Para Mulheres");
        bootcampGFT.setDescricao("Descricao Bootcamp GFT QA para Mulheres");
        bootcampGFT.getConteudos().add(curso1);
        bootcampGFT.getConteudos().add(curso3);
        bootcampGFT.getConteudos().add(mentoria);

        Dev devCamila =new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());



        System.out.println("************************");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("************************");


        Dev devSuelen = new Dev();
        devSuelen.setNome("Suélen");
        devSuelen.inscreverBootcamp(bootcampGFT);
        System.out.println("Conteudos Inscritos Suélen: " + devSuelen.getConteudosInscritos());
        devSuelen.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Suélen: " + devSuelen.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Suélen: " + devSuelen.getConteudosConcluidos());
        System.out.println("XP: " + devSuelen.calcularTotalXp());




    }
}