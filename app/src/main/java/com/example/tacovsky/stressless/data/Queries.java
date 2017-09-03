package com.example.tacovsky.stressless.data;

import com.example.tacovsky.stressless.models.Pending;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Celis on 19-08-2017.
 */

public class Queries {

    public List<Pending> pendings(){
        List<Pending> pendings = new ArrayList<>();
        List<Pending> pendingList = Pending.find(Pending.class,"done = 0");
        if(pendingList != null && pendingList.size() > 0){
            pendings.addAll(pendingList);
        }
        return pendings;
    }
}
