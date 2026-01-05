package hq;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import k2.w0;
import zp.C9007g;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16157a;

    /* renamed from: b */
    public final /* synthetic */ boolean f16158b;

    /* renamed from: c */
    public final /* synthetic */ boolean f16159c;

    /* renamed from: d */
    public final /* synthetic */ Object f16160d;

    /* renamed from: e */
    public final /* synthetic */ Object f16161e;

    public /* synthetic */ b0(Object obj, Object obj2, boolean z6, boolean z10, int i10, int i11) {
        this.f16157a = i11;
        this.f16160d = obj;
        this.f16161e = obj2;
        this.f16158b = z6;
        this.f16159c = z10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16157a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                a0.m7262h((C9008h) this.f16160d, (w0) this.f16161e, this.f16158b, this.f16159c, (InterfaceC3962k) obj, iM8496A);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A2 = C3953b.m8496A(1);
                a0.m7261g((String) this.f16160d, (C9007g) this.f16161e, this.f16158b, this.f16159c, (InterfaceC3962k) obj, iM8496A2);
                break;
        }
        return qw.a0.f30746a;
    }
}
