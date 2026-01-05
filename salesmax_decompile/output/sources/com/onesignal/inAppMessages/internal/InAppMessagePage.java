package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public class InAppMessagePage {
    public static final Companion Companion = new Companion(null);
    public static final String PAGE_ID = "pageId";
    public static final String PAGE_INDEX = "pageIndex";
    private String pageId;
    private String pageIndex;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public InAppMessagePage(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "jsonObject");
        this.pageId = jSONObject.optString(PAGE_ID, null);
        this.pageIndex = jSONObject.optString(PAGE_INDEX, null);
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getPageIndex() {
        return this.pageIndex;
    }

    public final void setPageId(String str) {
        this.pageId = str;
    }

    public final void setPageIndex(String str) {
        this.pageIndex = str;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PAGE_ID, this.pageId);
            jSONObject.put(PAGE_INDEX, this.pageIndex);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
