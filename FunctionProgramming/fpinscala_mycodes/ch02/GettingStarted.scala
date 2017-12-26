//
// 第２章の演習問題を自分で問いてみる
//


object MyModule{
	def sum(n: Int): Int = {
		@annotation.tailrec
		def go(n: Int, acc: Int): Int =
			if (n <= 0) acc
			else go(n-1, n+acc)
		go(n, 0)
	}
	private def formatSum(x: Int) = {
		val msg = "The total sum value of %d is %d"
		msg.format(x, sum(x))
	}


	def abs(n: Int): Int =
		if (n < 0) -n
		else n

	private def formatAbs(x: Int) = {
		val msg = "The absolute value of %d is %d"
		msg.format(x, abs(x))
	}

	def main(args: Array[String]): Unit =
		//println(formatAbs(-321))
		println(formatSum(10))

}
