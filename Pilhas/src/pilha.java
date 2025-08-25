package src;

public interface pilha {

    /* 
    CRUD: Create, Read, Update, Delete
          Criar,  Ler,  Atualizar, Excluir 
    */ 
    
    // METODOS PRINCIPAIS; crud.
    void empilhar(Object dado);
    Object ler();
    void atualizar(Object dado);
    Object desempilhar();

    // METODOS AUXILIARES
    boolean esta_cheia();
    boolean esta_vazia();
    String imprimir();
}
