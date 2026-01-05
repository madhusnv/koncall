package com.amplifyframework.hub;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.hub.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1193c implements HubEventFilter {

    /* renamed from: a */
    public final /* synthetic */ int f5888a;

    /* renamed from: b */
    public final /* synthetic */ HubEventFilter f5889b;

    /* renamed from: c */
    public final /* synthetic */ HubEventFilter f5890c;

    public /* synthetic */ C1193c(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2, int i10) {
        this.f5888a = i10;
        this.f5889b = hubEventFilter;
        this.f5890c = hubEventFilter2;
    }

    @Override // com.amplifyframework.hub.HubEventFilter
    public final boolean filter(HubEvent hubEvent) {
        switch (this.f5888a) {
            case 0:
                return HubEventFilters.lambda$or$4(this.f5889b, this.f5890c, hubEvent);
            default:
                return HubEventFilters.lambda$and$3(this.f5889b, this.f5890c, hubEvent);
        }
    }
}
