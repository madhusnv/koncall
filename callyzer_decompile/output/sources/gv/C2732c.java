package gv;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g4.o0;
import i1.C3138q;
import im.EnumC3313o;
import iv.C3357a;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.InterfaceC6355e;
import qw.a0;
import rr.AbstractC6601a;
import sq.g2;
import w2.InterfaceC7879r;
import wr.AbstractC8154j;
import zr.C9031a;
import zr.C9032b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gv.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2732c implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15258a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f15259b;

    /* renamed from: c */
    public final /* synthetic */ Object f15260c;

    /* renamed from: d */
    public final /* synthetic */ int f15261d;

    /* renamed from: e */
    public final /* synthetic */ Object f15262e;

    /* renamed from: f */
    public final /* synthetic */ Object f15263f;

    /* renamed from: g */
    public final /* synthetic */ Object f15264g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC6355e f15265h;

    public /* synthetic */ C2732c(C3357a c3357a, InterfaceC2139c interfaceC2139c, List list, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, InterfaceC2137a interfaceC2137a, int i10) {
        this.f15262e = c3357a;
        this.f15260c = interfaceC2139c;
        this.f15259b = list;
        this.f15263f = interfaceC2139c2;
        this.f15264g = interfaceC2139c3;
        this.f15265h = interfaceC2137a;
        this.f15261d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15258a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC2730a.m6731c((C3357a) this.f15262e, (InterfaceC2139c) this.f15260c, (List) this.f15259b, (InterfaceC2139c) this.f15263f, (InterfaceC2139c) this.f15264g, (InterfaceC2137a) this.f15265h, (InterfaceC3962k) obj, C3953b.m8496A(this.f15261d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC6601a.m12658a((InterfaceC7879r) this.f15262e, (List) this.f15259b, (String) this.f15263f, (String) this.f15264g, (InterfaceC2139c) this.f15260c, (InterfaceC2141e) this.f15265h, (InterfaceC3962k) obj, C3953b.m8496A(this.f15261d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(385);
                g2.m13133K((String) this.f15262e, (InterfaceC7879r) this.f15260c, (o0) this.f15263f, this.f15261d, (C3138q) this.f15264g, (InterfaceC7879r) this.f15259b, (InterfaceC2137a) this.f15265h, (InterfaceC3962k) obj, iM8496A);
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC8154j.m15326e((C9032b) this.f15262e, (List) this.f15259b, (EnumC3313o) this.f15263f, (InterfaceC2139c) this.f15260c, (C9031a) this.f15264g, (InterfaceC2137a) this.f15265h, (InterfaceC3962k) obj, C3953b.m8496A(this.f15261d | 1));
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C2732c(String str, InterfaceC7879r interfaceC7879r, o0 o0Var, int i10, C3138q c3138q, InterfaceC7879r interfaceC7879r2, InterfaceC2137a interfaceC2137a, int i11) {
        this.f15262e = str;
        this.f15260c = interfaceC7879r;
        this.f15263f = o0Var;
        this.f15261d = i10;
        this.f15264g = c3138q;
        this.f15259b = interfaceC7879r2;
        this.f15265h = interfaceC2137a;
    }

    public /* synthetic */ C2732c(InterfaceC7879r interfaceC7879r, List list, String str, String str2, InterfaceC2139c interfaceC2139c, InterfaceC2141e interfaceC2141e, int i10) {
        this.f15262e = interfaceC7879r;
        this.f15259b = list;
        this.f15263f = str;
        this.f15264g = str2;
        this.f15260c = interfaceC2139c;
        this.f15265h = interfaceC2141e;
        this.f15261d = i10;
    }

    public /* synthetic */ C2732c(C9032b c9032b, List list, EnumC3313o enumC3313o, InterfaceC2139c interfaceC2139c, C9031a c9031a, InterfaceC2137a interfaceC2137a, int i10) {
        this.f15262e = c9032b;
        this.f15259b = list;
        this.f15263f = enumC3313o;
        this.f15260c = interfaceC2139c;
        this.f15264g = c9031a;
        this.f15265h = interfaceC2137a;
        this.f15261d = i10;
    }
}
