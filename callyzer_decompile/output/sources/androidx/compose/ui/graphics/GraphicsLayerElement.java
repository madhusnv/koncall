package androidx.compose.ui.graphics;

import a3.C0045d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import d3.l0;
import d3.m0;
import d3.p0;
import kotlin.jvm.internal.AbstractC4154l;
import v3.AbstractC7634f;
import v3.a1;
import v3.h1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends a1 {

    /* renamed from: a */
    public final float f2108a;

    /* renamed from: b */
    public final float f2109b;

    /* renamed from: c */
    public final float f2110c;

    /* renamed from: d */
    public final float f2111d;

    /* renamed from: e */
    public final float f2112e;

    /* renamed from: f */
    public final long f2113f;

    /* renamed from: g */
    public final l0 f2114g;

    /* renamed from: h */
    public final boolean f2115h;

    /* renamed from: j */
    public final long f2116j;

    /* renamed from: k */
    public final long f2117k;

    public GraphicsLayerElement(float f6, float f10, float f11, float f12, float f13, long j6, l0 l0Var, boolean z6, long j10, long j11) {
        this.f2108a = f6;
        this.f2109b = f10;
        this.f2110c = f11;
        this.f2111d = f12;
        this.f2112e = f13;
        this.f2113f = j6;
        this.f2114g = l0Var;
        this.f2115h = z6;
        this.f2116j = j10;
        this.f2117k = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f2108a, graphicsLayerElement.f2108a) == 0 && Float.compare(this.f2109b, graphicsLayerElement.f2109b) == 0 && Float.compare(this.f2110c, graphicsLayerElement.f2110c) == 0 && Float.compare(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE) == 0 && Float.compare(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE) == 0 && Float.compare(this.f2111d, graphicsLayerElement.f2111d) == 0 && Float.compare(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE) == 0 && Float.compare(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE) == 0 && Float.compare(this.f2112e, graphicsLayerElement.f2112e) == 0 && Float.compare(8.0f, 8.0f) == 0 && p0.m5180a(this.f2113f, graphicsLayerElement.f2113f) && AbstractC4154l.m8918a(this.f2114g, graphicsLayerElement.f2114g) && this.f2115h == graphicsLayerElement.f2115h && C1565s.m5187c(this.f2116j, graphicsLayerElement.f2116j) && C1565s.m5187c(this.f2117k, graphicsLayerElement.f2117k);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        m0 m0Var = new m0();
        m0Var.f7791q = this.f2108a;
        m0Var.f7792r = this.f2109b;
        m0Var.f7793s = this.f2110c;
        m0Var.f7794t = this.f2111d;
        m0Var.f7795v = this.f2112e;
        m0Var.f7796w = 8.0f;
        m0Var.f7797x = this.f2113f;
        m0Var.f7798y = this.f2114g;
        m0Var.f7799z = this.f2115h;
        m0Var.f7788B = this.f2116j;
        m0Var.f7789C = this.f2117k;
        m0Var.f7790D = new C0045d(2, m0Var);
        return m0Var;
    }

    public final int hashCode() {
        int iM4555b = AbstractC1452a.m4555b(8.0f, AbstractC1452a.m4555b(this.f2112e, AbstractC1452a.m4555b(DefinitionKt.NO_Float_VALUE, AbstractC1452a.m4555b(DefinitionKt.NO_Float_VALUE, AbstractC1452a.m4555b(this.f2111d, AbstractC1452a.m4555b(DefinitionKt.NO_Float_VALUE, AbstractC1452a.m4555b(DefinitionKt.NO_Float_VALUE, AbstractC1452a.m4555b(this.f2110c, AbstractC1452a.m4555b(this.f2109b, Float.hashCode(this.f2108a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = p0.f7806c;
        int iM4558e = AbstractC1452a.m4558e((this.f2114g.hashCode() + AbstractC1452a.m4557d(iM4555b, 31, this.f2113f)) * 31, 961, this.f2115h);
        int i11 = C1565s.f7818k;
        return Integer.hashCode(0) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(iM4558e, 31, this.f2116j), 31, this.f2117k);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        m0 m0Var = (m0) abstractC7878q;
        m0Var.f7791q = this.f2108a;
        m0Var.f7792r = this.f2109b;
        m0Var.f7793s = this.f2110c;
        m0Var.f7794t = this.f2111d;
        m0Var.f7795v = this.f2112e;
        m0Var.f7796w = 8.0f;
        m0Var.f7797x = this.f2113f;
        m0Var.f7798y = this.f2114g;
        m0Var.f7799z = this.f2115h;
        m0Var.f7788B = this.f2116j;
        m0Var.f7789C = this.f2117k;
        h1 h1Var = AbstractC7634f.m14561v(m0Var, 2).f36903n;
        if (h1Var != null) {
            h1Var.p1(m0Var.f7790D, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f2108a);
        sb2.append(", scaleY=");
        sb2.append(this.f2109b);
        sb2.append(", alpha=");
        sb2.append(this.f2110c);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f2111d);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f2112e);
        sb2.append(", cameraDistance=8.0, transformOrigin=");
        sb2.append((Object) p0.m5183d(this.f2113f));
        sb2.append(", shape=");
        sb2.append(this.f2114g);
        sb2.append(", clip=");
        sb2.append(this.f2115h);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        i0.m0.m7391x(this.f2116j, ", spotShadowColor=", sb2);
        sb2.append((Object) C1565s.m5193i(this.f2117k));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb2.toString();
    }
}
