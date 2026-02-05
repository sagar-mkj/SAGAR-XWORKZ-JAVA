class PostOffice {
public static void main(String[] args){

String name="INDIA POST";
String head="POST MASTER";
String address="Kolegala";
String[] branches={"Kolegala","Chamrajnagar","Yelandur","Kollegal HO"};
String[] employees={"Ramesh","Suresh","Mahesh"};

System.out.println("*********************************************");

System.out.println("THE POST OFFICE INFO : ");
System.out.println("THE HEAD NAME : "+head);
System.out.println("THE ADDRESS : "+address);

for(String branch:branches){
System.out.println("THE BRANCHES ARE: "+branch);
}

for(String emp:employees){
System.out.print("THE EMPLOYEES ARE: "+emp);
}

System.out.println("\n*********************************************");

}
}
