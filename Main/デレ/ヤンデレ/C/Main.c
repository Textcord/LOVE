#include <stdio.h>
#include <synchapi.h>

int main() {
    char name;
    printf("이름 : ");
    scanf("%c", &name);
    while (1) {
        printf("%c 사랑해줘❤\n", name);
        Sleep(500);
        printf("%c 사랑해줄래요?\n", name);
        Sleep(500);
    }
}
