package sj;

import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sj.a */
/* loaded from: classes.dex */
public final class C6849a {

    /* renamed from: a */
    public String f32513a;

    /* renamed from: b */
    public EnumC6852d f32514b;

    /* renamed from: c */
    public String f32515c;

    /* renamed from: d */
    public String f32516d;

    /* renamed from: e */
    public long f32517e;

    /* renamed from: f */
    public long f32518f;

    /* renamed from: g */
    public String f32519g;

    /* renamed from: h */
    public byte f32520h;

    /* renamed from: a */
    public final C6850b m13047a() {
        if (this.f32520h == 3 && this.f32514b != null) {
            return new C6850b(this.f32513a, this.f32514b, this.f32515c, this.f32516d, this.f32517e, this.f32518f, this.f32519g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f32514b == null) {
            sb2.append(" registrationStatus");
        }
        if ((this.f32520h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f32520h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(a1.m14334n(sb2, "Missing required properties:"));
    }

    /* renamed from: b */
    public final void m13048b(EnumC6852d enumC6852d) {
        if (enumC6852d == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f32514b = enumC6852d;
    }
}
