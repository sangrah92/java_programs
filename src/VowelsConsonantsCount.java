import java.util.Scanner;

public class VowelsConsonantsCount {

    public static boolean isVowel( char ch ){
        String vowel="aeiouAEIOU";
        return vowel.indexOf(ch)>=0;
    }
    public static boolean isConsonant( char ch ){
        return Character.isLetter(ch) && !isVowel(ch);
    }
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.print( "INPUT: ");
        String input = sc.nextLine();
        char ch=input.charAt(input.length()-1);
        if( ch!='.' && ch!='?'){
            System.out.println("OUTPUT:Invalid Input");
        }else{
            input=input+" ";
            String word="";
            int vowels=0, consonants=0;
            String ans="",out=String.format("%-16s\t%s\t%s\n","WORD","VOWELS","CONSONANTS");
            for( int i=0; i<input.length()-1;i++ ){
                ch=input.charAt(i);
                if(ch==' ' || ch==',' || ch=='?' || ch=='.' || ch==';' ){
                    out+=String.format("%-16s\t%2d\t%2d\n",word,vowels,consonants);
                    ans=ans+word+ " ";
                    word="";
                    vowels=consonants=0;
                }else{
                    if(isVowel(ch)) vowels++;
                    if(isConsonant(ch)) consonants++;
                    if(word.equals("")) ch=Character.toUpperCase(ch);
                    word = word+ch;
                }
            }
            ans=ans.trim();
            System.out.println("OUTPUT:\n"+ans+"\n"+out);
        }
        sc.close();
    }

}
