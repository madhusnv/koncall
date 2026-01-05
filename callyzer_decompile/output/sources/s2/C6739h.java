package s2;

import android.os.Trace;
import com.sun.mail.util.AbstractC1452a;
import e1.C1921w;
import e1.k0;
import ex.InterfaceC2137a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import k2.InterfaceC3960i;
import k2.r1;
import k2.s1;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import og.pe;
import xe.C8356h;
import xe.C8360l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s2.h */
/* loaded from: classes.dex */
public final class C6739h {

    /* renamed from: a */
    public Object f32180a;

    /* renamed from: b */
    public Object f32181b;

    /* renamed from: c */
    public Object f32182c;

    /* renamed from: d */
    public Object f32183d;

    /* renamed from: e */
    public Object f32184e;

    /* renamed from: f */
    public Object f32185f;

    /* renamed from: g */
    public Serializable f32186g;

    /* renamed from: h */
    public Serializable f32187h;

    /* renamed from: i */
    public Object f32188i;

    /* renamed from: j */
    public Object f32189j;

    public C6739h(Set set) {
        this.f32180a = set;
        C4640e c4640e = new C4640e(new s1[16]);
        this.f32181b = c4640e;
        this.f32182c = c4640e;
        this.f32183d = new C4640e(new Object[16]);
        this.f32184e = new C4640e(new InterfaceC2137a[16]);
        this.f32186g = new ArrayList();
        this.f32188i = new C1921w();
        this.f32189j = new C1921w();
    }

    /* renamed from: a */
    public void m12893a(String str, String str2) {
        HashMap map = (HashMap) this.f32185f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    /* renamed from: b */
    public C8356h m12894b() {
        String strM4561h = ((String) this.f32180a) == null ? " transportName" : "";
        if (((C8360l) this.f32182c) == null) {
            strM4561h = strM4561h.concat(" encodedPayload");
        }
        if (((Long) this.f32183d) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " eventMillis");
        }
        if (((Long) this.f32184e) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " uptimeMillis");
        }
        if (((HashMap) this.f32185f) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " autoMetadata");
        }
        if (strM4561h.isEmpty()) {
            return new C8356h((String) this.f32180a, (Integer) this.f32181b, (C8360l) this.f32182c, ((Long) this.f32183d).longValue(), ((Long) this.f32184e).longValue(), (HashMap) this.f32185f, (Integer) this.f32186g, (String) this.f32187h, (byte[]) this.f32188i, (byte[]) this.f32189j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM4561h));
    }

    /* renamed from: c */
    public void m12895c() {
        Set set = (Set) this.f32180a;
        if (set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                r1 r1Var = (r1) it.next();
                it.remove();
                r1Var.mo5874b();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: d */
    public void m12896d() {
        C4640e c4640e = (C4640e) this.f32181b;
        Set set = (Set) this.f32180a;
        m12897e(Integer.MIN_VALUE);
        C4640e c4640e2 = (C4640e) this.f32183d;
        if (c4640e2.f22886c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                k0 k0Var = (k0) this.f32185f;
                int i10 = c4640e2.f22886c;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    Object obj = c4640e2.f22884a[i10];
                    if (obj instanceof s1) {
                        r1 r1Var = ((s1) obj).f20549a;
                        set.remove(r1Var);
                        r1Var.mo5875c();
                    }
                    if (obj instanceof InterfaceC3960i) {
                        if (k0Var == null || !k0Var.m5583c(obj)) {
                            ((InterfaceC3960i) obj).mo8539b();
                        } else {
                            ((InterfaceC3960i) obj).mo8538a();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c4640e.f22886c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Object[] objArr = c4640e.f22884a;
                int i11 = c4640e.f22886c;
                for (int i12 = 0; i12 < i11; i12++) {
                    r1 r1Var2 = ((s1) objArr[i12]).f20549a;
                    set.remove(r1Var2);
                    r1Var2.mo5876e();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    /* renamed from: e */
    public void m12897e(int i10) {
        C1921w c1921w = (C1921w) this.f32189j;
        ArrayList arrayList = (ArrayList) this.f32186g;
        if (arrayList.isEmpty()) {
            return;
        }
        int i11 = 0;
        ArrayList arrayListM10835j = null;
        int i12 = 0;
        C1921w c1921w2 = null;
        C1921w c1921w3 = null;
        while (i12 < c1921w.f9077b) {
            if (i10 <= c1921w.m5653c(i12)) {
                Object objRemove = arrayList.remove(i12);
                int iM5656f = c1921w.m5656f(i12);
                int iM5656f2 = ((C1921w) this.f32188i).m5656f(i12);
                if (arrayListM10835j == null) {
                    arrayListM10835j = pe.m10835j(objRemove);
                    c1921w3 = new C1921w();
                    c1921w3.m5651a(iM5656f);
                    c1921w2 = new C1921w();
                    c1921w2.m5651a(iM5656f2);
                } else {
                    AbstractC4154l.m8921d(c1921w2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    AbstractC4154l.m8921d(c1921w3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListM10835j.add(objRemove);
                    c1921w3.m5651a(iM5656f);
                    c1921w2.m5651a(iM5656f2);
                }
            } else {
                i12++;
            }
        }
        if (arrayListM10835j != null) {
            AbstractC4154l.m8921d(c1921w2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            AbstractC4154l.m8921d(c1921w3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListM10835j.size() - 1;
            while (i11 < size) {
                int i13 = i11 + 1;
                int size2 = arrayListM10835j.size();
                for (int i14 = i13; i14 < size2; i14++) {
                    int iM5653c = c1921w3.m5653c(i11);
                    int iM5653c2 = c1921w3.m5653c(i14);
                    if (iM5653c < iM5653c2 || (iM5653c2 == iM5653c && c1921w2.m5653c(i11) < c1921w2.m5653c(i14))) {
                        Object obj = arrayListM10835j.get(i11);
                        arrayListM10835j.set(i11, arrayListM10835j.get(i14));
                        arrayListM10835j.set(i14, obj);
                        int iM5653c3 = c1921w2.m5653c(i11);
                        c1921w2.m5657g(i11, c1921w2.m5653c(i14));
                        c1921w2.m5657g(i14, iM5653c3);
                        int iM5653c4 = c1921w3.m5653c(i11);
                        c1921w3.m5657g(i11, c1921w3.m5653c(i14));
                        c1921w3.m5657g(i14, iM5653c4);
                    }
                }
                i11 = i13;
            }
            C4640e c4640e = (C4640e) this.f32183d;
            c4640e.m9508d(arrayListM10835j, c4640e.f22886c);
        }
    }

    /* renamed from: f */
    public void m12898f(Object obj, int i10, int i11, int i12) {
        m12897e(i10);
        if (i12 < 0 || i12 >= i10) {
            ((C4640e) this.f32183d).m9506b(obj);
            return;
        }
        ((ArrayList) this.f32186g).add(obj);
        ((C1921w) this.f32188i).m5651a(i11);
        ((C1921w) this.f32189j).m5651a(i12);
    }
}
