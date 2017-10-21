package bzha2709.comp5216.au.edu.sydney.bpmon.backend.Controller;

import bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities.BpMeasuresEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MeasureController
{
    @RequestMapping(value="/measure/upload",method = RequestMethod.GET)
    @ResponseBody
    public String newMeasure(@RequestBody List<BpMeasuresEntity> measures)
    {
        return measures.get(0).getDia().toString();
    }


}
