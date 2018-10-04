package iterator_factorymethod.depois.colecoes;

import iterator_factorymethod.depois.iteradores.Iterador;
/*
@Classe implementada com factory method
*/
public interface Colecao {
    public Iterador criarIterador();
}
