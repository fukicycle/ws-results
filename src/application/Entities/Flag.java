package application.Entities;

import java.util.ArrayList;

public class Flag {
	public int id;
	public String thumbnail_hash;
	public String thumbnail;
	public ArrayList<Link> links;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getThumbnail_hash() {
		return thumbnail_hash;
	}

	public void setThumbnail_hash(String thumbnail_hash) {
		this.thumbnail_hash = thumbnail_hash;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public ArrayList<Link> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Link> links) {
		this.links = links;
	}
}
