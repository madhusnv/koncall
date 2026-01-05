package com.onesignal.inAppMessages;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IInAppMessagesManager {
    /* renamed from: addClickListener */
    void mo68753addClickListener(IInAppMessageClickListener iInAppMessageClickListener);

    /* renamed from: addLifecycleListener */
    void mo68754addLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener);

    /* renamed from: addTrigger */
    void mo68755addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo68756addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo68757clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo68758removeClickListener(IInAppMessageClickListener iInAppMessageClickListener);

    /* renamed from: removeLifecycleListener */
    void mo68759removeLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener);

    /* renamed from: removeTrigger */
    void mo68760removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo68761removeTriggers(Collection<String> collection);

    void setPaused(boolean z);
}
