// @5907101024 : Pacharapon Sreepiachai


public class MyPower {
	public static void main(String[] args){
		long x =  3, y= 18;
		System.out.println("Pow("+x+","+y+")= "+myPower(x,y));
		}
		public static long myPower(long x , long y){
		System.out.println("x="+x+",y="+y);
		long ans = x;
		if (y !=1 ){
		 if (y%2 != 0){
			 ans= x*myPower(x*x,y/2);
		 System.out.println("Returning "+ans+",X="+x+",Y="+y+" // Y is odd");}
		 else{ ans= myPower(x*x,y/2); // y is odd
		System.out.println("Returning "+ans+",X="+x+",Y="+y+ " // Y is even");}
		return ans ;
		}
		else {
		System.out.println("Returning "+ans+",X="+x+",Y="+y);
		return ans;
		}
		}
}
// get code form Sirawit
