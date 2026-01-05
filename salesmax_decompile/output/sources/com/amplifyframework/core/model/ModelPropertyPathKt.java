package com.amplifyframework.core.model;

import java.util.Arrays;
import java.util.List;
import p001o.ch3;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ModelPropertyPathKt {
    public static final List<PropertyContainerPath> includes(PropertyContainerPath... propertyContainerPathArr) {
        sq8.m48649h(propertyContainerPathArr, "relationships");
        return ch3.m21249n(Arrays.copyOf(propertyContainerPathArr, propertyContainerPathArr.length));
    }
}
