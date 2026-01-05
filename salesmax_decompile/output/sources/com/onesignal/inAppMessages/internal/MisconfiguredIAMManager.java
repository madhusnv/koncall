package com.onesignal.inAppMessages.internal;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.onesignal.core.internal.minification.KeepStub;
import com.onesignal.inAppMessages.IInAppMessageClickListener;
import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import java.util.Collection;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

@KeepStub
/* loaded from: classes6.dex */
public final class MisconfiguredIAMManager implements IInAppMessagesManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo68756addTriggers(Map map) throws Exception {
        addTriggers((Map<String, String>) map);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public boolean getPaused() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo68761removeTriggers(Collection collection) throws Exception {
        removeTriggers((Collection<String>) collection);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public void setPaused(boolean z) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo68753addClickListener(IInAppMessageClickListener iInAppMessageClickListener) throws Exception {
        sq8.m48649h(iInAppMessageClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo68754addLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) throws Exception {
        sq8.m48649h(iInAppMessageLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo68755addTrigger(String str, String str2) throws Exception {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> map) throws Exception {
        sq8.m48649h(map, "triggers");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo68757clearTriggers() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo68758removeClickListener(IInAppMessageClickListener iInAppMessageClickListener) throws Exception {
        sq8.m48649h(iInAppMessageClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo68759removeLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) throws Exception {
        sq8.m48649h(iInAppMessageLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo68760removeTrigger(String str) throws Exception {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> collection) throws Exception {
        sq8.m48649h(collection, UserMetadata.KEYDATA_FILENAME);
        throw Companion.getEXCEPTION();
    }
}
