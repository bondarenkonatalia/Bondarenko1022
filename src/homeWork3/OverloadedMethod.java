package homeWork3;

public class OverloadedMethod {

        public int sum (int x, int y){
            return x+y;
        }

        public long sum ( long x, long y){
            return x + y;
        }

        public double sum ( double x, double y, double z){
            return x + y + z;
        }
        public void test(String text,int x){}
        public void test(int x, String text){}

    }