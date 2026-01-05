package com.amplifyframework.core.model;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes5.dex */
public interface Model {

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
        } catch (Exception e) {
            throw new IllegalStateException("Invalid Primary Key", e);
        }
    }

    default Serializable resolveIdentifier() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = getClass().getMethod("getId", new Class[0]).invoke(this, new Object[0]);
            Objects.requireNonNull(objInvoke);
            return (Serializable) objInvoke;
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Primary key field Id not found.", e);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Primary key field Id not found.", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Primary key field Id not found.", e3);
        }
    }
}
