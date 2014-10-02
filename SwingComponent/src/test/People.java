package test;

public class People {

	private int peopleId;
	private String peopleName;
	
	public People(){
		
	}

	/**
	 * @return the peopleId
	 */
	public int getPeopleId() {
		return peopleId;
	}

	/**
	 * @param peopleId the peopleId to set
	 */
	public void setPeopleId(int peopleId) {
		this.peopleId = peopleId;
	}

	/**
	 * @return the peopleName
	 */
	public String getPeopleName() {
		return peopleName;
	}

	/**
	 * @param peopleName the peopleName to set
	 */
	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getPeopleName();
	}
	
}
