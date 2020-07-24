class DisplayRes{  
    void display(){
		int[] a = {12, 30, 25, 18, 17}
		System.Out.Println("Sample Array Program");
		for(int i=0; i<5, i++)
			System.Out.Println("a["+i+"] is " + a[i]);
	}  
}  
public class JavaProgram{
	public static void main(String args[]){
		DisplayRes dr=new DisplayRes();
		dr.display();  
	}  
}  
  
