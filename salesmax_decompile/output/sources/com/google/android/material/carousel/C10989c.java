package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001o.gh0;

/* renamed from: com.google.android.material.carousel.c */
/* loaded from: classes3.dex */
public final class C10989c {

    /* renamed from: a */
    public final float f12286a;

    /* renamed from: b */
    public int f12287b;

    /* renamed from: c */
    public final List f12288c;

    /* renamed from: d */
    public final int f12289d;

    /* renamed from: e */
    public final int f12290e;

    /* renamed from: f */
    public final int f12291f;

    /* renamed from: com.google.android.material.carousel.c$b */
    public static final class b {

        /* renamed from: a */
        public final float f12292a;

        /* renamed from: b */
        public final int f12293b;

        /* renamed from: d */
        public c f12295d;

        /* renamed from: e */
        public c f12296e;

        /* renamed from: c */
        public final List f12294c = new ArrayList();

        /* renamed from: f */
        public int f12297f = -1;

        /* renamed from: g */
        public int f12298g = -1;

        /* renamed from: h */
        public float f12299h = 0.0f;

        /* renamed from: i */
        public int f12300i = -1;

        public b(float f, int i) {
            this.f12292a = f;
            this.f12293b = i;
        }

        /* renamed from: j */
        public static float m14319j(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        /* renamed from: a */
        public b m14320a(float f, float f2, float f3) {
            return m14323d(f, f2, f3, false, true);
        }

        /* renamed from: b */
        public b m14321b(float f, float f2, float f3) {
            return m14322c(f, f2, f3, false);
        }

        /* renamed from: c */
        public b m14322c(float f, float f2, float f3, boolean z) {
            return m14323d(f, f2, f3, z, false);
        }

        /* renamed from: d */
        public b m14323d(float f, float f2, float f3, boolean z, boolean z2) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            int i = this.f12293b;
            if (f6 > i) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, i));
            } else {
                fAbs = 0.0f;
                if (f5 < 0.0f) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, 0.0f));
                }
            }
            return m14324e(f, f2, f3, z, z2, fAbs);
        }

        /* renamed from: e */
        public b m14324e(float f, float f2, float f3, boolean z, boolean z2, float f4) {
            return m14325f(f, f2, f3, z, z2, f4, 0.0f, 0.0f);
        }

        /* renamed from: f */
        public b m14325f(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return this;
            }
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.f12300i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f12300i = this.f12294c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.f12295d == null) {
                    this.f12295d = cVar;
                    this.f12297f = this.f12294c.size();
                }
                if (this.f12298g != -1 && this.f12294c.size() - this.f12298g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.f12295d.f12304d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f12296e = cVar;
                this.f12298g = this.f12294c.size();
            } else {
                if (this.f12295d == null && cVar.f12304d < this.f12299h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f12296e != null && cVar.f12304d > this.f12299h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f12299h = cVar.f12304d;
            this.f12294c.add(cVar);
            return this;
        }

        /* renamed from: g */
        public b m14326g(float f, float f2, float f3, int i) {
            return m14327h(f, f2, f3, i, false);
        }

        /* renamed from: h */
        public b m14327h(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    m14322c((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        /* renamed from: i */
        public C10989c m14328i() {
            if (this.f12295d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f12294c.size(); i++) {
                c cVar = (c) this.f12294c.get(i);
                arrayList.add(new c(m14319j(this.f12295d.f12302b, this.f12292a, this.f12297f, i), cVar.f12302b, cVar.f12303c, cVar.f12304d, cVar.f12305e, cVar.f12306f, cVar.f12307g, cVar.f12308h));
            }
            return new C10989c(this.f12292a, arrayList, this.f12297f, this.f12298g, this.f12293b);
        }
    }

    /* renamed from: com.google.android.material.carousel.c$c */
    public static final class c {

        /* renamed from: a */
        public final float f12301a;

        /* renamed from: b */
        public final float f12302b;

        /* renamed from: c */
        public final float f12303c;

        /* renamed from: d */
        public final float f12304d;

        /* renamed from: e */
        public final boolean f12305e;

        /* renamed from: f */
        public final float f12306f;

        /* renamed from: g */
        public final float f12307g;

        /* renamed from: h */
        public final float f12308h;

        public c(float f, float f2, float f3, float f4) {
            this(f, f2, f3, f4, false, 0.0f, 0.0f, 0.0f);
        }

        /* renamed from: a */
        public static c m14329a(c cVar, c cVar2, float f) {
            return new c(gh0.m28647a(cVar.f12301a, cVar2.f12301a, f), gh0.m28647a(cVar.f12302b, cVar2.f12302b, f), gh0.m28647a(cVar.f12303c, cVar2.f12303c, f), gh0.m28647a(cVar.f12304d, cVar2.f12304d, f));
        }

        public c(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.f12301a = f;
            this.f12302b = f2;
            this.f12303c = f3;
            this.f12304d = f4;
            this.f12305e = z;
            this.f12306f = f5;
            this.f12307g = f6;
            this.f12308h = f7;
        }
    }

    /* renamed from: o */
    public static C10989c m14303o(C10989c c10989c, C10989c c10989c2, float f) {
        if (c10989c.m14311g() != c10989c2.m14311g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listM14312h = c10989c.m14312h();
        List listM14312h2 = c10989c2.m14312h();
        if (listM14312h.size() != listM14312h2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c10989c.m14312h().size(); i++) {
            arrayList.add(c.m14329a((c) listM14312h.get(i), (c) listM14312h2.get(i), f));
        }
        return new C10989c(c10989c.m14311g(), arrayList, gh0.m28649c(c10989c.m14307c(), c10989c2.m14307c(), f), gh0.m28649c(c10989c.m14314j(), c10989c2.m14314j(), f), c10989c.f12291f);
    }

    /* renamed from: p */
    public static C10989c m14304p(C10989c c10989c, int i) {
        b bVar = new b(c10989c.m14311g(), i);
        float f = (i - c10989c.m14315k().f12302b) - (c10989c.m14315k().f12304d / 2.0f);
        int size = c10989c.m14312h().size() - 1;
        while (size >= 0) {
            c cVar = (c) c10989c.m14312h().get(size);
            bVar.m14323d(f + (cVar.f12304d / 2.0f), cVar.f12303c, cVar.f12304d, size >= c10989c.m14307c() && size <= c10989c.m14314j(), cVar.f12305e);
            f += cVar.f12304d;
            size--;
        }
        return bVar.m14328i();
    }

    /* renamed from: a */
    public int m14305a() {
        return this.f12291f;
    }

    /* renamed from: b */
    public c m14306b() {
        return (c) this.f12288c.get(this.f12289d);
    }

    /* renamed from: c */
    public int m14307c() {
        return this.f12289d;
    }

    /* renamed from: d */
    public c m14308d() {
        return (c) this.f12288c.get(0);
    }

    /* renamed from: e */
    public c m14309e() {
        for (int i = 0; i < this.f12288c.size(); i++) {
            c cVar = (c) this.f12288c.get(i);
            if (!cVar.f12305e) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public List m14310f() {
        return this.f12288c.subList(this.f12289d, this.f12290e + 1);
    }

    /* renamed from: g */
    public float m14311g() {
        return this.f12286a;
    }

    /* renamed from: h */
    public List m14312h() {
        return this.f12288c;
    }

    /* renamed from: i */
    public c m14313i() {
        return (c) this.f12288c.get(this.f12290e);
    }

    /* renamed from: j */
    public int m14314j() {
        return this.f12290e;
    }

    /* renamed from: k */
    public c m14315k() {
        return (c) this.f12288c.get(r0.size() - 1);
    }

    /* renamed from: l */
    public c m14316l() {
        for (int size = this.f12288c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f12288c.get(size);
            if (!cVar.f12305e) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int m14317m() {
        Iterator it = this.f12288c.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f12305e) {
                i++;
            }
        }
        return this.f12288c.size() - i;
    }

    /* renamed from: n */
    public int m14318n() {
        return this.f12287b;
    }

    public C10989c(float f, List list, int i, int i2, int i3) {
        this.f12286a = f;
        this.f12288c = Collections.unmodifiableList(list);
        this.f12289d = i;
        this.f12290e = i2;
        while (i <= i2) {
            if (((c) list.get(i)).f12306f == 0.0f) {
                this.f12287b++;
            }
            i++;
        }
        this.f12291f = i3;
    }
}
