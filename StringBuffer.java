package phase1.mphasis;

public class StringBuffer {
	public static void main(String args[]){  
		
		StringBuffer sb = new StringBuffer(); 
		
		sb.append("Java");        //now original string is changed  
		System.out.println(sb);   //prints Hello Java  
		
		sb.insert(1,"Java");     //now original string is changed  
		System.out.println(sb);  
		
		sb.replace(1,3,"Java");  
		System.out.println(sb);
		
		sb.delete(1,3);  
		System.out.println(sb);
		
		sb.reverse();  
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
		
		StringBuilder ss = new StringBuilder("Core");
		
		System.out.println(">>>>>>>"+ ss);
		ss.append("Java");
		System.out.println(">>>>>>>"+ ss);
		System.out.println(ss.length());
		System.out.println(ss.charAt(6));
		System.out.println(ss.reverse());
		}

	private char[] charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private void reverse() {
		// TODO Auto-generated method stub
		
	}

	private void delete(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void replace(int i, int j, String string) {
		// TODO Auto-generated method stub
		
	}

	private void insert(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}  

}
