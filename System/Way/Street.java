
public class Street extends City{


    public String StreetName;
    public String CodePostal;
    public boolean[] places ;
    public String region;
    public String latitude, longitude;

    public Street(int place , String StreetName,String codePostal ,String latitude,String longitude ){
        places = new boolean[place];

        this.StreetName = StreetName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.CodePostal = codePostal;
    }

    public void Reflesh(){
        // get places from database
    }

    public boolean Lock(){
        Reflesh();
        boolean lock = false;
     for(int i =0 ;i <places.length;i++){
            if(places[i] == false){
                lock=true;

               places[i] = true;
                break;
                //call daabase;
            }
        }

        return lock;
   
   
   
    }

    public boolean unlock(){
        Reflesh();
        boolean unlock = false;

        for(int i =0 ;i <places.length;i++){
            if( places[i]){
                unlock =true;
                   places[i] = false;
                   //call databare
                   break;
            }
        }

        return unlock;

    }
}