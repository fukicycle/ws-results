package application.Entities;

public class Competitor {
	public String first_name;
	public String last_name;
	public int person_id;
	public Image image;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
