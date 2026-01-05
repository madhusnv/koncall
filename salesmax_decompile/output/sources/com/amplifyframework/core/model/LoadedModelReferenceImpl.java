package com.amplifyframework.core.model;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.model.Model;
import java.util.Map;
import p001o.id5;
import p001o.isa;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class LoadedModelReferenceImpl<M extends Model> implements LoadedModelReference<M> {
    private final M value;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadedModelReferenceImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.amplifyframework.core.model.ModelReference
    public Map<String, Object> getIdentifier() {
        return isa.m32681h();
    }

    @Override // com.amplifyframework.core.model.LoadedModelReference
    public M getValue() {
        return this.value;
    }

    public LoadedModelReferenceImpl(M m) {
        this.value = m;
    }

    public /* synthetic */ LoadedModelReferenceImpl(Model model, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : model);
    }
}
