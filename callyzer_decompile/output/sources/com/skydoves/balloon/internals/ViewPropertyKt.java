package com.skydoves.balloon.internals;

import android.view.View;
import aw.C0465e;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ViewPropertyKt {
    public static final /* synthetic */ ViewPropertyDelegate viewProperty(View view, Object obj) {
        AbstractC4154l.m8923f(view, "<this>");
        return new ViewPropertyDelegate(obj, new C0465e(4, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 viewProperty$lambda$0(View view) {
        view.invalidate();
        return a0.f30746a;
    }
}
