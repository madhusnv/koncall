package com.amplifyframework.core.category;

import com.amplifyframework.core.category.CategoryInitializationResult;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.core.category.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1184a implements CategoryInitializationResult.PluginCriteria {

    /* renamed from: a */
    public final /* synthetic */ int f5876a;

    public /* synthetic */ C1184a(int i10) {
        this.f5876a = i10;
    }

    @Override // com.amplifyframework.core.category.CategoryInitializationResult.PluginCriteria
    public final boolean appliesTo(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        switch (this.f5876a) {
            case 0:
                return CategoryInitializationResult.lambda$getFailedPlugins$0(entry);
            default:
                return CategoryInitializationResult.lambda$getSuccessfulPlugins$1(entry);
        }
    }
}
