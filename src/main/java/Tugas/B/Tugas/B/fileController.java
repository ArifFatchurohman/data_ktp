/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.B.Tugas.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author LENOVO SLIM 3
 */
@Controller
@ResponseBody
public class fileController {
    
    @RequestMapping("/dataktp")
    public String getUser(Model Data){
        
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
        
        data.add(Arrays.asList("002","337546","Venus","Semarang"));
        
        data.add(Arrays.asList("012","337576","Oheb","Magelang"));
        
        data.add(Arrays.asList("006","337589","Wise","Purworejo"));
        
        data.add(Arrays.asList("014","337512","Xinnn","Medan"));
        
        data.add(Arrays.asList("002","337509","Dywa","Tegal"));
        
        data.add(Arrays.asList("002","337523","Gobek","Papua"));
        
        data.add(Arrays.asList("002","337543","Momon","Maluku"));
        
        data.add(Arrays.asList("002","337531","Indra","Riau"));
        
        data.add(Arrays.asList("002","337502","Rivaldhi","Banten"));
        
        data.add(Arrays.asList("002","337549","Bayu","Pekalongan"));
        
        data.add(Arrays.asList("002","337572","Agung","Temanggung"));
        
        data.add(Arrays.asList("002","337516","Adit","Boyolali"));
        
        data.add(Arrays.asList("002","337530","Saddil","Tangerang"));
        
        data.add(Arrays.asList("002","337545","Ega","Palangkaraya"));
        
        data.add(Arrays.asList("002","337581","Arthur","Kulon Progo"));
        
        data.add(Arrays.asList("002","337526","Gustian","Bandung"));
        
        data.add(Arrays.asList("002","337594","Marky","Jakarta"));
        
        data.add(Arrays.asList("002","337587","Fabiens","Bantul"));
        
        data.add(Arrays.asList("002","337543","Maman","Sleman"));
        
        return null;
    }
}
