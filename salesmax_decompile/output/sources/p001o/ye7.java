package p001o;

import p001o.u6f;

/* loaded from: classes3.dex */
public final class ye7 implements tff {

    /* renamed from: a */
    public final t6f f55339a;

    /* renamed from: b */
    public final String f55340b;

    public ye7(t6f t6fVar, String str) {
        sq8.m48649h(t6fVar, "buffer");
        sq8.m48649h(str, "prefix");
        this.f55339a = t6fVar;
        this.f55340b = str;
    }

    /* renamed from: A */
    public static final y3i m57677A(int i, t6f t6fVar) {
        sq8.m48649h(t6fVar, "$this$write");
        ze7.m59340g(t6fVar, Integer.valueOf(i));
        return y3i.f54824a;
    }

    /* renamed from: D */
    public static final y3i m57678D(String str, t6f t6fVar) {
        sq8.m48649h(t6fVar, "$this$write");
        u6f.C17307a.m51045b(t6fVar, ze7.m59342i(str), 0, 0, 6, null);
        return y3i.f54824a;
    }

    /* renamed from: y */
    public static final y3i m57682y(float f, t6f t6fVar) {
        sq8.m48649h(t6fVar, "$this$write");
        ze7.m59340g(t6fVar, Float.valueOf(f));
        return y3i.f54824a;
    }

    /* renamed from: B */
    public final void m57683B(final String str) {
        m57684C(new xk7() { // from class: o.we7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return ye7.m57678D(str, (t6f) obj);
            }
        });
    }

    /* renamed from: C */
    public final void m57684C(xk7 xk7Var) {
        xk7Var.invoke(this.f55339a);
    }

    @Override // p001o.tff
    /* renamed from: a */
    public byte[] mo41870a() {
        return this.f55339a.mo49492m();
    }

    @Override // p001o.zhd
    /* renamed from: d */
    public void mo21108d(String str) {
        sq8.m48649h(str, "value");
        m57683B(str);
    }

    @Override // p001o.tff
    /* renamed from: h */
    public l9g mo41871h(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        return new ff7(this, h7fVar, this.f55340b);
    }

    @Override // p001o.tff
    /* renamed from: m */
    public yra mo41872m(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        return new te7(this, h7fVar);
    }

    @Override // p001o.tff
    /* renamed from: o */
    public gfa mo41873o(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        return new qe7(this, h7fVar);
    }

    /* renamed from: v */
    public final t6f m57685v() {
        return this.f55339a;
    }

    /* renamed from: w */
    public void m57686w(boolean z) {
        m57683B(String.valueOf(z));
    }

    /* renamed from: x */
    public void m57687x(final float f) {
        m57684C(new xk7() { // from class: o.xe7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return ye7.m57682y(f, (t6f) obj);
            }
        });
    }

    /* renamed from: z */
    public void m57688z(final int i) {
        m57684C(new xk7() { // from class: o.ve7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return ye7.m57677A(i, (t6f) obj);
            }
        });
    }

    public /* synthetic */ ye7(t6f t6fVar, String str, int i, id5 id5Var) {
        this(t6fVar, (i & 2) != 0 ? "" : str);
    }
}
