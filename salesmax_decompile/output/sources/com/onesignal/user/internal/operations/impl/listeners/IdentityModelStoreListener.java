package com.onesignal.user.internal.operations.impl.listeners;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.DeleteAliasOperation;
import com.onesignal.user.internal.operations.SetAliasOperation;
import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class IdentityModelStoreListener extends SingletonModelStoreListener<IdentityModel> {
    private final ConfigModelStore _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityModelStoreListener(IdentityModelStore identityModelStore, IOperationRepo iOperationRepo, ConfigModelStore configModelStore) {
        super(identityModelStore, iOperationRepo);
        sq8.m48649h(identityModelStore, "store");
        sq8.m48649h(iOperationRepo, "opRepo");
        sq8.m48649h(configModelStore, "_configModelStore");
        this._configModelStore = configModelStore;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getReplaceOperation(IdentityModel identityModel) {
        sq8.m48649h(identityModel, "model");
        return null;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getUpdateOperation(IdentityModel identityModel, String str, String str2, Object obj, Object obj2) {
        sq8.m48649h(identityModel, "model");
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, "property");
        return (obj2 == null || !(obj2 instanceof String)) ? new DeleteAliasOperation(this._configModelStore.getModel().getAppId(), identityModel.getOnesignalId(), str2) : new SetAliasOperation(this._configModelStore.getModel().getAppId(), identityModel.getOnesignalId(), str2, (String) obj2);
    }
}
