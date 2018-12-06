package com.nantian.demo.utils;

import java.util.UUID;

public class UUIdUtils {

	public static String next() {
		int machineId = 1;
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if(hashCodeV < 0) {//有可能是负数
			hashCodeV = - hashCodeV;
		}
		return machineId + String.format("%015d", hashCodeV);
	}

	public static void main(String[] args) {
		System.out.println(next());
	}
}
