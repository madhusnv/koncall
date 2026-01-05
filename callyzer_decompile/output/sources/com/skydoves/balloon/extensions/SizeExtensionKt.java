package com.skydoves.balloon.extensions;

import android.content.res.Resources;
import android.graphics.Point;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SizeExtensionKt {
    public static final /* synthetic */ Point getDisplaySize() {
        return new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
    }
}
