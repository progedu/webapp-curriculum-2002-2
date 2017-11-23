class Container[+T](n: T) {
  	//          AnyRef >: String  
  	// E-- Any >:                   >:  Nothing --T
  	//          AnyVal >: Int
  	def put[E >: T](a: E): Container[E] = new Container[E](a)
	  def get(): T = n
}
