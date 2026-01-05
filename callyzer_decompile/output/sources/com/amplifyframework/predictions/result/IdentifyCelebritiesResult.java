package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.CelebrityDetails;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IdentifyCelebritiesResult implements IdentifyResult {
    private final List<CelebrityDetails> celebrities;

    private IdentifyCelebritiesResult(List<CelebrityDetails> list) {
        this.celebrities = list;
    }

    public static IdentifyCelebritiesResult fromCelebrities(List<CelebrityDetails> list) {
        Objects.requireNonNull(list);
        return new IdentifyCelebritiesResult(list);
    }

    public List<CelebrityDetails> getCelebrities() {
        return Immutable.of(this.celebrities);
    }
}
