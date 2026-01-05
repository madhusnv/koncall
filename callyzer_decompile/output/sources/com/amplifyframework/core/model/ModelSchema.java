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
import com.amplifyframework.util.FieldFinder;
import com.amplifyframework.util.Immutable;
import com.sun.mail.util.AbstractC1452a;
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

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private String listPluralName;
        private Class<? extends Model> modelClass;
        private int modelSchemaVersion;
        private String name;
        private String pluralName;
        private String syncPluralName;
        private Model.Type type;
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
            return new ModelSchema(this, 0);
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

        public Builder modelType(Model.Type type) {
            this.type = type;
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

        public Builder version(int i10) {
            this.modelSchemaVersion = i10;
            return this;
        }
    }

    public /* synthetic */ ModelSchema(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static ModelAssociation createModelAssociation(Field field) {
        if (field.isAnnotationPresent(BelongsTo.class)) {
            BelongsTo belongsTo = (BelongsTo) field.getAnnotation(BelongsTo.class);
            Objects.requireNonNull(belongsTo);
            BelongsTo belongsTo2 = belongsTo;
            return ModelAssociation.builder().name("BelongsTo").targetName(belongsTo2.targetName()).targetNames(belongsTo2.targetNames()).associatedType(belongsTo2.type().getSimpleName()).associatedName(field.getName()).build();
        }
        if (field.isAnnotationPresent(HasOne.class)) {
            HasOne hasOne = (HasOne) field.getAnnotation(HasOne.class);
            Objects.requireNonNull(hasOne);
            HasOne hasOne2 = hasOne;
            return ModelAssociation.builder().name("HasOne").targetNames(hasOne2.targetNames()).associatedName(hasOne2.associatedWith()).associatedType(hasOne2.type().getSimpleName()).build();
        }
        if (!field.isAnnotationPresent(HasMany.class)) {
            return null;
        }
        HasMany hasMany = (HasMany) field.getAnnotation(HasMany.class);
        Objects.requireNonNull(hasMany);
        HasMany hasMany2 = hasMany;
        return ModelAssociation.builder().name("HasMany").associatedName(hasMany2.associatedWith()).associatedType(hasMany2.type().getSimpleName()).build();
    }

    private static ModelField createModelField(Field field) {
        com.amplifyframework.core.model.annotations.ModelField modelField = (com.amplifyframework.core.model.annotations.ModelField) field.getAnnotation(com.amplifyframework.core.model.annotations.ModelField.class);
        if (modelField == null) {
            return null;
        }
        String name = field.getName();
        Class<?> type = (field.getType() == ModelReference.class && (field.getGenericType() instanceof ParameterizedType)) ? (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0] : field.getType();
        String strTargetType = modelField.targetType();
        ArrayList arrayList = new ArrayList();
        for (com.amplifyframework.core.model.annotations.AuthRule authRule : modelField.authRules()) {
            arrayList.add(new AuthRule(authRule));
        }
        ModelField.ModelFieldBuilder modelFieldBuilderJavaClassForValue = ModelField.builder().name(name).javaClassForValue(type);
        if (strTargetType.isEmpty()) {
            strTargetType = type.getSimpleName();
        }
        return modelFieldBuilderJavaClassForValue.targetType(strTargetType).isReadOnly(modelField.isReadOnly()).isRequired(modelField.isRequired()).isArray(Collection.class.isAssignableFrom(field.getType())).isEnum(Enum.class.isAssignableFrom(field.getType())).isModel(Model.class.isAssignableFrom(field.getType())).isModelReference(ModelReference.class.isAssignableFrom(field.getType())).isModelList(ModelList.class.isAssignableFrom(field.getType())).authRules(arrayList).build();
    }

    private static ModelIndex createModelIndex(Index index) {
        return ModelIndex.builder().indexName(index.name()).indexFieldNames(Arrays.asList(index.fields())).build();
    }

    public static ModelSchema fromModelClass(Class<? extends Model> cls) throws AmplifyException {
        int i10;
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
            Model.Type type = modelConfig != null ? modelConfig.type() : Model.Type.USER;
            String strListPluralName = (modelConfig == null || modelConfig.listPluralName().isEmpty()) ? null : modelConfig.listPluralName();
            if (modelConfig != null && !modelConfig.syncPluralName().isEmpty()) {
                strSyncPluralName = modelConfig.syncPluralName();
            }
            int iVersion = modelConfig != null ? modelConfig.version() : 0;
            if (modelConfig != null) {
                com.amplifyframework.core.model.annotations.AuthRule[] authRuleArrAuthRules = modelConfig.authRules();
                int length = authRuleArrAuthRules.length;
                int i11 = 0;
                while (i11 < length) {
                    arrayList.add(new AuthRule(authRuleArrAuthRules[i11]));
                    i11++;
                    listFindModelFieldsIn = listFindModelFieldsIn;
                }
            }
            List<Field> list = listFindModelFieldsIn;
            Annotation[] annotations = cls.getAnnotations();
            int length2 = annotations.length;
            int i12 = 0;
            while (i12 < length2) {
                Annotation annotation = annotations[i12];
                Annotation[] annotationArr = annotations;
                if (annotation.annotationType().isAssignableFrom(Indexes.class)) {
                    Index[] indexArrValue = ((Indexes) annotation).value();
                    int length3 = indexArrValue.length;
                    int i13 = 0;
                    while (i13 < length3) {
                        Index[] indexArr = indexArrValue;
                        ModelIndex modelIndexCreateModelIndex = createModelIndex(indexArrValue[i13]);
                        treeMap3.put(modelIndexCreateModelIndex.getIndexName(), modelIndexCreateModelIndex);
                        i13++;
                        length2 = length2;
                        indexArrValue = indexArr;
                    }
                    i10 = length2;
                } else {
                    i10 = length2;
                    if (annotation.annotationType().isAssignableFrom(Index.class)) {
                        ModelIndex modelIndexCreateModelIndex2 = createModelIndex((Index) annotation);
                        treeMap3.put(modelIndexCreateModelIndex2.getIndexName(), modelIndexCreateModelIndex2);
                    }
                }
                i12++;
                annotations = annotationArr;
                length2 = i10;
            }
            for (Field field : list) {
                ModelField modelFieldCreateModelField = createModelField(field);
                if (modelFieldCreateModelField != null) {
                    treeMap.put(field.getName(), modelFieldCreateModelField);
                }
                ModelAssociation modelAssociationCreateModelAssociation = createModelAssociation(field);
                if (modelAssociationCreateModelAssociation != null) {
                    treeMap2.put(field.getName(), modelAssociationCreateModelAssociation);
                }
            }
            return builder().name(simpleName).pluralName(strPluralName).listPluralName(strListPluralName).syncPluralName(strSyncPluralName).authRules(arrayList).fields(treeMap).associations(treeMap2).indexes(treeMap3).modelClass(cls).modelType(type).version(iVersion).build();
        } catch (Exception e2) {
            throw new AmplifyException("Error in constructing a ModelSchema.", e2, "Sorry, we don’t have a recovery suggestion for this error.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ModelSchema.class == obj.getClass()) {
            ModelSchema modelSchema = (ModelSchema) obj;
            if (Objects.equals(getName(), modelSchema.getName()) && Objects.equals(getPluralName(), modelSchema.getPluralName()) && Objects.equals(getListPluralName(), modelSchema.getListPluralName()) && Objects.equals(getSyncPluralName(), modelSchema.getSyncPluralName()) && Objects.equals(getAuthRules(), modelSchema.getAuthRules()) && Objects.equals(getFields(), modelSchema.getFields()) && Objects.equals(getAssociations(), modelSchema.getAssociations()) && Objects.equals(getIndexes(), modelSchema.getIndexes()) && Objects.equals(getModelClass(), modelSchema.getModelClass())) {
                return true;
            }
        }
        return false;
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
        ModelIndex modelIndex = this.indexes.get("undefined");
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
        return Objects.hash(getName(), getPluralName(), getListPluralName(), getSyncPluralName(), getAuthRules(), getFields(), getAssociations(), getIndexes(), getModelClass(), Integer.valueOf(getVersion()));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ModelSchema{name='");
        sb2.append(this.name);
        sb2.append("', pluralName='");
        sb2.append(this.pluralName);
        sb2.append("', listPluralName='");
        sb2.append(this.listPluralName);
        sb2.append("', syncPluralName='");
        sb2.append(this.syncPluralName);
        sb2.append("', authRules=");
        sb2.append(this.authRules);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", associations=");
        sb2.append(this.associations);
        sb2.append(", indexes=");
        sb2.append(this.indexes);
        sb2.append(", modelClass=");
        sb2.append(this.modelClass);
        sb2.append(", modelSchemaVersion=");
        return AbstractC1452a.m4563j(sb2, this.modelSchemaVersion, '}');
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
        this.modelType = builder.type;
        this.modelSchemaVersion = builder.modelSchemaVersion;
    }
}
