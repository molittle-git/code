//线性
const int N=10001;
int primes[N],cnt=0;
bool st[N];
void get_prime(int n) {
    for(int i=2;i<=n;i++){
        if(!st[i])primes[cnt++]=i;
        for(int j=0;primes[j]<=n/i;j++){
            st[primes[j]*i]=true;
            if(i%primes[j]==0)break;
        }
    }
}
//埃式
void get_p(int n){
    for(int i=2;i<=n;i++){
        if(!st[i])primes[cnt++]=i;
        for(int j=i*i;j<=n;j+=i){
                st[j]=true;
        }
        
    }
}
// class Solution {
//     public int countPrimes(int n) {
//     //埃式
//     // int cnt=0;
//     // boolean[]isPrimes=new boolean[n];
//     // for(int i=2;i*i<n;i++){
//     //     if(!isPrimes[i]){
//     //         for(int j=i*i;j<n;j+=i){
//     //             isPrimes[j]=true;
//     //         }
//     //     }
//     // }
//     //  for(int i=2;i<n;i++){
//     //     if(!isPrimes[i]){
//     //         cnt++;
//     //     }
//     // }
//     //线性
//     int cnt=0;
//     int []prime=new int[n];
//     boolean[]isPrimes=new boolean[n];
//     for(int i=2;i<n;i++){
//         if(!isPrimes[i])prime[cnt++]=i;
//         for(int j=0;i*prime[j]<n;j++){
//                 isPrimes[prime[j]*i]=true;
//                     if(i%prime[j]==0)break;
//         }
//     }
//     return cnt;
// }
// }
