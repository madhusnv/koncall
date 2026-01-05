package com.onesignal.common.modeling;

import com.onesignal.common.modeling.Model;

/* loaded from: classes6.dex */
public interface IModelStoreChangeHandler<TModel extends Model> {
    void onModelAdded(TModel tmodel, String str);

    void onModelRemoved(TModel tmodel, String str);

    void onModelUpdated(ModelChangedArgs modelChangedArgs, String str);
}
