package com.onesignal.session.internal.influence.impl;

import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.Influence;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public abstract class ChannelTracker implements IChannelTracker {
    private InfluenceDataRepository dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private InfluenceType influenceType;
    private ITime timeProvider;

    public ChannelTracker(InfluenceDataRepository influenceDataRepository, ITime iTime) {
        sq8.m48649h(influenceDataRepository, "dataRepository");
        sq8.m48649h(iTime, "timeProvider");
        this.dataRepository = influenceDataRepository;
        this.timeProvider = iTime;
    }

    private final boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private final boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private final boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(getClass(), obj.getClass())) {
            return false;
        }
        ChannelTracker channelTracker = (ChannelTracker) obj;
        return getInfluenceType() == channelTracker.getInfluenceType() && sq8.m48644c(channelTracker.getIdTag(), getIdTag());
    }

    public abstract int getChannelLimit();

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public Influence getCurrentSessionInfluence() {
        InfluenceChannel channelType = getChannelType();
        InfluenceType influenceType = InfluenceType.DISABLED;
        Influence influence = new Influence(channelType, influenceType, null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        InfluenceType influenceType2 = getInfluenceType();
        if (influenceType2 != null) {
            influenceType = influenceType2;
        }
        if (influenceType.isDirect()) {
            if (isDirectSessionEnabled()) {
                influence.setIds(new JSONArray().put(getDirectId()));
                influence.setInfluenceType(InfluenceType.DIRECT);
            }
        } else if (influenceType.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                influence.setIds(getIndirectIds());
                influence.setInfluenceType(InfluenceType.INDIRECT);
            }
        } else if (isUnattributedSessionEnabled()) {
            influence.setInfluenceType(InfluenceType.UNATTRIBUTED);
        }
        return influence;
    }

    public final InfluenceDataRepository getDataRepository() {
        return this.dataRepository;
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public String getDirectId() {
        return this.directId;
    }

    public abstract int getIndirectAttributionWindow();

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public InfluenceType getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects();

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public JSONArray getLastReceivedIds() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            Logging.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, null, 2, null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i);
                if (currentTimeMillis - jSONObject.getLong(InfluenceConstants.TIME) <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
        } catch (JSONException e) {
            Logging.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e);
        }
        return jSONArray;
    }

    public int hashCode() {
        InfluenceType influenceType = getInfluenceType();
        return ((influenceType != null ? influenceType.hashCode() : 0) * 31) + getIdTag().hashCode();
    }

    public abstract void initInfluencedTypeFromCache();

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public void resetAndInitInfluence() {
        setDirectId(null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds = getIndirectIds();
        setInfluenceType((indirectIds != null ? indirectIds.length() : 0) > 0 ? InfluenceType.INDIRECT : InfluenceType.UNATTRIBUTED);
        cacheState();
        Logging.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), null, 2, null);
    }

    public abstract void saveChannelObjects(JSONArray jSONArray);

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public void saveLastId(String str) {
        Logging.debug$default("ChannelTracker.saveLastId(id: " + str + "): idTag=" + getIdTag(), null, 2, null);
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            JSONArray lastChannelObjectsReceivedByNewId = getLastChannelObjectsReceivedByNewId(str);
            Logging.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " saveLastId with lastChannelObjectsReceived: " + lastChannelObjectsReceivedByNewId, null, 2, null);
            try {
                lastChannelObjectsReceivedByNewId.put(new JSONObject().put(getIdTag(), str).put(InfluenceConstants.TIME, this.timeProvider.getCurrentTimeMillis()));
                if (lastChannelObjectsReceivedByNewId.length() > getChannelLimit()) {
                    JSONArray jSONArray = new JSONArray();
                    int length = lastChannelObjectsReceivedByNewId.length();
                    for (int length2 = lastChannelObjectsReceivedByNewId.length() - getChannelLimit(); length2 < length; length2++) {
                        try {
                            jSONArray.put(lastChannelObjectsReceivedByNewId.get(length2));
                        } catch (JSONException e) {
                            Logging.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                        }
                    }
                    lastChannelObjectsReceivedByNewId = jSONArray;
                }
                Logging.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, null, 2, null);
                saveChannelObjects(lastChannelObjectsReceivedByNewId);
            } catch (JSONException e2) {
                Logging.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e2);
            }
        }
    }

    public final void setDataRepository(InfluenceDataRepository influenceDataRepository) {
        sq8.m48649h(influenceDataRepository, "<set-?>");
        this.dataRepository = influenceDataRepository;
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public void setDirectId(String str) {
        this.directId = str;
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public void setInfluenceType(InfluenceType influenceType) {
        this.influenceType = influenceType;
    }

    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
