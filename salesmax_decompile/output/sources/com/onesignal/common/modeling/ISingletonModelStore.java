package com.onesignal.common.modeling;

import com.onesignal.common.events.IEventNotifier;
import com.onesignal.common.modeling.Model;

/* loaded from: classes6.dex */
public interface ISingletonModelStore<TModel extends Model> extends IEventNotifier<ISingletonModelStoreChangeHandler<TModel>> {

    public static final class DefaultImpls {
        public static /* synthetic */ void replace$default(ISingletonModelStore iSingletonModelStore, Model model, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
            }
            if ((i & 2) != 0) {
                str = ModelChangeTags.NORMAL;
            }
            iSingletonModelStore.replace(model, str);
        }
    }

    TModel getModel();

    void replace(TModel tmodel, String str);
}
