import java.io.*;
import java.util.*;
/**Borra el usuario si esta.
 * 
 * @author Minaya Herrero Latorre
 * @date 11/05/2022
 */
public class Borrar {


    /*************************************************************
     * El metodo "Escribir" cuenta con dos parametros "fFichero"
     * (Donde creamos y especificamos la ruta y el nombre del archivo
     * y "cadena" (Donde le pasamos los caracteres que queremos que
     * sean almacenados en el archivo
     **************************************************************/
    void Escribir(File fFichero,String cadena)
    {
        // Declaramos un buffer de escritura
        BufferedWriter bw;

        try
        {
            // Comprobamos si el archivo no existe y si es asi creamos uno nuevo.
         if(!fFichero.exists())
         {
             fFichero.createNewFile();
         }

           // Luego de haber creado el archivo procedemos a escribir dentro de el.
            bw = new BufferedWriter(new FileWriter(fFichero,true));
            bw.write(cadena);
            bw.close();
            
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }

    /***************************************************************
     * El metodo "Borrar" como su nombre lo indica, nos ayuda a
     * borrar un fichero previamente creado, este metodo cuenta con
     * un parametro, el cual es el nombre del fichero que deseamos
     * borrar
    * ***************************************************************/
    void borrar (File Ffichero)
    {
        try
        {
           // Comprobamos si el fichero existe  de ser así procedemos a borrar el archivo
            if(Ffichero.exists())
            {
                Ffichero.delete();
                System.out.println("Fichero Borrado");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    /***************************************************************
     * Metodo "Modificar", este cuenta con tres parametros que debemos
     * pasarle para su correcto funcionamiento, los cuales son:
     *
     * fAntiguo: Este nos ayuda a saber cual es y donde esta el archivo
     * que deseamos modificar
     *
     * aCadena: Aqui debemos especificar la cadena de caracteres que
     * deseamos modificar o cambiar
     *
     * nCadena: Por ultimo escribimos el nuevo dato que va a sustituir
     * el existente.
     * 
     * nombre: es el nombre del usuario.
    * ******************************************************************/
    void borrar(File fAntiguo,String aCadena, String nombre)
    {
       /*
            Las dos lienas de codigo siguientes, basicamente lo que hacen es generar un numero aleatorio y
            asignarselos a una nueva variable "nFnuevo" (Nombre Fichero Nuevo) la cual es igual a la ruta
            del directorio padre "fAntiguo" mas  la palabra auxiliar seguido del numero aletorio y la extension
            del archivo nuevo
        */
        Random numaleatorio = new Random(3816L);
        String nFnuevo = fAntiguo.getParent()+"/auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt())+".txt");

     // Creo un nuevo archivo
        File fNuevo= new File(nFnuevo);
        // Declaro un nuevo buffer de lectura
        BufferedReader br;
        try
        {
            /*Valido si el fichero antiguo que pasamos como parametro existe, si es asi procedo a leer el
            contenido que hay dentro de el
             */
            if(fAntiguo.exists())
            {
                br = new BufferedReader(new FileReader(fAntiguo));

                String linea;

                /* Mientras el contenido del archivo sea diferente de null procedo a comprar  la linea a modificar con
                lo que hay dentro del archivo, si linea es igual a aCadena escribo el contenido de aCadena en mi nuevo
                fichero(Auxiliar) de lo contrario escribo el mismo contenido que ya tenia el antiguo fichero en mi fichero auxiliar
                 */
                while((linea=br.readLine()) != null)
                {
                	String todo= nombre +" "+aCadena;
                    if(linea.equals(todo))
                    {
                        Escribir(fNuevo,"");
                    }
                    else
                    {
                        Escribir(fNuevo,linea+"\n");
                    }
                }
              // Cierro el buffer de lectura
                br.close();
                // Capturo el nombre del fichero antiguo
                // String nAntiguo = fAntiguo.getName();
                //Renombro el fichero auxiliar con el nombre del fichero antiguo
                fNuevo.renameTo(fAntiguo);
                // Borro el fichero antiguo
                borrar(fAntiguo);
            }
            else
            {
                System.out.println("Fichero no Existe");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
