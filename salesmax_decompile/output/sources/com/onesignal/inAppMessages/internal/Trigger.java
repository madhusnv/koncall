package com.onesignal.inAppMessages.internal;

import com.apollographql.apollo.api.ResponseField;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.e9g;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class Trigger {
    private final OSTriggerKind kind;
    private final OSTriggerOperator operatorType;
    private final String property;
    private final String triggerId;
    private final Object value;

    public enum OSTriggerKind {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM),
        UNKNOWN("unknown");

        public static final Companion Companion = new Companion(null);
        private final String value;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final OSTriggerKind fromString(String str) {
                for (OSTriggerKind oSTriggerKind : OSTriggerKind.values()) {
                    if (e9g.m24606x(oSTriggerKind.value, str, true)) {
                        return oSTriggerKind;
                    }
                }
                return OSTriggerKind.UNKNOWN;
            }
        }

        OSTriggerKind(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public enum OSTriggerOperator {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");

        public static final Companion Companion = new Companion(null);
        private final String text;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final OSTriggerOperator fromString(String str) {
                for (OSTriggerOperator oSTriggerOperator : OSTriggerOperator.values()) {
                    if (e9g.m24606x(oSTriggerOperator.text, str, true)) {
                        return oSTriggerOperator;
                    }
                }
                return OSTriggerOperator.EQUAL_TO;
            }
        }

        OSTriggerOperator(String str) {
            this.text = str;
        }

        public final boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public Trigger(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "json");
        String string = jSONObject.getString(OutcomeConstants.OUTCOME_ID);
        sq8.m48648g(string, "json.getString(\"id\")");
        this.triggerId = string;
        this.kind = OSTriggerKind.Companion.fromString(jSONObject.getString(ResponseField.VARIABLE_IDENTIFIER_KEY));
        this.property = jSONObject.optString("property", null);
        this.operatorType = OSTriggerOperator.Companion.fromString(jSONObject.getString("operator"));
        this.value = jSONObject.opt("value");
    }

    public final OSTriggerKind getKind() {
        return this.kind;
    }

    public final OSTriggerOperator getOperatorType() {
        return this.operatorType;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public final Object getValue() {
        return this.value;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OutcomeConstants.OUTCOME_ID, this.triggerId);
            jSONObject.put(ResponseField.VARIABLE_IDENTIFIER_KEY, this.kind);
            jSONObject.put("property", this.property);
            jSONObject.put("operator", this.operatorType.toString());
            jSONObject.put("value", this.value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "Trigger{triggerId='" + this.triggerId + "', kind=" + this.kind + ", property='" + this.property + "', operatorType=" + this.operatorType + ", value=" + this.value + '}';
    }
}
