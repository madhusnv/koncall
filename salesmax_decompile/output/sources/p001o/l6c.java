package p001o;

import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class l6c implements ic9 {

    /* renamed from: b */
    public final Object f33310b;

    public l6c(Object obj) {
        this.f33310b = bgd.m18886d(obj);
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        messageDigest.update(this.f33310b.toString().getBytes(ic9.f28450a));
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (obj instanceof l6c) {
            return this.f33310b.equals(((l6c) obj).f33310b);
        }
        return false;
    }

    @Override // p001o.ic9
    public int hashCode() {
        return this.f33310b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f33310b + '}';
    }
}
