package ek;

import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ek.b */
/* loaded from: classes.dex */
public final class C2062b {

    /* renamed from: a */
    public String f9665a;

    /* renamed from: b */
    public String f9666b;

    /* renamed from: c */
    public String f9667c;

    /* renamed from: d */
    public String f9668d;

    /* renamed from: e */
    public long f9669e;

    /* renamed from: f */
    public byte f9670f;

    /* renamed from: a */
    public final C2063c m5789a() {
        if (this.f9670f == 1 && this.f9665a != null && this.f9666b != null && this.f9667c != null && this.f9668d != null) {
            return new C2063c(this.f9665a, this.f9666b, this.f9667c, this.f9668d, this.f9669e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f9665a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f9666b == null) {
            sb2.append(" variantId");
        }
        if (this.f9667c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f9668d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f9670f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(a1.m14334n(sb2, "Missing required properties:"));
    }
}
