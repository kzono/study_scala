//
// polymorphic function 多相関数の練習問題。
// C++ でいうところのテンプレート。

// この実装は末尾再帰最適化になっているのか？
def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  //@annotation.tailrec
  def loop(n: Int): Boolean =
    if(n > (as.length - 1)) true  
    else if( ordered(as(n), as(n+1)) ) loop(n+1)
    else false 
  
  loop(0)
}
def main(args: Array[String]): Unit =
  println(isSorted(Array(1,2,3), (x:Int, y:Int)=> if(x>y) true else false))
