// Write a function, largestComponent, that takes in the adjacency list of an undirected graph.
// The function should return the size of the largest connected component in the graph.

const largestComponent = (graph) => {
    const visited = new Set();
    let longestComponent = 0;
    for(node in graph) {
       const size = exploreSize(graph, node, visited);
      if(size > longestComponent) {
        longestComponent = size;
      }
    }
    return longestComponent;
  };
  
  const exploreSize = (graph, currentNode, visited) => {
    let size = 1;
    if(visited.has(String(currentNode))) return 0;
    visited.add(String(currentNode));
    for(neigbor of graph[currentNode]) {
      size += exploreSize(graph, neigbor, visited);
    }
    return size;
  }

  largestComponent({
    0: ['8', '1', '5'],
    1: ['0'],
    5: ['0', '8'],
    8: ['0', '5'],
    2: ['3', '4'],
    3: ['2', '4'],
    4: ['3', '2']
  }); // -> 4
  