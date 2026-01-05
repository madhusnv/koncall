package qr;

import an.w1;
import an.z1;
import cv.C1513i;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import k2.s0;
import k2.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import op.C5434c;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import ps.C6014n;
import s2.AbstractC6740i;
import sq.b1;
import ur.AbstractC7524q;
import ur.C7514g;
import ur.C7518k;
import ur.C7519l;
import ur.C7520m;
import ur.C7530w;
import ur.C7531x;
import ur.C7533z;
import ur.h0;
import wx.m1;
import wx.u0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.u */
/* loaded from: classes3.dex */
public abstract class AbstractC6297u {

    /* renamed from: a */
    public final String f30614a;

    /* renamed from: b */
    public final String f30615b;

    /* renamed from: c */
    public final Object f30616c;

    public AbstractC6297u(String str, String str2, Object obj) {
        this.f30614a = str;
        this.f30615b = str2;
        this.f30616c = obj;
    }

    /* renamed from: a */
    public final void m12325a(final AbstractC7524q viewModel, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(viewModel, "viewModel");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1715817454);
        int i11 = (c3966o.m8616i(viewModel) ? 4 : 2) | i10 | (c3966o.m8616i(this) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            boolean z6 = this instanceof C6294r;
            s0 s0Var = C3961j.f20408a;
            if (z6) {
                c3966o.m8607Y(1512179983);
                Object objM8596M = c3966o.m8596M();
                if (objM8596M == s0Var) {
                    objM8596M = C3953b.m8517t(Boolean.FALSE);
                    c3966o.j0(objM8596M);
                }
                w0 w0Var = (w0) objM8596M;
                C6294r c6294r = (C6294r) this;
                Object value = C3953b.m8509l(c6294r.f30597j, c3966o).getValue();
                if (((Boolean) w0Var.getValue()).booleanValue()) {
                    c3966o.m8607Y(1512379251);
                    C7530w c7530w = (C7530w) value;
                    Iterator it = c7530w.f36269a.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        } else if (((ur.f0) it.next()) instanceof C7533z) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    ur.f0 f0Var = (ur.f0) c7530w.f36269a.get(i12);
                    LocalDateTime localDateTimeMo14292b = f0Var.mo14292b();
                    LocalDateTime localDateTimeMo14291a = f0Var.mo14291a();
                    boolean zM8616i = c3966o.m8616i(this) | c3966o.m8612e(i12) | c3966o.m8616i(viewModel);
                    Object objM8596M2 = c3966o.m8596M();
                    if (zM8616i || objM8596M2 == s0Var) {
                        objM8596M2 = new C1513i(i12, this, viewModel);
                        c3966o.j0(objM8596M2);
                    }
                    InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM8596M2;
                    Object objM8596M3 = c3966o.m8596M();
                    if (objM8596M3 == s0Var) {
                        objM8596M3 = new C5434c(w0Var, 9);
                        c3966o.j0(objM8596M3);
                    }
                    b1.m13119w(localDateTimeMo14292b, localDateTimeMo14291a, interfaceC2141e, (InterfaceC2137a) objM8596M3, c3966o, 3072);
                } else {
                    c3966o.m8607Y(1491852756);
                }
                c3966o.m8623p(false);
                C7530w c7530w2 = (C7530w) value;
                List listM12313n = c6294r.m12313n();
                boolean zM8616i2 = c3966o.m8616i(this) | c3966o.m8616i(viewModel);
                Object objM8596M4 = c3966o.m8596M();
                if (zM8616i2 || objM8596M4 == s0Var) {
                    objM8596M4 = new w1(23, this, w0Var, viewModel);
                    c3966o.j0(objM8596M4);
                }
                AbstractC6287k.m12286c(c7530w2, listM12313n, (InterfaceC2139c) objM8596M4, null, c3966o, 0, 8);
                c3966o.m8623p(false);
            } else if (this instanceof C6295s) {
                c3966o.m8607Y(1514256487);
                C6295s c6295s = (C6295s) this;
                C7530w c7530w3 = (C7530w) C3953b.m8509l(c6295s.f30606k, c3966o).getValue();
                List listM12317n = c6295s.m12317n();
                boolean zM8616i3 = c3966o.m8616i(viewModel) | c3966o.m8616i(this);
                Object objM8596M5 = c3966o.m8596M();
                if (zM8616i3 || objM8596M5 == s0Var) {
                    final int i13 = 0;
                    objM8596M5 = new InterfaceC2139c() { // from class: qr.p
                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    int iIntValue = ((Integer) obj).intValue();
                                    ((C6295s) this).getClass();
                                    viewModel.mo2033e(new C7514g(iIntValue, h0.EXCLUDE_NUMBER));
                                    break;
                                case 1:
                                    List selectedPosition = (List) obj;
                                    AbstractC4154l.m8923f(selectedPosition, "selectedPosition");
                                    viewModel.mo2033e(new C7519l(selectedPosition, ((C6293q) this).f30590k));
                                    break;
                                default:
                                    int iIntValue2 = ((Integer) obj).intValue();
                                    ((C6296t) this).getClass();
                                    viewModel.mo2033e(new C7514g(iIntValue2, h0.SIM_FILTER));
                                    break;
                            }
                            return qw.a0.f30746a;
                        }
                    };
                    c3966o.j0(objM8596M5);
                }
                AbstractC6287k.m12286c(c7530w3, listM12317n, (InterfaceC2139c) objM8596M5, AbstractC6740i.m12902d(-1953847912, new C6289m(this, 1), c3966o), c3966o, 3072, 0);
                c3966o.m8623p(false);
            } else if (this instanceof C6293q) {
                c3966o.m8607Y(1516481853);
                C6293q c6293q = (C6293q) this;
                C7531x c7531x = (C7531x) C3953b.m8509l(c6293q.f30589j, c3966o).getValue();
                ArrayList arrayListM12309n = c6293q.m12309n();
                boolean zM8616i4 = c3966o.m8616i(viewModel) | c3966o.m8616i(this);
                Object objM8596M6 = c3966o.m8596M();
                if (zM8616i4 || objM8596M6 == s0Var) {
                    final int i14 = 1;
                    objM8596M6 = new InterfaceC2139c() { // from class: qr.p
                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    int iIntValue = ((Integer) obj).intValue();
                                    ((C6295s) this).getClass();
                                    viewModel.mo2033e(new C7514g(iIntValue, h0.EXCLUDE_NUMBER));
                                    break;
                                case 1:
                                    List selectedPosition = (List) obj;
                                    AbstractC4154l.m8923f(selectedPosition, "selectedPosition");
                                    viewModel.mo2033e(new C7519l(selectedPosition, ((C6293q) this).f30590k));
                                    break;
                                default:
                                    int iIntValue2 = ((Integer) obj).intValue();
                                    ((C6296t) this).getClass();
                                    viewModel.mo2033e(new C7514g(iIntValue2, h0.SIM_FILTER));
                                    break;
                            }
                            return qw.a0.f30746a;
                        }
                    };
                    c3966o.j0(objM8596M6);
                }
                AbstractC6287k.m12298o(c7531x, arrayListM12309n, (InterfaceC2139c) objM8596M6, c3966o, 0);
                c3966o.m8623p(false);
            } else {
                if (!(this instanceof C6296t)) {
                    c3966o.m8607Y(-366860022);
                    c3966o.m8623p(false);
                    throw new NoWhenBranchMatchedException();
                }
                c3966o.m8607Y(1517041093);
                C6296t c6296t = (C6296t) this;
                C7530w c7530w4 = (C7530w) C3953b.m8509l(c6296t.f30613j, c3966o).getValue();
                ArrayList arrayListM12321n = c6296t.m12321n();
                boolean zM8616i5 = c3966o.m8616i(viewModel) | c3966o.m8616i(this);
                Object objM8596M7 = c3966o.m8596M();
                if (zM8616i5 || objM8596M7 == s0Var) {
                    final int i15 = 2;
                    objM8596M7 = new InterfaceC2139c() { // from class: qr.p
                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    int iIntValue = ((Integer) obj).intValue();
                                    ((C6295s) this).getClass();
                                    viewModel.mo2033e(new C7514g(iIntValue, h0.EXCLUDE_NUMBER));
                                    break;
                                case 1:
                                    List selectedPosition = (List) obj;
                                    AbstractC4154l.m8923f(selectedPosition, "selectedPosition");
                                    viewModel.mo2033e(new C7519l(selectedPosition, ((C6293q) this).f30590k));
                                    break;
                                default:
                                    int iIntValue2 = ((Integer) obj).intValue();
                                    ((C6296t) this).getClass();
                                    viewModel.mo2033e(new C7514g(iIntValue2, h0.SIM_FILTER));
                                    break;
                            }
                            return qw.a0.f30746a;
                        }
                    };
                    c3966o.j0(objM8596M7);
                }
                AbstractC6287k.m12287d(c7530w4, arrayListM12321n, (InterfaceC2139c) objM8596M7, c3966o, 0);
                c3966o.m8623p(false);
            }
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6014n(this, viewModel, i10, 1);
        }
    }

    /* renamed from: b */
    public final void m12326b(int i10, final InterfaceC2137a closeSheet, final InterfaceC2139c onEvent, InterfaceC3962k interfaceC3962k) {
        int i11;
        s0 s0Var;
        w0 w0Var;
        boolean z6;
        AbstractC4154l.m8923f(onEvent, "onEvent");
        AbstractC4154l.m8923f(closeSheet, "closeSheet");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(839497045);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(onEvent) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(closeSheet) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(this) ? 256 : 128;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            boolean z10 = this instanceof C6294r;
            s0 s0Var2 = C3961j.f20408a;
            if (z10) {
                c3966o.m8607Y(-137868169);
                C6294r c6294r = (C6294r) this;
                Object value = C3953b.m8509l(c6294r.f30595h, c3966o).getValue();
                Object objM8596M = c3966o.m8596M();
                if (objM8596M == s0Var2) {
                    objM8596M = C3953b.m8517t(Boolean.FALSE);
                    c3966o.j0(objM8596M);
                }
                w0 w0Var2 = (w0) objM8596M;
                if (((Boolean) w0Var2.getValue()).booleanValue()) {
                    c3966o.m8607Y(-137682634);
                    C7530w c7530w = (C7530w) value;
                    Iterator it = c7530w.f36269a.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        } else if (((ur.f0) it.next()) instanceof C7533z) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    ur.f0 f0Var = (ur.f0) c7530w.f36269a.get(i12);
                    LocalDateTime localDateTimeMo14292b = f0Var.mo14292b();
                    LocalDateTime localDateTimeMo14291a = f0Var.mo14291a();
                    boolean zM8616i = c3966o.m8616i(this) | c3966o.m8612e(i12) | ((i11 & 14) == 4) | ((i11 & 112) == 32);
                    Object objM8596M2 = c3966o.m8596M();
                    if (zM8616i || objM8596M2 == s0Var2) {
                        objM8596M2 = new C6290n(this, i12, onEvent, closeSheet);
                        c3966o.j0(objM8596M2);
                    }
                    InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM8596M2;
                    Object objM8596M3 = c3966o.m8596M();
                    if (objM8596M3 == s0Var2) {
                        objM8596M3 = new C5434c(w0Var2, 10);
                        c3966o.j0(objM8596M3);
                    }
                    w0Var = w0Var2;
                    s0Var = s0Var2;
                    b1.m13119w(localDateTimeMo14292b, localDateTimeMo14291a, interfaceC2141e, (InterfaceC2137a) objM8596M3, c3966o, 3072);
                    z6 = false;
                } else {
                    s0Var = s0Var2;
                    w0Var = w0Var2;
                    z6 = false;
                    c3966o.m8607Y(-152286579);
                }
                c3966o.m8623p(z6);
                C7530w c7530w2 = (C7530w) value;
                List listM12313n = c6294r.m12313n();
                boolean zM8616i2 = ((i11 & 112) == 32) | ((i11 & 14) == 4) | c3966o.m8616i(this);
                Object objM8596M4 = c3966o.m8596M();
                if (zM8616i2 || objM8596M4 == s0Var) {
                    z1 z1Var = new z1(this, w0Var, onEvent, closeSheet, 6);
                    c3966o.j0(z1Var);
                    objM8596M4 = z1Var;
                }
                AbstractC6287k.m12286c(c7530w2, listM12313n, (InterfaceC2139c) objM8596M4, null, c3966o, 0, 8);
                c3966o.m8623p(false);
            } else if (this instanceof C6295s) {
                c3966o.m8607Y(-135374653);
                C6295s c6295s = (C6295s) this;
                C7530w c7530w3 = (C7530w) C3953b.m8509l(c6295s.f30604i, c3966o).getValue();
                List listM12317n = c6295s.m12317n();
                boolean zM8616i3 = ((i11 & 14) == 4) | c3966o.m8616i(this) | ((i11 & 112) == 32);
                Object objM8596M5 = c3966o.m8596M();
                if (zM8616i3 || objM8596M5 == s0Var2) {
                    final int i13 = 0;
                    objM8596M5 = new InterfaceC2139c(this) { // from class: qr.l

                        /* renamed from: c */
                        public final /* synthetic */ AbstractC6297u f30568c;

                        {
                            this.f30568c = this;
                        }

                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    int iIntValue = ((Integer) obj).intValue();
                                    ((C6295s) this.f30568c).getClass();
                                    onEvent.invoke(new C7518k(iIntValue, h0.EXCLUDE_NUMBER));
                                    closeSheet.invoke();
                                    break;
                                case 1:
                                    int iIntValue2 = ((Integer) obj).intValue();
                                    ((C6296t) this.f30568c).getClass();
                                    onEvent.invoke(new C7518k(iIntValue2, h0.SIM_FILTER));
                                    closeSheet.invoke();
                                    break;
                                default:
                                    List selectedPosition = (List) obj;
                                    AbstractC4154l.m8923f(selectedPosition, "selectedPosition");
                                    onEvent.invoke(new C7520m(selectedPosition, ((C6293q) this.f30568c).f30590k));
                                    closeSheet.invoke();
                                    break;
                            }
                            return qw.a0.f30746a;
                        }
                    };
                    c3966o.j0(objM8596M5);
                }
                AbstractC6287k.m12286c(c7530w3, listM12317n, (InterfaceC2139c) objM8596M5, AbstractC6740i.m12902d(-1508501889, new C6289m(this, 0), c3966o), c3966o, 3072, 0);
                c3966o.m8623p(false);
            } else if (this instanceof C6296t) {
                c3966o.m8607Y(-133135740);
                C6296t c6296t = (C6296t) this;
                C7530w c7530w4 = (C7530w) C3953b.m8509l(c6296t.f30611h, c3966o).getValue();
                ArrayList arrayListM12321n = c6296t.m12321n();
                boolean zM8616i4 = ((i11 & 14) == 4) | c3966o.m8616i(this) | ((i11 & 112) == 32);
                Object objM8596M6 = c3966o.m8596M();
                if (zM8616i4 || objM8596M6 == s0Var2) {
                    final int i14 = 1;
                    objM8596M6 = new InterfaceC2139c(this) { // from class: qr.l

                        /* renamed from: c */
                        public final /* synthetic */ AbstractC6297u f30568c;

                        {
                            this.f30568c = this;
                        }

                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    int iIntValue = ((Integer) obj).intValue();
                                    ((C6295s) this.f30568c).getClass();
                                    onEvent.invoke(new C7518k(iIntValue, h0.EXCLUDE_NUMBER));
                                    closeSheet.invoke();
                                    break;
                                case 1:
                                    int iIntValue2 = ((Integer) obj).intValue();
                                    ((C6296t) this.f30568c).getClass();
                                    onEvent.invoke(new C7518k(iIntValue2, h0.SIM_FILTER));
                                    closeSheet.invoke();
                                    break;
                                default:
                                    List selectedPosition = (List) obj;
                                    AbstractC4154l.m8923f(selectedPosition, "selectedPosition");
                                    onEvent.invoke(new C7520m(selectedPosition, ((C6293q) this.f30568c).f30590k));
                                    closeSheet.invoke();
                                    break;
                            }
                            return qw.a0.f30746a;
                        }
                    };
                    c3966o.j0(objM8596M6);
                }
                AbstractC6287k.m12287d(c7530w4, arrayListM12321n, (InterfaceC2139c) objM8596M6, c3966o, 0);
                c3966o.m8623p(false);
            } else {
                if (!(this instanceof C6293q)) {
                    c3966o.m8607Y(-697182368);
                    c3966o.m8623p(false);
                    throw new NoWhenBranchMatchedException();
                }
                c3966o.m8607Y(-132668198);
                C6293q c6293q = (C6293q) this;
                C7531x c7531x = (C7531x) C3953b.m8509l(c6293q.f30587h, c3966o).getValue();
                ArrayList arrayListM12309n = c6293q.m12309n();
                boolean zM8616i5 = ((i11 & 14) == 4) | c3966o.m8616i(this) | ((i11 & 112) == 32);
                Object objM8596M7 = c3966o.m8596M();
                if (zM8616i5 || objM8596M7 == s0Var2) {
                    final int i15 = 2;
                    objM8596M7 = new InterfaceC2139c(this) { // from class: qr.l

                        /* renamed from: c */
                        public final /* synthetic */ AbstractC6297u f30568c;

                        {
                            this.f30568c = this;
                        }

                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    int iIntValue = ((Integer) obj).intValue();
                                    ((C6295s) this.f30568c).getClass();
                                    onEvent.invoke(new C7518k(iIntValue, h0.EXCLUDE_NUMBER));
                                    closeSheet.invoke();
                                    break;
                                case 1:
                                    int iIntValue2 = ((Integer) obj).intValue();
                                    ((C6296t) this.f30568c).getClass();
                                    onEvent.invoke(new C7518k(iIntValue2, h0.SIM_FILTER));
                                    closeSheet.invoke();
                                    break;
                                default:
                                    List selectedPosition = (List) obj;
                                    AbstractC4154l.m8923f(selectedPosition, "selectedPosition");
                                    onEvent.invoke(new C7520m(selectedPosition, ((C6293q) this.f30568c).f30590k));
                                    closeSheet.invoke();
                                    break;
                            }
                            return qw.a0.f30746a;
                        }
                    };
                    c3966o.j0(objM8596M7);
                }
                AbstractC6287k.m12299p(c7531x, arrayListM12309n, (InterfaceC2139c) objM8596M7, c3966o, 0);
                c3966o.m8623p(false);
            }
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6290n(this, onEvent, closeSheet, i10);
        }
    }

    /* renamed from: c */
    public final void m12327c() {
        m1 m1Var;
        u0 u0VarMo12307j = mo12307j();
        do {
            m1Var = (m1) u0VarMo12307j;
        } while (!m1Var.m15397i(m1Var.getValue(), mo12301d().f39340a.getValue()));
    }

    /* renamed from: d */
    public abstract wx.w0 mo12301d();

    /* renamed from: e */
    public abstract String mo12302e();

    /* renamed from: f */
    public abstract h0 mo12303f();

    /* renamed from: g */
    public abstract InterfaceC2137a mo12304g();

    /* renamed from: h */
    public abstract wx.w0 mo12305h();

    /* renamed from: i */
    public abstract u0 mo12306i();

    /* renamed from: j */
    public abstract u0 mo12307j();

    /* renamed from: k */
    public abstract boolean mo12308k();

    /* renamed from: l */
    public final void m12328l() {
        m1 m1Var;
        m1 m1Var2;
        Object objInvoke = mo12304g().invoke();
        u0 u0VarMo12307j = mo12307j();
        do {
            m1Var = (m1) u0VarMo12307j;
        } while (!m1Var.m15397i(m1Var.getValue(), objInvoke));
        u0 u0VarMo12306i = mo12306i();
        do {
            m1Var2 = (m1) u0VarMo12306i;
        } while (!m1Var2.m15397i(m1Var2.getValue(), objInvoke));
    }

    /* renamed from: m */
    public final void m12329m() {
        m1 m1Var;
        u0 u0VarMo12306i = mo12306i();
        do {
            m1Var = (m1) u0VarMo12306i;
        } while (!m1Var.m15397i(m1Var.getValue(), mo12305h().f39340a.getValue()));
    }
}
