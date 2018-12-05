package javaapplication8;

import java.util.Scanner;

public class TUBES {
    
    static boolean cekSubjek(String input){
        char[] in = input.toCharArray();
        int i = 0;
        char state = 'X';
        
        switch(in[i]){
            case 'a':
                state = 'A';
                break;
            case 'k':
                state = 'B';
                break;
            case 'm':
                state = 'C';
                break;
            default:
                state = 'X';
                break;
        }
        
        i++;
        
        while( in[i] != '\0' ){
            switch(state){
                case 'A':
                    switch(in[i]){
                        case 'k':
                            state = 'D';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
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
                    switch(in[i]){
                        case ' ':
                            state = 'P';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
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
    
    static boolean cekPredikat(String input){
        char[] in = input.toCharArray();
        
        char state = 'X';
        int i = 0;
        
        if( in[i] == 'm'){
            i++;
            state = 'A';
            while( in[i] != '\0' ){
                switch(state){
                    case 'A':
                        switch(in[i]){
                            case 'e':
                                state = 'D';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;
                    case 'B':
                        switch(in[i]){
                            case 'u':
                                state = 'F';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'C':
                        switch(in[i]){
                            case 'c':
                                state = 'G';
                                break;
                            case 'j':
                                state = 'B';
                                break;                            
                            default:
                                state = 'X';
                                break;
                        }    
                        break;                        
                    case 'D':
                        switch(in[i]){
                            case 'n':
                                state = 'C';
                                break;
                            case 'm':
                                state = 'H';
                                break;                            
                            case 'l':
                                state = 'E';
                                break;                            
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'E':
                        switch(in[i]){
                            case 'i':
                                state = 'I';
                                break;
                            default:
                                state = 'X';
                                break;
                        }    
                        break;                        
                    case 'F':
                        switch(in[i]){
                            case 'a':
                                state = 'J';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'G':
                        switch(in[i]){
                            case 'u':
                                state = 'K';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'H':
                        switch(in[i]){
                            case 'b':
                                state = 'L';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'I':
                        switch(in[i]){
                            case 'h':
                                state = 'M';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'J':
                        switch(in[i]){
                            case 'l':
                                state = 'Q';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'K':
                        switch(in[i]){
                            case 'r':
                                state = 'P';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'L':
                        switch(in[i]){
                            case 'e':
                                state = 'N';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'M':
                        switch(in[i]){
                            case 'a':
                                state = 'O';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'N':
                        switch(in[i]){
                            case 'l':
                                state = 'P';
                                break;
                            case 'r':
                                state = 'P';
                                break;                            
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'O':
                        switch(in[i]){
                            case 't':
                                state = 'Q';
                                break;
                            default:
                                state = 'X';
                                break;
                        }     
                        break;                        
                    case 'P':
                        switch(in[i]){
                            case 'i':
                                state = 'Q';
                                break;
                            default:
                                state = 'X';
                                break;
                        }
                        break;                        
                    case 'Q':
                        switch(in[i]){
                            case ' ':
                                state = 'Q';
                                break;                               
                            default:
                                state = 'X';
                                break;
                        }      
                        break;                        
                    case 'X':
                        switch(in[i]){
                            default:
                                state = 'X';
                                break;
                        }  
                        break;                        
                }   
                i++;
            }
        }
        
        if(state == 'Q')
            return true;
        else
            return false;        
    }  
    
    static boolean cekObjek(String input){
        char[] in = input.toCharArray();
        int i = 0;
        char state = 'X';
        
        switch(in[i]){
            case 's':
                state = 'A';
                break;
            case 'b':
                state = 'C';
                break;
            case 'm':
                state = 'C';
                break;
            default:
                state = 'X';
                break;
        }
        
        i++;
        
        while( in[i] != ' ' ){
            switch(state){
                case 'A':
                    switch(in[i]){
                        case 'e':
                            state = 'B';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                    
                case 'B':
                    switch(in[i]){
                        case 'p':
                            state = 'C';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                    
                case 'C':
                    switch(in[i]){
                        case 'a':
                            state = 'D';
                            break;
                        case 'u':
                            state = 'F';
                            break;
                        case 'i':
                            state = 'D';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                    
                case 'D':
                    switch(in[i]){
                        case 't':
                            state = 'E';
                            break;
                        case 'j':
                            state = 'E';
                            break;
                        case 'k':
                            state = 'C';
                            break;
                        case 'n':
                            state = 'G';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                    
                case 'E':
                    switch(in[i]){
                        case 'u':
                            state = 'J';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                    
                case 'F':
                    switch(in[i]){
                        case 'k':
                            state = 'E';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                    
                case 'G':
                    switch(in[i]){
                        case 'a':
                            state = 'H';
                            break;
                        case 'u':
                            state = 'I';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                    
                case 'H':
                    switch(in[i]){
                        case 'n':
                            state = 'J';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                    
                case 'I':
                    switch(in[i]){
                        case 'm':
                            state = 'G';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;      
                    
                case 'J':
                    switch(in[i]){
                        case ' ':
                            state = 'J';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;            
                    
                case 'X':
                    state = 'X';
                    break;
            }
            i++;
        }
        
        if(state == 'J')
            return true;
        else
            return false;
    }    
    
    static boolean cekKeterangan(String input){
        char[] in = input.toCharArray();
        int i = 0;
        char state = 'X';
        
        switch(in[i]){
            case 'b':
                state = 'A';
                break;
            case 'k':
                state = 'B';
                break;
            case 'l':
                state = 'C';
                break;
            case 'n':
                state = 'D';
            case 's':
                state = 'E';
            default:
                state = 'X';
                break;
        }
        
        i++;
        
        while( in[i] != ' ' ){
            switch(state){
                case 'A':
                    switch(in[i]){
                        case 'e':
                            state = 'F';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'B':
                    switch(in[i]){
                        case 'e':
                            state = 'G';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'C':
                    switch(in[i]){
                        case 'u':
                            state = 'H';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'D':
                    switch(in[i]){
                        case 'a':
                            state = 'I';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'E':
                    switch(in[i]){
                        case 'e':
                            state = 'J';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'F':
                    switch(in[i]){
                        case 's':
                            state = 'K';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'G':
                    switch(in[i]){
                        case 'm':
                            state = 'L';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'H':
                    switch(in[i]){
                        case 's':
                            state = 'M';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'I':
                    switch(in[i]){
                        case 'n':
                            state = 'N';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'J':
                    switch(in[i]){
                        case 'k':
                            state = 'O';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'K':
                    switch(in[i]){
                        case 'o':
                            state = 'P';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'L':
                    switch(in[i]){
                        case 'a':
                            state = 'Q';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'M':
                    switch(in[i]){
                        case 'a':
                            state = 'Z';
                            break;
                        default:
                            state = 'X';
                            break;
                    }             
                    break;
                case 'N':
                    switch(in[i]){
                        case 't':
                            state = 'R';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'O':
                    switch(in[i]){
                        case 'a':
                            state = 'S';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'P':
                    switch(in[i]){
                        case 'k':
                            state = 'Z';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;      
                case 'Q':
                    switch(in[i]){
                        case 'r':
                            state = 'T';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'R':
                    switch(in[i]){
                        case 'i':
                            state = 'Z';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'S':
                    switch(in[i]){
                        case 'r':
                            state = 'U';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'T':
                    switch(in[i]){
                        case 'i':
                            state = 'V';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'U':
                    switch(in[i]){
                        case 'a':
                            state = 'W';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'V':
                    switch(in[i]){
                        case 'n':
                            state = 'Z';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'W':
                    switch(in[i]){
                        case 'n':
                            state = 'Y';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;                        
                case 'Y':
                    switch(in[i]){
                        case 'g':
                            state = 'Z';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;                    
                case 'Z':
                    switch(in[i]){
                        case ' ':
                            state = 'Z';
                            break;
                        default:
                            state = 'X';
                            break;
                    }
                    break;
                case 'X':
                    state = 'X';
                    break;
            }
            i++;
        }
        
        if(state == 'Z')
            return true;
        else
            return false;
    }    
    
    static char[][] pemisah(String in){
        char[] s = in.toCharArray(); 
        int i = 0;
        int panjang = 0;
        
        while( i < s.length ){
            if( s[i] == ' ' || s[i] == '.'){
                panjang++;
            }
            i++;
        }
        
        char[][] out = new char[panjang+1][20];
        out[0] = s;
        
        i = 0;
        int j = 1;
        int k = 0;
        while( j < out.length ){
            k = 0;
            while(s[i] != ' ' && s[i] != '.'){
                out[j][k] = s[i];
                i++;
                k++;
            }
            j++;
            i++;
        }
        
        return out;
    }

    static boolean cekSPOK(String input){
        char[][] c = pemisah(input);
        int i = 1;
        String[] kal = new String[ c.length ];
        String state = "q1";
        
        while( i < c.length ){
            kal[i] = String.copyValueOf(c[i]);
            i++;
        }
        
        i=1;
        while( i < kal.length ) {
            switch(state){
                case "q1":
                    if( cekSubjek( kal[i] ) )
                        state = "q2";
                    else
                        state = "X";
                    break;
                case "q2":
                    if( cekPredikat( kal[i] ) )
                        state = "q3";
                    else
                        state = "X";
                    break;
                case "q3":
                    if ( cekObjek( kal[i] ) )
                        state = "q4";
                    if ( cekKeterangan( kal[i] ) )
                        state = "q5";
                case "q4":
                    if ( cekKeterangan(kal[i]) )
                        state = "q5";
                    
            }
            i++;
        }
        if( state == "q5" || state == "q4" || state == "q3" )
            return true;
        else
            return false;
    }
    
    static boolean cekSP(String input){
        char[][] c = pemisah(input);
        int i = 1;
        String[] kal = new String[ c.length ];
        String state = "q1";
        
        while( i < c.length ){
            kal[i] = String.copyValueOf(c[i]);
            i++;
        }
        
        i=1;
        while( i < kal.length ) {
            switch(state){
                case "q1":
                    if( cekSubjek( kal[i] ) )
                        state = "q2";
                    else
                        state = "X";
                    break;
                case "q2":
                    if( cekPredikat( kal[i] ) )
                        state = "q3";
                    else
                        state = "X";
                    break;
            }
            i++;
        }
        if( state == "q5" || state == "q4" || state == "q3" )
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        String input = "sepatu ";
        //boolean b = cekSP(input);
        boolean b = cekObjek(input);
        System.out.println( b );
        
    }
}