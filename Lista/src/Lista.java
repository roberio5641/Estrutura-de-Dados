public class Lista {
    int[] vetor_elementos;
    int numero_elementos;


    public int[] getVetor_elementos ( ) {
        return vetor_elementos;
    }

    public int getNumero_elementos ( ) {
        return numero_elementos;
    }

    public Lista (int t) {
        vetor_elementos = new int[t];
        numero_elementos = 0;

    }

    public boolean LISTA_VAZIA(){
        if (numero_elementos == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean LISTA_CHEIA(){
        if (numero_elementos >= vetor_elementos.length){
            return true;
        }else {
            return false;
        }
    }

    public void ADICIONAR_FINAL(int e){
        if (LISTA_CHEIA()){
            System.out.println ("Estrutura cheia!!");
        }else {
            int indice = numero_elementos;
            vetor_elementos[indice] = e;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int REMOVER_FINAL(){
        if (LISTA_VAZIA ()){
            System.out.println("Estrutura vazia");

        }else {
            int indice = numero_elementos - 1;
            int elemento_removido = vetor_elementos[indice];
            numero_elementos = indice;
            return elemento_removido;
        }
        return 0;
    }

    public void ACIONAR_INICIO(int e) {
        if (LISTA_CHEIA()){
            System.out.println("Estrutura cheia");
        } else {
            for (int i = numero_elementos; 0 < i ; i--) {
                vetor_elementos[i] = vetor_elementos[i - 1];

            }
            vetor_elementos[0] = e;
            numero_elementos = numero_elementos + 1;
        }

    }

    public int REMOVER_INICIO() {
        if (LISTA_VAZIA()) {
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

    public void ADICIONAR_POSICAO(int e,int i) {
        if (LISTA_CHEIA()) {
            System.out.println ( "Estrutura cheia" );
        } else {
            if (i <= 0) {
                ACIONAR_INICIO ( e );
            } else if (i >= numero_elementos) {
                ADICIONAR_FINAL ( e );
            } else {
                for (int indice = numero_elementos; i <= indice; indice--) {
                    vetor_elementos[indice] = vetor_elementos[indice - 1];
                }
                vetor_elementos[i] = e;
                numero_elementos = numero_elementos + 1;
            }
        }
    }

    public int REMOVER_POSICAO(int i){
        if (LISTA_VAZIA ()){
            System.out.println ("Estrutura vazia!!");
        }else{
            if (i <= 0){
                return REMOVER_INICIO ();
            }else if (i >= numero_elementos){
                return REMOVER_FINAL ();
            }else{
                int elemento_removido = vetor_elementos[i];
                for (int indice = i; indice < numero_elementos - 1; indice++ ){
                    vetor_elementos[indice] = vetor_elementos[indice + 1];
                }
                numero_elementos = numero_elementos - 1;
                return elemento_removido;
            }
        }
        return 0;
    }

}