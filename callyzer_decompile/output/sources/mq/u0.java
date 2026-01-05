package mq;

import ex.InterfaceC2141e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lq.C4508c;
import og.od;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class u0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24325a;

    /* renamed from: b */
    public final /* synthetic */ a1 f24326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(a1 a1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24325a = i10;
        this.f24326b = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24325a) {
            case 0:
                return new u0(this.f24326b, interfaceC7559c, 0);
            case 1:
                return new u0(this.f24326b, interfaceC7559c, 1);
            case 2:
                return new u0(this.f24326b, interfaceC7559c, 2);
            case 3:
                return new u0(this.f24326b, interfaceC7559c, 3);
            case 4:
                return new u0(this.f24326b, interfaceC7559c, 4);
            case 5:
                return new u0(this.f24326b, interfaceC7559c, 5);
            default:
                return new u0(this.f24326b, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24325a) {
            case 0:
                u0 u0Var = (u0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                u0Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                u0 u0Var2 = (u0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                u0Var2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                u0 u0Var3 = (u0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                u0Var3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                u0 u0Var4 = (u0) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var4 = qw.a0.f30746a;
                u0Var4.invokeSuspend(a0Var4);
                return a0Var4;
            case 4:
                u0 u0Var5 = (u0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var5 = qw.a0.f30746a;
                u0Var5.invokeSuspend(a0Var5);
                return a0Var5;
            case 5:
                u0 u0Var6 = (u0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var6 = qw.a0.f30746a;
                u0Var6.invokeSuspend(a0Var6);
                return a0Var6;
            default:
                return ((u0) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        C4508c c4508c;
        EnumC7204p enumC7204p;
        Object value2;
        C4508c c4508c2;
        EnumC7204p enumC7204p2;
        Object value3;
        C4508c c4508c3;
        EnumC7204p enumC7204p3;
        Object value4;
        InterfaceC7559c interfaceC7559c = null;
        switch (this.f24325a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1 a1Var = this.f24326b;
                m1 m1Var = a1Var.f24148o;
                do {
                    value = m1Var.getValue();
                    c4508c = (C4508c) value;
                    enumC7204p = a1Var.f24147n;
                    if (enumC7204p == null) {
                        AbstractC4154l.m8928k("simSelectionMode");
                        throw null;
                    }
                } while (!m1Var.m15397i(value, C4508c.m9341a(c4508c, null, false, false, 0, false, 0, false, enumC7204p, false, null, 895)));
                return qw.a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1 a1Var2 = this.f24326b;
                m1 m1Var2 = a1Var2.f24148o;
                do {
                    value2 = m1Var2.getValue();
                    c4508c2 = (C4508c) value2;
                    enumC7204p2 = a1Var2.f24147n;
                    if (enumC7204p2 == null) {
                        AbstractC4154l.m8928k("simSelectionMode");
                        throw null;
                    }
                } while (!m1Var2.m15397i(value2, C4508c.m9341a(c4508c2, null, false, false, 0, false, 0, false, enumC7204p2, false, null, 895)));
                return qw.a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1 a1Var3 = this.f24326b;
                synchronized (a1Var3.f24153t) {
                    tx.c0.m13468D(C7565i.f36440a, new w0(a1Var3, interfaceC7559c, 0));
                }
                return qw.a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                this.f24326b.f24156w = true;
                return qw.a0.f30746a;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1 a1Var4 = this.f24326b;
                m1 m1Var3 = a1Var4.f24148o;
                do {
                    value3 = m1Var3.getValue();
                    c4508c3 = (C4508c) value3;
                    enumC7204p3 = a1Var4.f24147n;
                    if (enumC7204p3 == null) {
                        AbstractC4154l.m8928k("simSelectionMode");
                        throw null;
                    }
                } while (!m1Var3.m15397i(value3, C4508c.m9341a(c4508c3, null, false, false, 0, false, 0, false, enumC7204p3, false, null, 895)));
                return qw.a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1.m9790g(this.f24326b);
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1 a1Var5 = this.f24326b;
                int i10 = ((C4508c) a1Var5.f24149p.f39340a.getValue()).f22431d + 1;
                m1 m1Var4 = a1Var5.f24148o;
                do {
                    value4 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value4, C4508c.m9341a((C4508c) value4, null, false, false, i10, false, 0, false, null, false, null, 1015)));
                return new Integer(i10);
        }
    }
}
