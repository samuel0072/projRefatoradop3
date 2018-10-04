package iterator_factorymethod.antes;

import java.util.ArrayList;
import java.util.Scanner;

import pessoa.funcionario.Funcionario;
import pessoa.funcionario.Jogador;
import pessoa.funcionario.Medico;
import pessoa.funcionario.Motorista;
import pessoa.socio.*;
import recfisico.*;


public class Administrador extends Funcionario {

    /*codigo aqui*/

    protected Funcionario presidente;

    private ArrayList<Funcionario> funcs    = new ArrayList<Funcionario>();
    private ArrayList<Medico> med           = new ArrayList<Medico>();
    private ArrayList<Motorista> moto       = new ArrayList<Motorista>();
    private ArrayList<SocioTorcedor> socios = new ArrayList<SocioTorcedor>();
    private ArrayList<Jogador> jogadores    = new ArrayList <Jogador>();
    private Centro ct;
    private Estadio est;
    private ArrayList<Recursos> onibus = new ArrayList<Recursos>();

    private Scanner leitor =  new Scanner ( System.in);

    public Administrador(double salario_){
        super("", "", "","", salario_, "Administrador");
    }

    /*Codigo aqui*/

    //Mostra na tela estado atual de todos os funcionarios
    public void relatorioFuncs(){
        System.out.println("\t\t-------------Estado dos funcionarios-------------");
        if(presidente != null){
                System.out.println ( presidente.paraString () );
            }
        else {
            System.out.println("\t\tNao ha presidente");
        }

        for (int i = 0; i < funcs.size (); i++) {
            System.out.println(funcs.get ( i ).paraString());
        }

        for (int i = 0; i < jogadores.size (); i++) {
            System.out.println(jogadores.get ( i ).paraString());
        }

        for (int i = 0; i < med.size (); i++) {
            System.out.println(med.get ( i ).paraString());
        }

        for (int i = 0; i < socios.size (); i++) {
            System.out.println(socios.get ( i ).paraString());
        }
        for (int i = 0; i < socios.size (); i++) {
            System.out.println(moto.get ( i ).paraString());
        }
        System.out.println("\t\t-------------------------------------------------");
    }

    public void relatorioRecF(){
        System.out.println("\t\t-------------Estado dos recursos fisicos-------------");
        int i;
        System.out.println("\t\t-------------Onibus----------------------------------");
        for(i = 0; i < this.onibus.size(); i++){
            System.out.println(this.onibus.get(i).paraString());    
        }
        System.out.println("\t\t-------------Centro de treinamento-------------------");
        System.out.println(this.ct.paraString()); 
        System.out.println("\t\t-------------Estadio---------------------------------");
        System.out.println(this.est.paraString());     
        System.out.println("\t\t-----------------------------------------------------");
    }

   /*codigo aqui*/
}
