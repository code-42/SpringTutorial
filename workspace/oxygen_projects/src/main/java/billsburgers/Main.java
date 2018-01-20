package billsburgers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Bill's Burgers");
		
        Hamburger basicBurger = new Hamburger("Bill's Basic Burger", "ham", "wheat", 5.00);

        System.out.println("Here's your " + basicBurger.getName());
	}
}
