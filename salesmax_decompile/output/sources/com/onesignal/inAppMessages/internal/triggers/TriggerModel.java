package com.onesignal.inAppMessages.internal.triggers;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.common.modeling.Model;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class TriggerModel extends Model {
    public TriggerModel() {
        super(null, null, 3, null);
    }

    public final String getKey() {
        return getStringProperty(TransferTable.COLUMN_KEY, TriggerModel$key$2.INSTANCE);
    }

    public final Object getValue() {
        return getAnyProperty("value", TriggerModel$value$2.INSTANCE);
    }

    public final void setKey(String str) {
        sq8.m48649h(str, "value");
        Model.setStringProperty$default(this, TransferTable.COLUMN_KEY, str, null, false, 12, null);
    }

    public final void setValue(Object obj) {
        sq8.m48649h(obj, "value");
        Model.setAnyProperty$default(this, "value", obj, null, true, 4, null);
    }
}
