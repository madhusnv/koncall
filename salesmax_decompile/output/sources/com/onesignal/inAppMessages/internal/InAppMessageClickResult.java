package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.IInAppMessageClickResult;
import com.onesignal.inAppMessages.InAppMessageActionUrlType;
import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppMessageClickResult implements IInAppMessageClickResult {
    private static final String CLICK_NAME = "click_name";
    private static final String CLICK_URL = "click_url";
    private static final String CLOSE = "close";
    private static final String CLOSES_MESSAGE = "closes_message";
    public static final Companion Companion = new Companion(null);
    private static final String FIRST_CLICK = "first_click";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String OUTCOMES = "outcomes";
    private static final String PAGE_ID = "pageId";
    private static final String PROMPTS = "prompts";
    private static final String TAGS = "tags";
    private static final String URL = "url";
    private static final String URL_TARGET = "url_target";
    private final String actionId;
    private final String clickId;
    private final boolean closingMessage;
    private boolean isFirstClick;
    private final List<InAppMessageOutcome> outcomes;
    private final String pageId;
    private final List<InAppMessagePrompt> prompts;
    private InAppMessageTag tags;
    private final String url;
    private InAppMessageActionUrlType urlTarget;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public InAppMessageClickResult(JSONObject jSONObject, IInAppMessagePromptFactory iInAppMessagePromptFactory) throws JSONException {
        sq8.m48649h(jSONObject, "json");
        sq8.m48649h(iInAppMessagePromptFactory, "promptFactory");
        this.outcomes = new ArrayList();
        this.prompts = new ArrayList();
        this.clickId = jSONObject.optString("id", null);
        this.actionId = jSONObject.optString("name", null);
        this.url = jSONObject.optString("url", null);
        this.pageId = jSONObject.optString("pageId", null);
        setUrlTarget(InAppMessageActionUrlType.Companion.fromString(jSONObject.optString(URL_TARGET, null)));
        if (getUrlTarget() == null) {
            setUrlTarget(InAppMessageActionUrlType.IN_APP_WEBVIEW);
        }
        this.closingMessage = jSONObject.optBoolean(CLOSE, true);
        if (jSONObject.has(OUTCOMES)) {
            parseOutcomes(jSONObject);
        }
        if (jSONObject.has(TAGS)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(TAGS);
            sq8.m48648g(jSONObject2, "json.getJSONObject(TAGS)");
            this.tags = new InAppMessageTag(jSONObject2);
        }
        if (jSONObject.has(PROMPTS)) {
            parsePrompts(jSONObject, iInAppMessagePromptFactory);
        }
    }

    private final void parseOutcomes(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(OUTCOMES);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            List<InAppMessageOutcome> list = this.outcomes;
            Object obj = jSONArray.get(i);
            sq8.m48647f(obj, "null cannot be cast to non-null type org.json.JSONObject");
            list.add(new InAppMessageOutcome((JSONObject) obj));
        }
    }

    private final void parsePrompts(JSONObject jSONObject, IInAppMessagePromptFactory iInAppMessagePromptFactory) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(PROMPTS);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            sq8.m48648g(string, "promptType");
            InAppMessagePrompt inAppMessagePromptCreatePrompt = iInAppMessagePromptFactory.createPrompt(string);
            if (inAppMessagePromptCreatePrompt != null) {
                this.prompts.add(inAppMessagePromptCreatePrompt);
            }
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickResult
    public String getActionId() {
        return this.actionId;
    }

    public final String getClickId() {
        return this.clickId;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickResult
    public boolean getClosingMessage() {
        return this.closingMessage;
    }

    public final List<InAppMessageOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<InAppMessagePrompt> getPrompts() {
        return this.prompts;
    }

    public final InAppMessageTag getTags() {
        return this.tags;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickResult
    public String getUrl() {
        return this.url;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickResult
    public InAppMessageActionUrlType getUrlTarget() {
        return this.urlTarget;
    }

    public final boolean isFirstClick() {
        return this.isFirstClick;
    }

    public final void setFirstClick(boolean z) {
        this.isFirstClick = z;
    }

    public final void setTags(InAppMessageTag inAppMessageTag) {
        this.tags = inAppMessageTag;
    }

    public void setUrlTarget(InAppMessageActionUrlType inAppMessageActionUrlType) {
        this.urlTarget = inAppMessageActionUrlType;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CLICK_NAME, getActionId());
            jSONObject.put(CLICK_URL, getUrl());
            jSONObject.put(FIRST_CLICK, this.isFirstClick);
            jSONObject.put(CLOSES_MESSAGE, getClosingMessage());
            JSONArray jSONArray = new JSONArray();
            Iterator<InAppMessageOutcome> it = this.outcomes.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSONObject());
            }
            jSONObject.put(OUTCOMES, jSONArray);
            InAppMessageTag inAppMessageTag = this.tags;
            if (inAppMessageTag != null) {
                sq8.m48646e(inAppMessageTag);
                jSONObject.put(TAGS, inAppMessageTag.toJSONObject());
            }
            if (getUrlTarget() != null) {
                jSONObject.put(URL_TARGET, String.valueOf(getUrlTarget()));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
