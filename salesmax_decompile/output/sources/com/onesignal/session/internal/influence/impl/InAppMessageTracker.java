package com.onesignal.session.internal.influence.impl;

import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import org.json.JSONArray;
import org.json.JSONException;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppMessageTracker extends ChannelTracker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageTracker(InfluenceDataRepository influenceDataRepository, ITime iTime) {
        super(influenceDataRepository, iTime);
        sq8.m48649h(influenceDataRepository, "dataRepository");
        sq8.m48649h(iTime, "timeProvider");
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public void cacheState() {
        InfluenceType influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = InfluenceType.UNATTRIBUTED;
        }
        InfluenceDataRepository dataRepository = getDataRepository();
        if (influenceType == InfluenceType.DIRECT) {
            influenceType = InfluenceType.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public InfluenceChannel getChannelType() {
        return InfluenceChannel.IAM;
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public String getIdTag() {
        return InfluenceConstants.IAM_ID_TAG;
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i = 0; i < length; i++) {
                    if (!sq8.m48644c(str, lastChannelObjects.getJSONObject(i).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i));
                    }
                }
                return jSONArray;
            } catch (JSONException e) {
                Logging.error("Generating tracker lastChannelObjectReceived get JSONObject ", e);
                return lastChannelObjects;
            }
        } catch (JSONException e2) {
            Logging.error("Generating IAM tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public void initInfluencedTypeFromCache() {
        InfluenceType iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        Logging.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public void saveChannelObjects(JSONArray jSONArray) {
        sq8.m48649h(jSONArray, "channelObjects");
        getDataRepository().saveIAMs(jSONArray);
    }
}
