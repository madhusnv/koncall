package ov;

import d7.q0;
import ex.InterfaceC2141e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nv.C5149a;
import nv.C5150b;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ov.e */
/* loaded from: classes3.dex */
public final class C5754e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f28310a;

    /* renamed from: b */
    public int f28311b;

    /* renamed from: c */
    public final /* synthetic */ C5757h f28312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5754e(C5757h c5757h, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f28310a = i10;
        this.f28312c = c5757h;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f28310a) {
            case 0:
                return new C5754e(this.f28312c, interfaceC7559c, 0);
            case 1:
                return new C5754e(this.f28312c, interfaceC7559c, 1);
            default:
                return new C5754e(this.f28312c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f28310a) {
        }
        return ((C5754e) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        switch (this.f28310a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f28311b;
                C5757h c5757h = this.f28312c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f28311b = 1;
                    obj = C5757h.m11287e(c5757h, this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                List permissionList = (List) obj;
                m1 m1Var = c5757h.f28328f;
                do {
                    value = m1Var.getValue();
                    ((C5150b) value).getClass();
                    AbstractC4154l.m8923f(permissionList, "permissionList");
                } while (!m1Var.m15397i(value, new C5150b(permissionList, false)));
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f28311b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f28312c.f28326d;
                    this.f28311b = 1;
                    if (c7806h.mo14775g(C5750a.f28307a, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f28311b;
                C5757h c5757h2 = this.f28312c;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f28311b = 1;
                    obj = C5757h.m11287e(c5757h2, this);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                List list = (List) obj;
                m1 m1Var2 = c5757h2.f28328f;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C5150b.m10058a((C5150b) value2, list, 2)));
                List list2 = ((C5150b) c5757h2.f28329g.f39340a.getValue()).f25218a;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (!((C5149a) it.next()).f25215c) {
                        }
                    }
                    c0.m13502y(q0.m5340g(c5757h2), null, null, new C5754e(c5757h2, null, 1), 3);
                } else {
                    c0.m13502y(q0.m5340g(c5757h2), null, null, new C5754e(c5757h2, null, 1), 3);
                }
                return a0.f30746a;
        }
    }
}
