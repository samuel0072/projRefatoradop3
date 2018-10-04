package singleton.depois;


import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import pessoa.socio.*;
import pessoa.funcionario.*;
import recfisico.*;

/*
@Classe refatorada com o padrao Singleton
 */
public class Administrador extends Funcionario {
    private static Administrador _instancia = null;


    /*codigo aqui*/



    protected Administrador(double salario_){
        super("", "", "","", salario_, "Administrador");
    }

    public static Administrador Instancia(double salario_){
        if(_instancia == null){
            _instancia =  new Administrador ( salario_ );
        }
        return _instancia;
    }

    /*codigo aqui*/
}
