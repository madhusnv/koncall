package iz;

import kotlin.jvm.internal.AbstractC4154l;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.c */
/* loaded from: classes3.dex */
public final class C3370c {

    /* renamed from: n */
    public static final C3370c f17794n = new C3370c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o */
    public static final C3370c f17795o;

    /* renamed from: a */
    public final boolean f17796a;

    /* renamed from: b */
    public final boolean f17797b;

    /* renamed from: c */
    public final int f17798c;

    /* renamed from: d */
    public final int f17799d;

    /* renamed from: e */
    public final boolean f17800e;

    /* renamed from: f */
    public final boolean f17801f;

    /* renamed from: g */
    public final boolean f17802g;

    /* renamed from: h */
    public final int f17803h;

    /* renamed from: i */
    public final int f17804i;

    /* renamed from: j */
    public final boolean f17805j;

    /* renamed from: k */
    public final boolean f17806k;

    /* renamed from: l */
    public final boolean f17807l;

    /* renamed from: m */
    public String f17808m;

    static {
        int i10 = C5770a.f28335d;
        EnumC5772c enumC5772c = EnumC5772c.SECONDS;
        long jM11302m = C5770a.m11302m(bb.m10551g(Integer.MAX_VALUE, enumC5772c), enumC5772c);
        if (jM11302m < 0) {
            throw new IllegalArgumentException(a1.m14330j("maxStale < 0: ", jM11302m).toString());
        }
        f17795o = new C3370c(false, false, -1, -1, false, false, false, jM11302m <= 2147483647L ? (int) jM11302m : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public C3370c(boolean z6, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f17796a = z6;
        this.f17797b = z10;
        this.f17798c = i10;
        this.f17799d = i11;
        this.f17800e = z11;
        this.f17801f = z12;
        this.f17802g = z13;
        this.f17803h = i12;
        this.f17804i = i13;
        this.f17805j = z14;
        this.f17806k = z15;
        this.f17807l = z16;
        this.f17808m = str;
    }

    public final String toString() {
        String str = this.f17808m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f17796a) {
            sb2.append("no-cache, ");
        }
        if (this.f17797b) {
            sb2.append("no-store, ");
        }
        int i10 = this.f17798c;
        if (i10 != -1) {
            sb2.append("max-age=");
            sb2.append(i10);
            sb2.append(", ");
        }
        int i11 = this.f17799d;
        if (i11 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i11);
            sb2.append(", ");
        }
        if (this.f17800e) {
            sb2.append("private, ");
        }
        if (this.f17801f) {
            sb2.append("public, ");
        }
        if (this.f17802g) {
            sb2.append("must-revalidate, ");
        }
        int i12 = this.f17803h;
        if (i12 != -1) {
            sb2.append("max-stale=");
            sb2.append(i12);
            sb2.append(", ");
        }
        int i13 = this.f17804i;
        if (i13 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i13);
            sb2.append(", ");
        }
        if (this.f17805j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f17806k) {
            sb2.append("no-transform, ");
        }
        if (this.f17807l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        AbstractC4154l.m8922e(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        this.f17808m = string;
        return string;
    }
}
