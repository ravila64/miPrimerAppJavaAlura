package model;

public class Producto {
    private String nombre;
    private double valor;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static class Ejemplo {
        public static void main(String[] args) {
            System.out.println("model.Producto.Ejemplo de una clase");
        }
    }
}
