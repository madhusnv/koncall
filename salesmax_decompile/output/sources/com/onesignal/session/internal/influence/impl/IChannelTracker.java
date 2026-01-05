package com.onesignal.session.internal.influence.impl;

import com.onesignal.session.internal.influence.Influence;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public interface IChannelTracker {
    void cacheState();

    InfluenceChannel getChannelType();

    Influence getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    InfluenceType getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(InfluenceType influenceType);
}
