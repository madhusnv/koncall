package h4;

import android.text.Layout;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.p */
/* loaded from: classes.dex */
public abstract class AbstractC2839p {

    /* renamed from: a */
    public static final Layout.Alignment f15824a;

    /* renamed from: b */
    public static final Layout.Alignment f15825b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC4154l.m8918a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC4154l.m8918a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f15824a = alignment;
        f15825b = alignment2;
    }
}
