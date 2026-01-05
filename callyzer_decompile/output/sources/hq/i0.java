package hq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.x9;
import k2.C3953b;
import k2.InterfaceC3962k;
import kr.AbstractC4189d;
import lq.C4508c;
import or.C5447j;
import q1.C6097y;
import sq.b1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16209a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f16210b;

    /* renamed from: c */
    public final /* synthetic */ boolean f16211c;

    /* renamed from: d */
    public final /* synthetic */ Object f16212d;

    /* renamed from: e */
    public final /* synthetic */ int f16213e;

    /* renamed from: f */
    public final /* synthetic */ Object f16214f;

    /* renamed from: g */
    public final /* synthetic */ Object f16215g;

    public /* synthetic */ i0(C4508c c4508c, C6097y c6097y, boolean z6, boolean z10, InterfaceC2139c interfaceC2139c, int i10) {
        this.f16214f = c4508c;
        this.f16215g = c6097y;
        this.f16210b = z6;
        this.f16211c = z10;
        this.f16212d = interfaceC2139c;
        this.f16213e = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16209a) {
            case 0:
                ((Integer) obj2).getClass();
                a0.m7268n((C4508c) this.f16214f, (C6097y) this.f16215g, this.f16210b, this.f16211c, (InterfaceC2139c) this.f16212d, (InterfaceC3962k) obj, C3953b.m8496A(this.f16213e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC4189d.m8943k((C5447j) this.f16214f, this.f16210b, this.f16211c, (InterfaceC2139c) this.f16212d, (InterfaceC2139c) this.f16215g, (InterfaceC3962k) obj, C3953b.m8496A(this.f16213e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                b1.m13097a(this.f16210b, (InterfaceC2137a) this.f16214f, (String) this.f16215g, this.f16211c, (x9) this.f16212d, (InterfaceC3962k) obj, C3953b.m8496A(this.f16213e | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ i0(C5447j c5447j, boolean z6, boolean z10, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, int i10) {
        this.f16214f = c5447j;
        this.f16210b = z6;
        this.f16211c = z10;
        this.f16212d = interfaceC2139c;
        this.f16215g = interfaceC2139c2;
        this.f16213e = i10;
    }

    public /* synthetic */ i0(boolean z6, InterfaceC2137a interfaceC2137a, String str, boolean z10, x9 x9Var, int i10) {
        this.f16210b = z6;
        this.f16214f = interfaceC2137a;
        this.f16215g = str;
        this.f16211c = z10;
        this.f16212d = x9Var;
        this.f16213e = i10;
    }
}
