package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppMessageOutcome {
    public static final Companion Companion = new Companion(null);
    private static final String OUTCOME_NAME = "name";
    private static final String OUTCOME_UNIQUE = "unique";
    private static final String OUTCOME_WEIGHT = "weight";
    private boolean isUnique;
    private String name;
    private float weight;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public InAppMessageOutcome(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "json");
        String string = jSONObject.getString("name");
        sq8.m48648g(string, "json.getString(OUTCOME_NAME)");
        this.name = string;
        this.weight = jSONObject.has("weight") ? (float) jSONObject.getDouble("weight") : 0.0f;
        this.isUnique = jSONObject.has(OUTCOME_UNIQUE) && jSONObject.getBoolean(OUTCOME_UNIQUE);
    }

    public final String getName() {
        return this.name;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnique() {
        return this.isUnique;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.name = str;
    }

    public final void setUnique(boolean z) {
        this.isUnique = z;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.name);
            jSONObject.put("weight", this.weight);
            jSONObject.put(OUTCOME_UNIQUE, this.isUnique);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.name + "', weight=" + this.weight + ", unique=" + this.isUnique + '}';
    }
}
