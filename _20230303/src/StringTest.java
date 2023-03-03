public class StringTest {
    public static void main(String[] args) {
        String proverb = "A barking dog";                           // new 연산자 생략
        String s1, s2, s3, s4;

        System.out.println("문자열의 길이 = " + proverb.length());      // 문자열의 길이 = 13

        s1 = proverb.concat(" never Bites!");                   // 문자열 결합
        s2 = proverb.replace('B', 'b');             // 문자 치환
        s3 = proverb.substring(2, 5);                               // 문자열 부분추출
        s4 = proverb.toUpperCase();                                 // 대문자로 변환

        System.out.println(s1);                                     // A barking dog never Bites!
        System.out.println(s2);                                     // A barking dog
        System.out.println(s3);                                     // bar
        System.out.println(s4);                                     // A BARKING DOG
    }
}
