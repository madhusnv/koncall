package c9;

import a1.C0005d;
import a6.C0058f;
import android.util.SparseArray;
import b6.C0602c;
import be.C0655j;
import c0.u1;
import com.google.android.gms.internal.measurement.C1288d;
import com.google.android.gms.internal.measurement.C1290f;
import com.google.android.gms.internal.measurement.C1304t;
import com.google.android.gms.internal.measurement.InterfaceC1298n;
import com.sun.mail.util.AbstractC1452a;
import e1.C1903e;
import e1.C1915q;
import e1.j0;
import e1.r0;
import e1.u0;
import h0.C2761a;
import i00.C3119x;
import i00.InterfaceC3101f;
import i00.InterfaceC3106k;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import l0.AbstractC4308h;
import pg.o7;
import pg.t8;
import pw.InterfaceC6043a;
import s1.C6707b;
import sk.C6860h;
import sk.InterfaceC6854b;
import vk.C7715a;
import vk.C7716b;
import wk.InterfaceC8101a;
import wk.InterfaceC8102b;
import ym.C8697h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.n */
/* loaded from: classes.dex */
public final class C0919n implements InterfaceC3101f {

    /* renamed from: a */
    public Object f5598a;

    /* renamed from: b */
    public Object f5599b;

    /* renamed from: c */
    public Object f5600c;

    /* renamed from: d */
    public Object f5601d;

    public C0919n(C0919n c0919n, C1304t c1304t) {
        this.f5600c = new HashMap();
        this.f5601d = new HashMap();
        this.f5598a = c0919n;
        this.f5599b = c1304t;
    }

    /* renamed from: a */
    public void m2655a() {
        u1 u1Var;
        o7.m11806a();
        C0005d c0005d = (C0005d) this.f5599b;
        c0005d.getClass();
        o7.m11806a();
        C2761a c2761a = (C2761a) c0005d.f26d;
        Objects.requireNonNull(c2761a);
        final C0655j c0655j = (C0655j) c0005d.f24b;
        Objects.requireNonNull(c0655j);
        final C0655j c0655j2 = (C0655j) c0005d.f25c;
        u1 u1Var2 = c2761a.f15321a;
        Objects.requireNonNull(u1Var2);
        u1Var2.mo7416a();
        u1 u1Var3 = c2761a.f15321a;
        Objects.requireNonNull(u1Var3);
        final int i10 = 0;
        AbstractC4308h.m9034d(u1Var3.f16604e).mo9026a(new Runnable() { // from class: h0.c
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        c0655j.m1883m();
                        break;
                    case 1:
                        C0655j c0655j3 = c0655j;
                        if (c0655j3 != null) {
                            c0655j3.m1883m();
                            break;
                        }
                        break;
                    default:
                        C0655j c0655j4 = c0655j;
                        if (c0655j4 != null) {
                            c0655j4.m1883m();
                            break;
                        }
                        break;
                }
            }
        }, t8.m11875d());
        u1 u1Var4 = c2761a.f15323c;
        if (u1Var4 != null) {
            u1Var4.mo7416a();
            final int i11 = 1;
            final C0655j c0655j3 = null;
            AbstractC4308h.m9034d(c2761a.f15323c.f16604e).mo9026a(new Runnable() { // from class: h0.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            c0655j3.m1883m();
                            break;
                        case 1:
                            C0655j c0655j32 = c0655j3;
                            if (c0655j32 != null) {
                                c0655j32.m1883m();
                                break;
                            }
                            break;
                        default:
                            C0655j c0655j4 = c0655j3;
                            if (c0655j4 != null) {
                                c0655j4.m1883m();
                                break;
                            }
                            break;
                    }
                }
            }, t8.m11875d());
        }
        if (c2761a.f15326f.size() > 1 && (u1Var = c2761a.f15322b) != null) {
            u1Var.mo7416a();
            final int i12 = 2;
            AbstractC4308h.m9034d(c2761a.f15322b.f16604e).mo9026a(new Runnable() { // from class: h0.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            c0655j2.m1883m();
                            break;
                        case 1:
                            C0655j c0655j32 = c0655j2;
                            if (c0655j32 != null) {
                                c0655j32.m1883m();
                                break;
                            }
                            break;
                        default:
                            C0655j c0655j4 = c0655j2;
                            if (c0655j4 != null) {
                                c0655j4.m1883m();
                                break;
                            }
                            break;
                    }
                }
            }, t8.m11875d());
        }
        ((C0058f) this.f5600c).getClass();
    }

    /* renamed from: b */
    public void m2656b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((u0) this.f5599b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                m2656b(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: c */
    public C6707b m2657c(Object obj) {
        C6707b c6707b = (C6707b) this.f5601d;
        if (this.f5600c == obj && c6707b != null) {
            return c6707b;
        }
        j0 j0Var = (j0) this.f5599b;
        Object objM5574g = j0Var.m5574g(obj);
        if (objM5574g == null) {
            C6707b c6707b2 = (C6707b) this.f5598a;
            C6707b c6707b3 = new C6707b();
            c6707b3.f32044a = c6707b2.f32044a;
            c6707b3.f32045b = c6707b2.f32045b;
            j0Var.m5579l(obj, c6707b3);
            objM5574g = c6707b3;
        }
        C6707b c6707b4 = (C6707b) objM5574g;
        this.f5600c = obj;
        this.f5601d = c6707b4;
        return c6707b4;
    }

    /* renamed from: d */
    public InterfaceC8102b m2658d(String str) {
        if (!((ConcurrentHashMap) this.f5601d).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.f5601d).containsKey(str)) {
                        try {
                            InputStream inputStreamM14708a = ((C7715a) ((InterfaceC6854b) this.f5598a)).m14708a(str);
                            ((C7716b) this.f5599b).getClass();
                            for (C6860h c6860h : C7716b.m14709a(inputStreamM14708a)) {
                                C0908c c0908c = (C0908c) this.f5600c;
                                C0910e c0910e = (C0910e) c0908c.f5575c;
                                if (((String) ((InterfaceC8101a) c0910e.f5580c).mo14177a(c6860h)).equals("001")) {
                                    ((C0910e) c0908c.f5574b).m2605o(c6860h);
                                } else {
                                    c0910e.m2605o(c6860h);
                                }
                            }
                            ((ConcurrentHashMap) this.f5601d).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e2) {
                            throw new IllegalStateException("Failed to read file " + str, e2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (C0908c) this.f5600c;
    }

    /* renamed from: e */
    public InterfaceC1298n m2659e(InterfaceC1298n interfaceC1298n) {
        return ((C1304t) this.f5599b).m3666c(this, interfaceC1298n);
    }

    /* renamed from: f */
    public InterfaceC1298n m2660f(C1288d c1288d) {
        InterfaceC1298n interfaceC1298nM3666c = InterfaceC1298n.f6309i;
        Iterator itM3219s = c1288d.m3219s();
        while (itM3219s.hasNext()) {
            interfaceC1298nM3666c = ((C1304t) this.f5599b).m3666c(this, c1288d.m3221u(((Integer) itM3219s.next()).intValue()));
            if (interfaceC1298nM3666c instanceof C1290f) {
                break;
            }
        }
        return interfaceC1298nM3666c;
    }

    /* renamed from: g */
    public C0919n m2661g() {
        return new C0919n(this, (C1304t) this.f5599b);
    }

    /* renamed from: h */
    public boolean m2662h(String str) {
        if (((HashMap) this.f5600c).containsKey(str)) {
            return true;
        }
        C0919n c0919n = (C0919n) this.f5598a;
        if (c0919n != null) {
            return c0919n.m2662h(str);
        }
        return false;
    }

    @Override // i00.InterfaceC3101f
    /* renamed from: i */
    public Object mo2663i(C3119x c3119x) {
        return new C8697h(c3119x, (InterfaceC3106k) this.f5599b, (InterfaceC6043a) this.f5600c, (InterfaceC6043a) this.f5601d);
    }

    /* renamed from: j */
    public void m2664j(String str, InterfaceC1298n interfaceC1298n) {
        C0919n c0919n;
        HashMap map = (HashMap) this.f5600c;
        if (!map.containsKey(str) && (c0919n = (C0919n) this.f5598a) != null && c0919n.m2662h(str)) {
            c0919n.m2664j(str, interfaceC1298n);
        } else {
            if (((HashMap) this.f5601d).containsKey(str)) {
                return;
            }
            if (interfaceC1298n == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC1298n);
            }
        }
    }

    /* renamed from: k */
    public void m2665k(String str, InterfaceC1298n interfaceC1298n) {
        HashMap map = (HashMap) this.f5600c;
        if (((HashMap) this.f5601d).containsKey(str)) {
            return;
        }
        if (interfaceC1298n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC1298n);
        }
    }

    @Override // i00.InterfaceC3101f
    /* renamed from: l */
    public Type mo2666l() {
        return (Type) this.f5598a;
    }

    /* renamed from: m */
    public InterfaceC1298n m2667m(String str) {
        HashMap map = (HashMap) this.f5600c;
        if (map.containsKey(str)) {
            return (InterfaceC1298n) map.get(str);
        }
        C0919n c0919n = (C0919n) this.f5598a;
        if (c0919n != null) {
            return c0919n.m2667m(str);
        }
        throw new IllegalArgumentException(AbstractC1452a.m4561h(str, " is not defined"));
    }

    public C0919n(int i10) {
        switch (i10) {
            case 8:
                this.f5598a = new C1903e(0);
                this.f5599b = new SparseArray();
                this.f5600c = new C1915q((Object) null);
                this.f5601d = new C1903e(0);
                break;
            case 9:
                this.f5598a = new C6707b();
                long[] jArr = r0.f9045a;
                this.f5599b = new j0();
                break;
            default:
                this.f5598a = new C0602c(10);
                this.f5599b = new u0(0);
                this.f5600c = new ArrayList();
                this.f5601d = new HashSet();
                break;
        }
    }
}
