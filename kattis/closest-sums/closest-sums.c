#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

    int N,M;
    int i, j, x;
    int min;
    int num1, num2;
    int count = 1;
    while(scanf("%d",&N) != EOF){
    printf("Case %d:\n",count++);

    int array1[N];

    for(i = 0 ; i < N; i++)
    {
        scanf("%d",&array1[i]);
    }

    scanf("%d",&M);
    int query[M];

    for(i = 0 ; i < M; i++)
    {
        scanf("%d",&query[i]);
    }

    for(x = 0 ; x < M; x++)
    {
        int min = 20000000;
        num1 = 0, num2 = 0;

        for(i = 0 ; i < N - 1; i++)
        {
            for(j = i + 1; j < N; j++)
            {
                if(abs(query[x] - (array1[i] + array1[j])) <= min )
                {
                    num1 = array1[i];
                    num2 = array1[j];
                    min =  abs(query[x] - (array1[i] + array1[j]));
                }
            }
        }
        printf("Closest sum to %d is %d.\n",query[x],(num1+num2));
    }
    }
}