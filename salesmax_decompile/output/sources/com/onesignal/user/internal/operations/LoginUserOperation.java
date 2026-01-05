package com.onesignal.user.internal.operations;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class LoginUserOperation extends Operation {
    private final GroupComparisonType groupComparisonType;
    private final String modifyComparisonKey;

    public LoginUserOperation() {
        super(LoginUserOperationExecutor.LOGIN_USER);
        this.modifyComparisonKey = "";
        this.groupComparisonType = GroupComparisonType.CREATE;
    }

    private final void setAppId(String str) {
        Model.setStringProperty$default(this, RemoteConfigConstants.RequestFieldKey.APP_ID, str, null, false, 12, null);
    }

    private final void setExistingOnesignalId(String str) {
        Model.setOptStringProperty$default(this, "existingOnesignalId", str, null, false, 12, null);
    }

    private final void setExternalId(String str) {
        Model.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, RemoteConfigConstants.RequestFieldKey.APP_ID, null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getApplyToRecordId() {
        String existingOnesignalId = getExistingOnesignalId();
        return existingOnesignalId == null ? getOnesignalId() : existingOnesignalId;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public boolean getCanStartExecute() {
        if (getExistingOnesignalId() != null) {
            IDManager iDManager = IDManager.INSTANCE;
            String existingOnesignalId = getExistingOnesignalId();
            sq8.m48646e(existingOnesignalId);
            if (iDManager.isLocalId(existingOnesignalId)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getExistingOnesignalId() {
        return Model.getOptStringProperty$default(this, "existingOnesignalId", null, 2, null);
    }

    public final String getExternalId() {
        return Model.getOptStringProperty$default(this, "externalId", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public GroupComparisonType getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return this.modifyComparisonKey;
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public void translateIds(Map<String, String> map) {
        sq8.m48649h(map, "map");
        if (map.containsKey(getExistingOnesignalId())) {
            String str = map.get(getExistingOnesignalId());
            sq8.m48646e(str);
            setExistingOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginUserOperation(String str, String str2, String str3, String str4) {
        this();
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        sq8.m48649h(str2, "onesignalId");
        setAppId(str);
        setOnesignalId(str2);
        setExternalId(str3);
        setExistingOnesignalId(str4);
    }

    public /* synthetic */ LoginUserOperation(String str, String str2, String str3, String str4, int i, id5 id5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
