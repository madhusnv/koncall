package j3;

import al.C0174b;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.f */
/* loaded from: classes.dex */
public final class C3552f {

    /* renamed from: k */
    public static int f18987k;

    /* renamed from: l */
    public static final C0174b f18988l = new C0174b(18);

    /* renamed from: a */
    public final String f18989a;

    /* renamed from: b */
    public final float f18990b;

    /* renamed from: c */
    public final float f18991c;

    /* renamed from: d */
    public final float f18992d;

    /* renamed from: e */
    public final float f18993e;

    /* renamed from: f */
    public final g0 f18994f;

    /* renamed from: g */
    public final long f18995g;

    /* renamed from: h */
    public final int f18996h;

    /* renamed from: i */
    public final boolean f18997i;

    /* renamed from: j */
    public final int f18998j;

    public C3552f(String str, float f6, float f10, float f11, float f12, g0 g0Var, long j6, int i10, boolean z6) {
        int i11;
        synchronized (f18988l) {
            i11 = f18987k;
            f18987k = i11 + 1;
        }
        this.f18989a = str;
        this.f18990b = f6;
        this.f18991c = f10;
        this.f18992d = f11;
        this.f18993e = f12;
        this.f18994f = g0Var;
        this.f18995g = j6;
        this.f18996h = i10;
        this.f18997i = z6;
        this.f18998j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3552f)) {
            return false;
        }
        C3552f c3552f = (C3552f) obj;
        return AbstractC4154l.m8918a(this.f18989a, c3552f.f18989a) && C6750f.m12935a(this.f18990b, c3552f.f18990b) && C6750f.m12935a(this.f18991c, c3552f.f18991c) && this.f18992d == c3552f.f18992d && this.f18993e == c3552f.f18993e && this.f18994f.equals(c3552f.f18994f) && C1565s.m5187c(this.f18995g, c3552f.f18995g) && this.f18996h == c3552f.f18996h && this.f18997i == c3552f.f18997i;
    }

    public final int hashCode() {
        int iHashCode = (this.f18994f.hashCode() + AbstractC1452a.m4555b(this.f18993e, AbstractC1452a.m4555b(this.f18992d, AbstractC1452a.m4555b(this.f18991c, AbstractC1452a.m4555b(this.f18990b, this.f18989a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = C1565s.f7818k;
        return Boolean.hashCode(this.f18997i) + AbstractC1452a.m4556c(this.f18996h, AbstractC1452a.m4557d(iHashCode, 31, this.f18995g), 31);
    }
}
