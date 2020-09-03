package com.handcoding.template;

import lombok.Data;

@Data
public class UserVO {
    private String name;
    private String pnum;

    UserVO(String name, String pnum){
        this.name=name;
        this.pnum=pnum;
    }

    
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the pnum
     */
    public String getPnum() {
        return pnum;
    }

    /**
     * @param pnum the pnum to set
     */
    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

}