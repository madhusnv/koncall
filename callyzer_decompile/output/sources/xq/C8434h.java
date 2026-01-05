package xq;

import ex.InterfaceC2141e;
import j$.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vq.C7730b;
import vw.EnumC7794a;
import wq.C8142a;
import wq.C8143b;
import wq.C8144c;
import ww.AbstractC8199i;
import wx.k1;
import wx.m1;
import wx.w0;
import yq.AbstractC8736a;
import yq.C8738c;
import yq.C8741f;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xq.h */
/* loaded from: classes3.dex */
public final class C8434h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41152a;

    /* renamed from: b */
    public final /* synthetic */ C8741f f41153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8434h(C8741f c8741f, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41152a = i10;
        this.f41153b = c8741f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41152a) {
            case 0:
                return new C8434h(this.f41153b, interfaceC7559c, 0);
            default:
                return new C8434h(this.f41153b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41152a) {
            case 0:
                C8434h c8434h = (C8434h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c8434h.invokeSuspend(a0Var);
                return a0Var;
            default:
                return ((C8434h) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i10 = this.f41152a;
        C8741f c8741f = this.f41153b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c8741f.getClass();
                LocalDate localDateMinusMonths = LocalDate.now().minusMonths(6L);
                AbstractC4154l.m8922e(localDateMinusMonths, "minusMonths(...)");
                LocalDate localDateNow = LocalDate.now();
                AbstractC4154l.m8922e(localDateNow, "now(...)");
                w0 w0Var = c8741f.f42340i;
                k1 k1Var = w0Var.f39340a;
                k1 k1Var2 = w0Var.f39340a;
                switch (AbstractC8736a.f42288a[((C8144c) k1Var.getValue()).f39018b.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        localDateMinusMonths = LocalDate.now();
                        AbstractC4154l.m8922e(localDateMinusMonths, "now(...)");
                        break;
                    case 3:
                        localDateMinusMonths = LocalDate.now().minusDays(1L);
                        AbstractC4154l.m8922e(localDateMinusMonths, "minusDays(...)");
                        localDateNow = LocalDate.now().minusDays(1L);
                        AbstractC4154l.m8922e(localDateNow, "minusDays(...)");
                        break;
                    case 4:
                        localDateMinusMonths = LocalDate.now().minusDays(7L);
                        AbstractC4154l.m8922e(localDateMinusMonths, "minusDays(...)");
                        break;
                    case 5:
                        localDateMinusMonths = LocalDate.now().minusMonths(1L);
                        AbstractC4154l.m8922e(localDateMinusMonths, "minusMonths(...)");
                        break;
                    case 6:
                        localDateMinusMonths = LocalDate.now().minusYears(1L);
                        AbstractC4154l.m8922e(localDateMinusMonths, "minusYears(...)");
                        break;
                    case 7:
                        localDateMinusMonths = ((C8144c) k1Var2.getValue()).f39019c;
                        localDateNow = ((C8144c) k1Var2.getValue()).f39020d;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                c8741f.f42348q = new C7730b(localDateMinusMonths, localDateNow, ((C8142a) c8741f.f42338g.f39340a.getValue()).f38999e);
                m1 m1Var = c8741f.f42341j;
                do {
                    value = m1Var.getValue();
                    C8800o c8800o = C8800o.f42459a;
                } while (!m1Var.m15397i(value, C8143b.m15320a((C8143b) value, C8800o.m16197f(localDateMinusMonths), C8800o.m16197f(localDateNow), true, null, null, null, null, null, null, null, null, null, false, null, null, 32760)));
                c0.m13502y(c8741f.f42345n, null, null, new C8738c(c8741f, null), 3);
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((C8142a) c8741f.f42338g.f39340a.getValue()).f39001g + 1);
        }
    }
}
