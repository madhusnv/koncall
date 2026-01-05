package com.amplifyframework.core.model;

import android.annotation.SuppressLint;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.amplifyframework.util.FieldFinder;
import com.amplifyframework.util.Immutable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelSchema {
    private final Map<String, ModelAssociation> associations;
    private final List<AuthRule> authRules;
    private final Map<String, ModelField> fields;
    private final Map<String, ModelIndex> indexes;
    private final String listPluralName;
    private final Class<? extends Model> modelClass;
    private final int modelSchemaVersion;
    private final Model.Type modelType;
    private final String name;
    private final String pluralName;
    private final String syncPluralName;

    public static final class Builder {
        private String listPluralName;
        private Class<? extends Model> modelClass;
        private int modelSchemaVersion;
        private String name;
        private String pluralName;
        private String syncPluralName;

        /* renamed from: type, reason: collision with root package name */
        private Model.Type f58096type;
        private final List<AuthRule> authRules = new ArrayList();
        private final Map<String, ModelField> fields = new TreeMap();
        private final Map<String, ModelAssociation> associations = new TreeMap();
        private final Map<String, ModelIndex> indexes = new TreeMap();

        public Builder associations(Map<String, ModelAssociation> map) {
            Objects.requireNonNull(map);
            this.associations.clear();
            this.associations.putAll(map);
            return this;
        }

        public Builder authRules(List<AuthRule> list) {
            Objects.requireNonNull(list);
            this.authRules.clear();
            this.authRules.addAll(list);
            return this;
        }

        @SuppressLint({"SyntheticAccessor"})
        public ModelSchema build() {
            Objects.requireNonNull(this.name);
            return new ModelSchema(this);
        }

        public Builder fields(Map<String, ModelField> map) {
            Objects.requireNonNull(map);
            this.fields.clear();
            this.fields.putAll(map);
            return this;
        }

        public Builder indexes(Map<String, ModelIndex> map) {
            Objects.requireNonNull(map);
            this.indexes.clear();
            this.indexes.putAll(map);
            return this;
        }

        public Builder listPluralName(String str) {
            this.listPluralName = str;
            return this;
        }

        public Builder modelClass(Class<? extends Model> cls) {
            this.modelClass = cls;
            return this;
        }

        public Builder modelType(Model.Type type2) {
            this.f58096type = type2;
            return this;
        }

        public Builder name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        public Builder pluralName(String str) {
            this.pluralName = str;
            return this;
        }

        public Builder syncPluralName(String str) {
            this.syncPluralName = str;
            return this;
        }

        public Builder version(int i) {
            this.modelSchemaVersion = i;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static ModelAssociation createModelAssociation(Field field) {
        if (field.isAnnotationPresent(BelongsTo.class)) {
            BelongsTo belongsTo = (BelongsTo) field.getAnnotation(BelongsTo.class);
            Objects.requireNonNull(belongsTo);
            BelongsTo belongsTo2 = belongsTo;
            return ModelAssociation.builder().name(BelongsTo.class.getSimpleName()).targetName(belongsTo2.targetName()).targetNames(belongsTo2.targetNames()).associatedType(belongsTo2.type().getSimpleName()).associatedName(field.getName()).build();
        }
        if (field.isAnnotationPresent(HasOne.class)) {
            HasOne hasOne = (HasOne) field.getAnnotation(HasOne.class);
            Objects.requireNonNull(hasOne);
            HasOne hasOne2 = hasOne;
            return ModelAssociation.builder().name(HasOne.class.getSimpleName()).targetNames(hasOne2.targetNames()).associatedName(hasOne2.associatedWith()).associatedType(hasOne2.type().getSimpleName()).build();
        }
        if (!field.isAnnotationPresent(HasMany.class)) {
            return null;
        }
        HasMany hasMany = (HasMany) field.getAnnotation(HasMany.class);
        Objects.requireNonNull(hasMany);
        HasMany hasMany2 = hasMany;
        return ModelAssociation.builder().name(HasMany.class.getSimpleName()).associatedName(hasMany2.associatedWith()).associatedType(hasMany2.type().getSimpleName()).build();
    }

    private static ModelField createModelField(Field field) {
        com.amplifyframework.core.model.annotations.ModelField modelField = (com.amplifyframework.core.model.annotations.ModelField) field.getAnnotation(com.amplifyframework.core.model.annotations.ModelField.class);
        if (modelField == null) {
            return null;
        }
        String name = field.getName();
        Class<?> type2 = (field.getType() == ModelReference.class && (field.getGenericType() instanceof ParameterizedType)) ? (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0] : field.getType();
        String strTargetType = modelField.targetType();
        ArrayList arrayList = new ArrayList();
        for (com.amplifyframework.core.model.annotations.AuthRule authRule : modelField.authRules()) {
            arrayList.add(new AuthRule(authRule));
        }
        ModelField.ModelFieldBuilder modelFieldBuilderJavaClassForValue = ModelField.builder().name(name).javaClassForValue(type2);
        if (strTargetType.isEmpty()) {
            strTargetType = type2.getSimpleName();
        }
        return modelFieldBuilderJavaClassForValue.targetType(strTargetType).isReadOnly(modelField.isReadOnly()).isRequired(modelField.isRequired()).isArray(Collection.class.isAssignableFrom(field.getType())).isEnum(Enum.class.isAssignableFrom(field.getType())).isModel(Model.class.isAssignableFrom(field.getType())).isModelReference(ModelReference.class.isAssignableFrom(field.getType())).isModelList(ModelList.class.isAssignableFrom(field.getType())).authRules(arrayList).build();
    }

    private static ModelIndex createModelIndex(Index index) {
        return ModelIndex.builder().indexName(index.name()).indexFieldNames(Arrays.asList(index.fields())).build();
    }

    public static ModelSchema fromModelClass(Class<? extends Model> cls) throws AmplifyException {
        try {
            List<Field> listFindModelFieldsIn = FieldFinder.findModelFieldsIn(cls);
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            TreeMap treeMap3 = new TreeMap();
            ArrayList arrayList = new ArrayList();
            ModelConfig modelConfig = (ModelConfig) cls.getAnnotation(ModelConfig.class);
            String simpleName = cls.getSimpleName();
            String strSyncPluralName = null;
            String strPluralName = (modelConfig == null || modelConfig.pluralName().isEmpty()) ? null : modelConfig.pluralName();
            Model.Type type2 = modelConfig != null ? modelConfig.type() : Model.Type.USER;
            String strListPluralName = (modelConfig == null || modelConfig.listPluralName().isEmpty()) ? null : modelConfig.listPluralName();
            if (modelConfig != null && !modelConfig.syncPluralName().isEmpty()) {
                strSyncPluralName = modelConfig.syncPluralName();
            }
            int iVersion = modelConfig != null ? modelConfig.version() : 0;
            if (modelConfig != null) {
                com.amplifyframework.core.model.annotations.AuthRule[] authRuleArrAuthRules = modelConfig.authRules();
                int length = authRuleArrAuthRules.length;
                int i = 0;
                while (i < length) {
                    arrayList.add(new AuthRule(authRuleArrAuthRules[i]));
                    i++;
                    authRuleArrAuthRules = authRuleArrAuthRules;
                }
            }
            Annotation[] annotations = cls.getAnnotations();
            int length2 = annotations.length;
            int i2 = 0;
            while (i2 < length2) {
                Annotation annotation = annotations[i2];
                Annotation[] annotationArr = annotations;
                int i3 = length2;
                if (annotation.annotationType().isAssignableFrom(Indexes.class)) {
                    Index[] indexArrValue = ((Indexes) annotation).value();
                    int length3 = indexArrValue.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        Index[] indexArr = indexArrValue;
                        ModelIndex modelIndexCreateModelIndex = createModelIndex(indexArrValue[i4]);
                        treeMap3.put(modelIndexCreateModelIndex.getIndexName(), modelIndexCreateModelIndex);
                        i4++;
                        length3 = length3;
                        indexArrValue = indexArr;
                    }
                } else if (annotation.annotationType().isAssignableFrom(Index.class)) {
                    ModelIndex modelIndexCreateModelIndex2 = createModelIndex((Index) annotation);
                    treeMap3.put(modelIndexCreateModelIndex2.getIndexName(), modelIndexCreateModelIndex2);
                }
                i2++;
                annotations = annotationArr;
                length2 = i3;
            }
            for (Field field : listFindModelFieldsIn) {
                ModelField modelFieldCreateModelField = createModelField(field);
                if (modelFieldCreateModelField != null) {
                    treeMap.put(field.getName(), modelFieldCreateModelField);
                }
                ModelAssociation modelAssociationCreateModelAssociation = createModelAssociation(field);
                if (modelAssociationCreateModelAssociation != null) {
                    treeMap2.put(field.getName(), modelAssociationCreateModelAssociation);
                }
            }
            return builder().name(simpleName).pluralName(strPluralName).listPluralName(strListPluralName).syncPluralName(strSyncPluralName).authRules(arrayList).fields(treeMap).associations(treeMap2).indexes(treeMap3).modelClass(cls).modelType(type2).version(iVersion).build();
        } catch (Exception e) {
            throw new AmplifyException("Error in constructing a ModelSchema.", e, "Sorry, we don’t have a recovery suggestion for this error.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelSchema.class != obj.getClass()) {
            return false;
        }
        ModelSchema modelSchema = (ModelSchema) obj;
        return s6c.m47909a(getName(), modelSchema.getName()) && s6c.m47909a(getPluralName(), modelSchema.getPluralName()) && s6c.m47909a(getListPluralName(), modelSchema.getListPluralName()) && s6c.m47909a(getSyncPluralName(), modelSchema.getSyncPluralName()) && s6c.m47909a(getAuthRules(), modelSchema.getAuthRules()) && s6c.m47909a(getFields(), modelSchema.getFields()) && s6c.m47909a(getAssociations(), modelSchema.getAssociations()) && s6c.m47909a(getIndexes(), modelSchema.getIndexes()) && s6c.m47909a(getModelClass(), modelSchema.getModelClass());
    }

    public Map<String, ModelAssociation> getAssociations() {
        return Immutable.of(this.associations);
    }

    public List<AuthRule> getAuthRules() {
        return this.authRules;
    }

    public Map<String, ModelField> getFields() {
        return this.fields;
    }

    public Map<String, ModelIndex> getIndexes() {
        return this.indexes;
    }

    public String getListPluralName() {
        return this.listPluralName;
    }

    public Class<? extends Model> getModelClass() {
        return this.modelClass;
    }

    public Model.Type getModelType() {
        return this.modelType;
    }

    public String getName() {
        return this.name;
    }

    public String getPluralName() {
        return this.pluralName;
    }

    public List<String> getPrimaryIndexFields() {
        ModelIndex modelIndex = this.indexes.get(SQLiteCommandFactory.UNDEFINED);
        return (modelIndex == null || modelIndex.getIndexFieldNames().size() < 1) ? Arrays.asList(PrimaryKey.fieldName()) : modelIndex.getIndexFieldNames();
    }

    public String getPrimaryKeyName() {
        return getPrimaryIndexFields().get(0);
    }

    public String getSyncPluralName() {
        return this.syncPluralName;
    }

    public int getVersion() {
        return this.modelSchemaVersion;
    }

    public boolean hasModelLevelRules() {
        return this.authRules.size() > 0;
    }

    public int hashCode() {
        return s6c.m47910b(getName(), getPluralName(), getListPluralName(), getSyncPluralName(), getAuthRules(), getFields(), getAssociations(), getIndexes(), getModelClass(), Integer.valueOf(getVersion()));
    }

    public String toString() {
        return "ModelSchema{name='" + this.name + "', pluralName='" + this.pluralName + "', listPluralName='" + this.listPluralName + "', syncPluralName='" + this.syncPluralName + "', authRules=" + this.authRules + ", fields=" + this.fields + ", associations=" + this.associations + ", indexes=" + this.indexes + ", modelClass=" + this.modelClass + ", modelSchemaVersion=" + this.modelSchemaVersion + '}';
    }

    private ModelSchema(Builder builder) {
        this.name = builder.name;
        this.pluralName = builder.pluralName;
        this.listPluralName = builder.listPluralName;
        this.syncPluralName = builder.syncPluralName;
        this.authRules = builder.authRules;
        this.fields = builder.fields;
        this.associations = builder.associations;
        this.indexes = builder.indexes;
        this.modelClass = builder.modelClass;
        this.modelType = builder.f58096type;
        this.modelSchemaVersion = builder.modelSchemaVersion;
    }
}
