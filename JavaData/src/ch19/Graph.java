package ch19;

import ch03.MyStack;

/**
 * 图
 * @author Administrator
 *
 */
public class Graph {
	//顶点数组
	private Vertex[] vertexList;
	//邻接矩阵
	private int[][] adjMat;
	//顶点的最大数目
	private int maxSize = 20;
	//当前顶点
	private int nVertex;
	//栈
	private MyStack stack;
	
	public Graph() {
		vertexList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for(int i = 0; i < maxSize; i++) {
			for(int j = 0; j < maxSize; j++) {
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;
		stack = new MyStack();
	}
	
	/**
	 * 添加顶点
	 */
	public void addVertex(char label) {
		vertexList[nVertex++] = new Vertex(label);
	}
	
	/**
	 * 添加边
	 */
	public void addEdge(int start,int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public int getadjUnvisitedVertex(int v) {
		for(int i = 0; i < nVertex; i++) {
			if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}
	
	public void dfs() {
		//首先访问0号顶点
		vertexList[0].wasVisited = true;
		//显示该顶点
		displayVertex(0);
		//压入栈中
		stack.push(0);
		while(!stack.isEmpty()) {
			//获得一个未访问过的邻接点
			int v = getadjUnvisitedVertex((int)stack.peek());
			if(v == -1) {
				//弹出一个顶点
				stack.pop();
			} else {
				vertexList[v].wasVisited = true;
				displayVertex(v);
				stack.push(v);
			}
		}
		
		//搜索完以后，要将访问信息修改
		for(int i = 0; i < nVertex; i++) {
			vertexList[i].wasVisited = false;
		}
		
	}
	
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}
	
}
