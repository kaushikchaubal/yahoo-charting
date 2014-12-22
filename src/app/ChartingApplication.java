package app;

import model.ChartingModel;
import view.ChartingView;
import controller.ChartingController;

public class ChartingApplication {

	public static void main(String[] args) {
		ChartingView theView = new ChartingView();
		ChartingModel theModel = new ChartingModel();
		new ChartingController(theView, theModel);

		theView.setVisible(true);
	}
}