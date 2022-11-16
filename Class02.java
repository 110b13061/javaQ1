class Data{
	private String name;	
	private Test score;   
	private  Test data ;
	 public Data(String na , int en, int m ) {				
		 this.name=na;
		 data=new Test(en, m);
	 }
	 class Test{                                  //(1)
		int english;			
		int math;
		 public Test() {
		 }
		 public Test (int eng,int m){                // (2)
				english=eng;
				math=m;
			}

		double avg(){                                //(3)
			return (english+math)/2.;
		}
	 }
	void show (){				                            //(4) 
		//Test t=new Test();
		System.out.print("name:"+name);
		System.out.println(" english="+data.english+" math="+data.math+" avg="+(double)data.avg());	
	}
}

public class Class02 {

	public static void main(String[] args){
		Data[] a;			                                   //(5)
		a=new Data[2];
		a[0]=new Data("Annie",85,92);  
		a[1]=new Data("Brian",77,56);	
		  a[0].show();
		  a[1].show();
	}
}


