package javaapplication8;

import java.util.Scanner;

public class Driver {
     
    static char start(char in){
        switch(in){
            case 'a':
                return 'A';
            case 'k':
                return 'B';
            case 'u':
                return 'C';
            default:
                return 'X';
        }
    }
    
    static Boolean second(char[] in, char state){
        int i = 1;
        while( in[i] != ' ' ){
            switch(state){
                case 'A':{
                    switch(in[i]){
                        case 'k':
                            state = 'D';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                }
                case 'B':
                    switch(in[i]){
                        case 'a':
                            state = 'E';
                            break;
                        case 'i':
                            state = 'F';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'C':
                    switch(in[i]){
                        case 'e':
                            state = 'G';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'D':
                    switch(in[i]){
                        case 'u':
                            state = 'P';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'E':
                    switch(in[i]){
                        case 'm':
                            state = 'D';
                            break;
                        case 'l':
                            state = 'I';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'F':
                    switch(in[i]){
                        case 't':
                            state = 'J';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'G':
                    switch(in[i]){
                        case 'r':
                            state = 'K';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'H':
                    switch(in[i]){
                        case ' ':
                            state = 'Q';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'I':
                    switch(in[i]){
                        case 'i':
                            state = 'l';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'J':
                    switch(in[i]){
                        case 'a':
                            state = 'P';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'K':
                    switch(in[i]){
                        case 'e':
                            state = 'N';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'L':
                    switch(in[i]){
                        case 'a':
                            state = 'O';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'M':
                    switch(in[i]){
                        case ' ':
                            state = 'Q';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'N':
                    switch(in[i]){
                        case 'k':
                            state = 'J';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'O':
                    switch(in[i]){
                        case 'n':
                            state = 'P';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                    
                case 'P':
                    state = 'X';
                    break;            
                    
                case 'X':
                    state = 'X';
                    break;
            }
            i++;
        }
        
        if(state == 'P')
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukan subject : ");
        String input = "aku ";
        
        char[] c = input.toCharArray();
        
        Boolean t = second( c, start(c[0]));
        
        System.err.println( t );
    }
}