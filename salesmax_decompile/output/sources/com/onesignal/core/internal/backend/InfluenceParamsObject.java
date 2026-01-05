package com.onesignal.core.internal.backend;

import org.objectweb.asm.Opcodes;
import p001o.id5;

/* loaded from: classes6.dex */
public final class InfluenceParamsObject {
    private final Integer iamLimit;
    private final Integer indirectIAMAttributionWindow;
    private final Integer indirectNotificationAttributionWindow;
    private final Boolean isDirectEnabled;
    private final Boolean isIndirectEnabled;
    private final Boolean isUnattributedEnabled;
    private final Integer notificationLimit;

    public InfluenceParamsObject() {
        this(null, null, null, null, null, null, null, Opcodes.LAND, null);
    }

    public final Integer getIamLimit() {
        return this.iamLimit;
    }

    public final Integer getIndirectIAMAttributionWindow() {
        return this.indirectIAMAttributionWindow;
    }

    public final Integer getIndirectNotificationAttributionWindow() {
        return this.indirectNotificationAttributionWindow;
    }

    public final Integer getNotificationLimit() {
        return this.notificationLimit;
    }

    public final Boolean isDirectEnabled() {
        return this.isDirectEnabled;
    }

    public final Boolean isIndirectEnabled() {
        return this.isIndirectEnabled;
    }

    public final Boolean isUnattributedEnabled() {
        return this.isUnattributedEnabled;
    }

    public InfluenceParamsObject(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3) {
        this.indirectNotificationAttributionWindow = num;
        this.notificationLimit = num2;
        this.indirectIAMAttributionWindow = num3;
        this.iamLimit = num4;
        this.isDirectEnabled = bool;
        this.isIndirectEnabled = bool2;
        this.isUnattributedEnabled = bool3;
    }

    public /* synthetic */ InfluenceParamsObject(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3);
    }
}
