package HomeWork1;

public class main {

    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("coffe", 250, 50);
        HotDrink milk = new HotDrink("milk", 250, 50);

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.addDrink(coffee);
        vendingMachine.addDrink(milk);

        System.out.println((vendingMachine.getProduct("tea", 250, 50)));
        System.out.println(vendingMachine.getProduct(50).toString());




    }
}
