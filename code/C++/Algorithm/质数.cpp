#include <stdio.h>
bool is_prime(int x)
{
    if(x<2)return false;
    for(int i=2;i<=x/i;i++)
    //根号n的复杂度
        if(x%i==0)
            return false;
    return true;      
}
void divide(int n)
{
    for(int i=2;i<=n/i;i++)
        if(n%i==0){
            int cnt=0;
            while(n%i==0)
            {
                n/=i;
                cnt++;
            }
           // printf("%d %d\n",i,cnt)
        }
        //if(n>1)printf("%d %d\n",n,1)
}
//试除法
#include<iostream>
using namespace std;
int n;
bool isPrime(int x)
{
    if(x==1)return false;
    for(int i=2;i<=x/i;i++)
        if(x%i==0)
            return false;
    return true;
}
int main()
{
    scanf("%d",&n);
    while(n--)
    {
        int a;
        scanf("%d",&a);
        printf(is_prime(a)?"YES\n":"NO\n");
    }
    return 0;
}