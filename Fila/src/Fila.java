public class Fila {

    int[] vetor_elementos;
    int numero_elementos;


    public int[] getVetor_elementos ( ) {
        return vetor_elementos;
    }

    public int getNumero_elementos ( ) {
        return numero_elementos;
    }

    public Fila (int t) {
        vetor_elementos = new int[t];
        numero_elementos = 0;

    }


    public boolean estVazia(){
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
        if (estVazia()){
            System.out.println("Não possui nenhum elemento");
        }else {
            System.out.print("O elemento que está no inicio da fila é: ");
            return vetor_elementos[0];
        }
        return 0;
    }


    public void enfileirar(int e){
        if (estaCheia()){
            System.out.println ("Estrutura cheia!!");
        }else {
            int indice = numero_elementos;
            vetor_elementos[indice] = e;
            numero_elementos = numero_elementos + 1;

        }
    }



    public int desenfileirar() {
        if (estVazia()) {
            System.out.println("Estrutura vazia");
        } else {
            int elemento_removido = vetor_elementos[0];
            for (int i = 1; i <= numero_elementos - 1; i++) {
                vetor_elementos[i - 1] = vetor_elementos[i];
            }
            numero_elementos = numero_elementos - 1;
            return elemento_removido;
        }

        return  0;
    }

    public void inverterFila(){

        System.out.println("Agora a ordem invertida");
        for (int j = vetor_elementos.length - 1; j >= 0; j--) {
            System.out.println(vetor_elementos[j]);
        }
    }



}
