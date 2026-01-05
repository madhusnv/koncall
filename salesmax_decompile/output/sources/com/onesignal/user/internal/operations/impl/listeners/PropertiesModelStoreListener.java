package com.onesignal.user.internal.operations.impl.listeners;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import org.apache.http.cookie.ClientCookie;
import p001o.e9g;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PropertiesModelStoreListener extends SingletonModelStoreListener<PropertiesModel> {
    private final ConfigModelStore _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertiesModelStoreListener(PropertiesModelStore propertiesModelStore, IOperationRepo iOperationRepo, ConfigModelStore configModelStore) {
        super(propertiesModelStore, iOperationRepo);
        sq8.m48649h(propertiesModelStore, "store");
        sq8.m48649h(iOperationRepo, "opRepo");
        sq8.m48649h(configModelStore, "_configModelStore");
        this._configModelStore = configModelStore;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getReplaceOperation(PropertiesModel propertiesModel) {
        sq8.m48649h(propertiesModel, "model");
        return null;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getUpdateOperation(PropertiesModel propertiesModel, String str, String str2, Object obj, Object obj2) {
        sq8.m48649h(propertiesModel, "model");
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, "property");
        if (e9g.m24597K(str, "locationTimestamp", false, 2, null) || e9g.m24597K(str, "locationBackground", false, 2, null) || e9g.m24597K(str, "locationType", false, 2, null) || e9g.m24597K(str, "locationAccuracy", false, 2, null)) {
            return null;
        }
        return e9g.m24597K(str, "tags", false, 2, null) ? (obj2 == null || !(obj2 instanceof String)) ? new DeleteTagOperation(this._configModelStore.getModel().getAppId(), propertiesModel.getOnesignalId(), str2) : new SetTagOperation(this._configModelStore.getModel().getAppId(), propertiesModel.getOnesignalId(), str2, (String) obj2) : new SetPropertyOperation(this._configModelStore.getModel().getAppId(), propertiesModel.getOnesignalId(), str2, obj2);
    }
}
