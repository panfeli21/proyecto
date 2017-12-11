/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.Grafico;


import Clases.Nodo;
import Clases.Pintar;

import static estructurasdedatos.Grafico.VentanaPrincipal.PrincipalWindow;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Algoritmo_Dijkstra implements Serializable {

    private Arboles arboles;
    private int subTope;
    private Nodo auxi = null;
    private int auxAumulado; // es un acumulado auxiliar
    private int subAcomulado;
    private Nodo nodo[];
    private int tope;
    private int permanente;
    private int nodoFin;
    int controlador;//Controlador temporal para determinar los pesos de las aristas del camino optimo
    ArrayList<Integer> Pesos = new ArrayList<Integer>();//Almacena pesos de aristas del camino optimo
    ArrayList<Nodo> AlmacenWarpTemp = new ArrayList<Nodo>(); //Almacena los nodos del camino optimo
    ArrayList<Nodo> AlmacenWarpFinal = new ArrayList<Nodo>();//Almacen final de los nodos de mayor a menor
    ArrayList<Nodo> Reporte = new ArrayList<Nodo>();
    ArrayList<Nodo> ReporteWarp = new ArrayList<Nodo>();
    FileWriter fichero = null;
    PrintWriter pw = null;

    public Algoritmo_Dijkstra(Arboles arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Nodo[tope];
        this.permanente = permanente;
        this.nodoFin = nodoFin;
    }

    public int getAcumulado() {
        return nodo[nodoFin].getAcumulado();
    }

    public void dijkstra() {
        for (int i = 0; i < tope; i++) // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
        {
            nodo[i] = new Nodo();
        }

        if (permanente != nodoFin) {
            PrincipalWindow.paint(PrincipalWindow.getGraphics());
            R_repaint(tope, arboles);
            Pintar.clickSobreNodo(PrincipalWindow.getGraphics(), arboles.getCordeX(permanente), arboles.getCordeY(permanente), null, Color.GREEN); // pinta de color GREEN los nodos

            nodo[permanente].setVisitado(true);
            nodo[permanente].setNombre(permanente);

            do {
                subAcomulado = 0;
                auxAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
                nodo[permanente].setEtiqueta(true);
                for (int j = 0; j < tope; j++) {
                    if (arboles.getmAdyacencia(j, permanente) == 1) {
                        subAcomulado = nodo[permanente].getAcumulado() + arboles.getmCoeficiente(j, permanente);
                        if (subAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        } else if (nodo[j].isVisitado() == false) {
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        }
                    }
                }
                for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getAcumulado() <= auxAumulado) {
                            permanente = nodo[i].getNombre();
                       //System.out.println(permanente);
                            //System.out.println(nodo[i].getAcumulado());
                            auxAumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subTope++;
            } while (subTope < tope + 1);
            auxi = nodo[nodoFin];

            if (auxi.getPredecesor() == null) {
                JOptionPane.showMessageDialog(null, "No se Pudo LLegar Al Nodo " + nodoFin);
            }
            while (auxi.getPredecesor() != null) {

                Pintar.pintarCamino(PrincipalWindow.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), arboles.getCordeX(auxi.getPredecesor().getNombre()), arboles.getCordeY(auxi.getPredecesor().getNombre()), Color.GREEN);
                Pintar.clickSobreNodo(PrincipalWindow.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), null, Color.GREEN);
                this.Reporte.add(auxi);
                System.out.println("tamaño reporte"+Reporte.size());
                auxi = auxi.getPredecesor();
            }
                this.Reporte.add(auxi);
            Pintar.clickSobreNodo(PrincipalWindow.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null, Color.GREEN);
        } else {
            Pintar.clickSobreNodo(PrincipalWindow.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null, Color.GREEN);
        }
    }

    public void Warp() {
        for (int i = 0; i < tope; i++) // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
        {
            nodo[i] = new Nodo();
        }

        if (permanente != nodoFin) {
            PrincipalWindow.paint(PrincipalWindow.getGraphics());
            R_repaint(tope, arboles);
            Pintar.clickSobreNodo(PrincipalWindow.getGraphics(), arboles.getCordeX(permanente), arboles.getCordeY(permanente), null, Color.GREEN); // pinta de color GREEN los nodos

            nodo[permanente].setVisitado(true);
            nodo[permanente].setNombre(permanente);

            do {
                subAcomulado = 0;
                auxAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
                nodo[permanente].setEtiqueta(true);
                for (int j = 0; j < tope; j++) {
                    if (arboles.getmAdyacencia(j, permanente) == 1) {
                        subAcomulado = nodo[permanente].getAcumulado() + arboles.getmCoeficiente(j, permanente);
                        if (subAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        } else if (nodo[j].isVisitado() == false) {
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        }
                    }
                }
                for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getAcumulado() <= auxAumulado) {
                            permanente = nodo[i].getNombre();
                       //System.out.println(permanente);
                            //System.out.println(nodo[i].getAcumulado());
                            auxAumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subTope++;
            } while (subTope < tope + 1);
            auxi = nodo[nodoFin];
            if (auxi.getPredecesor() == null) {
                JOptionPane.showMessageDialog(null, "No se Pudo LLegar Al Nodo " + nodoFin);
            }
            while (auxi.getPredecesor() != null) {
                this.controlador = auxi.getAcumulado() - auxi.getPredecesor().getAcumulado();
                System.out.println(this.controlador);
                System.out.println(auxi.getNombre());
                System.out.println(auxi.getPredecesor().getNombre());
                Pesos.add(this.controlador);
                AlmacenWarpTemp.add(auxi);
                Pintar.pintarCamino(PrincipalWindow.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), arboles.getCordeX(auxi.getPredecesor().getNombre()), arboles.getCordeY(auxi.getPredecesor().getNombre()), Color.GREEN);
                Pintar.clickSobreNodo(PrincipalWindow.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), null, Color.GREEN);
                this.ReporteWarp.add(auxi);
                auxi = auxi.getPredecesor();
            }
                this.ReporteWarp.add(auxi);

            Collections.sort(Pesos);
            Comparator<Integer> comparador = Collections.reverseOrder();
            Collections.sort(Pesos, comparador);
            int acumuladorPesos = 0; //Acumula los pesos exceptuando el mayor para sacar los dos pesos mayores de la ruta
            int acumuladorPesos2 = 0; //Acumula los peso exceptuando los dos mayores para sacar los pesos mayores de la ruta
            for (int i = 1; i < Pesos.size(); i++) {
                acumuladorPesos += Pesos.get(i);
            }
            if (Pesos.size() >= 2) {
                for (int i = 2; i < Pesos.size(); i++) {
                    acumuladorPesos2 += Pesos.get(i);
                }
            }
            for (int i = 0; i < AlmacenWarpTemp.size(); i++) {
                System.out.println("Pero si entra a este For");
                if (AlmacenWarpFinal.isEmpty() && (AlmacenWarpTemp.get(i).getAcumulado() - (AlmacenWarpTemp.get(i).getPredecesor().getAcumulado() + nodo[nodoFin].getAcumulado()) == (acumuladorPesos * -1))) {
                    AlmacenWarpFinal.add(AlmacenWarpTemp.get(i));
                    System.out.println("Entro a este if");
                } else if ((AlmacenWarpFinal.isEmpty() == false) && (AlmacenWarpTemp.get(i).getAcumulado() - (AlmacenWarpTemp.get(i).getPredecesor().getAcumulado()) == (Pesos.get(1))) || (AlmacenWarpTemp.get(i).getAcumulado() - (AlmacenWarpTemp.get(i).getPredecesor().getAcumulado()) == (acumuladorPesos2))) {
                    AlmacenWarpFinal.add(AlmacenWarpTemp.get(i));
                    System.out.println("Entro a if numero 2");
                }
            }
            System.out.println(AlmacenWarpTemp.size());
            System.out.println(AlmacenWarpFinal.size());
            Pintar.pintarCamino(PrincipalWindow.getGraphics(), arboles.getCordeX(AlmacenWarpFinal.get(0).getNombre()), arboles.getCordeY(AlmacenWarpFinal.get(0).getNombre()), arboles.getCordeX(AlmacenWarpFinal.get(0).getPredecesor().getNombre()), arboles.getCordeY(AlmacenWarpFinal.get(0).getPredecesor().getNombre()), Color.PINK);
            Pintar.pintarCamino(PrincipalWindow.getGraphics(), arboles.getCordeX(AlmacenWarpFinal.get(1).getNombre()), arboles.getCordeY(AlmacenWarpFinal.get(1).getNombre()), arboles.getCordeX(AlmacenWarpFinal.get(1).getPredecesor().getNombre()), arboles.getCordeY(AlmacenWarpFinal.get(1).getPredecesor().getNombre()), Color.PINK);

            nodo[nodoFin].setAcumulado(nodo[nodoFin].getAcumulado() - (Pesos.get(0) + Pesos.get(1)));

            Pintar.clickSobreNodo(PrincipalWindow.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null, Color.GREEN);
        } else {
            Pintar.clickSobreNodo(PrincipalWindow.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null, Color.GREEN);
        }
    }

    public void GenerarFichero(String ruta) {
        try {
            /*try {
            fichero = new FileWriter(ruta+".txt");
            pw = new PrintWriter(fichero);
            
            
            //for (int i = 0; i < 10; i++) {
            //  pw.println("Linea " + i);
            //}
            
            } catch (Exception e) {
            e.printStackTrace();
            } finally {
            try {
            // Nuevamente aprovechamos el finally para
            // asegurarnos que se cierra el fichero.
            if (null != fichero) {
            fichero.close();
            }
            } catch (Exception e2) {
            e2.printStackTrace();
            }
            }
            }*/
            System.out.println(Reporte.size());
            File archivo = new File(ruta);
            BufferedWriter bw = null;
            if(archivo.exists()) {
                try {
                    bw = new BufferedWriter(new FileWriter(archivo));
                    //bw.write("El fichero de texto ya estaba creado.");
                } catch (IOException ex) {
                    Logger.getLogger(Algoritmo_Dijkstra.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    bw = new BufferedWriter(new FileWriter(archivo));
                    bw.write("Ruta Mas Corta Desde "+this.Reporte.get(this.Reporte.size()-1).getNombre()+" hasta "+Reporte.get(0).getNombre()+" es: ");
                    bw.newLine();
                    bw.newLine();
                    //bw.write("Por lo menos si se que funciona la escritura en archivo");
                    for (int i = this.Reporte.size()-1; i >=0; i--) {
                        bw.write(this.Reporte.get(i).getNombre()+", ");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Algoritmo_Dijkstra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Algoritmo_Dijkstra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


