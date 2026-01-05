package l7;

import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends j0 {

    /* renamed from: s */
    public final Class f22035s;

    public f0(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f22035s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // l7.j0, l7.k0
    /* renamed from: b */
    public final String mo9204b() {
        return this.f22035s.getName();
    }

    @Override // l7.j0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Enum mo9206d(String value) {
        Object obj;
        AbstractC4154l.m8923f(value, "value");
        Class cls = this.f22035s;
        Object[] enumConstants = cls.getEnumConstants();
        AbstractC4154l.m8922e(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i10];
            if (AbstractC5185w.m10130l(((Enum) obj).name(), value, true)) {
                break;
            }
            i10++;
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder sbM7383p = i0.m0.m7383p("Enum value ", value, " not found for type ");
        sbM7383p.append(cls.getName());
        sbM7383p.append('.');
        throw new IllegalArgumentException(sbM7383p.toString());
    }
}
