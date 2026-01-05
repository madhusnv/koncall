package pg;

import com.skydoves.balloon.internals.DefinitionKt;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import t1.AbstractC7000y;
import zm.EnumC8991a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ea {
    /* renamed from: a */
    public static final float m11606a(AbstractC7000y abstractC7000y) {
        return abstractC7000y.m13264k().f33855e == k1.x0.Horizontal ? Float.intBitsToFloat((int) (abstractC7000y.m13267o() >> 32)) : Float.intBitsToFloat((int) (abstractC7000y.m13267o() & 4294967295L));
    }

    /* renamed from: b */
    public static final boolean m11607b(AbstractC7000y abstractC7000y, float f6) {
        abstractC7000y.m13264k().getClass();
        return !(((abstractC7000y.m13268p() ? -f6 : m11606a(abstractC7000y)) > DefinitionKt.NO_Float_VALUE ? 1 : ((abstractC7000y.m13268p() ? -f6 : m11606a(abstractC7000y)) == DefinitionKt.NO_Float_VALUE ? 0 : -1)) > 0);
    }

    /* renamed from: c */
    public static final int m11608c(EnumSet enumSet) {
        AbstractC4154l.m8923f(enumSet, "<this>");
        Iterator it = enumSet.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((EnumC8991a) it.next()).getValue();
        }
        return value;
    }
}
