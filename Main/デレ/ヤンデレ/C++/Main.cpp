#ifdef _MSC_VER
#define _CRT_SECURE_NO_WARNINGS
#endif

#include <iostream>
#include <string>
#include <windows.h>

using namespace std;

int main()
{   
    string name;
    cout << "이름 : ";
    cin >> name;
    while (true) {
        printf("%s 사랑해줘❤\n", name.c_str());
        Sleep(500);
        printf("%s 사랑해줄래요?\n", name.c_str());
        Sleep(1000);
    }
    return 0;
}
