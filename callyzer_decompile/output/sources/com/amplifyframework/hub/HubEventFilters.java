package com.amplifyframework.hub;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HubEventFilters {
    private HubEventFilters() {
        throw new UnsupportedOperationException("No instances of the HubEventFilters utility, please.");
    }

    public static HubEventFilter all(HubEventFilter... hubEventFilterArr) {
        return new C1192b(hubEventFilterArr, 1);
    }

    public static HubEventFilter always() {
        return new C1194d();
    }

    public static HubEventFilter and(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2) {
        Objects.requireNonNull(hubEventFilter);
        Objects.requireNonNull(hubEventFilter2);
        return new C1193c(hubEventFilter, hubEventFilter2, 1);
    }

    public static HubEventFilter any(HubEventFilter... hubEventFilterArr) {
        return new C1192b(hubEventFilterArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$all$1(HubEventFilter[] hubEventFilterArr, HubEvent hubEvent) {
        boolean zFilter = true;
        for (HubEventFilter hubEventFilter : hubEventFilterArr) {
            if (hubEventFilter != null) {
                zFilter &= hubEventFilter.filter(hubEvent);
            }
        }
        return zFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$always$0(HubEvent hubEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$and$3(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2, HubEvent hubEvent) {
        return hubEventFilter.filter(hubEvent) && hubEventFilter2.filter(hubEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$any$2(HubEventFilter[] hubEventFilterArr, HubEvent hubEvent) {
        boolean zFilter = false;
        for (HubEventFilter hubEventFilter : hubEventFilterArr) {
            if (hubEventFilter != null) {
                zFilter |= hubEventFilter.filter(hubEvent);
            }
        }
        return zFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$or$4(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2, HubEvent hubEvent) {
        return hubEventFilter.filter(hubEvent) || hubEventFilter2.filter(hubEvent);
    }

    public static HubEventFilter or(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2) {
        Objects.requireNonNull(hubEventFilter);
        Objects.requireNonNull(hubEventFilter2);
        return new C1193c(hubEventFilter, hubEventFilter2, 0);
    }
}
