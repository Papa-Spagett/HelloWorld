/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc241.tofaucetteboyd0.lab;
import java.util.Random;

import cosc241.tofaucetteboyd0.collection.MyStack;
import cosc241.tofaucetteboyd0.collection.MyQueue;
import java.io.*;
/**
 *
 * @author Big Thomas
 */
public class Lab5 {
    public static void test()
    {
        //Create a random number generator and use the current system time to set the seet
        Random rand = new Random(System.currentTimeMillis());
        
        //Creat one instance for MyStack and MyQueue class respectively
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        
        for (int i = 0; i <30; ++i)
        {
            int r = rand.nextInt();
            stack.push(r);
            queue.insertBack(r);
        }
        
        System.out.println(queue);
        System.out.println(stack);
        
        for (int j = 0; j<20;++j)
        {
            stack.pop();
            queue.removeFront();
        }
        
        System.out.println(queue);
        System.out.println(stack);
        
        try {
        File file = new File("../cosc241.tofaucetteboyd0.txt");
        BufferedWriter output = new BufferedWriter(new FileWriter(file));
        output.write(stack.toString());
        output.append(queue.toString());
        output.close();
        System.out.println("The data was placed in 'cosc241.tofaucetteboyd0.txt'");
        }
        catch(IOException error) {
            System.out.println("There was an error writing the file");
        }
     
    }

   
    
}