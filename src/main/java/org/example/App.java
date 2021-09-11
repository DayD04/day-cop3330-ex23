package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "Is the car silent whe you turn the key? " );
        String silent = input.next();
        if (silent.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String battery = input.next();
            if (battery.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            }
            else if (battery.equals("n")) {
                System.out.println("Replace cables and try again.");
            }
        }
        else if (silent.equals("n")) {
            System.out.print("Does the car make a slicking noise? ");
            String slick = input.next();
            if (slick.equals("y")) {
                System.out.println("Replace the battery.");
            }
            else if (slick.equals("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                String fail = input.next();
                if (fail.equals("y")) {
                    System.out.println("Check spark plug connections.");
                }
                else if (fail.equals("n")) {
                    System.out.print("Does the engine start and the die? ");
                    String start = input.next();
                    if (start.equals("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String injection = input.next();
                        if (injection.equals("y")) {
                            System.out.println("get it in for service.");
                        }
                        else if (injection.equals("n")) {
                            System.out.println("Check to insure the choke is opening and closing.");
                        }
                    }
                    else if (start.equals("n")) {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
