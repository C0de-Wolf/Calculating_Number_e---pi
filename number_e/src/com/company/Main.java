package com.company;

public class Main {

    public static void main(String[] args) {
	double n= 1;
	double record_e = 0;
	for (int i = 0; i<999999999; i++){
	double diff = Math.abs(record_e-Math.E);
	double record_diff = Math.abs(Math.pow(1+(1/n),n)-Math.E);
	 if(record_diff<=diff){
	 	record_diff = diff;
	 	record_e=Math.pow(1+(1/n),n);
	 	System.out.println(record_e);
		}
	    n++;
        }
    }
}
