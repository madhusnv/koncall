package com.amplifyframework.core.model;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.model.Model;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface ModelReference<M extends Model> {
    @InternalAmplifyApi
    Map<String, Object> getIdentifier();
}
