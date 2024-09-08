package pack2;
import pack1.mem1;
 class mem2 extends mem1{
  public static void main(String[] args) {
    mem2 m = new mem2();
    m.m1();
    // mem1 mm = new mem();
    // mm.m1();

// mem2 mm = new mem2();
//     mm.m1();
    }
}
class d extends mem2{
  public static void main(String[] args) {
    d d1 = new d();
    d1.m1();
    mem2 m = new mem2();
    m.m1();
  }
}
// class mem4 extends mem2{
//   public static void main(String[] args) {
//     mem
//   }
// }
