package model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import controller.Parameters;

public class ChartingModel {

	public void createChart(Parameters parameters) {
		
		StringBuilder createdUrl = new StringBuilder();
		createdUrl.append("http://chart.finance.yahoo.com/z?");
		
		// companySymbol details
		try {
			createdUrl.append(String.format("s=%s", URLEncoder.encode(parameters.getCompanySymbol() , "UTF8")));
			createdUrl.append("&");
			
			// timeDuration details
			createdUrl.append(String.format("t=%s", URLEncoder.encode(parameters.getTimeDuration() , "UTF8")));
			createdUrl.append("&");
			
			// chartType details
			createdUrl.append(String.format("q=%s", URLEncoder.encode(parameters.getChartType() , "UTF8")));

			java.awt.Desktop.getDesktop().browse(java.net.URI.create(createdUrl.toString()));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
