package kr.infrine;
// default는 단어가아니라 의미적으로 해석해야함(작성해서 사용불가)
public class MyClass {
	public int sum(int a, int b) {
		int hap = 0;
		for(int i=a; i<=b; i++) {
			hap += i;
		}
		return hap;
	}
}
