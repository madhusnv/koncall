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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CreateCustomFormDefinitionsInput;
import type.CustomType;
import type.LayoutType;
import type.ModelCustomFormDefinitionsConditionInput;

/* loaded from: classes6.dex */
public final class CreateCustomFormDefinitionsMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateCustomFormDefinitions($input: CreateCustomFormDefinitionsInput!, $condition: ModelCustomFormDefinitionsConditionInput) {\n  createCustomFormDefinitions(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formName\n    displayName\n    formTitle\n    formSchema {\n      __typename\n      stepTitle\n      layoutType\n      numberOfColumns\n    }\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n    formAttachments {\n      __typename\n      nextToken\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateCustomFormDefinitions";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateCustomFormDefinitions($input: CreateCustomFormDefinitionsInput!, $condition: ModelCustomFormDefinitionsConditionInput) {\n  createCustomFormDefinitions(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formName\n    displayName\n    formTitle\n    formSchema {\n      __typename\n      stepTitle\n      layoutType\n      numberOfColumns\n    }\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n    formAttachments {\n      __typename\n      nextToken\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelCustomFormDefinitionsConditionInput condition;
        private CreateCustomFormDefinitionsInput input;

        public CreateCustomFormDefinitionsMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateCustomFormDefinitionsMutation(this.input, this.condition);
        }

        public Builder condition(ModelCustomFormDefinitionsConditionInput modelCustomFormDefinitionsConditionInput) {
            this.condition = modelCustomFormDefinitionsConditionInput;
            return this;
        }

        public Builder input(CreateCustomFormDefinitionsInput createCustomFormDefinitionsInput) {
            this.input = createCustomFormDefinitionsInput;
            return this;
        }
    }

    public static class CreateCustomFormDefinitions {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String displayName;
        final FormAttachments formAttachments;
        final String formName;
        final List<FormSchema> formSchema;
        final String formTitle;
        final String id;
        final String updaedById;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<CreateCustomFormDefinitions> {
            final FormSchema.Mapper formSchemaFieldMapper = new FormSchema.Mapper();
            final FormAttachments.Mapper formAttachmentsFieldMapper = new FormAttachments.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateCustomFormDefinitions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateCustomFormDefinitions.$responseFields;
                return new CreateCustomFormDefinitions(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readList(responseFieldArr[6], new ResponseReader.ListReader<FormSchema>() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.CreateCustomFormDefinitions.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public FormSchema read(ResponseReader.ListItemReader listItemReader) {
                        return (FormSchema) listItemReader.readObject(new ResponseReader.ObjectReader<FormSchema>() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.CreateCustomFormDefinitions.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public FormSchema read(ResponseReader responseReader2) {
                                return Mapper.this.formSchemaFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (FormAttachments) responseReader.readObject(responseFieldArr[11], new ResponseReader.ObjectReader<FormAttachments>() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.CreateCustomFormDefinitions.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public FormAttachments read(ResponseReader responseReader2) {
                        return Mapper.this.formAttachmentsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("formName", "formName", null, false, Collections.emptyList()), ResponseField.forString("displayName", "displayName", null, false, Collections.emptyList()), ResponseField.forString("formTitle", "formTitle", null, true, Collections.emptyList()), ResponseField.forList("formSchema", "formSchema", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updaedById", "updaedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("formAttachments", "formAttachments", null, true, Collections.emptyList())};
        }

        public CreateCustomFormDefinitions(String str, String str2, String str3, String str4, String str5, String str6, List<FormSchema> list, String str7, String str8, String str9, String str10, FormAttachments formAttachments) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.formName = (String) Utils.checkNotNull(str4, "formName == null");
            this.displayName = (String) Utils.checkNotNull(str5, "displayName == null");
            this.formTitle = str6;
            this.formSchema = list;
            this.createdById = str7;
            this.updaedById = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
            this.formAttachments = formAttachments;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String displayName() {
            return this.displayName;
        }

        public boolean equals(Object obj) {
            String str;
            List<FormSchema> list;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateCustomFormDefinitions)) {
                return false;
            }
            CreateCustomFormDefinitions createCustomFormDefinitions = (CreateCustomFormDefinitions) obj;
            if (this.__typename.equals(createCustomFormDefinitions.__typename) && this.id.equals(createCustomFormDefinitions.id) && this.accountId.equals(createCustomFormDefinitions.accountId) && this.formName.equals(createCustomFormDefinitions.formName) && this.displayName.equals(createCustomFormDefinitions.displayName) && ((str = this.formTitle) != null ? str.equals(createCustomFormDefinitions.formTitle) : createCustomFormDefinitions.formTitle == null) && ((list = this.formSchema) != null ? list.equals(createCustomFormDefinitions.formSchema) : createCustomFormDefinitions.formSchema == null) && ((str2 = this.createdById) != null ? str2.equals(createCustomFormDefinitions.createdById) : createCustomFormDefinitions.createdById == null) && ((str3 = this.updaedById) != null ? str3.equals(createCustomFormDefinitions.updaedById) : createCustomFormDefinitions.updaedById == null) && ((str4 = this.createdAt) != null ? str4.equals(createCustomFormDefinitions.createdAt) : createCustomFormDefinitions.createdAt == null) && ((str5 = this.updatedAt) != null ? str5.equals(createCustomFormDefinitions.updatedAt) : createCustomFormDefinitions.updatedAt == null)) {
                FormAttachments formAttachments = this.formAttachments;
                FormAttachments formAttachments2 = createCustomFormDefinitions.formAttachments;
                if (formAttachments == null) {
                    if (formAttachments2 == null) {
                        return true;
                    }
                } else if (formAttachments.equals(formAttachments2)) {
                    return true;
                }
            }
            return false;
        }

        public FormAttachments formAttachments() {
            return this.formAttachments;
        }

        public String formName() {
            return this.formName;
        }

        public List<FormSchema> formSchema() {
            return this.formSchema;
        }

        public String formTitle() {
            return this.formTitle;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.formName.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003;
                String str = this.formTitle;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<FormSchema> list = this.formSchema;
                int iHashCode3 = (iHashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str2 = this.createdById;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updaedById;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                FormAttachments formAttachments = this.formAttachments;
                this.$hashCode = iHashCode7 ^ (formAttachments != null ? formAttachments.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.CreateCustomFormDefinitions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateCustomFormDefinitions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateCustomFormDefinitions.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateCustomFormDefinitions.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateCustomFormDefinitions.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], CreateCustomFormDefinitions.this.formName);
                    responseWriter.writeString(responseFieldArr[4], CreateCustomFormDefinitions.this.displayName);
                    responseWriter.writeString(responseFieldArr[5], CreateCustomFormDefinitions.this.formTitle);
                    responseWriter.writeList(responseFieldArr[6], CreateCustomFormDefinitions.this.formSchema, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.CreateCustomFormDefinitions.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((FormSchema) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CreateCustomFormDefinitions.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], CreateCustomFormDefinitions.this.updaedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreateCustomFormDefinitions.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], CreateCustomFormDefinitions.this.updatedAt);
                    ResponseField responseField = responseFieldArr[11];
                    FormAttachments formAttachments = CreateCustomFormDefinitions.this.formAttachments;
                    responseWriter.writeObject(responseField, formAttachments != null ? formAttachments.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateCustomFormDefinitions{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", formName=" + this.formName + ", displayName=" + this.displayName + ", formTitle=" + this.formTitle + ", formSchema=" + this.formSchema + ", createdById=" + this.createdById + ", updaedById=" + this.updaedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", formAttachments=" + this.formAttachments + "}";
            }
            return this.$toString;
        }

        public String updaedById() {
            return this.updaedById;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createCustomFormDefinitions", "createCustomFormDefinitions", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateCustomFormDefinitions createCustomFormDefinitions;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateCustomFormDefinitions.Mapper createCustomFormDefinitionsFieldMapper = new CreateCustomFormDefinitions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateCustomFormDefinitions) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateCustomFormDefinitions>() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateCustomFormDefinitions read(ResponseReader responseReader2) {
                        return Mapper.this.createCustomFormDefinitionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateCustomFormDefinitions createCustomFormDefinitions) {
            this.createCustomFormDefinitions = createCustomFormDefinitions;
        }

        public CreateCustomFormDefinitions createCustomFormDefinitions() {
            return this.createCustomFormDefinitions;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateCustomFormDefinitions createCustomFormDefinitions = this.createCustomFormDefinitions;
            CreateCustomFormDefinitions createCustomFormDefinitions2 = ((Data) obj).createCustomFormDefinitions;
            return createCustomFormDefinitions == null ? createCustomFormDefinitions2 == null : createCustomFormDefinitions.equals(createCustomFormDefinitions2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateCustomFormDefinitions createCustomFormDefinitions = this.createCustomFormDefinitions;
                this.$hashCode = (createCustomFormDefinitions == null ? 0 : createCustomFormDefinitions.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateCustomFormDefinitions createCustomFormDefinitions = Data.this.createCustomFormDefinitions;
                    responseWriter.writeObject(responseField, createCustomFormDefinitions != null ? createCustomFormDefinitions.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createCustomFormDefinitions=" + this.createCustomFormDefinitions + "}";
            }
            return this.$toString;
        }
    }

    public static class FormAttachments {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<FormAttachments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public FormAttachments map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = FormAttachments.$responseFields;
                return new FormAttachments(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public FormAttachments(String str, String str2) {
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
            if (!(obj instanceof FormAttachments)) {
                return false;
            }
            FormAttachments formAttachments = (FormAttachments) obj;
            if (this.__typename.equals(formAttachments.__typename)) {
                String str = this.nextToken;
                String str2 = formAttachments.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.FormAttachments.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = FormAttachments.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], FormAttachments.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], FormAttachments.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FormAttachments{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class FormSchema {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("stepTitle", "stepTitle", null, true, Collections.emptyList()), ResponseField.forString("layoutType", "layoutType", null, true, Collections.emptyList()), ResponseField.forInt("numberOfColumns", "numberOfColumns", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final LayoutType layoutType;
        final Integer numberOfColumns;
        final String stepTitle;

        public static final class Mapper implements ResponseFieldMapper<FormSchema> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public FormSchema map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = FormSchema.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String string2 = responseReader.readString(responseFieldArr[1]);
                String string3 = responseReader.readString(responseFieldArr[2]);
                return new FormSchema(string, string2, string3 != null ? LayoutType.valueOf(string3) : null, responseReader.readInt(responseFieldArr[3]));
            }
        }

        public FormSchema(String str, String str2, LayoutType layoutType, Integer num) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.stepTitle = str2;
            this.layoutType = layoutType;
            this.numberOfColumns = num;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            LayoutType layoutType;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FormSchema)) {
                return false;
            }
            FormSchema formSchema = (FormSchema) obj;
            if (this.__typename.equals(formSchema.__typename) && ((str = this.stepTitle) != null ? str.equals(formSchema.stepTitle) : formSchema.stepTitle == null) && ((layoutType = this.layoutType) != null ? layoutType.equals(formSchema.layoutType) : formSchema.layoutType == null)) {
                Integer num = this.numberOfColumns;
                Integer num2 = formSchema.numberOfColumns;
                if (num == null) {
                    if (num2 == null) {
                        return true;
                    }
                } else if (num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.stepTitle;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                LayoutType layoutType = this.layoutType;
                int iHashCode3 = (iHashCode2 ^ (layoutType == null ? 0 : layoutType.hashCode())) * 1000003;
                Integer num = this.numberOfColumns;
                this.$hashCode = iHashCode3 ^ (num != null ? num.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public LayoutType layoutType() {
            return this.layoutType;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.FormSchema.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = FormSchema.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], FormSchema.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], FormSchema.this.stepTitle);
                    ResponseField responseField = responseFieldArr[2];
                    LayoutType layoutType = FormSchema.this.layoutType;
                    responseWriter.writeString(responseField, layoutType != null ? layoutType.name() : null);
                    responseWriter.writeInt(responseFieldArr[3], FormSchema.this.numberOfColumns);
                }
            };
        }

        public Integer numberOfColumns() {
            return this.numberOfColumns;
        }

        public String stepTitle() {
            return this.stepTitle;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FormSchema{__typename=" + this.__typename + ", stepTitle=" + this.stepTitle + ", layoutType=" + this.layoutType + ", numberOfColumns=" + this.numberOfColumns + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelCustomFormDefinitionsConditionInput condition;
        private final CreateCustomFormDefinitionsInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateCustomFormDefinitionsInput createCustomFormDefinitionsInput, ModelCustomFormDefinitionsConditionInput modelCustomFormDefinitionsConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createCustomFormDefinitionsInput;
            this.condition = modelCustomFormDefinitionsConditionInput;
            linkedHashMap.put("input", createCustomFormDefinitionsInput);
            linkedHashMap.put("condition", modelCustomFormDefinitionsConditionInput);
        }

        public ModelCustomFormDefinitionsConditionInput condition() {
            return this.condition;
        }

        public CreateCustomFormDefinitionsInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation.Variables.1
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

    public CreateCustomFormDefinitionsMutation(CreateCustomFormDefinitionsInput createCustomFormDefinitionsInput, ModelCustomFormDefinitionsConditionInput modelCustomFormDefinitionsConditionInput) {
        Utils.checkNotNull(createCustomFormDefinitionsInput, "input == null");
        this.variables = new Variables(createCustomFormDefinitionsInput, modelCustomFormDefinitionsConditionInput);
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
        return "3d269132a83e70594b7abec719c3c7903a89cbe4d1e2b42b77cca9c3816b39f1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateCustomFormDefinitions($input: CreateCustomFormDefinitionsInput!, $condition: ModelCustomFormDefinitionsConditionInput) {\n  createCustomFormDefinitions(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formName\n    displayName\n    formTitle\n    formSchema {\n      __typename\n      stepTitle\n      layoutType\n      numberOfColumns\n    }\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n    formAttachments {\n      __typename\n      nextToken\n    }\n  }\n}";
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
