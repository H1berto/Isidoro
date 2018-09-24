/*
 * Algoritmo da formula de Isidoro, para encontrar numeros Perfeitos
 * Nome: Humberto da Silva Ruiz Barone
 * Faculdade das Americas
 */
package perfeitos;

import java.util.Scanner;

class NumerosPerfeitos{
  int[] primos;
  int min =10;
  
    boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
     void preencherPrimos(int n){
         int cont =0;
         primos = new int[n*min];
        for (int i = 2; i <= (n*min); i++) {
            if(ehPrimo(i)){
                primos[cont]=i;
//              System.out.println(i+" é primo.");
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
                long perfeito = (long) Math.pow(2, (primos[i]-1))* (long)(Math.pow(2, primos[i])-1);;
                System.out.println("O "+(p+1)+"º numero perfeito é: "+perfeito);
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
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros perfeitos a qual vc deseja: ");
        qtdperfeitos=entrada.nextInt();
        
        NumerosPerfeitos perfeitos = new NumerosPerfeitos();
        perfeitos.ehPerfeito(qtdperfeitos);
        
    }
}
