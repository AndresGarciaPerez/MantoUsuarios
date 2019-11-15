package com.example.crudusuarios;

import java.util.ArrayList;

public class bdusuarios {

    private ArrayList nombres = new ArrayList();
    private  ArrayList correos = new ArrayList();
    private  ArrayList claves = new ArrayList();
    private  ArrayList tipos = new ArrayList();

    public void  setNombres(String nombre){
        nombres.add(nombre);
    }

    public void  setCorreos(String correo){
        correos.add(correo);
    }

    public void  setClaves(String clave){
        claves.add(clave);
    }

    public void  setTipos(String tipo){
        tipos.add(tipo);
    }

    public  boolean buscar(String correo){
        return  correos.contains(correo);
    }

    public String getNombres(){
        return  nombres.get(nombres.indexOf(nombres)).toString().trim();
    }



}
