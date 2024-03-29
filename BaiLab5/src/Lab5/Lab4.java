package Lab5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab4 {
	public static void main(String[] args) {
		Set<Float> f1 = new HashSet<Float>();
		Set<Float> f2 = new HashSet<Float>();
		Map<Float,Float> m1 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Set---------- ");
		System.out.println("Nhập Số Phần Tử : ");
		int soPhanTu = sc.nextInt();
		float n[] = new float[soPhanTu];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Số Thứ " +(i+1) + ":");
			n[i] = sc.nextInt();
			if(f1.contains(n[i])== false) {
				f1.add(n[i]);
				f2.add(n[i]);
			}
			
			else {
				f2.remove(n[i]);
			}
		}
		System.out.println("SET -> Các Phần Tử Xuất Hiện Trong Mảng Đúng 1 Lần :");
		for (float f : f2) {
			System.out.print(f + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Map-------------");
		System.out.println("Nhập Số Phần Tử : ");
		soPhanTu = sc.nextInt();
		float[] a = new float[soPhanTu];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Số Thứ " +(i+1) + ":");
			a[i] = sc.nextFloat();
		}

        
		  for (float dem : a) {
	        	// Nếu Gặp Dem Xuất Hiện Trong Map Thì Trả Về Số Lần Xuất Hiện Dem
	        	// Nếu Chưa Có Thì Trả Về 1
	        	// Đếm Số Lần Xuất Hiện Của Từng Giá Trị Trong Map 
	        	if(m1.containsKey(dem)) {
	        		m1.put(dem, m1.get(dem) +1);
	        	}
	        	else m1.put(dem, (float) 1);
	        }

     
        System.out.println("Map -> Các số chỉ xuất hiện một lần trong mảng: ");
        for (Map.Entry<Float, Float> et : m1.entrySet()) {
        	float key = et.getKey();
        	float value = et.getValue();
            if (value == 1 ) {
                System.out.println(key);
            }
        }
    }

}


