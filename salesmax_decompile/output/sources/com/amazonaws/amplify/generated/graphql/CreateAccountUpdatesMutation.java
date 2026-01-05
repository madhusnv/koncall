package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.ActionType;
import type.CreateAccountUpdatesInput;
import type.CustomType;
import type.EntityType;
import type.ModelAccountUpdatesConditionInput;

/* loaded from: classes.dex */
public final class CreateAccountUpdatesMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateAccountUpdates($input: CreateAccountUpdatesInput!, $condition: ModelAccountUpdatesConditionInput) {\n  createAccountUpdates(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    entityType\n    entityId\n    actionType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateAccountUpdatesMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateAccountUpdates";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateAccountUpdates($input: CreateAccountUpdatesInput!, $condition: ModelAccountUpdatesConditionInput) {\n  createAccountUpdates(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    entityType\n    entityId\n    actionType\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelAccountUpdatesConditionInput condition;
        private CreateAccountUpdatesInput input;

        public CreateAccountUpdatesMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateAccountUpdatesMutation(this.input, this.condition);
        }

        public Builder condition(ModelAccountUpdatesConditionInput modelAccountUpdatesConditionInput) {
            this.condition = modelAccountUpdatesConditionInput;
            return this;
        }

        public Builder input(CreateAccountUpdatesInput createAccountUpdatesInput) {
            this.input = createAccountUpdatesInput;
            return this;
        }
    }

    public static class CreateAccountUpdates {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final ActionType actionType;
        final String createdAt;
        final String entityId;
        final EntityType entityType;
        final String id;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<CreateAccountUpdates> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateAccountUpdates map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateAccountUpdates.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                EntityType entityTypeValueOf = string2 != null ? EntityType.valueOf(string2) : null;
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                return new CreateAccountUpdates(string, str, str2, str3, entityTypeValueOf, str4, string3 != null ? ActionType.valueOf(string3) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forString("entityType", "entityType", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, customType, Collections.emptyList()), ResponseField.forString("actionType", "actionType", null, false, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public CreateAccountUpdates(String str, String str2, String str3, String str4, EntityType entityType, String str5, ActionType actionType, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str4, "userId == null");
            this.entityType = (EntityType) Utils.checkNotNull(entityType, "entityType == null");
            this.entityId = (String) Utils.checkNotNull(str5, "entityId == null");
            this.actionType = (ActionType) Utils.checkNotNull(actionType, "actionType == null");
            this.createdAt = (String) Utils.checkNotNull(str6, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str7, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ActionType actionType() {
            return this.actionType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String entityId() {
            return this.entityId;
        }

        public EntityType entityType() {
            return this.entityType;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateAccountUpdates)) {
                return false;
            }
            CreateAccountUpdates createAccountUpdates = (CreateAccountUpdates) obj;
            return this.__typename.equals(createAccountUpdates.__typename) && this.id.equals(createAccountUpdates.id) && this.accountId.equals(createAccountUpdates.accountId) && this.userId.equals(createAccountUpdates.userId) && this.entityType.equals(createAccountUpdates.entityType) && this.entityId.equals(createAccountUpdates.entityId) && this.actionType.equals(createAccountUpdates.actionType) && this.createdAt.equals(createAccountUpdates.createdAt) && this.updatedAt.equals(createAccountUpdates.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                this.$hashCode = ((((((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.entityType.hashCode()) * 1000003) ^ this.entityId.hashCode()) * 1000003) ^ this.actionType.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateAccountUpdatesMutation.CreateAccountUpdates.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateAccountUpdates.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateAccountUpdates.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateAccountUpdates.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateAccountUpdates.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateAccountUpdates.this.userId);
                    responseWriter.writeString(responseFieldArr[4], CreateAccountUpdates.this.entityType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], CreateAccountUpdates.this.entityId);
                    responseWriter.writeString(responseFieldArr[6], CreateAccountUpdates.this.actionType.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CreateAccountUpdates.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], CreateAccountUpdates.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateAccountUpdates{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", entityType=" + this.entityType + ", entityId=" + this.entityId + ", actionType=" + this.actionType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createAccountUpdates", "createAccountUpdates", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateAccountUpdates createAccountUpdates;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateAccountUpdates.Mapper createAccountUpdatesFieldMapper = new CreateAccountUpdates.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateAccountUpdates) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateAccountUpdates>() { // from class: com.amazonaws.amplify.generated.graphql.CreateAccountUpdatesMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateAccountUpdates read(ResponseReader responseReader2) {
                        return Mapper.this.createAccountUpdatesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateAccountUpdates createAccountUpdates) {
            this.createAccountUpdates = createAccountUpdates;
        }

        public CreateAccountUpdates createAccountUpdates() {
            return this.createAccountUpdates;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateAccountUpdates createAccountUpdates = this.createAccountUpdates;
            CreateAccountUpdates createAccountUpdates2 = ((Data) obj).createAccountUpdates;
            return createAccountUpdates == null ? createAccountUpdates2 == null : createAccountUpdates.equals(createAccountUpdates2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateAccountUpdates createAccountUpdates = this.createAccountUpdates;
                this.$hashCode = (createAccountUpdates == null ? 0 : createAccountUpdates.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateAccountUpdatesMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateAccountUpdates createAccountUpdates = Data.this.createAccountUpdates;
                    responseWriter.writeObject(responseField, createAccountUpdates != null ? createAccountUpdates.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createAccountUpdates=" + this.createAccountUpdates + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelAccountUpdatesConditionInput condition;
        private final CreateAccountUpdatesInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateAccountUpdatesInput createAccountUpdatesInput, ModelAccountUpdatesConditionInput modelAccountUpdatesConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createAccountUpdatesInput;
            this.condition = modelAccountUpdatesConditionInput;
            linkedHashMap.put("input", createAccountUpdatesInput);
            linkedHashMap.put("condition", modelAccountUpdatesConditionInput);
        }

        public ModelAccountUpdatesConditionInput condition() {
            return this.condition;
        }

        public CreateAccountUpdatesInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateAccountUpdatesMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                    inputFieldWriter.writeObject("condition", Variables.this.condition != null ? Variables.this.condition.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public CreateAccountUpdatesMutation(CreateAccountUpdatesInput createAccountUpdatesInput, ModelAccountUpdatesConditionInput modelAccountUpdatesConditionInput) {
        Utils.checkNotNull(createAccountUpdatesInput, "input == null");
        this.variables = new Variables(createAccountUpdatesInput, modelAccountUpdatesConditionInput);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "79d9deca453ec379330485f5f1fd0365440a209527634762efe3d091b776c558";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateAccountUpdates($input: CreateAccountUpdatesInput!, $condition: ModelAccountUpdatesConditionInput) {\n  createAccountUpdates(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    entityType\n    entityId\n    actionType\n    createdAt\n    updatedAt\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Variables variables() {
        return this.variables;
    }
}
