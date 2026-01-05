package com.onesignal.user.internal.operations;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.UpdateUserOperationExecutor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class TrackPurchaseOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public TrackPurchaseOperation() {
        super(UpdateUserOperationExecutor.TRACK_PURCHASE);
        this.groupComparisonType = GroupComparisonType.ALTER;
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        Model.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, null, false, 12, null);
    }

    private final void setAppId(String str) {
        Model.setStringProperty$default(this, RemoteConfigConstants.RequestFieldKey.APP_ID, str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setPurchases(List<PurchaseInfo> list) {
        Model.setListProperty$default(this, "purchases", list, null, false, 12, null);
    }

    private final void setTreatNewAsExisting(boolean z) {
        Model.setBooleanProperty$default(this, "treatNewAsExisting", z, null, false, 12, null);
    }

    @Override // com.onesignal.common.modeling.Model
    public List<?> createListForProperty(String str, JSONArray jSONArray) throws JSONException {
        sq8.m48649h(str, "property");
        sq8.m48649h(jSONArray, "jsonArray");
        if (!sq8.m48644c(str, "purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            PurchaseInfo purchaseInfo = new PurchaseInfo();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            sq8.m48648g(jSONObject, "jsonArray.getJSONObject(item)");
            purchaseInfo.initializeFromJson(jSONObject);
            arrayList.add(purchaseInfo);
        }
        return arrayList;
    }

    public final BigDecimal getAmountSpent() {
        return Model.getBigDecimalProperty$default(this, "amountSpent", null, 2, null);
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

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final List<PurchaseInfo> getPurchases() {
        return Model.getListProperty$default(this, "purchases", null, 2, null);
    }

    public final boolean getTreatNewAsExisting() {
        return Model.getBooleanProperty$default(this, "treatNewAsExisting", null, 2, null);
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
    public TrackPurchaseOperation(String str, String str2, boolean z, BigDecimal bigDecimal, List<PurchaseInfo> list) {
        this();
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        sq8.m48649h(str2, "onesignalId");
        sq8.m48649h(bigDecimal, "amountSpent");
        sq8.m48649h(list, "purchases");
        setAppId(str);
        setOnesignalId(str2);
        setTreatNewAsExisting(z);
        setAmountSpent(bigDecimal);
        setPurchases(list);
    }
}
