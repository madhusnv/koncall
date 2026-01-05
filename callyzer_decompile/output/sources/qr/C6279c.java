package qr;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.InterfaceC6355e;
import sq.g2;
import ur.C7530w;
import w2.InterfaceC7879r;
import yu.AbstractC8775a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6279c implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30510a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f30511b;

    /* renamed from: c */
    public final /* synthetic */ Object f30512c;

    /* renamed from: d */
    public final /* synthetic */ int f30513d;

    /* renamed from: e */
    public final /* synthetic */ Object f30514e;

    /* renamed from: f */
    public final /* synthetic */ List f30515f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC6355e f30516g;

    public /* synthetic */ C6279c(String str, ArrayList arrayList, int i10, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, int i11) {
        this.f30514e = str;
        this.f30515f = arrayList;
        this.f30511b = i10;
        this.f30512c = interfaceC2139c;
        this.f30516g = interfaceC2137a;
        this.f30513d = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30510a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6287k.m12286c((C7530w) this.f30514e, this.f30515f, (InterfaceC2139c) this.f30512c, (InterfaceC2141e) this.f30516g, (InterfaceC3962k) obj, C3953b.m8496A(this.f30511b | 1), this.f30513d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                g2.m13132J((String) this.f30514e, (ArrayList) this.f30515f, this.f30511b, (InterfaceC2139c) this.f30512c, (InterfaceC2137a) this.f30516g, (InterfaceC3962k) obj, C3953b.m8496A(this.f30513d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8775a.m16136g(this.f30515f, (String) this.f30514e, this.f30511b, (InterfaceC2141e) this.f30516g, (InterfaceC7879r) this.f30512c, (InterfaceC3962k) obj, C3953b.m8496A(this.f30513d | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C6279c(List list, String str, int i10, InterfaceC2141e interfaceC2141e, InterfaceC7879r interfaceC7879r, int i11) {
        this.f30515f = list;
        this.f30514e = str;
        this.f30511b = i10;
        this.f30516g = interfaceC2141e;
        this.f30512c = interfaceC7879r;
        this.f30513d = i11;
    }

    public /* synthetic */ C6279c(C7530w c7530w, List list, InterfaceC2139c interfaceC2139c, InterfaceC2141e interfaceC2141e, int i10, int i11) {
        this.f30514e = c7530w;
        this.f30515f = list;
        this.f30512c = interfaceC2139c;
        this.f30516g = interfaceC2141e;
        this.f30511b = i10;
        this.f30513d = i11;
    }
}
