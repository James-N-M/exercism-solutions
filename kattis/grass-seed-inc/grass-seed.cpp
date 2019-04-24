//
// Created by James on 2017-03-25.
//

#include <iostream>
#include <iomanip>



using namespace std;

int main(){

    double cost;
    int L;
    double total;
    cin >> cost;
    cin >> L;
    do{
        double wi, li;
        cin >> wi >> li;
        total += (wi * li);
        L--;
    }while(L > 0);


    std::cout << std::fixed;
    std::cout << std::setprecision(8);
    std::cout << (total * cost);


    return 0;
}