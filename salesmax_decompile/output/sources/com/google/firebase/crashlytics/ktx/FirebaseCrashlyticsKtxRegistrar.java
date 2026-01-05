package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import p001o.bh3;

@Keep
/* loaded from: classes4.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return bh3.m18963e(LibraryVersionComponent.create(FirebaseCrashlyticsKt.LIBRARY_NAME, "18.3.1"));
    }
}
