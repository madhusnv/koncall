package com.skydoves.balloon;

import android.content.Context;
import com.skydoves.balloon.IconForm;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IconFormKt {
    @IconFormDsl
    public static final /* synthetic */ IconForm iconForm(Context context, InterfaceC2139c block) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(block, "block");
        IconForm.Builder builder = new IconForm.Builder(context);
        block.invoke(builder);
        return builder.build();
    }
}
