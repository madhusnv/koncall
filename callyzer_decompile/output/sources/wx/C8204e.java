package wx;

import ex.InterfaceC2141e;
import java.util.Iterator;
import pg.o6;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.C7818t;
import vx.EnumC7799a;
import vx.InterfaceC7819u;
import vx.InterfaceC7821w;
import ww.AbstractC8199i;
import xm.h3;
import xx.AbstractC8499e;
import xx.C8516v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.e */
/* loaded from: classes3.dex */
public class C8204e extends AbstractC8499e {

    /* renamed from: d */
    public final /* synthetic */ int f39209d = 0;

    /* renamed from: e */
    public final Object f39210e;

    public C8204e(Iterable iterable, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        super(interfaceC7564h, i10, enumC7799a);
        this.f39210e = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // xx.AbstractC8499e
    /* renamed from: e */
    public Object mo15368e(InterfaceC7819u interfaceC7819u, InterfaceC7559c interfaceC7559c) {
        switch (this.f39209d) {
            case 0:
                Object objInvoke = ((AbstractC8199i) this.f39210e).invoke(interfaceC7819u, interfaceC7559c);
                if (objInvoke != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                C8516v c8516v = new C8516v(interfaceC7819u);
                Iterator it = this.f39210e.iterator();
                while (it.hasNext()) {
                    tx.c0.m13502y(interfaceC7819u, null, null, new h3((InterfaceC8209j) it.next(), c8516v, null, 25), 3);
                }
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // xx.AbstractC8499e
    /* renamed from: f */
    public AbstractC8499e mo15369f(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        switch (this.f39209d) {
            case 0:
                return new C8204e((InterfaceC2141e) this.f39210e, interfaceC7564h, i10, enumC7799a);
            default:
                return new C8204e((Iterable) this.f39210e, interfaceC7564h, i10, enumC7799a);
        }
    }

    @Override // xx.AbstractC8499e
    /* renamed from: h */
    public InterfaceC7821w mo15393h(InterfaceC7266z interfaceC7266z) {
        switch (this.f39209d) {
            case 1:
                h3 h3Var = new h3(this, null, 23);
                EnumC7799a enumC7799a = EnumC7799a.SUSPEND;
                tx.b0 b0Var = tx.b0.DEFAULT;
                C7818t c7818t = new C7818t(tx.c0.m13503z(interfaceC7266z, this.f41403a), o6.m11805a(this.f41404b, enumC7799a, null, 4));
                b0Var.invoke(h3Var, c7818t, c7818t);
                return c7818t;
            default:
                return super.mo15393h(interfaceC7266z);
        }
    }

    @Override // xx.AbstractC8499e
    public String toString() {
        switch (this.f39209d) {
            case 0:
                return "block[" + ((AbstractC8199i) this.f39210e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8204e(InterfaceC2141e interfaceC2141e, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        super(interfaceC7564h, i10, enumC7799a);
        this.f39210e = (AbstractC8199i) interfaceC2141e;
    }
}
