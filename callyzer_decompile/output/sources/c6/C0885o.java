package c6;

import android.content.Context;
import d6.AbstractC1614d;
import d7.EnumC1644p;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import java.util.List;
import java.util.Objects;
import l7.C4409i;
import p004e.AbstractActivityC1878m;
import p7.C5836g;
import r5.AbstractC6468c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C0885o implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ int f5489a;

    /* renamed from: b */
    public final /* synthetic */ Object f5490b;

    /* renamed from: c */
    public final /* synthetic */ Object f5491c;

    public /* synthetic */ C0885o(int i10, Object obj, Object obj2) {
        this.f5489a = i10;
        this.f5490b = obj;
        this.f5491c = obj2;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        switch (this.f5489a) {
            case 0:
                C0887q c0887q = (C0887q) this.f5490b;
                InterfaceC0888r interfaceC0888r = (InterfaceC0888r) this.f5491c;
                c0887q.getClass();
                if (enumC1644p == EnumC1644p.ON_DESTROY) {
                    c0887q.m2487b(interfaceC0888r);
                    break;
                }
                break;
            case 1:
                p004e.c0 c0Var = (p004e.c0) this.f5490b;
                AbstractActivityC1878m abstractActivityC1878m = (AbstractActivityC1878m) this.f5491c;
                if (enumC1644p == EnumC1644p.ON_CREATE) {
                    c0Var.f8871e = AbstractC1614d.m5266b(abstractActivityC1878m);
                    c0Var.m5503d(c0Var.f8873g);
                    break;
                }
                break;
            case 2:
                C5836g c5836g = (C5836g) this.f5490b;
                C4409i c4409i = (C4409i) this.f5491c;
                if (enumC1644p == EnumC1644p.ON_RESUME && ((List) c5836g.m9225b().f22080e.f39340a.getValue()).contains(c4409i)) {
                    if (C5836g.m11410n()) {
                        Objects.toString(c4409i);
                        interfaceC1649u.toString();
                    }
                    c5836g.m9225b().m9217c(c4409i);
                }
                if (enumC1644p == EnumC1644p.ON_DESTROY) {
                    if (C5836g.m11410n()) {
                        Objects.toString(c4409i);
                        interfaceC1649u.toString();
                    }
                    c5836g.m9225b().m9217c(c4409i);
                    break;
                }
                break;
            default:
                Context context = (Context) this.f5490b;
                k2.w0 w0Var = (k2.w0) this.f5491c;
                if (enumC1644p == EnumC1644p.ON_RESUME) {
                    w0Var.setValue(Boolean.valueOf(AbstractC6468c.m12450a(context, "android.permission.CAMERA") == 0));
                    break;
                }
                break;
        }
    }
}
