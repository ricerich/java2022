package ex07.ch04_stack_postfix_calc;

class Basic {
	public static void main(String args[]) {
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n후위표기식 : %s", exp);
		System.out.println();
		result = opt.evalPostfix(exp);
		System.out.printf("\n 연산결과 =  %d \n", result);
	}
}