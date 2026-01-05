package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.sc8;

/* loaded from: classes2.dex */
public final class x51 extends mjg {

    /* renamed from: b */
    public final Executor f53201b;

    /* renamed from: c */
    public final sc8.InterfaceC16802f f53202c;

    /* renamed from: d */
    public final sc8.C16803g f53203d;

    /* renamed from: e */
    public final Rect f53204e;

    /* renamed from: f */
    public final Matrix f53205f;

    /* renamed from: g */
    public final int f53206g;

    /* renamed from: h */
    public final int f53207h;

    /* renamed from: i */
    public final int f53208i;

    /* renamed from: j */
    public final List f53209j;

    public x51(Executor executor, sc8.AbstractC16801e abstractC16801e, sc8.InterfaceC16802f interfaceC16802f, sc8.C16803g c16803g, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f53201b = executor;
        this.f53202c = interfaceC16802f;
        this.f53203d = c16803g;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f53204e = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f53205f = matrix;
        this.f53206g = i;
        this.f53207h = i2;
        this.f53208i = i3;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f53209j = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mjg)) {
            return false;
        }
        mjg mjgVar = (mjg) obj;
        if (this.f53201b.equals(mjgVar.mo39237g())) {
            mjgVar.mo39240j();
            sc8.InterfaceC16802f interfaceC16802f = this.f53202c;
            if (interfaceC16802f != null ? interfaceC16802f.equals(mjgVar.mo39242l()) : mjgVar.mo39242l() == null) {
                sc8.C16803g c16803g = this.f53203d;
                if (c16803g != null ? c16803g.equals(mjgVar.mo39243m()) : mjgVar.mo39243m() == null) {
                    if (this.f53204e.equals(mjgVar.mo39239i()) && this.f53205f.equals(mjgVar.mo39245o()) && this.f53206g == mjgVar.mo39244n() && this.f53207h == mjgVar.mo39241k() && this.f53208i == mjgVar.mo39238h() && this.f53209j.equals(mjgVar.mo39246p())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p001o.mjg
    /* renamed from: g */
    public Executor mo39237g() {
        return this.f53201b;
    }

    @Override // p001o.mjg
    /* renamed from: h */
    public int mo39238h() {
        return this.f53208i;
    }

    public int hashCode() {
        int iHashCode = (((this.f53201b.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        sc8.InterfaceC16802f interfaceC16802f = this.f53202c;
        int iHashCode2 = (iHashCode ^ (interfaceC16802f == null ? 0 : interfaceC16802f.hashCode())) * 1000003;
        sc8.C16803g c16803g = this.f53203d;
        return ((((((((((((iHashCode2 ^ (c16803g != null ? c16803g.hashCode() : 0)) * 1000003) ^ this.f53204e.hashCode()) * 1000003) ^ this.f53205f.hashCode()) * 1000003) ^ this.f53206g) * 1000003) ^ this.f53207h) * 1000003) ^ this.f53208i) * 1000003) ^ this.f53209j.hashCode();
    }

    @Override // p001o.mjg
    /* renamed from: i */
    public Rect mo39239i() {
        return this.f53204e;
    }

    @Override // p001o.mjg
    /* renamed from: j */
    public sc8.AbstractC16801e mo39240j() {
        return null;
    }

    @Override // p001o.mjg
    /* renamed from: k */
    public int mo39241k() {
        return this.f53207h;
    }

    @Override // p001o.mjg
    /* renamed from: l */
    public sc8.InterfaceC16802f mo39242l() {
        return this.f53202c;
    }

    @Override // p001o.mjg
    /* renamed from: m */
    public sc8.C16803g mo39243m() {
        return this.f53203d;
    }

    @Override // p001o.mjg
    /* renamed from: n */
    public int mo39244n() {
        return this.f53206g;
    }

    @Override // p001o.mjg
    /* renamed from: o */
    public Matrix mo39245o() {
        return this.f53205f;
    }

    @Override // p001o.mjg
    /* renamed from: p */
    public List mo39246p() {
        return this.f53209j;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f53201b + ", inMemoryCallback=" + ((Object) null) + ", onDiskCallback=" + this.f53202c + ", outputFileOptions=" + this.f53203d + ", cropRect=" + this.f53204e + ", sensorToBufferTransform=" + this.f53205f + ", rotationDegrees=" + this.f53206g + ", jpegQuality=" + this.f53207h + ", captureMode=" + this.f53208i + ", sessionConfigCameraCaptureCallbacks=" + this.f53209j + "}";
    }
}
