package h1;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a */
    public final a0 f15389a;

    /* renamed from: b */
    public AbstractC2785p f15390b;

    /* renamed from: c */
    public AbstractC2785p f15391c;

    /* renamed from: d */
    public AbstractC2785p f15392d;

    /* renamed from: e */
    public final float f15393e;

    public d2(a0 a0Var) {
        this.f15389a = a0Var;
        this.f15393e = a0Var.mo6107s();
    }

    /* renamed from: a */
    public final AbstractC2785p m6797a(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2) {
        if (this.f15391c == null) {
            this.f15391c = abstractC2785p.mo6833c();
        }
        AbstractC2785p abstractC2785p3 = this.f15391c;
        if (abstractC2785p3 == null) {
            AbstractC4154l.m8928k("velocityVector");
            throw null;
        }
        int iMo6832b = abstractC2785p3.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            AbstractC2785p abstractC2785p4 = this.f15391c;
            if (abstractC2785p4 == null) {
                AbstractC4154l.m8928k("velocityVector");
                throw null;
            }
            abstractC2785p.getClass();
            abstractC2785p4.mo6835e(this.f15389a.mo6108x(abstractC2785p2.mo6831a(i10), j6), i10);
        }
        AbstractC2785p abstractC2785p5 = this.f15391c;
        if (abstractC2785p5 != null) {
            return abstractC2785p5;
        }
        AbstractC4154l.m8928k("velocityVector");
        throw null;
    }
}
