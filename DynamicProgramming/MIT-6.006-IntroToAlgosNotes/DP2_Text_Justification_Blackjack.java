//MIT OpenCourseWare - https://www.youtube.com/watch?v=ENyox7kNKeY&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=21&t=107s

/*
How to interpret DP?
1. DP ~ Carefull Brute Force
2. DP ~ Guessing + Recursion + Memoization
        Guessing ==> Carefull brute force - to pick the best one
        Recursion ==> express solution of the problem in terms of solution of sub-problems.
                      Look for SUBSTRUCTURES in the problem to find the recursive relation.
        Memoization ==> Recursion is exponential in time, using memoization we make it polynomial time.
                        Memoization avoids recomputation.
3. DP ~ Shortest path in Directed Acyclic Graph
Time  = (number of subproblems)*(time per subproblem)


5 steps to DP:
  1. Define SUBPROBLEMS ==> number of subproblems
  2. Guess (Part of Solution) ==> number of choices
  3. Relate subproblem solutions (usually with a recurrence) ==> time per subproblem [similar to num of choices]
  4. Recurse and memoize ==> check subproblem reccurence [in terms of formula/min or max optimization]
            OR           ==> check subproblem reccurence is acyclic ie. has topological order
     Build DP table Bottom-up (using loops - more practical and faster)
  5. Solve orignal problem ==> total time
*/
