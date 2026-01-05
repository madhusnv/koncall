package com.onesignal.session.internal.influence.impl;

import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import org.json.JSONArray;
import org.json.JSONException;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationTracker extends ChannelTracker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationTracker(InfluenceDataRepository influenceDataRepository, ITime iTime) {
        super(influenceDataRepository, iTime);
        sq8.m48649h(influenceDataRepository, "dataRepository");
        sq8.m48649h(iTime, "timeProvider");
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public void cacheState() {
        InfluenceDataRepository dataRepository = getDataRepository();
        InfluenceType influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = InfluenceType.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public InfluenceChannel getChannelType() {
        return InfluenceChannel.NOTIFICATION;
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public String getIdTag() {
        return "notification_id";
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e) {
            Logging.error("Generating Notification tracker getLastChannelObjects JSONObject ", e);
            return new JSONArray();
        }
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public void initInfluencedTypeFromCache() {
        InfluenceType notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        Logging.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public void saveChannelObjects(JSONArray jSONArray) {
        sq8.m48649h(jSONArray, "channelObjects");
        getDataRepository().saveNotifications(jSONArray);
    }
}
