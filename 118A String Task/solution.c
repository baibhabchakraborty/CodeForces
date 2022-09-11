#include<stdio.h>
#include<ctype.h>
int isVowel(char c)
{
    c = tolower(c);
    if(c == 'e' || c =='a' || c =='i' || c == 'o' || c =='u' || c =='y')
        return 1;
    return 0;
}
int main()
{
    char input;
    while(scanf("%c",&input)==1)
    {
        if(!isVowel(input) && !isspace(input))
        {
            printf(".%c",tolower(input));
        }
    }
    return 0;
}