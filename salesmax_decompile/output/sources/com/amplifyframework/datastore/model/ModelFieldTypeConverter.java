package com.amplifyframework.datastore.model;

import com.amplifyframework.core.model.ModelField;

/* loaded from: classes5.dex */
public interface ModelFieldTypeConverter<S, T> {
    Object convertValueFromSource(S s, ModelField modelField);

    Object convertValueFromTarget(T t, ModelField modelField);
}
