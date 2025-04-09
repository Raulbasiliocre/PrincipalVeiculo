/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalveiculo;

/**
 *
 * @author 825137025
 */
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    Double velocidadeAtual;
    boolean motorLigado;
    Double combustivel;
    
    public void ligarMotor();{
    if(this.motorLigado){    
        System.out.println("motor ja ligado");
    }else{
        this.motorLigado=true;
        System.out.println("motor ligado");
    }
    
} 
                public void desligarMotor();
                if(this.motorLigado){
                this.motorLigado = false;
                System.out.println("motor desligado");
                }else{
                 System.out.println("motor ja desligado");
    
}
}
