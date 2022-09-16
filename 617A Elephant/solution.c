#include<stdio.h>
int main()
{
    int x;
    scanf("%d",&x);
    int ans = (x/5) + 1 - (x%5==0);
    printf("%d",ans);
    return 0;
}