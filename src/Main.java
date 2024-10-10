import java.util.LinkedHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1= new Libro("El resplandor","Stephen King","de bolsillo",700);
        Libro libro2= new Libro("Habitos Atomicos","James Clear","Penguin Audio",500);
        Libro libro3= new Libro("El Hobbit","J.R.R Tolkien","Booket",448);
        Libro libro4= new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Vintage",368);
        Libro libro5= new Libro("El principito","Antoine de Saint-Exupéry","El planeta",156);

        libro1.imprimir();
        System.out.println(libro1.imprimir_cubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimir_cubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimir_cubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimir_cubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimir_cubierta());

    }
}
