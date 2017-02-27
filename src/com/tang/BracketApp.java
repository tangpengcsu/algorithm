package com.tang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author TangPeng
 * @Date 2017-2-27
 */

class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        input = in;
    }

    public void check() {
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        if (ch == '}' && chx != '{' ||
                                ch == ']' && chx != '[' ||
                                ch == ')' && chx != '(') {
                            System.out.println("Error: " + ch + " at " + j);
                        }
                    } else {
                        System.out.println("Error: " + ch + " at " + j);
                    }
                    break;
                default:
                    break;
            }
        }
        if(!theStack.isEmpty()){
          System.out.println("Error: missing right delimiter");
        }
    }
}

public class BracketApp {
    public static void main(String[] args) throws IOException{
        String input;
        while(true){

            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if(input.equals("")){
                break;
            }
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
