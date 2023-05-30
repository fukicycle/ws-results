package application.Entities;

import java.util.ArrayList;

public class Member {
	public int id;
	public Name name;
	public Name1058 name_1058;
	public String code;
	public Flag flag;
	public ArrayList<Object> links;

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

	public Name1058 getName_1058() {
		return name_1058;
	}

	public void setName_1058(Name1058 name_1058) {
		this.name_1058 = name_1058;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}

	public ArrayList<Object> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Object> links) {
		this.links = links;
	}
}
