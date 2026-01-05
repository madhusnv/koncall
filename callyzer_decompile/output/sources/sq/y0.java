package sq;

import br.C0740c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import or.C5445h;
import zq.AbstractC9018a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33366a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f33367b;

    /* renamed from: c */
    public final /* synthetic */ boolean f33368c;

    /* renamed from: d */
    public final /* synthetic */ int f33369d;

    /* renamed from: e */
    public final /* synthetic */ Object f33370e;

    /* renamed from: f */
    public final /* synthetic */ Object f33371f;

    /* renamed from: g */
    public final /* synthetic */ Object f33372g;

    /* renamed from: h */
    public final /* synthetic */ Object f33373h;

    /* renamed from: j */
    public final /* synthetic */ Object f33374j;

    public /* synthetic */ y0(C0740c c0740c, k2.w0 w0Var, k2.w0 w0Var2, k2.w0 w0Var3, InterfaceC2139c interfaceC2139c, l7.a0 a0Var, boolean z6, int i10) {
        this.f33370e = c0740c;
        this.f33371f = w0Var;
        this.f33372g = w0Var2;
        this.f33373h = w0Var3;
        this.f33367b = interfaceC2139c;
        this.f33374j = a0Var;
        this.f33368c = z6;
        this.f33369d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33366a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                b1.m13100d(this.f33370e, (String) this.f33371f, (InterfaceC2137a) this.f33372g, (List) this.f33373h, (C5445h) this.f33374j, this.f33367b, this.f33368c, (InterfaceC3962k) obj, iM8496A, this.f33369d);
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC9018a.m16485e((C0740c) this.f33370e, (k2.w0) this.f33371f, (k2.w0) this.f33372g, (k2.w0) this.f33373h, this.f33367b, (l7.a0) this.f33374j, this.f33368c, (InterfaceC3962k) obj, C3953b.m8496A(this.f33369d | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ y0(Object obj, String str, InterfaceC2137a interfaceC2137a, List list, C5445h c5445h, InterfaceC2139c interfaceC2139c, boolean z6, int i10, int i11) {
        this.f33370e = obj;
        this.f33371f = str;
        this.f33372g = interfaceC2137a;
        this.f33373h = list;
        this.f33374j = c5445h;
        this.f33367b = interfaceC2139c;
        this.f33368c = z6;
        this.f33369d = i11;
    }
}
