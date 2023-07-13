class FaceBookTester{
public static void main(String socialMedia[]){
	
	
	
	boolean emailLoginSuccess=FaceBook.login("impana@gmail.com" ,"Impa@123");
	System.out.println(emailLoginSuccess);
	
	
	boolean phoneNumberLoginSuccess=FaceBook.login("84311134567L" ,"Impa&678");
	System.out.println(phoneNumberLoginSuccess);
}
}