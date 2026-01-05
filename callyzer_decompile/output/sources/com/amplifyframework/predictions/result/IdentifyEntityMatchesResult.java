package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.EntityMatch;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IdentifyEntityMatchesResult implements IdentifyResult {
    private final List<EntityMatch> entityMatches;

    private IdentifyEntityMatchesResult(List<EntityMatch> list) {
        this.entityMatches = list;
    }

    public static IdentifyEntityMatchesResult fromEntityMatches(List<EntityMatch> list) {
        Objects.requireNonNull(list);
        return new IdentifyEntityMatchesResult(list);
    }

    public List<EntityMatch> getEntityMatches() {
        return Immutable.of(this.entityMatches);
    }
}
