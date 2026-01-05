package bt;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import mm.C4802m;
import qv.AbstractC6327b;
import sv.C6954b;
import wr.AbstractC8154j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.s */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0774s implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4912a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f4913b;

    /* renamed from: c */
    public final /* synthetic */ int f4914c;

    /* renamed from: d */
    public final /* synthetic */ Object f4915d;

    /* renamed from: e */
    public final /* synthetic */ Object f4916e;

    /* renamed from: f */
    public final /* synthetic */ Object f4917f;

    public /* synthetic */ C0774s(C4802m c4802m, InterfaceC2139c interfaceC2139c, C6954b c6954b, boolean z6, int i10) {
        this.f4915d = c4802m;
        this.f4916e = interfaceC2139c;
        this.f4917f = c6954b;
        this.f4913b = z6;
        this.f4914c = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4912a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                b0.m2065d(this.f4913b, this.f4914c, (InterfaceC2137a) this.f4915d, (InterfaceC2137a) this.f4916e, (InterfaceC2137a) this.f4917f, (InterfaceC3962k) obj, iM8496A);
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC6327b.m12348m((C4802m) this.f4915d, (InterfaceC2139c) this.f4916e, (C6954b) this.f4917f, this.f4913b, (InterfaceC3962k) obj, C3953b.m8496A(this.f4914c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC8154j.m15337p(this.f4913b, (List) this.f4916e, (InterfaceC2139c) this.f4917f, (InterfaceC2137a) this.f4915d, (InterfaceC3962k) obj, C3953b.m8496A(this.f4914c | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C0774s(boolean z6, int i10, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, InterfaceC2137a interfaceC2137a3, int i11) {
        this.f4913b = z6;
        this.f4914c = i10;
        this.f4915d = interfaceC2137a;
        this.f4916e = interfaceC2137a2;
        this.f4917f = interfaceC2137a3;
    }

    public /* synthetic */ C0774s(boolean z6, List list, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, int i10) {
        this.f4913b = z6;
        this.f4916e = list;
        this.f4917f = interfaceC2139c;
        this.f4915d = interfaceC2137a;
        this.f4914c = i10;
    }
}
