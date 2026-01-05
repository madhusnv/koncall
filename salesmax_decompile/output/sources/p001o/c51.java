package p001o;

import android.opengl.EGLSurface;

/* loaded from: classes2.dex */
public final class c51 extends ngc {

    /* renamed from: a */
    public final EGLSurface f17335a;

    /* renamed from: b */
    public final int f17336b;

    /* renamed from: c */
    public final int f17337c;

    public c51(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f17335a = eGLSurface;
        this.f17336b = i;
        this.f17337c = i2;
    }

    @Override // p001o.ngc
    /* renamed from: a */
    public EGLSurface mo20245a() {
        return this.f17335a;
    }

    @Override // p001o.ngc
    /* renamed from: b */
    public int mo20246b() {
        return this.f17337c;
    }

    @Override // p001o.ngc
    /* renamed from: c */
    public int mo20247c() {
        return this.f17336b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ngc)) {
            return false;
        }
        ngc ngcVar = (ngc) obj;
        return this.f17335a.equals(ngcVar.mo20245a()) && this.f17336b == ngcVar.mo20247c() && this.f17337c == ngcVar.mo20246b();
    }

    public int hashCode() {
        return ((((this.f17335a.hashCode() ^ 1000003) * 1000003) ^ this.f17336b) * 1000003) ^ this.f17337c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f17335a + ", width=" + this.f17336b + ", height=" + this.f17337c + "}";
    }
}
