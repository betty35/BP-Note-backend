package bzha2709.comp5216.au.edu.sydney.bpmon.backend.Controller;

import bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.MyDBConnection;
import bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

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


    @RequestMapping(value="/register/ini",method = RequestMethod.GET)
    @ResponseBody
    public UserEntity getUserJson(@RequestParam String auth)
    {
        UserEntity u=new UserEntity();
        u.setAuth(auth);
        Session s= MyDBConnection.getSession();
        try
        {
            Transaction tx=s.beginTransaction();
            s.save(u);
            tx.commit();
        }
        catch(Exception e){e.printStackTrace();}
        finally {
            s.close();
        }
        return u;
    }




}