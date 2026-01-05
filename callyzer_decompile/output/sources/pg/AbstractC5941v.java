package pg;

import ex.InterfaceC2139c;
import fy.InterfaceC2401a;
import hy.AbstractC3054e;
import hy.C3050a;
import hy.C3056g;
import hy.C3060k;
import hy.InterfaceC3055f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5179q;
import p2.C5796h;
import rw.AbstractC6662l;
import sw.C6960d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.v */
/* loaded from: classes.dex */
public abstract class AbstractC5941v {
    /* renamed from: a */
    public static final jy.t0 m11887a(String str, AbstractC3054e abstractC3054e) {
        if (AbstractC5178p.m10101L(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((C5796h) jy.u0.f19971a.values()).iterator();
        while (((c6.k0) it).hasNext()) {
            InterfaceC2401a interfaceC2401a = (InterfaceC2401a) ((C6960d) it).next();
            if (str.equals(interfaceC2401a.getDescriptor().mo7277a())) {
                StringBuilder sbM7383p = i0.m0.m7383p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM7383p.append(kotlin.jvm.internal.a0.m8901a(interfaceC2401a.getClass()).m8914c());
                sbM7383p.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(AbstractC5179q.m10122d(sbM7383p.toString()));
            }
        }
        return new jy.t0(str, abstractC3054e);
    }

    /* renamed from: b */
    public static final C3056g m11888b(String serialName, AbstractC5942w abstractC5942w, InterfaceC3055f[] interfaceC3055fArr, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(serialName, "serialName");
        if (AbstractC5178p.m10101L(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC5942w.equals(C3060k.f16413b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C3050a c3050a = new C3050a(serialName);
        interfaceC2139c.invoke(c3050a);
        return new C3056g(serialName, abstractC5942w, c3050a.f16382c.size(), AbstractC6662l.m12708K(interfaceC3055fArr), c3050a);
    }

    /* renamed from: c */
    public static C3056g m11889c(String serialName, AbstractC5942w abstractC5942w, InterfaceC3055f[] interfaceC3055fArr) {
        AbstractC4154l.m8923f(serialName, "serialName");
        if (AbstractC5178p.m10101L(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC5942w.equals(C3060k.f16413b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C3050a c3050a = new C3050a(serialName);
        return new C3056g(serialName, abstractC5942w, c3050a.f16382c.size(), AbstractC6662l.m12708K(interfaceC3055fArr), c3050a);
    }

    /* renamed from: d */
    public static final float m11890d(float f6) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f6) & 8589934591L) / 3)) + 709952852);
        float f10 = fIntBitsToFloat - ((fIntBitsToFloat - (f6 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f10 - ((f10 - (f6 / (f10 * f10))) * 0.33333334f);
    }

    /* renamed from: e */
    public static final float m11891e(float f6, float f10, float f11) {
        return (f11 * f10) + ((1 - f11) * f6);
    }

    /* renamed from: f */
    public static final int m11892f(float f6, int i10, int i11) {
        return i10 + ((int) Math.round((i11 - i10) * f6));
    }
}
