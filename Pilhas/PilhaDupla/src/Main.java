package Pilhas.PilhaDupla.src;

public class Main {
    public static void main(String[] arg){
        PilhaDupla a = new PilhaDupla();

        a.empilhar(1, "Pablo");
        System.out.println(a.imprimir());

        a.empilhar(2, "Pablo");
        System.out.println(a.imprimir());

        a.desempilhar(1);
        System.out.println(a.imprimir());
        
        a.empilhar(1, "Ian");
        a.empilhar(1, "Ian");
        a.empilhar(1, "Ian");
        a.empilhar(1, "Ian");
        a.empilhar(1, "Ian");
        a.empilhar(1, "Ian");
        a.empilhar(1, "Ian");
        a.empilhar(1, "Ian");
        a.empilhar(1, "Ian");
        System.out.println(a.imprimir());

        a.empilhar(2, "Pablo");
        a.desempilhar(1);
        a.empilhar(2, "Pablo");
        System.out.println(a.imprimir());

    }
}
