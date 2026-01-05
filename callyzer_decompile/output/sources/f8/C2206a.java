package f8;

import android.net.Uri;
import b8.C0620o;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import js.AbstractC3849e;
import js.C3847c;
import js.C3848d;
import kk.C4088h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import mq.j0;
import mu.AbstractC4886d;
import mu.C4883a;
import og.od;
import p020v.a1;
import pg.c9;
import qw.a0;
import s6.C6763b;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.a */
/* loaded from: classes.dex */
public final class C2206a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10135a;

    /* renamed from: b */
    public /* synthetic */ Object f10136b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f10137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2206a(InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f10135a = i10;
        this.f10137c = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10135a) {
            case 0:
                C2206a c2206a = new C2206a(interfaceC7559c, this.f10137c, 0);
                c2206a.f10136b = obj;
                return c2206a;
            case 1:
                C2206a c2206a2 = new C2206a(interfaceC7559c, this.f10137c, 1);
                c2206a2.f10136b = obj;
                return c2206a2;
            case 2:
                C2206a c2206a3 = new C2206a(this.f10137c, interfaceC7559c, 2);
                c2206a3.f10136b = obj;
                return c2206a3;
            case 3:
                C2206a c2206a4 = new C2206a(this.f10137c, interfaceC7559c, 3);
                c2206a4.f10136b = obj;
                return c2206a4;
            case 4:
                C2206a c2206a5 = new C2206a(this.f10137c, interfaceC7559c, 4);
                c2206a5.f10136b = obj;
                return c2206a5;
            case 5:
                C2206a c2206a6 = new C2206a(this.f10137c, interfaceC7559c, 5);
                c2206a6.f10136b = obj;
                return c2206a6;
            case 6:
                C2206a c2206a7 = new C2206a(this.f10137c, interfaceC7559c, 6);
                c2206a7.f10136b = obj;
                return c2206a7;
            default:
                C2206a c2206a8 = new C2206a(this.f10137c, interfaceC7559c, 7);
                c2206a8.f10136b = obj;
                return c2206a8;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10135a) {
            case 0:
                return ((C2206a) create((C0620o) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 1:
                return ((C2206a) create((C0620o) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 2:
                C2206a c2206a = (C2206a) create((C6763b) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2206a.invokeSuspend(a0Var);
                return a0Var;
            case 3:
                C2206a c2206a2 = (C2206a) create((j0) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c2206a2.invokeSuspend(a0Var2);
                return a0Var2;
            case 4:
                C2206a c2206a3 = (C2206a) create((AbstractC4886d) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c2206a3.invokeSuspend(a0Var3);
                return a0Var3;
            case 5:
                C2206a c2206a4 = (C2206a) create((AbstractC3849e) obj, (InterfaceC7559c) obj2);
                a0 a0Var4 = a0.f30746a;
                c2206a4.invokeSuspend(a0Var4);
                return a0Var4;
            case 6:
                C2206a c2206a5 = (C2206a) create((AbstractC3849e) obj, (InterfaceC7559c) obj2);
                a0 a0Var5 = a0.f30746a;
                c2206a5.invokeSuspend(a0Var5);
                return a0Var5;
            default:
                C2206a c2206a6 = (C2206a) create((AbstractC3849e) obj, (InterfaceC7559c) obj2);
                a0 a0Var6 = a0.f30746a;
                c2206a6.invokeSuspend(a0Var6);
                return a0Var6;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f10135a;
        a0 a0Var = a0.f30746a;
        InterfaceC2139c interfaceC2139c = this.f10137c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C0620o c0620o = (C0620o) this.f10136b;
                AbstractC4154l.m8921d(c0620o, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return interfaceC2139c.invoke(c0620o.mo1781b());
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C0620o c0620o2 = (C0620o) this.f10136b;
                AbstractC4154l.m8921d(c0620o2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return interfaceC2139c.invoke(c0620o2.mo1781b());
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                interfaceC2139c.invoke((C6763b) this.f10136b);
                return a0Var;
            case 3:
                j0 j0Var = (j0) this.f10136b;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (!(j0Var instanceof j0)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC2139c.invoke(c9.m11572a(j0Var.f24295c + "," + j0Var.f24294b, j0Var.f24293a, "callHistory", j0Var.f24296d, true));
                return a0Var;
            case 4:
                AbstractC4886d abstractC4886d = (AbstractC4886d) this.f10136b;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (abstractC4886d instanceof C4883a) {
                    interfaceC2139c.invoke(((C4883a) abstractC4886d).f24397a);
                }
                return a0Var;
            case 5:
                AbstractC3849e abstractC3849e = (AbstractC3849e) this.f10136b;
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (abstractC3849e instanceof C3847c) {
                    C3847c c3847c = (C3847c) abstractC3849e;
                    interfaceC2139c.invoke(c9.m11573b(c3847c.f19808c + "," + c3847c.f19807b, c3847c.f19806a, 16, "lead", false));
                } else {
                    if (!(abstractC3849e instanceof C3848d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C3848d c3848d = (C3848d) abstractC3849e;
                    interfaceC2139c.invoke(a1.m14333m("note/null/", c3848d.f19810b, "/", Uri.encode(new C4088h().m8861h(c3848d.f19809a)), "/false"));
                }
                return a0Var;
            case 6:
                AbstractC3849e abstractC3849e2 = (AbstractC3849e) this.f10136b;
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (abstractC3849e2 instanceof C3847c) {
                    C3847c c3847c2 = (C3847c) abstractC3849e2;
                    interfaceC2139c.invoke(c9.m11573b(c3847c2.f19808c + "," + c3847c2.f19807b, c3847c2.f19806a, 16, "lead", false));
                } else {
                    if (!(abstractC3849e2 instanceof C3848d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C3848d c3848d2 = (C3848d) abstractC3849e2;
                    interfaceC2139c.invoke(a1.m14333m("note/null/", c3848d2.f19810b, "/", Uri.encode(new C4088h().m8861h(c3848d2.f19809a)), "/false"));
                }
                return a0Var;
            default:
                AbstractC3849e abstractC3849e3 = (AbstractC3849e) this.f10136b;
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (abstractC3849e3 instanceof C3847c) {
                    C3847c c3847c3 = (C3847c) abstractC3849e3;
                    interfaceC2139c.invoke(c9.m11573b(c3847c3.f19808c + "," + c3847c3.f19807b, c3847c3.f19806a, 16, "lead", false));
                } else {
                    if (!(abstractC3849e3 instanceof C3848d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C3848d c3848d3 = (C3848d) abstractC3849e3;
                    interfaceC2139c.invoke(a1.m14333m("note/null/", c3848d3.f19810b, "/", Uri.encode(new C4088h().m8861h(c3848d3.f19809a)), "/false"));
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2206a(InterfaceC7559c interfaceC7559c, InterfaceC2139c interfaceC2139c, int i10) {
        super(2, interfaceC7559c);
        this.f10135a = i10;
        this.f10137c = interfaceC2139c;
    }
}
