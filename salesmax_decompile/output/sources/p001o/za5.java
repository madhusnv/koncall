package p001o;

/* loaded from: classes5.dex */
public enum za5 {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");

    private final String nativeProtocolAudience;

    za5(String str) {
        this.nativeProtocolAudience = str;
    }

    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}
