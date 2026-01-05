package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.Model;
import p001o.id5;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class InfluenceConfigModel extends Model {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.onesignal.core.internal.config.InfluenceConfigModel$isDirectEnabled$2 */
    public static final class C116112 extends kf9 implements uk7 {
        public static final C116112 INSTANCE = new C116112();

        public C116112() {
            super(0);
        }

        @Override // p001o.uk7
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.onesignal.core.internal.config.InfluenceConfigModel$isIndirectEnabled$2 */
    public static final class C116122 extends kf9 implements uk7 {
        public static final C116122 INSTANCE = new C116122();

        public C116122() {
            super(0);
        }

        @Override // p001o.uk7
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.onesignal.core.internal.config.InfluenceConfigModel$isUnattributedEnabled$2 */
    public static final class C116132 extends kf9 implements uk7 {
        public static final C116132 INSTANCE = new C116132();

        public C116132() {
            super(0);
        }

        @Override // p001o.uk7
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfluenceConfigModel(Model model, String str) {
        super(model, str);
        sq8.m48649h(model, "parentModel");
        sq8.m48649h(str, "parentProperty");
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", InfluenceConfigModel$iamLimit$2.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", InfluenceConfigModel$indirectIAMAttributionWindow$2.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", InfluenceConfigModel$indirectNotificationAttributionWindow$2.INSTANCE);
    }

    public final int getNotificationLimit() {
        return getIntProperty("notificationLimit", InfluenceConfigModel$notificationLimit$2.INSTANCE);
    }

    public final boolean isDirectEnabled() {
        return getBooleanProperty("isDirectEnabled", C116112.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", C116122.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", C116132.INSTANCE);
    }

    public final void setDirectEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "isDirectEnabled", z, null, false, 12, null);
    }

    public final void setIamLimit(int i) {
        Model.setIntProperty$default(this, "iamLimit", i, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "isIndirectEnabled", z, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i) {
        Model.setIntProperty$default(this, "indirectIAMAttributionWindow", i, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i) {
        Model.setIntProperty$default(this, "indirectNotificationAttributionWindow", i, null, false, 12, null);
    }

    public final void setNotificationLimit(int i) {
        Model.setIntProperty$default(this, "notificationLimit", i, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "isUnattributedEnabled", z, null, false, 12, null);
    }
}
