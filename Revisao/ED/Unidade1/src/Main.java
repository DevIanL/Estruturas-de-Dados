package Revisao.ED.Unidade1.src;

public class Main {
    public static void main(String[] args){
        FilaEstatica fe1 = new FilaEstatica();
        PilhaEstatica p1 = new PilhaEstatica();

        p1.imprimir_lista();
        
        p1.adicionar_elemento("A");
        p1.adicionar_elemento("B");
        p1.adicionar_elemento("C");
        p1.adicionar_elemento("D");
        p1.adicionar_elemento("E");
        p1.adicionar_elemento("F");
        p1.adicionar_elemento("G");
        p1.adicionar_elemento("H");
        p1.adicionar_elemento("I");
        p1.adicionar_elemento("J");
        p1.imprimir_lista();

        p1.atualizar_elemento("X");
        p1.imprimir_lista();

        p1.remover_elemento();
        p1.imprimir_lista();

        p1.esvaziar_lista();
        p1.imprimir_lista();

        p1.remover_elemento();

        p1.imprimir_lista();
        
        fe1.adicionar_elemento("A");
        fe1.adicionar_elemento("B");
        fe1.adicionar_elemento("C");
        fe1.adicionar_elemento("D");
        fe1.adicionar_elemento("E");
        fe1.adicionar_elemento("F");
        fe1.adicionar_elemento("G");
        fe1.adicionar_elemento("H");
        fe1.adicionar_elemento("I");
        fe1.adicionar_elemento("J");
        fe1.imprimir_lista();

        fe1.atualizar_elemento("X");
        fe1.imprimir_lista();
        fe1.ler_elemento();

        fe1.remover_elemento();
        fe1.imprimir_lista();

        fe1.esvaziar_lista();
        fe1.imprimir_lista();

        fe1.remover_elemento();
    }
}
