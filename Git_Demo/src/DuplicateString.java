
public class DuplicateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] str={"Nilava123","Sakuntala","Nilava","Sakuntala123","Sakuntala"};
		for(int i=0;i<=str.length-1;i++){
				for(int j=i+1;j<=str.length-1;j++){
						if(str[i].equals(str[j])){
							System.out.println("Duplicate Value=======>"+str[j]);
						}
				}
		}

	}

}


