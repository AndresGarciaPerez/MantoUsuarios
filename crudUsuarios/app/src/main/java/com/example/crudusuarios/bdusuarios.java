package com.example.crudusuarios;

import java.util.ArrayList;

public class bdusuarios {

    private static ArrayList nombres = new ArrayList();
    private static ArrayList correos = new ArrayList();
    private static ArrayList claves = new ArrayList();
    private static ArrayList tipos = new ArrayList();






    //METODOS PARA ALMACENAR EN LOS ARRAY
    public static void  setNombres(String nombre){
        nombres.add(nombre);
    }

    public static void  setCorreos(String correo){
        correos.add(correo);
    }

    public static void  setClaves(String clave){
        claves.add(clave);
    }

    public static void  setTipos(String tipo){
        tipos.add(tipo);
    }


    //METODOS PARA OBTENER LOS ARRAY
    public static ArrayList getNombres(){
        return nombres;
    }

    public static ArrayList getCorreos(){
        return correos;
    }

    public static ArrayList getClaves(){
        return claves;
    }

    public static ArrayList getTipos(){
        return tipos;
    }



    public static boolean buscarUsuario(String correo){
        return correos.contains(correo);
    }

    public static String getNombres(String correo){
        return nombres.get(correos.indexOf(correo)).toString().trim()+ " "+ correos.get(correos.indexOf(correo)).toString().trim();
    }
    public  static String getClaves(String correo){
        return claves.get(correos.indexOf(correo)).toString().trim();
    }

    public  static String getTipos(String correo){
        return tipos.get(correos.indexOf(correo)).toString().trim();
    }



    public bdusuarios(){
        int contador = 1;
        for(int idx = 1; idx <= 100; idx++){
            correos.add("jacevedo" + idx + "@utec");
            nombres.add("Jorge acevedo " + idx);
            claves.add("clave" + idx);
            tipos.add(contador);
            if(contador == 3){
                contador = 0;
            }
            contador++;
        }
    }


    public String getUsuario(int indice){
        return "Correo: " + correos.get(indice).toString() + " Nombre: " + nombres.get(indice).toString() +
                " Clave: " + claves.get(indice).toString() + " Tipo: " + tipos.get(indice).toString() ;
    }








}
