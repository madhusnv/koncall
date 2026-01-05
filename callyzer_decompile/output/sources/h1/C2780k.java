package h1;

import k2.C3953b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.k */
/* loaded from: classes.dex */
public final class C2780k implements k2.h2 {

    /* renamed from: a */
    public final x1 f15489a;

    /* renamed from: b */
    public final k2.e1 f15490b;

    /* renamed from: c */
    public AbstractC2785p f15491c;

    /* renamed from: d */
    public long f15492d;

    /* renamed from: e */
    public long f15493e;

    /* renamed from: f */
    public boolean f15494f;

    public /* synthetic */ C2780k(x1 x1Var, Object obj, AbstractC2785p abstractC2785p, int i10) {
        this(x1Var, obj, (i10 & 4) != 0 ? null : abstractC2785p, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final Object m6828b() {
        return this.f15489a.f15662b.invoke(this.f15491c);
    }

    @Override // k2.h2
    public final Object getValue() {
        return this.f15490b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f15490b.getValue() + ", velocity=" + m6828b() + ", isRunning=" + this.f15494f + ", lastFrameTimeNanos=" + this.f15492d + ", finishedTimeNanos=" + this.f15493e + ')';
    }

    public C2780k(x1 x1Var, Object obj, AbstractC2785p abstractC2785p, long j6, long j10, boolean z6) {
        AbstractC2785p abstractC2785pM6788k;
        this.f15489a = x1Var;
        this.f15490b = C3953b.m8517t(obj);
        if (abstractC2785p != null) {
            abstractC2785pM6788k = AbstractC2773d.m6788k(abstractC2785p);
        } else {
            abstractC2785pM6788k = (AbstractC2785p) x1Var.f15661a.invoke(obj);
            abstractC2785pM6788k.mo6834d();
        }
        this.f15491c = abstractC2785pM6788k;
        this.f15492d = j6;
        this.f15493e = j10;
        this.f15494f = z6;
    }
}
