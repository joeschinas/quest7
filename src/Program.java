
import entidades.EntradaDeCinema;
import java.util.Locale;
import java.util.Scanner;


public class Program {

   
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       Locale.setDefault(Locale.ENGLISH);
       EntradaDeCinema entrada = new EntradaDeCinema();
        System.out.println("Bem vindo ao cinema !!!");
        
        System.out.println("Qual Sua idade");
        Integer idade=read.nextInt();
        
        System.out.println("Digite sua carteira de estudante");
        Integer carteiraEst=read.nextInt();
        
        System.out.println("qual horaro do filme?"
        + "(digite o horario sem ponto e sem tracos)");   
        float horario=read.nextInt();
        
        System.out.println("Valor do igresso");
        float valor=read.nextFloat();
        
        System.out.println("Escolha a sala");
        Integer sala = read.nextInt();
        
        entrada = new EntradaDeCinema(idade, horario,sala,valor,carteiraEst);
        
        entrada.CalculaDesconto(idade, carteiraEst);
        entrada.CalculaDescontoHorário(horario);
        System.out.println("ingreso: \n"+entrada.exibir());
    }
    
}
