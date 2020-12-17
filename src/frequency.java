import java.util.Scanner;

public class frequency {

    private String text;
    private int countAnd;
    private int countAn;
    private int len;

    private void frequency(){
        this.text = "";
        this.countAnd = 0;
        this.countAn = 0;
        this.len = 0;
    }

    private void accept(String s){
        this.text = s;
        this.len = s.length();
    }

    private void checkAnFreq(){
        for (String word:this.text.split(" ")){
            if(word.equals("an")){
                this.countAn = this.countAn + 1;
            }
        }
    }

    private void checkAndFreq(){
        for (String word:this.text.split(" ")){
            if(word.equals("and")){
                this.countAnd = this.countAnd + 1;
            }
        }
    }

    private void display(){
        System.out.println("Frequency of An: "+this.countAn);
        System.out.println("Frequency of And: "+this.countAnd);
    }

    public static void main(String args[]){

        System.out.println("Enter sentence: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        frequency frequency = new frequency();
        frequency.accept(s);
        frequency.checkAndFreq();
        frequency.checkAnFreq();
        frequency.display();
        in.close();
    }

}

