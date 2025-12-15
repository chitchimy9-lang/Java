package co.istad.generic;

import java.util.List;

public class School<T extends Person> {
    private List<T> data;


    public List<T> getData(){
        return data;
    }
    public void setData(List<T> data){
        this.data = data;
    }

}
