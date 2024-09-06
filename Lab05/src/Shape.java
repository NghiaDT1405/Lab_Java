public class Shape {
    public static final int SHAPE_RECTANGLE = 1;
    public static final int SHAPE_CIRCLE = 2;
    public static final int SHAPE_TRIANGLE = 3;

    public int shareCode = 0;
    /**
     * @param width chieu rong
     * @param height chieu dai
     * @return void
     * @see Dien tich HCN - vuong
     */
    public void tinhDienTich(float width, float height){
        System.out.println("Dien Tich = "+width*height);
    }
    /**
     * @param radius Ban kinh hinh tron
     * @return void
     * @see Dien tich hinh tron
     */
    public void tinhDienTich(float radius){
        System.out.println("Dien Tich = "+radius*radius*3.14);
    }
    /**
     * @param height chieu cao
     * @param bottom chieu dai canh day
     * @see tam giac
     */
    public void tinhDienTich(float height, double bottom){
        System.out.println("Dien Tich = "+height*bottom/2);
    }

    /**
     *
     * @param width chieu dai
     * @param height chieu rong
     * @see Chu vi HCN - vuong
     */

    public void tinhChuVi(float width, float height){
        System.out.println("Chu Vi = "+(width+height)*2);
    }

    /**
     *
     * @param radius Ban kinh
     * @see Chu vi hinh tron
     */

    public void tinhChuVi(float radius){
        System.out.println("Chu Vi = "+radius*2*3.14);
    }

    /**
     *
     * @param edge1 canh thu 1
     * @param edge2 canh thu 2
     * @param edge3 canh thu 3
     * @see Chu vi cua tam giac
     */

    public void tinhChuVi(float edge1, float edge2, float edge3){
        System.out.println("Chu Vi = "+(edge1+edge2+edge3));
    }

}
