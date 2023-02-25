package PastPapers._2019.Q1;

import java.util.ArrayList;

public class Flag {
    private int position_x;
    private int position_y;
    private ArrayList<Player> playerArrayList;

    public Flag(int position_x, int position_y) {
        this.position_x = position_x;
        this.position_y = position_y;
        playerArrayList=new ArrayList<>();
    }

    public int getPositionx() {
        return position_x;
    }

    public void setPositionx(int position_x) {
        this.position_x = position_x;
        notifyPlayer();

    }

    public int getPositiony() {
        return position_y;
    }

    public void setPositiony(int position_y) {
        this.position_y = position_y;
        notifyPlayer();
    }

    public Position setStateToPosition(){
        Position position=new Position();
        position.setPosition_x(this.position_x);
        position.setPosition_y(this.position_y);
        return position;
    }

    public void restoringFromPosition(Position position){
        this.position_x=position.getPosition_x();
        this.position_y=position.getPosition_y();
    }

    public void addPlayer(Player player){
        playerArrayList.add(player);
    }

    public void removePlayer(int index){
        playerArrayList.remove(index);
    }

    public void notifyPlayer(){
        for (Player player: playerArrayList){
            player.notifyFunction();
        }
    }
}
