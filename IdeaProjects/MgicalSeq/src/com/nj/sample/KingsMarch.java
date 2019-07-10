package com.nj.sample;
/**
 * Why are you the best candidate for this job role? Please refer the Job description Tab to get the full description.
 * Describe a project that you have worked on.
 *
 * The King's March
 * You’re given a chess board of size n. A king occupies the bottom right square of the board marked with s. The king needs to reach the top left square marked with e. The rest of the squares are labeled either with an integer p (marking a point) or with x marking an obstacle. The king can move one square up, left and up-left (diagonal) only at a time. Find the maximum points the king can collect and the number of such paths the king can take in order to do so.
 *
 * Input Format
 * The first line of input consists of an integer t. This is the number of test cases. Each test case contains a number n which denotes the size of board. This is followed by n lines each containing n space separated tokens.
 *
 * Output Format
 * For each case, print in a separate line the maximum points that can be collected and the number of paths available in order to ensure maximum, both values separated by a space. If e is unreachable from s, print 0 0.
 *
 * Sample Input
 * 3
 * 3
 * e 2 3
 * 2 x 2
 * 1 2 s
 * 3
 * e 1 2
 * 1 x 1
 * 2 1 s
 * 3
 * e 1 1
 * x x x
 * 1 1 s
 * Sample Output
 * 7 1
 * 4 2
 * 0 0
 * Constraints
 * 1 <= t <= 100
 *
 * 2 <= n <= 200
 *
 * 1 <= p <= 9
 *
 * 25
 * 2
 * e 1
 * 1 s
 * 2
 * e x
 * x s
 * 3
 * e x x
 * x x x
 * x x s
 * 3
 * e 1 1
 * 1 1 1
 * 1 1 s
 * 4
 * e 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 s
 * 4
 * e 1 1 1
 * 1 x 1 1
 * 1 1 x 1
 * 1 1 1 s
 * 5
 * e 1 1 1 1
 * 1 1 1 1 1
 * 1 1 1 1 1
 * 1 1 1 1 1
 * 1 1 1 1 s
 * 5
 * e 1 1 1 x
 * 1 x x x 1
 * 1 x 9 x 1
 * 1 x x x 1
 * x 1 1 1 s
 * 3
 * e 2 3
 * 2 x 2
 * 1 2 s
 * 3
 * e 2 1
 * 2 x 2
 * 1 2 s
 * 3
 * e 2 x
 * 2 x 2
 * x 2 s
 * 3
 * e 1 x
 * 4 x x
 * x 1 s
 * 3
 * e 1 1
 * 1 x 1
 * 1 1 s
 * 3
 * e 1 1
 * x x x
 * 1 1 s
 * 6
 * e 9 6 1 5 5
 * 2 4 9 3 x 1
 * 6 2 8 x 4 5
 * 7 9 7 1 1 1
 * 2 3 5 4 4 4
 * 4 4 3 9 8 s
 * 9
 * e 4 x 9 1 7 5 9 1
 * 2 9 8 2 9 6 x 8 8
 * 9 5 9 5 7 1 x 2 1
 * 2 3 8 9 x 3 8 7 8
 * 8 8 9 2 x 2 7 8 2
 * 4 6 2 6 8 7 9 5 9
 * x 6 3 8 8 3 5 8 7
 * 9 5 7 3 5 8 4 8 1
 * x 4 4 5 8 7 4 1 s
 * 7
 * e 2 8 7 6 7 4
 * 2 6 6 2 x 6 7
 * 3 1 1 4 x 7 2
 * 1 4 2 6 1 7 6
 * x 7 8 9 x 4 x
 * 7 1 1 4 x 2 4
 * 8 6 5 9 1 1 s
 * 7
 * e 5 4 9 9 3 7
 * x 3 1 4 5 7 5
 * 3 6 3 x 6 x 5
 * 7 1 5 8 x 9 1
 * 8 4 3 9 6 8 3
 * 2 x x 5 9 3 7
 * 3 2 6 4 7 4 s
 * 3
 * e 6 1
 * 4 8 9
 * 9 9 s
 * 10
 * e x 6 2 x 3 5 9 8 4
 * 3 3 5 7 4 2 8 8 4 8
 * 4 2 5 8 8 5 5 x 7 2
 * 1 5 3 2 1 9 3 4 6 9
 * x x 7 1 4 3 8 3 x 1
 * x 8 8 8 8 1 4 9 5 9
 * 7 6 9 2 2 6 1 4 7 4
 * 7 9 8 2 1 4 9 8 4 x
 * 8 6 2 3 1 6 3 3 3 5
 * 2 5 7 7 9 2 4 6 3 s
 * 7
 * e 5 7 6 1 6 2
 * 1 7 8 6 3 9 1
 * 9 5 6 8 9 7 x
 * 8 5 8 5 8 7 8
 * 1 4 4 6 4 1 5
 * 8 9 6 1 5 x 8
 * 9 9 5 2 8 8 s
 * 10
 * e 6 4 9 x x 6 x 1 x
 * 4 8 6 x 2 8 x 6 5 6
 * 3 4 1 9 7 4 5 6 1 2
 * x 4 3 x 9 9 1 1 6 4
 * 9 5 3 x 8 4 5 3 x 3
 * x x x x 8 1 6 8 x x
 * 5 4 9 x x x x 5 2 x
 * 1 6 6 2 x 2 1 x 6 2
 * 5 3 x 8 9 x x 2 2 1
 * 2 3 6 1 7 8 7 3 1 s
 * 6
 * e x 9 3 8 3
 * 5 x 3 9 9 x
 * 9 7 3 8 6 1
 * x 3 8 6 2 6
 * 8 3 5 1 1 x
 * 5 x 9 6 x s
 * 7
 * e x 8 6 4 3 x
 * x x 3 8 2 6 8
 * 2 6 x 5 5 8 4
 * 4 4 4 2 7 9 x
 * x 7 8 3 x 6 3
 * 4 3 6 6 x 1 7
 * 1 x 8 2 9 5 s
 * 4
 * e 2 2 2
 * 1 x x 2
 * 1 x x 1
 * 1 1 2 s
 *
 *
 *
 * 1 2
 * 0 1
 * 0 0
 * 3 6
 * 5 20
 * 5 4
 * 7 70
 * 6 2
 * 7 1
 * 5 2
 * 4 2
 * 5 1
 * 3 2
 * 0 0
 * 65 1
 * 101 15
 * 60 1
 * 65 3
 * 23 2
 * 96 6
 * 79 4
 * 94 3
 * 41 4
 * 0 0
 * 9 1
 */

import java.util.*;
import java.util.stream.Collectors;

class Graph{
    Map<String, GNode> nodes = new LinkedHashMap<>();
    Map<String, GLink> links = new LinkedHashMap<>();

    public void construct(String[][] input)
    {

        for(int i = 0; i < input.length; i++)
        {
            for(int j = 0; j < input.length; j++)
            {
                if(!input[i][j].equals("x"))
                {
                    GNode eachIndex = new GNode();
                    eachIndex.id = ""+i+j;
                    eachIndex.val = input[i][j];
                    nodes.put(eachIndex.id, eachIndex);
                }
            }
        }
        for(int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if(nodes.containsKey(""+i+j))
                {
                    if(nodes.containsKey(""+i+(j+1)))
                    {
                        GLink link = new GLink();
                        link.aEnd = nodes.get(""+i+j);
                        link.zEnd = nodes.get(""+i+(j+1));
                        links.put(link.toString(), link);
                    }
                    if(nodes.containsKey(""+(i+1)+(j+1)))
                    {
                        GLink link = new GLink();
                        link.aEnd = nodes.get(""+i+j);
                        link.zEnd = nodes.get(""+(i+1)+(j+1));
                        links.put(link.toString(), link);
                    }
                    if(nodes.containsKey(""+(i+1)+(j)))
                    {
                        GLink link = new GLink();
                        link.aEnd = nodes.get(""+i+j);
                        link.zEnd = nodes.get(""+(i+1)+(j));
                        links.put(link.toString(), link);
                    }
                }
            }
        }
    }

    public void dfs(String start, String end, Collection<Collection<GNode>> allPaths, Collection<GNode> curPath)
    {
        GNode startNode = nodes.get(start);
        GNode endNode = nodes.get(end);
        Collection<GLink> linksFromStart = getLinksFrom(startNode);
        if(linksFromStart != null && !linksFromStart.isEmpty())
        {
            for(GLink eachLink : linksFromStart)
            {
                Collection<GNode> eachPath = new ArrayList<>();
                eachPath.addAll(curPath);
                eachPath.add(startNode);
                GNode zNode = eachLink.zEnd;
                if(zNode.equals(endNode))
                {
                    eachPath.add(zNode);
                    allPaths.add(eachPath);
                }
                else
                {
                    dfs(zNode.id, end, allPaths, eachPath);
                }
            }
        }

    }

    private Collection<GLink> getLinksFrom(GNode startNode) {
        return links.values().stream().filter(x -> x.aEnd.equals(startNode)).collect(Collectors.toList());
    }
}
class GNode
{
    String id;
    String val;
}
class GLink
{
    GNode aEnd;
    GNode zEnd;
    public String toString()
    {
        return aEnd.id + zEnd.id;
    }
}
public class KingsMarch
{
    public static void main(String[] args)
    {
        String[][] input = new String[args.length][args.length];
        for(int i = 0; i < args.length; i++)
        {
            input[i] = args[i].split(" ");
        }
        Graph graph = new Graph();
        graph.construct(input);
        Collection<Collection<GNode>> allPaths = new ArrayList<>();
        graph.dfs("00",""+(args.length-1)+(args.length-1), allPaths, new ArrayList<>());
        int max = 0, count = 0;
        for(Collection<GNode> eachpath : allPaths)
        {
            int valOfPath = 0;
            for(GNode eachNode : eachpath)
            {
                if(!eachNode.val.equals("s") && !eachNode.val.equals("e"))
                valOfPath += Integer.parseInt(eachNode.val);
            }
            if(valOfPath > max) {
                max = valOfPath;
                count = 0;
            }
            if(valOfPath == max) count++;

        }
        System.out.println(max + " " + count);
    }
}
