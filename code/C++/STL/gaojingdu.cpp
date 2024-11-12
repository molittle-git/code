#include<iostream>
#include<vector>
#include<algorithm>
#include <string>
using namespace std;
const int N=1e6+10;
//-
// bool cmp(vector<int>&A,vector<int>&B){
//     if(A.size()!=B.size())return A.size()>B.size();
//     for(int i=A.size()-1;i>=0;i--){
//         if(A[i]!=B[i]) return A[i]>B[i];
//         return true;
//     }
// }
// vector<int>sub(vector<int>&A,vector<int>&B){
//     vector<int>C;
//     for(int i=0,t=0;i<A.size();i++){
//         t=A[i]-t;
//         if(i<B.size()) t-=B[i];
//         C.push_back((t+10)%10);
//         if(t<0)t=1;else t=0;
//     }
//     while(C.size()>1&&C.back()==0) C.pop_back();
//     return C;
// }
//+
// vector<int>add(vector<int>&A,vector<int>&B){
//     vector<int>C;
//     int t=0;
//     for(int i=0;i<A.size()||i<B.size();i++){
//         if(i<A.size()) t+=A[i];
//         if(i<B.size()) t+=B[i];
//         C.push_back(t%10);
//         t/=10;
//     }
//     if(t) C.push_back(1);
//     return C;
// }
//*
// vector<int>mul(vector<int>&A,int b){
//     vector<int>C;
//     int t=0;//进位
//     for(int i=0;i<A.size()||t;i++){
//        if(i<A.size()) t+=A[i]*b;
//         C.push_back(t%10);
//         t/=10;
//     }
//   return C;
//     }
vector<int>div(vector<int>&A,int b,int& r)
{
    vector<int>C;
    r=0;
    for(int i=A.size()-1;i>=0;i--){
        r=r*10+A[i];
        C.push_back(r/b);
        r%=b;
    }
 reverse(C.begin(),C.end());
 while(C.size()>1&&C.back()==0)C.pop_back();
 return C;
}
int main(){
    // string a,b;
    // vector<int>A,B;
    // cin>>a>>b;
    // for(int i=a.size()-1;i>=0;i--) A.push_back(a[i]-'0');
    // for(int i=b.size()-1;i>=0;i--) B.push_back(b[i]-'0');
    // auto C=add(A,B);
    // if(cmp(A,B)){
    //     auto D=sub(A,B);
    // for(int i=C.size()-1;i>=0;i--) cout<<C[i];
    //     cout<<endl;
    // }
    // else{
    //     auto C=sub(B,A);
    //     cout<<"-";//注意别忘了输出负号
    // for(int i=C.size()-1;i>=0;i--) cout<<C[i];     
    // }
    // cout<<endl;//注意别忘了输出
    //
// string c;
// int d;
// cin>>c>>d;
// vector<int>A;
// for(int i=c.size()-1;i>=0;i--) A.push_back(c[i]-'0');
// auto E=mul(A,d);
// for(int i=E.size()-1;i>=0;i--){
//     cout<<E[i];
// }
ios::sync_with_stdio(false);
string e;
int f;
cin>>e>>f;
vector<int>F;
for(int i=e.size()-1;i>=0;i--) F.push_back(e[i]-'0');
int r;
auto G=div(F,f,r);
for(int i=G.size()-1;i>=0;i--) cout<<G[i];
return 0;
}