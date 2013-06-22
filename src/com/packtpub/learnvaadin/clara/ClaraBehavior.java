package com.packtpub.learnvaadin.clara;

import org.vaadin.teemu.clara.binder.annotation.UiDataSource;
import org.vaadin.teemu.clara.binder.annotation.UiHandler;

import com.vaadin.data.Property;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

public class ClaraBehavior {

	@UiHandler("submitButton")
	public void handleSubmitButtonClick(ClickEvent event) {

		Notification.show("You're authenticated into Twaattin");
	}

	@UiDataSource("pin")
	public Property<String> getLabelProperty() {

		return new ObjectProperty<String>("1111", String.class);
	}
}
