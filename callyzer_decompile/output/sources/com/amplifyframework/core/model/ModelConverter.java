package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import i0.m0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ModelConverter {
    private ModelConverter() {
    }

    private static Map<String, Object> extractAssociateId(ModelField modelField, Model model, ModelSchema modelSchema) throws NoSuchFieldException, AmplifyException, SecurityException {
        Object objExtractFieldValue = extractFieldValue(modelField.getName(), model, modelSchema);
        if (!modelField.isModel() || !(objExtractFieldValue instanceof Model)) {
            if (modelField.isModel() && (objExtractFieldValue instanceof Map)) {
                return Collections.singletonMap("id", ((Map) objExtractFieldValue).get("id"));
            }
            if (modelField.isModel() && objExtractFieldValue == null) {
                return null;
            }
            throw new IllegalStateException("Associated data is not a Model or Map.");
        }
        Model model2 = (Model) objExtractFieldValue;
        ModelSchema modelSchemaForModelClass = SchemaRegistry.instance().getModelSchemaForModelClass(model2.getModelName());
        HashMap map = new HashMap();
        if (modelSchemaForModelClass.getPrimaryIndexFields().size() > 1 && (model2.resolveIdentifier() instanceof ModelIdentifier)) {
            ModelIdentifier modelIdentifier = (ModelIdentifier) model2.resolveIdentifier();
            ListIterator<String> listIterator = modelSchemaForModelClass.getPrimaryIndexFields().listIterator();
            map.put(listIterator.next(), modelIdentifier.key());
            ListIterator<? extends Serializable> listIterator2 = modelIdentifier.sortedKeys().listIterator();
            while (listIterator.hasNext()) {
                map.put(listIterator.next(), listIterator2.next());
            }
        } else {
            if (modelSchemaForModelClass.getPrimaryIndexFields().size() <= 1 || !(model2 instanceof SerializedModel)) {
                return Collections.singletonMap(modelSchemaForModelClass.getPrimaryIndexFields().get(0), model2.getPrimaryKeyString());
            }
            for (String str : modelSchemaForModelClass.getPrimaryIndexFields()) {
                map.put(str, ((SerializedModel) model2).getSerializedData().get(str));
            }
        }
        return map;
    }

    private static Object extractFieldValue(String str, Model model, ModelSchema modelSchema) throws NoSuchFieldException, AmplifyException, SecurityException {
        if (model instanceof SerializedModel) {
            return ((SerializedModel) model).getSerializedData().get(str);
        }
        try {
            Field declaredField = model.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(model);
        } catch (Exception e2) {
            StringBuilder sbM7383p = m0.m7383p("An invalid field was provided. ", str, " is not present in ");
            sbM7383p.append(modelSchema.getName());
            throw new AmplifyException(sbM7383p.toString(), e2, "Check if this model schema is a correct representation of the fields in the provided Object");
        }
    }

    public static <T extends Model> Map<String, Object> toMap(T t7, ModelSchema modelSchema) throws NoSuchFieldException, AmplifyException, SecurityException {
        SchemaRegistry schemaRegistryInstance = SchemaRegistry.instance();
        HashMap map = new HashMap();
        for (ModelField modelField : modelSchema.getFields().values()) {
            String name = modelField.getName();
            String targetType = modelField.getTargetType();
            ModelAssociation modelAssociation = modelSchema.getAssociations().get(name);
            if (modelAssociation == null) {
                if (!(t7 instanceof SerializedModel) || ((SerializedModel) t7).getSerializedData().containsKey(modelField.getName())) {
                    map.put(name, extractFieldValue(modelField.getName(), t7, modelSchema));
                }
            } else if (modelAssociation.isOwner()) {
                ModelSchema modelSchemaForModelClass = schemaRegistryInstance.getModelSchemaForModelClass(targetType);
                Map<String, Object> mapExtractAssociateId = extractAssociateId(modelField, t7, modelSchema);
                if (mapExtractAssociateId != null) {
                    map.put(name, SerializedModel.builder().modelSchema(modelSchemaForModelClass).serializedData(mapExtractAssociateId).build());
                }
            }
        }
        return map;
    }
}
