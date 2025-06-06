package headFirst01.character.weaponbehaviorImpl;


import headFirst01.character.weaponbehavior.WeaponBehaivor;

/**
 * Created by wangjize on 2025/6/4.
 */
public class BowAndArrowBehaivor implements WeaponBehaivor {
    @Override
    public void useWeapon() {
        System.out.println("use bow and arrow");
    }
}
