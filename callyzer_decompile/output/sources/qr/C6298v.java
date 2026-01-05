package qr;

import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import ur.AbstractC7524q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.v */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6298v implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30617a = 0;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7524q f30618b;

    /* renamed from: c */
    public final /* synthetic */ List f30619c;

    /* renamed from: d */
    public final /* synthetic */ int f30620d;

    public /* synthetic */ C6298v(AbstractC7524q abstractC7524q, List list, int i10) {
        this.f30618b = abstractC7524q;
        this.f30619c = list;
        this.f30620d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f30617a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC6287k.m12290g(this.f30618b, this.f30619c, interfaceC3962k, C3953b.m8496A(this.f30620d | 1));
                break;
            default:
                AbstractC6287k.m12292i(this.f30618b, this.f30619c, this.f30620d, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C6298v(AbstractC7524q abstractC7524q, List list, int i10, int i11) {
        this.f30618b = abstractC7524q;
        this.f30619c = list;
        this.f30620d = i10;
    }
}
