package topgear.metroag.xfile.bean;

public enum Status {

	SUCCESS("Success"), ERROR("Error");
	
	String value;

	 Status(String s) {
		this.value=s;
	}

}
