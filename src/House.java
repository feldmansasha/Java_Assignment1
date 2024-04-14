/*
 * @author Alex Feldman
 * @student id: 200544581
 * @since: 2024-09-24
 * */
public class House {
    public double area;
    protected int rooms;
    private boolean forSale;

    public double getArea() {
        return area;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isForSale() {
        return forSale;
    }

    public House(){}

    public House(double area, int rooms, boolean forSale) {
        this.area = area;
        this.rooms = rooms;
        this.forSale = forSale;
    }
    public House(double area, boolean forSale, int rooms){
        this.area = area;
        this.rooms = rooms;
        this.forSale = forSale;
    }
    public House(int rooms, boolean forSale, double area){
        this.area = area;
        this.rooms = rooms;
        this.forSale = forSale;
    }
    public House(int rooms, double area, boolean forSale){
        this.area = area;
        this.rooms = rooms;
        this.forSale = forSale;
    }
    public House(boolean forSale, int rooms, double area){
        this.area=area;
        this.rooms=rooms;
        this.forSale=forSale;
    }
    public House(boolean forSale, double area, int rooms){
        this.area=area;
        this.rooms=rooms;
        this.forSale=forSale;
    }

}
