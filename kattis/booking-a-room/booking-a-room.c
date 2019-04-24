#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int r, n, i ; 
    scanf("%d %d", &r, &n); 
    int array[r];
    
    for(i = 0 ; i < r; i++)
    {
        array[i] = 0;
    }
    
    for(i = 0 ; i < n; i++)
    {
        int value;
        scanf("%d",&value); 
        for(int j = 1; j <= r; j++)
        {
            if(j == value)
            {
                array[j-1] = 1; 
            }
        }
    } 
    
    for(i = 0 ; i < r; i++)
    {
        if(array[i] == 0)
        {
            printf("%d",i+1);
                return 0; 
        }
    }
    
    printf("too late"); 
    return 0 ; 
}