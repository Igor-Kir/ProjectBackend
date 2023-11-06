package enums;

public enum StudyProfile {
    MATHEMATICS("Математика"),
    MEDICINE("Медицина"),
    COMPUTER_SCIENCE ("Информатика"),
    JURISPRUDENCE("Юриспруденция"),
    PHYSICS("Физика"),
   ARCHITECTURE("Архитектура");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
