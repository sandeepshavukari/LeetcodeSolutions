class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ro=0;int co=0;
        for(int i=0;i<commands.size();i++)
        {
            String cmd=commands.get(i);
            switch(cmd)
            {
                    case "UP":
                        if(ro>0)
                        {
                            ro--;
                        }
                    break;
                    case "DOWN":
                        if(ro<n-1)
                        {
                            ro++;
                        }
                    break;
                    case "RIGHT":
                        if(co<n-1)
                        {
                            co++;
                        }
                    break;
                    case "LEFT":
                        if(co>0)
                        {
                            co--;
                        }
                    break;
            }
            
        }
        return ((ro*n)+co);
    }
}

/* The thing is that the snake is in te (0,0) position if is stated that the snake is to go up by 1 position if it is given up in the list command means that its y coordinate is to increase
means until unless that snake is not at the top it can move to the up like wise 
in down when the command is down it have to move to the down by one position mean sthe y coordinate is to decrease
unless that the snake is in the last position
in the similat way if the command is left the snak eis move to one side left means the x coordinate is to reduce unless it is in the first row
in the same way for the right too so finally we have to give the position of the snake i used the switch case 
in my logic to attain the row and column of the snake position if we multiply the row by n and add column to it we can get the position of it as per the sum*/
