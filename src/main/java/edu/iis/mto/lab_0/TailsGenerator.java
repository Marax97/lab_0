package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		if (value == null) {
			return Collections.EMPTY_LIST;
		}
		ArrayList<String> list = new ArrayList<>(value.length());
		list.add(0, value);
		return list;
	}

}
