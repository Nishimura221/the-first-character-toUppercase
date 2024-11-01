/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Supplier {
    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    public Supplier() {
    }

    public Supplier(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        if(name.isEmpty()){
            System.out.print("Name empty");
          setStatus(false);
        }
        
        if(name.length()<5||name.length()>50){
            name="No Name";
            setStatus(false);
        }
//        else{
//         setStatus(true);
//        }
//      String r="";
//      String[] words= name.split(" ");
//      for(int i=0;i<words.length;i++){
//       //if(!words[i].isEmpty()){
//        r=words[i].substring(0,1).toUpperCase()+words[i].substring(1);
//       
//       //}
//      
//      }
//      r=String.join(" ", words);
//        return r;
        name = name.toUpperCase().charAt(0) + name.substring(1);
        int t = name.length();
        for (int i = 1; i < t; i++) {
            if (name.charAt(i) == 32)
            {
                name = name.substring(0,i+1) + name.toUpperCase().charAt(i+1) + name.substring(i+2);
            }
            
        }
        return name;
    }

    public void setName(String name) {
          if(name.isEmpty()){
            System.out.print("Name empty");
          setStatus(false);
        }
        
        else if(name.length()<5||name.length()>50){
            name="No Name";
            setStatus(false);
        }
        else{
         setStatus(true);
        }
       
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
          if(phone.charAt(0)=='0'||(phone.length()==9||phone.length()==10)){
           return phone;
        }
         
          
         
   
        return "000.000.0000";
    }

    public void setPhone(String phone) {
        
        this.phone = phone;
    }

    public boolean getStatus() {
        
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    @Override
    public String toString() {
        if(status==false){
            return  id + ", " + getName() + ", " + address + ", " + getPhone() + ", " + "Unavailable";
          }
        return  id + ", " + getName() + ", " + address + ", " + getPhone() + ", " + "Available";
        
    }
    
}
