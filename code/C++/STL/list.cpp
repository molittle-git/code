#include<iostream>
#include<list>
using namespace std;
int main()
{
    int T,n;
    list<int>a;
    list<int>::iterator it;
    cin>>T;
    while(T--)
    {
        cin>>n;
        a.clear();
        int k=2;
        for (int i = 1; i <=n; i++){
            a.push_back(i);}
            while(a.size()>3)
            {
                int cnt=1;
                for (it=a.begin();it!=a.end();)
                {
                   if(cnt++%k==0)
                   it=a.erase(it);
                   else
                   it++;
                }
                k=(k==2?3:2);
            }
        
        for(it=a.begin();it!=a.end();it++)
        {
    
        cout<<(*it)<<" ";
        }
  
    cout<<endl;
  }
    return 0;
}
