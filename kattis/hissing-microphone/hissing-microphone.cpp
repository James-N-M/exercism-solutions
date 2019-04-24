#include <iostream>
#include <cstring>
using namespace std;

int main() 
{
    char str1[30]; 
    cin >> str1; 
    int flag = 0; 
    for(int i = 0; i < strlen(str1); i++)
    {   
        try 
        { 
            if(str1[i] == 's' && str1[i+1] == 's')
            {
                cout << "hiss" << '\n';  
                flag = 1; 
                break;
            }
        } 
        catch (const std::exception& e) { /* */ }
    }
    
    if(flag == 0)
        cout << "no hiss" << '\n'; 

    return 0;
}