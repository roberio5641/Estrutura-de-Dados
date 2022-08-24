public class Pilha {

    int[] vetor_elementos;
    int numero_elementos;


    public int[] getVetor_elementos ( ) {
        return vetor_elementos;
    }

    public int getNumero_elementos ( ) {
        return numero_elementos;
    }

    public Pilha (int t) {
        vetor_elementos = new int[t];
        numero_elementos = 0;

    }

    public boolean estaVazia (){
        if (numero_elementos == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean estaCheia(){
        if (numero_elementos >= vetor_elementos.length){
            return true;
        }else {
            return false;
        }
    }


    public int retornarElemento(){
        if (estaVazia()){
            System.out.println("Não possui elementos");
        }else{
            System.out.print("Elemento no topo da pilha é: ");
            return vetor_elementos[vetor_elementos.length -1];
        }
        return 0;
    }



    public void empilhar(int e){
        if (estaCheia ()){
            System.out.println ("Estrutura cheia!!");
        }else {
            int indice = numero_elementos;
            vetor_elementos[indice] = e;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int desempilhar(){
        if (estaVazia ()){
            System.out.println("Estrutura vazia");

        }else {
            int indice = numero_elementos - 1;
            int elemento_removido = vetor_elementos[indice];
            numero_elementos = indice;
            return elemento_removido;
        }
        return 0;
    }




}
