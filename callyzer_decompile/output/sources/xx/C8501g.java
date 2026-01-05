package xx;

import dy.AbstractC1862j;
import f9.C2222e;
import g2.e4;
import pg.o6;
import qw.a0;
import tx.C7263w;
import tx.InterfaceC7266z;
import tx.b0;
import tx.c0;
import tx.e1;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.C7818t;
import vx.EnumC7799a;
import vx.InterfaceC7819u;
import vx.InterfaceC7821w;
import xm.h3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.g */
/* loaded from: classes3.dex */
public final class C8501g extends AbstractC8499e {

    /* renamed from: d */
    public final C2222e f41411d;

    /* renamed from: e */
    public final int f41412e;

    public C8501g(C2222e c2222e, int i10, InterfaceC7564h interfaceC7564h, int i11, EnumC7799a enumC7799a) {
        super(interfaceC7564h, i11, enumC7799a);
        this.f41411d = c2222e;
        this.f41412e = i10;
    }

    @Override // xx.AbstractC8499e
    /* renamed from: d */
    public final String mo15391d() {
        return "concurrency=" + this.f41412e;
    }

    @Override // xx.AbstractC8499e
    /* renamed from: e */
    public final Object mo15368e(InterfaceC7819u interfaceC7819u, InterfaceC7559c interfaceC7559c) throws Throwable {
        Object objCollect = this.f41411d.collect(new e4((e1) interfaceC7559c.getContext().o0(C7263w.f34689b), AbstractC1862j.m5494a(this.f41412e), interfaceC7819u, new C8516v(interfaceC7819u), 6), interfaceC7559c);
        return objCollect == EnumC7794a.COROUTINE_SUSPENDED ? objCollect : a0.f30746a;
    }

    @Override // xx.AbstractC8499e
    /* renamed from: f */
    public final AbstractC8499e mo15369f(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return new C8501g(this.f41411d, this.f41412e, interfaceC7564h, i10, enumC7799a);
    }

    @Override // xx.AbstractC8499e
    /* renamed from: h */
    public final InterfaceC7821w mo15393h(InterfaceC7266z interfaceC7266z) {
        h3 h3Var = new h3(this, null, 23);
        EnumC7799a enumC7799a = EnumC7799a.SUSPEND;
        b0 b0Var = b0.DEFAULT;
        C7818t c7818t = new C7818t(c0.m13503z(interfaceC7266z, this.f41403a), o6.m11805a(this.f41404b, enumC7799a, null, 4));
        b0Var.invoke(h3Var, c7818t, c7818t);
        return c7818t;
    }
}
