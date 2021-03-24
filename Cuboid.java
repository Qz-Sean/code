public class Cuboid {
    Rectangle bottom;
    // 将rectangle对象设为长方体的底面bottom.
    double height;

    void get_bottom(Rectangle c) {
        // 将rectangle类的引用赋给bottom.
        bottom = c;
    }

    void get_height(double h) { // 得到长方形的高
        height = h;
    }

    double get_volume() { // 计算并返回长方体体积
        return bottom.get_area() * height;
    }
}
