/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.mayor
 */
package proyvmm;
/**
 *
 * @author Estudiante
 */
public class Vector {
    private int n;//tamaño del vector
    private int vect[];//referencia dada al vector
   

    public Vector(int tam){
        n=tam;
        vect=new int [tam];
    }
    //CONSTRUCTOR DE LA CLASE.
    //RECIBE COMO PARAMETRO EL
    //TAMAÑO DEL VECTOR
    
    public int getN(){
        return n;   
    }
    //Retorna el valor de n (tamaño del vector)
    
    public int[] get_vect(){
        return vect;
    }
    //RETORNA EL VECTOR CON LOS DATOS
    //GENERADOS.
    
    public void mostrar(){
        System.out.println("Datos del Vector" );
        for(int i=0;i<n;i++){
            System.out.print("\nVector["+i+"]="+vect[i]);
        }
    }
    //MUESTRA LOS DATOS DEL
    //VECTOR

     
    public void llenar(){
        
        for(int i=0;i<n ;i++){
          vect[i]=(int)(Math.random()*50);
        }
    }
    //LLENA EL VECTOR CON
    //DATOS ALEATORIOS ENTRE
    //0 Y 100.
    //La función random genera
    //numeros reales entre 0.0
    //0.9
    
    public int sumarV(){
        int suma=0;
        for(int i=0;i<n;i++){
            suma=suma+vect[i];
        }
        return suma;
    }
    //SUMA CADA UNO DE LOS DATOS 
    //DEL VECTOR

    public void punto2(){
        int i=1,mayor=vect[i],posi=vect[i];
        for (i=0;i<n;i++){
            if (vect[i]>mayor){
                mayor=vect[i];
                posi=i;
            }
        }
        int cont=0;
        String aux="";
        for (i=0;i<n;i++){
            if (vect[i]==mayor){
                cont=cont+1;
                aux=aux+", "+i;
            }
        }
        if (cont>1){
            frmContenido.jTextPane1.setText("Son "+cont+" datos mayores sus posiciones son"+aux);
        }
        else{
            frmContenido.jTextPane1.setText("El dato mayor es "+mayor+" y su posición es "+posi);
        }
    }
    //2. Un procedimiento que muestre el dato mayor 
    //del vector y la posición donde se encuentra.
  
    public int punto3(){
        int i,suma=0;
        for (i=0;i<n;i=i+2){
            suma=suma+vect[i];
        }
        return suma;
    }
    //3. Una función que encuentre la suma de los 
    //datos del vector ubicados en las posiciones 
    //pares. (Asumir posición cero como par)
    
    public int punto4(){
        int i,suma=0;
        for (i=1;i<n;i=i+2){
            suma=suma+vect[i];
        }
        return suma;
    }
    //4. Una función que encuentre la suma de los 
    //datos del vector ubicados en las posiciones 
    //impares.
    
    public void punto5(){
        double suma=0.0,prom;
        for (int i=0;i<n;i++){
            suma=suma+vect[i];
        }
        prom=suma/n;
        frmContenido.jTextPane1.setText("El promedio de los datos del vector es: "+prom);
    }
    //5. Un procedimiento que muestre el promedio 
    //de los datos.
    
    public void punto6(){
        double suma=0.0,prom;
        for (int i=0;i<n;i++){
            suma=suma+vect[i];
        }
        prom=suma/n;
        String mayorP="";
        int cont=0;
        for (int i=0;i<n;i++){
            if (vect[i]>prom){
                cont=cont+1;
                mayorP=mayorP+", "+vect[i];
            }
        }
        if (cont>1){
            frmContenido.jTextPane1.setText("Los datos mayores al promedio son"+mayorP);
        }
        else{
            frmContenido.jTextPane1.setText("El dato mayor al promedio es"+mayorP);
        }
    }
    //6. Un procedimiento que muestre cada uno de 
    //los datos mayores al promedio.
    
    public void punto7(){
        double suma=0.0,prom,cont=0;
        for (int i=0;i<n;i=i+2){
            suma=suma+vect[i];
            cont=cont+1;
        }
        prom=suma/cont;
        frmContenido.jTextPane1.setText("El promedio de los datos del vector en las posiciones pares es: "+prom);
    }
    //7. Un procedimiento que muestre el promedio 
    //de los datos ubicados en las posiciones pares.
    
    public void punto8(){
        double suma=0.0,prom,cont=0;
        for (int i=1;i<n;i=i+2){
            suma=suma+vect[i];
            cont=cont+1;
        }
        prom=suma/cont;
        frmContenido.jTextPane1.setText("El promedio de los datos del vector en las posiciones impares es: "+prom);
    }
    //8. Un procedimiento que muestre el promedio de 
    //los datos ubicados en las posiciones impares.
    
    public int punto9(){
        double suma=0.0,prom;
        for (int i=0;i<n;i++){
            suma=suma+vect[i];
        }
        prom=suma/n;
        int cont=0;
        for (int i=0;i<n;i++){
            if (vect[i]>prom){
                cont=cont+1;
            }
        }
        return cont;
    }
    //9. Una función que determine cuantos datos del 
    //vector son mayores que el promedio.
    
    public void punto10(){
        String multi="";
        for (int i=0;i<n;i++){
            if (vect[i]%3==0){
                multi=multi+", "+vect[i];
            }
        }
        frmContenido.jTextPane1.setText("Los datos del vector que son multiplos de 3 son(es)"+multi);
    }
    //10. Un procedimiento que muestre los datos del 
    //vector que son múltiplos de tres.
    
    public double punto11(){
        double producto=1.0;
        for (int i=0;i<n;i=i+1){
            producto=producto*vect[i];
        }
        return producto;
    }
    //11. Una función que determine el producto de los 
    //datos del vector.
    
    public int punto12(){
        int suma=0;
        for(int i=1;i<n-1;i++){
            suma=suma+vect[i];
        }
        suma=suma-vect[n/2];
        return suma;
    }
    //12. Una función que determine la suma de los 
    //datos del vector excepto el primero, ultimo y el 
    //dato del centro.
    
    public int punto13(){
        int i=0,menor=vect[i];
        for (i=1;i<n;i++){
            if (vect[i]<menor){
                menor=vect[i];
            }
        }
        return menor;
    }
    //13. Una función que encuentre el elemento menor 
    //en un vector.
    
    public int punto14(){
        int i,cont=0;
        for (i=0;i<n;i++){
            if (vect[i]%2==1){
                cont=cont+1;
            }
        }
        return cont;
    }
    //14. Una función que retorne el número de datos 
    //del vector que son impares.
    
    public int punto15(){
        int i,cont=0;
        for (i=0;i<n;i++){
            if (vect[i]%2==0){
                cont=cont+1;
            }
        }
        return cont;
    }
    //15. una función que retorne el número de datos 
    //del vector que son pares.
    
    public void punto16(){
        int a,b=n,i;
        String auxb="    Posicion/Dato";
        for (i=0;i<n/2;i=i+1){
            b=b-1;
            a=vect[i];
            vect[i]=vect[b];
            vect[b]=a;
        }
        for (i=0;i<n;i=i+1){
            auxb=auxb+"\n"+"             ["+i+"]       "+vect[i];
        }
        frmContenido.jTextPane1.setText("EL intercambio de datos es:"+auxb);
        //JOptionPane.showMessageDialog(null, "EL intercambio de datos es:"+auxb);
    }
    //16. Un procedimiento que Intercambie los datos 
    //de un vector. El primero pasa a ser el último y 
    //el ultimo pasa a ser el primero. Así con el segundo, 
    //el tercero y los demás.
    
    public void punto17(){
        int i,div=punto15();
        double prom,suma=0.0;
        for (i=0;i<n;i++){
            if (vect[i]%2==0){
                suma=suma+vect[i];
            }
        }
        if (div!=0){
            prom=suma/div;
            frmContenido.jTextPane1.setText("El promedio de los datos del vector que son pares es: "+prom);
        }
        else{
            if (div==0){
                frmContenido.jTextPane1.setText("El promedio de los datos del vector que son pares es: 0.0");
            }
        }
        
    }
    //17. Un procedimiento que calcule el promedio de 
    //los datos del vector que son pares.
    
    public void punto18(){
        int i,div=punto14();
        double prom,suma=0.0;
        for (i=0;i<n;i++){
            suma=suma+vect[i];
        }
        prom=suma/div;
        frmContenido.jTextPane1.setText("El promedio de los datos del vector que son impares es: "+prom);
    }
    //18. Un procedimiento que calcule el promedio de 
    //los datos del vector que son impares.
    
    public int punto19(){
        int i=0, mayor=vect[i], menor=vect[i], diferencia;
        for (i=0;i<n;i++){
            if (vect[i]<menor){
                menor=vect[i];
            }
            if (vect[i]>mayor){
                mayor=vect[i];
            }
        }
        diferencia=mayor-menor;
        return diferencia;
    }
    //19. Una función que calcule la diferencia entre 
    //el dato mayor y el dato menor.
        
    public void ordenarV(){
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                int a=vect[i];
                if (vect[i]>vect[j]){
                    vect[i]=vect[j];
                    vect[j]=a;
                }
            }
        }
    }
    //20. Un procedimiento para Ordenar los datos del vector.
    
    public int punto21(){
        int i,cont=0,mayor=vect[1];
        for (i=0;i<n;i++){
            if (vect[i]>mayor){
                mayor=vect[i];
            }
        }
        for (i=0;i<n;i++){
            if (vect[i]==mayor){
                cont=cont+1;
            }
        }
     return cont;
    }
    //21. Una función que retorne las veces que se presenta 
    //el dato mayor.
    
    public void punto22(){
        int i,cont=0,mayor=0;
        for (i=0;i<n;i++){
            if (vect[i]%2==1&&vect[i]>mayor){
                cont=cont+1;
                mayor=vect[i];
            }
        }
        if (cont==0){
            frmContenido.jTextPane1.setText("No hay datos impares");
        }
        else{
            frmContenido.jTextPane1.setText("El dato mayor que es impar es: "+mayor);
        }
    }
    //22. Un procedimiento que muestre el mayor de los datos 
    //impares si no hay mostrar el mensaje.
    
    public void punto23(){
        int i,digi,suma=0,num;
        String aux="";
        for (i=0;i<n;i++){
            num=vect[i];
            do{
                digi=num%10;
                suma=suma+digi;
                num=num/10;
            }while(num>0);
            aux=aux+"\n"+"     ["+i+"]"+"               "+suma;
            suma=0;
        }
        frmContenido.jTextPane1.setText("La suma de los dígitos de cada posición del vector es:\nPosición=SumaDigitos"+aux);
    }
    //23. Un procedimiento que calcule la suma de dígitos de 
    //cada dato del vector.
    
    public void punto24(){
        int i,suma=0,num,digi;
        for (i=0;i<n;i++){
            num=vect[i];
            do{
                digi=num%10;
                suma=suma+digi;
                num=num/10;
            }while (num>0);
        }
        frmContenido.jTextPane1.setText("La suma de los dígitos del vector es: "+suma);
    }
    //24. Un procedimiento que calcule la suma de dígitos de 
    //todos los números del vector.
    
    public void intercambioDatosVector(){
        int i,num,digi;
        String aux="";
        for (i=0;i<n;i++){
            num=vect[i];
            do{
                digi=num%10;
                aux=aux+digi;
                num=num/10;
            }while(num>0);
            vect[i]=Integer.parseInt(aux);
            aux="";
        }
        String aux1="Posicion/Dato";
        for (i=0;i<n;i++){
            aux1=aux1+"\n     "+i+"        "+vect[i];
        } 
        frmContenido.jTextPane1.setText("El intercambio de C/U de los datos del vector es: "+aux1);
    }
}