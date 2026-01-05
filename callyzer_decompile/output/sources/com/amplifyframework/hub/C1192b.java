package com.amplifyframework.hub;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.hub.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1192b implements HubEventFilter {

    /* renamed from: a */
    public final /* synthetic */ int f5886a;

    /* renamed from: b */
    public final /* synthetic */ HubEventFilter[] f5887b;

    public /* synthetic */ C1192b(HubEventFilter[] hubEventFilterArr, int i10) {
        this.f5886a = i10;
        this.f5887b = hubEventFilterArr;
    }

    @Override // com.amplifyframework.hub.HubEventFilter
    public final boolean filter(HubEvent hubEvent) {
        switch (this.f5886a) {
            case 0:
                return HubEventFilters.lambda$any$2(this.f5887b, hubEvent);
            default:
                return HubEventFilters.lambda$all$1(this.f5887b, hubEvent);
        }
    }
}
