import example.Lists

@main
def main(): Unit =
  println("Taking a functional programming course")
  println(Lists.sum(List(1,3,4)))
  println(Lists.max(List(1,3,4,2,6,9)).getOrElse(0))
