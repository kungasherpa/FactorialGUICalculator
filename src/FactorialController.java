import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialController implements ActionListener {

	private Factorial model;
	private FactorialView view;

	public FactorialController(Factorial model, FactorialView view) {
		this.model = model;
		this.view = view;

		view.addActionLisetner(this);
	}

	public void setFactorialNumber() {

		String num = view.getNumberField();

		int number = Integer.parseInt(num);

		model.setFactorialNumber(number);
	}

	public String getFactorialResult() {
		return model.getFactorialResult();
	}

	public void viewUpdate() {
		view.setResultField(getFactorialResult());
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (IsValid(view.getNumberField()) == 2) {
			view.displayErrorMessage();
			model.clearAll();
			view.clearAllField();
		} else if (IsValid(view.getNumberField()) == 1) {
			view.displayErrorMessage2();
			view.clearAllField();
		} else {
			model.clearAll();
			setFactorialNumber();
			model.calculate();
			viewUpdate();
		}

	}

	public int IsValid(String number) {
		int choice = 0;

		try {
			Integer.parseInt(number);

			if (Integer.parseInt(number) > 1000)
				choice = 1;
		} catch (NumberFormatException e) {
			choice = 2;
		}

		return choice;

	}

}
