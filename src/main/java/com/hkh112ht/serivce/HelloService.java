package com.hkh112ht.serivce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkh112ht.common.entity.HelloEntity;
import com.hkh112ht.common.repository.HelloRepository;
import com.hkh112ht.mapper.HelloMapper;

@Service
public class HelloService {

    @Autowired
    private HelloMapper helloMapper;
    @Autowired
    private HelloRepository helloRepository;

    public List<HelloEntity> selectName(){

       List <HelloEntity> list = new ArrayList <HelloEntity> ();
       List<HelloEntity> result = new ArrayList<HelloEntity>();
       //helloRepository.findAll().forEach(result::add);
       result=IterableUtils.toList(helloRepository.findAll()) ;
      // list.addAll(helloMapper.selectEmpAll());

       Optional<HelloEntity> rt= helloRepository.findById("1") ;
       list.add(rt.get());
        return list;
    }


    public void save(){

        List <HelloEntity> list = new ArrayList <HelloEntity> ();
        HelloEntity newdate = helloRepository.save(new HelloEntity(3,"サンプル"));
     }
}