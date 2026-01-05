package p001o;

import p001o.zh1;

/* loaded from: classes2.dex */
public final class y31 extends zh1.AbstractC18634b {

    /* renamed from: a */
    public final lic f54807a;

    /* renamed from: b */
    public final int f54808b;

    public y31(lic licVar, int i) {
        if (licVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f54807a = licVar;
        this.f54808b = i;
    }

    @Override // p001o.zh1.AbstractC18634b
    /* renamed from: a */
    public int mo57160a() {
        return this.f54808b;
    }

    @Override // p001o.zh1.AbstractC18634b
    /* renamed from: b */
    public lic mo57161b() {
        return this.f54807a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zh1.AbstractC18634b)) {
            return false;
        }
        zh1.AbstractC18634b abstractC18634b = (zh1.AbstractC18634b) obj;
        return this.f54807a.equals(abstractC18634b.mo57161b()) && this.f54808b == abstractC18634b.mo57160a();
    }

    public int hashCode() {
        return ((this.f54807a.hashCode() ^ 1000003) * 1000003) ^ this.f54808b;
    }

    public String toString() {
        return "In{packet=" + this.f54807a + ", jpegQuality=" + this.f54808b + "}";
    }
}
