package basis;

public class Test01 {
    public static void main(String[] args) {

        // 寻找某两个数相除，其结果 离黄金分割点 0.618最近
        //
        // 分母和分子不能同时为偶数
        // 分母和分子 取值范围在[1-20]
        int range = 20; // 取值范围
        float breakPoint = 0.618f; // 黄金分割点

        float minDiff = 100; // 离黄金分割点的差值
        int answerFenzi = 0; // 找到的分子
        int answerFenmu = 0; // 找到的分母
        for (int fenzi = 1; fenzi <= range; fenzi++) {
            for (int fenmu = 1; fenmu <= range; fenmu++) {
                // 分母和分子不能同时为偶数
                if (0 == fenzi % 2 & 0 == fenmu % 2)
                    continue;

                // 取值
                float value = (float) fenzi / fenmu;
                // 取离黄金分割点的差值
                float diff = value - breakPoint;
                // 绝对值
                diff = diff < 0 ? 0 - diff : diff;

                // 找出最小的差值
                if (diff < minDiff) {
                    minDiff = diff;
                    answerFenzi = fenzi;
                    answerFenmu = fenmu;
                }
            }
        }
        System.out.println("离黄金分割点(" + breakPoint + ")最近的两个数相除是:" + answerFenzi + "/" + answerFenmu + "="
                + ((float) answerFenzi / answerFenmu));


        //算术题
        for (int a = 0; a <= 20; a++) {
            for (int b = 0; b <= 20; b++) {
                for (int c = 0; c <= 20; c++) {
                    for (int d = 0; d <= 20; d++) {
                        if ((a + b == 10) & (a + c == 14) & (c - d == 6) & (b + d == 10)) {
                            System.out.println("a:" + a + "\r\n" + "b:" + b + "\r\n" + "c:" + c + "\r\n" + "d:" + d);
                        }
                    }
                }
            }
        }

    }
}
