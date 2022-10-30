package oop.project.pkg1;

public class BicycleRegistration
{

public static void main (String[] args) { 
Bicycle bike1, bike2, bike3;
String owner1, owner2, tagNo;

bike1 = new Bicycle(); 
bike1.setOwnerName("Adam Smith");

bike2 = new Bicycle(); 
bike2.setOwnerName("Ben Jones");

bike3 = new Bicycle();
bike3.setTagNo ("2004-134R");

owner1 = bike1.getOwnerName(); 
owner2 = bike2.getOwnerName();
tagNo = bike3.getTagNo();

System.out.println(owner1 + " owns a bicycle"); 
System.out.println(owner2+ " also owns a bicycle");
System.out.println("Tag No. is: " + tagNo);
System.out.println("Owner name: " + owner1);

 }
}
