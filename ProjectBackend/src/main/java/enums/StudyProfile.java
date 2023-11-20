package enums;

public enum StudyProfile {
    MATHEMATICS("Математика"),
    MEDICINE("Медицина"),
    COMPUTER_SCIENCE ("Информатика"),
    JURISPRUDENCE("Юриспруденция"),
    PHYSICS("Физика"),
    LINGUISTICS("Лингвистика");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
