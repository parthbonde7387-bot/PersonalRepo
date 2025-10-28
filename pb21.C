#include<stdio.h>
#include<conio.h>
void maid()
{
    int day;
    clrscr();
    printf("Enter any number\n");
    scanf("%d",& day);
    swich(day)
    {
        case 1:
        printf("MONDAY\n");
        breck;
        case 2:
        printf("THUESDAY\n");
        breck;
        case 3:
        printf("WEDNESDAY\n");
        breck;
        case 4:
        printf("THURSDAY\n");
        breck;
        case 5:
        printf("FRIDAY\n");
        breck;
        case 6:
        printf("SATURDAY\n");
        breck;
        case 7:
        printf("SUNDAY\n");
        breck;
        default:
        printf("invalid input");
        breck;
    }
    printf("Thank You");
    getch();
}