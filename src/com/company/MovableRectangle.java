package com.company;

import java.util.Objects;

public class MovableRectangle implements Movable {
    MovablePoints left;
    MovablePoints right;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed1, int ySpeed1, int xSpeed2, int ySpeed2) {
        this.left = new MovablePoints(x1, y1, xSpeed1, ySpeed1);
        this.right = new MovablePoints(x2, y2, xSpeed2, ySpeed2);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public void moveUp() {
        left.moveUp();
        right.moveUp();
    }

    @Override
    public void moveDown() {
        left.moveDown();
        right.moveDown();
    }

    @Override
    public void moveLeft() {
        left.moveLeft();
        right.moveLeft();
    }

    @Override
    public void moveRight() {
        left.moveRight();
        right.moveRight();
    }

    public boolean simular() {
        if (left.getxSpeed() == right.getxSpeed() && left.getySpeed() == right.getySpeed()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
