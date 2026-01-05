package com.amplifyframework.hub;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubEvent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface HubSubscriber {
    static <T extends HubEvent.Data> HubSubscriber create(final Consumer<T> consumer) {
        return new HubSubscriber() { // from class: com.amplifyframework.hub.e
            @Override // com.amplifyframework.hub.HubSubscriber
            public final void onEvent(HubEvent hubEvent) {
                HubSubscriber.lambda$create$0(consumer, hubEvent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$create$0(Consumer consumer, HubEvent hubEvent) {
        try {
            consumer.accept((HubEvent.Data) hubEvent.getData());
        } catch (Exception unused) {
            hubEvent.getName();
        }
    }

    void onEvent(HubEvent<?> hubEvent);
}
