package com.brady.designpatten.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        TileFactory factory = new TileFactory();
        // 随便绘制一列为例
        factory.getDrawable("河流").draw(10,10);
        factory.getDrawable("河流").draw(10,20);
        factory.getDrawable("道路").draw(10,30);
        factory.getDrawable("草地").draw(10,40);
        factory.getDrawable("草地").draw(10,50);
        factory.getDrawable("草地").draw(10,60);
        factory.getDrawable("草地").draw(10,70);
        factory.getDrawable("草地").draw(10,80);
        factory.getDrawable("道路").draw(10,90);
        factory.getDrawable("道路").draw(10,100);
        //绘制完地板后接着在顶层绘制房屋factory.getDrawable("房子").draw(10，10);factory.getDrawable("房子").draw(10，50);
        /*
        运行结果
        从磁盘加载[河流]图片，耗时半秒······在位置[10:10] 上绘制图片:[河流]在位置[10:20]上绘制图片:[河流]
        从磁盘加载[道路]图片，耗时半秒······在位置[10:30]上绘制图片:[道路]
        从磁盘加载[草地]图片，耗时半秒······在位置[10:40] 上绘制图片:[草地]
        在位置[10:50]上绘制图片:[草地]
        在位置 [10:60]上绘制图片:[ 草地]
        在位置[10:70]上绘制图片:[草地]
        在位置[10:80]上绘制图片:[ 草地
        在位置[10:90]上绘制图片:[ 道路]
        在位置[10:100]上绘制图片:[道路]
        从磁盘加载[房屋]图片，耗时半秒·····.将图层切换到顶层··..·.在位置[10:10]上绘制图片:[房屋将图层切换到顶层······在位置[10:50] 上绘制图片:[房屋]
        */
    }
}
