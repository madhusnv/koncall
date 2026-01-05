package com.onesignal.core.internal.operations;

import com.onesignal.common.modeling.Model;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes6.dex */
public abstract class Operation extends Model {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Operation(String str) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        sq8.m48649h(str, "name");
        setName(str);
    }

    private final void setName(String str) {
        Model.setStringProperty$default(this, "name", str, null, false, 12, null);
    }

    public abstract String getApplyToRecordId();

    public abstract boolean getCanStartExecute();

    public abstract String getCreateComparisonKey();

    public abstract GroupComparisonType getGroupComparisonType();

    public abstract String getModifyComparisonKey();

    public final String getName() {
        return Model.getStringProperty$default(this, "name", null, 2, null);
    }

    public String toString() {
        String string = toJSON().toString();
        sq8.m48648g(string, "toJSON().toString()");
        return string;
    }

    public void translateIds(Map<String, String> map) {
        sq8.m48649h(map, "map");
    }
}
