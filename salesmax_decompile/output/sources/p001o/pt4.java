package p001o;

/* loaded from: classes.dex */
public enum pt4 {
    ME("My Dashboard"),
    MY_TEAM("Team Dashboard"),
    ALL("All Dashboard");

    private String dashboardOption;

    pt4(String str) {
        this.dashboardOption = str;
    }

    public static pt4 fromDashboardOption(String str) {
        for (pt4 pt4Var : values()) {
            if (pt4Var.dashboardOption.equalsIgnoreCase(str)) {
                return pt4Var;
            }
        }
        return ME;
    }

    public String getOption() {
        return this.dashboardOption;
    }
}
