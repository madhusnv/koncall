package com.amplifyframework.core.model;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.model.Model;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ModelReference<M extends Model> {
    @InternalAmplifyApi
    Map<String, Object> getIdentifier();
}
