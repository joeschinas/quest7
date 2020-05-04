/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class EntradaDeCinema {
    private Integer idade;
    private float horario;
    private Integer sala;
    private float valor;
    private Integer carteiraEst;

    public EntradaDeCinema() {
    }

    public EntradaDeCinema(Integer idade, float horario, Integer sala, float valor,Integer carteiraEst) {
        this.idade = idade;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
        this.carteiraEst=carteiraEst;
    }
    public Float CalculaDesconto(Integer idade,Integer carteiraEst){
       float result=0;
       this.idade=idade;
       this.carteiraEst=carteiraEst; 
       if(idade<12) {
        result =valor-((valor/100)*50);
        }else if (idade>=12 && idade<=15){
        result =valor-((valor/100)*40);
        }else if(idade>=16 && idade<=20){
        result =valor-((valor/100)*30);
        }else if(idade>20){
        result =valor-((valor/100)*20);
        }
        else{System.out.println("opcao invalida");}
  
      return this.valor=result;
      }
     public float CalculaDescontoHorário(float horario){
     
     if(horario<16){
         valor=valor-((valor/100)*10);
     }
     return valor;
}
    public String exibir(){
        
        return "sala: "
                +sala
                +"\n Horario: "
                +horario
                +"\n valor total com descontos ja inseridos: "
                +valor
                +"\n carterinha de estudante: "
                +carteiraEst;
                
                
    
        
    }
}