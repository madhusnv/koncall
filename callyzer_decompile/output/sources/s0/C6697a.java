package s0;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s0.a */
/* loaded from: classes.dex */
public final class C6697a {

    /* renamed from: a */
    public final String f32005a;

    /* renamed from: b */
    public final String f32006b;

    /* renamed from: c */
    public final String f32007c;

    /* renamed from: d */
    public final String f32008d;

    public C6697a(String str, String str2, String str3, String str4) {
        this.f32005a = str;
        this.f32006b = str2;
        this.f32007c = str3;
        this.f32008d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6697a) {
            C6697a c6697a = (C6697a) obj;
            if (this.f32005a.equals(c6697a.f32005a) && this.f32006b.equals(c6697a.f32006b) && this.f32007c.equals(c6697a.f32007c) && this.f32008d.equals(c6697a.f32008d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f32005a.hashCode() ^ 1000003) * 1000003) ^ this.f32006b.hashCode()) * 1000003) ^ this.f32007c.hashCode()) * 1000003) ^ this.f32008d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.f32005a);
        sb2.append(", eglVersion=");
        sb2.append(this.f32006b);
        sb2.append(", glExtensions=");
        sb2.append(this.f32007c);
        sb2.append(", eglExtensions=");
        return AbstractC1452a.m4564k(sb2, this.f32008d, "}");
    }
}
