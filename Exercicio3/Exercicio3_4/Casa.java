package Exercicio3.Exercicio3_4;

public class Casa {
    String cor;
    Porta[] listaPortas=new Porta[3];

    Casa(String cor){
        this.cor=cor;
    }
    public static void main(String[] args){


    }
    void quantasPortasEstaoAbertas(){
        int k=0;
        for(int i=0;i< listaPortas.length;i++){
            if(this.listaPortas[i].estado){
                k++;
            }
        }
        System.out.println(k+" porta(s) estao abertas");
    }



}
