package p001o;

/* loaded from: classes2.dex */
public final class ki3 implements ehh {

    /* renamed from: b */
    public final long f32268b;

    public /* synthetic */ ki3(long j, id5 id5Var) {
        this(j);
    }

    @Override // p001o.ehh
    /* renamed from: a */
    public long mo25086a() {
        return this.f32268b;
    }

    @Override // p001o.ehh
    /* renamed from: b */
    public float mo25087b() {
        return lh3.m37201j(mo25086a());
    }

    @Override // p001o.ehh
    /* renamed from: c */
    public ql1 mo25088c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki3) && lh3.m37200i(this.f32268b, ((ki3) obj).f32268b);
    }

    public int hashCode() {
        return lh3.m37206o(this.f32268b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) lh3.m37207p(this.f32268b)) + ')';
    }

    public ki3(long j) {
        this.f32268b = j;
        if (!(j != lh3.f33793b.m37212d())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}
