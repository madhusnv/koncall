package p001o;

import p001o.g32;
import p001o.li5;

/* loaded from: classes2.dex */
public final class i41 extends li5.AbstractC15080b {

    /* renamed from: a */
    public final int f28002a;

    /* renamed from: b */
    public final int f28003b;

    /* renamed from: c */
    public final g32.C13614a f28004c;

    public i41(int i, int i2, g32.C13614a c13614a) {
        this.f28002a = i;
        this.f28003b = i2;
        if (c13614a == null) {
            throw new NullPointerException("Null completer");
        }
        this.f28004c = c13614a;
    }

    @Override // p001o.li5.AbstractC15080b
    /* renamed from: a */
    public g32.C13614a mo31481a() {
        return this.f28004c;
    }

    @Override // p001o.li5.AbstractC15080b
    /* renamed from: b */
    public int mo31482b() {
        return this.f28002a;
    }

    @Override // p001o.li5.AbstractC15080b
    /* renamed from: c */
    public int mo31483c() {
        return this.f28003b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof li5.AbstractC15080b)) {
            return false;
        }
        li5.AbstractC15080b abstractC15080b = (li5.AbstractC15080b) obj;
        return this.f28002a == abstractC15080b.mo31482b() && this.f28003b == abstractC15080b.mo31483c() && this.f28004c.equals(abstractC15080b.mo31481a());
    }

    public int hashCode() {
        return ((((this.f28002a ^ 1000003) * 1000003) ^ this.f28003b) * 1000003) ^ this.f28004c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f28002a + ", rotationDegrees=" + this.f28003b + ", completer=" + this.f28004c + "}";
    }
}
