package test1;

class Color1 {
	public static void main(String[] args) {
		System.out.println("成功ですね！！！");
	}
	
	String getColor(int i) {

		if (i == 1) {
			return "赤";

		} else if (i == 2) {
			return "青";
			
		} else {
			// sss
			return "1or2を入力して下さい";
		}
	}
	
	String checkNullError(String s) {
		if (s == null || s.length() == 0) {
			throw new NullPointerException("nullです");
		} else {
			return "OK";
		}
	}
}