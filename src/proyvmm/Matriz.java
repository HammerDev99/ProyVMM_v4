/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyvmm;

import javax.swing.JOptionPane;
/**
 *
 * @author Estudiante
 */
public class Matriz {
    private int nf;
    private int nc;
    private int mat[][];

    public Matriz(int numf, int numc) {
        nf = numf;
        nc = numc;
        mat=new int[numf][numc];
    }    

    /**
     * @return the nf
     */
    public int getNf() {
        return nf;
    }

    /**
     * @return the nc
     */
    public int getNc() {
        return nc;
    }

    /**
     * @return the mat
     */
    public int[][] getMat() {
        return mat;
    }
    
    public void llenar(){
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                mat[i][j]=(int)(Math.random()*50);
            }
        }
    }
    
    public void promFilasPares(){
        double suma=0,prom;
        int cont=0;
        for (int i = 0; i < nf; i=i+2) {
            for (int j = 0; j < nc; j=j+1) {
                suma=suma+mat[i][j];
                cont=cont+1;
            }
        }
        prom=suma/cont;
        JOptionPane.showMessageDialog(null,"El promedio de los datos ubicados en las FILAS PARES es: "+prom,null,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void promColumnasImpares(){
        double suma=0,prom;
        int cont=0;
        for (int i = 0; i < nf; i++) {
            for (int j = 1; j < nc; j=j+2) {
                suma=suma+mat[i][j];
                cont=cont+1;
            }
        }
        prom=suma/cont;
        JOptionPane.showMessageDialog(null,"El promedio de los datos ubicados en las COLUMNAS IMPARES es: "+prom,null,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void datoMayor(){
        int mayor=mat[0][0];
        int posiI=0,posiJ=0;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                if(mat[i][j]>mayor){
                    mayor=mat[i][j];
                    posiI=i;
                    posiJ=j;
                }
            }
        }
        int cont=0;
        String aux="";
        for (int i=0;i<nf;i++){
            for (int j = 0; j < nc; j++) {
                if (mat[i][j]==mayor){
                cont=cont+1;
                aux=aux+", ["+i+"]["+j+"]";
            }
            }
        }
        if (cont>1){
            JOptionPane.showMessageDialog(null,"Se hallaron "+cont+" datos mayores que son "+mayor+", sus posiciones son "+aux,null,JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"El dato mayor es "+mayor+" y su posicion es ["+posiI+"]["+posiJ+"]",null,JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    /*METODO TIPO PROCEDIMIENTO QUE HALLA EL MAYOR
     * VALOR DE LA MATRIZ
     */
    public void cambioColumnas(){
        int mitad=nc/2,a,retro=nc-1;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j <= mitad; j++) {
                a=(mat[i][retro]);
                mat[i][retro]=mat[i][j];
                mat[i][j]=a;
                retro=retro-1;
            }
            retro=nc-1;
        }
    }
    /*Diseñar un procedimiento que intercambie las
     * columnas
     */
    
    public void cambioFilas(){
        int mitad=nf/2,a,retro=nf-1;
        for (int j = 0; j < nc; j++) {
            for (int i = 0; i <= mitad; i++) {
                a=(mat[retro][j]);
                mat[retro][j]=mat[i][j];
                mat[i][j]=a;
                retro=retro-1;
            }
            retro=nf-1;
        }
    }
    /*Diseñar un procedimiento que intercambie las
     * filas
     */
    
    public int sumaDM(){
        int suma=0;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                suma=suma+mat[i][j];
            }
        }
        return (suma);
    }
    
    public int sumaCP(){
        int suma=0;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j=j+2) {
                suma=suma+mat[i][j];
            }
        }
        return (suma);
    }
    
    public int sumaCI(){
        int suma=0;
        for (int i = 0; i < nf; i++) {
            for (int j = 1; j < nc; j=j+2) {
                suma=suma+mat[i][j];
            }
        }
        return (suma);
    }
    
    public void promMfijandoC(){
        int suma=0;
        double prom,div=nf*nc;
        for (int j = 0; j < nc; j++) {
            for (int i = 0; i < nf; i++) {
                suma=suma+mat[i][j];
            }
        }
        prom=suma/div;
        JOptionPane.showMessageDialog(null,"El primedio de los datos de la Matriz fijando columnas es: "+prom,null,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void datosMayoresAlProm(){
        int suma=0,cont=0;
        String aux="\n                                 Posicion = Dato\n";
        double prom,div=nf*nc;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                suma=suma+mat[i][j];
            }
        }
        prom=suma/div;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                if (mat[i][j]>prom){
                    cont=cont+1;
                    aux=aux+"                                       ["+i+"]["+j+"] = "+mat[i][j]+"  \n";
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Los datos que son mayores al promedio son "+cont+" y estos son:"+aux,null,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void sumaDatosDgnalPpal(){
        int suma=0;
        for (int i = 0; i < nf; i++) {
            suma=suma+mat[i][i];
        }
        JOptionPane.showMessageDialog(null,"La suma de los datos ubicados en la diagonal PRINCIPAL es: "+suma,null,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void sumaDatosDgnalScndra(){
        int suma=0,contf=nf-1,contc=0;
        for (int i = 0; i < nf; i++) {
            suma=suma+mat[contf][contc];
            contf=contf-1;
            contc=contc+1;
        }
        JOptionPane.showMessageDialog(null,"La suma de los datos ubicados en la diagonal SECUNDARIA es: "+suma,null,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean matrizSimetrica(){
        boolean resp=false;
        if (nf==nc){
            resp=true;
        }
        return (resp);
    }
    
    public int cantidadImpares(){
        int cont=0;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                if (mat[i][j]%2==0){
                    cont=cont+1;
                }
            }
        }
        return (cont);
    }
    
    public int cantidadPares(){
        int cont=0;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                if (mat[i][j]%2==1){
                    cont=cont+1;
                }
            }
        }
        return (cont);
    }
    
    public double promFilasImpares(){
        double suma=0,prom;
        int cont=0;
        for (int i = 1; i < nf; i=i+2) {
            for (int j = 0; j < nc; j=j+1) {
                suma=suma+mat[i][j];
                cont=cont+1;
            }
        }
        prom=suma/cont;
        return (prom);
    }
    
    /*public void OrdenaAscendente(){
        int i=0,j=0,contf=0,contc=0;
        int tama=(nf*nc)-((nf-1)*(nc-1));
        for (i = 0; i < tama; i++) {
            for (j = 0; j < tama; j++) {
                               
            }
            contc=0;
        }
    }*/
        
    
}