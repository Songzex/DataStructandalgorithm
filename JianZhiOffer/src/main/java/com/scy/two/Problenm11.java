package com.scy.two;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.HashMap;
/**
 * 此方法也叫划动窗口
 *
 */
public class Problenm11 {

  public static int count(int [] array,int key){
      HashMap<Integer,Integer> hashMap = new HashMap<>();
      int sum = 0;
      hashMap.put(0,1);
      int count=0;
      for (int nums :array){
          sum+=nums;
          count +=hashMap.getOrDefault(sum-key,0);//通过sum-key可以查看这个
          hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
      }
      return  count;
  }





}
