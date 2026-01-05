package sd;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sd.b */
/* loaded from: classes.dex */
public final class C6808b {

    /* renamed from: f */
    public static final C6808b f32347f;

    /* renamed from: a */
    public final String f32348a;

    /* renamed from: b */
    public final String f32349b;

    /* renamed from: c */
    public final InterfaceC6811e f32350c;

    /* renamed from: d */
    public final boolean f32351d;

    /* renamed from: e */
    public final boolean f32352e;

    static {
        InterfaceC6811e.f32355a.getClass();
        f32347f = new C6808b("", "", C6810d.f32354b);
    }

    public C6808b(String decoded, String encoded, InterfaceC6811e encoding) {
        AbstractC4154l.m8923f(decoded, "decoded");
        AbstractC4154l.m8923f(encoded, "encoded");
        AbstractC4154l.m8923f(encoding, "encoding");
        this.f32348a = decoded;
        this.f32349b = encoded;
        this.f32350c = encoding;
        boolean z6 = decoded.length() == 0 && encoded.length() == 0;
        this.f32351d = z6;
        this.f32352e = !z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6808b)) {
            return false;
        }
        C6808b c6808b = (C6808b) obj;
        return AbstractC4154l.m8918a(this.f32348a, c6808b.f32348a) && AbstractC4154l.m8918a(this.f32349b, c6808b.f32349b);
    }

    public final int hashCode() {
        return this.f32349b.hashCode() + (this.f32348a.hashCode() * 31);
    }

    public final String toString() {
        return "Encodable(decoded=" + this.f32348a + ", encoded=" + this.f32349b + ", encoding=" + this.f32350c.getName() + ")";
    }
}
