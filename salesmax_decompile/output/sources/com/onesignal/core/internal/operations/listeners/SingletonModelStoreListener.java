package com.onesignal.core.internal.operations.listeners;

import com.onesignal.common.modeling.ISingletonModelStore;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.startup.IBootstrapService;
import java.io.Closeable;
import p001o.sq8;

/* loaded from: classes6.dex */
public abstract class SingletonModelStoreListener<TModel extends Model> implements ISingletonModelStoreChangeHandler<TModel>, IBootstrapService, Closeable {
    private final IOperationRepo opRepo;
    private final ISingletonModelStore<TModel> store;

    public SingletonModelStoreListener(ISingletonModelStore<TModel> iSingletonModelStore, IOperationRepo iOperationRepo) {
        sq8.m48649h(iSingletonModelStore, "store");
        sq8.m48649h(iOperationRepo, "opRepo");
        this.store = iSingletonModelStore;
        this.opRepo = iOperationRepo;
    }

    @Override // com.onesignal.core.internal.startup.IBootstrapService
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract Operation getReplaceOperation(TModel tmodel);

    public abstract Operation getUpdateOperation(TModel tmodel, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(TModel tmodel, String str) {
        Operation replaceOperation;
        sq8.m48649h(tmodel, "model");
        sq8.m48649h(str, "tag");
        if (sq8.m48644c(str, ModelChangeTags.NORMAL) && (replaceOperation = getReplaceOperation(tmodel)) != null) {
            IOperationRepo.DefaultImpls.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
        if (sq8.m48644c(str, ModelChangeTags.NORMAL)) {
            Model model = modelChangedArgs.getModel();
            sq8.m48647f(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener");
            Operation updateOperation = getUpdateOperation(model, modelChangedArgs.getPath(), modelChangedArgs.getProperty(), modelChangedArgs.getOldValue(), modelChangedArgs.getNewValue());
            if (updateOperation != null) {
                IOperationRepo.DefaultImpls.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
