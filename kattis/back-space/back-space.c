#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(){
    
    char input [1000000]; 
    scanf("%s",input); 
    char myStack [strlen(input)]; 
    int t = -1; 
    
    int i; 
    
    for(i = 0; i < strlen(input); i++)
    {
        if(input[i] == '<')
        {
            if(t!=-1)
            {
                t = t-1; 
            }
        }
        else
        {
            t = t + 1;
            myStack[t] = input[i];
        }
    }
    
    for(i = 0; i <= t; i++)
        {
            printf("%c",myStack[i]);
        }
    return 0 ; 
}
