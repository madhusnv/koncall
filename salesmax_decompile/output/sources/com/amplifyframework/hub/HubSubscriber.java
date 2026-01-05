package com.amplifyframework.hub;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.hub.HubSubscriber;

/* loaded from: classes5.dex */
public interface HubSubscriber {
    static <T extends HubEvent.Data> HubSubscriber create(final Consumer<T> consumer) {
        return new HubSubscriber() { // from class: o.p58
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
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to cast event data for event type ");
            sb.append(hubEvent.getName());
        }
    }

    void onEvent(HubEvent<?> hubEvent);
}
