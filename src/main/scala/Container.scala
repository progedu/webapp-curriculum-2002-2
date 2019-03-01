class Container[+A](n: A) {
    def put[B >: A](a: B): Container[B] = new Container[B](a)
    def get(): A = n
}
