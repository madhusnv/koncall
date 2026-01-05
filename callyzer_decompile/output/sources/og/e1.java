package og;

import al.C0182j;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import d3.C1555i;
import id.C3238h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import mw.AbstractC4904l;
import mw.C4896d;
import mw.InterfaceC4893a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e1 {
    /* renamed from: a */
    public static final void m10619a(C1555i c1555i, long j6) {
        c1555i.m5156e(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
    }

    /* renamed from: b */
    public static final long m10620b(float f6, double d2) {
        double d10 = f6;
        float fCos = (float) (Math.cos(d2) * d10);
        float fSin = (float) (Math.sin(d2) * d10);
        return (Float.floatToRawIntBits(fSin) & 4294967295L) | (Float.floatToRawIntBits(fCos) << 32);
    }

    /* renamed from: c */
    public static final double m10621c(InterfaceC4893a interfaceC4893a) {
        AbstractC4154l.m8923f(interfaceC4893a, "<this>");
        if (interfaceC4893a instanceof AbstractC4904l) {
            return 0.0d / 0.017453292519943295d;
        }
        if (interfaceC4893a instanceof C4896d) {
            return ((C4896d) interfaceC4893a).f24423a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final double m10622d(InterfaceC4893a interfaceC4893a) {
        AbstractC4154l.m8923f(interfaceC4893a, "<this>");
        if (interfaceC4893a instanceof AbstractC4904l) {
            return 0.0d;
        }
        if (interfaceC4893a instanceof C4896d) {
            return ((C4896d) interfaceC4893a).f24423a * 0.017453292519943295d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public static final C0182j m10623e(C0182j c0182j) {
        if (!AbstractC4154l.m8918a(c0182j.m415f(), "ErrorResponse")) {
            throw new DeserializationException("invalid root, expected <ErrorResponse>; found `" + ((C3238h) c0182j.f555b) + '`');
        }
        C0182j c0182jM418i = c0182j.m418i();
        if (c0182jM418i != null && AbstractC4154l.m8918a(c0182jM418i.m415f(), "Error")) {
            return c0182jM418i;
        }
        StringBuilder sb2 = new StringBuilder("invalid error, expected <Error>; found `");
        sb2.append(c0182jM418i != null ? (C3238h) c0182jM418i.f555b : null);
        sb2.append('`');
        throw new DeserializationException(sb2.toString());
    }
}
