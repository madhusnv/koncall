package ea;

import ac.EnumC0091d;
import ac.EnumC0092e;
import ac.EnumC0093f;
import aws.smithy.kotlin.runtime.ClientException;
import ex.InterfaceC2139c;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ea.e */
/* loaded from: classes.dex */
public final class C1975e implements InterfaceC2139c {

    /* renamed from: b */
    public static final C1975e f9234b = new C1975e(0);

    /* renamed from: c */
    public static final C1975e f9235c = new C1975e(1);

    /* renamed from: d */
    public static final C1975e f9236d = new C1975e(2);

    /* renamed from: a */
    public final /* synthetic */ int f9237a;

    public /* synthetic */ C1975e(int i10) {
        this.f9237a = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        EnumC0093f enumC0093f;
        EnumC0091d enumC0091d;
        EnumC0092e enumC0092e;
        switch (this.f9237a) {
            case 0:
                String strValue = (String) obj;
                AbstractC4154l.m8923f(strValue, "strValue");
                EnumC0093f[] enumC0093fArrValues = EnumC0093f.values();
                int length = enumC0093fArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        enumC0093f = enumC0093fArrValues[i10];
                        if (!AbstractC5185w.m10130l(enumC0093f.name(), strValue, true)) {
                            i10++;
                        }
                    } else {
                        enumC0093f = null;
                    }
                }
                if (enumC0093f != null) {
                    return enumC0093f;
                }
                StringBuilder sbM7383p = m0.m7383p("Value ", strValue, " is not supported, should be one of ");
                sbM7383p.append(AbstractC6662l.m12702E(enumC0093fArrValues, ", ", null, 62));
                throw new ClientException(sbM7383p.toString());
            case 1:
                String strValue2 = (String) obj;
                AbstractC4154l.m8923f(strValue2, "strValue");
                EnumC0091d[] enumC0091dArrValues = EnumC0091d.values();
                int length2 = enumC0091dArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        enumC0091d = enumC0091dArrValues[i11];
                        if (!AbstractC5185w.m10130l(enumC0091d.name(), strValue2, true)) {
                            i11++;
                        }
                    } else {
                        enumC0091d = null;
                    }
                }
                if (enumC0091d != null) {
                    return enumC0091d;
                }
                StringBuilder sbM7383p2 = m0.m7383p("Value ", strValue2, " is not supported, should be one of ");
                sbM7383p2.append(AbstractC6662l.m12702E(enumC0091dArrValues, ", ", null, 62));
                throw new ClientException(sbM7383p2.toString());
            default:
                String strValue3 = (String) obj;
                AbstractC4154l.m8923f(strValue3, "strValue");
                EnumC0092e[] enumC0092eArrValues = EnumC0092e.values();
                int length3 = enumC0092eArrValues.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length3) {
                        enumC0092e = enumC0092eArrValues[i12];
                        if (!AbstractC5185w.m10130l(enumC0092e.name(), strValue3, true)) {
                            i12++;
                        }
                    } else {
                        enumC0092e = null;
                    }
                }
                if (enumC0092e != null) {
                    return enumC0092e;
                }
                StringBuilder sbM7383p3 = m0.m7383p("Value ", strValue3, " is not supported, should be one of ");
                sbM7383p3.append(AbstractC6662l.m12702E(enumC0092eArrValues, ", ", null, 62));
                throw new ClientException(sbM7383p3.toString());
        }
    }
}
