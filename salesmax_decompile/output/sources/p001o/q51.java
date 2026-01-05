package p001o;

import android.graphics.Rect;
import android.util.Size;
import p001o.ifg;

/* loaded from: classes2.dex */
public final class q51 extends ifg.AbstractC14281a {

    /* renamed from: a */
    public final Size f41307a;

    /* renamed from: b */
    public final Rect f41308b;

    /* renamed from: c */
    public final v92 f41309c;

    /* renamed from: d */
    public final int f41310d;

    /* renamed from: e */
    public final boolean f41311e;

    public q51(Size size, Rect rect, v92 v92Var, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f41307a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f41308b = rect;
        this.f41309c = v92Var;
        this.f41310d = i;
        this.f41311e = z;
    }

    @Override // p001o.ifg.AbstractC14281a
    /* renamed from: a */
    public v92 mo32080a() {
        return this.f41309c;
    }

    @Override // p001o.ifg.AbstractC14281a
    /* renamed from: b */
    public Rect mo32081b() {
        return this.f41308b;
    }

    @Override // p001o.ifg.AbstractC14281a
    /* renamed from: c */
    public Size mo32082c() {
        return this.f41307a;
    }

    @Override // p001o.ifg.AbstractC14281a
    /* renamed from: d */
    public boolean mo32083d() {
        return this.f41311e;
    }

    @Override // p001o.ifg.AbstractC14281a
    /* renamed from: e */
    public int mo32084e() {
        return this.f41310d;
    }

    public boolean equals(Object obj) {
        v92 v92Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ifg.AbstractC14281a)) {
            return false;
        }
        ifg.AbstractC14281a abstractC14281a = (ifg.AbstractC14281a) obj;
        return this.f41307a.equals(abstractC14281a.mo32082c()) && this.f41308b.equals(abstractC14281a.mo32081b()) && ((v92Var = this.f41309c) != null ? v92Var.equals(abstractC14281a.mo32080a()) : abstractC14281a.mo32080a() == null) && this.f41310d == abstractC14281a.mo32084e() && this.f41311e == abstractC14281a.mo32083d();
    }

    public int hashCode() {
        int iHashCode = (((this.f41307a.hashCode() ^ 1000003) * 1000003) ^ this.f41308b.hashCode()) * 1000003;
        v92 v92Var = this.f41309c;
        return ((((iHashCode ^ (v92Var == null ? 0 : v92Var.hashCode())) * 1000003) ^ this.f41310d) * 1000003) ^ (this.f41311e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f41307a + ", inputCropRect=" + this.f41308b + ", cameraInternal=" + this.f41309c + ", rotationDegrees=" + this.f41310d + ", mirroring=" + this.f41311e + "}";
    }
}
