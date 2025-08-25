package src;

public class pilhaEstatica implements pilha {

    // CRIANDO ATRIBUTOS DA CLASSE:
    private int topo;                           // Armazena a posição do topo da pilha.
    private Object[] dados;                     // Armazena os dados contidos na pilha.

    // CRIANDO OS CONSTRUTORES:
    public pilhaEstatica(int tamanho){          // Contrstrutor que tem como parametro o tamanho da pilha.
        topo = -1;                              // A pilha sempre comeca vazia.
        dados = new Object[tamanho];            // O vetor recebe o tamanho da pilha.
    }

    public pilhaEstatica(){                     // Se por acaso for criado um objeto sem parametros, o padrao será 10 para o tamanho da pilha.
        this(10);
    }

    // METODOS AUXILIARES:
    public boolean esta_vazia(){                // A pilha sempre vai estar vazia quando o topo for igual a -1.
        return (topo == -1);
    }

    public boolean esta_cheia(){                // A pilha está cheia quando o valor do topo (o indice do vetor), corresponder ao tamanho do vetor.
        return (topo == dados.length -1);        // Tamanho -1, pois, se o tamanho for igual a 10, o indice do vetor irá de 0 a 9.
    }
}
