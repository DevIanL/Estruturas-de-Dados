package Pilhas.PilhaDupla.src;

public class PilhaDupla {
    private Object[] dados;
    private int p1, p2;

    public PilhaDupla(int tamanho){
        dados = new Object[tamanho];
        p1 = -1;
        p2 = dados.length;
    }
    
    public PilhaDupla(){
        this(10);
    }

    public boolean esta_cheia(){
        return (((p1+1) + (dados.length - p2)) == dados.length);
    }

    public boolean esta_vazia(){
        return (p1 == -1 && p2 == dados.length);
    }

    public String imprimir(){
        String retorno = null;
        if(!esta_vazia()){
            retorno = "[";
            for(int i=0; i < dados.length; i++){
            retorno += dados[i] + " ";
            }
            retorno += "]";
        }else{
            System.out.println("Pilha está vazia.");
        }
        return retorno;
    }

    public Object ler(int ponteiro){
        Object dado = null;
        if (!esta_vazia()) {
            if(ponteiro == 1){
                dado = dados[p1];
            }else{
                dado = dados[p2];
            }
        }else{
            System.out.println("está vazia.");
        }
        return dado;
    }

    public Object desempilhar(int ponteiro){
        Object dado = null;
        if (!esta_vazia()) {
            if(ponteiro == 1){
                dado = dados[p1];
                dados[p1] = null;
                p1--;
            }else{
                dado = dados[p2];
                dados[p2] = null;
                p2 ++;
            }
        }else{
            System.out.println("está vazia.");
        }
        return dado;
    }

    public void empilhar(int ponteiro, Object dado){
        if(!esta_cheia()){
            if(ponteiro == 1){
                p1 ++;
                dados[p1] = dado;
            }else{
                p2 --;
                dados[p2] = dado;
            }
        }else{
            System.out.println("está cheia.");
        }
    }
}