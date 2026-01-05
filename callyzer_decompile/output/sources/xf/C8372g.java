package xf;

import c9.C0910e;
import hd.C2893e;
import ig.C3245a;
import java.util.Arrays;
import jg.AbstractC3763b;
import oj.C5392d;
import pf.C5904d;
import pg.l8;
import qf.AbstractC6206e;
import qf.InterfaceC6210i;
import sf.AbstractC6840z;
import ug.g1;
import wf.C8025a;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xf.g */
/* loaded from: classes.dex */
public final class C8372g extends AbstractC6206e {

    /* renamed from: k */
    public static final C0910e f40031k = new C0910e("ModuleInstall.API", new C3245a(8), new C5392d(25));

    /* renamed from: c */
    public final C8656m m15542c(InterfaceC6210i... interfaceC6210iArr) {
        AbstractC6840z.m13030a("Please provide at least one OptionalModuleApi.", interfaceC6210iArr.length > 0);
        for (InterfaceC6210i interfaceC6210i : interfaceC6210iArr) {
            AbstractC6840z.m13037h(interfaceC6210i, "Requested API must not be null.");
        }
        C8366a c8366aM15539b = C8366a.m15539b(Arrays.asList(interfaceC6210iArr), false);
        if (c8366aM15539b.f40024a.isEmpty()) {
            return l8.m11765f(new C8025a(true, 0));
        }
        C2893e c2893eM7007b = C2893e.m7007b();
        c2893eM7007b.f15925d = new C5904d[]{AbstractC3763b.f19643c};
        c2893eM7007b.f15923b = 27301;
        c2893eM7007b.f15922a = false;
        c2893eM7007b.f15924c = new g1(this, c8366aM15539b);
        return m12223b(0, c2893eM7007b.m7008a());
    }
}
