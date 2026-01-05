package yt;

import c9.C0914i;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.m6;
import qw.a0;
import rw.AbstractC6664n;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vt.C7778i;
import vt.C7782m;
import vt.C7786q;
import vt.EnumC7772c;
import vw.EnumC7794a;
import wt.C8183a;
import wt.C8185c;
import ww.AbstractC8199i;
import wx.b1;
import wx.m1;
import wx.w0;
import xm.j4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yt.e */
/* loaded from: classes3.dex */
public final class C8773e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42406a;

    /* renamed from: b */
    public int f42407b;

    /* renamed from: c */
    public final /* synthetic */ C8774f f42408c;

    /* renamed from: d */
    public final /* synthetic */ m6 f42409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8773e(C8774f c8774f, m6 m6Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42406a = i10;
        this.f42408c = c8774f;
        this.f42409d = m6Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42406a) {
            case 0:
                return new C8773e(this.f42408c, this.f42409d, interfaceC7559c, 0);
            case 1:
                return new C8773e(this.f42408c, this.f42409d, interfaceC7559c, 1);
            default:
                return new C8773e(this.f42408c, this.f42409d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f42406a) {
        }
        return ((C8773e) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM16128e;
        Object value;
        boolean z6;
        C7782m c7782m;
        Object objM16128e2;
        Object value2;
        Object next;
        Object value3;
        switch (this.f42406a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f42407b;
                C8774f c8774f = this.f42408c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f42407b = 1;
                    objM16128e = C8774f.m16128e(c8774f, this);
                    if (objM16128e == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM16128e = obj;
                }
                if (((Boolean) objM16128e).booleanValue()) {
                    m1 m1Var = c8774f.f42415g;
                    do {
                        value = m1Var.getValue();
                        z6 = !((C8185c) c8774f.f42416h.f39340a.getValue()).f39144a;
                        c7782m = (C7782m) this.f42409d;
                    } while (!m1Var.m15397i(value, C8185c.m15342a((C8185c) value, z6, null, false, false, c7782m.f37445a, c7782m.f37446b, null, false, null, 462)));
                }
                return a0.f30746a;
            case 1:
                C8774f c8774f2 = this.f42408c;
                w0 w0Var = c8774f2.f42416h;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42407b;
                a0 a0Var = a0.f30746a;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f42407b = 1;
                    objM16128e2 = C8774f.m16128e(c8774f2, this);
                    if (objM16128e2 == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0Var;
                    }
                    od.m10798c(obj);
                    objM16128e2 = obj;
                }
                if (((Boolean) objM16128e2).booleanValue()) {
                    m1 m1Var2 = c8774f2.f42415g;
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C8185c.m15342a((C8185c) value2, false, null, !((C8185c) w0Var.f39340a.getValue()).f39146c, false, 0, null, null, false, null, 507)));
                    Iterator it = ((C8185c) w0Var.f39340a.getValue()).f39145b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (AbstractC4154l.m8918a(((C8183a) next).f39142d, ((C7778i) this.f42409d).f37441a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    C8183a c8183a = (C8183a) next;
                    if (c8183a != null) {
                        C0914i c0914i = c8774f2.f42410b;
                        String str = c8183a.f39142d;
                        String str2 = c8183a.f39140b;
                        this.f42407b = 3;
                        if (c0914i.m2626f(str, str2, this) == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                } else {
                    b1 b1Var = c8774f2.f42417i;
                    EnumC7772c enumC7772c = EnumC7772c.SUBSCRIPTION_EXPIRY;
                    this.f42407b = 2;
                    if (b1Var.emit(enumC7772c, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                }
                return a0Var;
            default:
                C8774f c8774f3 = this.f42408c;
                w0 w0Var2 = c8774f3.f42416h;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f42407b;
                a0 a0Var2 = a0.f30746a;
                m6 m6Var = this.f42409d;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C0914i c0914i2 = c8774f3.f42410b;
                    int i13 = ((C8185c) w0Var2.f39340a.getValue()).f39148e;
                    String str3 = ((C7786q) m6Var).f37450a;
                    this.f42407b = 1;
                    Object objI0 = ((j4) c0914i2.f5585a).f40460a.I0(i13, str3, this);
                    if (objI0 != enumC7794a3) {
                        objI0 = a0Var2;
                    }
                    if (objI0 != enumC7794a3) {
                        objI0 = a0Var2;
                    }
                    if (objI0 == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                List<C8183a> list = ((C8185c) w0Var2.f39340a.getValue()).f39145b;
                ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
                for (C8183a c8183a2 : list) {
                    if (c8183a2.f39139a == ((C8185c) w0Var2.f39340a.getValue()).f39148e) {
                        String extensionName = ((C7786q) m6Var).f37450a;
                        int i14 = c8183a2.f39139a;
                        String lastActiveTime = c8183a2.f39141c;
                        String qrCode = c8183a2.f39142d;
                        AbstractC4154l.m8923f(extensionName, "extensionName");
                        AbstractC4154l.m8923f(lastActiveTime, "lastActiveTime");
                        AbstractC4154l.m8923f(qrCode, "qrCode");
                        c8183a2 = new C8183a(extensionName, i14, lastActiveTime, qrCode);
                    }
                    arrayList.add(c8183a2);
                }
                m1 m1Var3 = c8774f3.f42415g;
                do {
                    value3 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value3, C8185c.m15342a((C8185c) value3, !((C8185c) w0Var2.f39340a.getValue()).f39144a, arrayList, false, false, 0, null, null, false, null, 508)));
                return a0Var2;
        }
    }
}
