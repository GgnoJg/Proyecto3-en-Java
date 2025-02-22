
package TerceraPractica;// DECLARACIÓN DEL PAQUETE
//IMPORTACIONES
import javax.swing.JOptionPane;  //"JOptionPane" para dilogos de entrada/salida
import javax.swing.ImageIcon;  //"ImageIcon" para manejp de imágenes
        
public class TerceraPractica { //DECLARACIÓN DE LA CLASE

    public static void main(String[] args) { /* "public" Accesible para la JVM, "static" Método de clase, no requiiere instancia
             "void" no retorna ningún valor, "main" Nombre del método principal  */
        
        /*
     // 1 -------------------------------------------------------------------------------------------------------- 
        //ENTRADA DE DATOS//
        
        //TIPO DE DATO MAS IDENTIICADOR
        //clases envoltorias
        
       int edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa tu edad")); //Muestra diálogo, recibe texto, convierte a número y almacena
        //"int" Tipo de dato para números enteros, "edad" Nombre de la variable, "Integer.parseInt" Método estático que convierte String a int
       //"JOptionPane.showInputDialog" Método que muestra diálogo de entrada, "ingresa tu edad": Mensaje para el usuario.
       
       float peso = Float.parseFloat(JOptionPane.showInputDialog("ingrese su peso")); //Captura y almacena peso con decimales
       // //"showInputDialog" Método que muestra un cuadro de diálogo de entrada
       // "float" Tipo de dato para decimales de precisión simple, peso: Nombre de variable
       // "Float.parseFloat" Convierte String a float
       // "ingreese su peso": Mensaje para el usuario
       
       double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese estatura")); // Captura estatura con decimal
       // "double" Tipo para decimales de doble precisión
        //"estatura" Nombre de variable
        //"Double.parseDouble" Convierte a double
       
       
       long NumeroTelefono = Long.parseLong(JOptionPane.showInputDialog("ingresa tu numero de telefono"));  // Almacena números largos
       // "long" Tipo de dato para enteros grandes
       //  "NumeroTelefono" Nombre de variable
        // "Long.parseLong" Convierte a long(tipo de dato primitivo para números enteros con signo de 64 bits)
       
       
       String nombre = JOptionPane.showInputDialog("ingresa tu nombre"); //Captura y almacena texto directamente
       //"showInputDialog" Método que muestra un cuadro de diálogo de entrada
       // "String" Tipo para cadenas de texto
       //"nombre" Nombre de variable
        // "showInputDialog" Método para entrada de texto
       
       
       boolean estatus = Boolean.parseBoolean(JOptionPane.showInputDialog("ingresa aqui")); //Almacena estado lógico
       //"boolean" Tipo para valores verdadero/falso
       //"estatus" Nombre de variable
        // "Boolean.parseBoolean" Convierte a boolean
       
       
       char gener = JOptionPane.showInputDialog("ingresa tu genero").charAt(0);  //Captura un carácter únic
       // char" Tipo para caracteres individuales
       // "gener" Nombre de variable
        // "charAt(0)" Obtiene primer carácter
       
       
      
       //
       float capacidad = 34.56F;
       double longitud = 50.34;
       long telefono = 9515819268L;
        
        
       
       //--------------------------------------------------------------------------------------------------------
      */
      
        // 2 -------------------------------------------------------------------------------------------------------- 
     /*
       //CUADROS DE DIALOGO//
       
       JOptionPane.showMessageDialog(null,"mensaje \s segundo mensaje", //" JOptionPane" clase que proporciona diálogos predefinidos, parte de javax.swing
               //"showMessageDialog" Método estático para mostrar mensajes el cual mostrara: "mensaje \s segundo mensaje"
                //"null" sin padre específico
              "helou",3,new ImageIcon("src/imagenes/github.png")); //"3" representa QUESTION_MESSAGE, que muestra un icono de pregunta en el cuadro de diálogo.
              // "new ImageIcon("src/imagenes/github.png"));" crea un nuevo objeto ImageIcon que carga la imagen que agregue desde la ruta ("src/imagenes/github.png")
    
     
        //--------------------------------------------------------------------------------------------------------
      */
      
        
       
       // 3 -------------------------------------------------------------------------------------------------------- 
      
       //show input
       //Muestrra un cuadro de diálogo de entrada para que el usuario ingrese su nombre
       String nombre = JOptionPane.showInputDialog(null,"ingresa tu nombre","entrada de dato",0); // La variable "nombre" almacenará el texto ingresado por el usuario o null si no se ingresa nada
       //"null" Componente padre del diálogo (no hay)
       //"JOptionPane.showInputDialog" muestra un cuadro de diálogo que solicita al usuario que ingrese su nombre en este caso
       //--------------------------------------------------------------------------------------------------------
      
       
      
      
      /*
         // 4 --------------------------------------------------------------------------------------------------------
        
      //show input con menus
        
      Object seleccion = JOptionPane.showInputDialog(null, //"Object seleccion = JOptionPane.showInputDialog" Muestra un diálogo de entrada con un menú desplegable que permite al usuario seleccionar una opción. 
              //Los parámetros de "showInputDialog" son "null" el componente padre del diálogo, "menu" el título del diálogo
              "elije unna opcion",
               "menu",2,null,
               new Object[]{"DRAMA","TERROR","ROMANTICO"}, "TERROR"); //"new Object[]{"DRAMA","TERROR","ROMANTICO"}" son las opciones disponibles en el menú desplegable.
      JOptionPane.showMessageDialog(null, seleccion); // "JOptionPane.showMessageDialog(null, seleccion)" muestra un mensaje de diálogo con la opción seleccionada por el usuario.
        
         //--------------------------------------------------------------------------------------------------------
      */
      
      
      
      /*
       // 5 --------------------------------------------------------------------------------------------------------
      
      //devuelbe de dato entero//
      int opcion =JOptionPane.showConfirmDialog(null, "deseas eliminar ek archibo?", //Muestra un cuadro de diálogo de confirmación con opciones OK y CANCEL, el resultado es almacenado en la variable "opcion"
              "confirmacion",JOptionPane.OK_CANCEL_OPTION,3); 
      
       Object seleccion = JOptionPane.showInputDialog( null, //Muestra un cuadro de diálogo de entrada que permite al usuario seleccionar una opción de un menú desplegable con un icono personalizado
               //la opción seleccionada es almacenada en la variable "seleccion"
              "elije unna opcion",
               "elige un boton",2,
               new ImageIcon("src/imagenes/github.png"), null,null); // "new ImageIcon("src/imagenes/github.png"));" crea un nuevo objeto ImageIcon que carga la imagen que agregue desde la ruta ("src/imagenes/github.png")
      
      */
       
    }
}
