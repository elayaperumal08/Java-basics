class StringMethods {
 public static void main(String args[]) {
  String s1 = "Elaya";
String s2 = "Perumal";
System.out.println("String s3 = " + s1.concat(s2));
String s3 = "ElayaPerumal";
System.out.println("length of String s3: " + s3.length());
System.out.println("charactor at position 5: " + s3.charAt(5));
System.out.println("index of charactor 'u': " + s3.indexOf('u'));
System.out.println("contains sequenc 'mal' : " + s3.contains("mal"));
System.out.println("endswith character 'm' : " + s3.endsWith("m"));
System.out.println("replace 'Elaya' with 'Small' : " + s3.replace("Elaya", "Small"));
System.out.println("Convert to LowerCase : " + s3.toLowerCase());
System.out.println("Convert to upperCase: " + s3.toUpperCase()); 
}
  } 
