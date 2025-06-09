package day6_super_dot_and_super_keyword;
class A {
    int x = 10;
    void m1() {
        System.out.println(this.x);
        // System.out.println(super.x); ❌ not allowed in class A (no superclass)
    }
}
class B extends A {
    int y = 20;
    void m2() {
        System.out.println(this.x);      // from A
        System.out.println(super.x);     // also from A
        System.out.println(this.y);      // from B
        // System.out.println(super.y); ❌ invalid – y is not in superclass A
    }
}
class Test{
	public static void main(String[] args) {
	    B b1 = new B();       // Creates object of B
	    A a1 = b1;            // Upcasting: parent class reference to child object

	    System.out.println(b1.x);  // x is inherited from A → prints 10
	    System.out.println(b1.y);  // y is declared in B → prints 20
	    System.out.println(a1.x);  // a1 refers to object of B, but reference is type A → accesses A's x → prints 10
	    System.out.println(b1.y);  // Again, prints 20
	}
}
/*
	Flow of Execution (Line-by-line):
		B b1 = new B();
		→ Object of class B is created (contains both x and y).

		A a1 = b1;
		→ a1 is a reference of type A, pointing to object of B (upcasting).

		System.out.println(b1.x);
		→ b1 can access x inherited from A → prints 10

		System.out.println(b1.y);
		→ b1 accesses its own field y → prints 20

		System.out.println(a1.x);
		→ a1 is of type A, can access A’s members only → prints 10

		System.out.println(b1.y);
		→ Again prints value of y from class B → prints 20
	*/