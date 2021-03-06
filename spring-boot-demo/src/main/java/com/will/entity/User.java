package com.will.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
/**
 * @Auther: lwt
 * @Date: 2018/10/12 16:15
 * @Description: TODO
 */

/**
 * @ClassName User
 * @Description TODO
 * @Author lwt
 * @date 2018/10/12
 */

@Entity
@NamedQuery(name = "User.findByName", query = "select name,address from User u where u.name=?1")
public class User  implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    long id;
    @Column(name = "name")
    String name;
    @Column(name = "address")
    String address;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

}
