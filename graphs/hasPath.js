// Write a function, hasPath, that takes in an object representing the adjacency list of a directed acyclic graph and two nodes (src, dst).
// The function should return a boolean indicating whether or not there exists a directed path between the source and destination nodes.
const graph = {
  f: ["g", "i"],
  g: ["h"],
  h: [],
  i: ["g", "k"],
  j: ["i"],
  k: [],
};

// bredth first
const hasPath = (graph, src, dst) => {
  const queue = [src];
  while (queue.length > 0) {
    const current = queue.shift();
    if (current === dst) return true;
    for (let curr of graph[current]) {
      queue.push(curr);
    }
  }
  return false;
};

// recursively
// depth First
const hasPathRecursively = (graph, src, dst) => {
  if (src === dst) return true;
  for (let neigbour of graph[src]) {
    if (hasPath(graph, neigbour, dst) === true) {
      return true;
    }
  }
  return false;
};

console.log(hasPathRecursively(graph, "f", "k"));

console.log(hasPath(graph, "f", "j"));
