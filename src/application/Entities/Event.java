package application.Entities;

import java.util.ArrayList;

public class Event {
	public int id;
	public String name;
	public String start_date;
	public String end_date;
	public String code;
	public WsEntity ws_entity;
	public ArrayList<Object> links;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public WsEntity getWs_entity() {
		return ws_entity;
	}

	public void setWs_entity(WsEntity ws_entity) {
		this.ws_entity = ws_entity;
	}

	public ArrayList<Object> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Object> links) {
		this.links = links;
	}
}
