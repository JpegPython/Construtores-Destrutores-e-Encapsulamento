package Exercicio1.CarroRev;

public class CarroRev {
    private int ano;
    private String marca;
    private String modelo;
    private double preco;
    private boolean seguro;
    private int kmrodado;



    public CarroRev(int ano, String marca,String modelo,int kmrodado, double preco){
        this.ano=ano;
        this.marca=marca;
        this.modelo=modelo;
        this.kmrodado=kmrodado;
        this.preco=preco;
    }



    public void catalogo(){};


    public void assegurado(){
        if(seguro){
            System.out.println("Tem seguro.");
        }
        else{
            System.out.println("Nao tem seguro.");
        }
    }
    
    public void comprarSeguro(){
        if(seguro){
            System.out.println("Ja tem seguro.");
        }
        else{
            seguro=true;

        }
    }

    public void estado(){

        System.out.println(kmrodado+"km");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
