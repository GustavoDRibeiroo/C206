public class Cliente {

String nome;
long cpf;
float calculaTotalCompra;

Computador[] computadores;
float aux = 0;



public Cliente(String nome, long cpf, float calculaTotalCompra){

    this.nome = nome;
    this.cpf = cpf;
    this.calculaTotalCompra = calculaTotalCompra;

    }

    public void calculaTotalCompra(){

        for(int i = 0; i < this.computadores.length; i++){
            if(computadores[i] != null) {
                aux += computadores[i].preco;
            }
        }

        return aux;
    }

}
