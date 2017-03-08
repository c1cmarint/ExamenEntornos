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
public class Prueba {

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

    //metodo que modifica el contenido de la posicion posicion de un array con el valor pasado
   public void modificar(int[] vector, int LongitudActual, int posicion){
     	int i = 0;  
        Visualizar(i, vector);
         //Modificamos el array
       	  if(posicion<vector.length){ 
              ModificaElemento(vector, posicion);
             }
       //Mostramos los elementos del array  
       System.out.print("v={");
       for (i=0;i<vector.length;i++){
           System.out.print(vector[i]+",");
       }    
         System.out.println("}");  
    }

    public void Visualizar(int i, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (i=0;i<vector.length;i++){
            System.out.print(vector[i]+",");
        }
        System.out.println("}");
    }

//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos
    public void borrar (int []v,int LongitudActual){
       int p=1,i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
        final int longitud = v.length;
         for (i=0;i<longitud;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(p<longitud){ 
            BorraElemento(v, p, i);                                       
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<longitud;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");         
      }
     

//metodo que inserta un  elemento en la posicion posicion desplazando a la derecha todos los elementos
public void insertar (int []v,int LongitudActual){
       int p=1, i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(p<v.length){ 
            InsertaElemento(i, v, p);
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
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
        Prueba p=new Prueba();
        p.setValor(10);
        p.modificar(v, 0, 1);
        p.borrar(v,0);
        p.insertar(v,0);
    }
}
