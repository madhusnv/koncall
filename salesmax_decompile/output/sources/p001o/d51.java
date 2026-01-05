package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes2.dex */
public final class d51 extends lic {

    /* renamed from: a */
    public final Object f19099a;

    /* renamed from: b */
    public final fm6 f19100b;

    /* renamed from: c */
    public final int f19101c;

    /* renamed from: d */
    public final Size f19102d;

    /* renamed from: e */
    public final Rect f19103e;

    /* renamed from: f */
    public final int f19104f;

    /* renamed from: g */
    public final Matrix f19105g;

    /* renamed from: h */
    public final u72 f19106h;

    public d51(Object obj, fm6 fm6Var, int i, Size size, Rect rect, int i2, Matrix matrix, u72 u72Var) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f19099a = obj;
        this.f19100b = fm6Var;
        this.f19101c = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f19102d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f19103e = rect;
        this.f19104f = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f19105g = matrix;
        if (u72Var == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f19106h = u72Var;
    }

    @Override // p001o.lic
    /* renamed from: a */
    public u72 mo22321a() {
        return this.f19106h;
    }

    @Override // p001o.lic
    /* renamed from: b */
    public Rect mo22322b() {
        return this.f19103e;
    }

    @Override // p001o.lic
    /* renamed from: c */
    public Object mo22323c() {
        return this.f19099a;
    }

    @Override // p001o.lic
    /* renamed from: d */
    public fm6 mo22324d() {
        return this.f19100b;
    }

    @Override // p001o.lic
    /* renamed from: e */
    public int mo22325e() {
        return this.f19101c;
    }

    public boolean equals(Object obj) {
        fm6 fm6Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lic)) {
            return false;
        }
        lic licVar = (lic) obj;
        return this.f19099a.equals(licVar.mo22323c()) && ((fm6Var = this.f19100b) != null ? fm6Var.equals(licVar.mo22324d()) : licVar.mo22324d() == null) && this.f19101c == licVar.mo22325e() && this.f19102d.equals(licVar.mo22328h()) && this.f19103e.equals(licVar.mo22322b()) && this.f19104f == licVar.mo22326f() && this.f19105g.equals(licVar.mo22327g()) && this.f19106h.equals(licVar.mo22321a());
    }

    @Override // p001o.lic
    /* renamed from: f */
    public int mo22326f() {
        return this.f19104f;
    }

    @Override // p001o.lic
    /* renamed from: g */
    public Matrix mo22327g() {
        return this.f19105g;
    }

    @Override // p001o.lic
    /* renamed from: h */
    public Size mo22328h() {
        return this.f19102d;
    }

    public int hashCode() {
        int iHashCode = (this.f19099a.hashCode() ^ 1000003) * 1000003;
        fm6 fm6Var = this.f19100b;
        return ((((((((((((iHashCode ^ (fm6Var == null ? 0 : fm6Var.hashCode())) * 1000003) ^ this.f19101c) * 1000003) ^ this.f19102d.hashCode()) * 1000003) ^ this.f19103e.hashCode()) * 1000003) ^ this.f19104f) * 1000003) ^ this.f19105g.hashCode()) * 1000003) ^ this.f19106h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f19099a + ", exif=" + this.f19100b + ", format=" + this.f19101c + ", size=" + this.f19102d + ", cropRect=" + this.f19103e + ", rotationDegrees=" + this.f19104f + ", sensorToBufferTransform=" + this.f19105g + ", cameraCaptureResult=" + this.f19106h + "}";
    }
}
