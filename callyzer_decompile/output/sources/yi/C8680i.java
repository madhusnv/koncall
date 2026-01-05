package yi;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.i */
/* loaded from: classes.dex */
public final class C8680i {

    /* renamed from: c */
    public static final C8680i f42019c = new C8680i(0, 0);

    /* renamed from: a */
    public final int f42020a;

    /* renamed from: b */
    public final int f42021b;

    public C8680i(int i10, int i11) {
        this.f42020a = i10;
        this.f42021b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C8680i.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f42020a);
        sb2.append(", length = ");
        return AbstractC5601a.m11233d(this.f42021b, "]", sb2);
    }
}
