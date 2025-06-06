package headFirst01.character;


import headFirst01.character.weaponbehavior.WeaponBehaivor;

/**
 * Created by wangjize on 2025/6/4.
 */
public abstract class Character {
    WeaponBehaivor weaponBehaivor;

    public void performWeapon() {
        weaponBehaivor.useWeapon();
    }
    public void setWeaponBehavior(WeaponBehaivor wb) {
        this.weaponBehaivor = wb;
    }

    public abstract void fight();
}
