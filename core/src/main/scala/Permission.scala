trait Permission[A] {
  def authorized[B](a: A)(b: B): Boolean
  def contains[B](l: List[A])(b: B): Boolean = l.contains({a: A => authorized(a)(b)})
}
