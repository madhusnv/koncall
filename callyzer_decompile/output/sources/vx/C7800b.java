package vx;

import ex.InterfaceC2139c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4417q;
import ls.C4512c;
import og.od;
import pg.n6;
import tx.C7251k;
import tx.c0;
import tx.e2;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import yx.AbstractC8823q;
import yx.AbstractC8824r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.b */
/* loaded from: classes3.dex */
public final class C7800b implements e2 {

    /* renamed from: a */
    public Object f37472a = AbstractC7808j.f37512p;

    /* renamed from: b */
    public C7251k f37473b;

    /* renamed from: c */
    public final /* synthetic */ C7806h f37474c;

    public C7800b(C7806h c7806h) {
        this.f37474c = c7806h;
    }

    @Override // tx.e2
    /* renamed from: a */
    public final void mo5076a(AbstractC8823q abstractC8823q, int i10) {
        C7251k c7251k = this.f37473b;
        if (c7251k != null) {
            c7251k.mo5076a(abstractC8823q, i10);
        }
    }

    /* renamed from: b */
    public final Object m14752b(AbstractC8193c abstractC8193c) throws Throwable {
        C7814p c7814pM14786s;
        Boolean bool;
        Object obj = this.f37472a;
        boolean z6 = true;
        if (obj == AbstractC7808j.f37512p || obj == AbstractC7808j.f37508l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7806h.f37489j;
            C7806h c7806h = this.f37474c;
            C7814p c7814p = (C7814p) atomicReferenceFieldUpdater.get(c7806h);
            while (true) {
                if (c7806h.m14792z()) {
                    this.f37472a = AbstractC7808j.f37508l;
                    Throwable thM14787t = c7806h.m14787t();
                    if (thM14787t != null) {
                        int i10 = AbstractC8824r.f42519a;
                        throw thM14787t;
                    }
                    z6 = false;
                } else {
                    long andIncrement = C7806h.f37485e.getAndIncrement(c7806h);
                    long j6 = AbstractC7808j.f37498b;
                    long j10 = andIncrement / j6;
                    int i11 = (int) (andIncrement % j6);
                    if (c7814p.f42518c != j10) {
                        c7814pM14786s = c7806h.m14786s(j10, c7814p);
                        if (c7814pM14786s == null) {
                            continue;
                        }
                    } else {
                        c7814pM14786s = c7814p;
                    }
                    Object objM14768K = c7806h.m14768K(c7814pM14786s, i11, andIncrement, null);
                    C4417q c4417q = AbstractC7808j.f37509m;
                    if (objM14768K == c4417q) {
                        throw new IllegalStateException("unreachable");
                    }
                    C4417q c4417q2 = AbstractC7808j.f37511o;
                    if (objM14768K == c4417q2) {
                        if (andIncrement < c7806h.m14790w()) {
                            c7814pM14786s.m16257a();
                        }
                        c7814p = c7814pM14786s;
                    } else {
                        if (objM14768K == AbstractC7808j.f37510n) {
                            C7806h c7806h2 = this.f37474c;
                            C7251k c7251kM13496s = c0.m13496s(n6.m11797c(abstractC8193c));
                            try {
                                this.f37473b = c7251kM13496s;
                                Object objM14768K2 = c7806h2.m14768K(c7814pM14786s, i11, andIncrement, this);
                                InterfaceC2139c interfaceC2139c = c7806h2.f37494b;
                                if (objM14768K2 == c4417q) {
                                    mo5076a(c7814pM14786s, i11);
                                } else {
                                    int i12 = 15;
                                    C4512c c4512c = null;
                                    if (objM14768K2 == c4417q2) {
                                        if (andIncrement < c7806h2.m14790w()) {
                                            c7814pM14786s.m16257a();
                                        }
                                        C7814p c7814p2 = (C7814p) C7806h.f37489j.get(c7806h2);
                                        while (true) {
                                            if (c7806h2.m14792z()) {
                                                C7251k c7251k = this.f37473b;
                                                AbstractC4154l.m8920c(c7251k);
                                                this.f37473b = null;
                                                this.f37472a = AbstractC7808j.f37508l;
                                                Throwable thM14787t2 = c7806h.m14787t();
                                                if (thM14787t2 == null) {
                                                    c7251k.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c7251k.resumeWith(od.m10796a(thM14787t2));
                                                }
                                            } else {
                                                long andIncrement2 = C7806h.f37485e.getAndIncrement(c7806h2);
                                                long j11 = AbstractC7808j.f37498b;
                                                long j12 = andIncrement2 / j11;
                                                int i13 = (int) (andIncrement2 % j11);
                                                if (c7814p2.f42518c != j12) {
                                                    C7814p c7814pM14786s2 = c7806h2.m14786s(j12, c7814p2);
                                                    if (c7814pM14786s2 != null) {
                                                        c7814p2 = c7814pM14786s2;
                                                    }
                                                }
                                                Object objM14768K3 = c7806h2.m14768K(c7814p2, i13, andIncrement2, this);
                                                if (objM14768K3 == AbstractC7808j.f37509m) {
                                                    mo5076a(c7814p2, i13);
                                                    break;
                                                }
                                                if (objM14768K3 == AbstractC7808j.f37511o) {
                                                    if (andIncrement2 < c7806h2.m14790w()) {
                                                        c7814p2.m16257a();
                                                    }
                                                } else {
                                                    if (objM14768K3 == AbstractC7808j.f37510n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c7814p2.m16257a();
                                                    this.f37472a = objM14768K3;
                                                    this.f37473b = null;
                                                    bool = Boolean.TRUE;
                                                    if (interfaceC2139c != null) {
                                                        c4512c = new C4512c(i12, interfaceC2139c, objM14768K3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c7814pM14786s.m16257a();
                                        this.f37472a = objM14768K2;
                                        this.f37473b = null;
                                        bool = Boolean.TRUE;
                                        if (interfaceC2139c != null) {
                                            c4512c = new C4512c(i12, interfaceC2139c, objM14768K2);
                                        }
                                    }
                                    c7251kM13496s.mo5485f(bool, c4512c);
                                }
                                Object objM13539o = c7251kM13496s.m13539o();
                                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                                return objM13539o;
                            } catch (Throwable th2) {
                                c7251kM13496s.m13546z();
                                throw th2;
                            }
                        }
                        c7814pM14786s.m16257a();
                        this.f37472a = objM14768K;
                    }
                }
            }
        }
        return Boolean.valueOf(z6);
    }

    /* renamed from: c */
    public final Object m14753c() throws Throwable {
        Object obj = this.f37472a;
        C4417q c4417q = AbstractC7808j.f37512p;
        if (obj == c4417q) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f37472a = c4417q;
        if (obj != AbstractC7808j.f37508l) {
            return obj;
        }
        Throwable thM14788u = this.f37474c.m14788u();
        int i10 = AbstractC8824r.f42519a;
        throw thM14788u;
    }
}
