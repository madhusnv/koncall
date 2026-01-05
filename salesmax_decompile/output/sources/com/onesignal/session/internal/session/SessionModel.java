package com.onesignal.session.internal.session;

import com.onesignal.common.modeling.Model;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class SessionModel extends Model {

    /* renamed from: com.onesignal.session.internal.session.SessionModel$isValid$2 */
    public static final class C118452 extends kf9 implements uk7 {
        public static final C118452 INSTANCE = new C118452();

        public C118452() {
            super(0);
        }

        @Override // p001o.uk7
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public SessionModel() {
        super(null, null, 3, null);
    }

    public final long getActiveDuration() {
        return getLongProperty("activeDuration", SessionModel$activeDuration$2.INSTANCE);
    }

    public final long getFocusTime() {
        return getLongProperty("focusTime", SessionModel$focusTime$2.INSTANCE);
    }

    public final String getSessionId() {
        return Model.getStringProperty$default(this, "sessionId", null, 2, null);
    }

    public final long getStartTime() {
        return getLongProperty("startTime", SessionModel$startTime$2.INSTANCE);
    }

    public final boolean isValid() {
        return getBooleanProperty("isValid", C118452.INSTANCE);
    }

    public final void setActiveDuration(long j) {
        Model.setLongProperty$default(this, "activeDuration", j, null, false, 12, null);
    }

    public final void setFocusTime(long j) {
        Model.setLongProperty$default(this, "focusTime", j, null, false, 12, null);
    }

    public final void setSessionId(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, "sessionId", str, null, false, 12, null);
    }

    public final void setStartTime(long j) {
        Model.setLongProperty$default(this, "startTime", j, null, false, 12, null);
    }

    public final void setValid(boolean z) {
        Model.setBooleanProperty$default(this, "isValid", z, null, false, 12, null);
    }
}
