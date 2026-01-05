package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.model.LoadedModelReferenceImpl;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelAssociation;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelSchema;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class ModelPostProcessingTypeAdapter implements TypeAdapterFactory {
    private final String apiName;
    private final AWSApiSchemaRegistry schemaRegistry;

    public ModelPostProcessingTypeAdapter(String str, AWSApiSchemaRegistry aWSApiSchemaRegistry) {
        sq8.m48649h(aWSApiSchemaRegistry, "schemaRegistry");
        this.apiName = str;
        this.schemaRegistry = aWSApiSchemaRegistry;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <M> TypeAdapter<M> create(Gson gson, TypeToken<M> typeToken) {
        sq8.m48649h(gson, "gson");
        sq8.m48649h(typeToken, "type");
        final TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, typeToken);
        return new TypeAdapter<M>() { // from class: com.amplifyframework.api.aws.ModelPostProcessingTypeAdapter.create.1
            public final void injectLazyValues(Model model) throws IllegalAccessException, AmplifyException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
                sq8.m48649h(model, "parent");
                String simpleName = model.getClass().getSimpleName();
                ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(model.getClass());
                sq8.m48648g(modelSchemaFromModelClass, "fromModelClass(...)");
                Map<String, ModelField> fields = modelSchemaFromModelClass.getFields();
                sq8.m48648g(fields, "getFields(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ModelField> entry : fields.entrySet()) {
                    if (entry.getValue().isModelList() || entry.getValue().isModelReference()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ModelPostProcessingTypeAdapter modelPostProcessingTypeAdapter = this;
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Field declaredField = model.getClass().getDeclaredField((String) entry2.getKey());
                    declaredField.setAccessible(true);
                    if (declaredField.get(model) == null) {
                        ModelField modelField = (ModelField) entry2.getValue();
                        if (((ModelField) entry2.getValue()).isModelReference()) {
                            declaredField.set(model, new LoadedModelReferenceImpl(null));
                        } else {
                            if (((ModelField) entry2.getValue()).isModelList()) {
                                AWSApiSchemaRegistry aWSApiSchemaRegistry = modelPostProcessingTypeAdapter.schemaRegistry;
                                String targetType = modelField.getTargetType();
                                sq8.m48648g(targetType, "getTargetType(...)");
                                ModelSchema modelSchemaForModelClass = aWSApiSchemaRegistry.getModelSchemaForModelClass(targetType);
                                for (ModelAssociation modelAssociation : modelSchemaForModelClass.getAssociations().values()) {
                                    if (sq8.m48644c(modelAssociation.getAssociatedType(), simpleName)) {
                                        String[] targetNames = modelAssociation.getTargetNames();
                                        List sortedIdentifiers = ModelPostProcessingTypeAdapterKt.getSortedIdentifiers(model);
                                        sq8.m48646e(targetNames);
                                        ArrayList arrayList2 = new ArrayList(targetNames.length);
                                        int length = targetNames.length;
                                        int i = 0;
                                        int i2 = 0;
                                        while (i < length) {
                                            arrayList2.add(vyh.m53620a(targetNames[i], sortedIdentifiers.get(i2)));
                                            i++;
                                            i2++;
                                        }
                                        Map mapM32691r = isa.m32691r(arrayList2);
                                        Class<? extends Model> modelClass = modelSchemaForModelClass.getModelClass();
                                        sq8.m48648g(modelClass, "getModelClass(...)");
                                        declaredField.set(model, new ApiLazyModelList(modelClass, mapM32691r, modelPostProcessingTypeAdapter.apiName, null, 8, null));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            continue;
                        }
                    }
                    arrayList.add(y3i.f54824a);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public M read2(JsonReader jsonReader) throws IllegalAccessException, AmplifyException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
                sq8.m48649h(jsonReader, "in");
                M m = delegateAdapter.read2(jsonReader);
                Model model = m instanceof Model ? (Model) m : null;
                if (model != null) {
                    injectLazyValues(model);
                }
                return m;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, M m) {
                sq8.m48649h(jsonWriter, "out");
                delegateAdapter.write(jsonWriter, m);
            }
        };
    }
}
