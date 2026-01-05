package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.MapModel;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class PropertiesModel$tags$2 extends kf9 implements uk7 {
    final /* synthetic */ PropertiesModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertiesModel$tags$2(PropertiesModel propertiesModel) {
        super(0);
        this.this$0 = propertiesModel;
    }

    @Override // p001o.uk7
    public final MapModel<String> invoke() {
        return new MapModel<>(this.this$0, "tags");
    }
}
