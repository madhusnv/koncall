package com.onesignal.user;

import com.onesignal.user.state.IUserStateObserver;
import com.onesignal.user.subscriptions.IPushSubscription;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IUserManager {
    void addAlias(String str, String str2);

    void addAliases(Map<String, String> map);

    void addEmail(String str);

    void addObserver(IUserStateObserver iUserStateObserver);

    void addSms(String str);

    void addTag(String str, String str2);

    void addTags(Map<String, String> map);

    String getExternalId();

    String getOnesignalId();

    IPushSubscription getPushSubscription();

    Map<String, String> getTags();

    void removeAlias(String str);

    void removeAliases(Collection<String> collection);

    void removeEmail(String str);

    void removeObserver(IUserStateObserver iUserStateObserver);

    void removeSms(String str);

    void removeTag(String str);

    void removeTags(Collection<String> collection);

    void setLanguage(String str);
}
