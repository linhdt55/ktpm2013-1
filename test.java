/* Kiem thu don vi cho chuong trinh giai phuong trinh bac nhat */

public class test
{

	static int giaiPTB1(int a, int b) {
		if (a == 0) return 0;

		//try {
			return -b/a;
		//} catch (Exception e) {
		//	return 0;
		//}
	}

	static void test1() {
		int ketQuaThat = giaiPTB1(1, 1);

		if (ketQuaThat == -1)
		{
			System.out.println("test1 was success.");
		}else {
			System.out.println("test1 was failed.");
		}

	}


	static void test2() {
		int ketQuaThat = giaiPTB1(10, -90);

		if (ketQuaThat == 9)
		{
			System.out.println("test2 was success.");
		}else {
			System.out.println("test2 was failed.");
		}

	}


	static void test3() {
		int ketQuaThat = giaiPTB1(0, 1);

		if (ketQuaThat == 0)
		{
			System.out.println("test3 was success.");
		}else {
			System.out.println("test3 was failed.");
		}

	}

	public static void main (String [] args) {
		//System.out.println("Hello");

		int i = giaiPTB1(0, 1);

		//test 1
		test1();

		// test 2
		test2();
	
		//test 3
		test3();


	}
}

