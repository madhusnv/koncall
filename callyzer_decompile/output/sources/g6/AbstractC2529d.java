package g6;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g6.d */
/* loaded from: classes.dex */
public abstract class AbstractC2529d {
    /* renamed from: a */
    public static EdgeEffect m6552a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public static float m6553b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return DefinitionKt.NO_Float_VALUE;
        }
    }

    /* renamed from: c */
    public static float m6554c(EdgeEffect edgeEffect, float f6, float f10) {
        try {
            return edgeEffect.onPullDistance(f6, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f10);
            return DefinitionKt.NO_Float_VALUE;
        }
    }
}
