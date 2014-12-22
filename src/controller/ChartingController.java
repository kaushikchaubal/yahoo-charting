package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ChartingModel;
import view.ChartingView;

public class ChartingController {

	private ChartingView theView;
	private ChartingModel theModel;

	public ChartingController(ChartingView theView, ChartingModel theModel) {
		this.theView = theView;
		this.theModel = theModel;

		this.theView.addSubmitListener(new ChartingSubmitListener());
		this.theView.addClearListener(new ChartingClearListener());
	}

	class ChartingSubmitListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Parameters parameters = new Parameters();
			
			parameters.setCompanySymbol(theView.getCompanySymbol());
			parameters.setTimeDuration(theView.getTimeDuration());
			parameters.setChartType(theView.getChartType());
			
			theModel.createChart(parameters);
		}
	}

	
	class ChartingClearListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			theView.setCompanySymbol(null);
			theView.setTimeDuration(null);
			theView.setChartType(null);
		}
	}
}