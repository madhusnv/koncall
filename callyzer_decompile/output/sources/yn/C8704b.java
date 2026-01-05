package yn;

import ao.AbstractC0366e;
import ao.C0362a;
import ao.C0363b;
import ao.C0364c;
import kn.EnumC4131k;
import po.C5984e;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.InterfaceC8210k;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.b */
/* loaded from: classes3.dex */
public final class C8704b implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ C8716n f42077a;

    /* renamed from: b */
    public final /* synthetic */ boolean f42078b;

    public C8704b(C8716n c8716n, boolean z6) {
        this.f42077a = c8716n;
        this.f42078b = z6;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        Object objM16471g;
        Object objM16471g2;
        AbstractC0366e abstractC0366e = (AbstractC0366e) obj;
        C8716n c8716n = this.f42077a;
        C5984e c5984e = c8716n.f42145c;
        C8810d c8810d = c8716n.f42162t;
        C9000c c9000c = c8716n.f42144b;
        boolean z6 = abstractC0366e instanceof C0362a;
        a0 a0Var = a0.f30746a;
        boolean z10 = this.f42078b;
        if (z6) {
            if (c8716n.f42158p.m16221c()) {
                c0.m13502y(c8810d, null, null, new C8715m(c8716n, z10, null), 3);
                return a0Var;
            }
            c8716n.f42163u = false;
            if (z10) {
                C5984e.m12015d(c5984e, EnumC4131k.ERROR);
            }
            if (!c9000c.m16468d("JUST_SYNC") && (objM16471g2 = c9000c.m16471g(interfaceC7559c)) == EnumC7794a.COROUTINE_SUSPENDED) {
                return objM16471g2;
            }
        } else if (abstractC0366e instanceof C0363b) {
            c8716n.f42163u = false;
            c8716n.f42156n.m16234i("FMCMessageTokenUseCase", ((C0363b) abstractC0366e).f2916a);
            if (z10) {
                C5984e.m12015d(c5984e, EnumC4131k.ERROR);
            }
            if (!c9000c.m16468d("JUST_SYNC") && (objM16471g = c9000c.m16471g(interfaceC7559c)) == EnumC7794a.COROUTINE_SUSPENDED) {
                return objM16471g;
            }
        } else if (abstractC0366e instanceof C0364c) {
            c0.m13502y(c8810d, null, null, new C8715m(c8716n, z10, null), 3);
        }
        return a0Var;
    }
}
