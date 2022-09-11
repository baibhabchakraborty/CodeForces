#include<stdio.h>
#include<ctype.h>
int main()
{
    char input[40];
    gets(input);
    input[0] = toupper(input[0]);
    printf("%s",input);
    return 0;
}