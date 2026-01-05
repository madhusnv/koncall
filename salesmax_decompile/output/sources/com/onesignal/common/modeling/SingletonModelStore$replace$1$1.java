package com.onesignal.common.modeling;

import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class SingletonModelStore$replace$1$1 extends kf9 implements xk7 {

    /* JADX INFO: Incorrect field signature: TTModel; */
    final /* synthetic */ Model $existingModel;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TTModel;Ljava/lang/String;)V */
    public SingletonModelStore$replace$1$1(Model model, String str) {
        super(1);
        this.$existingModel = model;
        this.$tag = str;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ISingletonModelStoreChangeHandler) obj);
        return y3i.f54824a;
    }

    public final void invoke(ISingletonModelStoreChangeHandler<TModel> iSingletonModelStoreChangeHandler) {
        sq8.m48649h(iSingletonModelStoreChangeHandler, "it");
        iSingletonModelStoreChangeHandler.onModelReplaced(this.$existingModel, this.$tag);
    }
}
