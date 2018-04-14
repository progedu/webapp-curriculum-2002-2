class Container[+L](n: L) {
  def put[T >: L](a: T): Container[T] = new Container[T](a)
  def get(): L = n
}
