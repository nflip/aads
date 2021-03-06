package edu.aa12;

/**
 * Here's a wicked-ass comment (or wicked ass-comment)
 * @author Thomas Jespersen <tj@asseco.dk>
 *
 */
public class MainMethods {

	public static void main(String[] args){
        solveGraph(new Instance0());
		solveGraph(new Instance1());
		solveGraph(new Instance2());
//		solveGraph(new Instance3());
	}
	
	public static void solveGraph(Graph g){
		BranchAndBound_TSP solver = new BranchAndBound_TSP(g, new SimpleStrategy());
		long start = System.nanoTime();
		BnBNode n = solver.solve();
		long end = System.nanoTime();
		System.out.printf("Took %.2fms\n",(end-start)/1000000.0);
//		System.out.println(n);
//		Visualization.visualizeSolution(g, n);//Requires ProGAL (www.diku.dk/~rfonseca/ProGAL)
	}
}
