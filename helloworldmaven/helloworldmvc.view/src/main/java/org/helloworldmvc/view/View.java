package org.helloworldmvc.view;

import org.helloworldmvc.contract.IView;

public class View implements IView {
	
	public String displayMessage(String message) {
		return message;
	}
}
