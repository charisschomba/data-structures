const depthFirstPrint = (graph, source) => {
    console.log(source);
    for(let neigbor of graph[source]) {
        depthFirstPrint(graph, neigbor)
    }
  };
  
  graph = {
    a: ["c", "b"],
    b: ["d"],
    c: ["e"],
    d: ["f"],
    e: [],
    f: [],
  };
  
  depthFirstPrint(graph, "a");