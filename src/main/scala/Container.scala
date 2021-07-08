class Container[+A](n: A) {
    def put[E >: A](a: E): Container[E] = new Container[E](a)
    def get(): A = n
}
