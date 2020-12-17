package Hash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Hash {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("Algoritmo para generar código HASH");
		System.out.println("----------------------------------");
		System.out.println("Ingresa el dato para transformar: "); // Scanner
		String inputValue = sc.nextLine();
		System.out.println("");

		// Generando el SHA256

		String sha256 = getSHA256(inputValue);

		System.out.println("El SHA-256 of \"" + inputValue + "\" es:");
		System.out.println(sha256);
		System.out.println("");

		// Generando el SHA512
		String sha512 = getSHA512(inputValue);

		System.out.println("El SHA-512 de \"" + inputValue + "\" es:");
		System.out.println(sha512);
		System.out.println("");
	}

	private static String getSHA256(String inputValue) {
		MessageDigest digest;

		String toReturn = null;
		try {
			digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			digest.update(inputValue.getBytes("UTF-8"));
			toReturn = String.format("%064x", new BigInteger(1, digest.digest()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return toReturn;
	}

	private static String getSHA512(String inputValue) {
		MessageDigest digest;

		String toReturn = null;
		try {
			digest = MessageDigest.getInstance("SHA-512");
			digest.reset();
			digest.update(inputValue.getBytes("UTF-8"));
			toReturn = String.format("%064x", new BigInteger(1, digest.digest()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return toReturn;
	}

}
