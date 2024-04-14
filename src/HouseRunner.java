/*
 * @author Alex Feldman
 * @student id: 200544581
 * @since: 2024-09-24
 * */

public class HouseRunner {
    public static void main(String[] args) {
        House first=new House(true, 45.4, 3);
        House second=new House(2, false, 100.8);
        House third=new House(65.4, 5, true);

        System.out.println("Area of 1 house: "+first.area);
        System.out.println("Number of rooms in 1 house: "+first.rooms);
        System.out.println("Is this house for sale: "+first.isForSale());

        System.out.println("Area of 2 house: "+second.area);
        System.out.println("Number of rooms in 2 house: "+second.rooms);
        System.out.println("Is this house for sale: "+second.isForSale());;

        System.out.println("Area of 3 house:"+third.area);
        System.out.println("Number of rooms in 3 house: "+third.rooms);
        System.out.println("Is this house for sale: "+third.isForSale());
    }
}
