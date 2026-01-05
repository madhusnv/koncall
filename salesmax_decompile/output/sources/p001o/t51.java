package p001o;

import android.view.Surface;
import p001o.bgg;

/* loaded from: classes2.dex */
public final class t51 extends bgg.AbstractC12389g {

    /* renamed from: a */
    public final int f46391a;

    /* renamed from: b */
    public final Surface f46392b;

    public t51(int i, Surface surface) {
        this.f46391a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f46392b = surface;
    }

    @Override // p001o.bgg.AbstractC12389g
    /* renamed from: a */
    public int mo18940a() {
        return this.f46391a;
    }

    @Override // p001o.bgg.AbstractC12389g
    /* renamed from: b */
    public Surface mo18941b() {
        return this.f46392b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bgg.AbstractC12389g)) {
            return false;
        }
        bgg.AbstractC12389g abstractC12389g = (bgg.AbstractC12389g) obj;
        return this.f46391a == abstractC12389g.mo18940a() && this.f46392b.equals(abstractC12389g.mo18941b());
    }

    public int hashCode() {
        return ((this.f46391a ^ 1000003) * 1000003) ^ this.f46392b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f46391a + ", surface=" + this.f46392b + "}";
    }
}
