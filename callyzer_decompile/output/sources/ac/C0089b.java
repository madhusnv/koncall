package ac;

import aws.smithy.kotlin.runtime.ClientException;
import ex.InterfaceC2139c;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import rw.AbstractC6662l;
import zc.EnumC8936m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ac.b */
/* loaded from: classes.dex */
public final class C0089b implements InterfaceC2139c {

    /* renamed from: a */
    public static final C0089b f340a = new C0089b();

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        EnumC8936m enumC8936m;
        String strValue = (String) obj;
        AbstractC4154l.m8923f(strValue, "strValue");
        EnumC8936m[] enumC8936mArrValues = EnumC8936m.values();
        int length = enumC8936mArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumC8936m = null;
                break;
            }
            enumC8936m = enumC8936mArrValues[i10];
            if (AbstractC5185w.m10130l(enumC8936m.name(), strValue, true)) {
                break;
            }
            i10++;
        }
        if (enumC8936m != null) {
            return enumC8936m;
        }
        StringBuilder sbM7383p = m0.m7383p("Value ", strValue, " is not supported, should be one of ");
        sbM7383p.append(AbstractC6662l.m12702E(enumC8936mArrValues, ", ", null, 62));
        throw new ClientException(sbM7383p.toString());
    }
}
