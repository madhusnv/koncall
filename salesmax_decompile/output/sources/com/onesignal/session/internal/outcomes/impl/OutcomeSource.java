package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class OutcomeSource {
    private OutcomeSourceBody directBody;
    private OutcomeSourceBody indirectBody;

    public OutcomeSource(OutcomeSourceBody outcomeSourceBody, OutcomeSourceBody outcomeSourceBody2) {
        this.directBody = outcomeSourceBody;
        this.indirectBody = outcomeSourceBody2;
    }

    public final OutcomeSourceBody getDirectBody() {
        return this.directBody;
    }

    public final OutcomeSourceBody getIndirectBody() {
        return this.indirectBody;
    }

    /* renamed from: setDirectBody, reason: collision with other method in class */
    public final void m68781setDirectBody(OutcomeSourceBody outcomeSourceBody) {
        this.directBody = outcomeSourceBody;
    }

    /* renamed from: setIndirectBody, reason: collision with other method in class */
    public final void m68782setIndirectBody(OutcomeSourceBody outcomeSourceBody) {
        this.indirectBody = outcomeSourceBody;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        OutcomeSourceBody outcomeSourceBody = this.directBody;
        if (outcomeSourceBody != null) {
            jSONObject.put("direct", outcomeSourceBody.toJSONObject());
        }
        OutcomeSourceBody outcomeSourceBody2 = this.indirectBody;
        if (outcomeSourceBody2 != null) {
            jSONObject.put("indirect", outcomeSourceBody2.toJSONObject());
        }
        return jSONObject;
    }

    public String toString() {
        return "OutcomeSource{directBody=" + this.directBody + ", indirectBody=" + this.indirectBody + '}';
    }

    public final OutcomeSource setDirectBody(OutcomeSourceBody outcomeSourceBody) {
        this.directBody = outcomeSourceBody;
        return this;
    }

    public final OutcomeSource setIndirectBody(OutcomeSourceBody outcomeSourceBody) {
        this.indirectBody = outcomeSourceBody;
        return this;
    }
}
