class Container[+A](n: A) {

  def put[A <: Any](a: A): Container[A] = new Container(a)

  def get(): A = n

}
