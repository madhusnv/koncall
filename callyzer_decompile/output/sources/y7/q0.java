package y7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a */
    public int f41751a;

    /* renamed from: b */
    public int f41752b;

    /* renamed from: c */
    public int f41753c;

    /* renamed from: d */
    public int f41754d;

    /* renamed from: e */
    public int f41755e;

    /* renamed from: f */
    public boolean f41756f;

    /* renamed from: g */
    public boolean f41757g;

    /* renamed from: h */
    public boolean f41758h;

    /* renamed from: i */
    public boolean f41759i;

    /* renamed from: j */
    public boolean f41760j;

    /* renamed from: k */
    public boolean f41761k;

    /* renamed from: l */
    public int f41762l;

    /* renamed from: m */
    public long f41763m;

    /* renamed from: n */
    public int f41764n;

    /* renamed from: a */
    public final void m15893a(int i10) {
        if ((this.f41754d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f41754d));
    }

    /* renamed from: b */
    public final int m15894b() {
        return this.f41757g ? this.f41752b - this.f41753c : this.f41755e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f41751a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f41755e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f41759i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f41752b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f41753c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f41756f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f41757g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f41760j);
        sb2.append(", mRunPredictiveAnimations=");
        return i0.m0.m7382o(sb2, this.f41761k, '}');
    }
}
