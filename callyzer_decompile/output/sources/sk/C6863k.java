package sk;

import a2.AbstractC0030c;
import java.io.Serializable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sk.k */
/* loaded from: classes.dex */
public final class C6863k implements Serializable {

    /* renamed from: a */
    public int f32610a;

    /* renamed from: b */
    public long f32611b;

    /* renamed from: c */
    public boolean f32612c;

    /* renamed from: d */
    public String f32613d;

    /* renamed from: e */
    public boolean f32614e;

    /* renamed from: f */
    public boolean f32615f;

    /* renamed from: g */
    public boolean f32616g;

    /* renamed from: h */
    public int f32617h;

    /* renamed from: j */
    public String f32618j;

    /* renamed from: k */
    public EnumC6862j f32619k;

    /* renamed from: l */
    public String f32620l;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6863k)) {
            return false;
        }
        C6863k c6863k = (C6863k) obj;
        if (this == c6863k) {
            return true;
        }
        return this.f32610a == c6863k.f32610a && this.f32611b == c6863k.f32611b && this.f32613d.equals(c6863k.f32613d) && this.f32615f == c6863k.f32615f && this.f32617h == c6863k.f32617h && this.f32618j.equals(c6863k.f32618j) && this.f32619k == c6863k.f32619k && this.f32620l.equals(c6863k.f32620l);
    }

    public final int hashCode() {
        return ((this.f32620l.hashCode() + ((this.f32619k.hashCode() + AbstractC0030c.m113d((((AbstractC0030c.m113d((Long.valueOf(this.f32611b).hashCode() + ((2173 + this.f32610a) * 53)) * 53, 53, this.f32613d) + (this.f32615f ? 1231 : 1237)) * 53) + this.f32617h) * 53, 53, this.f32618j)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country Code: ");
        sb2.append(this.f32610a);
        sb2.append(" National Number: ");
        sb2.append(this.f32611b);
        if (this.f32614e && this.f32615f) {
            sb2.append(" Leading Zero(s): true");
        }
        if (this.f32616g) {
            sb2.append(" Number of leading zeros: ");
            sb2.append(this.f32617h);
        }
        if (this.f32612c) {
            sb2.append(" Extension: ");
            sb2.append(this.f32613d);
        }
        return sb2.toString();
    }
}
