package sh;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p011m.C4603a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sh.a */
/* loaded from: classes.dex */
public abstract class AbstractC6844a {

    /* renamed from: a */
    public static final int[] f32506a = {R.attr.theme, com.websoptimization.callyzerbiz.R.attr.theme};

    /* renamed from: b */
    public static final int[] f32507b = {com.websoptimization.callyzerbiz.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m13042a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f32507b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z6 = (context instanceof C4603a) && ((C4603a) context).f22771a == resourceId;
        if (resourceId == 0 || z6) {
            return context;
        }
        C4603a c4603a = new C4603a(context);
        c4603a.f22771a = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f32506a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c4603a.getTheme().applyStyle(resourceId2, true);
        }
        return c4603a;
    }
}
