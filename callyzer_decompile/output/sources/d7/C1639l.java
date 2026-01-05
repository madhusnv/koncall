package d7;

import ex.InterfaceC2139c;
import i8.C3182a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import mv.AbstractC4892f;
import ov.C5751b;
import ov.C5757h;
import p7.C5836g;
import q7.C6136c;
import q7.C6138e;
import rw.AbstractC6663m;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C1639l implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ int f8114a;

    /* renamed from: b */
    public final /* synthetic */ Object f8115b;

    public /* synthetic */ C1639l(int i10, Object obj) {
        this.f8114a = i10;
        this.f8115b = obj;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        switch (this.f8114a) {
            case 0:
                ((m1) this.f8115b).m15398j(enumC1644p.getTargetState());
                break;
            case 1:
                ((InterfaceC2139c) this.f8115b).invoke(enumC1644p);
                break;
            case 2:
                C3182a c3182a = (C3182a) this.f8115b;
                if (enumC1644p == EnumC1644p.ON_START) {
                    c3182a.f17113h = true;
                    break;
                } else if (enumC1644p == EnumC1644p.ON_STOP) {
                    c3182a.f17113h = false;
                    break;
                }
                break;
            case 3:
                C5757h c5757h = (C5757h) this.f8115b;
                int i10 = AbstractC4892f.f24420a[enumC1644p.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    c5757h.m11288f(C5751b.f28308a);
                    break;
                }
                break;
            case 4:
                C5836g c5836g = (C5836g) this.f8115b;
                if (enumC1644p == EnumC1644p.ON_DESTROY) {
                    androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) interfaceC1649u;
                    Object obj = null;
                    for (Object obj2 : (Iterable) c5836g.m9225b().f22081f.f39340a.getValue()) {
                        if (AbstractC4154l.m8918a(((C4409i) obj2).f22050f, j0Var.getTag())) {
                            obj = obj2;
                        }
                    }
                    C4409i c4409i = (C4409i) obj;
                    if (c4409i != null) {
                        if (C5836g.m11410n()) {
                            c4409i.toString();
                            interfaceC1649u.toString();
                        }
                        c5836g.m9225b().m9217c(c4409i);
                        break;
                    }
                }
                break;
            default:
                C6138e c6138e = (C6138e) this.f8115b;
                c6138e.f29923q = enumC1644p.getTargetState();
                if (c6138e.f29909c != null) {
                    ArrayList arrayListD0 = AbstractC6663m.d0(c6138e.f29912f);
                    int size = arrayListD0.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayListD0.get(i11);
                        i11++;
                        C4409i c4409i2 = (C4409i) obj3;
                        c4409i2.getClass();
                        C6136c c6136c = c4409i2.f22052h;
                        c6136c.getClass();
                        C4409i c4409i3 = c6136c.f29892a;
                        EnumC1645q targetState = enumC1644p.getTargetState();
                        AbstractC4154l.m8923f(targetState, "<set-?>");
                        c4409i3.f22048d = targetState;
                        c6136c.f29895d = enumC1644p.getTargetState();
                        c6136c.m12164b();
                    }
                    break;
                }
                break;
        }
    }
}
