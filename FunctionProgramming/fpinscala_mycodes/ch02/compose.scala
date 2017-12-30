..
// ex2.5 関数の合成
//

def compose[A,B,C](f: B => C, g: A => B): A => B =
  a => f(g(a))

