package p001o;

import p001o.e5g;

/* loaded from: classes2.dex */
public final class m51 extends e5g.AbstractC13105a {

    /* renamed from: a */
    public final Throwable f34803a;

    public m51(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f34803a = th;
    }

    @Override // p001o.e5g.AbstractC13105a
    /* renamed from: a */
    public Throwable mo24345a() {
        return this.f34803a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e5g.AbstractC13105a) {
            return this.f34803a.equals(((e5g.AbstractC13105a) obj).mo24345a());
        }
        return false;
    }

    public int hashCode() {
        return this.f34803a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f34803a + "}";
    }
}
