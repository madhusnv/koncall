package ks;

import android.content.Context;
import android.icu.text.DecimalFormat;
import com.websoptimization.callyzerbiz.R;
import cv.C1516l;
import d7.w0;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import is.C3347a;
import java.util.ArrayList;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.s0;
import kotlin.jvm.internal.AbstractC4154l;
import pg.f9;
import q1.C6097y;
import rw.AbstractC6663m;
import rw.C6668r;
import s2.C6734c;
import sq.h3;
import ur.AbstractC7524q;
import vr.AbstractC7733a;
import wj.C8090p;
import wx.c1;
import wx.m1;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.o */
/* loaded from: classes3.dex */
public final class C4226o extends w0 {

    /* renamed from: b */
    public final Context f21474b;

    /* renamed from: c */
    public final m1 f21475c;

    /* renamed from: d */
    public final wx.w0 f21476d;

    /* renamed from: e */
    public AbstractC7524q f21477e;

    public C4226o(C8090p c8090p, Context context) {
        Object value;
        this.f21474b = context;
        m1 m1VarM15372c = c1.m15372c(new C3347a(C6668r.f31943a));
        this.f21475c = m1VarM15372c;
        this.f21476d = new wx.w0(m1VarM15372c);
        ArrayList arrayList = new ArrayList();
        final int i10 = 0;
        arrayList.add(new h3(f9.m11628b(context, R.string.due_lead), new C6734c(new InterfaceC2142f(this) { // from class: ks.m

            /* renamed from: b */
            public final /* synthetic */ C4226o f21466b;

            {
                this.f21466b = this;
            }

            @Override // ex.InterfaceC2142f
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i10) {
                    case 0:
                        InterfaceC2139c navController = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController, "navController");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((C3966o) interfaceC3962k).m8616i(navController) ? 4 : 2;
                        }
                        C3966o c3966o = (C3966o) interfaceC3962k;
                        if (c3966o.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
                            boolean z6 = (iIntValue & 14) == 4;
                            Object objM8596M = c3966o.m8596M();
                            s0 s0Var = C3961j.f20408a;
                            if (z6 || objM8596M == s0Var) {
                                objM8596M = new C1516l(2, navController);
                                c3966o.j0(objM8596M);
                            }
                            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M;
                            final C4226o c4226o = this.f21466b;
                            boolean zM8616i = c3966o.m8616i(c4226o);
                            Object objM8596M2 = c3966o.m8596M();
                            if (zM8616i || objM8596M2 == s0Var) {
                                final int i11 = 2;
                                objM8596M2 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj4) {
                                        switch (i11) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj4;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o2 = c4226o;
                                                c4226o2.getClass();
                                                c4226o2.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o.m8964e(((Integer) obj4).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o.m8964e(((Integer) obj4).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj4;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o3 = c4226o;
                                                c4226o3.getClass();
                                                c4226o3.f21477e = it2;
                                                break;
                                            default:
                                                c4226o.m8964e(((Integer) obj4).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o.j0(objM8596M2);
                            }
                            AbstractC7733a.m14724c(interfaceC2139c, (InterfaceC2139c) objM8596M2, c3966o, 0);
                        } else {
                            c3966o.m8601S();
                        }
                        break;
                    case 1:
                        InterfaceC2139c navController2 = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController2, "navController");
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= ((C3966o) interfaceC3962k2).m8616i(navController2) ? 4 : 2;
                        }
                        C3966o c3966o2 = (C3966o) interfaceC3962k2;
                        if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            C6097y c6097yM12082a = q1.b0.m12082a(0, 3, c3966o2);
                            final C4226o c4226o2 = this.f21466b;
                            boolean zM8616i2 = c3966o2.m8616i(c4226o2);
                            Object objM8596M3 = c3966o2.m8596M();
                            Object obj4 = C3961j.f20408a;
                            if (zM8616i2 || objM8596M3 == obj4) {
                                final int i12 = 3;
                                objM8596M3 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i12) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o2;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o3 = c4226o2;
                                                c4226o3.getClass();
                                                c4226o3.f21477e = it2;
                                                break;
                                            default:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o2.j0(objM8596M3);
                            }
                            InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) objM8596M3;
                            boolean zM8616i3 = c3966o2.m8616i(c4226o2);
                            Object objM8596M4 = c3966o2.m8596M();
                            if (zM8616i3 || objM8596M4 == obj4) {
                                final int i13 = 4;
                                objM8596M4 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i13) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o2;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o3 = c4226o2;
                                                c4226o3.getClass();
                                                c4226o3.f21477e = it2;
                                                break;
                                            default:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o2.j0(objM8596M4);
                            }
                            AbstractC7733a.m14733l(c6097yM12082a, navController2, interfaceC2139c2, (InterfaceC2139c) objM8596M4, c3966o2, (iIntValue2 << 3) & 112);
                        } else {
                            c3966o2.m8601S();
                        }
                        break;
                    default:
                        InterfaceC2139c navController3 = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController3, "navController");
                        if ((iIntValue3 & 6) == 0) {
                            iIntValue3 |= ((C3966o) interfaceC3962k3).m8616i(navController3) ? 4 : 2;
                        }
                        C3966o c3966o3 = (C3966o) interfaceC3962k3;
                        if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                            C6097y c6097yM12082a2 = q1.b0.m12082a(0, 3, c3966o3);
                            final C4226o c4226o3 = this.f21466b;
                            boolean zM8616i4 = c3966o3.m8616i(c4226o3);
                            Object objM8596M5 = c3966o3.m8596M();
                            Object obj5 = C3961j.f20408a;
                            if (zM8616i4 || objM8596M5 == obj5) {
                                final int i14 = 0;
                                objM8596M5 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i14) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o3;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o3;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o3.j0(objM8596M5);
                            }
                            InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) objM8596M5;
                            boolean zM8616i5 = c3966o3.m8616i(c4226o3);
                            Object objM8596M6 = c3966o3.m8596M();
                            if (zM8616i5 || objM8596M6 == obj5) {
                                final int i15 = 1;
                                objM8596M6 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i15) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o3;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o3;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o3.j0(objM8596M6);
                            }
                            AbstractC7733a.m14732k(c6097yM12082a2, navController3, interfaceC2139c3, (InterfaceC2139c) objM8596M6, c3966o3, (iIntValue3 << 3) & 112);
                        } else {
                            c3966o3.m8601S();
                        }
                        break;
                }
                return qw.a0.f30746a;
            }
        }, true, 872002269)));
        final int i11 = 1;
        arrayList.add(new h3(f9.m11628b(context, R.string.schedule_lead), new C6734c(new InterfaceC2142f(this) { // from class: ks.m

            /* renamed from: b */
            public final /* synthetic */ C4226o f21466b;

            {
                this.f21466b = this;
            }

            @Override // ex.InterfaceC2142f
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i11) {
                    case 0:
                        InterfaceC2139c navController = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController, "navController");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((C3966o) interfaceC3962k).m8616i(navController) ? 4 : 2;
                        }
                        C3966o c3966o = (C3966o) interfaceC3962k;
                        if (c3966o.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
                            boolean z6 = (iIntValue & 14) == 4;
                            Object objM8596M = c3966o.m8596M();
                            s0 s0Var = C3961j.f20408a;
                            if (z6 || objM8596M == s0Var) {
                                objM8596M = new C1516l(2, navController);
                                c3966o.j0(objM8596M);
                            }
                            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M;
                            final C4226o c4226o = this.f21466b;
                            boolean zM8616i = c3966o.m8616i(c4226o);
                            Object objM8596M2 = c3966o.m8596M();
                            if (zM8616i || objM8596M2 == s0Var) {
                                final int i112 = 2;
                                objM8596M2 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i112) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o.j0(objM8596M2);
                            }
                            AbstractC7733a.m14724c(interfaceC2139c, (InterfaceC2139c) objM8596M2, c3966o, 0);
                        } else {
                            c3966o.m8601S();
                        }
                        break;
                    case 1:
                        InterfaceC2139c navController2 = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController2, "navController");
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= ((C3966o) interfaceC3962k2).m8616i(navController2) ? 4 : 2;
                        }
                        C3966o c3966o2 = (C3966o) interfaceC3962k2;
                        if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            C6097y c6097yM12082a = q1.b0.m12082a(0, 3, c3966o2);
                            final C4226o c4226o2 = this.f21466b;
                            boolean zM8616i2 = c3966o2.m8616i(c4226o2);
                            Object objM8596M3 = c3966o2.m8596M();
                            Object obj4 = C3961j.f20408a;
                            if (zM8616i2 || objM8596M3 == obj4) {
                                final int i12 = 3;
                                objM8596M3 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i12) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o2;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o2;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o2.j0(objM8596M3);
                            }
                            InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) objM8596M3;
                            boolean zM8616i3 = c3966o2.m8616i(c4226o2);
                            Object objM8596M4 = c3966o2.m8596M();
                            if (zM8616i3 || objM8596M4 == obj4) {
                                final int i13 = 4;
                                objM8596M4 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i13) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o2;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o2;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o2.j0(objM8596M4);
                            }
                            AbstractC7733a.m14733l(c6097yM12082a, navController2, interfaceC2139c2, (InterfaceC2139c) objM8596M4, c3966o2, (iIntValue2 << 3) & 112);
                        } else {
                            c3966o2.m8601S();
                        }
                        break;
                    default:
                        InterfaceC2139c navController3 = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController3, "navController");
                        if ((iIntValue3 & 6) == 0) {
                            iIntValue3 |= ((C3966o) interfaceC3962k3).m8616i(navController3) ? 4 : 2;
                        }
                        C3966o c3966o3 = (C3966o) interfaceC3962k3;
                        if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                            C6097y c6097yM12082a2 = q1.b0.m12082a(0, 3, c3966o3);
                            final C4226o c4226o3 = this.f21466b;
                            boolean zM8616i4 = c3966o3.m8616i(c4226o3);
                            Object objM8596M5 = c3966o3.m8596M();
                            Object obj5 = C3961j.f20408a;
                            if (zM8616i4 || objM8596M5 == obj5) {
                                final int i14 = 0;
                                objM8596M5 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i14) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o3;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o3;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o3.j0(objM8596M5);
                            }
                            InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) objM8596M5;
                            boolean zM8616i5 = c3966o3.m8616i(c4226o3);
                            Object objM8596M6 = c3966o3.m8596M();
                            if (zM8616i5 || objM8596M6 == obj5) {
                                final int i15 = 1;
                                objM8596M6 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i15) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o3;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o3;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o3.j0(objM8596M6);
                            }
                            AbstractC7733a.m14732k(c6097yM12082a2, navController3, interfaceC2139c3, (InterfaceC2139c) objM8596M6, c3966o3, (iIntValue3 << 3) & 112);
                        } else {
                            c3966o3.m8601S();
                        }
                        break;
                }
                return qw.a0.f30746a;
            }
        }, true, -651155194)));
        final int i12 = 2;
        arrayList.add(new h3(f9.m11628b(context, R.string.my_lead_), new C6734c(new InterfaceC2142f(this) { // from class: ks.m

            /* renamed from: b */
            public final /* synthetic */ C4226o f21466b;

            {
                this.f21466b = this;
            }

            @Override // ex.InterfaceC2142f
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i12) {
                    case 0:
                        InterfaceC2139c navController = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController, "navController");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((C3966o) interfaceC3962k).m8616i(navController) ? 4 : 2;
                        }
                        C3966o c3966o = (C3966o) interfaceC3962k;
                        if (c3966o.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
                            boolean z6 = (iIntValue & 14) == 4;
                            Object objM8596M = c3966o.m8596M();
                            s0 s0Var = C3961j.f20408a;
                            if (z6 || objM8596M == s0Var) {
                                objM8596M = new C1516l(2, navController);
                                c3966o.j0(objM8596M);
                            }
                            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M;
                            final C4226o c4226o = this.f21466b;
                            boolean zM8616i = c3966o.m8616i(c4226o);
                            Object objM8596M2 = c3966o.m8596M();
                            if (zM8616i || objM8596M2 == s0Var) {
                                final int i112 = 2;
                                objM8596M2 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i112) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o.j0(objM8596M2);
                            }
                            AbstractC7733a.m14724c(interfaceC2139c, (InterfaceC2139c) objM8596M2, c3966o, 0);
                        } else {
                            c3966o.m8601S();
                        }
                        break;
                    case 1:
                        InterfaceC2139c navController2 = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController2, "navController");
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= ((C3966o) interfaceC3962k2).m8616i(navController2) ? 4 : 2;
                        }
                        C3966o c3966o2 = (C3966o) interfaceC3962k2;
                        if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            C6097y c6097yM12082a = q1.b0.m12082a(0, 3, c3966o2);
                            final C4226o c4226o2 = this.f21466b;
                            boolean zM8616i2 = c3966o2.m8616i(c4226o2);
                            Object objM8596M3 = c3966o2.m8596M();
                            Object obj4 = C3961j.f20408a;
                            if (zM8616i2 || objM8596M3 == obj4) {
                                final int i122 = 3;
                                objM8596M3 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i122) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o2;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o2;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o2.j0(objM8596M3);
                            }
                            InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) objM8596M3;
                            boolean zM8616i3 = c3966o2.m8616i(c4226o2);
                            Object objM8596M4 = c3966o2.m8596M();
                            if (zM8616i3 || objM8596M4 == obj4) {
                                final int i13 = 4;
                                objM8596M4 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i13) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o2;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o2;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o2.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o2.j0(objM8596M4);
                            }
                            AbstractC7733a.m14733l(c6097yM12082a, navController2, interfaceC2139c2, (InterfaceC2139c) objM8596M4, c3966o2, (iIntValue2 << 3) & 112);
                        } else {
                            c3966o2.m8601S();
                        }
                        break;
                    default:
                        InterfaceC2139c navController3 = (InterfaceC2139c) obj;
                        InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        AbstractC4154l.m8923f(navController3, "navController");
                        if ((iIntValue3 & 6) == 0) {
                            iIntValue3 |= ((C3966o) interfaceC3962k3).m8616i(navController3) ? 4 : 2;
                        }
                        C3966o c3966o3 = (C3966o) interfaceC3962k3;
                        if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                            C6097y c6097yM12082a2 = q1.b0.m12082a(0, 3, c3966o3);
                            final C4226o c4226o3 = this.f21466b;
                            boolean zM8616i4 = c3966o3.m8616i(c4226o3);
                            Object objM8596M5 = c3966o3.m8596M();
                            Object obj5 = C3961j.f20408a;
                            if (zM8616i4 || objM8596M5 == obj5) {
                                final int i14 = 0;
                                objM8596M5 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i14) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o3;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o3;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o3.j0(objM8596M5);
                            }
                            InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) objM8596M5;
                            boolean zM8616i5 = c3966o3.m8616i(c4226o3);
                            Object objM8596M6 = c3966o3.m8596M();
                            if (zM8616i5 || objM8596M6 == obj5) {
                                final int i15 = 1;
                                objM8596M6 = new InterfaceC2139c() { // from class: ks.n
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj42) {
                                        switch (i15) {
                                            case 0:
                                                AbstractC7524q it = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it, "it");
                                                C4226o c4226o22 = c4226o3;
                                                c4226o22.getClass();
                                                c4226o22.f21477e = it;
                                                break;
                                            case 1:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 2, R.string.all_lead);
                                                break;
                                            case 2:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 0, R.string.due);
                                                break;
                                            case 3:
                                                AbstractC7524q it2 = (AbstractC7524q) obj42;
                                                AbstractC4154l.m8923f(it2, "it");
                                                C4226o c4226o32 = c4226o3;
                                                c4226o32.getClass();
                                                c4226o32.f21477e = it2;
                                                break;
                                            default:
                                                c4226o3.m8964e(((Integer) obj42).intValue(), 1, R.string.scheduled);
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o3.j0(objM8596M6);
                            }
                            AbstractC7733a.m14732k(c6097yM12082a2, navController3, interfaceC2139c3, (InterfaceC2139c) objM8596M6, c3966o3, (iIntValue3 << 3) & 112);
                        } else {
                            c3966o3.m8601S();
                        }
                        break;
                }
                return qw.a0.f30746a;
            }
        }, true, 950010853)));
        do {
            value = m1VarM15372c.getValue();
            ((C3347a) value).getClass();
        } while (!m1VarM15372c.m15397i(value, new C3347a(arrayList)));
    }

    /* renamed from: e */
    public final void m8964e(int i10, int i11, int i12) {
        m1 m1Var;
        Object value;
        ArrayList arrayListD0 = AbstractC6663m.d0(((C3347a) this.f21476d.f39340a.getValue()).f17712a);
        C8791f c8791f = C8791f.f42457a;
        String str = new DecimalFormat("##,##,###").format(Integer.valueOf(i10));
        AbstractC4154l.m8920c(str);
        h3 h3Var = (h3) arrayListD0.get(i11);
        String name = this.f21474b.getString(i12) + " (" + str + ") ";
        InterfaceC2142f interfaceC2142f = h3Var.f32941b;
        AbstractC4154l.m8923f(name, "name");
        arrayListD0.set(i11, new h3(name, interfaceC2142f));
        do {
            m1Var = this.f21475c;
            value = m1Var.getValue();
            ((C3347a) value).getClass();
        } while (!m1Var.m15397i(value, new C3347a(arrayListD0)));
    }
}
