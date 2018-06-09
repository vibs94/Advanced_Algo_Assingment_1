/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advancedalgorithm;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author B.K.D.Vibodha
 */
public class AdvancedAlgorithm {

    /**
     * @param args the command line arguments
     */
    
    private static String getInput(String filePath){
        ArrayList out = new ArrayList();
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
 
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
           }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String in = contentBuilder.toString();
        
        return in;
    }
    
    private static long[] getDataSet(String input){
        String[] data = input.split(",");
        long[] dataset = new long[data.length];
        for(int i=0;i<data.length;i++){
            dataset[i]=Long.parseLong(data[i].trim());
        }
        return dataset;
    }
    
    public static void main(String[] args) {
        BST<Long, Integer> bst;
        RedBlackBST<Long, Integer> rbbst;
        SplayBST<Long, Integer> sbst;
        String pathHeader = "E:\\Semister 7\\Advanced Algorithm\\Assingment 1\\data\\";
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        
        System.out.println("Tree: "
                + "\n"+"1. BST"
                + "\n"+"2. RB tree"
                + "\n"+"3. Splay tree");
        int n = reader.nextInt();
        System.out.println("Set: ");
        int i = reader.nextInt();
        System.out.println("data: ");
        int j = reader.nextInt();
        String pathinit ;
                //= pathHeader+"\\"+op+"\\set";
        String pathset;
        String path;
        //1\\data_1.txt
        long[] dataset;
        long in,out,t;
        if(n==1){
                    bst = new BST<>();
                    //////////////// Insert ///////////////
                    pathinit = pathHeader+"\\"+"insert"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path));
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        bst.put(dataset[k], k);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Insert set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                    System.out.println("Size of tree = "+bst.size());

                    /////////////// Search /////////////
                    pathinit = pathHeader+"\\"+"search"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path));                
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        bst.contains(dataset[k]);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Search set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                    /////////////// Delete /////////////
                    pathinit = pathHeader+"\\"+"delete"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path)); 
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        bst.delete(dataset[k]);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Delete set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                
                    
        }
        else if(n==2){
            rbbst = new RedBlackBST<>();
            
                    //////////////// Insert ///////////////
                    pathinit = pathHeader+"\\"+"insert"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path));
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        rbbst.put(dataset[k], k);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Insert set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                    /////////////// Search /////////////
                    pathinit = pathHeader+"\\"+"search"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path));                
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        rbbst.contains(dataset[k]);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Search set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                    /////////////// Delete /////////////
                    pathinit = pathHeader+"\\"+"delete"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path)); 
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        rbbst.delete(dataset[k]);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Delete set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                
        }
        else{
            sbst = new SplayBST<>();
                    //////////////// Insert ///////////////
                    pathinit = pathHeader+"\\"+"insert"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path));
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        sbst.put(dataset[k], k);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Insert set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                    /////////////// Search /////////////
                    pathinit = pathHeader+"\\"+"search"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path));                
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        sbst.contains(dataset[k]);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Search set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                    /////////////// Delete /////////////
                    pathinit = pathHeader+"\\"+"delete"+"\\set";
                    pathset = pathinit+String.valueOf(i)+"\\\\data_";
                    path = pathset + String.valueOf(j) +".txt";
                    dataset = getDataSet(getInput(path));
                    in = System.nanoTime();
                    for(int k=0;k<dataset.length;k++){
                        sbst.remove(dataset[k]);
                    }
                    out = System.nanoTime();
                    t = out - in;
                    System.out.println("Delete set"+String.valueOf(i)+" data_"+String.valueOf(j)+" time = "+String.valueOf(t/1000)+" size = "+String.valueOf(dataset.length));
                    
        
        }}
    }

