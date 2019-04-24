#include <stdio.h>

int main(){
    
    int N, T;
    
    scanf("%d %d", &N, &T);
    
    int array[N];
    int sum = 0, count = 0; 
    int i;
    for(i = 0 ; i < N; i++)
    {
        scanf("%d",&array[i]);  
    }
    
    for(i = 0 ; i < N; i++)
    {
        sum+=array[i];
        
        if(sum > T)
        {
            sum -= array[i];
            break;
        }
        count ++; 
    }
    
    printf("%d",count); 
    
    
    return 0; 
}
