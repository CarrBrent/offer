package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Point {
	int x;
	int y;
	Point() { x = 0; y = 0; }
	Point(int a, int b) { x = a; y = b; }
}

public class maxPoints {
	 public static int maxPoints(Point[] points) {
			if (points.length<=2) {
				return points.length;
			}
			int max = 2;
			for (int i = 0; i < points.length; i++) {
				HashMap<Double, Integer> map = new HashMap<Double, Integer>();
				int num = 1;
				double key=0;
				for (int l = 0; l < points.length; l++) {
					if (i!=l) {

						int y = points[i].y-points[l].y;
						int x = points[i].x-points[l].x;
						if (x==0&&y==0) {
							num++;
						}else if (y==0 && x!=0) {
							key = Double.POSITIVE_INFINITY;
							System.out.println("positive="+key);
						}else {
							key = x*1.0/y;
							System.out.println("x/y="+key);
						}
						if (map.containsKey(key)) {
							map.put(key, map.get(key)+1);
						}else {
							map.put(key, 2);
						}
					}
				}
				Iterator ite=map.entrySet().iterator();
				while(ite.hasNext()){
					Map.Entry entry =(Map.Entry)ite.next();
					int value = Integer.parseInt(entry.getValue().toString());
					if (value>max) {
						max = value;
					}
					System.out.println("max="+max);
				}

			}

			return max;

		}
	 public static void main(String[] args) {
		Point a = new Point(-4,1);
		Point b = new Point(-7,7);
		Point c = new Point(-1,5);
		Point d = new Point(9,-25);
		Point[] points = {a,b,c,d};
		System.out.println(maxPoints(points));
	}

}
