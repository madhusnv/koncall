package com.amplifyframework.core.model;

import com.amplifyframework.core.model.Model;
import java.util.List;

/* loaded from: classes5.dex */
public interface LoadedModelList<M extends Model> extends ModelList<M> {
    List<M> getItems();
}
