package Data_Structure;
import java.util.*;
public class GraphUsingBFS {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of vertices and edges:  ");
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graph graph=new Graph(v);
		System.out.println("Enter"+e +"edge");
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdge(source, destination);
		}
	}
	


public class Grapph{
	private LinkedList<Integer>adj[];
	public Grapph(int v) {
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<>();
			
		}
	}
	
	//Inslizing the BFS
	public int BFS(int source,int destination ) {
		boolean vis[]=new boolean[adj.length];
		int parent[]=new int [adj.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		parent[source]=-1;
		vis[source]=true;
		while(!q.isEmpty()) {
			int cur=q.poll();
			if(cur==destination) {
				break;
			}
			for(int neighbor:adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor]=true;
					q.add(neighbor);
					parent[neighbor]=cur;
					
					}
				}
			}
		int cur=destination;
		int distance=0;
		while(parent[cur]!=-1) {
			System.out.println(cur+" -> ");
			cur=parent[cur];
			distance++;
		}
		return distance;
		}
	
	public void addEdge(int source,int destinaton) {
		adj[source].add(destinaton);
		adj[destinaton].add(source);
		
	}
	
	
}
}
	
