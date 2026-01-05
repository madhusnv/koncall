package com.amplifyframework.kotlin.datastore;

import com.amplifyframework.core.Action;
import com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.kotlin.datastore.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1206b implements Action {

    /* renamed from: a */
    public final /* synthetic */ int f5898a;

    /* renamed from: b */
    public final /* synthetic */ KotlinDataStoreFacade.Observation f5899b;

    public /* synthetic */ C1206b(KotlinDataStoreFacade.Observation observation, int i10) {
        this.f5898a = i10;
        this.f5899b = observation;
    }

    @Override // com.amplifyframework.core.Action
    public final void call() {
        switch (this.f5898a) {
            case 0:
                KotlinDataStoreFacade.observe$lambda$14(this.f5899b);
                break;
            case 1:
                KotlinDataStoreFacade.observe$lambda$6(this.f5899b);
                break;
            case 2:
                KotlinDataStoreFacade.observe$lambda$10(this.f5899b);
                break;
            default:
                KotlinDataStoreFacade.observeQuery$lambda$18(this.f5899b);
                break;
        }
    }
}
