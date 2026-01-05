package p001o;

/* loaded from: classes.dex */
public enum wqh {
    ME("My Tasks"),
    MY_TEAM("Team Tasks"),
    ALL("All Tasks"),
    ME_ENGAGEMENT("My Engagements"),
    MY_TEAM_ENGAGEMENT("Team Engagements"),
    ALL_ENGAGEMENT("All Engagements");

    private String todoOption;

    wqh(String str) {
        this.todoOption = str;
    }

    public static wqh fromTodoOption(String str) {
        for (wqh wqhVar : values()) {
            if (wqhVar.todoOption.equalsIgnoreCase(str)) {
                return wqhVar;
            }
        }
        return ME;
    }

    public String getOption() {
        return this.todoOption;
    }
}
