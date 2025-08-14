package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        Estudiante estudiante1 = new Estudiante("Ana", 20, 9.2);
        Estudiante estudiante2 = new Estudiante("Luis", 22, 8.5);
       
        // 2. Mostrar la información de ambos estudiantes
        System.out.println("Estudiante 1: " + estudiante1);
        System.out.println("Estudiante 2: " + estudiante2);
      
        // 3. Modificar algún atributo usando un setter
        estudiante1.setEdad(21);

        // 4. Mostrar la información actualizada
        System.out.println("Estudiante 1 actualizado: " + estudiante1);

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        Libro libro1 = new Libro("La psicologia del dinero", "Morgan Housel", 350.0);
        
        // 2. Crear un libro usando el constructor con solo titulo y autor
        Libro libro2 = new Libro("El poder de confiar en ti", "Curro cañete");
        
        // 3. Mostrar información de ambos libros
        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2);

        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(10); 
        libro2.setPrecio(150.0); 
        libro2.aplicarDescuento(20, 40); 
        
        // 5. Mostrar información actualizada de los libros
          System.out.println("Libro 1 con descuento: " + libro1);
        System.out.println("Libro 2 con descuento: " + libro2);
    
    }
}