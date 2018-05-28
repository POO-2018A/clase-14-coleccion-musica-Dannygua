
package artista;
import java.util.Scanner;

public class Princi {
     
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("numero de artistas a ingresar: ");
        int numeroartistas = scan.nextInt();
  
        Artista art [] = new Artista [1000];
        Album alb [] = new Album [1000];
        int contadordealbunes[] = new int [1000];
        int numeroalbum [] = new int [1000];
        int contador=0;
        numeroalbum [0]=0;
        boolean bool2 = true;
        boolean bool=true;
        int t=1;

        for (int i = 0; i <numeroartistas ; i++) {
            //Asignacion de artistas
            
            bool2 = true;
            bool =true;
            if (i==0){
                
            ingresarart (i, art);
            
             //Asignacion de album
             
            System.out.print("\n");  
            System.out.print("\tALBUM");
            System.out.print("\n");  
            System.out.print("Ingrese el numero de albunes para el artista " + art [i].getNombre()+ " : ");
            contadordealbunes[i] = scan.nextInt();           
       
            
        System.out.println("\n");
        
        numeroalbum [i]=contador;
         for (int j =0 ; j < contadordealbunes[i]; j++) {     
             
             ingresaralb (contador, alb,t);

              contador++;
              t++;
    
         }
                 
            }else{
                
                ingresarart (i, art);
            
                 for (int j = 0; j<i; j++) {
                     
                    
                if (art[j].equals(art[i])){
                    
                    bool2 =false;
                    scan.nextLine();
                    System.out.println("El artista ingresado ya existe,si desea ingresar el album para este artista ingrese Si");
                    String respuesta = scan.nextLine();
                    
                    if(respuesta.equals("Si")||respuesta.equals("si")){
                        
                        
                        System.out.print("\n");  
                        System.out.print("\tALBUM");
                                          
                        System.out.println("\n");
                        
                   t=1;           
        for (int l =0; l < contadordealbunes[j]; l++) {

            System.out.println("\tAlbum numero "+ t);
            scan.nextLine();
            System.out.print("Nombre: ");
            String nombrealbum = scan.nextLine();
            System.out.print("Genero: ");
            String genero = scan.nextLine();
            System.out.print("Ano: ");
            int año = scan.nextInt();
            System.out.print("numero de canciones: ");
            int numerocanciones = scan.nextInt();
            
           
            int n1 = numeroalbum [j]+l;    

            alb [n1] = new Album (año,genero,numerocanciones,nombrealbum);
            t++;
    
        } 
                   
                    }else{
                        
                        bool = false;
                     ingresarart(i, art);
                     
                     System.out.print("\n");  
            System.out.print("\tALBUM");
            System.out.print("\n");  
            System.out.print("Ingrese el numero de albunes para el artista " + art [i].getNombre()+ " : ");
            contadordealbunes[i] = scan.nextInt();               

             numeroalbum [i]=contador;
        
        System.out.println("\n");
       
        t=1;
         for (int p =0 ; p < contadordealbunes[i]; p++) {     
             
             ingresaralb (contador, alb, t); 
             contador++;
   
             t++;
         }                        
                        
                    }
                }
                         
            }
                 
                if(bool == true){
                 if (bool2==false){
                    
                     ingresarart(i, art);
                     
                     System.out.print("\n");  
            System.out.print("\tALBUM");
            System.out.print("\n");  
            System.out.print("Ingrese el numero de albunes para el artista " + art [i].getNombre()+ " : ");
            contadordealbunes[i] = scan.nextInt();               

             numeroalbum [i]=contador;
        
        System.out.println("\n");
       
        t=1;
         for (int j =0 ; j < contadordealbunes[i]; j++) {     
             
             ingresaralb (contador, alb, t); 
             contador++;
   
             t++;
         }
                 
                 }else{
                     
                     System.out.print("\n");  
            System.out.print("\tALBUM");
            System.out.print("\n");  
            System.out.print("Ingrese el numero de albunes para el artista " + art [i].getNombre()+ " : ");
            contadordealbunes[i] = scan.nextInt();               

             numeroalbum [i]=contador;
        
        System.out.println("\n");
       
        t=1;
         for (int j =0 ; j < contadordealbunes[i]; j++) {     
             
             ingresaralb (contador, alb, t);      
             contador++;
              t++;
         }
                 
                 }
                }
            
            }       
            
        }
        
        //msotrar datos 
        System.out.println("\n");
        System.out.print("\tCONTENIDO DE LOS ARTISTAS REGISTRADOS");
        for (int i = 0; i <numeroartistas ; i++) {
            
            System.out.println("\n");
            System.out.println("\tArtista " + (i+1));
            System.out.print(art [i]);     
            System.out.println("\n");
                      
        
            t=1;
            for (int j = 0; j <  contadordealbunes[i]; j++) {
                    
                System.out.println("\tAlbum "+t+" del artista "+ art [i].getNombre() );
                System.out.println(alb[numeroalbum [i]+j]);
                
                t++;
            }               
        }
 
        
    }
    
    
    public static void ingresarart (int i,Artista art []){
        
        Scanner scan = new Scanner (System.in);

            System.out.println("\tARTISTAS");
            System.out.println("\tArtista numero "+ (i+1));
            scan.nextLine();
            System.out.print("Nombre: ");
            String nombre = scan.nextLine();
            System.out.print("Fecha de nacimiento: ");
            String fechanacimiento = scan.nextLine();
            System.out.print("Pais de origen: ");
            String pais = scan.nextLine(); 
            art [i]= new Artista (nombre, fechanacimiento, pais);
        
    }
    
    public static void ingresaralb ( int contador, Album alb [], int t){
        
        Scanner scan = new Scanner (System.in);
        
        
            System.out.println("\tAlbum numero "+ t);
            scan.nextLine();
            System.out.print("Nombre: ");
            String nombrealbum = scan.nextLine();
            System.out.print("Genero: ");
            String genero = scan.nextLine();
            System.out.print("Ano: ");
            int año = scan.nextInt();
            System.out.print("numero de canciones: ");
            int numerocanciones = scan.nextInt();
            
            alb [contador] = new Album (año,genero,numerocanciones,nombrealbum);
 
           
    }
    
    
}
