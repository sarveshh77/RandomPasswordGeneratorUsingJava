/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randompasswordgenerator;

import java.util.Random;

/**
 *
 * @author vedan
 */
public class PasswordGenerator {
      public static final String lowercase="abcdefghijklmnopqrstuvwxyz";
    public static final String upercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String numbers="0123456789";
    public static final String special_symbol="!@#$%^&*()_+?<>}{][]";
    
    private final Random random;
    
    public PasswordGenerator()
    {
        random=new Random();
        
    }
    public String generatePassword(int length,boolean includeUppercase,boolean includeLowercase,boolean includeNumbers,boolean includeSpecialSymbols)
        {
            StringBuilder passwordBuilder=new StringBuilder();
            
            String validCharacters="";
            
            if(includeUppercase)
            {
                validCharacters +=upercase;
            }
            if(includeLowercase)
            {
                validCharacters +=lowercase;
            }
            if(includeNumbers)
            {
                validCharacters +=numbers;
            }
            if(includeSpecialSymbols)
            {
                validCharacters +=special_symbol;
            }
            
            for(int i=0;i<length;i++)
            {
                int randomIndex = random.nextInt(validCharacters.length());
                char randomChar = validCharacters.charAt(randomIndex);
                
                passwordBuilder.append(randomChar);
            }
            return passwordBuilder.toString();
        }
    
}
