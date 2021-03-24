public class Rectangle {
    double length, width;

    void get_length(double i) { 
        // 得到矩形的长
        length = i;

    }

    void get_width(double j) { 
        // 得到矩形的宽
        width = j;
    }

    double get_area() { 
        // 计算并返回矩形面积
        return length * width;
    }
}
