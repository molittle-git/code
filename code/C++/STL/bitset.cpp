#include<iostream>
#include<bitset>
using namespace std;
bitset<1010>s[10010];
int main()
{
    int N,Q,num,x,y;
    cin>>N;
    for (int i = 1; i <=N; i++)
    {
        cin>>num;
        while(num--)
        {
            cin>>x;
            s[x][i]=1;
        }
    }
    cin>>Q;
    while(Q--){
        cin>>x>>y;
        if((s[x]&s[y]).count())
        cout<<"Yes"<<endl;
        else cout<<"No"<<endl;
    }
    return 0;
}
