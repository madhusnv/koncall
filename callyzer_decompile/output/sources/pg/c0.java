package pg;

import androidx.compose.foundation.BorderModifierNodeElement;
import com.skydoves.balloon.internals.DefinitionKt;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a */
    public static final /* synthetic */ int f28808a = 0;

    /* renamed from: a */
    public static final InterfaceC7879r m11560a(InterfaceC7879r interfaceC7879r, float f6, long j6, d3.l0 l0Var) {
        return m11561b(interfaceC7879r, f6, new d3.n0(j6), l0Var);
    }

    /* renamed from: b */
    public static final InterfaceC7879r m11561b(InterfaceC7879r interfaceC7879r, float f6, d3.n0 n0Var, d3.l0 l0Var) {
        return interfaceC7879r.mo14852e(new BorderModifierNodeElement(f6, n0Var, l0Var));
    }

    /* renamed from: c */
    public static final long m11562c(float f6, long j6) {
        float fMax = Math.max(DefinitionKt.NO_Float_VALUE, Float.intBitsToFloat((int) (j6 >> 32)) - f6);
        float fMax2 = Math.max(DefinitionKt.NO_Float_VALUE, Float.intBitsToFloat((int) (j6 & 4294967295L)) - f6);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }
}
