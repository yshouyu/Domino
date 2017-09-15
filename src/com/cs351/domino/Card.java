package com.cs351.domino;

public class Card {

    private String src;
    private String top;
    private String bottom;

    private double rotate;
    private String left;
    private String right;

    public Card(String src, String top, String bottom) {
        this.src = src;
        this.top = top;
        this.bottom = bottom;
        rotate = 90;
        this.left = bottom;
        this.right = top;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public double getRotate() {
        return rotate;
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public boolean hasSame(String l,String r){
        if (left.equals("0")|| right.equals("0")) {
            return true;
        }
        if (left.equals(l) || right.equals(l) || left.equals(r) || right.equals(r)) {
            return true;
        }
        return false;
    }
    public boolean isCanAddLeft(String target) {
        if (right.equals(target) || right.equals("0")) {
            return true;
        }
        if (left.equals(target) || left.equals("0")) {
            rotate = -90;
            this.left = top;
            this.right = bottom;
            return true;
        }
        return false;
    }

    public boolean isCanAddRight(String target) {
        if (left.equals(target)||left.equals("0")) {
            return true;
        }
        if (right.equals(target) || right.equals("0" )) {
            rotate = -90;
            this.left = top;
            this.right = bottom;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Card{" + "src=" + src + ", top=" + top + ", bottom=" + bottom + ", left=" + left + ", right=" + right + '}';
    }
}
