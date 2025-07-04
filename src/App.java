import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import models.Book;

public class App {
    public static void main(String[] args) throws Exception {

        // Lista de libros
        List<Book> books = Arrays.asList(
                new Book("El Quijote", "Miguel de Cervantes", 39.99),
                new Book("Cien años de soledad", "Gabriel García Márquez", 45.50),
                new Book("Clean Code", "Robert C. Martin", 55.00),
                new Book("Effective Java", "Joshua Bloch", 70.00),
                new Book("The Pragmatic Programmer", "Andy Hunt & Dave Thomas", 65.00),
                new Book("1984", "George Orwell", 25.00),
                new Book("Un mundo feliz", "Aldous Huxley", 28.50),
                new Book("Orgullo y prejuicio", "Jane Austen", 22.99),
                new Book("Crimen y castigo", "Fiódor Dostoyevski", 34.75),
                new Book("La Odisea", "Homero", 19.99),
                new Book("Hamlet", "William Shakespeare", 15.00),
                new Book("El gran Gatsby", "F. Scott Fitzgerald", 24.00),
                new Book("Matar un ruiseñor", "Harper Lee", 26.50),
                new Book("Donde viven los monstruos", "Maurice Sendak", 18.99),
                new Book("El señor de los anillos", "J.R.R. Tolkien", 55.20),
                new Book("Dune", "Frank Herbert", 42.00),
                new Book("Juego de Tronos", "George R.R. Martin", 48.00),
                new Book("El nombre del viento", "Patrick Rothfuss", 38.00),
                new Book("Fahrenheit 451", "Ray Bradbury", 23.50),
                new Book("Neuromante", "William Gibson", 31.00),
                new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma et al.", 75.00),
                new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", 68.00),
                new Book("Head First Design Patterns", "Eric Freeman et al.", 58.50),
                new Book("Java: The Complete Reference", "Herbert Schildt", 80.00),
                new Book("Spring in Action", "Craig Walls", 62.50),
                new Book("Grokking Algorithms", "Aditya Bhargava", 49.99),
                new Book("Introduction to the Theory of Computation", "Michael Sipser", 90.00),
                new Book("The Mythical Man-Month", "Frederick Brooks Jr.", 53.00),
                new Book("Sapiens: De animales a dioses", "Yuval Noah Harari", 39.00),
                new Book("El hombre en busca de sentido", "Viktor Frankl", 21.00),
                new Book("Breve historia del tiempo", "Stephen Hawking", 33.50),
                new Book("Cosmos", "Carl Sagan", 37.00),
                new Book("El arte de la guerra", "Sun Tzu", 14.50),
                new Book("La casa de los espíritus", "Isabel Allende", 36.00),
                new Book("Pedro Páramo", "Juan Rulfo", 20.50),
                new Book("Rayuela", "Julio Cortázar", 32.99),
                new Book("La ciudad y los perros", "Mario Vargas Llosa", 35.50),
                new Book("El Alquimista", "Paulo Coelho", 29.99),
                new Book("Los juegos del hambre", "Suzanne Collins", 27.80));
        new Book("Crónica de una muerte anunciada", "Gabriel García Márquez", 29.50);

        // Mostrar todos los libros (forEach + Consumer)
        System.out.println("\n--- Mostrar todos los libros ---\n");
        books.stream()
                .forEach(book -> System.out.println(book));

        // Alternativa para mostrar todos los libros
        System.out.println("\n--- Alternativa para mostrar todos los libros ---\n");
        books.stream()
                .forEach(System.out::println);

        // Filtrar libros que cuesten más de $50 (filter + Predicate)
        System.out.println("\n--- Filtrar libros que cuesten más de $50 ---\n");
        books.stream()
                .filter(book -> book.getPrice() > 50)
                .forEach(System.out::println);

        // Obtener solo los títulos en mayúsculas (map + Function)
        System.out.println("\n--- Obtener solo los títulos en mayúsculas ---\n");
        books.stream()
                .map(book -> book.getTitle().toUpperCase())
                .forEach(System.out::println);

        // Recopilar libros baratos (collect + Predicate + Collectors)
        System.out.println("\n--- Recopilar libros baratos ---\n");
        List<Book> cheapBooks = books.stream()
                .filter(book -> book.getPrice() < 50)
                .collect(Collectors.toList());

        cheapBooks.forEach(System.out::println);

        // Obtener el precio total de todos los libros (reduce + BinaryOperator)
        System.out.println("\n--- Obtener el precio total de todos los libros ---\n");
        double totalPrice = books.stream()
                .map(Book::getPrice)
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("Total: $" + totalPrice);

        // ¿Hay algún libro de “Robert C. Martin”? (anyMatch + Predicate)
        System.out.println("\n--- ¿Hay algún libro de “Robert C. Martin”? ---\n");
        boolean hasMartin = books.stream()
                .anyMatch(book -> book.getAuthor().equals("Robert C. Martin"));

        System.out.println("¿Hay libro de Martin? \n" + hasMartin);

        // Eliminar duplicados por título (distinct + Comparator)
        System.out.println("\n--- Eliminar duplicados por título ---\n");
        List<String> titles = books.stream()
                .map(Book::getTitle)
                .distinct()
                .collect(Collectors.toList());

        titles.forEach(System.out::println);

        // Limitar y saltar libros (limit + skip)
        System.out.println("\n--- Limitar y saltar libros ---");
        // Mostrar los dos primeros libros
        System.out.println("\n--- Mostrar los dos primeros libros ---\n");
        books.stream()
                .limit(2)
                .forEach(System.out::println);

        // Omitir los dos primeros libros
        System.out.println("\n--- Omitir los dos primeros libros ---\n");
        books.stream()
                .skip(2)
                .forEach(System.out::println);

        // Ordenar por precio (sorted + Comparator)
        System.out.println("\n--- Ordenar por precio ---\n");
        books.stream()
                .sorted(Comparator.comparing(Book::getPrice))
                .forEach(System.out::println);

        // Evaluación
        // 1. ¿Qué operador usarías para transformar una lista de títulos a mayúsculas?
        System.out.println("\n--- Evaluación ---\n");
        System.out.println("--- 1. Títulos en Mayúsculas (map) ---\n");
        List<String> titulosEnMayusculas = books.stream()
                .map(Book::getTitle)
                .map(String::toUpperCase)
                .toList();

        titulosEnMayusculas.forEach(System.out::println);

        // 2. ¿Cómo verificarías si todos los libros cuestan menos de $100?
        System.out.println("\n--- 2. ¿Todos los libros cuestan menos de $100? (allMatch) ---\n");
        boolean todosMenosDe100 = books.stream()
                .allMatch(book -> book.getPrice() < 100.00);

        System.out
                .println(todosMenosDe100 ? "Sí, todos cuestan menos de $100." : "No, no todos cuestan menos de $100.");

        // 3. Escribe una expresión lambda que retorne true si el autor es "Gabriel García Márquez".
        System.out.println("\n--- 3. Libros de Gabriel García Márquez (filter) ---\n");
        List<Book> librosDeGabo = books.stream()
                .filter(book -> book.getAuthor().equals("Gabriel García Márquez"))
                .toList();

        librosDeGabo.forEach(System.out::println);
    }

}
