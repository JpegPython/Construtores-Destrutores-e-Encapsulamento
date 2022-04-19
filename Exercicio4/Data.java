package Exercicio4;

public class Data {
    private int dia;
    private int mes;
    private String mesS;
    private int ano;

    Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    Data(int d, String m, int a){
        this.dia = d;
        this.mesS = m;
        this.ano = a;
    }
    public void imprimir1(){
        System.out.printf("%02d/%02d/%d\n",dia,mes,ano);
    }
    public void imprimir2(){
        System.out.printf("%s %02d, %d\n",mesS,dia,ano);
    }
    public void imprimir3(){
        System.out.printf("%02d %d\n",dia,ano);
    }
    public static void main(String[] args){
        Data data1= new Data(1,"Janeiro",2020);
        Data data2= new Data(1,1,2020);
        data2.imprimir1();
        data1.imprimir2();
        data1.imprimir3();
        data2.imprimir3();
        
    }
}
