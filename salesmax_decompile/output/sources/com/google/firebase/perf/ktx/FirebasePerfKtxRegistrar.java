package com.google.firebase.perf.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import p001o.bh3;

@Keep
/* loaded from: classes6.dex */
public final class FirebasePerfKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return bh3.m18963e(LibraryVersionComponent.create(PerformanceKt.LIBRARY_NAME, "20.2.0"));
    }
}
