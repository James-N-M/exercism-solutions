#include <stdio.h>
#include <stdlib.h>

int main(){
    
        
        int P; // Amount of test Cases
        int K; // Case #
        int N; // The number to perform functions on
        
        scanf("%d",&P);
        // Outer Control Loop
        
        // iterators i, p n
        int i , p , n;
        
        for(p = 0 ; p < P; p++)
        {
            int S1 = 0 , S2 = 0, S3 = 0;
                //K = keyboard.nextInt();
            //N = keyboard.nextInt();
            scanf("%d",&K);
            scanf("%d",&N); 
            
            for(i = 1; i <= N; i++)
            {
                S1+=i;
            }
            
            for(i = 1,n = N; n > 0; i++ )
            {
                if((i % 2) != 0)
                {
                    S2 += i ;
                    n--;
                }
            }
            
            for(i = 1,n = N; n > 0; i++ )
            {
                if((i % 2) == 0)
                {
                    S3 += i ;
                    n--;
                }
            }
            printf("%d %d %d %d\n", K, S1, S2, S3);
            //System.out.println( K + " " + S1 + " " + S2 + " " + S3  );
        }
    }
    