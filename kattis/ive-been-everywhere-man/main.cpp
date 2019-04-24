#include <iostream>
#include <algorithm>
#include <map>
#include <sstream>

using namespace std;

// T < 50 test cases
// per T  .. n is the number of trips
// each trip store in map but key and increment value
// no duplicate keys
int main(){

    int T;

    std::map<std::string,int> trips;

    cin >> T;

    for(int i = 0 ; i < T; i++)
    {
        int n;
        string s;
        std::map<std::string,int> trips;


        cin >> n; // size of test case

        for(int j = 0 ; j < n; j++)
        {
           cin >> s;
            ++trips[s];
        }
        cout << trips.size() << endl;
    }

return 0;
}