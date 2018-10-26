/*
 * Algoritmo da formula de Isidoro, para encontrar numeros Perfeitos
 * Nome: Humberto da Silva Ruiz Barone
 * Faculdade das Americas
 */
package perfeitos;

import java.util.Scanner;

class NumerosPerfeitos{
  int[] primos;
  int min =100;
  
    boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
     void preencherPrimos(int n){
         int cont =0;
         int tamanho=0;
         
        for (int i = 2; i <= min; i++) {
            if(ehPrimo(i)){
                tamanho++;
            }
        }    
        primos = new int[tamanho];
          for (int i = 2; i <= min; i++) {
            if(ehPrimo(i)){
                primos[cont]=i;
                cont++;
            }
        }      
    }
     void ehPerfeito(int qtd){
        preencherPrimos(qtd);
        int p=0;
        for(int i=0;p<qtd;i++){
           // System.out.println(primos[i]);
            if(ehPrimo((int)(Math.pow(2, primos[i])-1))){
                System.out.println("| O "+(p+1)+"º numero perfeito é: "
                        +(long) Math.pow(2, (primos[i]-1))* (long)(Math.pow(2, primos[i])-1));    
                p++;
            }
        }
        
    }
}
public class Perfeitos {

   public static void main(String[] args) { 
        long i;
        long j;
        long soma=0;
        int qtdperfeitos;
        int notperfeito=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("|------------------------NUMEROS PERFEITOS DE ISIDORO------------------------------|");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("|Digite a quantidade de numeros perfeitos a qual vc deseja, até o maximo de 8:     |");        
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("|Quantidade:");
        qtdperfeitos=entrada.nextInt();
        System.out.println("|----------------------------------------------------------------------------------|");
       
        while(qtdperfeitos>8){
            System.out.println("|*.Quantidade muito alta! Digite um valor até 8, para que o algoritmo execute      |"
                           + "\n|corretamente:(Em uma proxima versão do algoritmo,o limite para a quantidade de nu-|"
                           + "\n|numeros será aumentado. :)                    |");
            System.out.println("|----------------------------------------------------------------------------------|");
            System.out.print("|Quantidade:");
            qtdperfeitos=entrada.nextInt();
            System.out.println("|----------------------------------------------------------------------------------|");
        }
        NumerosPerfeitos perfeitos = new NumerosPerfeitos();
        perfeitos.ehPerfeito(qtdperfeitos);
        System.out.println("|----------------------------------------------------------------------------------|");
    }
}
