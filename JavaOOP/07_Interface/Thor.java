class Thor extends SuperHero implements SkillHero, Nation {
    
    public void skill (String skill) {
        System.out.println("Skill = " + skill);
    }

    public void moving (String moving) {
        System.out.println("Moving = " + moving);
    }
    public void weapon (String weapon) {
        System.out.println("Weapon = " + weapon);
    }
    public void jumping (String jumping) {
        System.out.println("Jumping = " + jumping);
    }

    public void setNation (String nation) {
        System.out.println("Nation = " + nation);
    }
}
