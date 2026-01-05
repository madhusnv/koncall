package k2;

import a2.C0036i;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import i1.C3135n;
import java.util.ArrayList;
import og.od;
import pg.n6;
import pg.x5;
import s2.C6732a;
import tx.C7251k;
import uw.InterfaceC7559c;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.e */
/* loaded from: classes.dex */
public final class C3956e implements t0 {

    /* renamed from: a */
    public final C0036i f20366a;

    /* renamed from: c */
    public Throwable f20368c;

    /* renamed from: b */
    public final Object f20367b = new Object();

    /* renamed from: d */
    public ArrayList f20369d = new ArrayList();

    /* renamed from: e */
    public ArrayList f20370e = new ArrayList();

    /* renamed from: f */
    public final C6732a f20371f = new C6732a(0);

    public C3956e(C0036i c0036i) {
        this.f20366a = c0036i;
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    /* renamed from: a */
    public final void m8535a(long j6) {
        Object objM10796a;
        synchronized (this.f20367b) {
            try {
                ArrayList arrayList = this.f20369d;
                this.f20369d = this.f20370e;
                this.f20370e = arrayList;
                this.f20371f.set(0);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C3955d c3955d = (C3955d) arrayList.get(i10);
                    C7251k c7251k = c3955d.f20363b;
                    try {
                        objM10796a = c3955d.f20362a.invoke(Long.valueOf(j6));
                    } catch (Throwable th2) {
                        objM10796a = od.m10796a(th2);
                    }
                    c7251k.resumeWith(objM10796a);
                }
                arrayList.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7562f o0(InterfaceC7563g interfaceC7563g) {
        return x5.m11926a(this, interfaceC7563g);
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7564h t0(InterfaceC7564h interfaceC7564h) {
        return x5.m11928d(this, interfaceC7564h);
    }

    @Override // k2.t0
    /* renamed from: u */
    public final Object mo8536u(InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        C3955d c3955d = new C3955d(interfaceC2139c, c7251k);
        synchronized (this.f20367b) {
            Throwable th2 = this.f20368c;
            if (th2 != null) {
                c7251k.resumeWith(od.m10796a(th2));
            } else {
                boolean zIsEmpty = this.f20369d.isEmpty();
                this.f20369d.add(c3955d);
                if (zIsEmpty) {
                    this.f20371f.set(1);
                }
                c7251k.m13542t(new C3135n(8, this, c3955d));
                if (zIsEmpty) {
                    try {
                        this.f20366a.invoke();
                    } catch (Throwable th3) {
                        synchronized (this.f20367b) {
                            try {
                                if (this.f20368c == null) {
                                    this.f20368c = th3;
                                    ArrayList arrayList = this.f20369d;
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((C3955d) arrayList.get(i10)).f20363b.resumeWith(od.m10796a(th3));
                                    }
                                    this.f20369d.clear();
                                    this.f20371f.set(0);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
            }
        }
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // uw.InterfaceC7564h
    /* renamed from: z */
    public final InterfaceC7564h mo1766z(InterfaceC7563g interfaceC7563g) {
        return x5.m11927b(this, interfaceC7563g);
    }
}
