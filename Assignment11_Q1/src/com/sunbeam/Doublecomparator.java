package com.sunbeam;

import java.util.Comparator;

public class Doublecomparator implements Comparator<Double>
	  {

		@Override
		public int compare(Double d1, Double d2) {
			int diff=Double.compare(d1, d2);
			return diff;
		}
		
	}

