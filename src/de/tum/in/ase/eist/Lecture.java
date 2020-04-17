package de.tum.in.ase.eist;

public class Lecture {

	private String topic;

	public Lecture(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void hold() {
		System.out.println("Holding a lecture about: " + topic);
	}

}
