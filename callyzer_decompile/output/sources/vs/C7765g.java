package vs;

import a1.C0018q;
import android.content.Context;
import b3.C0592x;
import b3.InterfaceC0579k;
import bp.C0720d;
import bt.a0;
import c0.C0829v;
import c6.C0885o;
import d7.InterfaceC1649u;
import ej.C2060e;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.f0;
import k2.h2;
import k2.w0;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import l0.AbstractC4308h;
import l0.C4304d;
import l0.RunnableC4302b;
import l0.RunnableC4307g;
import mq.C4833a;
import p020v.b0;
import pg.t8;
import q1.C6080h;
import qp.C6273j;
import r0.RunnableC6415f;
import r5.AbstractC6468c;
import s2.C6734c;
import sq.C6908y;
import ub.C7393i;
import ug.C7439j;
import uq.C7503i;
import vq.EnumC7729a;
import vr.C7734b;
import w3.C7892j;
import wr.C8158n;
import ws.C8181v;
import xp.AbstractC8420a;
import xs.C8449k;
import xt.AbstractC8450a;
import yt.C8770b;
import z0.C8840f;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vs.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7765g implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f37413a;

    /* renamed from: b */
    public final /* synthetic */ Object f37414b;

    /* renamed from: c */
    public final /* synthetic */ Object f37415c;

    /* renamed from: d */
    public final /* synthetic */ Object f37416d;

    public /* synthetic */ C7765g(int i10, Object obj, Object obj2, Object obj3) {
        this.f37413a = i10;
        this.f37414b = obj;
        this.f37415c = obj2;
        this.f37416d = obj3;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceFutureC8957d interfaceFutureC8957dM9034d;
        switch (this.f37413a) {
            case 0:
                w0 w0Var = (w0) this.f37414b;
                C8449k c8449k = (C8449k) this.f37416d;
                w0 w0Var2 = (w0) this.f37415c;
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                List list = ((C8181v) w0Var.getValue()).f39119e;
                LazyColumn.m12099p(list.size(), null, new C6908y(list, 16), new C6734c(new a0(list, c8449k, w0Var2, 9), true, -632812321));
                if (((C8181v) w0Var.getValue()).f39124j) {
                    LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC7760b.f37397b);
                }
                return qw.a0.f30746a;
            case 1:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f37414b;
                C0592x c0592x = (C0592x) this.f37415c;
                InterfaceC0579k interfaceC0579k = (InterfaceC0579k) this.f37416d;
                String newText = (String) obj;
                AbstractC4154l.m8923f(newText, "newText");
                if (newText.length() > 2) {
                    int length = newText.length();
                    newText = newText.substring(length - (2 > length ? length : 2));
                    AbstractC4154l.m8922e(newText, "substring(...)");
                }
                interfaceC2139c.invoke(newText);
                if (newText.length() == 2) {
                    if (c0592x != null) {
                        C0592x.m1757b(c0592x);
                    } else {
                        InterfaceC0579k.m1742a(interfaceC0579k);
                    }
                }
                return qw.a0.f30746a;
            case 2:
                List list2 = (List) this.f37414b;
                C6273j c6273j = (C6273j) this.f37415c;
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f37416d;
                C6080h LazyColumn2 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn2, "$this$LazyColumn");
                LazyColumn2.m12099p(list2.size(), new C8158n(10, new C7734b(9), list2), new C6908y(list2, 19), new C6734c(new a0(list2, c6273j, interfaceC2139c2, 10), true, -1091073711));
                if (c6273j.f30448e) {
                    LazyColumn2.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC8420a.f41104a);
                }
                return qw.a0.f30746a;
            case 3:
                InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) this.f37415c;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f37416d;
                w0 w0Var3 = (w0) this.f37414b;
                int iIntValue = ((Integer) obj).intValue();
                if (EnumC7729a.Custom.getIndex() == iIntValue) {
                    w0Var3.setValue(Boolean.TRUE);
                } else {
                    interfaceC2139c3.invoke(new C7503i(iIntValue));
                    interfaceC2137a.invoke();
                }
                return qw.a0.f30746a;
            case 4:
                InterfaceC1649u interfaceC1649u = (InterfaceC1649u) this.f37414b;
                h2 h2Var = (h2) this.f37415c;
                C8770b c8770b = (C8770b) this.f37416d;
                Context ctx = (Context) obj;
                AbstractC4154l.m8923f(ctx, "ctx");
                C0018q c0018q = new C0018q(ctx);
                C2060e c2060e = C8840f.f42554b.f42555a;
                synchronized (c2060e.f9651b) {
                    interfaceFutureC8957dM9034d = (C4304d) c2060e.f9652c;
                    if (interfaceFutureC8957dM9034d == null) {
                        C0829v c0829v = new C0829v(ctx, null);
                        c2060e.f9650a = c0829v.f5244r;
                        RunnableC4302b runnableC4302bM9037g = AbstractC4308h.m9037g(C4304d.m9025b((InterfaceFutureC8957d) c2060e.f9653d), new b0(14, new C4833a(26, c0829v)), t8.m11872a());
                        c2060e.f9652c = runnableC4302bM9037g;
                        runnableC4302bM9037g.mo9026a(new RunnableC4307g(0, runnableC4302bM9037g, new C7439j(21, c2060e, c0829v, ctx)), t8.m11872a());
                        interfaceFutureC8957dM9034d = AbstractC4308h.m9034d(runnableC4302bM9037g);
                    }
                }
                RunnableC4302b runnableC4302bM9037g2 = AbstractC4308h.m9037g(interfaceFutureC8957dM9034d, new C4001v(2, new C7892j(15, new C7393i(26))), t8.m11872a());
                runnableC4302bM9037g2.mo9026a(new RunnableC6415f(runnableC4302bM9037g2, interfaceC1649u, c0018q, ctx, h2Var, c8770b, 1), AbstractC6468c.m12452c(ctx));
                return c0018q;
            case 5:
                InterfaceC1649u interfaceC1649u2 = (InterfaceC1649u) this.f37415c;
                Context context = (Context) this.f37416d;
                w0 w0Var4 = (w0) this.f37414b;
                f0 DisposableEffect = (f0) obj;
                AbstractC4154l.m8923f(DisposableEffect, "$this$DisposableEffect");
                C0885o c0885o = new C0885o(3, context, w0Var4);
                interfaceC1649u2.getLifecycle().mo5343a(c0885o);
                return new C0720d(19, interfaceC1649u2, c0885o);
            default:
                List list3 = (List) this.f37414b;
                InterfaceC2139c interfaceC2139c4 = (InterfaceC2139c) this.f37415c;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f37416d;
                C6080h LazyColumn3 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn3, "$this$LazyColumn");
                LazyColumn3.m12099p(list3.size(), null, new C6908y(list3, 22), new C6734c(new a0(list3, interfaceC2139c4, interfaceC2141e, 12), true, -632812321));
                LazyColumn3.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC8450a.f41229b);
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ C7765g(int i10, Object obj, Object obj2, w0 w0Var) {
        this.f37413a = i10;
        this.f37415c = obj;
        this.f37416d = obj2;
        this.f37414b = w0Var;
    }

    public /* synthetic */ C7765g(w0 w0Var, C8449k c8449k, w0 w0Var2) {
        this.f37413a = 0;
        this.f37414b = w0Var;
        this.f37416d = c8449k;
        this.f37415c = w0Var2;
    }
}
