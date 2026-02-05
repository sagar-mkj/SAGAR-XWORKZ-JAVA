class GamingArena {
public static void main(String[] args){

String name="PIXEL ZONE";
String owner="ROHAN";
String address="BTM Layout";
String[] branches={"BTM","Jayanagar","HSR"};
String[] games={"PS5","PC Gaming","VR Games"};

System.out.println("*********************************************");

System.out.println("THE GAMING ARENA INFO : ");
System.out.println("THE OWNER NAME : "+owner);
System.out.println("THE ADDRESS : "+address);

for(String branch:branches){
System.out.println("THE BRANCHES ARE: "+branch);
}

for(String game:games){
System.out.print("THE GAMES AVAILABLE: "+game);
}

System.out.println("\n*********************************************");

}
}
