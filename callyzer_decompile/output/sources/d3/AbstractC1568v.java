package d3;

import android.graphics.ColorSpace;
import e3.AbstractC1927c;
import e3.C1928d;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.v */
/* loaded from: classes.dex */
public abstract class AbstractC1568v {
    /* renamed from: a */
    public static final ColorSpace m5195a(AbstractC1927c abstractC1927c) {
        if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9124v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9125w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
