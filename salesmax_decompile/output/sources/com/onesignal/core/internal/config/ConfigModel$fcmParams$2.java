package com.onesignal.core.internal.config;

import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class ConfigModel$fcmParams$2 extends kf9 implements uk7 {
    final /* synthetic */ ConfigModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigModel$fcmParams$2(ConfigModel configModel) {
        super(0);
        this.this$0 = configModel;
    }

    @Override // p001o.uk7
    public final Object invoke() {
        return new FCMConfigModel(this.this$0, "fcmParams");
    }
}
