package org.fred.kata.smilefaces;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Rules for a smiling face: -Each smiley face must contain a valid pair of
 * eyes. Eyes can be marked as : or ; -A smiley face can have a nose but it does
 * not have to. Valid characters for a nose are - or ~ -Every smiling face must
 * have a smiling mouth that should be marked with either ) or D.
 * 
 * @author yanfei.qiao
 *
 */
public class SmileFaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "d(D", " :-)", " 5)", " :ddx", " 5)", " :)", " :d", " :X", " 5)", " oD", " :2p", " ;D)",
				" 8~))", " (x)", " o~D", " ;d)", " (P", " 5oD", " 5~P", " ;)", " op", " ;P", " 4X", " pxd", " 5D",
				" :~D", " 8d)", " :~D", " 'D", " '-)", " :pD", " pd", " ;~2p", " ;-p", " p)", " ;P)" };
		List<String> a = Arrays.asList(arr);
		System.out.println(countSmileys(a));
	}

	public static int countSmileys(List<String> arr) {
		// Just Smile :)
		arr.stream().filter(s -> isSmailFace(s)).forEach(s -> System.out.println(s));
		return 0;
	}

	private static boolean isSmailFace(String face) {
		Pattern pattern = Pattern.compile("[:|;][-|~]?[)|D]");
		Matcher matcher = pattern.matcher(face);
		return matcher.find();
	}
}
