package p001o;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p001o.xd9;

/* loaded from: classes4.dex */
public final class aid {

    /* renamed from: a */
    public final ConcurrentMap f14803a = new ConcurrentHashMap();

    /* renamed from: b */
    public C12193b f14804b;

    /* renamed from: c */
    public final Class f14805c;

    /* renamed from: o.aid$b */
    public static final class C12193b {

        /* renamed from: a */
        public final Object f14806a;

        /* renamed from: b */
        public final byte[] f14807b;

        /* renamed from: c */
        public final gd9 f14808c;

        /* renamed from: d */
        public final kgc f14809d;

        /* renamed from: e */
        public final int f14810e;

        public C12193b(Object obj, byte[] bArr, gd9 gd9Var, kgc kgcVar, int i) {
            this.f14806a = obj;
            this.f14807b = Arrays.copyOf(bArr, bArr.length);
            this.f14808c = gd9Var;
            this.f14809d = kgcVar;
            this.f14810e = i;
        }

        /* renamed from: a */
        public final byte[] m17160a() {
            byte[] bArr = this.f14807b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        /* renamed from: b */
        public kgc m17161b() {
            return this.f14809d;
        }

        /* renamed from: c */
        public Object m17162c() {
            return this.f14806a;
        }

        /* renamed from: d */
        public gd9 m17163d() {
            return this.f14808c;
        }
    }

    /* renamed from: o.aid$c */
    public static class C12194c implements Comparable {

        /* renamed from: a */
        public final byte[] f14811a;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C12194c c12194c) {
            byte[] bArr = this.f14811a;
            int length = bArr.length;
            byte[] bArr2 = c12194c.f14811a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.f14811a;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte b2 = c12194c.f14811a[i];
                if (b != b2) {
                    return b - b2;
                }
                i++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C12194c) {
                return Arrays.equals(this.f14811a, ((C12194c) obj).f14811a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f14811a);
        }

        public String toString() {
            return fy7.m27757b(this.f14811a);
        }

        public C12194c(byte[] bArr) {
            this.f14811a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public aid(Class cls) {
        this.f14805c = cls;
    }

    /* renamed from: f */
    public static aid m17153f(Class cls) {
        return new aid(cls);
    }

    /* renamed from: a */
    public C12193b m17154a(Object obj, xd9.C18118c c18118c) throws GeneralSecurityException {
        if (c18118c.m56071N() != gd9.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        C12193b c12193b = new C12193b(obj, wc4.m54200a(c18118c), c18118c.m56071N(), c18118c.m56070M(), c18118c.m56069L());
        ArrayList arrayList = new ArrayList();
        arrayList.add(c12193b);
        C12194c c12194c = new C12194c(c12193b.m17160a());
        List list = (List) this.f14803a.put(c12194c, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(c12193b);
            this.f14803a.put(c12194c, Collections.unmodifiableList(arrayList2));
        }
        return c12193b;
    }

    /* renamed from: b */
    public C12193b m17155b() {
        return this.f14804b;
    }

    /* renamed from: c */
    public List m17156c(byte[] bArr) {
        List list = (List) this.f14803a.get(new C12194c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: d */
    public Class m17157d() {
        return this.f14805c;
    }

    /* renamed from: e */
    public List m17158e() {
        return m17156c(wc4.f51768a);
    }

    /* renamed from: g */
    public void m17159g(C12193b c12193b) {
        if (c12193b == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (c12193b.m17163d() != gd9.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        if (m17156c(c12193b.m17160a()).isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.f14804b = c12193b;
    }
}
