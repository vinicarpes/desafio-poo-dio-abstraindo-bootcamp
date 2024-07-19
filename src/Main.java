import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
// import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso javaBasico = new Curso();
        Mentoria mentoria = new Mentoria();

        javaBasico.setTitulo("Java Básico");
        javaBasico.setCargaHoraria(20);
        javaBasico.setDescricao("Curso basico sobre sintaxe Java");
        // System.out.println(javaBasico);
        
        mentoria.setData(LocalDate.now());
        mentoria.setTitulo("mentoria 1");
        mentoria.setDescricao("descricao");

        // System.out.println(javaBasico.calcularXP());

        // Conteudo conteudo = new Curso(); ---> polimorfismo para instanciar um Curso a partir de um Conteudo(abstrato)

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Java Developer");
        bootcamp.getConteudos().add(javaBasico);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("carlinhos");
        Dev dev2 = new Dev();
        dev2.setNome("maria");

        dev1.inscreverBootCamp(bootcamp);
        dev2.inscreverBootCamp(bootcamp);

        // System.out.println(dev1.getConteudosInscritos());
        // System.out.println(dev2.getConteudosInscritos());
        
        // dev1.progredir();
        // dev2.progredir();
        
        // System.out.println(dev1.calcularTotalXP());
        // System.out.println(dev2.calcularTotalXP());
        
        // System.out.println(dev1.getConteudosConcluidos());
        // System.out.println(dev2.getConteudosConcluidos());
        
        // System.out.println(dev1.getConteudosInscritos());
        // System.out.println(dev2.getConteudosInscritos());
        
        // dev1.progredir();
        // dev2.progredir();
        
        // System.out.println(dev1.getConteudosConcluidos());
        // System.out.println(dev2.getConteudosConcluidos());
        
        // System.out.println(dev1.getConteudosInscritos());
        // System.out.println(dev2.getConteudosInscritos());

        // System.out.println(dev1.calcularTotalXP());
        // System.out.println(dev2.calcularTotalXP());
    }
}

