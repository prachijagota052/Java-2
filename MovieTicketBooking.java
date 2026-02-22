import java.util.Scanner;
class Movie {
    String MovieName;
    int availableSeats;
    Movie(String MovieName, int availableSeats) {
        this.MovieName = MovieName;
        this.availableSeats = availableSeats;
    }
    void bookTicket(int seats) {
        if (this.availableSeats<seats) {
            throw new SeatNotAvailableException("Enough seats are not available");
        }
        else {
            this.availableSeats -= seats;
            System.out.println("Ticket booked successfully for " + seats + "seats. ") ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int movieChoice; // Declare movieChoice outside the loop to use it in the while condition
        Movie movie1 = new Movie("Inception", 100);
        Movie movie2 = new Movie("Interstellar", 50);
        do {

        System.out.println("Which movie do you want to book tickets for?");
        System.out.println("1. Inception");
        System.out.println("2. Interstellar");  
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1 or 2 or 3): ");
        movieChoice = sc.nextInt();
        
        switch (movieChoice) {
            case 1 -> {
                System.out.println("You have selected Inception. Available seats: " + movie1.availableSeats);
                System.out.println("Enter the number of seats to book:");
                int seats1 = sc.nextInt();
                try {
                    movie1.bookTicket(seats1);
                } catch (SeatNotAvailableException e) {
                    System.out.println(e.getMessage());
                }
            }
            case 2 -> {
                System.out.println("You have selected Interstellar. Available seats: " + movie2.availableSeats);
                System.out.println("Enter the number of seats to book:");
                int seats2 = sc.nextInt();
                try {
                    movie2.bookTicket(seats2);
                } catch (SeatNotAvailableException e) {
                    System.out.println(e.getMessage());
                }
            }
            case 3 -> {System.out.println("Exiting the booking system. Thank you!");}
            default -> System.out.println("Invalid choice. Please select 1 or 2 or 3");
        }
    }while(movieChoice!=3);
    }
}
class SeatNotAvailableException extends RuntimeException {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}

