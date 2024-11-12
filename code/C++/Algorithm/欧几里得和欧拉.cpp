int gcd(int m,int n){
    return m%n ==0?n:gcd(n,m%n);
}
