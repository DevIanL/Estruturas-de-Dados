package src;

public class PilhaEstaticaPrincipal {
    public static void main(String[] args) {
        PilhaEstatica a = new PilhaEstatica(9);

        System.out.println(a.imprimir());
        a.empilhar("Pablo");
        System.out.println(a.imprimir());
        a.empilhar("Penga");
        System.out.println(a.imprimir());
        System.out.println(a.desempilhar());
        System.out.println(a.imprimir());
        a.empilhar("Pablo");
        a.empilhar("Pablo");
        a.empilhar("Pablo");
        a.empilhar("Pablo");
        a.empilhar("Pablo");
        a.empilhar("Pablo");
        a.empilhar("Pablo");
        a.empilhar("Pablo");
        System.out.println(a.imprimir());

        a.empilhar("Pablo");
    }
} 
