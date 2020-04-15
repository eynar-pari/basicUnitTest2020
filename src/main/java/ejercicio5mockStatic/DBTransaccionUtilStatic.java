package ejercicio5mockStatic;

import ejercicio5mocks.Client;

public class DBTransaccionUtilStatic {

    public DBTransaccionUtilStatic(){}

    public static boolean createEntity(String query){
       return false;
    }

    public static boolean deleteEntity(String query){
        return false;
    }

    public static boolean updateEntity(String query){
        //todo
        return false;
    }

    public static Client QueryDBConvertResultEntity(String query){
        //todo
        return new Client(0,"EYNAR",0);
    }
}
