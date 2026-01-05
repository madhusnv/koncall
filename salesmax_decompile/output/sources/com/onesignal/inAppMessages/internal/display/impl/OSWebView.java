package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.webkit.WebView;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OSWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSWebView(Context context) {
        super(context);
        sq8.m48646e(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }
}
