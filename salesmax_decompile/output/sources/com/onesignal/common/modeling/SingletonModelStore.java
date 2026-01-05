package com.onesignal.common.modeling;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.Model;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public class SingletonModelStore<TModel extends Model> implements ISingletonModelStore<TModel>, IModelStoreChangeHandler<TModel> {
    private final EventProducer<ISingletonModelStoreChangeHandler<TModel>> changeSubscription;
    private final Object replaceLock;
    private final String singletonId;
    private final ModelStore<TModel> store;

    /* renamed from: com.onesignal.common.modeling.SingletonModelStore$onModelUpdated$1 */
    public static final class C115851 extends kf9 implements xk7 {
        final /* synthetic */ ModelChangedArgs $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115851(ModelChangedArgs modelChangedArgs, String str) {
            super(1);
            this.$args = modelChangedArgs;
            this.$tag = str;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ISingletonModelStoreChangeHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ISingletonModelStoreChangeHandler<TModel> iSingletonModelStoreChangeHandler) {
            sq8.m48649h(iSingletonModelStoreChangeHandler, "it");
            iSingletonModelStoreChangeHandler.onModelUpdated(this.$args, this.$tag);
        }
    }

    public SingletonModelStore(ModelStore<TModel> modelStore) {
        sq8.m48649h(modelStore, "store");
        this.store = modelStore;
        this.changeSubscription = new EventProducer<>();
        this.singletonId = "-singleton-";
        this.replaceLock = new Object();
        modelStore.subscribe((IModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStore
    public TModel getModel() {
        synchronized (this) {
            TModel tmodel = (TModel) this.store.get(this.singletonId);
            if (tmodel != null) {
                return tmodel;
            }
            TModel tmodel2 = (TModel) IModelStore.DefaultImpls.create$default(this.store, null, 1, null);
            if (tmodel2 != null) {
                tmodel2.setId(this.singletonId);
                IModelStore.DefaultImpls.add$default(this.store, tmodel2, null, 2, null);
                return tmodel2;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    public final ModelStore<TModel> getStore() {
        return this.store;
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelAdded(TModel tmodel, String str) {
        sq8.m48649h(tmodel, "model");
        sq8.m48649h(str, "tag");
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelRemoved(TModel tmodel, String str) {
        sq8.m48649h(tmodel, "model");
        sq8.m48649h(str, "tag");
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
        this.changeSubscription.fire(new C115851(modelChangedArgs, str));
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStore
    public void replace(TModel tmodel, String str) {
        sq8.m48649h(tmodel, "model");
        sq8.m48649h(str, "tag");
        synchronized (this.replaceLock) {
            Model model = getModel();
            model.initializeFromModel(this.singletonId, tmodel);
            this.store.persist();
            this.changeSubscription.fire(new SingletonModelStore$replace$1$1(model, str));
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ISingletonModelStoreChangeHandler<TModel> iSingletonModelStoreChangeHandler) {
        sq8.m48649h(iSingletonModelStoreChangeHandler, "handler");
        this.changeSubscription.subscribe(iSingletonModelStoreChangeHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ISingletonModelStoreChangeHandler<TModel> iSingletonModelStoreChangeHandler) {
        sq8.m48649h(iSingletonModelStoreChangeHandler, "handler");
        this.changeSubscription.unsubscribe(iSingletonModelStoreChangeHandler);
    }
}
