package application.Entities;

import java.util.ArrayList;

public class Result {
	public int id;
	public ArrayList<Competitor> competitors;
	public Member member;
	public Medal medal;
	public double mark;
	public int position;
	public boolean best_of_nation;
	public boolean albert_vidal_award;
	public boolean published;
	public Skill skill;
	public ArrayList<Object> note_ids;
	public ArrayList<Object> links;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Competitor> getCompetitors() {
		return competitors;
	}

	public void setCompetitors(ArrayList<Competitor> competitors) {
		this.competitors = competitors;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Medal getMedal() {
		return medal;
	}

	public void setMedal(Medal medal) {
		this.medal = medal;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isBest_of_nation() {
		return best_of_nation;
	}

	public void setBest_of_nation(boolean best_of_nation) {
		this.best_of_nation = best_of_nation;
	}

	public boolean isAlbert_vidal_award() {
		return albert_vidal_award;
	}

	public void setAlbert_vidal_award(boolean albert_vidal_award) {
		this.albert_vidal_award = albert_vidal_award;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public ArrayList<Object> getNote_ids() {
		return note_ids;
	}

	public void setNote_ids(ArrayList<Object> note_ids) {
		this.note_ids = note_ids;
	}

	public ArrayList<Object> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Object> links) {
		this.links = links;
	}
}
