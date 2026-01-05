package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class pb0 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ pb0[] $VALUES;
    private final String protocolId;
    public static final pb0 HTTP1_1 = new pb0("HTTP1_1", 0, "http/1.1");
    public static final pb0 HTTP2 = new pb0("HTTP2", 1, "h2");
    public static final pb0 H2_PRIOR_KNOWLEDGE = new pb0("H2_PRIOR_KNOWLEDGE", 2, "h2_prior_knowledge");
    public static final pb0 HTTP3 = new pb0("HTTP3", 3, "h3");

    private static final /* synthetic */ pb0[] $values() {
        return new pb0[]{HTTP1_1, HTTP2, H2_PRIOR_KNOWLEDGE, HTTP3};
    }

    static {
        pb0[] pb0VarArr$values = $values();
        $VALUES = pb0VarArr$values;
        $ENTRIES = hi6.m30609a(pb0VarArr$values);
    }

    private pb0(String str, int i, String str2) {
        this.protocolId = str2;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static pb0 valueOf(String str) {
        return (pb0) Enum.valueOf(pb0.class, str);
    }

    public static pb0[] values() {
        return (pb0[]) $VALUES.clone();
    }

    public final String getProtocolId() {
        return this.protocolId;
    }
}
