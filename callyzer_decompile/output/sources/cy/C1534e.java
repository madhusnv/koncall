package cy;

import a2.AbstractC0030c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4417q;
import og.pe;
import qw.a0;
import rw.AbstractC6663m;
import tx.InterfaceC7249i;
import tx.InterfaceC7250j;
import tx.e2;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.AbstractC8193c;
import yx.AbstractC8823q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cy.e */
/* loaded from: classes3.dex */
public final class C1534e implements InterfaceC7249i, InterfaceC1535f, e2 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7714f = AtomicReferenceFieldUpdater.newUpdater(C1534e.class, Object.class, "state$volatile");

    /* renamed from: a */
    public final InterfaceC7564h f7715a;

    /* renamed from: c */
    public Object f7717c;
    private volatile /* synthetic */ Object state$volatile = AbstractC1537h.f7721a;

    /* renamed from: b */
    public ArrayList f7716b = new ArrayList(2);

    /* renamed from: d */
    public int f7718d = -1;

    /* renamed from: e */
    public Object f7719e = AbstractC1537h.f7724d;

    public C1534e(InterfaceC7564h interfaceC7564h) {
        this.f7715a = interfaceC7564h;
    }

    @Override // tx.e2
    /* renamed from: a */
    public final void mo5076a(AbstractC8823q abstractC8823q, int i10) {
        this.f7717c = abstractC8823q;
        this.f7718d = i10;
    }

    @Override // tx.InterfaceC7249i
    /* renamed from: b */
    public final void mo5077b(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7714f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == AbstractC1537h.f7722b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, AbstractC1537h.f7723c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f7716b;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ((C1532c) obj2).m5075a();
            }
            this.f7719e = AbstractC1537h.f7724d;
            this.f7716b = null;
            return;
        }
    }

    /* renamed from: c */
    public final Object m5078c(AbstractC8193c abstractC8193c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7714f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C1532c c1532c = (C1532c) obj;
        Object obj2 = this.f7719e;
        ArrayList arrayList = this.f7716b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList.get(i10);
                i10++;
                C1532c c1532c2 = (C1532c) obj3;
                if (c1532c2 != c1532c) {
                    c1532c2.m5075a();
                }
            }
            atomicReferenceFieldUpdater.set(this, AbstractC1537h.f7722b);
            this.f7719e = AbstractC1537h.f7724d;
            this.f7716b = null;
        }
        Object objInvoke = c1532c.f7703c.invoke(c1532c.f7701a, c1532c.f7704d, obj2);
        InterfaceC7559c interfaceC7559c = c1532c.f7705e;
        return c1532c.f7704d == AbstractC1537h.f7725e ? ((InterfaceC2139c) interfaceC7559c).invoke(abstractC8193c) : ((InterfaceC2141e) interfaceC7559c).invoke(objInvoke, abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5079d(ww.AbstractC8193c r11) throws kotlinx.coroutines.DispatchException {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.C1534e.m5079d(ww.c):java.lang.Object");
    }

    /* renamed from: e */
    public final C1532c m5080e(Object obj) {
        ArrayList arrayList = this.f7716b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList.get(i10);
            i10++;
            if (((C1532c) obj3).f7701a == obj) {
                obj2 = obj3;
                break;
            }
        }
        C1532c c1532c = (C1532c) obj2;
        if (c1532c != null) {
            return c1532c;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* renamed from: f */
    public final void m5081f(C1532c c1532c, boolean z6) {
        Object obj = c1532c.f7701a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7714f;
        if (atomicReferenceFieldUpdater.get(this) instanceof C1532c) {
            return;
        }
        if (!z6) {
            ArrayList arrayList = this.f7716b;
            AbstractC4154l.m8920c(arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    if (((C1532c) obj2).f7701a == obj) {
                        throw new IllegalStateException(AbstractC0030c.m118i(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        c1532c.f7702b.invoke(obj, this, c1532c.f7704d);
        if (this.f7719e != AbstractC1537h.f7724d) {
            atomicReferenceFieldUpdater.set(this, c1532c);
            return;
        }
        if (!z6) {
            ArrayList arrayList2 = this.f7716b;
            AbstractC4154l.m8920c(arrayList2);
            arrayList2.add(c1532c);
        }
        c1532c.f7707g = this.f7717c;
        c1532c.f7708h = this.f7718d;
        this.f7717c = null;
        this.f7718d = -1;
    }

    /* renamed from: g */
    public final int m5082g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7714f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC7250j)) {
                if (AbstractC4154l.m8918a(obj3, AbstractC1537h.f7722b) || (obj3 instanceof C1532c)) {
                    return 3;
                }
                if (AbstractC4154l.m8918a(obj3, AbstractC1537h.f7723c)) {
                    return 2;
                }
                if (AbstractC4154l.m8918a(obj3, AbstractC1537h.f7721a)) {
                    List listM10833h = pe.m10833h(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listM10833h)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListM12753Q = AbstractC6663m.m12753Q(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListM12753Q)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            C1532c c1532cM5080e = m5080e(obj);
            if (c1532cM5080e != null) {
                InterfaceC2142f interfaceC2142f = c1532cM5080e.f7706f;
                InterfaceC2142f interfaceC2142f2 = interfaceC2142f != null ? (InterfaceC2142f) interfaceC2142f.invoke(this, c1532cM5080e.f7704d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c1532cM5080e)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                InterfaceC7250j interfaceC7250j = (InterfaceC7250j) obj3;
                this.f7719e = obj2;
                C4417q c4417qMo5486r = interfaceC7250j.mo5486r(a0.f30746a, interfaceC2142f2);
                if (c4417qMo5486r == null) {
                    this.f7719e = AbstractC1537h.f7724d;
                    return 2;
                }
                interfaceC7250j.mo5487s(c4417qMo5486r);
                return 0;
            }
            continue;
        }
    }
}
