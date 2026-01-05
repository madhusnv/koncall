package com.amplifyframework.core.model;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Model {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum Type {
        USER,
        SYSTEM
    }

    default String getModelName() {
        return getClass().getSimpleName();
    }

    default String getPrimaryKeyString() {
        try {
            return resolveIdentifier() instanceof ModelIdentifier ? ((ModelIdentifier) resolveIdentifier()).getIdentifier() : resolveIdentifier().toString();
        } catch (Exception e2) {
            throw new IllegalStateException("Invalid Primary Key", e2);
        }
    }

    default Serializable resolveIdentifier() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = getClass().getMethod("getId", null).invoke(this, null);
            Objects.requireNonNull(objInvoke);
            return (Serializable) objInvoke;
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Primary key field Id not found.", e2);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Primary key field Id not found.", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Primary key field Id not found.", e11);
        }
    }
}
