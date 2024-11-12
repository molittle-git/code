#include <vector>
#include<iostream>
#include<unordered_map>
using namespace std;
void get_div(int a){
    vector<int>res;
    for(int i=1;i<=a;i++){
        if(a%i==0){
            res.push_back(i);
            if(i!=a/i)res.push_back(a/i);
        }
    }
}
//求n个数的乘积的约数个数
unordered_map<int ,int>primes;
void geth(int x){
    for(int i=2;i<=x/i;i++){
        while(x%i==0){
            x/=i;
            primes[i]++;
        }
    }
    if(x>1)primes[x]++;
}
int main(){
    long long res=1;
    //总约数个数
     for(auto prime :primes){
    // res=res*(prime.second+1);
//}
    //总约数之和
    long long t=1;
    int p=prime.first,a=prime.second;
    while(a--){t=(t*p+1);}
    res=res*t;

}
}
