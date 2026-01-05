package kk;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.c */
/* loaded from: classes.dex */
public final class C4083c {

    /* renamed from: d */
    public static final C4083c f20961d = new C4083c("", "", false);

    /* renamed from: a */
    public final String f20962a;

    /* renamed from: b */
    public final String f20963b;

    /* renamed from: c */
    public final boolean f20964c;

    static {
        new C4083c("\n", "  ", true);
    }

    public C4083c(String str, String str2, boolean z6) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f20962a = str;
        this.f20963b = str2;
        this.f20964c = z6;
    }
}
