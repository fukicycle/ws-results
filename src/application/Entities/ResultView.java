package application.Entities;

public class ResultView {
	public int rank;
	public String medal;
	public String competitor;
	public Double result;
	public String competition;
	public String member;
	public String skill;

	public ResultView(int rank, String medal, String competitor, Double result, String competition, String member,
			String skill) {
		super();
		this.rank = rank;
		this.medal = medal;
		this.competitor = competitor;
		this.result = result;
		this.competition = competition;
		this.member = member;
		this.skill = skill;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getMedal() {
		return medal;
	}

	public void setMedal(String medal) {
		this.medal = medal;
	}

	public String getCompetitor() {
		return competitor;
	}

	public void setCompetitor(String competitor) {
		this.competitor = competitor;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public String getCompetition() {
		return competition;
	}

	public void setCompetition(String competition) {
		this.competition = competition;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
