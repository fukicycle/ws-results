package application.Entities;

import java.util.ArrayList;

public class Skill {
	public int id;
	public Event event;
	public String type;
	public int base_id;
	public String number;
	public Name name;
	public ArrayList<Object> links;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBase_id() {
		return base_id;
	}

	public void setBase_id(int base_id) {
		this.base_id = base_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

}
