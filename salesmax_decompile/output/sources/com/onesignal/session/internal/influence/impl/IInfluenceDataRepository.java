package com.onesignal.session.internal.influence.impl;

import com.onesignal.session.internal.influence.InfluenceType;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public interface IInfluenceDataRepository {
    void cacheIAMInfluenceType(InfluenceType influenceType);

    void cacheNotificationInfluenceType(InfluenceType influenceType);

    void cacheNotificationOpenId(String str);

    String getCachedNotificationOpenId();

    InfluenceType getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    JSONArray getLastIAMsReceivedData();

    JSONArray getLastNotificationsReceivedData();

    InfluenceType getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(JSONArray jSONArray);

    void saveNotifications(JSONArray jSONArray);
}
