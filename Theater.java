class Theater {
public static void main(String[] args){

String name="PVR CINEMAS";
String manager="ARJUN";
String address="Forum Mall";
String[] screens={"Screen1","Screen2","Screen3","IMAX"};
String[] staff={"Ravi","Manoj","Deepak"};

System.out.println("*********************************************");

System.out.println("THE THEATER INFO : ");
System.out.println("THE MANAGER NAME : "+manager);
System.out.println("THE ADDRESS : "+address);

for(String screen:screens){
System.out.println("THE SCREENS ARE: "+screen);
}

for(String s:staff){
System.out.print("THE STAFF ARE: "+s);
}

System.out.println("\n*********************************************");

}
}
