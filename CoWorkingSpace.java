class CoWorkingSpace {
public static void main(String[] args){

String name="HUSTLE HUB";
String founder="ARVIND";
String address="Indiranagar";
String[] branches={"Indiranagar","Koramangala","Whitefield"};
String[] facilities={"High Speed WiFi","Meeting Rooms","Private Cabins"};

System.out.println("*********************************************");

System.out.println("THE COWORKING SPACE INFO : ");
System.out.println("THE FOUNDER NAME : "+founder);
System.out.println("THE ADDRESS : "+address);

for(String branch:branches){
System.out.println("THE BRANCHES ARE: "+branch);
}

for(String facility:facilities){
System.out.print("THE FACILITIES ARE: "+facility);
}

System.out.println("\n*********************************************");

}
}
