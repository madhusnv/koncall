package com.onesignal.common.modeling;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p001o.id5;
import p001o.kf9;
import p001o.kh3;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public abstract class ModelStore<TModel extends Model> implements IEventNotifier<IModelStoreChangeHandler<TModel>>, IModelStore<TModel>, IModelChangedHandler {
    private final IPreferencesService _prefs;
    private final EventProducer<IModelStoreChangeHandler<TModel>> changeSubscription;
    private boolean hasLoadedFromCache;
    private final List<TModel> models;
    private final String name;

    /* renamed from: com.onesignal.common.modeling.ModelStore$addItem$2 */
    public static final class C115812 extends kf9 implements xk7 {
        final /* synthetic */ TModel $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115812(TModel tmodel, String str) {
            super(1);
            this.$model = tmodel;
            this.$tag = str;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IModelStoreChangeHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IModelStoreChangeHandler<TModel> iModelStoreChangeHandler) {
            sq8.m48649h(iModelStoreChangeHandler, "it");
            iModelStoreChangeHandler.onModelAdded(this.$model, this.$tag);
        }
    }

    /* renamed from: com.onesignal.common.modeling.ModelStore$clear$2 */
    public static final class C115822 extends kf9 implements xk7 {
        final /* synthetic */ TModel $item;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115822(TModel tmodel, String str) {
            super(1);
            this.$item = tmodel;
            this.$tag = str;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IModelStoreChangeHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IModelStoreChangeHandler<TModel> iModelStoreChangeHandler) {
            sq8.m48649h(iModelStoreChangeHandler, "it");
            iModelStoreChangeHandler.onModelRemoved(this.$item, this.$tag);
        }
    }

    /* renamed from: com.onesignal.common.modeling.ModelStore$onChanged$1 */
    public static final class C115831 extends kf9 implements xk7 {
        final /* synthetic */ ModelChangedArgs $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115831(ModelChangedArgs modelChangedArgs, String str) {
            super(1);
            this.$args = modelChangedArgs;
            this.$tag = str;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IModelStoreChangeHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IModelStoreChangeHandler<TModel> iModelStoreChangeHandler) {
            sq8.m48649h(iModelStoreChangeHandler, "it");
            iModelStoreChangeHandler.onModelUpdated(this.$args, this.$tag);
        }
    }

    /* renamed from: com.onesignal.common.modeling.ModelStore$removeItem$2 */
    public static final class C115842 extends kf9 implements xk7 {
        final /* synthetic */ TModel $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115842(TModel tmodel, String str) {
            super(1);
            this.$model = tmodel;
            this.$tag = str;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IModelStoreChangeHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IModelStoreChangeHandler<TModel> iModelStoreChangeHandler) {
            sq8.m48649h(iModelStoreChangeHandler, "it");
            iModelStoreChangeHandler.onModelRemoved(this.$model, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelStore() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void addItem(TModel tmodel, String str, Integer num) {
        synchronized (this.models) {
            if (num != null) {
                this.models.add(num.intValue(), tmodel);
            } else {
                this.models.add(tmodel);
            }
            tmodel.subscribe(this);
            persist();
            y3i y3iVar = y3i.f54824a;
        }
        this.changeSubscription.fire(new C115812(tmodel, str));
    }

    public static /* synthetic */ void addItem$default(ModelStore modelStore, Model model, String str, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
        if ((i & 4) != 0) {
            num = null;
        }
        modelStore.addItem(model, str, num);
    }

    private final void removeItem(TModel tmodel, String str) {
        synchronized (this.models) {
            this.models.remove(tmodel);
            tmodel.unsubscribe(this);
            persist();
            y3i y3iVar = y3i.f54824a;
        }
        this.changeSubscription.fire(new C115842(tmodel, str));
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void add(TModel tmodel, String str) {
        Object next;
        sq8.m48649h(tmodel, "model");
        sq8.m48649h(str, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (sq8.m48644c(((Model) next).getId(), tmodel.getId())) {
                        break;
                    }
                }
            }
            Model model = (Model) next;
            if (model != null) {
                removeItem(model, str);
            }
            addItem$default(this, tmodel, str, null, 4, null);
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void clear(String str) {
        sq8.m48649h(str, "tag");
        List<Model> listQ0 = kh3.Q0(this.models);
        synchronized (this.models) {
            this.models.clear();
            persist();
            y3i y3iVar = y3i.f54824a;
        }
        for (Model model : listQ0) {
            model.unsubscribe((IModelChangedHandler) this);
            this.changeSubscription.fire(new C115822(model, str));
        }
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public TModel get(String str) {
        Object next;
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        Iterator<T> it = this.models.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (sq8.m48644c(((Model) next).getId(), str)) {
                break;
            }
        }
        return (TModel) next;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public Collection<TModel> list() {
        List listQ0;
        synchronized (this.models) {
            listQ0 = kh3.Q0(this.models);
        }
        return listQ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[Catch: all -> 0x00bc, TryCatch #0 {, blocks: (B:9:0x002d, B:13:0x003a, B:16:0x0042, B:33:0x00ae, B:19:0x004d, B:21:0x0053, B:31:0x007c, B:32:0x00a6, B:24:0x005b, B:25:0x005f, B:27:0x0065, B:34:0x00b1, B:36:0x00b5, B:37:0x00b8), top: B:44:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x00bc, TryCatch #0 {, blocks: (B:9:0x002d, B:13:0x003a, B:16:0x0042, B:33:0x00ae, B:19:0x004d, B:21:0x0053, B:31:0x007c, B:32:0x00a6, B:24:0x005b, B:25:0x005f, B:27:0x0065, B:34:0x00b1, B:36:0x00b5, B:37:0x00b8), top: B:44:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void load() {
        IPreferencesService iPreferencesService;
        boolean z;
        if (this.name == null || (iPreferencesService = this._prefs) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray(iPreferencesService.getString(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.MODEL_STORE_PREFIX + this.name, "[]"));
        synchronized (this.models) {
            boolean z2 = !this.models.isEmpty();
            for (int length = jSONArray.length() - 1; -1 < length; length--) {
                TModel tmodelCreate = create(jSONArray.getJSONObject(length));
                if (tmodelCreate != null) {
                    List<TModel> list = this.models;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z = false;
                        if (z) {
                        }
                    } else {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (sq8.m48644c(((Model) it.next()).getId(), tmodelCreate.getId())) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        if (z) {
                            this.models.add(0, tmodelCreate);
                            tmodelCreate.subscribe(this);
                        } else {
                            Logging.debug$default("ModelStore<" + this.name + ">: load - operation.id: " + tmodelCreate.getId() + " already exists in the store.", null, 2, null);
                        }
                    }
                }
            }
            this.hasLoadedFromCache = true;
            if (z2) {
                persist();
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // com.onesignal.common.modeling.IModelChangedHandler
    public void onChanged(ModelChangedArgs modelChangedArgs, String str) {
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
        persist();
        this.changeSubscription.fire(new C115831(modelChangedArgs, str));
    }

    public final void persist() {
        if (this.name == null || this._prefs == null || !this.hasLoadedFromCache) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (this.models) {
            Iterator<TModel> it = this.models.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSON());
            }
            y3i y3iVar = y3i.f54824a;
        }
        this._prefs.saveString(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.MODEL_STORE_PREFIX + this.name, jSONArray.toString());
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void remove(String str, String str2) {
        Object next;
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (sq8.m48644c(((Model) next).getId(), str)) {
                        break;
                    }
                }
            }
            Model model = (Model) next;
            if (model == null) {
                return;
            }
            removeItem(model, str2);
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void replaceAll(List<? extends TModel> list, String str) {
        sq8.m48649h(list, "models");
        sq8.m48649h(str, "tag");
        synchronized (list) {
            clear(str);
            Iterator<? extends TModel> it = list.iterator();
            while (it.hasNext()) {
                add(it.next(), str);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public ModelStore(String str, IPreferencesService iPreferencesService) {
        this.name = str;
        this._prefs = iPreferencesService;
        this.changeSubscription = new EventProducer<>();
        this.models = new ArrayList();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(IModelStoreChangeHandler<TModel> iModelStoreChangeHandler) {
        sq8.m48649h(iModelStoreChangeHandler, "handler");
        this.changeSubscription.subscribe(iModelStoreChangeHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(IModelStoreChangeHandler<TModel> iModelStoreChangeHandler) {
        sq8.m48649h(iModelStoreChangeHandler, "handler");
        this.changeSubscription.unsubscribe(iModelStoreChangeHandler);
    }

    public /* synthetic */ ModelStore(String str, IPreferencesService iPreferencesService, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : iPreferencesService);
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void add(int i, TModel tmodel, String str) {
        Object next;
        sq8.m48649h(tmodel, "model");
        sq8.m48649h(str, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (sq8.m48644c(((Model) next).getId(), tmodel.getId())) {
                        break;
                    }
                }
            }
            Model model = (Model) next;
            if (model != null) {
                removeItem(model, str);
            }
            addItem(tmodel, str, Integer.valueOf(i));
            y3i y3iVar = y3i.f54824a;
        }
    }
}
