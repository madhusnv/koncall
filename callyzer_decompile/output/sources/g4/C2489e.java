package g4;

import java.util.ArrayList;
import java.util.List;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.e */
/* loaded from: classes.dex */
public final class C2489e implements Appendable {

    /* renamed from: a */
    public final StringBuilder f13569a;

    /* renamed from: b */
    public final ArrayList f13570b;

    /* renamed from: c */
    public final ArrayList f13571c;

    public C2489e() {
        this.f13569a = new StringBuilder(16);
        this.f13570b = new ArrayList();
        this.f13571c = new ArrayList();
        new ArrayList();
    }

    /* renamed from: a */
    public final void m6421a(int i10, int i11) {
        this.f13571c.add(new C2488d(new i0(""), i10, i11, "URL"));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C2492h) {
            m6422b((C2492h) charSequence);
            return this;
        }
        this.f13569a.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final void m6422b(C2492h c2492h) {
        StringBuilder sb2 = this.f13569a;
        int length = sb2.length();
        sb2.append(c2492h.f13620b);
        List list = c2492h.f13619a;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2490f c2490f = (C2490f) list.get(i10);
                this.f13571c.add(new C2488d(c2490f.f13595a, c2490f.f13596b + length, c2490f.f13597c + length, c2490f.f13598d));
            }
        }
    }

    /* renamed from: c */
    public final void m6423c(String str) {
        this.f13569a.append(str);
    }

    /* renamed from: d */
    public final void m6424d() {
        ArrayList arrayList = this.f13570b;
        if (arrayList.isEmpty()) {
            AbstractC4646a.m9526b("Nothing to pop.");
        }
        ((C2488d) arrayList.remove(arrayList.size() - 1)).f13565c = this.f13569a.length();
    }

    /* renamed from: e */
    public final void m6425e(int i10) {
        ArrayList arrayList = this.f13570b;
        if (i10 >= arrayList.size()) {
            AbstractC4646a.m9526b(i10 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i10) {
            m6424d();
        }
    }

    /* renamed from: f */
    public final void m6426f(String str, String str2) {
        C2488d c2488d = new C2488d(new i0(str2), this.f13569a.length(), 0, str, 4);
        ArrayList arrayList = this.f13570b;
        arrayList.add(c2488d);
        this.f13571c.add(c2488d);
        arrayList.size();
    }

    /* renamed from: g */
    public final int m6427g(g0 g0Var) {
        C2488d c2488d = new C2488d(g0Var, this.f13569a.length(), 0, null, 12);
        this.f13570b.add(c2488d);
        this.f13571c.add(c2488d);
        return r7.size() - 1;
    }

    /* renamed from: h */
    public final C2492h m6428h() {
        StringBuilder sb2 = this.f13569a;
        String string = sb2.toString();
        ArrayList arrayList = this.f13571c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((C2488d) arrayList.get(i10)).m6420a(sb2.length()));
        }
        return new C2492h(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        boolean z6 = charSequence instanceof C2492h;
        StringBuilder sb2 = this.f13569a;
        if (z6) {
            C2492h c2492h = (C2492h) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) c2492h.f13620b, i10, i11);
            List listM6441a = AbstractC2494j.m6441a(c2492h, i10, i11, null);
            if (listM6441a != null) {
                int size = listM6441a.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C2490f c2490f = (C2490f) listM6441a.get(i12);
                    this.f13571c.add(new C2488d(c2490f.f13595a, c2490f.f13596b + length, c2490f.f13597c + length, c2490f.f13598d));
                }
            }
            return this;
        }
        sb2.append(charSequence, i10, i11);
        return this;
    }

    public C2489e(C2492h c2492h) {
        this();
        m6422b(c2492h);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        this.f13569a.append(c2);
        return this;
    }
}
