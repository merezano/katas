<<<<<<< HEAD
public class ObjectMother {
    public static Customer customerWithOneOfEachRentalType(String name) {
        Customer result = customerWithOneNewReleaseAndOneRegular(name);
        result.addRental(new Rental(new Movie("Lion King", Movie.Type.CHILDREN), 3));
=======


import Customer;
import Movie;
import Rental;

public class ObjectMother {
    public static Customer customerWithOneOfEachRentalType(String name) {
        Customer result = customerWithOneNewReleaseAndOneRegular(name);
        result.addRental(new Rental(new Movie("Lion King", CHILDREN), 3));
>>>>>>> eedc9f581bd434bb657c835d02282ae0c7364bf0
        return result;
    }

    public static Customer customerWithOneNewReleaseAndOneRegular(String n) {
        Customer result = customerWithOneNewRelease(n);
<<<<<<< HEAD
        result.addRental(new Rental(new Movie("Scarface", Movie.Type.REGULAR), 3));
=======
        result.addRental(new Rental(new Movie("Scarface", REGULAR), 3));
>>>>>>> eedc9f581bd434bb657c835d02282ae0c7364bf0
        return result;
    }

    public static Customer customerWithOneNewRelease(String name) {
        Customer result = customerWithNoRentals(name);
<<<<<<< HEAD
        result.addRental(new Rental(new Movie("Godfather 4", Movie.Type.NEW_RELEASE), 3));
=======
        result.addRental(new Rental(new Movie("Godfather 4", NEW_RELEASE), 3));
>>>>>>> eedc9f581bd434bb657c835d02282ae0c7364bf0
        return result;
    }

    public static Customer customerWithNoRentals(String name) {
        return new Customer(name);
    }
}
