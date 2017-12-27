
def curry[A,B,C](f:(A, B) => C): A => (B => C) = 
  a => b => f(a, b)  

def foo(s: String, n: Int): Char =
  s.charAt(n)

println(foo("abcdefg", 3))
println(curry(foo)("abcdefg")(3))
//            ^^^   ^^^^^^^   ^
//             f       a      b

println(curry((_:String).charAt(_: Int))("abcdefg")(3))
//               ^^^^^^^^^^^^^^^^^^^^^    ^^^^^^^   ^
//                         f                 a      b

println(curry((_:Int) + (_:Int))(2)(3))
//             ^^^^^^^^^^^^^^^   ^  ^
//                    f          a  b
// def f(a:Int, b:Int): Int = a + b

println(curry((_:String) + (_:String))("abc")("XYZ"))
//             ^^^^^^^^^^^^^^^^^^^^^    ^^^    ^^^
//                       f               a      b
// def f(a:String, b:String): String = a + b

println(curry((_:Int).toString + (_:Int).toString)(2)(3))
//             ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  ^  ^
//                             f                   a  b
// def f(a:Int, b:Int): String = a.toString + b.toString

println(curry((_:String).toInt - (_:Int))("12")(3))
//             ^^^^^^^^^^^^^^^^^^^^^^^^   ^^^^  ^
//                           f             a    b
// def f(a:String, b:Int): Int = a.toInt - b



