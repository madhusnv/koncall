package com.onesignal.inAppMessages.internal;

import com.onesignal.common.DateUtils;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.inAppMessages.IInAppMessage;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.ch3;
import p001o.id5;
import p001o.isa;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppMessage implements IInAppMessage {
    public static final Companion Companion = new Companion(null);
    private static final String DISPLAY_DURATION = "displayDuration";
    private static final String END_TIME = "end_time";
    private static final String HAS_LIQUID = "has_liquid";
    private static final String IAM_ID = "messageId";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private static final String ID = "id";
    private boolean actionTaken;
    private Set<String> clickedClickIds;
    private double displayDuration;
    private Date endTime;
    private boolean hasLiquid;
    private boolean isDisplayedInSession;
    private boolean isPreview;
    private boolean isTriggerChanged;
    private final String messageId;
    private InAppMessageRedisplayStats redisplayStats;
    private List<? extends List<Trigger>> triggers;
    private Map<String, ? extends Map<String, String>> variants;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public InAppMessage(String str, ITime iTime) {
        sq8.m48649h(str, IAM_ID);
        sq8.m48649h(iTime, InfluenceConstants.TIME);
        this.messageId = str;
        this.variants = isa.m32681h();
        this.triggers = ch3.m21246k();
        this.clickedClickIds = new LinkedHashSet();
        this.redisplayStats = new InAppMessageRedisplayStats(iTime);
    }

    private final Date parseEndTimeJson(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString(END_TIME);
            sq8.m48648g(string, "{\n                json.g…g(END_TIME)\n            }");
            if (sq8.m48644c(string, "null")) {
                return null;
            }
            try {
                return DateUtils.INSTANCE.iso8601Format().parse(string);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    private final ArrayList<ArrayList<Trigger>> parseTriggerJson(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<Trigger>> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList<Trigger> arrayList2 = new ArrayList<>();
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                sq8.m48648g(jSONObject, "ands.getJSONObject(j)");
                arrayList2.add(new Trigger(jSONObject));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private final HashMap<String, HashMap<String, String>> parseVariants(JSONObject jSONObject) throws JSONException {
        HashMap<String, HashMap<String, String>> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap<String, String> map2 = new HashMap<>();
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                sq8.m48648g(next2, "languageType");
                String string = jSONObject2.getString(next2);
                sq8.m48648g(string, "variant.getString(languageType)");
                map2.put(next2, string);
            }
            sq8.m48648g(next, "variantType");
            map.put(next, map2);
        }
        return map;
    }

    public final void addClickId(String str) {
        sq8.m48649h(str, "clickId");
        this.clickedClickIds.add(str);
    }

    public final void clearClickIds() {
        this.clickedClickIds.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(InAppMessage.class, obj.getClass())) {
            return false;
        }
        return sq8.m48644c(getMessageId(), ((InAppMessage) obj).getMessageId());
    }

    public final Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    public final double getDisplayDuration() {
        return this.displayDuration;
    }

    public final boolean getHasLiquid() {
        return this.hasLiquid;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessage
    public String getMessageId() {
        return this.messageId;
    }

    public final InAppMessageRedisplayStats getRedisplayStats() {
        return this.redisplayStats;
    }

    public final List<List<Trigger>> getTriggers() {
        return this.triggers;
    }

    public final Map<String, Map<String, String>> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return getMessageId().hashCode();
    }

    public final boolean isClickAvailable(String str) {
        sq8.m48649h(str, "clickId");
        return !this.clickedClickIds.contains(str);
    }

    public final boolean isDisplayedInSession() {
        return this.isDisplayedInSession;
    }

    public final boolean isFinished() {
        if (this.endTime == null) {
            return false;
        }
        Date date = new Date();
        Date date2 = this.endTime;
        sq8.m48646e(date2);
        return date2.before(date);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public final boolean isTriggerChanged() {
        return this.isTriggerChanged;
    }

    public final void removeClickId(String str) {
        sq8.m48649h(str, "clickId");
        this.clickedClickIds.remove(str);
    }

    public final void setDisplayDuration(double d) {
        this.displayDuration = d;
    }

    public final void setDisplayedInSession(boolean z) {
        this.isDisplayedInSession = z;
    }

    public final void setTriggerChanged(boolean z) {
        this.isTriggerChanged = z;
    }

    public final boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IAM_ID, getMessageId());
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.variants.keySet()) {
                Map<String, String> map = this.variants.get(str);
                sq8.m48646e(map);
                Map<String, String> map2 = map;
                JSONObject jSONObject3 = new JSONObject();
                for (String str2 : map2.keySet()) {
                    jSONObject3.put(str2, map2.get(str2));
                }
                jSONObject2.put(str, jSONObject3);
            }
            jSONObject.put(IAM_VARIANTS, jSONObject2);
            jSONObject.put(DISPLAY_DURATION, this.displayDuration);
            jSONObject.put(IAM_REDISPLAY_STATS, this.redisplayStats.toJSONObject());
            JSONArray jSONArray = new JSONArray();
            for (List<Trigger> list : this.triggers) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<Trigger> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().toJSONObject());
                }
                jSONArray.put(jSONArray2);
            }
            jSONObject.put(IAM_TRIGGERS, jSONArray);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, DateUtils.INSTANCE.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + getMessageId() + "', variants=" + this.variants + ", triggers=" + this.triggers + ", clickedClickIds=" + this.clickedClickIds + ", redisplayStats=" + this.redisplayStats + ", displayDuration=" + this.displayDuration + ", displayedInSession=" + this.isDisplayedInSession + ", triggerChanged=" + this.isTriggerChanged + ", actionTaken=" + this.actionTaken + ", isPreview=" + this.isPreview + ", endTime=" + this.endTime + ", hasLiquid=" + this.hasLiquid + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessage(boolean z, ITime iTime) {
        this("", iTime);
        sq8.m48649h(iTime, InfluenceConstants.TIME);
        this.isPreview = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessage(String str, Set<String> set, boolean z, InAppMessageRedisplayStats inAppMessageRedisplayStats, ITime iTime) {
        this(str, iTime);
        sq8.m48649h(str, IAM_ID);
        sq8.m48649h(set, "clickIds");
        sq8.m48649h(inAppMessageRedisplayStats, "redisplayStats");
        sq8.m48649h(iTime, InfluenceConstants.TIME);
        this.clickedClickIds = kh3.U0(set);
        this.isDisplayedInSession = z;
        this.redisplayStats = inAppMessageRedisplayStats;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InAppMessage(JSONObject jSONObject, ITime iTime) throws JSONException {
        sq8.m48649h(jSONObject, "json");
        sq8.m48649h(iTime, InfluenceConstants.TIME);
        String string = jSONObject.getString("id");
        sq8.m48648g(string, "json.getString(ID)");
        this(string, iTime);
        JSONObject jSONObject2 = jSONObject.getJSONObject(IAM_VARIANTS);
        sq8.m48648g(jSONObject2, "json.getJSONObject(IAM_VARIANTS)");
        this.variants = parseVariants(jSONObject2);
        JSONArray jSONArray = jSONObject.getJSONArray(IAM_TRIGGERS);
        sq8.m48648g(jSONArray, "json.getJSONArray(IAM_TRIGGERS)");
        this.triggers = parseTriggerJson(jSONArray);
        this.endTime = parseEndTimeJson(jSONObject);
        if (jSONObject.has(HAS_LIQUID)) {
            this.hasLiquid = jSONObject.getBoolean(HAS_LIQUID);
        }
        if (jSONObject.has(IAM_REDISPLAY_STATS)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(IAM_REDISPLAY_STATS);
            sq8.m48648g(jSONObject3, "json.getJSONObject(IAM_REDISPLAY_STATS)");
            this.redisplayStats = new InAppMessageRedisplayStats(jSONObject3, iTime);
        }
    }
}
