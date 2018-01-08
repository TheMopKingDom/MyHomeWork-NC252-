/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


/**
 *
 * @author
 * Posathorn Ploykaew 5907101008
 * Pacharapon Sreepiachai 5907101024
 */
public class HashTable {
    // number of indexes in hash table
    private final static int TABLE_SIZE = 1200;
    // initialise array of HashEntry (table)
    HashEntry[] table;
    // constructor, create array, assign all values to null
    HashTable() {
        // create array of HashEntry, predefined size
        table = new HashEntry[TABLE_SIZE];
    }

    // from key, find the correct index, load the HashEntry object and return the value
    public String getValue(String key) {
    	  key=key.toLowerCase();
        if(checkKey(key)==true)
        	return  key +" does not exist";
        else{
        	int index = this.getKeyIndex(key);
            while(table[index].equals(key)==true){
    	        index++;
   }
        return table[index].getValue(key);
        }
    }

    // creates a new HashEntry object, inserts that into the table array at the correct index
    // determined by getKeyIndex(key)
    public void insert(String key, String value) {
        key=key.toLowerCase();
        int index = this.getKeyIndex(key);
        while(table[index]!=null){
        index++;
        }
        table[index] = new HashEntry(key, value);
    }

    // ** PRIVATE FUNCTIONS ** //
    // get index from key
    private Integer getKeyIndex(String key) {
    	//from https://stackoverflow.com/a/2624210
        int hash = 7;
        
        for (int i = 0; i < key.length(); i++) {
            hash = (hash*31 + key.charAt(i))%1000;
        }
        return hash;
    }
    public boolean checkKey(String key){
    	  key=key.toLowerCase();
    	int index = this.getKeyIndex(key);
    	return table[index]==null;
    }
    public void getEdit(String key,String value){
    	 
    	  key=key.toLowerCase();
    	if(checkKey(key)==true)
    		 System.out.println("your key '"+key+"' does not exist");
    	else{
            int index = this.getKeyIndex(key);
                while(table[index].getKey().equals(key)!=true){
                    index++;
       }
    		  table[index] = new HashEntry(key, value);
    		  System.out.println("Edit ok");
    	}
    }
    public void dleKey(String key){
    	 key=key.toLowerCase();
    	 int index = this.getKeyIndex(key);
    	 table[index] = null;
    	 System.out.println("this key "+key+" have Delete");
    }
    public void SUBMENU(String key){
        Scanner sc = new Scanner(System.in);
            System.out.println("============ SEARCHING MENU ============");
            System.out.println("1. NEXT VOCABULARY ");
            System.out.println("2. PREVIOUS VOCABULARY ");
            System.out.println("3. EDIT VOCABULARY ");
            System.out.println("4. BACK TO MAIN MENU ");
            System.out.println("====================================");
            System.out.print(" INPUT THE CHIOCE :: ");
            int ch2 = sc.nextInt();
            switch(ch2)
            {
                case 1 :
                    key = findlisd(key,0);
                    System.out.println("Next word is '"+key+"'");
                    SUBMENU(key);                      
                    break;
                case 2 :
                    key = findlisd(key,1);
                    System.out.println("Previous word is '"+key+"'");
                    SUBMENU(key);                       
                    break;
                case 3 : 
                    System.out.print("edit word :: ");
                    String eword = sc.next() ;
                    System.out.print("edit transliterate :: ");
                    String eread = sc.next() ;
                    getEdit(eword,eread);
                    MAINMENU(); 
                    break;
                case 4 :
                    MAINMENU(); 
                    break;
                default :System.out.print("Cann't choice");
                    MAINMENU(); 
            }
    }
    public void MAINMENU(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("============MENU============");
                    System.out.println("1. ADDING ");
                    System.out.println("2. SEARCHING ");
                    System.out.println("3. DELETING ");
                    System.out.println("4. EXIT ");
                    System.out.println("============================");
                    System.out.print("SELECT THE CHOICE :: ");
                    int ch1 = sc.nextInt();
                    switch(ch1){
                        case 1 :System.out.print("ADD WORD :: ");
                                String word = sc.next();
                                System.out.print("ADD MEANING :: ");
                                String read = sc.next();
                                insert(word, read);
                                MAINMENU();   
                                break;
                        case 2 :System.out.print("WRITE KEYWORD :: ");
                                String search = sc.next() ;
                                System.out.println("Found link with key :: "+ getValue(search) );
                                SUBMENU(search); 
                                break;
                        case 3 :System.out.print("WHAT ARE YOU WANT TO DELTE :: ");
                                String dele = sc.next() ;
                                dleKey(dele);
                                MAINMENU();
                                break;

                        case 4 :System.out.print(" THANK YOU // GOOD BYE ");    
                        break;
                        default :System.out.print("PLEASE SELECT 1-4");
    }
    }
    public String findlisd(String key,int list){
    	  key= key.toLowerCase();
        int index = getKeyIndex(key);
        if(list==0){
            index++;
             while(table[index]==null){
        index++;
        }
        }
        else{ index--;
                 while(table[index]==null){
        index--;
        }
        }
            return  table[index].getKey();
    }
}
