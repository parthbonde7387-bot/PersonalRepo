include<stdio.h>
#include<conio.h>
void main()
{
    int num;
    clrscr();
    printf("Even number from 0 to 30 are as follows=\n");
    for(num=0;num<=30;num=num+2)
    {
        printf("%d\n",num);
    }
    getch();
}