package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
 
int i = 1;
int space = 1; // distance between two adjacent digits
int width = 2 * space * (cathetusLength - 2) + 3; // 0 not included

StringBuilder sb = new StringBuilder();
while (i++ <= width) {
    sb.append(' ');  // prepare StringBuilder with whitespaces
}

i = 0;
int left = width / 2;
int right = width / 2;
while (i++ < cathetusLength ) { // print 1..8
    sb.setCharAt(left, (char)(i + '0'));
    sb.setCharAt(right, (char)(i + '0'));
    System.out.println(sb);
    left -= space;
    right += space;
}

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
