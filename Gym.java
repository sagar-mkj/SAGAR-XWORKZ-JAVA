class Gym {
public static void main(String[] args){

String name="POWER HOUSE GYM";
String owner="RAHUL";
String address="Mysore Road";
String[] branches={"Banashankari","Jayanagar","BTM","Vijayanagar"};
String[] trainers={"Rohit","Amit","Kiran"};

System.out.println("*********************************************");

System.out.println("THE GYM INFO : ");
System.out.println("THE OWNER NAME : "+owner);
System.out.println("THE ADDRESS : "+address);

for(String branch:branches){
System.out.println("THE BRANCHES ARE: "+branch);
}

for(String trainer:trainers){
System.out.print("THE TRAINERS ARE: "+trainer);
}

System.out.println("\n*********************************************");

}
}
