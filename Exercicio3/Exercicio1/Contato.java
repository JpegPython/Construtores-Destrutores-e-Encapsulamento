package Exercicio3.Exercicio1;

public class Contato {
    String numero;
    String nome;
    String email;

    Contato(String numero, String nome, String email){
        this.numero=numero;
        this.nome=nome;
        this.email=email;

    }

    public void imprimir(){
        System.out.println("Nome:"+nome);
        System.out.println("Numero:"+numero);
        System.out.println("Email:"+email);
        System.out.println();
    }
    

    
}