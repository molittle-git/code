// #include<iostream>
// #include<string>
// #include<deque>
// using namespace std;
// deque<int>Q[100];
// int main()
// {
//     int n,m;
//     while(cin>>n>>m)
//     {
//         for (int i = 1; i <=n; i++)
//         {
//             Q[i].clear();
//             int a,u,v,w,val;
//             for (int i = 0; i <m; i++)
//             {
//                 cin>>a;
//                 if(a==1)
//                 {
//                     cin>>u>>w>>val;
//                     if(w==0)
//                 Q[u].push_front(val);
//                 else 
//                 Q[u].push_back(val);
//                 }
//                 else if(a==2)
//                 {
//                     cin>>u>>w;
//                     if(!Q[u].empty())
//                     {
//                         if(w==0){
//                             cout<<Q[u].front()<<endl;
//                             Q[u].pop_back();
//                         }
//                         else
//                         {
//                             cout<<Q[u].back()<<endl;
//                             Q[u].pop_back();
//                         }
//                     }
//                     else
//                     cout<<"-1"<<endl;
//                 }
//                 else{
//                     cin>>u>>v>>w;
//                     if(w==0)
//                     {
//                         while(!Q[v].empty())
//                         {
//                             Q[u].push_back(Q[v].front());
//                             Q[v].pop_front();
//                         }
//                     }
//                 else{
//                     while(!Q[v].empty())
//                     {
//                         Q[u].push_back(Q[v].back());
//                     }
//                 }
//                 }
//             }
            
//         }
        
//     }
//     return 0;
// }
#include<bits/stdc++.h>
using namespace std;
#define endl '\n'
list<int>l[150005];
int main(){
    // ios::sync_with_stdio(0);
    // cin.tie(0),cout.tie(0);
    int n,q;
    while(cin>>n>>q){
        for(int i=1;i<=n;i++){
            l[i].clear();
        }
    while(q--){
        //cout<<"--------------"<<endl;
        int op,u,v,w,val;
        cin>>op;
        if(op==1){
            cin>>u>>w>>val;
            if(w==0){
                l[u].push_front(val);//前面加
            }
            else l[u].push_back(val);//后面加
        }
        else if(op==2){
            //cout<<222<<endl;
            cin>>u>>w;
            if(l[u].empty()){
                cout<<-1<<endl;
                continue;
            }
            if(w==0){
                cout<<l[u].front()<<endl;
                l[u].pop_front();//最前面的出列
            }
            else{
                cout<<l[u].back()<<endl;
                l[u].pop_back();//最后面出列
            }
 
        }
        else if(op==3){//
            cin>>u>>v>>w;
            if(w==0){//u+v，v清空
            l[u].insert(l[u].end(),l[v].begin(),l[v].end());
            l[v].clear();
            }
            else{//v反转后，u+v,v清空
                l[u].insert(l[u].end(),l[v].rbegin(),l[v].rend());
                l[v].clear();
            }
        }
    }
    }   
   
}