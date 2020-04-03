package pilaobnl;
import java.util.Scanner;
public class Pila 

{
private int N;
private final int L;
private  final String[] Pila;
public Pila(int X)

{
 X=54;
 L=X;
 Pila=new String[L];
 N=0;
}

private void Agregar(String n)

{
 if(N<L){
 String[]ab={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
 int RAN=(int)Math.round(Math.random()*54);
 String Let=(ab[RAN]);
 Pila[N]=Let;
 N++;
 System.out.println("LETRA AGREGADA");}
    else{
    System.out.println("NO HAY ESPACIO");}
}

private void Eliminar()
        
{
 if(N>0){
 N--;
 System.out.println("ELIMINADO");}
    else{
    System.out.println("NO ELIMINADO");}
}

 private void Mostrar()

{
 if(!Vacia()){
  for(int i=(N-1);i>=0;i--){
  System.out.println("["+Pila[i]+"]");}
 }
 else
 System.out.println("VACIO");
 }
 
 private boolean Vacia()
         
 {
 if (Pila==null){
 System.out.println("VACIA");
 return true;}
 else{
 System.out.println("AGREGE MAS LETRAS");
 return false;}
 }
 
 private void Llenar(String o)

 {
 if(N<L){
 String[]ab={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
 int RAN=(int)Math.round(Math.random()*54);
 String Let=(ab[RAN]);
 Pila[N]=Let;
 N++;
 System.out.println("LETRA AGREGADA");}
}

private boolean Buscar(String dato)
        
{
boolean encontrado=false;
if(!Vacia()){
for(int i=(N-1);i>=0;i--){
if(Pila[i].equals(dato))encontrado=true;}
}
else System.out.println("NO EXISTE");
return encontrado;
}

  public static void main (String[] args) 
  {
    int t,op;
    String dat;
    Scanner teclado=new Scanner(System.in);
    System.out.println("ABECEDARIO");
    System.out.println("PRESIONA CUALQUIER NUMERO Y ENTER PARA COMENZAR");
    t=teclado.nextInt();
    Pila PILA=new Pila(t);
    do{
        System.out.println("QUE ACCION DESEAS");
        System.out.println("1.--------------------------LLENAR");
        System.out.println("2-------------------ELIMINAR LETRA");
        System.out.println("3--------------------MOSTRAR LETRA");
        System.out.println("4---------INCERTAR LETRA POR LETRA");
        System.out.println("5---------------------BUSCAR LETRA");
        System.out.println("6----------------------------SALIR");
        op=teclado.nextInt();
        switch(op)
        {
            case 1:
                Scanner leer=new Scanner(System.in);
                System.out.println("¿DE QUE TAMAÑO LA QUIERES?: ");               
                System.out.println("───█───▄▀█▀▀█▀▄▄───▐█──────▄▀█▀▀█▀▄");
                System.out.println("──█───▀─▐▌──▐▌─▀▀──▐█─────▀─▐▌──▐▌─█");
                System.out.println("─▐▌──────▀▄▄▀──────▐█▄▄──────▀▄▄▀──▐▌");
                System.out.println("─█────────────────────▀█────────────█");
                System.out.println("▐█─────────────────────█▌───────────█");
                System.out.println("▐█─────────────────────█▌───────────█");
                System.out.println("─█───────────────█▄───▄█────────────█");
                System.out.println("─▐▌───────────────▀███▀────────────▐▌");
                System.out.println("──█──────────▀▄───────────▄▀───────█");
                System.out.println("───█───────────▀▄▄▄▄▄▄▄▄▄▀────────█");
                int x=leer.nextInt();
                char[]d=new char[x];
                for(int i=0;i<x;i++){
                String[]abc={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
                int AleatoriaLetra=(int)Math.round(Math.random()*54);
                PILA.Agregar(abc[AleatoriaLetra]);
                }
                break;
                
            case 2:
                PILA.Eliminar();
                break;
                
            case 3:
                PILA.Mostrar();
                break;
                
            case 4:
                System.out.println("AGREGA LETRA");
                String[]ab={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
                int RAN=(int)Math.round(Math.random()*54);
                PILA.Llenar(ab[RAN]);
                break;
                
            case 5:
                System.out.println("INGRESA LA LETRA A BUSCAR: ");
                dat=teclado.next();
                if(PILA.Buscar(dat))
                System.out.println("LETRA ENCONTRADO");
                else System.out.println("LETRA NO ENCONTRADO");
                break;
        }
      }
      while(op!=6);
   }
}