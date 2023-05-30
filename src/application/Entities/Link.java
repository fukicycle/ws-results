package application.Entities;

public class Link {
	public String rel;
	public String href;
	public Object content_type;
	public Object description;

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Object getContent_type() {
		return content_type;
	}

	public void setContent_type(Object content_type) {
		this.content_type = content_type;
	}

	public Object getDescription() {
		return description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}
}
