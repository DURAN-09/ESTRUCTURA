package U2.ExamenTest;

public class JobCustom {
    private String id;
    public JobCustom(String id){
        this.id = id;
    }

    public String getJob(){
        return id;
    }

    @Override
    public String toString(){
        return "[ id : "+this.id+" ]";
    }

}
