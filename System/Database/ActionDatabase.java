

public static class ActionDatabase{

    public void AddStreet(string city,string name, string codePostal,int place){

        //update with code

    }

    

    public void GetAllSteet(){

        //download data street from Street Collection

    }

    public boolean Lock(Street street){

        //lock a place from Street

        return true;
    }

    public boolean unLock(Street street){

        //unlock a place from Street

        return  true;
    }

}