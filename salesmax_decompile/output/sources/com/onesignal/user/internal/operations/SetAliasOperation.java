package com.onesignal.user.internal.operations;

import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.IdentityOperationExecutor;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class SetAliasOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public SetAliasOperation() {
        super(IdentityOperationExecutor.SET_ALIAS);
        this.groupComparisonType = GroupComparisonType.ALTER;
    }

    private final void setAppId(String str) {
        Model.setStringProperty$default(this, RemoteConfigConstants.RequestFieldKey.APP_ID, str, null, false, 12, null);
    }

    private final void setLabel(String str) {
        Model.setStringProperty$default(this, Constants.ScionAnalytics.PARAM_LABEL, str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setValue(String str) {
        Model.setStringProperty$default(this, "value", str, null, false, 12, null);
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, RemoteConfigConstants.RequestFieldKey.APP_ID, null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public boolean getCanStartExecute() {
        return !IDManager.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public GroupComparisonType getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public final String getLabel() {
        return Model.getStringProperty$default(this, Constants.ScionAnalytics.PARAM_LABEL, null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Identity." + getLabel();
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getValue() {
        return Model.getStringProperty$default(this, "value", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public void translateIds(Map<String, String> map) {
        sq8.m48649h(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            sq8.m48646e(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetAliasOperation(String str, String str2, String str3, String str4) {
        this();
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        sq8.m48649h(str2, "onesignalId");
        sq8.m48649h(str3, Constants.ScionAnalytics.PARAM_LABEL);
        sq8.m48649h(str4, "value");
        setAppId(str);
        setOnesignalId(str2);
        setLabel(str3);
        setValue(str4);
    }
}
