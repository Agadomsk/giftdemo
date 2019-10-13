package com.ag.gifdemo.controller;

import com.ag.gifdemo.model.Gif;
import com.ag.gifdemo.repository.gifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static com.ag.gifdemo.repository.gifRepository.*;


@Controller
public class gifController {

    @Autowired
    gifRepository gifRepository;

    @GetMapping("/")
    public String listGifsHome(ModelMap modelMap){
        // 1. wyciąganie gifów
      //  List<Gif> gifList = getAllGifs();
        List<Gif> gifList = gifRepository.getGifs();
        // 2. Przekazanie gifów do View
        modelMap.put("gifs", gifList);
        // 3. Zwracanie widoku
        return "home";
    }
    @GetMapping("/favorites")
    public String listFavoritesGifs(ModelMap modelMap) {
        // 1. wyciąganie gifów
        //  List<Gif> gifList = getAllGifs();
        List<Gif> gifList = gifRepository.getFavoritesGifs();
        // 2. Przekazanie gifów do View
        modelMap.put("gifs", gifList);
        // 3. Zwracanie widoku
        return "favorites";

    }
    @GetMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        // 1. wyciąganie gifów
        //  List<Gif> gifList = getAllGifs();
        Gif gif = gifRepository.getGifByName(name);
        // 2. Przekazanie gifów do View
        modelMap.put("gif", gif);
        // 3. Zwracanie widoku
        return "gif-details";


 /*   @ResponseBody
    @GetMapping("/test")
    public String listGifs() {
        return getAllGifs().toString();

    }


    @ResponseBody
    @GetMapping("/test1")
    public String listGif() {

        List<Gif> allGifs = getAllGifs();
        for (Gif g : allGifs) {
            if (g.getUserName().equals("mika")) {
                return g.toString();
            }
        }
        return null;
    }


    @GetMapping("/")
    public String listFavorites(ModelMap modelMap) {

        List<Gif> allGifs = gifRepository.getGifs();
        List<Gif> notFavorite = new ArrayList<>();


        for (Gif x : allGifs) {
            if (!x.getFavorite()) { // false -> nie wchodzę to środka, true -> wchodzę
                notFavorite.add(x);
            }
            }
        return "favorites";*/

        }

}


