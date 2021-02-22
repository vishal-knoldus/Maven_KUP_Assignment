import org.junit.Assert.assertEquals
class MethodTest {
 @org.junit.Test
def test1(): Double ={
  val firstNum = scala.io.StdIn.readDouble()
  val secondNum = scala.io.StdIn.readDouble()
  var expected : Double = 15
  var actual : Double = addition(firstNum,secondNum)
  assertEquals(expected,actual)

  }
}
