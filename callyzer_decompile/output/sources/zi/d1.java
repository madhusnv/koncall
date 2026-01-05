package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a */
    public f1 f43056a;

    /* renamed from: b */
    public String f43057b;

    /* renamed from: c */
    public String f43058c;

    /* renamed from: d */
    public long f43059d;

    /* renamed from: e */
    public byte f43060e;

    /* renamed from: a */
    public final e1 m16447a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.f43060e == 1 && (f1Var = this.f43056a) != null && (str = this.f43057b) != null && (str2 = this.f43058c) != null) {
            return new e1(f1Var, str, str2, this.f43059d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f43056a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f43057b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f43058c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f43060e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
