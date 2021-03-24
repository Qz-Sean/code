public class Test8 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Cuboid cub = new Cuboid();

        rect.get_length(20);
        rect.get_width(30);
        // 给长方体的底面长、宽赋值
        System.out.println("长方体的底面积：" + rect.get_area());
        // 通过rectangle类的get_area方法计算底面积
        cub.get_height(10);
        // 给长方体的高赋值
        cub.get_bottom(rect);
        // 通过cuboid的get_bottom方法将rect的引用赋给bottom
        System.out.println("长方体的体积：" + cub.get_volume());
        // 通过cuboid类的get_volume方法计算体积
        System.out.println("长方体的表面积："
                + (rect.length * rect.width * 2 + rect.length + cub.height * 2 + rect.width * cub.height * 2));
        // 长*宽*2+长*高*2+宽*高*2 计算表面积
    }
}
