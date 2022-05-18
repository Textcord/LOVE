Console.Write("이름 : ");
string name = Console.ReadLine();
while (true)
{
    Console.WriteLine(String.Format("{0} 사랑해줘❤", name));
    Thread.Sleep(500);
    Console.WriteLine(String.Format("{0} 사랑해줄래요?", name));
    Thread.Sleep(500);
}
