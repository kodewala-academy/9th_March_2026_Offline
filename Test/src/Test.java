

public class Test {

	public static void main(String[] args) {
		String s1 = "Kodewala";

		int spreadHash = s1.hashCode() ^ (s1.hashCode() >>> 16);
		
		int bucket = spreadHash & (16 - 1);
		System.out.println(bucket);
	}

}
