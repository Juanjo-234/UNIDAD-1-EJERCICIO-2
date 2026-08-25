class vino{
String etiqueta;
String varietal;
int stockBotellas;
double precio;

public vino(String etiqueta, String varietal, double precio){
    this.etiqueta = etiqueta;
    this.varietal = varietal;
    this.stockBotellas = 0;
    this.precio = precio;
}

void venderbotellas(int cantidad){
if(stockBotellas <= 0 ){
    System.out.println("Stock insuficiente");
}

this.stockBotellas = this.stockBotellas - cantidad;

System.out.println("Cantidad de botellas vendidas: " + cantidad);
System.out.println("Stock restante: " + this.stockBotellas);
}


void reponerBotellas(int cantidad){
if(cantidad < 0 ){
    System.out.println("No fue posible ingresar botellas. Por favor reintente");
}
this.stockBotellas = this.stockBotellas + cantidad;

System.out.println("Cantidad de botellas ingresadas: " + cantidad);
System.out.println("Nuevo stock: " + this.stockBotellas);
}

void mostrardetalle(){
System.out.println("=============================");
System.out.println("Etiqueta: " + etiqueta);
System.out.println("Varietal: " + varietal);
System.out.println("Stock botellas: " + stockBotellas);
System.out.println("Precio: " + precio);
}

public static void main(String[] args) {
    vino v1 = new vino("Crotta", "Malbec", 1200);

    v1.reponerBotellas(100);
    v1.venderbotellas(50);
    v1.mostrardetalle();
    v1.reponerBotellas(100);
    v1.mostrardetalle();
}

}