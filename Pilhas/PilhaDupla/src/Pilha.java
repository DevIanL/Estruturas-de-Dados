package Pilhas.PilhaDupla.src;

public interface Pilha {
    public boolean esta_vazia();
    public boolean esta_cheia();
    public String imprimir();

    public void empilhar(int ponteiro, Object dado);
    public Object desempilhar(int ponteiro);
    public Object ler(int ponteiro);
}
