package letcode;

import java.util.Comparator;

public class NameTImeComparator implements Comparator<NameTime>{

	@Override
	public int compare(NameTime o1, NameTime o2) {
		
		return o1.getTime() - o2.getTime();
	}

	

}
