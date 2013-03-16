package com.packtpub.learnvaadin.clara;


import org.vaadin.teemu.clara.binder.annotation.UiHandler;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

public class ClaraBehavior {

	@UiHandler("submitButton")
	public void handleSubmitButtonClick(ClickEvent event) {

		Notification.show("You're authenticated into Twaattin");
	}
}
