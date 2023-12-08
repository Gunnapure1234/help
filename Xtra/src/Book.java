import java.util.ArrayList;

import java.util.Scanner;

public class Book {

	    private String isbn;
	    private double price;
	    private String authorName;
	    private int quantity;

	    public Book(String isbn, double price, String authorName, int quantity) {
	        this.isbn = isbn;
	        this.price = price;
	        this.authorName = authorName;
	        this.quantity = quantity;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getAuthorName() {
	        return authorName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    @Override
	    public String toString() {
	        return "ISBN: " + isbn + ", Price: " + price + ", Author: " + authorName + ", Quantity: " + quantity;
	    }
	}

	public class LibraryManagement {
	    public static void main(String[] args) {
	        ArrayList<Book> library = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        int choice;

	        do {
	            System.out.println("\nLibrary Management System Menu:");
	            System.out.println("1. Add a new book");
	            System.out.println("2. Display all books");
	            System.out.println("3. Delete a book by ISBN");
	            System.out.println("4. Check if a book exists by ISBN");
	            System.out.println("5. Delete all books");
	            System.out.println("6. Display the number of books");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ISBN: ");
	                    String isbn = scanner.nextLine();
	                    System.out.print("Enter Price: ");
	                    double price = scanner.nextDouble();
	                    scanner.nextLine();
	                    System.out.print("Enter Author Name: ");
	                    String authorName = scanner.nextLine();
	                    System.out.print("Enter Quantity: ");
	                    int quantity = scanner.nextInt();
	                    scanner.nextLine();
	                    Book newBook = new Book(isbn, price, authorName, quantity);
	                    library.add(newBook);
	                    System.out.println("Book added to the library.");
	                    break;

	                case 2:
	                    if (library.isEmpty()) {
	                        System.out.println("The library is empty.");
	                    } else {
	                        System.out.println("Books in the library:");
	                        for (Book book : library) {
	                            System.out.println(book);
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter ISBN to delete: ");
	                    String isbnToDelete = scanner.nextLine();
	                    for (int i = 0; i < library.size(); i++) {
	                        if (library.get(i).getIsbn().equals(isbnToDelete)) {
	                            library.remove(i);
	                            System.out.println("Book deleted.");
	                            break;
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter ISBN to check: ");
	                    String isbnToCheck = scanner.nextLine();
	                    boolean found = false;
	                    for (Book book : library) {
	                        if (book.getIsbn().equals(isbnToCheck)) {
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (found) {
	                        System.out.println("Book exists in the library.");
	                    } else {
	                        System.out.println("Book not found in the library.");
	                    }
	                    break;

	                case 5:
	                    library.clear();
	                    System.out.println("All books deleted from the library.");
	                    break;

	                case 6:
	                    System.out.println("Number of books in the library: " + library.size());
	                    break;

	                case 7:
	                    System.out.println("Exiting the Library Management System.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }

	        } while (choice != 7);

	        scanner.close();
	    }
	}


