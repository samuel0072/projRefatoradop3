package iterator_factorymethod.depois.colecoes;

import iterator_factorymethod.depois.iteradores.Iterador;
import iterator_factorymethod.depois.iteradores.PessoaIterador;
import pessoa.Pessoa;

public class ColecaoFuncs implements Colecao{

    static final int MAX = 1000;
    private int numItens;
    Pessoa[] pessoasLista;

    public ColecaoFuncs(){
        pessoasLista = new Pessoa[MAX];
        this.numItens = 0;
    }

    public boolean adcFunc(Pessoa e){
        if(numItens >= MAX){
            System.out.println("Ops... Parece que sua lista esta cheia\n");
            return false;
        }
        pessoasLista[numItens] = e;
        return true;
    }

    public PessoaIterador rmvFunc(int indice){
        if(numItens > 0){
            PessoaIterador e = (PessoaIterador) this.criarIterador ();
            while(e.haProx ()) {
                Pessoa a = (Pessoa) e.prox ();
                if(e.indice () > indice){
                    pessoasLista[e.indice ()-1] = pessoasLista[e.indice ()];
                }
            }
            return e;
        }
        else {
            return (PessoaIterador) criarIterador();
        }
    }

    /*Factory Method*/
    public Iterador criarIterador(){
        return new PessoaIterador ( pessoasLista );
    }
}
