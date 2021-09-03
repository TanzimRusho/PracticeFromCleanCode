// version 1

public List<int []> getFlaggedCells()
{
    List<int []> flaggedCells = new ArrayList<int []>();
  
    for(int[] cell : gameBoard)
        if (cell[STATUS_VALUE] == FLAGGED)
            flaggedCells.add(cell);
  
    return flaggedCells;
}

// version 2
public List<Cell> getFlaggedCells()
{
    List<Cell> flaggedCells = new ArrayList<Cell>();
  
    for(Cell cell : gameBoard)
        if (cell.isFlagged())
            flaggedCells.add(cell);
  
    return flaggedCells;
}
 
