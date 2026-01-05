package com.amplifyframework.core.model;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelException;
import java.lang.reflect.Field;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class ModelPath<ModelType extends Model> implements PropertyContainerPath {
    public static final Companion Companion = new Companion(null);
    private final boolean isCollection;
    private final Class<ModelType> modelType;
    private final String name;
    private final PropertyPath parent;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        @InternalAmplifyApi
        public final <M extends Model, P extends ModelPath<M>> P getRootPath(Class<M> cls) throws IllegalAccessException, ModelException.PropertyPathNotFound, NoSuchFieldException, SecurityException, IllegalArgumentException {
            sq8.m48649h(cls, "clazz");
            try {
                Field declaredField = cls.getDeclaredField("rootPath");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                P p = obj instanceof ModelPath ? (P) obj : null;
                if (p != null) {
                    return p;
                }
                String simpleName = cls.getSimpleName();
                sq8.m48648g(simpleName, "getSimpleName(...)");
                throw new ModelException.PropertyPathNotFound(simpleName, null, 2, null);
            } catch (NoSuchFieldException unused) {
                String simpleName2 = cls.getSimpleName();
                sq8.m48648g(simpleName2, "getSimpleName(...)");
                throw new ModelException.PropertyPathNotFound(simpleName2, null, 2, null);
            }
        }
    }

    public ModelPath(String str, boolean z, PropertyPath propertyPath, Class<ModelType> cls) {
        sq8.m48649h(str, "name");
        sq8.m48649h(cls, "modelType");
        this.name = str;
        this.isCollection = z;
        this.parent = propertyPath;
        this.modelType = cls;
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
        sq8.m48647f(cls, "null cannot be cast to non-null type java.lang.Class<com.amplifyframework.core.model.Model>");
        return cls;
    }

    public /* synthetic */ ModelPath(String str, boolean z, PropertyPath propertyPath, Class cls, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : propertyPath, cls);
    }
}
