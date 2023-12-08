package com.sunbeam;

import java.util.Comparator;

public class Integercomparator implements Comparator<Integer>
	{
	@Override
		public int compare(Integer i1, Integer i2) {
			int diff=Integer.compare(i1, i2);
			return diff;
		}
		
	}

