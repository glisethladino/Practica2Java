package Clase2;

import java.lang.Override.*;

public class Libro {

    String nombre;
    int isbn;
    String autor;

    public Libro(){}

    public Libro(String nombre, int isbn, String autor){

        this.nombre=nombre;
        this.isbn=isbn;
        this.autor=autor;
    }

    public Libro(Libro libro){
        this.nombre=libro.getNombre();
        this.isbn= libro.getIsbn();
        this.autor= libro.getAutor();
    }

    public void Prestamo(){
        System.out.println("Te prestamos el libro con nombre "+nombre);
    }

    public void  devolucion() {
        System.out.println("Devolviste el libro con nombre " + nombre);
    }

    public void ToString(){
        System.out.println(getNombre()+", "+isbn+", "+autor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Harry Potter", 123, "Rowling,J. K.");
       libro.toString();
       // System.out.println(libro.getNombre());
    }
}
