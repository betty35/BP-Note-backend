package bzha2709.comp5216.au.edu.sydney.bpmon.backend.Controller;

import bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.MyDBConnection;
import bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities.BpMeasuresEntity;
import bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities.UserEntity;
import bzha2709.comp5216.au.edu.sydney.bpmon.backend.fromFront.Measure;
import bzha2709.comp5216.au.edu.sydney.bpmon.backend.fromFront.MeasurePackage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class MeasureController
{
    @RequestMapping(value="/measure/upload",method = RequestMethod.POST)
    @ResponseBody
    public String newMeasure(@RequestBody MeasurePackage mp)
    {
        Session s= MyDBConnection.getSession();
        Transaction tx=s.beginTransaction();
        List<Measure> measures=mp.getMeasures();
        Long user_id=mp.getUser_id();
        for(int i=0;i<measures.size();i++)
        {
            Measure m=measures.get(i);
            BpMeasuresEntity e=new BpMeasuresEntity();
            e.setUserId(user_id);
            e.setArm(m.getArm());
            e.setDia(m.getDia());
            e.setSys(m.getSys());
            e.setMood(m.getMood());
            e.setPosition(m.getPosition());
            e.setPulse(m.getPulse());
            e.setTime(m.getTime());
            Query q=s.createQuery("from BpMeasuresEntity where userId=:a1 and time=:a2");
            q.setParameter("a1",user_id);
            q.setParameter("a2",m.getTime());
            List<BpMeasuresEntity> mL=(List<BpMeasuresEntity>)q.list();
            if(mL.size()>0)
            {
                BpMeasuresEntity temp= mL.get(0);
                e.setId(temp.getId());
            }
            s.saveOrUpdate(e);
        }
        tx.commit();
        return "uploaded";
    }

    @RequestMapping(value="/measure/share",method = RequestMethod.GET)
    @ResponseBody
    public List<BpMeasuresEntity> getMeasure(@RequestParam Long userid,@RequestParam String psw)
    {
        Session s= MyDBConnection.getSession();
        UserEntity user= s.get(UserEntity.class,userid);
        if(null==user)
        return null;
        else
        {
            String p=user.getPsd();
            if(!p.equals(psw))
                return null;
            else if((new Date().getTime()-user.getLastupdate())>1000*3600*24*2)//haven't change password for 2 days
            {
                return null;
            }
            else
            {
                Long startT=user.getStarttime();
                Long endT=user.getEndtime();
                Query q=s.createQuery("from BpMeasuresEntity where time<:e1 and time>:s1");
                q.setParameter("e1",endT);
                q.setParameter("s1",startT);
                System.out.println("start:"+startT+", end:"+endT);
                List<BpMeasuresEntity> mL=(List<BpMeasuresEntity>)q.list();
                System.out.println("List size of measures showed:"+mL.size());
                return mL;
            }
        }
    }


}
