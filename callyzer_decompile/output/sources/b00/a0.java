package b00;

import c00.AbstractC0836c;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 implements Comparable {

    /* renamed from: b */
    public static final String f3585b;

    /* renamed from: a */
    public final C0529n f3586a;

    static {
        String separator = File.separator;
        AbstractC4154l.m8922e(separator, "separator");
        f3585b = separator;
    }

    public a0(C0529n bytes) {
        AbstractC4154l.m8923f(bytes, "bytes");
        this.f3586a = bytes;
    }

    /* renamed from: a */
    public final ArrayList m1516a() {
        ArrayList arrayList = new ArrayList();
        int iM2255a = AbstractC0836c.m2255a(this);
        C0529n c0529n = this.f3586a;
        if (iM2255a == -1) {
            iM2255a = 0;
        } else if (iM2255a < c0529n.mo1563d() && c0529n.mo1567i(iM2255a) == 92) {
            iM2255a++;
        }
        int iMo1563d = c0529n.mo1563d();
        int i10 = iM2255a;
        while (iM2255a < iMo1563d) {
            if (c0529n.mo1567i(iM2255a) == 47 || c0529n.mo1567i(iM2255a) == 92) {
                arrayList.add(c0529n.mo1572o(i10, iM2255a));
                i10 = iM2255a + 1;
            }
            iM2255a++;
        }
        if (i10 < c0529n.mo1563d()) {
            arrayList.add(c0529n.mo1572o(i10, c0529n.mo1563d()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final a0 m1517b() {
        C0529n c0529n = AbstractC0836c.f5302d;
        C0529n c0529n2 = this.f3586a;
        if (AbstractC4154l.m8918a(c0529n2, c0529n)) {
            return null;
        }
        C0529n c0529n3 = AbstractC0836c.f5299a;
        if (AbstractC4154l.m8918a(c0529n2, c0529n3)) {
            return null;
        }
        C0529n prefix = AbstractC0836c.f5300b;
        if (AbstractC4154l.m8918a(c0529n2, prefix)) {
            return null;
        }
        C0529n suffix = AbstractC0836c.f5303e;
        c0529n2.getClass();
        AbstractC4154l.m8923f(suffix, "suffix");
        int iMo1563d = c0529n2.mo1563d();
        byte[] bArr = suffix.f3648a;
        if (c0529n2.mo1570m(iMo1563d - bArr.length, suffix, bArr.length) && (c0529n2.mo1563d() == 2 || c0529n2.mo1570m(c0529n2.mo1563d() - 3, c0529n3, 1) || c0529n2.mo1570m(c0529n2.mo1563d() - 3, prefix, 1))) {
            return null;
        }
        int iM1610k = C0529n.m1610k(c0529n2, c0529n3);
        if (iM1610k == -1) {
            iM1610k = C0529n.m1610k(c0529n2, prefix);
        }
        if (iM1610k == 2 && m1521f() != null) {
            if (c0529n2.mo1563d() == 3) {
                return null;
            }
            return new a0(C0529n.m1611p(c0529n2, 0, 3, 1));
        }
        if (iM1610k == 1) {
            AbstractC4154l.m8923f(prefix, "prefix");
            if (c0529n2.mo1570m(0, prefix, prefix.mo1563d())) {
                return null;
            }
        }
        if (iM1610k != -1 || m1521f() == null) {
            return iM1610k == -1 ? new a0(c0529n) : iM1610k == 0 ? new a0(C0529n.m1611p(c0529n2, 0, 1, 1)) : new a0(C0529n.m1611p(c0529n2, 0, iM1610k, 1));
        }
        if (c0529n2.mo1563d() == 2) {
            return null;
        }
        return new a0(C0529n.m1611p(c0529n2, 0, 2, 1));
    }

    /* renamed from: c */
    public final a0 m1518c(a0 other) {
        AbstractC4154l.m8923f(other, "other");
        C0529n c0529n = other.f3586a;
        int iM2255a = AbstractC0836c.m2255a(this);
        C0529n c0529n2 = this.f3586a;
        a0 a0Var = iM2255a == -1 ? null : new a0(c0529n2.mo1572o(0, iM2255a));
        int iM2255a2 = AbstractC0836c.m2255a(other);
        if (!AbstractC4154l.m8918a(a0Var, iM2255a2 != -1 ? new a0(c0529n.mo1572o(0, iM2255a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListM1516a = m1516a();
        ArrayList arrayListM1516a2 = other.m1516a();
        int iMin = Math.min(arrayListM1516a.size(), arrayListM1516a2.size());
        int i10 = 0;
        while (i10 < iMin && AbstractC4154l.m8918a(arrayListM1516a.get(i10), arrayListM1516a2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && c0529n2.mo1563d() == c0529n.mo1563d()) {
            return C8687a.m16037m(".");
        }
        if (arrayListM1516a2.subList(i10, arrayListM1516a2.size()).indexOf(AbstractC0836c.f5303e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (AbstractC4154l.m8918a(c0529n, AbstractC0836c.f5302d)) {
            return this;
        }
        C0526k c0526k = new C0526k();
        C0529n c0529nM2257c = AbstractC0836c.m2257c(other);
        if (c0529nM2257c == null && (c0529nM2257c = AbstractC0836c.m2257c(this)) == null) {
            c0529nM2257c = AbstractC0836c.m2260f(f3585b);
        }
        int size = arrayListM1516a2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c0526k.A0(AbstractC0836c.f5303e);
            c0526k.A0(c0529nM2257c);
        }
        int size2 = arrayListM1516a.size();
        while (i10 < size2) {
            c0526k.A0((C0529n) arrayListM1516a.get(i10));
            c0526k.A0(c0529nM2257c);
            i10++;
        }
        return AbstractC0836c.m2258d(c0526k, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a0 other = (a0) obj;
        AbstractC4154l.m8923f(other, "other");
        return this.f3586a.compareTo(other.f3586a);
    }

    /* renamed from: d */
    public final a0 m1519d(String child) {
        AbstractC4154l.m8923f(child, "child");
        C0526k c0526k = new C0526k();
        c0526k.H0(child);
        return AbstractC0836c.m2256b(this, AbstractC0836c.m2258d(c0526k, false), false);
    }

    /* renamed from: e */
    public final Path m1520e() {
        Path path = Paths.get(this.f3586a.m1613r(), new String[0]);
        AbstractC4154l.m8922e(path, "get(...)");
        return path;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && AbstractC4154l.m8918a(((a0) obj).f3586a, this.f3586a);
    }

    /* renamed from: f */
    public final Character m1521f() {
        C0529n c0529n = AbstractC0836c.f5299a;
        C0529n c0529n2 = this.f3586a;
        if (C0529n.m1609g(c0529n2, c0529n) != -1 || c0529n2.mo1563d() < 2 || c0529n2.mo1567i(1) != 58) {
            return null;
        }
        char cMo1567i = (char) c0529n2.mo1567i(0);
        if (('a' > cMo1567i || cMo1567i >= '{') && ('A' > cMo1567i || cMo1567i >= '[')) {
            return null;
        }
        return Character.valueOf(cMo1567i);
    }

    public final int hashCode() {
        return this.f3586a.hashCode();
    }

    public final File toFile() {
        return new File(this.f3586a.m1613r());
    }

    public final String toString() {
        return this.f3586a.m1613r();
    }
}
