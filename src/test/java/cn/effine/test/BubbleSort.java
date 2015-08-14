/**
 * @author effine
 * @Date 2015年8月14日  上午10:33:39
 * @email verphen#gmail.com
 * @site http://www.effine.cn
 */

package cn.effine.test;

public class BubbleSort {

	public void sort(int[] a) {
		int temp = 0;
		for (int i = a.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (a[j + 1] < a[j]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,5,1,2,7,21};
		new BubbleSort().sort(a);
		System.out.println(a);
		
	}
}
