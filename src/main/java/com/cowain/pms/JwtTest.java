package com.cowain.pms;

import com.cowain.pms.modules.app.utils.JwtUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JwtTest {
    @Autowired
    private JwtUtils jwtUtils;

    @Test
    public void test() {
        String token = jwtUtils.generateToken(1);
        List<Integer> lis=new ArrayList<Integer>();
        List<Integer> lisa=new ArrayList<Integer>();
        lis.add(0);
        lis.add(1);
        lis.add(2);
        lisa.add(0);
        lisa.add(4);
        lisa.add(5);
        for(int i=0;i<lis.size();i++){
           if(lisa.contains(lis.get(i))){
               lisa.remove(lis.get(i));
           }
        }
        System.out.println(lisa);
    }

}
