class Theatre1{
public static void main (String[] args){


Theatre1 raja = new Theatre1 ();


int balance =raja.bookTicket(200);

System.out.println("After booking ticket : " +balance);



}
int bookTicket (int amount){

 int ticket_price =120;
 
 int sum = amount-ticket_price; 
 
 return sum;


}
}
