package Exercicio1.CarroOf;

public class CarroOf {
    private String placa;
    private int ano;
    private String marca;
    private String modelo;
    private double preco;
    private String defeito;
    private boolean oleo;
    private boolean consertado;


    public CarroOf(int ano, String marca,String modelo){
        this.ano=ano;
        this.marca=marca;
        this.modelo=modelo;

    }

    //Output ano, marca, modelo
    public void infoCarro(String p){
        /* Prints */
    };

    public void trocarOleo(){
        if(oleo==false){
            oleo=true;
        }
        else{
            System.out.println("Oleo ja trocado.");
        }
    }
    //Verifica se ja houve conserto
    public void conserto(String p){};
    

    public void consertarCarro(){
        if(consertado==false){
            consertado=true;
        }
        else{
            System.out.println("Carro ja consertado");
        }
    }



    




    
}
