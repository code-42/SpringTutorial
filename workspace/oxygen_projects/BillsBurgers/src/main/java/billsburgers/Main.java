package billsburgers;

public class Main {

	public static void main(String[] args) {
		
        double cheezePrice = .25;
        double ketchupPrice = .25;
        double mustardPrice = .25;
        double lettucePrice = .25;
        double picklesPrice = .25;
        double baconPrice = 1.380;
        double mushroomsPrice = 10.00;

        Hamburger basicBurger = new Hamburger("Bill's Basic Burger", "ham", "wheat", 5.00);
        basicBurger.addItem(new AdditionalItem("cheeze", cheezePrice));
        basicBurger.addItem(new AdditionalItem("bacon", baconPrice));
        basicBurger.addItem(new AdditionalItem("mushrooms", mushroomsPrice));

        System.out.println("Here's your " + basicBurger.getName());
        
//        System.out.println(basicBurger.getOrder() + "\nTotal price is $" +
//        basicBurger.getTotal());

	}

}
