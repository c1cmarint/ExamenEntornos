/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package examen;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.VoidType;

/**
 *
 * @author alumno
 */
public class CambiaLongitud {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    private int valor;   


    public void Visualizar(int i, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (i=0;i<vector.length;i++){
            System.out.print(vector[i]+",");
        }
        System.out.println("}");
    }

     



    void BorraElemento(int[] v, int p, int i) {
        System.out.println("Elemento a borrar="+v[p]);
        for(i=0;i<v.length;i++)
              v[i]=v[i+1];
    }
    void InsertaElemento(int i, int[] v, int p) {
        System.out.println("Elemento a insertar=" + this.getValor());
       for (i=0;i<v.length;i++) {
           v[i] = v[i - 1];
       }
       v[p] = this.getValor();
    }

    void ModificaElemento(int[] v, int p) {
        //mostramos su contenido           			
   System.out.println("Elemento a modificar="+v[p]);
       v[p]=this.getValor();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int []v= new int[5];
        v[0]=2;
        v[1]=4;
        v[2]=6;
        v[3]=8; 
        CambiaLongitud p=new CambiaLongitud();
        p.setValor(10);
    }
}
