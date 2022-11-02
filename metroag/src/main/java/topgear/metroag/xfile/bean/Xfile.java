package topgear.metroag.xfile.bean;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Xfile {

	private int id;
	@JsonProperty("interface")
	private Interface fileInterface;
	private int priority;
	private boolean active;
	private String from;
	private String to;
	private long expected;
	private String relation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Xfile [id=" + id + ", fileInterface=" + fileInterface + ", priority=" + priority + ", active=" + active
				+ ", from=" + LocalTime.parse(from) + ", to=" + LocalTime.parse(to) + ", expected=" + expected + ", relation=" + relation + "]";
	}

	public Interface getFileInterface() {
		return fileInterface;
	}

	public void setFileInterface(Interface fileInterface) {
		this.fileInterface = fileInterface;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public long getExpected() {
		return expected;
	}

	public void setExpected(long expected) {
		this.expected = expected;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	


}
