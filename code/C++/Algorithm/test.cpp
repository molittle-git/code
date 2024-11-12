#include<bits/stdc++.h>
using namespace std;
struct mark{
    int a,h;
};
mark a[5000];
bool cmp(mark x,mark y){
    if(x.a>y.a)return 1;
    if(x.a==y.a&&x.h<y.h)return 1;
    return 0;
}
int main(){
    int n,m,pass,s=0;
    cin>>n>>m;
    for(int i=1;i<=n;i++){
        cin>>a[i].h>>a[i].a;
    }
    sort(a+1,a+n+1,cmp);
    pass=floor(m*1.50);
    cout<<a[pass].a<<" ";
    s=pass;
    while(a[s].a==a[s+1].a&&s<=n)s++;
    cout<<s<<endl;
    for(int j=1;j<=s;++j)cout<<a[j].h<<" "<<a[j].a<<endl;
    return 0;
}