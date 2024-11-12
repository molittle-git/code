#include<iostream>
#include<queue>
using namespace std;
priority_queue<int>q1;
priority_queue<int,vector<int>,greater<int>>q2;
int main()
{
    int m, n,x;
    cin>>m>>n;
    int cnt=1;
    int a[100];
    for(int i=1;i<=m;i++)
    cin>>a[i];
    for (int i = 1; i <=n; i++)
    {
        cin>>x;
        while(cnt<=x)
        {
            if(!q1.empty()&&a[cnt]<q1.top())
            {
                q2.push(q1.top());
                q1.pop();
                q1.push(a[cnt]);
            }
            else
            q2.push(a[cnt]);
            cnt++;
        }
        cout<<q2.top()<<endl;
        q1.push(q2.top());
        q2.pop();      
    }
    return 0;
}