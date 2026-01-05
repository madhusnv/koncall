package com.onesignal.inAppMessages.internal;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.onesignal.inAppMessages.IInAppMessageClickListener;
import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import java.util.Collection;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class DummyInAppMessagesManager implements IInAppMessagesManager {
    private boolean paused = true;

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addClickListener */
    public void mo68753addClickListener(IInAppMessageClickListener iInAppMessageClickListener) {
        sq8.m48649h(iInAppMessageClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addLifecycleListener */
    public void mo68754addLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
        sq8.m48649h(iInAppMessageLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTrigger */
    public void mo68755addTrigger(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTriggers */
    public void mo68756addTriggers(Map<String, String> map) {
        sq8.m48649h(map, "triggers");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: clearTriggers */
    public void mo68757clearTriggers() {
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public boolean getPaused() {
        return this.paused;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeClickListener */
    public void mo68758removeClickListener(IInAppMessageClickListener iInAppMessageClickListener) {
        sq8.m48649h(iInAppMessageClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeLifecycleListener */
    public void mo68759removeLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
        sq8.m48649h(iInAppMessageLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTrigger */
    public void mo68760removeTrigger(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTriggers */
    public void mo68761removeTriggers(Collection<String> collection) {
        sq8.m48649h(collection, UserMetadata.KEYDATA_FILENAME);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public void setPaused(boolean z) {
        this.paused = z;
    }
}
