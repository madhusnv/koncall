package com.onesignal.session.internal.influence;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class Influence {
    public static final Companion Companion = new Companion(null);
    public static final String INFLUENCE_CHANNEL = "influence_channel";
    public static final String INFLUENCE_IDS = "influence_ids";
    public static final String INFLUENCE_TYPE = "influence_type";
    private JSONArray ids;
    private InfluenceChannel influenceChannel;
    private InfluenceType influenceType;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public Influence(String str) throws JSONException {
        sq8.m48649h(str, "jsonString");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(INFLUENCE_CHANNEL);
        String string2 = jSONObject.getString(INFLUENCE_TYPE);
        String string3 = jSONObject.getString(INFLUENCE_IDS);
        this.influenceChannel = InfluenceChannel.Companion.fromString(string);
        this.influenceType = InfluenceType.Companion.fromString(string2);
        sq8.m48648g(string3, "ids");
        this.ids = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public final Influence copy() {
        return new Influence(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(Influence.class, obj.getClass())) {
            return false;
        }
        Influence influence = (Influence) obj;
        return this.influenceChannel == influence.influenceChannel && this.influenceType == influence.influenceType;
    }

    public final String getDirectId() {
        JSONArray jSONArray = this.ids;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        return jSONArray.getString(0);
    }

    public final JSONArray getIds() {
        return this.ids;
    }

    public final InfluenceChannel getInfluenceChannel() {
        return this.influenceChannel;
    }

    public final InfluenceType getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        return (this.influenceChannel.hashCode() * 31) + this.influenceType.hashCode();
    }

    public final void setIds(JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(InfluenceType influenceType) {
        sq8.m48649h(influenceType, "<set-?>");
        this.influenceType = influenceType;
    }

    public final String toJSONString() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(INFLUENCE_CHANNEL, this.influenceChannel.toString()).put(INFLUENCE_TYPE, this.influenceType.toString());
        JSONArray jSONArray = this.ids;
        String string = jSONObjectPut.put(INFLUENCE_IDS, jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        sq8.m48648g(string, "JSONObject()\n           …)\n            .toString()");
        return string;
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.influenceChannel + ", influenceType=" + this.influenceType + ", ids=" + this.ids + '}';
    }

    public Influence(InfluenceChannel influenceChannel, InfluenceType influenceType, JSONArray jSONArray) {
        sq8.m48649h(influenceChannel, "influenceChannel");
        sq8.m48649h(influenceType, "influenceType");
        this.influenceChannel = influenceChannel;
        this.influenceType = influenceType;
        this.ids = jSONArray;
    }
}
