package h1;

import k2.C3953b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 implements k2.h2 {

    /* renamed from: a */
    public Number f15395a;

    /* renamed from: b */
    public Number f15396b;

    /* renamed from: c */
    public final x1 f15397c;

    /* renamed from: d */
    public final k2.e1 f15398d;

    /* renamed from: e */
    public k1 f15399e;

    /* renamed from: f */
    public boolean f15400f;

    /* renamed from: g */
    public boolean f15401g;

    /* renamed from: h */
    public long f15402h;

    /* renamed from: j */
    public final /* synthetic */ g0 f15403j;

    public e0(g0 g0Var, Number number, Number number2, x1 x1Var, d0 d0Var) {
        this.f15403j = g0Var;
        this.f15395a = number;
        this.f15396b = number2;
        this.f15397c = x1Var;
        this.f15398d = C3953b.m8517t(number);
        this.f15399e = new k1(d0Var, x1Var, this.f15395a, this.f15396b, null);
    }

    @Override // k2.h2
    public final Object getValue() {
        return this.f15398d.getValue();
    }
}
