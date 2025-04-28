/**
 * @author ：linfd
 * @version :
 * @date ：Created in 2023-12-25 21:05
 * @description：
 */

package com.sjtu.principles.demo5;

public class Agent {

    private Star star;
    private Fans fans;
    private Company company;


    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meeting(){
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }

    public void business(){
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
    

}
