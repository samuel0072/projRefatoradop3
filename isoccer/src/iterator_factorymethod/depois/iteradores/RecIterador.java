package iterator_factorymethod.depois.iteradores;
import recfisico.Recursos;

public class RecIterador implements Iterador {
    private Recursos[] recs;
    private int indice;

    public RecIterador(Recursos[] rec_) {
        this.recs = rec_;
        this.indice = 0;
    }

    public boolean haProx(){
        if ( indice >= recs.length || recs[indice] == null){
            return false;
        }
        return true;
    }

    public Object prox(){
        Recursos e = recs[indice];
        indice+=1;
        return e;
    }

    public int indice(){
        return this.indice;
    }
}
