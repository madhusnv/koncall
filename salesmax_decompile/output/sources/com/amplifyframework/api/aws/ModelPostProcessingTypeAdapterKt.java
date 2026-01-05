package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p001o.bh3;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ModelPostProcessingTypeAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Serializable> getSortedIdentifiers(Model model) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Serializable serializableResolveIdentifier = model.resolveIdentifier();
        sq8.m48648g(serializableResolveIdentifier, "resolveIdentifier(...)");
        if (!(serializableResolveIdentifier instanceof ModelIdentifier)) {
            return bh3.m18963e(serializableResolveIdentifier.toString());
        }
        ModelIdentifier modelIdentifier = (ModelIdentifier) serializableResolveIdentifier;
        List listM18963e = bh3.m18963e(modelIdentifier.key());
        List<? extends Serializable> listSortedKeys = modelIdentifier.sortedKeys();
        sq8.m48648g(listSortedKeys, "sortedKeys(...)");
        return kh3.x0(listM18963e, listSortedKeys);
    }
}
