public class Producto {

    // Datos del producto
    private int id; // numero en el que se ordena el arbol
    private String nombre; // nombre del producto

     // Puntero al hijo izquierdo (ID menor)
    private Producto izquierdo; 

     // Puntero al hijo derecho (ID mayor)
    private Producto derecho; 

    // Constructor del producto
    public Producto(int id, String nombre) {

        this.id = id;
        this.nombre = nombre;

        // Al crear el producto todavía no tiene hijos
        this.izquierdo = null;
        this.derecho = null;
    }

    // Getters: permiten leer los datos desde otra clase

    public int getId() {return id;}  // Devuelve el ID del producto
    public String getNombre() {return nombre;} // Devuelve el nombre del producto
    public Producto getIzquierdo() {return izquierdo;} // Devuelve el hijo izquierdo
    public Producto getDerecho() {return derecho;} // Devuelve el hijo derecho

    // Setters: permiten modificar los datos desde otra clase

    public void setId(int id) {this.id = id;} // Modifica el ID del producto
    public void setNombre(String nombre) {this.nombre = nombre;} // Modifica el nombre del producto
    public void setIzquierdo(Producto izquierdo) {this.izquierdo = izquierdo;} // Conecta un producto con el hijo izquierdo
    public void setDerecho(Producto derecho) {this.derecho = derecho;} // Conecta un producto con el hijo derecho
}
