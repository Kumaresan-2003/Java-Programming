
public class ninjajjump {
	static void ans(int n) {
		int x=0,y=0;
		int distance =10;
		char compass='R';
		while(n>0) {
			switch(compass) {
			case 'R':
				x+=distance;
				distance +=10;
				compass='U';
				break;
			case 'U':
				y+=distance;
				distance+=10;
				compass='L';
				break;
			case 'L':
				x-=distance;
				distance+=10;
				compass='D';
				break;
			case 'D':
				y-=distance;
				distance+=10;
				compass='A';
				break;
			case 'A':
				x+=distance;
				distance+=10;
				compass='A';
				break;
			}
			n--;
			
		}
		System.out.print(x+" "+y);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ans(n);

	}

}
