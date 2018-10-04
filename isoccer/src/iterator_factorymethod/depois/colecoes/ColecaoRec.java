package iterator_factorymethod.depois.colecoes;
import iterator_factorymethod.depois.iteradores.Iterador;
import iterator_factorymethod.depois.iteradores.RecIterador;
import recfisico.Recursos;

public class ColecaoRec implements Colecao {
    static final int MAX = 1000;
    private int numItens;
    Recursos[] recursosLista;

    public ColecaoRec(){
        this.numItens = 0;
        this.recursosLista = new Recursos[MAX];
    }

    public boolean adcFunc(Recursos e){
        if(numItens >= MAX){
            System.out.println("Ops... Parece que sua lista esta cheia\n");
            return false;
        }
        recursosLista[numItens] = e;
        return true;
    }

    public RecIterador rmvFunc(int indice){
        if(numItens > 0){
            RecIterador e = (RecIterador) this.criarIterador ();
            while(e.haProx ()) {
                Recursos a = (Recursos) e.prox ();
                if(e.indice () > indice){
                    recursosLista[e.indice () - 1] = recursosLista[e.indice ()];
                }
            }
            return e;
        }
        else {
            return (RecIterador) criarIterador();
        }
    }

    public Iterador criarIterador(){
        return new RecIterador ( recursosLista );
    }
}
