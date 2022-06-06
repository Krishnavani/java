import java.util.LinkedList;
class Main{
public static void main(String[]args){
LinkedList<String>languages=new LinkedList<>();
languages.add("java");
languages.add("Python");
languages.add("javascript");
languages.add("kotlin");
System.out.println("LinkedList:"+languages);
String str=languages.remove(3);
System.out.println("Removed Element:"+str);
System.out.println("Updated LinkedList:"+languages);
}
}