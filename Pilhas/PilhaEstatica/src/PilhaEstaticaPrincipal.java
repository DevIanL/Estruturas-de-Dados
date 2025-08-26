package src;

public class PilhaEstaticaPrincipal {
    public static void main(String[] args) {
        PilhaEstatica a = new PilhaEstatica();
        a.empilhar("oi");
        a.empilhar("tim");
        System.out.println(a.imprimir());
        a.desempilhar();
        System.out.println(a.imprimir());
    }
} 
