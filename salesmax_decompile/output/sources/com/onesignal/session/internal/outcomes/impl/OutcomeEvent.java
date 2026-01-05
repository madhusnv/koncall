package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.session.internal.influence.InfluenceType;
import com.onesignal.session.internal.outcomes.IOutcomeEvent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OutcomeEvent implements IOutcomeEvent {
    public static final Companion Companion = new Companion(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final InfluenceType session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final OutcomeEvent fromOutcomeEventParamstoOutcomeEvent(OutcomeEventParams outcomeEventParams) {
            JSONArray notificationIds;
            sq8.m48649h(outcomeEventParams, "outcomeEventParams");
            InfluenceType influenceType = InfluenceType.UNATTRIBUTED;
            if (outcomeEventParams.getOutcomeSource() != null) {
                OutcomeSource outcomeSource = outcomeEventParams.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    OutcomeSourceBody directBody = outcomeSource.getDirectBody();
                    sq8.m48646e(directBody);
                    if (directBody.getNotificationIds() != null) {
                        OutcomeSourceBody directBody2 = outcomeSource.getDirectBody();
                        sq8.m48646e(directBody2);
                        JSONArray notificationIds2 = directBody2.getNotificationIds();
                        sq8.m48646e(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            influenceType = InfluenceType.DIRECT;
                            OutcomeSourceBody directBody3 = outcomeSource.getDirectBody();
                            sq8.m48646e(directBody3);
                            notificationIds = directBody3.getNotificationIds();
                        } else if (outcomeSource.getIndirectBody() != null) {
                            OutcomeSourceBody indirectBody = outcomeSource.getIndirectBody();
                            sq8.m48646e(indirectBody);
                            if (indirectBody.getNotificationIds() != null) {
                                OutcomeSourceBody indirectBody2 = outcomeSource.getIndirectBody();
                                sq8.m48646e(indirectBody2);
                                JSONArray notificationIds3 = indirectBody2.getNotificationIds();
                                sq8.m48646e(notificationIds3);
                                if (notificationIds3.length() > 0) {
                                    influenceType = InfluenceType.INDIRECT;
                                    OutcomeSourceBody indirectBody3 = outcomeSource.getIndirectBody();
                                    sq8.m48646e(indirectBody3);
                                    notificationIds = indirectBody3.getNotificationIds();
                                } else {
                                    notificationIds = null;
                                }
                            }
                        }
                    }
                }
            }
            return new OutcomeEvent(influenceType, notificationIds, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
        }
    }

    public OutcomeEvent(InfluenceType influenceType, JSONArray jSONArray, String str, long j, long j2, float f) {
        sq8.m48649h(influenceType, "session");
        sq8.m48649h(str, "name");
        this.session = influenceType;
        this.notificationIds = jSONArray;
        this.name = str;
        this.timestamp = j;
        this.sessionTime = j2;
        this.weight = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(OutcomeEvent.class, obj.getClass())) {
            return false;
        }
        OutcomeEvent outcomeEvent = (OutcomeEvent) obj;
        if (getSession() == outcomeEvent.getSession() && sq8.m48644c(getNotificationIds(), outcomeEvent.getNotificationIds()) && sq8.m48644c(getName(), outcomeEvent.getName()) && getTimestamp() == outcomeEvent.getTimestamp() && getSessionTime() == outcomeEvent.getSessionTime()) {
            if (getWeight() == outcomeEvent.getWeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public String getName() {
        return this.name;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public InfluenceType getSession() {
        return this.session;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int iHashCode = 1;
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session", getSession());
        jSONObject.put("notification_ids", getNotificationIds());
        jSONObject.put("id", getName());
        jSONObject.put("timestamp", getTimestamp());
        jSONObject.put("session_time", getSessionTime());
        jSONObject.put("weight", Float.valueOf(getWeight()));
        return jSONObject;
    }

    public String toString() {
        return "OutcomeEvent{session=" + getSession() + ", notificationIds=" + getNotificationIds() + ", name='" + getName() + "', timestamp=" + getTimestamp() + ", sessionTime=" + getSessionTime() + ", weight=" + getWeight() + '}';
    }
}
