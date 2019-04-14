package com.anilpdv.gifs.data;

import com.anilpdv.gifs.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


@Component
public class GifRepository {
    private static final List<Gif> All_GIFS = Arrays.asList(
            new Gif("ben-and-mike", LocalDate.of(2019,05,12),"anilpdv",true),
            new Gif("book-dominos", LocalDate.of(2019,05,12),"anilpdv",true),
            new Gif("compiler-bot", LocalDate.of(2019,05,12),"anilpdv",true),
            new Gif("infinite-andrew", LocalDate.of(2019,05,12),"anilpdv",true),
            new Gif("android-explosion", LocalDate.of(2019,05,12),"anilpdv",true)
    );

    public List<Gif> getAll_GIFS() {
        return All_GIFS;
    }

    public Gif findByName(String firstname){
       for (Gif gif : All_GIFS) {
           if (gif.getName().equals(firstname)) {
               return gif;
           }
       }
       return null;
    }






}
