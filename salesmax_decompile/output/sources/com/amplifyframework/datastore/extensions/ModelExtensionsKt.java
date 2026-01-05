package com.amplifyframework.datastore.extensions;

import com.amplifyframework.core.model.Model;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ModelExtensionsKt {
    public static final String getMetadataSQLitePrimaryKey(Model model) {
        sq8.m48649h(model, "<this>");
        return model.getModelName() + "|" + model.getPrimaryKeyString();
    }
}
