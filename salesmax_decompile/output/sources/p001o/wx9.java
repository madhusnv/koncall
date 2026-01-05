package p001o;

/* loaded from: classes.dex */
public enum wx9 {
    ME("My Leads"),
    MY_TEAM("My Team Leads"),
    ALL("All Leads");

    private String leadOption;

    wx9(String str) {
        this.leadOption = str;
    }

    public static wx9 fromLeadOptionType(String str) {
        for (wx9 wx9Var : values()) {
            if (wx9Var.leadOption.equalsIgnoreCase(str)) {
                return wx9Var;
            }
        }
        return ME;
    }

    public String getOption() {
        return this.leadOption;
    }
}
