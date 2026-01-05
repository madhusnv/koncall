package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.EntityDetails;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IdentifyEntitiesResult implements IdentifyResult {
    private final List<EntityDetails> entities;

    private IdentifyEntitiesResult(List<EntityDetails> list) {
        this.entities = list;
    }

    public static IdentifyEntitiesResult fromEntityDetails(List<EntityDetails> list) {
        Objects.requireNonNull(list);
        return new IdentifyEntitiesResult(list);
    }

    public List<EntityDetails> getEntities() {
        return Immutable.of(this.entities);
    }
}
