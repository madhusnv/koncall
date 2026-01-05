package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.util.Immutable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SerializedModel implements Model {
    private final Serializable modelId;
    private final ModelSchema modelSchema;
    private final Map<String, Object> serializedData;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder implements BuilderSteps.SerializedDataStep, BuilderSteps.ModelSchemaStep, BuilderSteps.BuildStep {

        /* renamed from: id, reason: collision with root package name */
        private String f43777id;
        private ModelSchema modelSchema;
        private final Map<String, Object> serializedData;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.BuildStep
        public SerializedModel build() {
            return new SerializedModel(this.f43777id, Immutable.of(this.serializedData), this.modelSchema, 0);
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.ModelSchemaStep
        public BuilderSteps.SerializedDataStep modelSchema(ModelSchema modelSchema) {
            this.modelSchema = modelSchema;
            return this;
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.SerializedDataStep
        public BuilderSteps.BuildStep serializedData(Map<String, Object> map) {
            Map<String, Object> map2 = this.serializedData;
            Objects.requireNonNull(map);
            map2.putAll(map);
            this.f43777id = ModelIdentifier.Helper.getUniqueKey(this.modelSchema, map);
            return this;
        }

        private Builder() {
            this.serializedData = new HashMap();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface BuilderSteps {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public interface BuildStep {
            SerializedModel build();
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public interface ModelSchemaStep {
            SerializedDataStep modelSchema(ModelSchema modelSchema);
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public interface SerializedDataStep {
            BuildStep serializedData(Map<String, Object> map);
        }
    }

    public /* synthetic */ SerializedModel(Serializable serializable, Map map, ModelSchema modelSchema, int i10) {
        this(serializable, map, modelSchema);
    }

    public static BuilderSteps.ModelSchemaStep builder() {
        return new Builder(0);
    }

    public static <T extends Model> SerializedModel create(T t7, ModelSchema modelSchema) {
        return builder().modelSchema(modelSchema).serializedData(ModelConverter.toMap(t7, modelSchema)).build();
    }

    public static <T extends Model> SerializedModel difference(T t7, T t10, ModelSchema modelSchema) throws NoSuchFieldException, AmplifyException, SecurityException {
        if (t10 == null) {
            return create(t7, modelSchema);
        }
        Map<String, Object> map = ModelConverter.toMap(t7, modelSchema);
        Map<String, Object> map2 = ModelConverter.toMap(t10, modelSchema);
        HashMap map3 = new HashMap();
        for (String str : map.keySet()) {
            HashSet hashSet = new HashSet();
            hashSet.add(PrimaryKey.fieldName());
            hashSet.addAll(modelSchema.getPrimaryIndexFields());
            if (hashSet.contains(str) || !Objects.equals(map2.get(str), map.get(str))) {
                map3.put(str, map.get(str));
            }
        }
        return builder().modelSchema(modelSchema).serializedData(map3).build();
    }

    public static SerializedModel merge(SerializedModel serializedModel, SerializedModel serializedModel2, ModelSchema modelSchema) {
        HashMap map = new HashMap(serializedModel.serializedData);
        for (String str : serializedModel2.getSerializedData().keySet()) {
            if (!map.containsKey(str)) {
                map.put(str, serializedModel2.getSerializedData().get(str));
            }
        }
        return builder().modelSchema(modelSchema).serializedData(map).build();
    }

    public static Map<String, Object> parseSerializedData(Map<String, Object> map, String str, SchemaRegistry schemaRegistry) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ModelField> entry : schemaRegistry.getModelSchemaForModelClass(str).getFields().entrySet()) {
            String key = entry.getKey();
            ModelField value = entry.getValue();
            if (map.containsKey(key)) {
                Object obj = map.get(key);
                if (obj == null) {
                    map2.put(key, null);
                } else if (value.isModel()) {
                    ModelSchema modelSchemaForModelClass = schemaRegistry.getModelSchemaForModelClass(value.getTargetType());
                    Map<String, Object> map3 = (Map) map.get(key);
                    if (map3 != null) {
                        map2.put(key, builder().modelSchema(modelSchemaForModelClass).serializedData(map3).build());
                    }
                } else if (!value.isCustomType()) {
                    map2.put(key, obj);
                } else if (value.isArray()) {
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(SerializedCustomType.builder().serializedData(SerializedCustomType.parseSerializedData((Map) it.next(), value.getTargetType(), schemaRegistry)).customTypeSchema(schemaRegistry.getCustomTypeSchemaForCustomTypeClass(value.getTargetType())).build());
                        }
                    }
                    map2.put(key, arrayList);
                } else {
                    map2.put(key, SerializedCustomType.builder().serializedData(SerializedCustomType.parseSerializedData((Map) obj, value.getTargetType(), schemaRegistry)).customTypeSchema(schemaRegistry.getCustomTypeSchemaForCustomTypeClass(value.getTargetType())).build());
                }
            }
        }
        return map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SerializedModel.class == obj.getClass()) {
            SerializedModel serializedModel = (SerializedModel) obj;
            if (Objects.equals(this.modelId, serializedModel.modelId) && Objects.equals(this.serializedData, serializedModel.serializedData) && Objects.equals(this.modelSchema, serializedModel.modelSchema)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amplifyframework.core.model.Model
    public String getModelName() {
        ModelSchema modelSchema = this.modelSchema;
        if (modelSchema == null) {
            return null;
        }
        return modelSchema.getName();
    }

    public ModelSchema getModelSchema() {
        return this.modelSchema;
    }

    public Map<String, Object> getSerializedData() {
        return this.serializedData;
    }

    public Object getValue(ModelField modelField) {
        return this.serializedData.get(modelField.getName());
    }

    public int hashCode() {
        return Objects.hash(this.modelId, this.serializedData, this.modelSchema);
    }

    @Override // com.amplifyframework.core.model.Model
    public Serializable resolveIdentifier() {
        return this.modelId;
    }

    public String toString() {
        return "SerializedModel{id='" + this.modelId + "', serializedData=" + this.serializedData + ", modelName=" + getModelName() + '}';
    }

    private SerializedModel(Serializable serializable, Map<String, Object> map, ModelSchema modelSchema) {
        this.modelId = serializable;
        this.serializedData = map;
        this.modelSchema = modelSchema;
    }
}
