#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
    int N;
    printf("Nhap N: ");
    scanf("%d", &N);
    int i = 2;
    int A[N];
    for (int i = 0; i < N; i++)
    {
        A[i] = 0;
    }

    for (int i = 2; i < N; i++)
    {
        if (A[i] == 0)
        {
            printf("So nguyen to: %d \n", i);
            for (int j = i + i; j < N; j += i)
            {
                A[j] = -1;
            }
        }
    }
    printf("Het vong for\n");

    while (i < N)
    {
        //printf("dang kiem tra %d ", i);

        if (A[i] == 0)
        {
            printf("%d la so nguyen to.\n", i);
            int j = i + i;
            while (j < N)
            {
                A[j] = -1;
                j = j + i;
            }
        }
        i++;
    }

    return 0;
}
