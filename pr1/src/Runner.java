import by.gsu.mslab.BusinessTrip;

public class Runner {

    public static void main(String[] args) {

        BusinessTrip[] businessTrips = {
                new BusinessTrip("Egor Glushak", 6321, 7),
                new BusinessTrip("Pasha Vinogradov", 5405, 1),
                new BusinessTrip("Andrey Petrov", 3455, 8),
                new BusinessTrip("Vasya Zaytsev", 5434, 4),
                new BusinessTrip("Vladislav Shkrabkov", 2105, 5),
                new BusinessTrip("Sasha Komegunov", 9453, 9),
                new BusinessTrip("Anton Ivanov", 5324, 5),
                new BusinessTrip()
        };

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null)
                System.out.println(businessTrip.show());
        }

        businessTrips[7].setTransporationExpenses(1000);
        System.out.println("Duration = " + (businessTrips[0].getNumberOfDays() + businessTrips[1].getNumberOfDays()));
        for(BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }
    }
}
