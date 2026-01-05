package d7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 implements h0 {

    /* renamed from: a */
    public final d0 f8099a;

    /* renamed from: b */
    public final h0 f8100b;

    /* renamed from: c */
    public int f8101c = -1;

    public e0(d0 d0Var, h0 h0Var) {
        this.f8099a = d0Var;
        this.f8100b = h0Var;
    }

    @Override // d7.h0
    public final void onChanged(Object obj) {
        int i10 = this.f8101c;
        int i11 = this.f8099a.f8089g;
        if (i10 != i11) {
            this.f8101c = i11;
            this.f8100b.onChanged(obj);
        }
    }
}
