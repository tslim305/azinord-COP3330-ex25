


package com.company;

import java.util.Scanner;

public class Main {

    public static int passwordValidator(String pass)
    {
        int charcou = 0;
        int digit = 0;

        char[] str1 = pass.toCharArray();

        for (int i = 0; i <= str1.length - 1; i++)
        {

            if (Character.isLetter(str1[i]))
                charcou++;

            else if (Character.isDigit(str1[i]))
                digit++;
        }


        if (digit == str1.length)
            return 0;
        else if (charcou == str1.length)
            return 1;
        else if (digit + charcou == str1.length)
            return 2;
        else
            return 3;
        }


        public static void main(String[] args)
            {
                Scanner s = new Scanner(System.in);
                String password = s.next();
                String str = "";

                int check = passwordValidator(password);

                if (check == 0)
                    str = str + "very weak";
               if(check == 1)
                    str = str + "weak";
               if(check == 2)
                    str = str + "strong";
                if (check == 3)
                    str = str + "very strong";


                System.out.println("The password " + password + " is a " + str + " password.");

            }
        }
