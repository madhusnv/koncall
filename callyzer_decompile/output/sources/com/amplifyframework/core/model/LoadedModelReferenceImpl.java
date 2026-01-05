package com.amplifyframework.core.model;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.model.Model;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class LoadedModelReferenceImpl<M extends Model> implements LoadedModelReference<M> {
    private final M value;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadedModelReferenceImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.amplifyframework.core.model.ModelReference
    public Map<String, Object> getIdentifier() {
        return C6669s.f31944a;
    }

    @Override // com.amplifyframework.core.model.LoadedModelReference
    public M getValue() {
        return this.value;
    }

    public LoadedModelReferenceImpl(M m10) {
        this.value = m10;
    }

    public /* synthetic */ LoadedModelReferenceImpl(Model model, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : model);
    }
}
