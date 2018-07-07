class Container[+T](n: T) {
  def put[T](a: T): Container[T] = new Container(a)
  def get(): T = n
}
