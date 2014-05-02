//This is factorial Calculator that 
//calclates facotiral of any number less than 1000

public class FactorialCalculator {

	public static void main(String[] args) {
		FactorialView view = new FactorialView();
		Factorial model = new Factorial();

		FactorialController controller = new FactorialController(model, view);

	}
}
