package Cadena;

public class Main {
    public static void main(String[] args){
        String firstWord="parangaricutirimicuaro";
        int l = firstWord.length();
        System.out.println(Cadena(firstWord,l-1));
    }
    static String Cadena(String word,int length){
        if(length==0) return String.valueOf(word.charAt(length));
        return word.charAt(length) + Cadena(word,length-1);
    }
}

