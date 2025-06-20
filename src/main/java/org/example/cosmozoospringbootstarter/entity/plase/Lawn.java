package org.example.cosmozoospringbootstarter.entity.plase;

import lombok.RequiredArgsConstructor;
import org.example.cosmozoospringbootstarter.entity.Napoleon;

@RequiredArgsConstructor
public class Lawn {
    private final Napoleon napoleon;

    public static class Garden{
        public Garden(){
            System.out.println("Garden created");
        }
    }
}
