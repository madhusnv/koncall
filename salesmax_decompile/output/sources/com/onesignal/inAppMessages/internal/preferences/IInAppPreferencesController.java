package com.onesignal.inAppMessages.internal.preferences;

import java.util.Set;

/* loaded from: classes6.dex */
public interface IInAppPreferencesController {
    void cleanInAppMessageClickedClickIds(Set<String> set);

    void cleanInAppMessageIds(Set<String> set);

    Set<String> getClickedMessagesId();

    Set<String> getDismissedMessagesId();

    Set<String> getImpressionesMessagesId();

    Long getLastTimeInAppDismissed();

    String getSavedIAMs();

    Set<String> getViewPageImpressionedIds();

    void setClickedMessagesId(Set<String> set);

    void setDismissedMessagesId(Set<String> set);

    void setImpressionesMessagesId(Set<String> set);

    void setLastTimeInAppDismissed(Long l);

    void setSavedIAMs(String str);

    void setViewPageImpressionedIds(Set<String> set);
}
