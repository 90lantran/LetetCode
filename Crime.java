package letcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Crime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] data = new String[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextLine();
		}
		List<NameTime> result = new ArrayList<NameTime>();
		Map<String, LocationTime> map = new LinkedHashMap<String, LocationTime>();

		for (String s : data) {
			String[] line = s.split("\\|");
			// First Crime
			NameTime currentNT = new NameTime(line[0], Integer.parseInt(line[3]));
			if (Integer.parseInt(line[1]) > 3000 && !result.contains(currentNT)) {
				result.add(currentNT);

			} 
			if (!result.contains(currentNT)) {
				if (map.containsKey(line[0])) {
					
					String oldLocation = map.get(line[0]).getLocation();
					int oldTime = map.get(line[0]).getTime();
					
					if ( !oldLocation.equals(line[2]) && ( Integer.parseInt(line[3]) - oldTime < 60)){
						result.add(new NameTime(line[0], oldTime));
					} else {
					
//					map.put(line[0],
//							new LocationTime(line[2], Integer.parseInt(line[3])));
					}
				} //else {
					map.put(line[0],
							new LocationTime(line[2], Integer.parseInt(line[3])));
				//}
			}

		}
		Collections.sort(result, new NameTImeComparator());
		for(NameTime x : result){
			System.out.println(x.getName());
		}

	}
}
