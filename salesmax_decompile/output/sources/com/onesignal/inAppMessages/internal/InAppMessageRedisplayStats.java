package com.onesignal.inAppMessages.internal;

import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppMessageRedisplayStats {
    public static final Companion Companion = new Companion(null);
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private final ITime _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public InAppMessageRedisplayStats(ITime iTime) {
        sq8.m48649h(iTime, "_time");
        this._time = iTime;
        this.lastDisplayTime = -1L;
        this.displayLimit = 1;
    }

    public final long getDisplayDelay() {
        return this.displayDelay;
    }

    public final int getDisplayLimit() {
        return this.displayLimit;
    }

    public final int getDisplayQuantity() {
        return this.displayQuantity;
    }

    public final long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    public final void incrementDisplayQuantity() {
        this.displayQuantity++;
    }

    public final boolean isDelayTimeSatisfied() {
        if (this.lastDisplayTime < 0) {
            return true;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        long j = currentTimeMillis - this.lastDisplayTime;
        Logging.debug$default("OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j + " displayDelay: " + this.displayDelay, null, 2, null);
        return j >= this.displayDelay;
    }

    public final boolean isRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j) {
        this.displayDelay = j;
    }

    public final void setDisplayLimit(int i) {
        this.displayLimit = i;
    }

    public final void setDisplayQuantity(int i) {
        this.displayQuantity = i;
    }

    public final void setDisplayStats(InAppMessageRedisplayStats inAppMessageRedisplayStats) {
        sq8.m48649h(inAppMessageRedisplayStats, "displayStats");
        this.lastDisplayTime = inAppMessageRedisplayStats.lastDisplayTime;
        this.displayQuantity = inAppMessageRedisplayStats.displayQuantity;
    }

    public final void setLastDisplayTime(long j) {
        this.lastDisplayTime = j;
    }

    public final boolean shouldDisplayAgain() {
        boolean z = this.displayQuantity < this.displayLimit;
        Logging.debug$default("OSInAppMessage shouldDisplayAgain: " + z, null, 2, null);
        return z;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageRedisplayStats(int i, long j, ITime iTime) {
        this(iTime);
        sq8.m48649h(iTime, InfluenceConstants.TIME);
        this.displayQuantity = i;
        this.lastDisplayTime = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageRedisplayStats(JSONObject jSONObject, ITime iTime) throws JSONException {
        this(iTime);
        sq8.m48649h(jSONObject, "json");
        sq8.m48649h(iTime, InfluenceConstants.TIME);
        this.isRedisplayEnabled = true;
        Object obj = jSONObject.get(DISPLAY_LIMIT);
        Object obj2 = jSONObject.get(DISPLAY_DELAY);
        if (obj instanceof Integer) {
            this.displayLimit = ((Number) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.displayDelay = ((Number) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.displayDelay = ((Number) obj2).intValue();
        }
    }
}
