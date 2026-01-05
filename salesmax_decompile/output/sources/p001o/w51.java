package p001o;

import p001o.gjg;

/* loaded from: classes2.dex */
public final class w51 extends gjg.AbstractC13760b {

    /* renamed from: a */
    public final int f51497a;

    /* renamed from: b */
    public final vc8 f51498b;

    public w51(int i, vc8 vc8Var) {
        this.f51497a = i;
        if (vc8Var == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f51498b = vc8Var;
    }

    @Override // p001o.gjg.AbstractC13760b
    /* renamed from: a */
    public vc8 mo28900a() {
        return this.f51498b;
    }

    @Override // p001o.gjg.AbstractC13760b
    /* renamed from: b */
    public int mo28901b() {
        return this.f51497a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gjg.AbstractC13760b)) {
            return false;
        }
        gjg.AbstractC13760b abstractC13760b = (gjg.AbstractC13760b) obj;
        return this.f51497a == abstractC13760b.mo28901b() && this.f51498b.equals(abstractC13760b.mo28900a());
    }

    public int hashCode() {
        return ((this.f51497a ^ 1000003) * 1000003) ^ this.f51498b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f51497a + ", imageCaptureException=" + this.f51498b + "}";
    }
}
