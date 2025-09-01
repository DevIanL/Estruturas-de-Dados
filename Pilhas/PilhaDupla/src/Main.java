package Pilhas.PilhaDupla.src;

public class Main {
    public static void main(String[] arg){
        PilhaDupla a = new PilhaDupla();

        System.out.println(a.imprimir());

        a.empilhar(1, "p1=1");
        a.empilhar(2, "p2=1");
        System.out.println(a.imprimir());

        a.empilhar(1, "p1=2");
        a.empilhar(1, "p1=3");
        a.empilhar(1, "p1=4");
        System.out.println(a.imprimir());

        a.desempilhar(1);
        System.out.println(a.imprimir());

        a.empilhar(1, "p1=4.1");
        System.out.println(a.imprimir());

        a.empilhar(2, "p2=2");
        a.empilhar(2, "p2=3");
        a.empilhar(2, "p2=4");
        a.empilhar(2, "p2=5");
        a.empilhar(2, "p2=6");
        System.out.println(a.imprimir());

        a.empilhar(2, "p2=6");
    }
}
