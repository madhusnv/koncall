package h0;

import android.util.Size;
import c0.u1;
import java.util.ArrayList;
import q0.C6063d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h0.a */
/* loaded from: classes.dex */
public final class C2761a {

    /* renamed from: a */
    public u1 f15321a;

    /* renamed from: b */
    public u1 f15322b;

    /* renamed from: c */
    public final u1 f15323c = null;

    /* renamed from: d */
    public final Size f15324d;

    /* renamed from: e */
    public final int f15325e;

    /* renamed from: f */
    public final ArrayList f15326f;

    /* renamed from: g */
    public final boolean f15327g;

    /* renamed from: h */
    public final C6063d f15328h;

    /* renamed from: i */
    public final C6063d f15329i;

    public C2761a(Size size, int i10, ArrayList arrayList, boolean z6, C6063d c6063d, C6063d c6063d2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f15324d = size;
        this.f15325e = i10;
        this.f15326f = arrayList;
        this.f15327g = z6;
        this.f15328h = c6063d;
        this.f15329i = c6063d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2761a)) {
            return false;
        }
        C2761a c2761a = (C2761a) obj;
        return this.f15324d.equals(c2761a.f15324d) && this.f15325e == c2761a.f15325e && this.f15326f.equals(c2761a.f15326f) && this.f15327g == c2761a.f15327g && this.f15328h.equals(c2761a.f15328h) && this.f15329i.equals(c2761a.f15329i);
    }

    public final int hashCode() {
        return ((((((((((this.f15324d.hashCode() ^ 1000003) * 1000003) ^ this.f15325e) * 1000003) ^ this.f15326f.hashCode()) * 1000003) ^ (this.f15327g ? 1231 : 1237)) * 583896283) ^ this.f15328h.hashCode()) * 1000003) ^ this.f15329i.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f15324d + ", inputFormat=" + this.f15325e + ", outputFormats=" + this.f15326f + ", virtualCamera=" + this.f15327g + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.f15328h + ", errorEdge=" + this.f15329i + "}";
    }
}
