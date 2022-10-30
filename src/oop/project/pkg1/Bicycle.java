package oop.project.pkg1;

public class Bicycle
{
	private String ownerName;

	private String tagNo;
	public Bicycle(){
		tagNo = " ";
		ownerName = "Unknown";
	}
	public Bicycle(String tag, String name) {
		tagNo = tag;
		ownerName = name;
	}

	public String getTagNo(){
		return tagNo;
	}
	public String getOwnerName(){
	    return ownerName;
	}

	public void setTagNo (String tag){
		tagNo = tag;
	}
	public void setOwnerName (String name) {
		ownerName = name;
	}
}
