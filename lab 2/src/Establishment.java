/*public class Establishment {
    String name;
    String adress;
    static int count = 0;

    public Establishment(String name, String adress){
        count++;
        this.name = name;
        this.adress = adress;
    }

    public void counter(){
        System.out.printf("Зарегестрировано предприятий: %s", count);
    }
}*/


abstract class Establishment {
    private String name;
    private String adress;
    private String contactNumber;

    public Establishment(){}

    public Establishment(String name, String adress, String contactNumber) {
        this.name = name;
        this.adress = adress;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public abstract void info();
}


class Cafe extends Establishment {
    private String menu;
    private int placeAmount;
    private static int counter = 0;

    public Cafe(){
        // todo
    }
    public Cafe(String name, String adress, String contactNumber, String menu, int placeAmount) {
        super(name, adress, contactNumber);
        this.menu = menu;
        this.placeAmount = placeAmount;
        counter ++;
    }

    public int getCount(){
        return counter;
    }

    @Override
    public void info() {
        System.out.println("Кафе: " + getName() + ", Адрес: " + getAdress() + ", Меню: " + menu);
    }
}


class Shop extends Establishment {
    private String assortment;
    private int productAmount;

    public Shop(){
        // todo
    }
    public Shop(String name, String adress, String contactNumber, String assortment, int productAmount) {
        super(name, adress, contactNumber);
        this.assortment = assortment;
        this.productAmount = productAmount;
    }

    @Override
    public void info() {
        System.out.println("Магазин: " + getName() + ", Адрес: " + getAdress() + ", Ассортимент: " + assortment);
    }
}


class Library extends Establishment {
    private String catalog;
    private int bookAmount;

    public Library(){
        // todo
    }
    public Library(String name, String adress, String contactNumber, String catalog, int bookAmount) {
        super(name, adress, contactNumber);
        this.catalog = catalog;
        this.bookAmount = bookAmount;
    }

    @Override
    public void info() {
        System.out.println("Библиотека: " + getName() + ", Адрес: " + getAdress() + ", Каталог: " + catalog);
    }
}