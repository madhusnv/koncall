package bh;

import android.animation.TimeInterpolator;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bh.c */
/* loaded from: classes.dex */
public final class C0661c {

    /* renamed from: a */
    public long f4209a;

    /* renamed from: b */
    public long f4210b;

    /* renamed from: c */
    public TimeInterpolator f4211c;

    /* renamed from: d */
    public int f4212d;

    /* renamed from: e */
    public int f4213e;

    /* renamed from: a */
    public final TimeInterpolator m1932a() {
        TimeInterpolator timeInterpolator = this.f4211c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0659a.f4204b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0661c)) {
            return false;
        }
        C0661c c0661c = (C0661c) obj;
        if (this.f4209a == c0661c.f4209a && this.f4210b == c0661c.f4210b && this.f4212d == c0661c.f4212d && this.f4213e == c0661c.f4213e) {
            return m1932a().getClass().equals(c0661c.m1932a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f4209a;
        long j10 = this.f4210b;
        return ((((m1932a().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f4212d) * 31) + this.f4213e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(C0661c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f4209a);
        sb2.append(" duration: ");
        sb2.append(this.f4210b);
        sb2.append(" interpolator: ");
        sb2.append(m1932a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f4212d);
        sb2.append(" repeatMode: ");
        return AbstractC5601a.m11233d(this.f4213e, "}\n", sb2);
    }
}
