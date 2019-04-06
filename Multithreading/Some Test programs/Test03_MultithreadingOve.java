package multithreadig;




public class Test03_MultithreadingOve  extends Thread implements Runnable  {

	public static void main(String[] args) {
		String st = "ochhane om ji Maharaz Raja ko rani";
		System.out.println(LetterCap(st));
	}
	
	public static String LetterCap(String st) {
		StringBuffer sb = new StringBuffer(st);int count = 0;
		for(int i = 0;i < sb.length();i++) {
			if(sb.charAt(i)==' ') {count = 1;continue;}
			if(count == 0 || count == 1) {
				sb.replace(i, i+1, (Character.toUpperCase(sb.charAt(i))+""));count = 2;}}
		return sb.toString();
	}

}
