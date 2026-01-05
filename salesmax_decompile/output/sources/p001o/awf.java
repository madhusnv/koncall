package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p001o.awf;

/* loaded from: classes2.dex */
public class awf {

    /* renamed from: h */
    public static final Comparator f15316h = new Comparator() { // from class: o.yvf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return awf.m17915g((awf.C12264b) obj, (awf.C12264b) obj2);
        }
    };

    /* renamed from: i */
    public static final Comparator f15317i = new Comparator() { // from class: o.zvf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return awf.m17916h((awf.C12264b) obj, (awf.C12264b) obj2);
        }
    };

    /* renamed from: a */
    public final int f15318a;

    /* renamed from: e */
    public int f15322e;

    /* renamed from: f */
    public int f15323f;

    /* renamed from: g */
    public int f15324g;

    /* renamed from: c */
    public final C12264b[] f15320c = new C12264b[5];

    /* renamed from: b */
    public final ArrayList f15319b = new ArrayList();

    /* renamed from: d */
    public int f15321d = -1;

    /* renamed from: o.awf$b */
    public static class C12264b {

        /* renamed from: a */
        public int f15325a;

        /* renamed from: b */
        public int f15326b;

        /* renamed from: c */
        public float f15327c;

        public C12264b() {
        }
    }

    public awf(int i) {
        this.f15318a = i;
    }

    /* renamed from: g */
    public static /* synthetic */ int m17915g(C12264b c12264b, C12264b c12264b2) {
        return c12264b.f15325a - c12264b2.f15325a;
    }

    /* renamed from: h */
    public static /* synthetic */ int m17916h(C12264b c12264b, C12264b c12264b2) {
        return Float.compare(c12264b.f15327c, c12264b2.f15327c);
    }

    /* renamed from: c */
    public void m17917c(int i, float f) {
        C12264b c12264b;
        m17918d();
        int i2 = this.f15324g;
        if (i2 > 0) {
            C12264b[] c12264bArr = this.f15320c;
            int i3 = i2 - 1;
            this.f15324g = i3;
            c12264b = c12264bArr[i3];
        } else {
            c12264b = new C12264b();
        }
        int i4 = this.f15322e;
        this.f15322e = i4 + 1;
        c12264b.f15325a = i4;
        c12264b.f15326b = i;
        c12264b.f15327c = f;
        this.f15319b.add(c12264b);
        this.f15323f += i;
        while (true) {
            int i5 = this.f15323f;
            int i6 = this.f15318a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            C12264b c12264b2 = (C12264b) this.f15319b.get(0);
            int i8 = c12264b2.f15326b;
            if (i8 <= i7) {
                this.f15323f -= i8;
                this.f15319b.remove(0);
                int i9 = this.f15324g;
                if (i9 < 5) {
                    C12264b[] c12264bArr2 = this.f15320c;
                    this.f15324g = i9 + 1;
                    c12264bArr2[i9] = c12264b2;
                }
            } else {
                c12264b2.f15326b = i8 - i7;
                this.f15323f -= i7;
            }
        }
    }

    /* renamed from: d */
    public final void m17918d() {
        if (this.f15321d != 1) {
            Collections.sort(this.f15319b, f15316h);
            this.f15321d = 1;
        }
    }

    /* renamed from: e */
    public final void m17919e() {
        if (this.f15321d != 0) {
            Collections.sort(this.f15319b, f15317i);
            this.f15321d = 0;
        }
    }

    /* renamed from: f */
    public float m17920f(float f) {
        m17919e();
        float f2 = f * this.f15323f;
        int i = 0;
        for (int i2 = 0; i2 < this.f15319b.size(); i2++) {
            C12264b c12264b = (C12264b) this.f15319b.get(i2);
            i += c12264b.f15326b;
            if (i >= f2) {
                return c12264b.f15327c;
            }
        }
        if (this.f15319b.isEmpty()) {
            return Float.NaN;
        }
        return ((C12264b) this.f15319b.get(r5.size() - 1)).f15327c;
    }

    /* renamed from: i */
    public void m17921i() {
        this.f15319b.clear();
        this.f15321d = -1;
        this.f15322e = 0;
        this.f15323f = 0;
    }
}
