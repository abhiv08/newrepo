class Pswd{
  private int password;
  private void setPassword(int password){
       this.password=password;
    }
	 
}
class Encapsulation{
      public static void main(String...args){
       Pswd pswd = new Pswd();
       pswd.password=1234; 
      }
}
