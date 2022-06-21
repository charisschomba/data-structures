// Write a function, minimumIsland, that takes in a grid containing Ws and Ls. W represents water and L represents land. The function should return the size of the smallest island.
// An island is a vertically or horizontally connected region of land.
// You may assume that the grid contains at least one island.

const minimumIsland = (grid) => {
    const visited = new Set();
    let minIsland = Infinity;
    for(let r = 0; r < grid.length; r++){
      for(let c = 0; c < grid[0].length; c++){
        const size = exploreSize(grid, r, c, visited);
        console.log(size)
        if(size > 0 && size < minIsland) {
          minIsland = size;
        }
      } 
    }
    return minIsland;
  };
  
  const exploreSize = (grid, row, col, visited) => {
    let size = 1;
    const rowInbounds = 0 <= row && row < grid.length;
    const colInbounds = 0 <= col && col < grid[0].length;
    
    if(!rowInbounds || !colInbounds) return 0;
    if(grid[row][col] === 'W') return 0;
    
    const position = row + ',' + col;
    if(visited.has(position)) return 0;
    visited.add(position);
    
    size += exploreSize(grid, row - 1, col, visited);
    size += exploreSize(grid, row + 1, col, visited);
    size += exploreSize(grid, row, col - 1, visited);
    size += exploreSize(grid, row , col + 1, visited);
    
    return size;
  }

const grid = [
    ['W', 'L', 'W', 'W', 'W'],
    ['W', 'L', 'W', 'W', 'W'],
    ['W', 'W', 'W', 'L', 'W'],
    ['W', 'W', 'L', 'L', 'W'],
    ['L', 'W', 'W', 'L', 'L'],
    ['L', 'L', 'W', 'W', 'W'],
  ];
  
  minimumIsland(grid); // -> 2