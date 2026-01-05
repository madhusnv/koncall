package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import p001o.bh3;

@Keep
/* loaded from: classes5.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return bh3.m18963e(LibraryVersionComponent.create(LoggingKt.LIBRARY_NAME, com.google.firebase.BuildConfig.VERSION_NAME));
    }
}
