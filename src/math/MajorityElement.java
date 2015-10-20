package math;

public class MajorityElement<T> {
	
	public T getMajority(T[] array) {
		 T majority = null;
		 int count = 0;
		 
		 for (T t : array) {
			 if (majority == null) {
				 majority = t;
				 count = 1;
			 } else if (majority.equals(t)) {
				 count++;
			 } else {
				 count--;
				 if (count == 0) {
					 majority = null;
				 }
			 }
		 }
		 
		 return majority;
	}

	public static void main(String[] args) {
		MajorityElement<Integer> m = new MajorityElement<Integer>();
		System.out.println(m.getMajority(new Integer[]{1,2,1,3,1,1,4}));
		System.out.println(m.getMajority(new Integer[]{1,1,2}));
		System.out.println(m.getMajority(new Integer[]{1,1,1,2,2}));
		System.out.println(m.getMajority(new Integer[]{1}));
		System.out.println(m.getMajority(new Integer[]{1,2}));

		MajorityElement<String> n = new MajorityElement<String>();
		System.out.println(n.getMajority(new String[]{"abc","xyz","abc","abc","abc"}));
	}

}
