#include<iostream>
#include<set>
using namespace std;
set<int>sum;
int main()
{
    int n,m;
    while(cin>>n>>m)
    {
        sum.clear();
        for (int i = 0; i < n; i++)
        {
            int x;
           cin>>x;
           sum.insert(x);
        }
        for (int j= 0; j < m;j++)
        {
            int x;
           cin>>x;
           sum.insert(x);
        }
        for(set<int>::iterator it=sum.begin();it!=sum.end();it++)
        {
            if(it!=sum.begin())
            cout<<" ";
            cout<<*it;
        }
        cout<<endl;
    }
    return 0;
}