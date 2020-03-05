#include <iostream>
#include<math.h>
using namespace std;
int main(){
    int n,i;
    float sum=0.0;
    cout<<"Enter no. of line to get pattern:\t";
    cin>>n;
    sum=(7*n/9) - (7*(1-pow((0.1),n))/81);
    cout<<"SUM == "<<sum;
return 0;
}
