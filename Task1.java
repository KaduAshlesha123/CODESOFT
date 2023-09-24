import java.util.Scanner;

class Task1{
    int number;
    int userNo;
    void GuessTheNum(){
        number= 1 + (int)(100* Math.random());
        //System.out.println(number);
        Scanner sc=new Scanner(System.in);
        int count=5;
        System.out.println("Lets play ");
        System.out.println("you have to guess the number correct \n you have 5 chances to guess the correct number");
       for(int i=0;i<5;i++){
        System.out.println(" Remaining chances "+count);
            do{
                System.out.println("Enter number between 1 - 99");
                userNo=sc.nextInt();
            }while(userNo < 0 || userNo >100);
            
            if(userNo == number){
                System.out.println("Congratulations !!! \n You win");
                break;
            }else if (userNo <number){
                System.out.println("Low");
            }else{
                System.out.println("High");
            }

           count--;
        }
            
    }

  public static void main(String[] args) {
    Task1 obj=new Task1();
    obj.GuessTheNum();
  }
}