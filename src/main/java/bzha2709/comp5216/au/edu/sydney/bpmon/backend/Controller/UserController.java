package bzha2709.comp5216.au.edu.sydney.bpmon.backend.Controller;

import bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.MyDBConnection;
import bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    @ResponseBody
    public String welcome(){
        return "Welcome";
    }


    @RequestMapping(value="/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "test spingMVC";
    }


    @RequestMapping(value="/user/register",method = RequestMethod.GET)
    @ResponseBody
    public String initialRegister(@RequestParam String auth)
    {
        UserEntity u=new UserEntity();
        u.setAuth(auth);
        Session s= MyDBConnection.getSession();
        try
        {
            Transaction tx=s.beginTransaction();
            Query q =s.createQuery("from UserEntity where auth=:auth").setParameter("auth", auth);
            if(q.getResultList().size()==0)
            s.save(u);
            tx.commit();
        }
        catch(Exception e){e.printStackTrace();}
        finally {
            s.close();
        }
        return u.getId()+"";
    }



    @RequestMapping(value="/user/testing",method = RequestMethod.POST)
    @ResponseBody
    public UserEntity userTesting(@RequestBody UserEntity user)
    {
        System.out.println("received. auth="+user.getAuth());
        return user;
    }


    @RequestMapping(value="/user/update",method = RequestMethod.GET)
    @ResponseBody
    public UserEntity updateUserInfo(@RequestBody UserEntity u)
    {
        Session s= MyDBConnection.getSession();
        try
        {
            Transaction tx=s.beginTransaction();
            s.update(u);
            tx.commit();
        }
        catch(Exception e){e.printStackTrace();}
        finally {
            s.close();
        }
        return u;
    }

    @RequestMapping(value="/user/get_by_auth",method = RequestMethod.GET)
    @ResponseBody
    public UserEntity getUserInfoByAuth(@RequestParam String auth)
    {
        UserEntity u=null;
        Session s= MyDBConnection.getSession();
        try
        {
            Transaction tx=s.beginTransaction();
            Query q =s.createQuery("from UserEntity where auth=:auth").setParameter("auth", auth);
            u=(UserEntity)q.uniqueResult();
            tx.commit();
        }
        catch(Exception e){e.printStackTrace();}
        finally {
            s.close();
        }
        return u;
    }





}