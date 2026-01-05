package com.amplifyframework.auth.cognito;

import br.C0739b;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignInOptions;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.statemachine.StateChangeListenerToken;
import com.skydoves.balloon.internals.DefinitionKt;
import e1.c0;
import er.AbstractC2101a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import g1.C2433m;
import g1.C2438r;
import gr.C2713i;
import hq.C3002g;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import k2.s0;
import k2.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import l7.C4424x;
import l7.a0;
import mq.i0;
import n7.C4964i;
import o1.h1;
import og.eb;
import og.o1;
import pg.g0;
import ps.AbstractC6007g;
import ps.C6002b;
import ps.C6003c;
import ps.C6004d;
import ps.C6005e;
import ps.C6006f;
import q1.C6080h;
import q1.C6097y;
import s2.C6734c;
import sq.C6908y;
import tp.C7188i;
import tq.EnumC7204p;
import vr.AbstractC7733a;
import vr.C7734b;
import wr.C8158n;
import zq.AbstractC9018a;
import zq.C9021d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C1139f implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5855a;

    /* renamed from: b */
    public final /* synthetic */ Object f5856b;

    /* renamed from: c */
    public final /* synthetic */ Object f5857c;

    /* renamed from: d */
    public final /* synthetic */ Object f5858d;

    /* renamed from: e */
    public final /* synthetic */ Object f5859e;

    /* renamed from: f */
    public final /* synthetic */ Object f5860f;

    /* renamed from: g */
    public final /* synthetic */ Object f5861g;

    /* renamed from: h */
    public final /* synthetic */ Object f5862h;

    public /* synthetic */ C1139f(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, String str, String str2, AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, Consumer consumer, Consumer consumer2) {
        this.f5855a = 1;
        this.f5856b = realAWSCognitoAuthPlugin;
        this.f5857c = stateChangeListenerToken;
        this.f5860f = str;
        this.f5861g = str2;
        this.f5862h = aWSCognitoAuthSignInOptions;
        this.f5858d = consumer;
        this.f5859e = consumer2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        float f6;
        switch (this.f5855a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                c0 c0Var = (c0) this.f5856b;
                C4964i c4964i = (C4964i) this.f5857c;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f5860f;
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f5861g;
                InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) this.f5858d;
                h2 h2Var = (h2) this.f5859e;
                w0 w0Var = (w0) this.f5862h;
                C2438r c2438r = (C2438r) obj;
                if (((List) h2Var.getValue()).contains(c2438r.mo6099a())) {
                    String str = ((C4409i) c2438r.mo6099a()).f22050f;
                    int iM5529c = c0Var.m5529c(str);
                    if (iM5529c >= 0) {
                        f6 = c0Var.f8942c[iM5529c];
                    } else {
                        c0Var.m5531e(str, DefinitionKt.NO_Float_VALUE);
                        f6 = 0.0f;
                    }
                    if (!AbstractC4154l.m8918a(((C4409i) c2438r.mo6100c()).f22050f, ((C4409i) c2438r.mo6099a()).f22050f)) {
                        f6 = (((Boolean) c4964i.f24651c.getValue()).booleanValue() || ((Boolean) w0Var.getValue()).booleanValue()) ? f6 - 1.0f : f6 + 1.0f;
                    }
                    c0Var.m5531e(((C4409i) c2438r.mo6100c()).f22050f, f6);
                    break;
                } else {
                    break;
                }
                break;
            case 3:
                List<AbstractC6007g> list = (List) this.f5856b;
                final a0 a0Var = (a0) this.f5857c;
                final i0 i0Var = (i0) this.f5860f;
                final h1 h1Var = (h1) this.f5861g;
                final InterfaceC2139c interfaceC2139c4 = (InterfaceC2139c) this.f5858d;
                final C2713i c2713i = (C2713i) this.f5859e;
                final C6097y c6097y = (C6097y) this.f5862h;
                C4424x NavHost = (C4424x) obj;
                AbstractC4154l.m8923f(NavHost, "$this$NavHost");
                for (final AbstractC6007g abstractC6007g : list) {
                    o1.m10789a(NavHost, abstractC6007g.f29356a, null, null, new C6734c(new InterfaceC2143g() { // from class: xu.c
                        @Override // ex.InterfaceC2143g
                        /* renamed from: c */
                        public final Object mo1450c(Object obj2, Object obj3, Object obj4, Object obj5) {
                            C2433m composable = (C2433m) obj2;
                            C4409i it = (C4409i) obj3;
                            InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj4;
                            ((Integer) obj5).getClass();
                            AbstractC4154l.m8923f(composable, "$this$composable");
                            AbstractC4154l.m8923f(it, "it");
                            AbstractC6007g abstractC6007g2 = abstractC6007g;
                            boolean z6 = abstractC6007g2 instanceof C6003c;
                            a0 a0Var2 = a0Var;
                            h1 h1Var2 = h1Var;
                            if (z6) {
                                C3966o c3966o = (C3966o) interfaceC3962k;
                                c3966o.m8607Y(81275872);
                                hq.a0.m7255a(a0Var2, i0Var, h1Var2, interfaceC2139c4, c3966o, 0);
                                c3966o.m8623p(false);
                            } else if (abstractC6007g2 instanceof C6002b) {
                                C3966o c3966o2 = (C3966o) interfaceC3962k;
                                c3966o2.m8607Y(-274461604);
                                eb.m10626a(h1Var2, a0Var2, c3966o2, 0);
                                c3966o2.m8623p(false);
                            } else if (abstractC6007g2 instanceof C6005e) {
                                C3966o c3966o3 = (C3966o) interfaceC3962k;
                                c3966o3.m8607Y(81733494);
                                boolean zM8616i = c3966o3.m8616i(a0Var2);
                                Object objM8596M = c3966o3.m8596M();
                                s0 s0Var = C3961j.f20408a;
                                if (zM8616i || objM8596M == s0Var) {
                                    objM8596M = new C7188i(a0Var2, 16);
                                    c3966o3.j0(objM8596M);
                                }
                                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M;
                                boolean zM8616i2 = c3966o3.m8616i(a0Var2);
                                Object objM8596M2 = c3966o3.m8596M();
                                if (zM8616i2 || objM8596M2 == s0Var) {
                                    objM8596M2 = new C3002g(a0Var2, 9);
                                    c3966o3.j0(objM8596M2);
                                }
                                AbstractC7733a.m14726e(h1Var2, interfaceC2137a, (InterfaceC2139c) objM8596M2, c3966o3, 0);
                                c3966o3.m8623p(false);
                            } else if (abstractC6007g2 instanceof C6004d) {
                                C3966o c3966o4 = (C3966o) interfaceC3962k;
                                c3966o4.m8607Y(82344969);
                                AbstractC2101a.m5812f(c2713i, c6097y, a0Var2, h1Var2, c3966o4, 0);
                                c3966o4.m8623p(false);
                            } else {
                                if (!(abstractC6007g2 instanceof C6006f)) {
                                    C3966o c3966o5 = (C3966o) interfaceC3962k;
                                    c3966o5.m8607Y(-274474690);
                                    c3966o5.m8623p(false);
                                    throw new NoWhenBranchMatchedException();
                                }
                                C3966o c3966o6 = (C3966o) interfaceC3962k;
                                c3966o6.m8607Y(-274427561);
                                g0.m11644a(h1Var2, a0Var2, c3966o6, 0);
                                c3966o6.m8623p(false);
                            }
                            return qw.a0.f30746a;
                        }
                    }, true, -947770597), 254);
                }
                break;
            default:
                List list2 = (List) this.f5856b;
                C0739b c0739b = (C0739b) this.f5857c;
                EnumC7204p enumC7204p = (EnumC7204p) this.f5860f;
                InterfaceC2139c interfaceC2139c5 = (InterfaceC2139c) this.f5861g;
                InterfaceC2139c interfaceC2139c6 = (InterfaceC2139c) this.f5858d;
                InterfaceC2139c interfaceC2139c7 = (InterfaceC2139c) this.f5859e;
                w0 w0Var2 = (w0) this.f5862h;
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                LazyColumn.m12099p(list2.size(), new C8158n(13, new C7734b(28), list2), new C6908y(list2, 23), new C6734c(new C9021d(list2, c0739b, enumC7204p, interfaceC2139c5, interfaceC2139c6, interfaceC2139c7, w0Var2), true, -1091073711));
                if (c0739b.f4659b) {
                    LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC9018a.f43435a);
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C1139f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f5855a = i10;
        this.f5856b = obj;
        this.f5857c = obj2;
        this.f5860f = obj3;
        this.f5861g = obj4;
        this.f5858d = obj5;
        this.f5859e = obj6;
        this.f5862h = obj7;
    }
}
