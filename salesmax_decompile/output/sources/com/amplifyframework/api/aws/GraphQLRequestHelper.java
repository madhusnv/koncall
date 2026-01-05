package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.api.graphql.MutationType;
import com.amplifyframework.core.model.AuthRule;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.LoadedModelReference;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelAssociation;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.core.model.ModelReference;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SerializedCustomType;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.core.model.query.predicate.BeginsWithQueryOperator;
import com.amplifyframework.core.model.query.predicate.BetweenQueryOperator;
import com.amplifyframework.core.model.query.predicate.ContainsQueryOperator;
import com.amplifyframework.core.model.query.predicate.EqualQueryOperator;
import com.amplifyframework.core.model.query.predicate.GreaterOrEqualQueryOperator;
import com.amplifyframework.core.model.query.predicate.GreaterThanQueryOperator;
import com.amplifyframework.core.model.query.predicate.LessOrEqualQueryOperator;
import com.amplifyframework.core.model.query.predicate.LessThanQueryOperator;
import com.amplifyframework.core.model.query.predicate.NotContainsQueryOperator;
import com.amplifyframework.core.model.query.predicate.NotEqualQueryOperator;
import com.amplifyframework.core.model.query.predicate.QueryOperator;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import com.amplifyframework.core.model.query.predicate.QueryPredicateOperation;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public class GraphQLRequestHelper {

    /* renamed from: com.amplifyframework.api.aws.GraphQLRequestHelper$1 */
    public static /* synthetic */ class C102891 {

        /* renamed from: $SwitchMap$com$amplifyframework$core$model$query$predicate$QueryOperator$Type */
        static final /* synthetic */ int[] f10622x44beeda4;

        static {
            int[] iArr = new int[QueryOperator.Type.values().length];
            f10622x44beeda4 = iArr;
            try {
                iArr[QueryOperator.Type.NOT_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.LESS_OR_EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.LESS_THAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.GREATER_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.BETWEEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.BEGINS_WITH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10622x44beeda4[QueryOperator.Type.NOT_CONTAINS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static String appSyncOpType(QueryOperator.Type type2) throws AmplifyException {
        switch (C102891.f10622x44beeda4[type2.ordinal()]) {
            case 1:
                return "ne";
            case 2:
                return "eq";
            case 3:
                return "le";
            case 4:
                return "lt";
            case 5:
                return "ge";
            case 6:
                return "gt";
            case 7:
                return "contains";
            case 8:
                return "between";
            case 9:
                return "beginsWith";
            default:
                throw new AmplifyException("Tried to parse an unsupported QueryOperator type", "Check if a new QueryOperator.Type enum has been created which is not supported in the AppSyncGraphQLRequestFactory.");
        }
    }

    private static Object appSyncOpValue(QueryOperator<?> queryOperator) throws AmplifyException {
        switch (C102891.f10622x44beeda4[queryOperator.type().ordinal()]) {
            case 1:
                return ((NotEqualQueryOperator) queryOperator).value();
            case 2:
                return ((EqualQueryOperator) queryOperator).value();
            case 3:
                return ((LessOrEqualQueryOperator) queryOperator).value();
            case 4:
                return ((LessThanQueryOperator) queryOperator).value();
            case 5:
                return ((GreaterOrEqualQueryOperator) queryOperator).value();
            case 6:
                return ((GreaterThanQueryOperator) queryOperator).value();
            case 7:
                return ((ContainsQueryOperator) queryOperator).value();
            case 8:
                BetweenQueryOperator betweenQueryOperator = (BetweenQueryOperator) queryOperator;
                return Arrays.asList(betweenQueryOperator.start(), betweenQueryOperator.end());
            case 9:
                return ((BeginsWithQueryOperator) queryOperator).value();
            case 10:
                return ((NotContainsQueryOperator) queryOperator).value();
            default:
                throw new AmplifyException("Tried to parse an unsupported QueryOperator type", "Check if a new QueryOperator.Type enum has been created which is not supported in the AppSyncGraphQLRequestFactory.");
        }
    }

    private static Object extractAssociateId(ModelField modelField, Object obj, Object obj2) {
        if ((modelField.isModel() || modelField.isModelReference()) && (obj2 instanceof Model)) {
            return ((Model) obj2).resolveIdentifier();
        }
        if (modelField.isModel() && (obj instanceof Map)) {
            return ((Map) obj).get(OutcomeConstants.OUTCOME_ID);
        }
        if (modelField.isModel() && obj == null) {
            return null;
        }
        if (!modelField.isModelReference() || !(obj instanceof ModelReference)) {
            throw new IllegalStateException("Associated data is not Model or Map.");
        }
        Map<String, Object> identifier = ((ModelReference) obj).getIdentifier();
        if (identifier.isEmpty()) {
            return null;
        }
        return identifier.get(OutcomeConstants.OUTCOME_ID);
    }

    private static Object extractCustomTypeFieldValue(String str, Object obj) throws AmplifyException {
        if (obj instanceof SerializedCustomType) {
            return ((SerializedCustomType) obj).getFlatSerializedData();
        }
        if (!(obj instanceof List)) {
            throw new AmplifyException("An invalid CustomType field was provided. " + str + " must be an instance of SerializedCustomType or a List of instances of SerializedCustomType", "Check if this model schema is a correct representation of the fields in the provided Object");
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (obj2 instanceof SerializedCustomType) {
                arrayList.add(((SerializedCustomType) obj2).getFlatSerializedData());
            } else {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0067 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Map<String, Object> extractFieldLevelData(ModelSchema modelSchema, Model model, MutationType mutationType) throws IllegalAccessException, NoSuchFieldException, AmplifyException, SecurityException, IllegalArgumentException {
        Object value;
        HashMap map = new HashMap();
        for (ModelField modelField : modelSchema.getFields().values()) {
            if (!modelField.isReadOnly()) {
                String name = modelField.getName();
                ModelAssociation modelAssociation = modelSchema.getAssociations().get(name);
                if (!(model instanceof SerializedModel) || ((SerializedModel) model).getSerializedData().containsKey(name)) {
                    Object objExtractFieldValue = extractFieldValue(modelField.getName(), model, modelSchema, Boolean.FALSE);
                    if (!modelField.isModelReference() || objExtractFieldValue == null) {
                        value = objExtractFieldValue;
                        if (modelAssociation != null) {
                            map.put(name, objExtractFieldValue);
                        } else if (modelAssociation.isOwner() && ((objExtractFieldValue != null && (!modelField.isModelReference() || value != null)) || !MutationType.CREATE.equals(mutationType))) {
                            if (modelSchema.getVersion() < 1 || modelAssociation.getTargetNames() == null || modelAssociation.getTargetNames().length <= 0) {
                                map.put(modelAssociation.getTargetName(), extractAssociateId(modelField, objExtractFieldValue, value));
                            } else {
                                insertForeignKeyValues(map, modelField, objExtractFieldValue, value, modelAssociation);
                            }
                        }
                    } else {
                        ModelReference modelReference = (ModelReference) objExtractFieldValue;
                        if (modelReference instanceof LoadedModelReference) {
                            value = ((LoadedModelReference) modelReference).getValue();
                        }
                        if (modelAssociation != null) {
                        }
                    }
                }
            }
        }
        return map;
    }

    private static Object extractFieldValue(String str, Model model, ModelSchema modelSchema, Boolean bool) throws IllegalAccessException, NoSuchFieldException, AmplifyException, SecurityException, IllegalArgumentException {
        if (model instanceof SerializedModel) {
            Map<String, Object> serializedData = ((SerializedModel) model).getSerializedData();
            ModelField modelField = modelSchema.getFields().get(str);
            Object obj = serializedData.get(str);
            return (obj == null || modelField == null || !modelField.isCustomType()) ? obj : extractCustomTypeFieldValue(str, serializedData.get(str));
        }
        try {
            Field declaredField = model.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(model);
            return (bool.booleanValue() && obj2 != null && declaredField.getType() == LoadedModelReference.class) ? ((LoadedModelReference) obj2).getValue() : obj2;
        } catch (Exception e) {
            throw new AmplifyException("An invalid field was provided. " + str + " is not present in " + modelSchema.getName(), e, "Check if this model schema is a correct representation of the fields in the provided Object");
        }
    }

    @InternalAmplifyApi
    public static Map<String, Object> getDeleteMutationInputMap(ModelSchema modelSchema, Model model) {
        HashMap map = new HashMap();
        for (String str : modelSchema.getPrimaryIndexFields()) {
            map.put(str, extractFieldValue(str, model, modelSchema, Boolean.TRUE));
        }
        return map;
    }

    @InternalAmplifyApi
    public static Map<String, Object> getMapOfFieldNameAndValues(ModelSchema modelSchema, Model model, MutationType mutationType) throws AmplifyException {
        boolean z = model instanceof SerializedModel;
        if (model.getClass().getSimpleName().equals(modelSchema.getName()) || z) {
            HashMap map = new HashMap(extractFieldLevelData(modelSchema, model, mutationType));
            for (AuthRule authRule : modelSchema.getAuthRules()) {
                if (AuthStrategy.OWNER.equals(authRule.getAuthStrategy())) {
                    String ownerFieldOrDefault = authRule.getOwnerFieldOrDefault();
                    if (map.containsKey(ownerFieldOrDefault) && map.get(ownerFieldOrDefault) == null) {
                        map.remove(ownerFieldOrDefault);
                    }
                }
            }
            return map;
        }
        throw new AmplifyException("The object provided is not an instance of " + modelSchema.getName() + ".", "Please provide an instance of " + modelSchema.getName() + " that matches the schema type.");
    }

    private static void insertForeignKeyValues(Map<String, Object> map, ModelField modelField, Object obj, Object obj2, ModelAssociation modelAssociation) {
        int i = 0;
        if (modelField.isModel() && obj == null) {
            String[] targetNames = modelAssociation.getTargetNames();
            int length = targetNames.length;
            while (i < length) {
                map.put(targetNames[i], null);
                i++;
            }
            return;
        }
        if ((!modelField.isModel() && !modelField.isModelReference()) || !(obj2 instanceof Model)) {
            if (modelField.isModelReference() && (obj instanceof ModelReference) && ((ModelReference) obj).getIdentifier().isEmpty()) {
                String[] targetNames2 = modelAssociation.getTargetNames();
                int length2 = targetNames2.length;
                while (i < length2) {
                    map.put(targetNames2[i], null);
                    i++;
                }
                return;
            }
            return;
        }
        Model model = (Model) obj2;
        if (model.resolveIdentifier() instanceof ModelIdentifier) {
            ModelIdentifier modelIdentifier = (ModelIdentifier) model.resolveIdentifier();
            ListIterator listIterator = Arrays.asList(modelAssociation.getTargetNames()).listIterator();
            ListIterator<? extends Serializable> listIterator2 = modelIdentifier.sortedKeys().listIterator();
            map.put((String) listIterator.next(), modelIdentifier.key());
            while (listIterator.hasNext()) {
                map.put((String) listIterator.next(), listIterator2.next());
            }
            return;
        }
        if (!(obj2 instanceof SerializedModel)) {
            map.put(modelAssociation.getTargetNames()[0], model.resolveIdentifier().toString());
            return;
        }
        SerializedModel serializedModel = (SerializedModel) obj2;
        ModelSchema modelSchema = serializedModel.getModelSchema();
        if (modelSchema == null || modelSchema.getPrimaryIndexFields().size() <= 1) {
            map.put(modelAssociation.getTargetNames()[0], model.resolveIdentifier().toString());
            return;
        }
        ListIterator<String> listIterator3 = modelSchema.getPrimaryIndexFields().listIterator();
        String[] targetNames3 = modelAssociation.getTargetNames();
        int length3 = targetNames3.length;
        while (i < length3) {
            map.put(targetNames3[i], serializedModel.getSerializedData().get(listIterator3.next()));
            i++;
        }
    }

    @InternalAmplifyApi
    public static Map<String, Object> parsePredicate(QueryPredicate queryPredicate) throws AmplifyException {
        if (queryPredicate instanceof QueryPredicateOperation) {
            QueryPredicateOperation queryPredicateOperation = (QueryPredicateOperation) queryPredicate;
            QueryOperator queryOperatorOperator = queryPredicateOperation.operator();
            return Collections.singletonMap(queryPredicateOperation.field(), Collections.singletonMap(appSyncOpType(queryOperatorOperator.type()), appSyncOpValue(queryOperatorOperator)));
        }
        if (!(queryPredicate instanceof QueryPredicateGroup)) {
            throw new AmplifyException("Tried to parse an unsupported QueryPredicate", "Try changing to one of the supported values: QueryPredicateOperation, QueryPredicateGroup.");
        }
        QueryPredicateGroup queryPredicateGroup = (QueryPredicateGroup) queryPredicate;
        if (QueryPredicateGroup.Type.NOT.equals(queryPredicateGroup.type())) {
            try {
                return Collections.singletonMap("not", parsePredicate(queryPredicateGroup.predicates().get(0)));
            } catch (IndexOutOfBoundsException e) {
                throw new AmplifyException("Predicate group of type NOT must include a value to negate.", e, "Check if you created a NOT condition in your Predicate with no included value.");
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<QueryPredicate> it = queryPredicateGroup.predicates().iterator();
        while (it.hasNext()) {
            arrayList.add(parsePredicate(it.next()));
        }
        return Collections.singletonMap(queryPredicateGroup.type().toString().toLowerCase(Locale.getDefault()), arrayList);
    }
}
