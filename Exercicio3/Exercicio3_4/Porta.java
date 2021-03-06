package Exercicio3.Exercicio3_4;
import java.util.Scanner;

public class Porta {
    public boolean estado;
    String cor;
    double largura;
    double altura;


    public Porta(String cor, double largura, double altura, boolean estado){
        this.cor=cor;
        this.largura=largura;
        this.altura=altura;
        this.estado=estado;
    }
    
    public void imprimir(){
        System.out.println("Estado:"+estado);
        System.out.println("Cor:"+cor);
        System.out.println("Largura:"+largura);
        System.out.println("Altura:"+altura);
    }

    public void estaAberta(){
        if (estado){
            System.out.println("Esta Aberta");
        }
        else{
            System.out.println("Esta fechada");
        }
    }

    public void abrirFechar(){
        estado=!estado;
    }

    public void pintarPortaMudarDim(){
        Scanner teclado = new Scanner(System.in);
        int n;
        double m;
        System.out.println("Pinte ou mude dimensoes:(Pintar=1 Dimensoes=2)");
        n=teclado.nextInt();
        if(n==1){
            System.out.println("Pinte a porta:(Azul=1 Vermelho=2 Verde=3 Amarelo=4 Branco=0)");
            n=teclado.nextInt();
            if(n==0){
                cor="Branca";
            }
            else if(n==1){
                cor="Azul";
            }
            else if(n==2){
                cor="Vermelha";
            }
            else if(n==3){
                cor="Verde";
            }
            else if(n==4){
                cor="Amarela";
            }
            else{
                System.out.println("Cor nao existe.");
            }
        }
        else if(n==2){
            
            System.out.println("Insira a nova largura:");
            m=teclado.nextDouble();
            largura=m;
            System.out.println("Insira a nova altura:");
            m=teclado.nextDouble();
            altura=m;

        }
        else{
            System.out.println("Erro");
            
        }
        teclado.close();
    }

    public static void main(String[] args){
        Porta porta1=new Porta("branca",0.5,2.3,true);
        

        porta1.imprimir();
        porta1.estaAberta();
        porta1.abrirFechar();
        porta1.estaAberta();
        porta1.abrirFechar();
        porta1.estaAberta();

        porta1.pintarPortaMudarDim();
        porta1.imprimir();


    }

    
}


