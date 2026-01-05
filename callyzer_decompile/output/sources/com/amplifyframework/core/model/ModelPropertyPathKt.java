package com.amplifyframework.core.model;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ModelPropertyPathKt {
    public static final List<PropertyContainerPath> includes(PropertyContainerPath... relationships) {
        AbstractC4154l.m8923f(relationships, "relationships");
        return pe.m10834i(Arrays.copyOf(relationships, relationships.length));
    }
}
