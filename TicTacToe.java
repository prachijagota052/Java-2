import java.util.ArrayList;
import java.util.Scanner;
class TicTacToe{
    static int chance=0;
    static ArrayList<String> list1=new ArrayList<>();
    static ArrayList<String> list2=new ArrayList<>();
    static ArrayList<String> list3=new ArrayList<>();
   
    public void figure(){
        for(int i=1;i<=3;i++){
            list1.add(String.valueOf(i));
        }
        for(int i=4;i<=6;i++){
            list2.add(String.valueOf(i));
        }
        for(int i=7;i<=9;i++){
            list3.add(String.valueOf(i));
        }
    }
    public void draw(){ 
        System.out.println(String.join("|", list1));
        System.out.println("-+-+-");
        System.out.println(String.join("|", list2));
        System.out.println("-+-+-");
        System.out.println(String.join("|", list3));


    }
    public void X(){
        System.out.println("Enter number where you want to put X");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(list1.contains(String.valueOf(num))){
            list1.set(list1.indexOf(String.valueOf(num)), "X");
        }
        else if(list2.contains(String.valueOf(num))){
            list2.set(list2.indexOf(String.valueOf(num)), "X");
        }
        else if(list3.contains(String.valueOf(num))){
            list3.set(list3.indexOf(String.valueOf(num)), "X");
                
        }
        else{
            System.out.println("Invalid input! Try again.");
            X();
        }
        draw();

    }
    public void O(){
        System.out.println("Enter number where you want to put O");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(list1.contains(String.valueOf(num))){
            list1.set(list1.indexOf(String.valueOf(num)), "O");
        }
        else if(list2.contains(String.valueOf(num))){
            list2.set(list2.indexOf(String.valueOf(num)), "O");
        }
        else if(list3.contains(String.valueOf(num))){
            list3.set(list3.indexOf(String.valueOf(num)), "O");
        }
        else{
            System.out.println("Invalid input! Try again.");
            O();
        }
        draw();

    }
    public void check(char player){
        if(chance<9)
        {
            if(list1.get(0).equals(String.valueOf(player)) && list1.get(1).equals(String.valueOf(player)) && list1.get(2).equals(String.valueOf(player)) 
            || list2.get(0).equals(String.valueOf(player)) && list2.get(1).equals(String.valueOf(player)) && list2.get(2).equals(String.valueOf(player)) 
            || list3.get(0).equals(String.valueOf(player)) && list3.get(1).equals(String.valueOf(player)) && list3.get(2).equals(String.valueOf(player)) 
            || list1.get(0).equals(String.valueOf(player)) && list2.get(0).equals(String.valueOf(player)) && list3.get(0).equals(String.valueOf(player)) 
            || list1.get(1).equals(String.valueOf(player)) && list2.get(1).equals(String.valueOf(player)) && list3.get(1).equals(String.valueOf(player)) 
            || list1.get(2).equals(String.valueOf(player)) && list2.get(2).equals(String.valueOf(player)) && list3.get(2).equals(String.valueOf(player)) 
            || list1.get(0).equals(String.valueOf(player)) && list2.get(1).equals(String.valueOf(player)) && list3.get(2).equals(String.valueOf(player)) 
            || list1.get(2).equals(String.valueOf(player)) && list2.get(1).equals(String.valueOf(player)) && list3.get(0).equals(String.valueOf(player))){
            chance=10;
            System.out.println("Player " + player + " wins!");
            }
        else if (chance==8){
                
            System.out.println("It's a draw!"); 
        }

        }
    }

    public static void main(String[] args) {
        TicTacToe game=new TicTacToe();
        game.figure();
        game.draw();
        while(true){
            if(chance>=9){
                System.out.println("Game over!");
                break;
            }
            else if(chance%2==0){
                System.out.println("Player X's turn");
                game.X();
                if(chance>=5){

                     game.check('X');
                }
                chance++;
                if(chance>=9){
                    System.out.println("Game over!");
                    break;
                }
            }
            else{
                System.out.println("Player O's turn");
                game.O();
                if(chance>=5){  
                    game.check('O');
                }
                chance++;
                if(chance>=9){
                System.out.println("Game over!");
                break;
            }
            }
            
        }
    }
}