package com.onesignal.inAppMessages.internal.hydrators;

import com.onesignal.common.modeling.MapModel;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.h8g;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppHydrator {
    public static final Companion Companion = new Companion(null);
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private final PropertiesModelStore _propertiesModelStore;
    private final ITime _time;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public InAppHydrator(ITime iTime, PropertiesModelStore propertiesModelStore) {
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        this._time = iTime;
        this._propertiesModelStore = propertiesModelStore;
    }

    private final String taggedHTMLString(String str) {
        MapModel<String> tags = this._propertiesModelStore.getModel().getTags();
        sq8.m48647f(tags, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String string = new JSONObject(tags).toString();
        sq8.m48648g(string, "tagsAsJson.toString()");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format(LIQUID_TAG_SCRIPT, Arrays.copyOf(new Object[]{string}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }

    public final InAppMessageContent hydrateIAMMessageContent(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "jsonObject");
        try {
            InAppMessageContent inAppMessageContent = new InAppMessageContent(jSONObject);
            if (inAppMessageContent.getContentHtml() == null) {
                Logging.debug$default("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent", null, 2, null);
                return null;
            }
            String contentHtml = inAppMessageContent.getContentHtml();
            sq8.m48646e(contentHtml);
            inAppMessageContent.setContentHtml(taggedHTMLString(contentHtml));
            return inAppMessageContent;
        } catch (JSONException e) {
            Logging.error("Error attempting to hydrate InAppMessageContent: " + jSONObject, e);
            return null;
        }
    }

    public final List<InAppMessage> hydrateIAMMessages(JSONArray jSONArray) throws JSONException {
        sq8.m48649h(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            sq8.m48648g(jSONObject, "jsonArray.getJSONObject(i)");
            InAppMessage inAppMessage = new InAppMessage(jSONObject, this._time);
            if (inAppMessage.getMessageId() != null) {
                arrayList.add(inAppMessage);
            }
        }
        return arrayList;
    }
}
