package org.vaadin.jonatan.contexthelp;

import java.util.HashMap;

public class DefaultHelpProvider implements HelpProvider {

	private HashMap<String, String> helpHTML = new HashMap<String, String>();
	private HashMap<String, Placement> placements = new HashMap<String, Placement>();

	public String getHtmlForId(String id) {
		return helpHTML.get(id);
	}

	public Placement getPlacementForId(String id) {
		return placements.get(id);
	}

	public void addHelpForId(String id, String help) {
		helpHTML.put(id, help);
	}

	public void setPlacementOfId(String debugId, Placement placement) {
		placements.put(debugId, placement);
	}

}
