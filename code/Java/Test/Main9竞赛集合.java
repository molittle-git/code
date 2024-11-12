// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner;
// import java.util.Set;
// import java.util.Stack;
// import java.util.TreeSet;

// public class Main9竞赛集合 {
//     public static void main(String[] args) throws Exception {
//   List<Integer> list = new ArrayList<>();
//   List<Integer> two = new ArrayList<>();
//   //增加
//   list.add(5); //单个增加
//   list.add(2,9); //在指定位置2插入元素9
//   list.addAll(two); //将集合two中的元素全部添加到list中
//   list.addAll(3,two); //在指定位置将集合two中的元素全部添加到list中
//   //删除
//   list.clear(); //删除所有元素
//   list.remove(2); //删除指定索引下标元素
//   list.removeAll(two); //删除list中存在于指定集合two中的元素

//   //查找
//   list.lastIndexOf(5); //返回指定元素在 arraylist 中最后一次出现的位置
//   list.contains(2); //判断元素是否存在
//   list.retainAll(two); //保留list中在指定集合two中也存在的那些元素
//   list.containsAll(two);  //查看list是否包含指定集合two中的所有元素
//   list.indexOf(6); //返回list中元素的索引值
//   list.get(6); //通过索引获取元素

//   //替换
//   list.set(2,5); //替换list中指定索引为2的元素为5

//   //其他操作
//   list.isEmpty(); //判断list是否为空
//   list.size(); //返回list里元素数量
//   list.subList(2,6); //通过索引截取部分list中的元素
//   list.equals(two); //将指定的对象与此列表进行比较以获得相等性,当大小、内容全部相同返回true，否则返回false
//   list.toArray(); //以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组,也可以指定返回数组的类型
// }
// public static void main(String[] args) throws Exception {
//   Set<Integer> ttf = new TreeSet<>();
//   Set<Integer> two = new TreeSet<>();
//   //增加
//   ttf.add(5); //单个增加
//   ttf.addAll(two); //将集合two中的元素全部添加到ttf中
//   //删除
//   ttf.clear(); //删除所有元素
//   ttf.remove(2); //删除指定元素
//   ttf.removeAll(two); //删除ttf中存在于指定集合two中的元素

//   //查找
//   ttf.contains(2); //判断元素是否存在
//   ttf.retainAll(two); //保留ttf中在指定集合two中也存在的那些元素
//   ttf.containsAll(two);  //查看ttf是否包含指定集合two中的所有元素

//   //其他操作
//   ttf.isEmpty(); //判断ttf是否为空
//   ttf.size(); //返回ttf里元素数量
//   ttf.equals(two); //将指定的对象与此列表进行比较以获得相等性,当大小、内容全部相同返回true，否则返回false
//   ttf.toArray(); //以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组,也可以指定返回数组的类型
// }
// public static void main(String[] args) throws Exception {
//   Map<String,Integer> map = new HashMap<>();
//   Map<String,Integer> two = new HashMap<>();
//   //增加
//   map.put("key",123);
//   map.putAll(two); //将指定map复制到此map（可选操作）。
//   //删除
//   map.clear(); //删除所有的映射（可选操作）。
//   map.remove("key"); //如果存在，从该地图中删除一个键的映射。
//   map.remove("key",159); //删除符合的键值对
//   //查找
//   map.containsKey("key"); //如果此映射包含指定键的映射，则返回 true 。
//   map.containsValue("value"); //如果此地图将一个或多个键映射到指定的值，则返回 true 。
//   map.entrySet(); //返回包含映射的Set集合,返回类型 Set<Map.Entry<K,V>>
//   map.get("key"); //返回指定键所映射的值，如果没有此键则返回null
//   map.getOrDefault("key",456); 返回指定键所映射的值，如果没有则返回设置的默认值。
//   map.keySet(); //返回包含的键的Set集合。Set<K>
//   map.values(); //返回包含的值的Collection集合。 Collection<V>
//   //替换
//   map.replace("key", 456); //找到指定的键，修改并返回原来的值。
//   map.replace("key", 123, 789); //找到key为key，值为123的，才将123修改为789。否则不修改。
//   //其他
//   map.isEmpty(); //如果不包含键值映射，则返回 true 。
//   map.equals("156"); //将指定的对象与此映射进行比较
//   map.putIfAbsent("key",789); //如果指定的键尚未与某个值相关联（或映射到 null ）,则将其与给定值相关联并返回 null ，如果已经有关联的值，则返回。
//   map.size(); //键值对的数量
// }
// public static void main(String[] args) throws Exception {
//   Scanner sc = new Scanner(System.in);
//   LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
//   lm.put("C",3);
//   lm.put("A",1);
//   lm.put("B",2);
//   lm.put("D",4);
//   Set<Map.Entry<String, Integer>> ent = lm.entrySet();
//   Iterator<Map.Entry<String, Integer>> it = ent.iterator();
//   while(it.hasNext()){
//     Map.Entry<String,Integer> mid = it.next();
//     System.out.println(mid.getKey());
//     System.out.println(mid.getValue());
//   }
// }

// //输出
// C
// 3
// A
// 1
// B
// 2
// D
// 4
// public static void main(String[] args) throws Exception {
//     Scanner sc = new Scanner(System.in);
//     LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
//     lm.put("C",3);
//     lm.put("A",1);
//     lm.put("B",2);
//     lm.put("D",4);
//     Set<Map.Entry<String, Integer>> ent = lm.entrySet();
//     Iterator<Map.Entry<String, Integer>> it = ent.iterator();
//     while(it.hasNext()){
//       Map.Entry<String,Integer> mid = it.next();
//       System.out.println(mid.getKey());
//       System.out.println(mid.getValue());
//       mid.setValue(23);
//     }
//     System.out.println("修改后：");
//     Iterator<Map.Entry<String, Integer>> it2 = ent.iterator();
//     while(it2.hasNext()){
//       Map.Entry<String,Integer> mid = it2.next();
//       System.out.println(mid.getKey());
//       System.out.println(mid.getValue());
//     }
//   }
  
//   //输出
//   C
//   3
//   A
//   1
//   B
//   2
//   D
//   4
//   修改后：
//   C
//   23
//   A
//   23
//   B
//   23
//   D
//   23
//       public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         Stack<Integer> s = new Stack<Integer>();
//         System.out.println(s.empty()? "是空的":"不是空的");
//         System.out.println("现在Stack的大小为："+s.size());
//         System.out.println("输入第一个元素：");
//         int a = sc.nextInt();
//         s.push(a);
//         System.out.println(s.empty()? "是空的":"不是空的");
//         System.out.println("现在Stack的大小为："+s.size());
//         System.out.println("输入第二个元素：");
//         int b = sc.nextInt();
//         s.push(b);
//         System.out.println(s.empty()? "是空的":"不是空的");
//         System.out.println("现在Stack的大小为："+s.size());
//         System.out.println("输入第三个元素：");
//         int c = sc.nextInt();
//         s.push(c);
//         System.out.println(s.empty()? "是空的":"不是空的");
//         System.out.println("现在Stack的大小为："+s.size());

//         System.out.println("Stack中的元素有：");
//         while (!s.empty()){
//             System.out.println(s.peek());
//             System.out.println("删除了："+s.pop()); //删除
//         }

//     }

// //依次输入
// 7 
// 13 
// 23
// //输出
// 是空的
// 现在Stack的大小为：0
// 输入第一个元素：
// 7
// 不是空的
// 现在Stack的大小为：1
// 输入第二个元素：
// 13
// 不是空的
// 现在Stack的大小为：2
// 输入第三个元素：
// 23
// 不是空的
// 现在Stack的大小为：3
// Stack中的元素有：
// 23
// 删除了：23
// 13
// 删除了：13
// 7
// 删除了：7

// import java.util.LinkedList;
// import java.util.Queue;
 
// public class Main {
//     public static void main(String[] args) {
//         //add()和remove()方法在失败的时候会抛出异常(不推荐)
//         Queue<String> queue = new LinkedList<String>();
//         //添加元素
//         queue.offer("a");
//         queue.offer("b");
//         queue.offer("c");
//         queue.offer("d");
//         queue.offer("e");
//         for(String q : queue){
//             System.out.println(q);
//         }
//         System.out.println("===");
//         System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
//         for(String q : queue){
//             System.out.println(q);
//         }
//         System.out.println("===");
//         System.out.println("element="+queue.element()); //返回第一个元素 
//         for(String q : queue){
//             System.out.println(q);
//         }
//         System.out.println("===");
//         System.out.println("peek="+queue.peek()); //返回第一个元素 
//         for(String q : queue){
//             System.out.println(q);
//         }
//     }
// }
// //自定义比较器，降序排列
// static Comparator<Integer> cmp = new Comparator<Integer>() {
//     public int compare(Integer e1, Integer e2) {
//       return e2 - e1;
//     }
//   };
// public static void main(String[] args) {
//       //不用比较器，默认升序排列
//       Queue<Integer> q = new PriorityQueue<>();
//       q.add(3);
//       q.add(2);
//       q.add(4);
//       while(!q.isEmpty())
//       {
//           System.out.print(q.poll()+" ");
//       }
//       /**
//        * 输出结果
//        * 2 3 4 
//        */
//       //使用自定义比较器，降序排列
//       Queue<Integer> qq = new PriorityQueue<>(cmp);
//       qq.add(3);
//       qq.add(2);
//       qq.add(4);
//       while(!qq.isEmpty())
//       {
//           System.out.print(qq.poll()+" ");
//       }
//       /**
//        * 输出结果
//        * 4 3 2 
//        */
// }
// //矩形类
// class Node{
//     public Node(int chang,int kuan)
//     {
//         this.chang=chang;
//         this.kuan=kuan;
//     }
//     int chang;
//     int kuan;
// }

// public class Test {
// 　　　　//自定义比较类，先比较长，长升序排列，若长相等再比较宽，宽降序
//     static Comparator<Node> cNode=new Comparator<Node>() {
//         public int compare(Node o1, Node o2) {
//             if(o1.chang!=o2.chang)
//                 return o1.chang-o2.chang;
//             else
//                 return o2.kuan-o1.kuan;
//         }
        
//     };
//     public static void main(String[] args) {
//         Queue<Node> q=new PriorityQueue<>(cNode);
//         Node n1=new Node(1, 2);
//         Node n2=new Node(2, 5);
//         Node n3=new Node(2, 3);
//         Node n4=new Node(1, 2);
//         q.add(n1);
//         q.add(n2);
//         q.add(n3);
//         Node n;
//         while(!q.isEmpty())
//         {
//             n=q.poll();
//             System.out.println("长: "+n.chang+" 宽：" +n.kuan);
//         }
// 　　　　　/**
// 　　　　　　* 输出结果
// 　　　　　　* 长: 1 宽：2
// 　　　　　　* 长: 2 宽：5
// 　　　　　　* 长: 2 宽：3
// 　　　　　　*/
//     }
// }
// Queue<Integer> q = new PriorityQueue<>(cmp);
//         int[] nums= {2,5,3,4,1,6};
//         for(int i:nums)
//         {
//             q.add(i);
//         }
//         Object[] nn=q.toArray();
//         Arrays.sort(nn);
//         for(int i=nn.length-1;i>=0;i--)
//             System.out.print((int)nn[i]+" ");
//         /**
//          * 输出结果
//          * 6 5 4 3 2 1 
//          */
//         Comparator<Object> cmp = new Comparator<Object>() {
//             public int compare(Object o1, Object o2) {
//                 //升序
//                 return o1-o2;
//                 //降序
//                 return o2-o1;
//             }
//         };
//         public static void main(String[] args) throws Exception {
//             Scanner sc = new Scanner(System.in);
//             //单个
//             Pair<String,Integer> test = new Pair<>("qwer",234);
//             System.out.println(test.getKey());
//             System.out.println(test.getValue());
    
//             //数组
//             Pair<String,Integer>[] pair = new Pair[52];
//             pair[0] = new Pair<>("23",23);
//             pair[1] = new Pair<>("2323",2323);
//             pair[2] = new Pair<>("223343",2343);
//             for (int i = 0; i < 3; i++) {
//                 String s = pair[i].getKey();
//                 System.out.println(s);
//                 int t  = pair[i].getValue();
//                 System.out.println(t);
//             }
    
//         }
        
// }
