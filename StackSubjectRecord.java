
// @5907101024 : Pacharapon Sreepiachai

public class StackSubjectRecord {
	   private int maxSize;        
	   private SubjectRecord[] stackSub;
	   private int top;            
	   public StackSubjectRecord(int maxSize){
	      this.maxSize = maxSize ;            
	      stackSub = new SubjectRecord[maxSize];  
	      top = -1;                
	      }
	   public void push(SubjectRecord SubjectRecord){
	      stackSub[++top] = SubjectRecord;     
	      }
	   public SubjectRecord pop(){
	      return stackSub[top--];  
	      }
	   public SubjectRecord peek(){       
	      return stackSub[top];
	      }
	   public boolean isEmpty(){
	      return (top == -1);
	      }
	   public boolean isFull() {
	      return (top == maxSize-1);
	      }

 public static void main(String []args){
	 SubjectRecord s1= new SubjectRecord();
	 SubjectRecord s2= new SubjectRecord();
	 SubjectRecord s3= new SubjectRecord();
	 
		 s1.setName("Data Structor");
		 s1.setCodename("NC252");
		 s1.setGrade("A");
		 s1.setUnits(3);
		 
		 s2.setName("Programming");
		 s2.setCodename("NC151");
		 s2.setGrade("B");
		 s2.setUnits(3);
		 
		 s3.setName("Advanced Programming");
		 s3.setCodename("NC153");
		 s3.setGrade("C");
		 s3.setUnits(3);
	 
	 StackSubjectRecord stack = new StackSubjectRecord(10);
	 	stack.push(s1);
	 	stack.push(s2);
	 	stack.push(s3);
	 
	 SubjectRecord s4 = stack.pop();
	 	System.out.println(s4);
	 SubjectRecord s5 = stack.pop();
	 	System.out.println(s5);
	 SubjectRecord s6 = stack.pop();
	 	System.out.println(s6);
	 
 }
}

// get code form Sirawit
