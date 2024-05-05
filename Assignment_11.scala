object hello1{
    def main(args :Array[String])={
        println("Hellow welcome to the Scala")
        println("Enter Any one of the following")
        println("\n1.Add Number \n2.Multiplication\n3.Square\n")
        var choice=scala.io.StdIn.readLine().toInt
        if(choice==1){
            add()
        }
    }
    def add()={
        var num1=scala.io.StdIn.readLine().toInt
        var num2=scala.io.StdIn.readLine().toInt
        print("Addition is "+(num1+num2))
    }
}