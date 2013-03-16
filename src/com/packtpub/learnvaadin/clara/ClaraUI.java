package com.packtpub.learnvaadin.clara;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.vaadin.teemu.clara.Clara;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServletRequest;
import com.vaadin.ui.Component;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class ClaraUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		HttpServletRequest httpRequest = ((VaadinServletRequest) request).getHttpServletRequest();

		InputStream xml = httpRequest.getServletContext().getResourceAsStream("/WEB-INF/twaattin.xml");

		Component component = Clara.create(xml, new ClaraBehavior());

		Link link = (Link) Clara.findComponentById(component, "twitterLink");

		link.setResource(new ExternalResource("https://twitter.com/learnvaadin"));

		setContent(component);
	}
}