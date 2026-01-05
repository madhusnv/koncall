package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.AppSyncGraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.MutationType;
import com.amplifyframework.api.graphql.Operation;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.api.graphql.QueryType;
import com.amplifyframework.api.graphql.SubscriptionType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.core.model.ModelPath;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.util.Casing;
import com.amplifyframework.util.TypeMaker;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001o.ch3;
import p001o.dh3;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AppSyncGraphQLRequestFactory {
    private static final int DEFAULT_QUERY_LIMIT = 1000;
    public static final AppSyncGraphQLRequestFactory INSTANCE = new AppSyncGraphQLRequestFactory();

    private AppSyncGraphQLRequestFactory() {
    }

    private final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildListQueryInternal(Class<T> cls, QueryPredicate queryPredicate, int i, Type type2, xk7 xk7Var, String str) {
        try {
            String name = ModelSchema.fromModelClass(cls).getName();
            sq8.m48648g(name, "getName(...)");
            AppSyncGraphQLRequest.Builder builderModelClass = AppSyncGraphQLRequest.builder().modelClass(cls);
            QueryType queryType = QueryType.LIST;
            AppSyncGraphQLRequest.Builder builderResponseType = builderModelClass.operation(queryType).requestOptions(new ApiGraphQLRequestOptions()).responseType(type2);
            if (!sq8.m48644c(QueryPredicates.all(), queryPredicate)) {
                builderResponseType.variable("filter", "Model" + Casing.capitalizeFirst(name) + "FilterInput", GraphQLRequestHelper.parsePredicate(queryPredicate));
            }
            builderResponseType.variable("limit", "Int", Integer.valueOf(i));
            if (str != null) {
                builderResponseType.variable(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, "String", str);
            }
            SelectionSet selectionSetCreateApiSelectionSet = xk7Var != null ? INSTANCE.createApiSelectionSet(cls, queryType, xk7Var) : null;
            if (selectionSetCreateApiSelectionSet != null) {
                builderResponseType.selectionSet(selectionSetCreateApiSelectionSet);
            }
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = builderResponseType.build();
            sq8.m48646e(appSyncGraphQLRequestBuild);
            return appSyncGraphQLRequestBuild;
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static /* synthetic */ GraphQLRequest buildListQueryInternal$default(AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory, Class cls, QueryPredicate queryPredicate, int i, Type type2, xk7 xk7Var, String str, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            str = null;
        }
        return appSyncGraphQLRequestFactory.buildListQueryInternal(cls, queryPredicate, i, type2, xk7Var, str);
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildMutation(T t, QueryPredicate queryPredicate, MutationType mutationType) {
        sq8.m48649h(t, "model");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(mutationType, "type");
        return INSTANCE.buildMutationInternal(t, queryPredicate, mutationType, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildMutationInternal(T t, QueryPredicate queryPredicate, MutationType mutationType, xk7 xk7Var) {
        try {
            Class<?> cls = t.getClass();
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            sq8.m48648g(modelSchemaFromModelClass, "fromModelClass(...)");
            String name = modelSchemaFromModelClass.getName();
            sq8.m48648g(name, "getName(...)");
            AppSyncGraphQLRequest.Builder builderResponseType = AppSyncGraphQLRequest.builder().operation(mutationType).modelClass(cls).requestOptions(new ApiGraphQLRequestOptions()).responseType(cls);
            String str = Casing.capitalize(mutationType.toString()) + Casing.capitalizeFirst(name) + "Input!";
            if (MutationType.DELETE == mutationType) {
                builderResponseType.variable("input", str, GraphQLRequestHelper.getDeleteMutationInputMap(modelSchemaFromModelClass, t));
            } else {
                builderResponseType.variable("input", str, GraphQLRequestHelper.getMapOfFieldNameAndValues(modelSchemaFromModelClass, t, mutationType));
            }
            if (!sq8.m48644c(QueryPredicates.all(), queryPredicate)) {
                builderResponseType.variable("condition", "Model" + Casing.capitalizeFirst(name) + "ConditionInput", GraphQLRequestHelper.parsePredicate(queryPredicate));
            }
            SelectionSet selectionSetCreateApiSelectionSet = xk7Var != null ? INSTANCE.createApiSelectionSet(cls, mutationType, xk7Var) : null;
            if (selectionSetCreateApiSelectionSet != null) {
                builderResponseType.selectionSet(selectionSetCreateApiSelectionSet);
            }
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = builderResponseType.build();
            sq8.m48646e(appSyncGraphQLRequestBuild);
            return appSyncGraphQLRequestBuild;
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildPaginatedResultQuery(Class<T> cls, QueryPredicate queryPredicate, int i) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(queryPredicate, "predicate");
        Type parameterizedType = TypeMaker.getParameterizedType(PaginatedResult.class, cls);
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
        sq8.m48646e(parameterizedType);
        return buildListQueryInternal$default(appSyncGraphQLRequestFactory, cls, queryPredicate, i, parameterizedType, null, null, 32, null);
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildQuery(Class<T> cls, String str) {
        GraphQLRequestVariable graphQLRequestVariable;
        String primaryKeyName;
        ModelField modelField;
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(str, "objectId");
        try {
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            sq8.m48648g(modelSchemaFromModelClass, "fromModelClass(...)");
            primaryKeyName = modelSchemaFromModelClass.getPrimaryKeyName();
            sq8.m48648g(primaryKeyName, "getPrimaryKeyName(...)");
            modelField = modelSchemaFromModelClass.getFields().get(primaryKeyName);
        } catch (Exception unused) {
            graphQLRequestVariable = new GraphQLRequestVariable(OutcomeConstants.OUTCOME_ID, str, "ID!");
        }
        if (modelField == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ModelField modelField2 = modelField;
        String str2 = modelField2.isRequired() ? "!" : "";
        graphQLRequestVariable = new GraphQLRequestVariable(primaryKeyName, str, modelField2.getTargetType() + str2);
        return INSTANCE.buildQueryInternal$aws_api_release(cls, null, graphQLRequestVariable);
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildSubscription(Class<T> cls, SubscriptionType subscriptionType) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(subscriptionType, "subscriptionType");
        return INSTANCE.buildSubscriptionInternal(cls, subscriptionType, null);
    }

    private final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildSubscriptionInternal(Class<T> cls, SubscriptionType subscriptionType, xk7 xk7Var) {
        try {
            AppSyncGraphQLRequest.Builder builderResponseType = AppSyncGraphQLRequest.builder().modelClass(cls).operation(subscriptionType).requestOptions(new ApiGraphQLRequestOptions()).responseType(cls);
            SelectionSet selectionSetCreateApiSelectionSet = xk7Var != null ? INSTANCE.createApiSelectionSet(cls, subscriptionType, xk7Var) : null;
            if (selectionSetCreateApiSelectionSet != null) {
                builderResponseType.selectionSet(selectionSetCreateApiSelectionSet);
            }
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = builderResponseType.build();
            sq8.m48646e(appSyncGraphQLRequestBuild);
            return appSyncGraphQLRequestBuild;
        } catch (AmplifyException e) {
            throw new IllegalStateException("Failed to build GraphQLRequest", e);
        }
    }

    private final <T extends Model, P extends ModelPath<T>> SelectionSet createApiSelectionSet(Class<T> cls, Operation operation, xk7 xk7Var) throws AmplifyException {
        SelectionSet selectionSetBuild = SelectionSet.builder().modelClass(cls).operation(operation).requestOptions(new ApiGraphQLRequestOptions()).includeRelationships((List) xk7Var.invoke(ModelPath.Companion.getRootPath(cls))).build();
        sq8.m48648g(selectionSetBuild, "build(...)");
        return selectionSetBuild;
    }

    public final <R, T extends Model> GraphQLRequest<R> buildModelPageQuery$aws_api_release(Class<T> cls, QueryPredicate queryPredicate, String str) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(queryPredicate, "predicate");
        Type parameterizedType = TypeMaker.getParameterizedType(ApiModelPage.class, cls);
        sq8.m48646e(parameterizedType);
        return buildListQueryInternal(cls, queryPredicate, 1000, parameterizedType, null, str);
    }

    public final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildQueryInternal$aws_api_release(Class<T> cls, xk7 xk7Var, GraphQLRequestVariable... graphQLRequestVariableArr) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(graphQLRequestVariableArr, "variables");
        try {
            AppSyncGraphQLRequest.Builder builderResponseType = AppSyncGraphQLRequest.builder().modelClass(cls).operation(QueryType.GET).requestOptions(new ApiGraphQLRequestOptions()).responseType(cls);
            for (GraphQLRequestVariable graphQLRequestVariable : graphQLRequestVariableArr) {
                builderResponseType.variable(graphQLRequestVariable.component1(), graphQLRequestVariable.component3(), graphQLRequestVariable.component2());
            }
            SelectionSet selectionSetCreateApiSelectionSet = xk7Var != null ? INSTANCE.createApiSelectionSet(cls, QueryType.GET, xk7Var) : null;
            if (selectionSetCreateApiSelectionSet != null) {
                builderResponseType.selectionSet(selectionSetCreateApiSelectionSet);
            }
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = builderResponseType.build();
            sq8.m48646e(appSyncGraphQLRequestBuild);
            return appSyncGraphQLRequestBuild;
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildMutation(T t, QueryPredicate queryPredicate, MutationType mutationType, xk7 xk7Var) {
        sq8.m48649h(t, "model");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(mutationType, "type");
        sq8.m48649h(xk7Var, "includes");
        return INSTANCE.buildMutationInternal(t, queryPredicate, mutationType, xk7Var);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildSubscription(Class<T> cls, SubscriptionType subscriptionType, xk7 xk7Var) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(subscriptionType, "subscriptionType");
        sq8.m48649h(xk7Var, "includes");
        return INSTANCE.buildSubscriptionInternal(cls, subscriptionType, xk7Var);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildPaginatedResultQuery(Class<T> cls, QueryPredicate queryPredicate, int i, xk7 xk7Var) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(xk7Var, "includes");
        Type parameterizedType = TypeMaker.getParameterizedType(PaginatedResult.class, cls);
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
        sq8.m48646e(parameterizedType);
        return buildListQueryInternal$default(appSyncGraphQLRequestFactory, cls, queryPredicate, i, parameterizedType, xk7Var, null, 32, null);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildQuery(Class<T> cls, String str, xk7 xk7Var) {
        GraphQLRequestVariable graphQLRequestVariable;
        String primaryKeyName;
        ModelField modelField;
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(str, "objectId");
        sq8.m48649h(xk7Var, "includes");
        try {
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            sq8.m48648g(modelSchemaFromModelClass, "fromModelClass(...)");
            primaryKeyName = modelSchemaFromModelClass.getPrimaryKeyName();
            sq8.m48648g(primaryKeyName, "getPrimaryKeyName(...)");
            modelField = modelSchemaFromModelClass.getFields().get(primaryKeyName);
        } catch (Exception unused) {
            graphQLRequestVariable = new GraphQLRequestVariable(OutcomeConstants.OUTCOME_ID, str, "ID!");
        }
        if (modelField != null) {
            ModelField modelField2 = modelField;
            String str2 = modelField2.isRequired() ? "!" : "";
            graphQLRequestVariable = new GraphQLRequestVariable(primaryKeyName, str, modelField2.getTargetType() + str2);
            return INSTANCE.buildQueryInternal$aws_api_release(cls, xk7Var, graphQLRequestVariable);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildQuery(Class<T> cls, ModelIdentifier<T> modelIdentifier) {
        Serializable string;
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(modelIdentifier, "modelIdentifier");
        try {
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            sq8.m48648g(modelSchemaFromModelClass, "fromModelClass(...)");
            List<String> primaryIndexFields = modelSchemaFromModelClass.getPrimaryIndexFields();
            sq8.m48648g(primaryIndexFields, "getPrimaryIndexFields(...)");
            List<? extends Serializable> listSortedKeys = modelIdentifier.sortedKeys();
            ArrayList arrayList = new ArrayList(dh3.m23088v(primaryIndexFields, 10));
            int i = 0;
            for (Object obj : primaryIndexFields) {
                int i2 = i + 1;
                if (i < 0) {
                    ch3.m21256u();
                }
                String str = (String) obj;
                ModelField modelField = modelSchemaFromModelClass.getFields().get(str);
                if (modelField != null) {
                    ModelField modelField2 = modelField;
                    String str2 = modelField2.isRequired() ? "!" : "";
                    String str3 = modelField2.getTargetType() + str2;
                    if (i == 0) {
                        string = modelIdentifier.key().toString();
                    } else {
                        string = listSortedKeys.get(i - 1);
                    }
                    sq8.m48646e(str);
                    sq8.m48646e(string);
                    arrayList.add(new GraphQLRequestVariable(str, string, str3));
                    i = i2;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
            GraphQLRequestVariable[] graphQLRequestVariableArr = (GraphQLRequestVariable[]) arrayList.toArray(new GraphQLRequestVariable[0]);
            return appSyncGraphQLRequestFactory.buildQueryInternal$aws_api_release(cls, null, (GraphQLRequestVariable[]) Arrays.copyOf(graphQLRequestVariableArr, graphQLRequestVariableArr.length));
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildQuery(Class<T> cls, ModelIdentifier<T> modelIdentifier, xk7 xk7Var) {
        Serializable string;
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(modelIdentifier, "modelIdentifier");
        sq8.m48649h(xk7Var, "includes");
        try {
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            sq8.m48648g(modelSchemaFromModelClass, "fromModelClass(...)");
            List<String> primaryIndexFields = modelSchemaFromModelClass.getPrimaryIndexFields();
            sq8.m48648g(primaryIndexFields, "getPrimaryIndexFields(...)");
            List<? extends Serializable> listSortedKeys = modelIdentifier.sortedKeys();
            ArrayList arrayList = new ArrayList(dh3.m23088v(primaryIndexFields, 10));
            int i = 0;
            for (Object obj : primaryIndexFields) {
                int i2 = i + 1;
                if (i < 0) {
                    ch3.m21256u();
                }
                String str = (String) obj;
                ModelField modelField = modelSchemaFromModelClass.getFields().get(str);
                if (modelField != null) {
                    ModelField modelField2 = modelField;
                    String str2 = modelField2.isRequired() ? "!" : "";
                    String str3 = modelField2.getTargetType() + str2;
                    if (i == 0) {
                        string = modelIdentifier.key().toString();
                    } else {
                        string = listSortedKeys.get(i - 1);
                    }
                    sq8.m48646e(str);
                    sq8.m48646e(string);
                    arrayList.add(new GraphQLRequestVariable(str, string, str3));
                    i = i2;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
            GraphQLRequestVariable[] graphQLRequestVariableArr = (GraphQLRequestVariable[]) arrayList.toArray(new GraphQLRequestVariable[0]);
            return appSyncGraphQLRequestFactory.buildQueryInternal$aws_api_release(cls, xk7Var, (GraphQLRequestVariable[]) Arrays.copyOf(graphQLRequestVariableArr, graphQLRequestVariableArr.length));
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildQuery(Class<T> cls, QueryPredicate queryPredicate) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(queryPredicate, "predicate");
        Type parameterizedType = TypeMaker.getParameterizedType(PaginatedResult.class, cls);
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
        sq8.m48646e(parameterizedType);
        return buildListQueryInternal$default(appSyncGraphQLRequestFactory, cls, queryPredicate, 1000, parameterizedType, null, null, 32, null);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildQuery(Class<T> cls, QueryPredicate queryPredicate, xk7 xk7Var) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(queryPredicate, "predicate");
        sq8.m48649h(xk7Var, "includes");
        Type parameterizedType = TypeMaker.getParameterizedType(PaginatedResult.class, cls);
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
        sq8.m48646e(parameterizedType);
        return buildListQueryInternal$default(appSyncGraphQLRequestFactory, cls, queryPredicate, 1000, parameterizedType, xk7Var, null, 32, null);
    }
}
