package ec.edu.ups.programa;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Domenica Cañizares
 */
public class Menu {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);//opciones
        Scanner s = new Scanner(System.in);//Numeros
        boolean salir = false;
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        ArrayList c = new ArrayList();
        int op;
        System.out.println("\t***** Métodos de Ordenamiento ***** ");
        System.out.println("Realizado por:");
        System.out.println("\t *Doménica Vintimilla - Byron Vásquez*");
        System.out.println("---------Cuantos valores desea ingresar---------");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor: " + (i + 1) + " ");
            int v = s.nextInt();
            a.add(v);
            b.add(v);
            c.add(v);
        }
        System.out.println("\n");

        System.out.println("********Bienvenidos al programa de Algoritmos de Ordenamiento********");

        while (!salir) {
            System.out.println("\t***Que algoritmo desea elegir***");

            System.out.println("1. Burbuja");
            System.out.println("2. Seleccion");
            System.out.println("3. Insercion");
            System.out.println("4. Salir");

            System.out.println("*********Elija una opcion*********");
            op = sn.nextInt();
            int aux = 0;
            int cont = 0;
            switch (op) {
                case 1:
                    System.out.println("*-*-*-*-*Usted a elegido la opcion de Burbuja*-*-*-*-*");
                    //System.out.println(a);
                    int aux1=0;
                     
                    for (int i = 0; i < a.size(); i++) {
                        if(i < a.size()-1){
                         System.out.println("Pasada" + (i + 1));
                    }                       
                        for (int j = i + 1; j < a.size(); j++) {

                            if ((int) a.get(i) > (int) a.get(j)) {
                               
                                System.out.println(a + "****  |" + i + " | " + j + " | " + a.get(i) + " | " + a.get(j) + " | " + aux1 + " | " + "     SI MAYOR" + "****");
                                aux1 = (int) a.get(i);
                                a.set(i, a.get(j));
                                a.set(j, aux1);
                                
                            } else {
                                System.out.println(a + "****  |" + i + " | " + j + " | " + a.get(i) + " | " + a.get(j) + " | " + aux1 + "  |   NO MAYOR" + "****");

                            }
                            cont++;
                        }

                    }
                    System.out.println("\n El resultado es: " + a);
                    System.out.println("Número de Iteraciones: " + cont);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("*-*-*-*-*Usted a elegido la opcion de Selección*-*-*-*-*");
                    System.out.println(b);
                    aux = 0;
                    cont = 0;

                    for (int i = 0; i < b.size() - 1; i++) {
                        System.out.println("Pasada " + (i + 1));
                        int indicemenor = i;

                        for (int j = i + 1; j < b.size(); j++) {

                            if ((int) b.get(j) < (int) b.get(indicemenor)) {
                                System.out.println(b + " \t ->|" + i + "|" + indicemenor + " | " + j + " | " + b.get(j) + " | " + b.get(indicemenor) + " | " + aux + " | " + "     si menor" + "****");

                                indicemenor = j;
                            } else {
                                System.out.println(b + "\t ->|" + i + "|" + indicemenor + " | " + j + " | " + b.get(j) + " | " + b.get(indicemenor) + " | " + aux + " | " + "     no menor" + "****");

                            }
                            cont++;
                        }
                        int j = 0;
                        if (i != indicemenor) {
                            System.out.println(b);
                            aux = (int) b.get(indicemenor);
                            b.set(indicemenor, b.get(i));
                            b.set(i, aux);

                        } else {
                            System.out.println(b);

                        }

                    }
                    System.out.println("\n El resultado es: " + b);
                    System.out.println("Número de Iteraciones: " + cont);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("*-*-*-*-*Usted elegido la opcion de Inserción*-*-*-*-*");
                    cont = 0;
                    System.out.println(c);
                    for (int i = 0; i < c.size() - 1; i++) {
                        int j = i + 1;
                        aux = (int) c.get(j);

                        System.out.println("Pasada " + (i + 1));
                        while (j > 0) {
                            cont++;
                            if (aux < (int) c.get(j - 1)) {
                                System.out.println(c + "\t ->|"+i+" "+ (j - 1) + " | " + j + " | " + c.get(j) + " | " + c.get(j - 1) + " | " + " | " + " SI MENOR " + " | " + aux + " | " + "****");
                                c.set(j, c.get(j - 1));
                                j = j - 1;
                                c.set(j, aux);
                            } else {
                                System.out.println(c + "\t ->|" + i+" "+(j-1) + " | " + j + " | " + c.get(j) + " | " + c.get(j - 1) + " | " + " | " + " NO MENOR " + " | " + aux + " | " + "****");
                                j = 0;
                            }
                        }
                    }
                    System.out.println("\n El resultado es: " + c);
                    System.out.println("Número de Iteraciones: " + cont);
                    System.out.println("\n");
                    break;
                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Solo digite números entre 1 y 4");
            }

        }
    }
}
