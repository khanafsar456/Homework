package stringClass13;

public class Task01 {

	public static void main(String[] args) {
	
		int lenght=0;
		String a="Khanafsar";
		
		if(!a.isEmpty()) 
			if(a.length()%2!=0 && a.length()>=3){
				
				int middleIndex=lenght/2; // because we want the middle character
				System.out.println(a.charAt(middleIndex));
				/*
				 * String str="hello";
    int length=str.length();
    if(!str.isEmpty()&&length%2!=0&&length>=3) {

        int middleIndex=length/2;
        System.out.println(str.charAt(middleIndex));
    }
				 */
		}

	}

}
