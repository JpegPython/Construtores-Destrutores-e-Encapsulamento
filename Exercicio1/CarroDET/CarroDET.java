package Exercicio1.CarroDET;

public class CarroDET {
    private String placa;
    private int ano;
    private String marca;
    private String modelo;
    protected long Renavam;
    protected boolean ipvaPago;



    public CarroDET(int ano, String marca,String modelo){
        this.ano=ano;
        this.marca=marca;
        this.modelo=modelo;

    }

    public void pagarIPVA(){
        if(this.ipvaPago){
            System.out.println("IPVA ja esta pago.");
        }
        else{
            this.ipvaPago=true;
        }
    }
    
    public void precoIPVA(int a, String m, String n){};


}
