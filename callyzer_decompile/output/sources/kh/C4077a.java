package kh;

import android.content.Context;
import android.util.TypedValue;
import com.websoptimization.callyzerbiz.R;
import og.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kh.a */
/* loaded from: classes.dex */
public final class C4077a {

    /* renamed from: a */
    public final boolean f20947a;

    /* renamed from: b */
    public final int f20948b;

    /* renamed from: c */
    public final int f20949c;

    /* renamed from: d */
    public final float f20950d;

    public C4077a(Context context) {
        TypedValue typedValueM11009b = v0.m11009b(context, R.attr.elevationOverlayEnabled);
        this.f20947a = (typedValueM11009b == null || typedValueM11009b.type != 18 || typedValueM11009b.data == 0) ? false : true;
        TypedValue typedValueM11009b2 = v0.m11009b(context, R.attr.elevationOverlayColor);
        this.f20948b = typedValueM11009b2 != null ? typedValueM11009b2.data : 0;
        TypedValue typedValueM11009b3 = v0.m11009b(context, R.attr.colorSurface);
        this.f20949c = typedValueM11009b3 != null ? typedValueM11009b3.data : 0;
        this.f20950d = context.getResources().getDisplayMetrics().density;
    }
}
