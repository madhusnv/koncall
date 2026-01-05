package com.amplifyframework.core.model;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelException;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ModelPath<ModelType extends Model> implements PropertyContainerPath {
    public static final Companion Companion = new Companion(null);
    private final boolean isCollection;
    private final Class<ModelType> modelType;
    private final String name;
    private final PropertyPath parent;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        @InternalAmplifyApi
        public final <M extends Model, P extends ModelPath<M>> P getRootPath(Class<M> clazz) throws IllegalAccessException, ModelException.PropertyPathNotFound, NoSuchFieldException, SecurityException, IllegalArgumentException {
            AbstractC4154l.m8923f(clazz, "clazz");
            try {
                Field declaredField = clazz.getDeclaredField("rootPath");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                P p4 = obj instanceof ModelPath ? (P) obj : null;
                if (p4 != null) {
                    return p4;
                }
                throw new ModelException.PropertyPathNotFound(clazz.getSimpleName(), null, 2, null);
            } catch (NoSuchFieldException unused) {
                throw new ModelException.PropertyPathNotFound(clazz.getSimpleName(), null, 2, null);
            }
        }

        private Companion() {
        }
    }

    public ModelPath(String name, boolean z6, PropertyPath propertyPath, Class<ModelType> modelType) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(modelType, "modelType");
        this.name = name;
        this.isCollection = z6;
        this.parent = propertyPath;
        this.modelType = modelType;
    }

    @Override // com.amplifyframework.core.model.PropertyPath
    @InternalAmplifyApi
    public PropertyPathMetadata getMetadata() {
        return new PropertyPathMetadata(this.name, this.isCollection, this.parent);
    }

    @Override // com.amplifyframework.core.model.PropertyContainerPath
    @InternalAmplifyApi
    public Class<Model> getModelType() {
        Class<ModelType> cls = this.modelType;
        AbstractC4154l.m8921d(cls, "null cannot be cast to non-null type java.lang.Class<com.amplifyframework.core.model.Model>");
        return cls;
    }

    public /* synthetic */ ModelPath(String str, boolean z6, PropertyPath propertyPath, Class cls, int i10, AbstractC4148f abstractC4148f) {
        this(str, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? null : propertyPath, cls);
    }
}
