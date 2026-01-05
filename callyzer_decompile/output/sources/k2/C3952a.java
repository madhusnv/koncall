package k2;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.a */
/* loaded from: classes.dex */
public final class C3952a {

    /* renamed from: a */
    public int f20343a;

    public C3952a(int i10) {
        this.f20343a = i10;
    }

    /* renamed from: a */
    public final boolean m8486a() {
        return this.f20343a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return AbstractC5601a.m11233d(this.f20343a, " }", sb2);
    }
}
