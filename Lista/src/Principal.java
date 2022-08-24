public class Principal {
    public static void main (String[] args) {
      Lista lista = new Lista ( 3 );

      lista.ADICIONAR_FINAL ( 10 );
      lista.ACIONAR_INICIO ( 8 );
      lista.ADICIONAR_POSICAO ( 9,1 );


        System.out.println (lista.vetor_elementos[0]);
        System.out.println (lista.vetor_elementos[1]);
        System.out.println (lista.vetor_elementos[2]);


    }
}