package org.example;

public class Main {
    public static void main(String[] args) {

        Weapon fire_breath = new FireBreath();
        Bend bend = new Bend();
        RayGun ray_gun = new RayGun();

        Attacker robot_one = new Robot("Bender", fire_breath);
        robot_one.Attack();

        Robot robot_two = new Robot("Bender", bend);
        robot_two.Attack();

        Robot robot_three = new Robot("Evil Bender", ray_gun);
        robot_three.Attack();

    }
}