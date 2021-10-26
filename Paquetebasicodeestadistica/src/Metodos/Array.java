package Metodos;

import java.util.ArrayList;//importamos para utilizar el Arraylist
import java.util.Collections;

public class Array {

    ArrayList<Valores> arreglo;//creamos un atributo que se llame arreglo y que sea un aarylist de tipo persona

    public Array() {
        arreglo = new ArrayList<Valores>();//en el constructor instanciamos el atributo arreglo para utilizarlo en un nuevo arraylist

    }

    public void adicionar(Valores p) {//con este metodo podemos adicionar un objeto de tipo persona a nuestro array list
        arreglo.add(p);

    }

    public Valores obtenerposcion(int posicion) {//con este metodo obtenemos la posicion 
        return arreglo.get(posicion);
    }

    public int tamaño() {//y con este el tama�o en numero del arraylist
        return arreglo.size();
    }

    public void BorrarTodo() {//con este borramos todos los datos del Array
        arreglo.removeAll(arreglo);
    }
    
    public void Ordenar(){// con este ordenamos el array
          Collections.sort(arreglo);      
    }

}
