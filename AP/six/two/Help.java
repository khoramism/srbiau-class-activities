package two;
    
public class Help {
    private static Help form = new Help();
    public synchronized static Help getInstance(){
        if (form == null){
            form = new Help();
        }
        return form;
    }
    private Help(){}
    public String name;
    public void show(){
        System.out.println(name);
    }

}