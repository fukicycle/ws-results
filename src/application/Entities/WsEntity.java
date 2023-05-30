package application.Entities;

import java.util.ArrayList;

public class WsEntity {
	public int id;
	public Name name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public ArrayList<Object> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Object> links) {
		this.links = links;
	}

	public ArrayList<Object> links;
}
