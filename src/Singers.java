import java.util.ArrayList;

public class Singers {
    private ArrayList<String> singerList = new ArrayList<String>();

    public void writeSingers(){
        System.out.println("There are " + singerList.size() + " singers in the singer list... ");

        for(int i = 0; i < singerList.size(); i++){
            System.out.println((i+1) + ".Singer : " + singerList.get(i));
        }
    }
    public void addSinger(String name){
        singerList.add(name);
        System.out.println("Singer List Updated...");

    }
    public void singerUpdate(String new_name, int position){
        singerList.set(position,new_name);
        System.out.println("Singer List Updated...");
    }
    public void singerRemove(int position){
        String name = singerList.get(position);
        singerList.remove(position);
        System.out.println("The singer named " + name + "was deleted from the list... ");
    }
    public void singerSearch(String singer_name){
        int position = singerList.indexOf(singer_name);
        if(position >= 0){
            System.out.println("Singer is found... ");
            System.out.println("The singer named " + singer_name + " is in the" + " " + (position + 1) + " th " + "position. ");
        }
        else {
            System.out.println("Singer not found... ");
        }

    }
}
