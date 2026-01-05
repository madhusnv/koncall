package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qq0 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ qq0[] $VALUES;
    public static final qq0 assign_to_yourself = new qq0("assign_to_yourself", 0);
    public static final qq0 assign_later = new qq0("assign_later", 1);
    public static final qq0 assign_to_team = new qq0("assign_to_team", 2);
    public static final qq0 assign_to_user = new qq0("assign_to_user", 3);
    public static final qq0 send_for_distribution = new qq0("send_for_distribution", 4);

    private static final /* synthetic */ qq0[] $values() {
        return new qq0[]{assign_to_yourself, assign_later, assign_to_team, assign_to_user, send_for_distribution};
    }

    static {
        qq0[] qq0VarArr$values = $values();
        $VALUES = qq0VarArr$values;
        $ENTRIES = hi6.m30609a(qq0VarArr$values);
    }

    private qq0(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static qq0 valueOf(String str) {
        return (qq0) Enum.valueOf(qq0.class, str);
    }

    public static qq0[] values() {
        return (qq0[]) $VALUES.clone();
    }
}
