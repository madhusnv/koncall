package com.amplifyframework.core.model;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SerializedCustomType {
    private static final Logger LOGGER = Amplify.Logging.logger(CategoryType.DATASTORE, SerializedCustomType.class.getName());
    private final CustomTypeSchema customTypeSchema;
    private Map<String, Object> flatSerializedData;
    private final Map<String, Object> serializedData;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder implements BuilderSteps.SerializedDataStep, BuilderSteps.CustomTypeSchemaStep, BuilderSteps.BuildStep {
        private CustomTypeSchema customTypeSchema;
        private final Map<String, Object> serializedData;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        @Override // com.amplifyframework.core.model.SerializedCustomType.BuilderSteps.BuildStep
        public SerializedCustomType build() {
            return new SerializedCustomType(Immutable.of(this.serializedData), this.customTypeSchema, 0);
        }

        @Override // com.amplifyframework.core.model.SerializedCustomType.BuilderSteps.CustomTypeSchemaStep
        public BuilderSteps.BuildStep customTypeSchema(CustomTypeSchema customTypeSchema) {
            this.customTypeSchema = customTypeSchema;
            return this;
        }

        @Override // com.amplifyframework.core.model.SerializedCustomType.BuilderSteps.SerializedDataStep
        public BuilderSteps.CustomTypeSchemaStep serializedData(Map<String, Object> map) {
            Map<String, Object> map2 = this.serializedData;
            Objects.requireNonNull(map);
            map2.putAll(map);
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
            SerializedCustomType build();
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public interface CustomTypeSchemaStep {
            BuildStep customTypeSchema(CustomTypeSchema customTypeSchema);
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public interface SerializedDataStep {
            CustomTypeSchemaStep serializedData(Map<String, Object> map);
        }
    }

    public /* synthetic */ SerializedCustomType(Map map, CustomTypeSchema customTypeSchema, int i10) {
        this(map, customTypeSchema);
    }

    public static BuilderSteps.SerializedDataStep builder() {
        return new Builder(0);
    }

    public static Map<String, Object> parseSerializedData(Map<String, Object> map, String str, SchemaRegistry schemaRegistry) {
        LOGGER.verbose(String.format("parseSerializedData: serializedData=%s, customTypeName=%s", map, str));
        HashMap map2 = new HashMap();
        for (Map.Entry<String, CustomTypeField> entry : schemaRegistry.getCustomTypeSchemaForCustomTypeClass(str).getFields().entrySet()) {
            String key = entry.getKey();
            CustomTypeField value = entry.getValue();
            if (map.containsKey(key)) {
                Object obj = map.get(key);
                if (obj == null) {
                    map2.put(key, null);
                } else {
                    boolean zIsCustomType = value.isCustomType();
                    boolean zIsArray = value.isArray();
                    LOGGER.verbose("Deserializing field " + key + ": isCustomType=" + zIsCustomType + ", isArray=" + zIsArray);
                    if (!zIsCustomType) {
                        map2.put(key, obj);
                    } else if (zIsArray) {
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList();
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(builder().serializedData(parseSerializedData((Map) it.next(), value.getTargetType(), schemaRegistry)).customTypeSchema(schemaRegistry.getCustomTypeSchemaForCustomTypeClass(value.getTargetType())).build());
                            }
                        }
                        map2.put(key, arrayList);
                    } else {
                        map2.put(key, builder().serializedData(parseSerializedData((Map) obj, value.getTargetType(), schemaRegistry)).customTypeSchema(schemaRegistry.getCustomTypeSchemaForCustomTypeClass(value.getTargetType())).build());
                    }
                }
            }
        }
        return map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SerializedCustomType.class == obj.getClass()) {
            SerializedCustomType serializedCustomType = (SerializedCustomType) obj;
            if (Objects.equals(this.serializedData, serializedCustomType.serializedData) && Objects.equals(this.customTypeSchema, serializedCustomType.customTypeSchema)) {
                return true;
            }
        }
        return false;
    }

    public String getCustomTypeName() {
        CustomTypeSchema customTypeSchema = this.customTypeSchema;
        if (customTypeSchema == null) {
            return null;
        }
        return customTypeSchema.getName();
    }

    public CustomTypeSchema getCustomTypeSchema() {
        return this.customTypeSchema;
    }

    public Map<String, Object> getFlatSerializedData() {
        Map<String, Object> map = this.flatSerializedData;
        if (map != null) {
            return map;
        }
        LOGGER.verbose(String.format("getFlatSerializedData: serializedData=%s", this.serializedData));
        this.flatSerializedData = new HashMap();
        for (Map.Entry<String, Object> entry : this.serializedData.entrySet()) {
            CustomTypeField customTypeField = this.customTypeSchema.getFields().get(entry.getKey());
            if (customTypeField != null) {
                Object value = entry.getValue();
                boolean zIsCustomType = customTypeField.isCustomType();
                boolean zIsArray = customTypeField.isArray();
                LOGGER.verbose("Flattening field " + customTypeField.getName() + ": isCustomType=" + zIsCustomType + ", isArray=" + zIsArray);
                if (!customTypeField.isCustomType() || value == null) {
                    this.flatSerializedData.put(entry.getKey(), value);
                } else if (customTypeField.isArray()) {
                    ArrayList arrayList = (ArrayList) value;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        arrayList2.add(((SerializedCustomType) obj).getFlatSerializedData());
                    }
                    this.flatSerializedData.put(entry.getKey(), arrayList2);
                } else {
                    this.flatSerializedData.put(entry.getKey(), ((SerializedCustomType) value).getFlatSerializedData());
                }
            }
        }
        return this.flatSerializedData;
    }

    public Map<String, Object> getSerializedData() {
        return this.serializedData;
    }

    public Object getValue(ModelField modelField) {
        return this.serializedData.get(modelField.getName());
    }

    public int hashCode() {
        return Objects.hash(this.serializedData, this.customTypeSchema);
    }

    public String toString() {
        return "SerializedCustomType{serializedData=" + this.serializedData + ", customTypeName=" + getCustomTypeSchema() + '}';
    }

    private SerializedCustomType(Map<String, Object> map, CustomTypeSchema customTypeSchema) {
        this.serializedData = map;
        this.customTypeSchema = customTypeSchema;
    }
}
