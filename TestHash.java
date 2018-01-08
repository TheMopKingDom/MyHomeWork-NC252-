/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;
import java.util.*;
/**
 *
 * @author 
 * Posathorn Ploykaew 5907101008
 * Pacharapon Sreepiachai 5907101024
 */
public class TestHash {
     public static void main(String[] args){
	        HashTable tableHash = new HashTable();
        Scanner sc = new Scanner(System.in);
 
        System.out.println("============ WELCOME ============");
        System.out.println("1. LOADING");
        System.out.println("============================");
        System.out.print(" WRITE 1 TO CONTINUE :: ");
        
        int ch = sc.nextInt();
        switch(ch){
            case 1 :tableHash.insert("Ability","ความสามรถ"); //a
                    tableHash.insert("Accident","อุบัติเหตุ");
                    tableHash.insert("Adventure","การผจญภัย");
                    
                    tableHash.insert("Beggar","คนขอทาน"); //b
                    tableHash.insert("Blanket","ผ้าห่ม");
                    tableHash.insert("Bookcase","ตู้หนังสือ");
                    
                    tableHash.insert("Calculator","เครื่องคิดเลข");//c
                    tableHash.insert("Ceiling","เพดาน");
                    tableHash.insert("Cheerful","ร่าเริง");
                    
                    tableHash.insert("Diligent","ขยัน");//d
                    tableHash.insert("Dread","หวาดกลัว");
                    tableHash.insert("Dustbin","ถังขยะ");
                    
                    tableHash.insert("Editor","บรรณาธิการ");//e1 
                    tableHash.insert("Engineer","วิศวกร");
                    tableHash.insert("Explorer","นักสำรวจ");
                    
                    tableHash.insert("Garment","เสื้อผ้า");//g
                    tableHash.insert("Genius","อัจฉริยะ");
                    tableHash.insert("Govern","ปกครอง");
                    tableHash.insert("Gun","ปืน");
                    
                    tableHash.insert("Hermit","ฤๅษี");//h
                    tableHash.insert("Horrible","น่ากลัว");
                    tableHash.insert("Hunter","นายพราน");
                    
                    tableHash.insert("Idiom","สำนวน");//i
                    tableHash.insert("Impolite","หยาบคาย");
                    tableHash.insert("Intend","ตั้งใจ");
                    
                    tableHash.insert("Jasmine","ต้นมะลิ");//j
                    tableHash.insert("Journey","การเดินทาง");
                    tableHash.insert("Justice","ความยุติธรรม");
                    
                    tableHash.insert("Keeper","ผู้เก็บรักษา");//k
                    tableHash.insert("Kingdom","อาณาจักร");
                    tableHash.insert("Knowledge","ความรู้");
                    
                    tableHash.insert("Layoff","การเลิกจ้าง");//l
                    tableHash.insert("Legend","ตำนาน");
                    tableHash.insert("License","ใบอนุญาติ");
                    
                    tableHash.insert("Manniac","คนบ้า");//m
                    tableHash.insert("Meeting","การประชุม");
                    tableHash.insert("Miracle","อัศจรรย์");
                    
                    tableHash.insert("Narration","การบรรยาย");//n
                    tableHash.insert("Network","เครือข่าย");
                    tableHash.insert("Nutrition","โภชนาการ");
                    
                    tableHash.insert("Obedient","เชื่อฟัง");//o
                    tableHash.insert("Ocean","มหาสมุทร");
                    tableHash.insert("Opportunity","โอกาส");
                    
                    tableHash.insert("Parliament","รัฐสภา");//p
                    tableHash.insert("Permission","การยินยอม");
                    tableHash.insert("Pleasure","ความพอใจ");
                    
                    tableHash.insert("Quandary","ความอึดอัดใจ");//q
                    tableHash.insert("Quarrel","ทะเลาะ");
                    tableHash.insert("Queer","ประหลาด");
                    
                    tableHash.insert("Register","ลงทะเบียน");//r
                    tableHash.insert("Rocket","จรวด");
                    tableHash.insert("Ruthless","โหดเหี้ยม");
                    
                    tableHash.insert("Satellite","ดาวเทียม"); //s
                    tableHash.insert("Scientist","นักวิทยาศาสตร์");
                    tableHash.insert("Skeleton","โครงกระดูก");
                    
                    tableHash.insert("Talkative","พูดมาก");//t
                    tableHash.insert("Timetable","ตารางเวลา");
                    tableHash.insert("Tournament","การแข่งขัน");
                    
                    tableHash.insert("Uncomfortable","ไม่สะดวก");//u
                    tableHash.insert("Upset","สับสน");
                    tableHash.insert("Useless","ไร้ประโยชน์");
                    
                    tableHash.insert("Vacillate","เปลี่ยนแปลง");//v
                    tableHash.insert("Ventilate","ระบายลม");
                    tableHash.insert("Voyage","การเดินทางไกล");
                    
                    tableHash.insert("Warehouse","คลังสินค้า");//w
                    tableHash.insert("Welfare","สวัสดิการ");
                    tableHash.insert("Wicked","โหดร้าย");
                    
                    tableHash.insert("X-ray","รังสีเอ็กซ์");//x
                    tableHash.insert("Xerox","ถ่ายเอกสาร");
                    tableHash.insert("Xmas","คริสต์มาส");
                    
                    tableHash.insert("Yacht","เรือท่องเที่ยว");//y
                    tableHash.insert("Yield","ผลิต");
                    tableHash.insert("Yourself","ตัวเอง");
                    
                    tableHash.insert("Zealously","กระตือรือร้น"); //z
                    tableHash.insert("Zenith","สุดยอด");
                    tableHash.insert("Zoology","สัตววิทยา");
                    
                    System.out.println("load file complete");            
                    tableHash.MAINMENU();
                    break;
            default :System.out.print(" PLEASE SEECT 1 ONLY ");
            
	    }
    }
}
