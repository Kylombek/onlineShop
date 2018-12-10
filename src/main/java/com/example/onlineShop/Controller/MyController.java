package com.example.onlineShop;

import com.example.onlineShop.models.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/shoe")
public class MyController {
    @Autowired
    private ShoesRepository shoesRepository;

    @RequestMapping(path = "add")
    public @ResponseBody String AddNewShoe (@RequestParam String name,@RequestParam int size, @RequestParam double price){
        Shoe shoe = new Shoe();
        shoe.setName(name);
        shoe.setPrice(price);
        shoe.setSize(size);
        shoesRepository.save(shoe);
        return "Saved";
    }

    @RequestMapping(path = "/all")
    public @ResponseBody Iterable<Shoe> getAll() {
        return shoesRepository.findAll();
    }
}
