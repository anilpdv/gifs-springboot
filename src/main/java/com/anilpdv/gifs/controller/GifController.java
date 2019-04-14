package com.anilpdv.gifs.controller;

import com.anilpdv.gifs.data.GifRepository;
import com.anilpdv.gifs.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository ;

   @GetMapping("/")
    public String listGifs(Model model){
        List<Gif> allGifs = gifRepository.getAll_GIFS();
        model.addAttribute("gifs",allGifs);
        return "home";
    }



    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, Model model){
        Gif gif = gifRepository.findByName(name);
        System.out.println("gif is printing "+ gif);
        model.addAttribute("gif",gif);
        return "gif-details";
    }


}
