package p001o;

/* loaded from: classes.dex */
public enum mv {
    ME("My Activities"),
    MY_TEAM("Team Activities"),
    ALL("All Activities");

    private String activityOption;

    mv(String str) {
        this.activityOption = str;
    }

    public static mv fromActivityOption(String str) {
        for (mv mvVar : values()) {
            if (mvVar.activityOption.equalsIgnoreCase(str)) {
                return mvVar;
            }
        }
        return ME;
    }

    public String getOption() {
        return this.activityOption;
    }
}
