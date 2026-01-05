package p001o;

/* loaded from: classes6.dex */
public final class dde extends cre {

    /* renamed from: c */
    public final String f19616c;

    /* renamed from: d */
    public final long f19617d;

    /* renamed from: e */
    public final im1 f19618e;

    public dde(String str, long j, im1 im1Var) {
        sq8.m48649h(im1Var, "source");
        this.f19616c = str;
        this.f19617d = j;
        this.f19618e = im1Var;
    }

    @Override // p001o.cre
    /* renamed from: g */
    public long mo21617g() {
        return this.f19617d;
    }

    @Override // p001o.cre
    /* renamed from: h */
    public y9b mo21618h() {
        String str = this.f19616c;
        if (str != null) {
            return y9b.f55104e.m57404b(str);
        }
        return null;
    }

    @Override // p001o.cre
    /* renamed from: o */
    public im1 mo21619o() {
        return this.f19618e;
    }
}
