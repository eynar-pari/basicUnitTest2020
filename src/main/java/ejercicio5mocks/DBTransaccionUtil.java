package ejercicio5mocks;

import java.util.List;

public class DBTransaccionUtil {

    public DBTransaccionUtil(){}

    public boolean createEntity(String query){
       return false;
    }

    public boolean deleteEntity(String query){
        return false;
    }

    public boolean updateEntity(String query){
        //todo
        return false;
    }

    public Client QueryDBConvertResultEntity(String query){
        //todo
        return new Client(0,"EYNAR",0);
    }
}
