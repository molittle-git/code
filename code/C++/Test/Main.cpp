#include<iostream>
using namespace std;
int sp,n;
string c[206];
void printff(){
    for(int i=1;i<=2*n+2;i++){
        cout<<c[i];
    }
    cout<<endl;
}
void move(int p){
    for(int j=0;j<=1;j++){
        c[sp+j]=c[p+j];
        c[p+j]="-";
    }
    sp=p;
    printff();
}
void pu(int k){
    if(k==4){
        move(4);move(8);move(2);move(7);move(1);
    }else{
        move(k);move(2*k-1);pu(k-1);
    }
}
int main(){
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        c[i]="o";
    }
        for(int i=n+1;i<=2*n;i++){
            c[i]="*";
         
        }  
        c[2*n+1]='-';
        c[2*n+2]="-";
        sp=2*n+1;
        printff();
        pu(n);
        return 0;
}