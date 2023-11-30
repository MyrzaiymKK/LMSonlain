package Groups;

public class GeneratorId {

    public static long id = 0;

    public static long generatorid(){
        return (++id);
    }
}
