class chatAngadi{

public static void main(){
 String chatNames[] = {"pani puri", "samosa", "Gobi"};
// invoke logic(methods)
System.out.println(" Main started");
System.out.println("==============================");
System.out.println("List of Chats are");
getchatsNames(chatNames);
System.out.println(" Main ended");





}
public static void getchatsNames(String chatNames[]){
System.out.println(" Inside getchatNames");
for(String chatName : chatNames ){
System.out.println(chatName);
}



}












}