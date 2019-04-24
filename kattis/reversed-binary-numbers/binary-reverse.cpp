#include <iostream>
#include <vector>
#include <cmath>

using namespace std;
int main(){
  int number;
  vector<int> binaryRep;
  int remain = 0, radix = 2;
  int total = 0, i = 0 ;



   cin >> number; 
  while(number != 0)
  {
    binaryRep.push_back(number % radix);
    number = number / radix;
  }
/*
  for(unsigned int j = 0 ; j < binaryRep.size(); j++)
  {
    cout << binaryRep[j] << " ";
  }
*/

  for( int j = binaryRep.size() - 1; j >= 0; j--)
  {
    if(binaryRep[j] == 1)
    {
      total += pow(radix,i);
    }
    i++;
    /*
    cout << "total:" <<total << endl;
    cout << "binary digit:" << binaryRep[j] << endl ;
    */
  }
  cout << total;

}