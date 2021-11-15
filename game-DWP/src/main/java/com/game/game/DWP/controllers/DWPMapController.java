package com.game.game.DWP.controllers;

import com.game.game.DWP.DWPArea;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class DWPMapController {

    @GetMapping("/static")
    public String getPage(Model md){
        return "pages/dwp_map";
    }
    @GetMapping("/dwpmap")
    public String getMap(Model md){
        return "pages/configuredwp";
    }
    @PostMapping("/dwprooms")
    public String getRooms(@RequestParam(value = "archi", required = false) String archi, Model md){
        if(archi.equals("archi_1")) {
            md.addAttribute("dwparea", new DWPArea());
            return "pages/configuredwp_archi1";
        }
        else if(archi.equals("archi_2")){
            return"pages/comingsoon";
        }
        else{
            return"pages/comingsoon";
        }
    }
    @PostMapping("/dwpmap1")
    public String getMap1(@ModelAttribute("dwparea") DWPArea dwparea,Model md ){
        System.out.println(dwparea.toString());
        return "pages/configuredwp";
    }

}
