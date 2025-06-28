import java.util.Arrays;
import java.util.List;

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
        // books.stream()
        //         .forEach(book -> System.out.println(book));

        // Alternativa para mostrar todos los libros
        // books.stream()
        // .forEach(System.out::println);

        // Filtrar libros que cuesten más de $50 (filter + Predicate)
        books.stream()
                .filter(book -> book.getPrice() > 50)
                .forEach(System.out::println);
    }

}
