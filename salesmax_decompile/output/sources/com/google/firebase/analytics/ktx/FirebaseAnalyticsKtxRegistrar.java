package com.google.firebase.analytics.ktx;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.BuildConfig;
import java.util.List;
import p001o.bh3;

/* loaded from: classes5.dex */
public final class FirebaseAnalyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<Component<?>> getComponents() {
        return bh3.m18963e(LibraryVersionComponent.create(AnalyticsKt.LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
