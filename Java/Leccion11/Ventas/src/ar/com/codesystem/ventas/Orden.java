
package ar.com.codesystem.ventas;


public class Orden {
    private int idOrden;
    private Producto productos[]; //Declaramos el arreglo
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    //constructor vacio
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto; //Primero lee la variable y luego hace el incremento  
        }
        else{
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total = 0; //variable temporal
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto  = this.productos[i];
            //total += producto.getPrecio();
            total += this.productos[i].getPrecio(); //forma simplificada de las dos lineas anteriores
            
        }
        return total;
    }
    
   public void mostrarOrden(){
       System.out.println("Id Orden: " + idOrden);
       double totalOrden = this.calcularTotal();
       System.out.println("El total de la orden es: $" + totalOrden);
       System.out.println("Productos de la Orden: ");
       for (int i = 0; i < this.contadorProductos; i++) {
           System.out.println(this.productos[i]);
       }
   }

    
}
