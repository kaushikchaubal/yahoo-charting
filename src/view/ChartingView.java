package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChartingView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel companySymbolLabel = new JLabel("Company Symbol");
	private JTextField companySymbol = new JTextField(10);
	private JLabel timeDurationLabel = new JLabel("Time Duration");
	private JTextField timeDuration = new JTextField(10);
	private JLabel chartTypeLabel = new JLabel("Chart Type");
	private JTextField chartType = new JTextField(10);

	private JButton clearButton = new JButton("Clear");
	private JButton submitButton = new JButton("Submit");

	public ChartingView() {
		JPanel panel = new JPanel();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 200);

		GridLayout layout = new GridLayout(0,2);
        panel.setLayout(layout);
        
		panel.add(companySymbolLabel);
		panel.add(companySymbol);
		panel.add(timeDurationLabel);
		panel.add(timeDuration);
		panel.add(chartTypeLabel);
		panel.add(chartType);
		panel.add(clearButton);
		panel.add(submitButton);

		add(panel);
	}

	public String getCompanySymbol() {
		return companySymbol.getText();
	}
	
	public String getTimeDuration() {
		return timeDuration.getText();
	}
	
	public String getChartType() {
		return chartType.getText();
	}
	
	public void setCompanySymbol(String object) {
		companySymbol.setText("");
	}

	public void setTimeDuration(String object) {
		timeDuration.setText("");
	}

	public void setChartType(String object) {
		chartType.setText("");
	}

	public void addSubmitListener(ActionListener listenForCalculateButton) {
		submitButton.addActionListener(listenForCalculateButton);
	}
	
	public void addClearListener(ActionListener listenForClearButton) {
		clearButton.addActionListener(listenForClearButton);
	}
}
