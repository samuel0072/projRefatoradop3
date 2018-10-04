package iterator_factorymethod.depois;

import iterator_factorymethod.depois.colecoes.ColecaoFuncs;
import iterator_factorymethod.depois.colecoes.ColecaoRec;
import pessoa.funcionario.Funcionario;
import iterator_factorymethod.depois.iteradores.PessoaIterador;
import iterator_factorymethod.depois.iteradores.RecIterador;
import pessoa.Pessoa;
import recfisico.Recursos;

/*
@classe refatorada com o padrao Iterator
*/
public class Administrador extends Funcionario {
    /*codigo aqui*/

    private ColecaoFuncs funcionarios = new ColecaoFuncs ();
    private ColecaoRec recursos       = new ColecaoRec ();
    private PessoaIterador funcsIterador;
    private RecIterador recIterador;


    /*Codigo aqui*/
    public Administrador(double salario_){
        super("", "", "","", salario_, "Administrador");
    }
    /*Codigo aqui*/


    //Mostra na tela estado atual de todos os funcionarios
    public void relatorioFuncs(){
        this.funcsIterador = (PessoaIterador) funcionarios.criarIterador ();

        System.out.println("\t\t-------------Estado dos funcionarios-------------");
        while(this.funcsIterador.haProx ()){

            Pessoa a = (Pessoa)this.funcsIterador.prox();
            System.out.println(a.paraString ()+"\n");

        }
        System.out.println("\t\t-------------------------------------------------");
    }

    public void relatorioRecF(){
        System.out.println("\t\t-------------Estado dos recursos fisicos-------------");
        this.recIterador = (RecIterador) this.recursos.criarIterador ();
        while(this.recIterador.haProx ()) {
            Recursos e = (Recursos)this.recIterador.prox ();
            System.out.println(e.paraString ()+"\n");
        }
    }


    /*Codigo aqui*/
}
