#include<iostream>
#include<iomanip>
#include<cstring>
using namespace std;
#include<queue>
class point
{public:
int x,y;
int step;
};
int dx[8]={-2,-2,-1,-1,2,2,1,1};
int dy[8]={1,-1,2,-2,-1,1,-2,2};
int  num,sx,sy,ex,ey,tx,ty,L;
int bfs()
{
    if(sx==ex&&sy==ey){return 0;}
  bool vis [L+1][L+1];
  memset(vis,false,sizeof(vis));
  queue<point>Q;
  point start,node;
  start.x=sx;
  start.y=sy;
  start.step=0;
  Q.push(start);
  int step,x,y;
  while(!Q.empty())
  {
    start=Q.front(),Q.pop();
    x=start.x;
    y=start.y;
    step=start.step;
    for(int i=0;i<8;i++)
    {
    tx=x+dx[i];
    ty=y+dy[i];
    if(tx==ex&&ty==ey)return step+1;
    if(tx>=0&&tx<L&&ty>=0&&ty<L&&!vis[tx][ty])
    {
      node.x=tx;
      node.y=ty;
      node.step=step+1;
      Q.push(node);
      vis[tx][ty]=true;
    }
    }
  }
}
int  main()
{
  cin>>num;
  int*ps=new int[10];
  for (int i = 0; i <num; i++)
  {
    cin>>L;
    cin>>sx>>sy;
    cin>>ex>>ey;
    ps[i]=bfs();
  }
  for(int i=0;i<num;++i)
  {
    cout<<ps[i]<<endl;
  }
  delete[]ps;
  return 0;
}