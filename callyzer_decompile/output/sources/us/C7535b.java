package us;

import com.websoptimization.callyzerbiz.R;
import en.C2073f;
import ex.InterfaceC2141e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.a0;
import ts.C7214a;
import tx.c0;
import u7.C7351a;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: us.b */
/* loaded from: classes3.dex */
public final class C7535b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f36284a;

    /* renamed from: b */
    public /* synthetic */ Object f36285b;

    /* renamed from: c */
    public final /* synthetic */ C7536c f36286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7535b(C7536c c7536c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f36284a = i10;
        this.f36286c = c7536c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f36284a) {
            case 0:
                C7535b c7535b = new C7535b(this.f36286c, interfaceC7559c, 0);
                c7535b.f36285b = obj;
                return c7535b;
            default:
                C7535b c7535b2 = new C7535b(this.f36286c, interfaceC7559c, 1);
                c7535b2.f36285b = obj;
                return c7535b2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36284a) {
            case 0:
                C7535b c7535b = (C7535b) create((C2073f) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c7535b.invokeSuspend(a0Var);
                return a0Var;
            default:
                C7535b c7535b2 = (C7535b) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c7535b2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        boolean z6;
        Object value3;
        int i10 = this.f36284a;
        a0 a0Var = a0.f30746a;
        C7536c c7536c = this.f36286c;
        switch (i10) {
            case 0:
                C2073f c2073f = (C2073f) this.f36285b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                List list = c2073f.f9693h;
                m1 m1Var = c7536c.f36293h;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C7214a.m13447a((C7214a) value, false, null, false, list, false, false, 55)));
            default:
                C8801p c8801p = (C8801p) this.f36285b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = c7536c.f36293h;
                do {
                    value2 = m1Var2.getValue();
                    z6 = c8801p.f42464a;
                } while (!m1Var2.m15397i(value2, C7214a.m13447a((C7214a) value2, false, null, z6, null, false, false, 59)));
                if (z6 && AbstractC4154l.m8918a(((C7214a) m1Var2.getValue()).f34508b, c7536c.f36287b.getString(R.string.no_internet_connection_found_Please_turn_on_the_internet_and_click_retry))) {
                    do {
                        value3 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value3, C7214a.m13447a((C7214a) value3, false, null, false, null, false, true, 28)));
                }
                if (z6 && ((C7214a) m1Var2.getValue()).f34512f) {
                    c0.m13502y(c7536c.f36290e, null, null, new C7351a(c7536c, null, 6), 3);
                    break;
                }
                break;
        }
        return a0Var;
    }
}
