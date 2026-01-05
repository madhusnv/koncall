package p001o;

import android.util.Size;
import p001o.pd2;

/* loaded from: classes2.dex */
public final class e41 extends pd2.AbstractC16063c {

    /* renamed from: d */
    public final Size f20938d;

    /* renamed from: e */
    public final int f20939e;

    /* renamed from: f */
    public final int f20940f;

    /* renamed from: g */
    public final boolean f20941g;

    /* renamed from: h */
    public final Size f20942h;

    /* renamed from: i */
    public final int f20943i;

    /* renamed from: j */
    public final b36 f20944j;

    /* renamed from: k */
    public final b36 f20945k;

    public e41(Size size, int i, int i2, boolean z, ae8 ae8Var, Size size2, int i3, b36 b36Var, b36 b36Var2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f20938d = size;
        this.f20939e = i;
        this.f20940f = i2;
        this.f20941g = z;
        this.f20942h = size2;
        this.f20943i = i3;
        if (b36Var == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f20944j = b36Var;
        if (b36Var2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f20945k = b36Var2;
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: b */
    public b36 mo24258b() {
        return this.f20945k;
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: c */
    public ae8 mo24259c() {
        return null;
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: d */
    public int mo24260d() {
        return this.f20939e;
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: e */
    public int mo24261e() {
        return this.f20940f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pd2.AbstractC16063c)) {
            return false;
        }
        pd2.AbstractC16063c abstractC16063c = (pd2.AbstractC16063c) obj;
        if (this.f20938d.equals(abstractC16063c.mo24265j()) && this.f20939e == abstractC16063c.mo24260d() && this.f20940f == abstractC16063c.mo24261e() && this.f20941g == abstractC16063c.mo24266l()) {
            abstractC16063c.mo24259c();
            Size size = this.f20942h;
            if (size != null ? size.equals(abstractC16063c.mo24263g()) : abstractC16063c.mo24263g() == null) {
                if (this.f20943i == abstractC16063c.mo24262f() && this.f20944j.equals(abstractC16063c.mo24264i()) && this.f20945k.equals(abstractC16063c.mo24258b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: f */
    public int mo24262f() {
        return this.f20943i;
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: g */
    public Size mo24263g() {
        return this.f20942h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f20938d.hashCode() ^ 1000003) * 1000003) ^ this.f20939e) * 1000003) ^ this.f20940f) * 1000003) ^ (this.f20941g ? 1231 : 1237)) * 1000003) ^ 0) * 1000003;
        Size size = this.f20942h;
        return ((((((iHashCode ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f20943i) * 1000003) ^ this.f20944j.hashCode()) * 1000003) ^ this.f20945k.hashCode();
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: i */
    public b36 mo24264i() {
        return this.f20944j;
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: j */
    public Size mo24265j() {
        return this.f20938d;
    }

    @Override // p001o.pd2.AbstractC16063c
    /* renamed from: l */
    public boolean mo24266l() {
        return this.f20941g;
    }

    public String toString() {
        return "In{size=" + this.f20938d + ", inputFormat=" + this.f20939e + ", outputFormat=" + this.f20940f + ", virtualCamera=" + this.f20941g + ", imageReaderProxyProvider=" + ((Object) null) + ", postviewSize=" + this.f20942h + ", postviewImageFormat=" + this.f20943i + ", requestEdge=" + this.f20944j + ", errorEdge=" + this.f20945k + "}";
    }
}
