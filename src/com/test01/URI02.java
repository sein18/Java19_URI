package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URI02 {

	public static void main(String[] args) throws IOException {
		byte b[] = new byte[1];

		URL url = new URL("https://blog.kakaocdn.net/dn/s2lgA/btq5MoiuW18/SMwkcZ2Lc1H44TlyjKwKwK/img.png");

		URLConnection urlConn = url.openConnection();
		urlConn.connect();

		DataInputStream di = new DataInputStream(urlConn.getInputStream());

		FileOutputStream fs = new FileOutputStream("a.png");

		while (di.read(b, 0, 1) != -1) {
			fs.write(b,0,1);
		}
		System.out.println("¿Ï·á!");
		di.close();
		fs.close();
	}

}
