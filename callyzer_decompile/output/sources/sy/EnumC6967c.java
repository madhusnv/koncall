package sy;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sy.c */
/* loaded from: classes3.dex */
public enum EnumC6967c {
    ABRT,
    ALRM,
    FPE,
    HUP,
    ILL,
    INT,
    KILL,
    PIPE,
    QUIT,
    SEGV,
    TERM,
    USR1,
    USR2,
    UNKNOWN;

    public static EnumC6967c fromString(String str) {
        for (EnumC6967c enumC6967c : values()) {
            if (enumC6967c.toString().equals(str)) {
                return enumC6967c;
            }
        }
        return UNKNOWN;
    }
}
