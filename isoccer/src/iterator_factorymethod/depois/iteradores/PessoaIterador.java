package iterator_factorymethod.depois.iteradores;

import pessoa.Pessoa;

public class PessoaIterador implements Iterador {
    private Pessoa[] pessoa;
    private int indice;

    public PessoaIterador(Pessoa[] pessoas) {
        this.pessoa = pessoas;
        this.indice = 0;
    }

    public boolean haProx(){
        if ( indice >= pessoa.length || pessoa[indice] == null){
            return false;
        }
        return true;
    }

    public Object prox(){
        Pessoa e = pessoa[indice];
        indice+=1;
        return e;
    }

    public int indice(){
        return this.indice;
    }
}
