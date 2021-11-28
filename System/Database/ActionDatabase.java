

public static class ActionDatabase{
  
    public void AddStreet(string city,string name, string codePostal,int place){

        //update with code
        Map<String, Object> city = new HashMap<>();
city.put("name",name);
city.put("city",city);
city.put("codePostal", codePostal);
city.put("place",place);
    
    db.collection("Streets").document(name)
        .set(city)
        .addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d(TAG, "DocumentSnapshot successfully written!");
            }
        })
        .addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "Error writing document", e);
            }
        });

    }

    

    public void GetAllSteet( @NonNull Task<DocumentSnapshot> task){

        //download data street from Street Collection
  db.collection("streets")
        .get()
        .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        Log.d(TAG, document.getId() + " => " + document.getData());
                    }
                } else {
                    Log.d(TAG, "Error getting documents: ", task.getException());
                }
            }
        });

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