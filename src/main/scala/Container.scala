class Container[+T](t: T) {
  def put[E >: T](elem: E) = new Container(elem)

  def get(): T = t
}
