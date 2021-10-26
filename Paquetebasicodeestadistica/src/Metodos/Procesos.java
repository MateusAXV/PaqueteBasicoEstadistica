/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import static Ventanas.Datos.DatosNum;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Procesos {

    public static double Media = 0, Mediana = 0, Moda = 0;

    public static double Media() {// Calcula la media o promedio
        DatosNum.Ordenar();
        double sumatoria = 0;
        for (int i = 0; i < DatosNum.tamaño(); i++) {
            sumatoria = sumatoria + DatosNum.obtenerposcion(i).getNumero();
        }
        Media = sumatoria / DatosNum.tamaño();
        sumatoria = 0;
        return Media;
    }

    public static double Mediana() {//calcula la mediana o dato central
        DatosNum.Ordenar();
        int posicion = DatosNum.tamaño() / 2;
        double aux = 0;

        if (DatosNum.tamaño() % 2 == 0) {
            aux = (DatosNum.obtenerposcion(posicion - 1).getNumero() + DatosNum.obtenerposcion(posicion).getNumero()) / 2;
            Mediana = aux;
        } else {
            aux = DatosNum.obtenerposcion(posicion).getNumero();
            Mediana = aux;
        }
        return Mediana;
    }

    public static double Moda() {//calcula la moda o el dato que mas se repite
        DatosNum.Ordenar();
        int maximaVecesQueSeRepite = 0;

        for (int i = 0; i < DatosNum.tamaño(); i++) {
            int vecesQueSeRepite = 0;
            for (int j = 0; j < DatosNum.tamaño(); j++) {
                if (DatosNum.obtenerposcion(i).getNumero() == DatosNum.obtenerposcion(j).getNumero()) {
                    vecesQueSeRepite++;
                }
            }
            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                Moda = DatosNum.obtenerposcion(i).getNumero();
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }
        return Moda;
    }
}
