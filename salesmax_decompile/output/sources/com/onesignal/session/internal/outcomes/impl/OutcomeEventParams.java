package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OutcomeEventParams {
    private final String outcomeId;
    private final OutcomeSource outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public OutcomeEventParams(String str, OutcomeSource outcomeSource, float f, long j, long j2) {
        sq8.m48649h(str, "outcomeId");
        this.outcomeId = str;
        this.outcomeSource = outcomeSource;
        this.weight = f;
        this.sessionTime = j;
        this.timestamp = j2;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final OutcomeSource getOutcomeSource() {
        return this.outcomeSource;
    }

    public final long getSessionTime() {
        return this.sessionTime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnattributed() {
        OutcomeSource outcomeSource = this.outcomeSource;
        return outcomeSource == null || (outcomeSource.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null);
    }

    public final void setSessionTime(long j) {
        this.sessionTime = j;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(OutcomeConstants.OUTCOME_ID, this.outcomeId);
        OutcomeSource outcomeSource = this.outcomeSource;
        if (outcomeSource != null) {
            jSONObjectPut.put(OutcomeConstants.OUTCOME_SOURCES, outcomeSource.toJSONObject());
        }
        float f = this.weight;
        if (f > 0.0f) {
            jSONObjectPut.put("weight", Float.valueOf(f));
        }
        long j = this.timestamp;
        if (j > 0) {
            jSONObjectPut.put("timestamp", j);
        }
        long j2 = this.sessionTime;
        if (j2 > 0) {
            jSONObjectPut.put("session_time", j2);
        }
        sq8.m48648g(jSONObjectPut, "json");
        return jSONObjectPut;
    }

    public String toString() {
        return "OutcomeEventParams{outcomeId='" + this.outcomeId + "', outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + ", sessionTime=" + this.sessionTime + '}';
    }
}
