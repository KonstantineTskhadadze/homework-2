package com.roman;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    
    private int romanConv(String number){
        int result =  number.equals("I") ? 1
            : number.equals("V") ? 5
            : number.equals("X") ? 10
            : number.equals("L") ? 50
            : number.equals("C") ? 100
            : number.equals("D") ? 500
            : number.equals("M") ? 1000
            : 0;
        return result;
    }
    
    public int romanToInt(String s) {
        final String[] symbols = s.split("");
        final int size = symbols.length;  
        System.out.println(Arrays.stream(symbols).map(this::romanConv).collect(Collectors.toList()));
        int result = 0;
        for(int i = 0; i < size; i++) {
        	if(i == size - 1 || romanConv(symbols[i]) >= romanConv(symbols[i + 1]))
        		result += romanConv(symbols[i]);
        	else {
        		result += (romanConv(symbols[i + 1]) - romanConv(symbols[i]));
        		i++;
        	}
        }
        return result;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().romanToInt("LMIII"));
	}
}