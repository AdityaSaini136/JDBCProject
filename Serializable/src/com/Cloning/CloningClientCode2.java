package com.Cloning;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloningClientCode2 {
		public static void main(String[] args) throws Exception {
			Address address = new Address(12345, "Strren No 1", "Near Bank Square", "Roorkee", "Haridwar", "UK", "Taliban");
			Employee e1 = new Employee(1,"Mukul Saini", address);


			System.out.println(e1.getAddress());
			System.out.println(e1);

			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(200);
			ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
			oos.writeObject(e1);

			ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			ObjectInputStream objectInputStream = new ObjectInputStream(arrayInputStream);
			Object obj = objectInputStream.readObject();

			Employee e2 = null;
			if(obj instanceof Employee) {
				e2 =  (Employee)obj;
			}

			e2.setName("Bharat");
			e2.getAddress().setCity("PAK");

			System.out.println(e1);
			System.out.println(e2);
		}
	}
