package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CreateBotActionInput;
import type.CustomType;
import type.ModelBotActionConditionInput;

/* loaded from: classes3.dex */
public final class CreateBotActionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateBotAction($input: CreateBotActionInput!, $condition: ModelBotActionConditionInput) {\n  createBotAction(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    type\n    endpoint\n    payload\n    description\n    isPaused\n    createdAt\n    updatedAt\n    botMappings {\n      __typename\n      nextToken\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateBotAction";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateBotAction($input: CreateBotActionInput!, $condition: ModelBotActionConditionInput) {\n  createBotAction(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    type\n    endpoint\n    payload\n    description\n    isPaused\n    createdAt\n    updatedAt\n    botMappings {\n      __typename\n      nextToken\n    }\n  }\n}";
    private final Variables variables;

    public static class BotMappings {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<BotMappings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public BotMappings map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = BotMappings.$responseFields;
                return new BotMappings(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public BotMappings(String str, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BotMappings)) {
                return false;
            }
            BotMappings botMappings = (BotMappings) obj;
            if (this.__typename.equals(botMappings.__typename)) {
                String str = this.nextToken;
                String str2 = botMappings.nextToken;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMutation.BotMappings.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = BotMappings.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], BotMappings.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], BotMappings.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BotMappings{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Builder {
        private ModelBotActionConditionInput condition;
        private CreateBotActionInput input;

        public CreateBotActionMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateBotActionMutation(this.input, this.condition);
        }

        public Builder condition(ModelBotActionConditionInput modelBotActionConditionInput) {
            this.condition = modelBotActionConditionInput;
            return this;
        }

        public Builder input(CreateBotActionInput createBotActionInput) {
            this.input = createBotActionInput;
            return this;
        }
    }

    public static class CreateBotAction {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final BotMappings botMappings;
        final String createdAt;
        final String description;
        final String endpoint;
        final String id;
        final Boolean isPaused;
        final String name;
        final String payload;

        /* renamed from: type, reason: collision with root package name */
        final String f58058type;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<CreateBotAction> {
            final BotMappings.Mapper botMappingsFieldMapper = new BotMappings.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateBotAction map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateBotAction.$responseFields;
                return new CreateBotAction(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readBoolean(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (BotMappings) responseReader.readObject(responseFieldArr[11], new ResponseReader.ObjectReader<BotMappings>() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMutation.CreateBotAction.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public BotMappings read(ResponseReader responseReader2) {
                        return Mapper.this.botMappingsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("endpoint", "endpoint", null, true, Collections.emptyList()), ResponseField.forCustomType("payload", "payload", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forBoolean("isPaused", "isPaused", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("botMappings", "botMappings", null, true, Collections.emptyList())};
        }

        public CreateBotAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, BotMappings botMappings) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.f58058type = str5;
            this.endpoint = str6;
            this.payload = str7;
            this.description = str8;
            this.isPaused = bool;
            this.createdAt = str9;
            this.updatedAt = str10;
            this.botMappings = botMappings;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public BotMappings botMappings() {
            return this.botMappings;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String description() {
            return this.description;
        }

        public String endpoint() {
            return this.endpoint;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Boolean bool;
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateBotAction)) {
                return false;
            }
            CreateBotAction createBotAction = (CreateBotAction) obj;
            if (this.__typename.equals(createBotAction.__typename) && this.id.equals(createBotAction.id) && this.accountId.equals(createBotAction.accountId) && ((str = this.name) != null ? str.equals(createBotAction.name) : createBotAction.name == null) && ((str2 = this.f58058type) != null ? str2.equals(createBotAction.f58058type) : createBotAction.f58058type == null) && ((str3 = this.endpoint) != null ? str3.equals(createBotAction.endpoint) : createBotAction.endpoint == null) && ((str4 = this.payload) != null ? str4.equals(createBotAction.payload) : createBotAction.payload == null) && ((str5 = this.description) != null ? str5.equals(createBotAction.description) : createBotAction.description == null) && ((bool = this.isPaused) != null ? bool.equals(createBotAction.isPaused) : createBotAction.isPaused == null) && ((str6 = this.createdAt) != null ? str6.equals(createBotAction.createdAt) : createBotAction.createdAt == null) && ((str7 = this.updatedAt) != null ? str7.equals(createBotAction.updatedAt) : createBotAction.updatedAt == null)) {
                BotMappings botMappings = this.botMappings;
                BotMappings botMappings2 = createBotAction.botMappings;
                if (botMappings == null) {
                    if (botMappings2 == null) {
                        return true;
                    }
                } else if (botMappings.equals(botMappings2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.f58058type;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.endpoint;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.payload;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.description;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Boolean bool = this.isPaused;
                int iHashCode7 = (iHashCode6 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str6 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedAt;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                BotMappings botMappings = this.botMappings;
                this.$hashCode = iHashCode9 ^ (botMappings != null ? botMappings.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isPaused() {
            return this.isPaused;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMutation.CreateBotAction.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateBotAction.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateBotAction.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateBotAction.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateBotAction.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], CreateBotAction.this.name);
                    responseWriter.writeString(responseFieldArr[4], CreateBotAction.this.f58058type);
                    responseWriter.writeString(responseFieldArr[5], CreateBotAction.this.endpoint);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], CreateBotAction.this.payload);
                    responseWriter.writeString(responseFieldArr[7], CreateBotAction.this.description);
                    responseWriter.writeBoolean(responseFieldArr[8], CreateBotAction.this.isPaused);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreateBotAction.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], CreateBotAction.this.updatedAt);
                    ResponseField responseField = responseFieldArr[11];
                    BotMappings botMappings = CreateBotAction.this.botMappings;
                    responseWriter.writeObject(responseField, botMappings != null ? botMappings.marshaller() : null);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String payload() {
            return this.payload;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateBotAction{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", type=" + this.f58058type + ", endpoint=" + this.endpoint + ", payload=" + this.payload + ", description=" + this.description + ", isPaused=" + this.isPaused + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", botMappings=" + this.botMappings + "}";
            }
            return this.$toString;
        }

        public String type() {
            return this.f58058type;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createBotAction", "createBotAction", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateBotAction createBotAction;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateBotAction.Mapper createBotActionFieldMapper = new CreateBotAction.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateBotAction) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateBotAction>() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateBotAction read(ResponseReader responseReader2) {
                        return Mapper.this.createBotActionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateBotAction createBotAction) {
            this.createBotAction = createBotAction;
        }

        public CreateBotAction createBotAction() {
            return this.createBotAction;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateBotAction createBotAction = this.createBotAction;
            CreateBotAction createBotAction2 = ((Data) obj).createBotAction;
            return createBotAction == null ? createBotAction2 == null : createBotAction.equals(createBotAction2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateBotAction createBotAction = this.createBotAction;
                this.$hashCode = (createBotAction == null ? 0 : createBotAction.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateBotAction createBotAction = Data.this.createBotAction;
                    responseWriter.writeObject(responseField, createBotAction != null ? createBotAction.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createBotAction=" + this.createBotAction + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelBotActionConditionInput condition;
        private final CreateBotActionInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateBotActionInput createBotActionInput, ModelBotActionConditionInput modelBotActionConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createBotActionInput;
            this.condition = modelBotActionConditionInput;
            linkedHashMap.put("input", createBotActionInput);
            linkedHashMap.put("condition", modelBotActionConditionInput);
        }

        public ModelBotActionConditionInput condition() {
            return this.condition;
        }

        public CreateBotActionInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMutation.Variables.1
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

    public CreateBotActionMutation(CreateBotActionInput createBotActionInput, ModelBotActionConditionInput modelBotActionConditionInput) {
        Utils.checkNotNull(createBotActionInput, "input == null");
        this.variables = new Variables(createBotActionInput, modelBotActionConditionInput);
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
        return "5154018859ba0a8d51dcd8cde9ccb70b7ac445dd9a62a95399150d616ed74985";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateBotAction($input: CreateBotActionInput!, $condition: ModelBotActionConditionInput) {\n  createBotAction(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    type\n    endpoint\n    payload\n    description\n    isPaused\n    createdAt\n    updatedAt\n    botMappings {\n      __typename\n      nextToken\n    }\n  }\n}";
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
