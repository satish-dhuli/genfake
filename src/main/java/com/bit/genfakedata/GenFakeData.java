package com.bit.genfakedata;

import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;

public class GenFakeData {

  public static void main(String[] args) {

    final int htnolb = 9999;
    final int htnoub = 99999;
	  
    final int lb = 33;
    final int ub = 99;

    String fname = null;
    String lname = null;

    int tel = 0;
    int hin = 0;
    int eng = 0;
    int mat = 0;
    int sci = 0;
    int soc = 0;

    Faker faker = new Faker(new Locale("en-IND"));
    Random random = new Random();

    try {

      for (int no = htnoub; no > htnolb; no--) {

        fname = faker.name().firstName().replaceAll("'", "");
        lname = faker.name().lastName().replaceAll("'", "");
        tel = random.nextInt(ub - lb) + lb;
        hin = random.nextInt(ub - lb) + lb;
        eng = random.nextInt(ub - lb) + lb;
        mat = random.nextInt(ub - lb) + lb;
        sci = random.nextInt(ub - lb) + lb;
        soc = random.nextInt(ub - lb) + lb;

        System.out
            .println(String.format("%d%4d%4d%4d%4d%4d%4d\t%-20s%-20s", no, tel, hin, eng, mat, sci, soc, fname, lname));
        Thread.sleep(1);

      }

    } catch (InterruptedException interruptedException) {
      interruptedException.printStackTrace();
    } catch (Exception exception) {
      exception.printStackTrace();
    }

  }

}
