package ug;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35590a;

    /* renamed from: b */
    public final /* synthetic */ y1 f35591b;

    /* renamed from: c */
    public final /* synthetic */ long f35592c;

    /* renamed from: d */
    public final /* synthetic */ boolean f35593d;

    /* renamed from: e */
    public final /* synthetic */ q2 f35594e;

    public /* synthetic */ l2(q2 q2Var, y1 y1Var, long j6, boolean z6, int i10) {
        this.f35590a = i10;
        this.f35591b = y1Var;
        this.f35592c = j6;
        this.f35593d = z6;
        this.f35594e = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35590a) {
            case 0:
                q2 q2Var = this.f35594e;
                y1 y1Var = this.f35591b;
                q2Var.m14119Q(y1Var);
                q2Var.c0(y1Var, this.f35592c, this.f35593d);
                break;
            default:
                q2 q2Var2 = this.f35594e;
                y1 y1Var2 = this.f35591b;
                q2Var2.m14119Q(y1Var2);
                q2Var2.c0(y1Var2, this.f35592c, this.f35593d);
                break;
        }
    }
}
