package d3;

import a3.C0045d;
import aq.C0408k;
import rw.C6669s;
import t3.w0;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: B */
    public long f7788B;

    /* renamed from: C */
    public long f7789C;

    /* renamed from: D */
    public C0045d f7790D;

    /* renamed from: q */
    public float f7791q;

    /* renamed from: r */
    public float f7792r;

    /* renamed from: s */
    public float f7793s;

    /* renamed from: t */
    public float f7794t;

    /* renamed from: v */
    public float f7795v;

    /* renamed from: w */
    public float f7796w;

    /* renamed from: x */
    public long f7797x;

    /* renamed from: y */
    public l0 f7798y;

    /* renamed from: z */
    public boolean f7799z;

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        w0 w0VarMo13314z = i0Var.mo13314z(j6);
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0408k(4, w0VarMo13314z, this));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f7791q);
        sb2.append(", scaleY=");
        sb2.append(this.f7792r);
        sb2.append(", alpha = ");
        sb2.append(this.f7793s);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f7794t);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f7795v);
        sb2.append(", cameraDistance=");
        sb2.append(this.f7796w);
        sb2.append(", transformOrigin=");
        sb2.append((Object) p0.m5183d(this.f7797x));
        sb2.append(", shape=");
        sb2.append(this.f7798y);
        sb2.append(", clip=");
        sb2.append(this.f7799z);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        i0.m0.m7391x(this.f7788B, ", spotShadowColor=", sb2);
        sb2.append((Object) C1565s.m5193i(this.f7789C));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb2.toString();
    }
}
