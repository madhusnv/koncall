package com.onesignal.common.modeling;

import com.onesignal.common.modeling.Model;

/* loaded from: classes6.dex */
public interface ISingletonModelStoreChangeHandler<TModel extends Model> {
    void onModelReplaced(TModel tmodel, String str);

    void onModelUpdated(ModelChangedArgs modelChangedArgs, String str);
}
