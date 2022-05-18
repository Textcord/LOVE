import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("이름: ")
    val name:String = sc.nextLine();
    while (true) {
        println(String.format("%s 사랑해줘❤",name))
        Thread.sleep(500);
        println(String.format("%s 사랑해줄래요?",name))
        Thread.sleep(1000)
    }
}
