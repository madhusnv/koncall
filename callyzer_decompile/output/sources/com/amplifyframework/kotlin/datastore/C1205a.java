package com.amplifyframework.kotlin.datastore;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.amplifyframework.datastore.DataStoreQuerySnapshot;
import com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.kotlin.datastore.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1205a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f5896a;

    /* renamed from: b */
    public final /* synthetic */ KotlinDataStoreFacade.Observation f5897b;

    public /* synthetic */ C1205a(KotlinDataStoreFacade.Observation observation, int i10) {
        this.f5896a = i10;
        this.f5897b = observation;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        switch (this.f5896a) {
            case 0:
                KotlinDataStoreFacade.observe$lambda$7(this.f5897b, (Cancelable) obj);
                break;
            case 1:
                KotlinDataStoreFacade.observe$lambda$13(this.f5897b, (DataStoreException) obj);
                break;
            case 2:
                KotlinDataStoreFacade.observe$lambda$3(this.f5897b, (Cancelable) obj);
                break;
            case 3:
                KotlinDataStoreFacade.observe$lambda$4(this.f5897b, (DataStoreItemChange) obj);
                break;
            case 4:
                KotlinDataStoreFacade.observe$lambda$5(this.f5897b, (DataStoreException) obj);
                break;
            case 5:
                KotlinDataStoreFacade.observe$lambda$8(this.f5897b, (DataStoreItemChange) obj);
                break;
            case 6:
                KotlinDataStoreFacade.observe$lambda$9(this.f5897b, (DataStoreException) obj);
                break;
            case 7:
                KotlinDataStoreFacade.observeQuery$lambda$15(this.f5897b, (Cancelable) obj);
                break;
            case 8:
                KotlinDataStoreFacade.observeQuery$lambda$16(this.f5897b, (DataStoreQuerySnapshot) obj);
                break;
            case 9:
                KotlinDataStoreFacade.observeQuery$lambda$17(this.f5897b, (DataStoreException) obj);
                break;
            case 10:
                KotlinDataStoreFacade.observe$lambda$11(this.f5897b, (Cancelable) obj);
                break;
            default:
                KotlinDataStoreFacade.observe$lambda$12(this.f5897b, (DataStoreItemChange) obj);
                break;
        }
    }
}
