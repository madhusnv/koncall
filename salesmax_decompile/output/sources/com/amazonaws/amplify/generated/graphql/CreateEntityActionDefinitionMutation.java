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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CreateEntityActionDefinitionInput;
import type.CustomType;
import type.ModelEntityActionDefinitionConditionInput;

/* loaded from: classes6.dex */
public final class CreateEntityActionDefinitionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateEntityActionDefinition($input: CreateEntityActionDefinitionInput!, $condition: ModelEntityActionDefinitionConditionInput) {\n  createEntityActionDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    segment {\n      __typename\n      name\n      template\n      joinStatement\n      criteria\n      defaultTableName\n      limit\n    }\n    action\n    target\n    subscriptionType\n    periodicFrequency\n    periodicFrequencyUnit\n    startDateTime\n    endDateTime\n    status\n    ownerId\n    createdAt\n    updatedAt\n    createdBy\n    updatedBy\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateEntityActionDefinitionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateEntityActionDefinition";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateEntityActionDefinition($input: CreateEntityActionDefinitionInput!, $condition: ModelEntityActionDefinitionConditionInput) {\n  createEntityActionDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    segment {\n      __typename\n      name\n      template\n      joinStatement\n      criteria\n      defaultTableName\n      limit\n    }\n    action\n    target\n    subscriptionType\n    periodicFrequency\n    periodicFrequencyUnit\n    startDateTime\n    endDateTime\n    status\n    ownerId\n    createdAt\n    updatedAt\n    createdBy\n    updatedBy\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelEntityActionDefinitionConditionInput condition;
        private CreateEntityActionDefinitionInput input;

        public CreateEntityActionDefinitionMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateEntityActionDefinitionMutation(this.input, this.condition);
        }

        public Builder condition(ModelEntityActionDefinitionConditionInput modelEntityActionDefinitionConditionInput) {
            this.condition = modelEntityActionDefinitionConditionInput;
            return this;
        }

        public Builder input(CreateEntityActionDefinitionInput createEntityActionDefinitionInput) {
            this.input = createEntityActionDefinitionInput;
            return this;
        }
    }

    public static class CreateEntityActionDefinition {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String action;
        final String createdAt;
        final String createdBy;
        final String description;
        final String endDateTime;
        final String id;
        final String name;
        final String ownerId;
        final Integer periodicFrequency;
        final String periodicFrequencyUnit;
        final Segment segment;
        final String startDateTime;
        final String status;
        final String subscriptionType;
        final String target;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<CreateEntityActionDefinition> {
            final Segment.Mapper segmentFieldMapper = new Segment.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateEntityActionDefinition map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateEntityActionDefinition.$responseFields;
                return new CreateEntityActionDefinition(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (Segment) responseReader.readObject(responseFieldArr[5], new ResponseReader.ObjectReader<Segment>() { // from class: com.amazonaws.amplify.generated.graphql.CreateEntityActionDefinitionMutation.CreateEntityActionDefinition.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Segment read(ResponseReader responseReader2) {
                        return Mapper.this.segmentFieldMapper.map(responseReader2);
                    }
                }), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readInt(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forObject("segment", "segment", null, true, Collections.emptyList()), ResponseField.forString("action", "action", null, true, Collections.emptyList()), ResponseField.forString("target", "target", null, true, Collections.emptyList()), ResponseField.forString("subscriptionType", "subscriptionType", null, true, Collections.emptyList()), ResponseField.forInt("periodicFrequency", "periodicFrequency", null, true, Collections.emptyList()), ResponseField.forString("periodicFrequencyUnit", "periodicFrequencyUnit", null, true, Collections.emptyList()), ResponseField.forCustomType("startDateTime", "startDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDateTime", "endDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList())};
        }

        public CreateEntityActionDefinition(String str, String str2, String str3, String str4, String str5, Segment segment, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.segment = segment;
            this.action = str6;
            this.target = str7;
            this.subscriptionType = str8;
            this.periodicFrequency = num;
            this.periodicFrequencyUnit = str9;
            this.startDateTime = str10;
            this.endDateTime = str11;
            this.status = str12;
            this.ownerId = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
            this.createdBy = str16;
            this.updatedBy = str17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String action() {
            return this.action;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdBy() {
            return this.createdBy;
        }

        public String description() {
            return this.description;
        }

        public String endDateTime() {
            return this.endDateTime;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Segment segment;
            String str3;
            String str4;
            String str5;
            Integer num;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateEntityActionDefinition)) {
                return false;
            }
            CreateEntityActionDefinition createEntityActionDefinition = (CreateEntityActionDefinition) obj;
            if (this.__typename.equals(createEntityActionDefinition.__typename) && this.id.equals(createEntityActionDefinition.id) && this.accountId.equals(createEntityActionDefinition.accountId) && ((str = this.name) != null ? str.equals(createEntityActionDefinition.name) : createEntityActionDefinition.name == null) && ((str2 = this.description) != null ? str2.equals(createEntityActionDefinition.description) : createEntityActionDefinition.description == null) && ((segment = this.segment) != null ? segment.equals(createEntityActionDefinition.segment) : createEntityActionDefinition.segment == null) && ((str3 = this.action) != null ? str3.equals(createEntityActionDefinition.action) : createEntityActionDefinition.action == null) && ((str4 = this.target) != null ? str4.equals(createEntityActionDefinition.target) : createEntityActionDefinition.target == null) && ((str5 = this.subscriptionType) != null ? str5.equals(createEntityActionDefinition.subscriptionType) : createEntityActionDefinition.subscriptionType == null) && ((num = this.periodicFrequency) != null ? num.equals(createEntityActionDefinition.periodicFrequency) : createEntityActionDefinition.periodicFrequency == null) && ((str6 = this.periodicFrequencyUnit) != null ? str6.equals(createEntityActionDefinition.periodicFrequencyUnit) : createEntityActionDefinition.periodicFrequencyUnit == null) && ((str7 = this.startDateTime) != null ? str7.equals(createEntityActionDefinition.startDateTime) : createEntityActionDefinition.startDateTime == null) && ((str8 = this.endDateTime) != null ? str8.equals(createEntityActionDefinition.endDateTime) : createEntityActionDefinition.endDateTime == null) && ((str9 = this.status) != null ? str9.equals(createEntityActionDefinition.status) : createEntityActionDefinition.status == null) && ((str10 = this.ownerId) != null ? str10.equals(createEntityActionDefinition.ownerId) : createEntityActionDefinition.ownerId == null) && ((str11 = this.createdAt) != null ? str11.equals(createEntityActionDefinition.createdAt) : createEntityActionDefinition.createdAt == null) && ((str12 = this.updatedAt) != null ? str12.equals(createEntityActionDefinition.updatedAt) : createEntityActionDefinition.updatedAt == null) && ((str13 = this.createdBy) != null ? str13.equals(createEntityActionDefinition.createdBy) : createEntityActionDefinition.createdBy == null)) {
                String str14 = this.updatedBy;
                String str15 = createEntityActionDefinition.updatedBy;
                if (str14 == null) {
                    if (str15 == null) {
                        return true;
                    }
                } else if (str14.equals(str15)) {
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
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Segment segment = this.segment;
                int iHashCode4 = (iHashCode3 ^ (segment == null ? 0 : segment.hashCode())) * 1000003;
                String str3 = this.action;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.target;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.subscriptionType;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.periodicFrequency;
                int iHashCode8 = (iHashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str6 = this.periodicFrequencyUnit;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.startDateTime;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.endDateTime;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.status;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.ownerId;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.updatedAt;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.createdBy;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.updatedBy;
                this.$hashCode = iHashCode16 ^ (str14 != null ? str14.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateEntityActionDefinitionMutation.CreateEntityActionDefinition.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateEntityActionDefinition.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateEntityActionDefinition.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateEntityActionDefinition.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateEntityActionDefinition.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], CreateEntityActionDefinition.this.name);
                    responseWriter.writeString(responseFieldArr[4], CreateEntityActionDefinition.this.description);
                    ResponseField responseField = responseFieldArr[5];
                    Segment segment = CreateEntityActionDefinition.this.segment;
                    responseWriter.writeObject(responseField, segment != null ? segment.marshaller() : null);
                    responseWriter.writeString(responseFieldArr[6], CreateEntityActionDefinition.this.action);
                    responseWriter.writeString(responseFieldArr[7], CreateEntityActionDefinition.this.target);
                    responseWriter.writeString(responseFieldArr[8], CreateEntityActionDefinition.this.subscriptionType);
                    responseWriter.writeInt(responseFieldArr[9], CreateEntityActionDefinition.this.periodicFrequency);
                    responseWriter.writeString(responseFieldArr[10], CreateEntityActionDefinition.this.periodicFrequencyUnit);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], CreateEntityActionDefinition.this.startDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreateEntityActionDefinition.this.endDateTime);
                    responseWriter.writeString(responseFieldArr[13], CreateEntityActionDefinition.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], CreateEntityActionDefinition.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], CreateEntityActionDefinition.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], CreateEntityActionDefinition.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], CreateEntityActionDefinition.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], CreateEntityActionDefinition.this.updatedBy);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Integer periodicFrequency() {
            return this.periodicFrequency;
        }

        public String periodicFrequencyUnit() {
            return this.periodicFrequencyUnit;
        }

        public Segment segment() {
            return this.segment;
        }

        public String startDateTime() {
            return this.startDateTime;
        }

        public String status() {
            return this.status;
        }

        public String subscriptionType() {
            return this.subscriptionType;
        }

        public String target() {
            return this.target;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateEntityActionDefinition{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", segment=" + this.segment + ", action=" + this.action + ", target=" + this.target + ", subscriptionType=" + this.subscriptionType + ", periodicFrequency=" + this.periodicFrequency + ", periodicFrequencyUnit=" + this.periodicFrequencyUnit + ", startDateTime=" + this.startDateTime + ", endDateTime=" + this.endDateTime + ", status=" + this.status + ", ownerId=" + this.ownerId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createEntityActionDefinition", "createEntityActionDefinition", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateEntityActionDefinition createEntityActionDefinition;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateEntityActionDefinition.Mapper createEntityActionDefinitionFieldMapper = new CreateEntityActionDefinition.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateEntityActionDefinition) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateEntityActionDefinition>() { // from class: com.amazonaws.amplify.generated.graphql.CreateEntityActionDefinitionMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateEntityActionDefinition read(ResponseReader responseReader2) {
                        return Mapper.this.createEntityActionDefinitionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateEntityActionDefinition createEntityActionDefinition) {
            this.createEntityActionDefinition = createEntityActionDefinition;
        }

        public CreateEntityActionDefinition createEntityActionDefinition() {
            return this.createEntityActionDefinition;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateEntityActionDefinition createEntityActionDefinition = this.createEntityActionDefinition;
            CreateEntityActionDefinition createEntityActionDefinition2 = ((Data) obj).createEntityActionDefinition;
            return createEntityActionDefinition == null ? createEntityActionDefinition2 == null : createEntityActionDefinition.equals(createEntityActionDefinition2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateEntityActionDefinition createEntityActionDefinition = this.createEntityActionDefinition;
                this.$hashCode = (createEntityActionDefinition == null ? 0 : createEntityActionDefinition.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateEntityActionDefinitionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateEntityActionDefinition createEntityActionDefinition = Data.this.createEntityActionDefinition;
                    responseWriter.writeObject(responseField, createEntityActionDefinition != null ? createEntityActionDefinition.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createEntityActionDefinition=" + this.createEntityActionDefinition + "}";
            }
            return this.$toString;
        }
    }

    public static class Segment {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("template", "template", null, true, Collections.emptyList()), ResponseField.forString("joinStatement", "joinStatement", null, true, Collections.emptyList()), ResponseField.forString("criteria", "criteria", null, true, Collections.emptyList()), ResponseField.forString("defaultTableName", "defaultTableName", null, true, Collections.emptyList()), ResponseField.forInt("limit", "limit", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String criteria;
        final String defaultTableName;
        final String joinStatement;
        final Integer limit;
        final String name;
        final String template;

        public static final class Mapper implements ResponseFieldMapper<Segment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Segment map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Segment.$responseFields;
                return new Segment(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]));
            }
        }

        public Segment(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.name = str2;
            this.template = str3;
            this.joinStatement = str4;
            this.criteria = str5;
            this.defaultTableName = str6;
            this.limit = num;
        }

        public String __typename() {
            return this.__typename;
        }

        public String criteria() {
            return this.criteria;
        }

        public String defaultTableName() {
            return this.defaultTableName;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.__typename.equals(segment.__typename) && ((str = this.name) != null ? str.equals(segment.name) : segment.name == null) && ((str2 = this.template) != null ? str2.equals(segment.template) : segment.template == null) && ((str3 = this.joinStatement) != null ? str3.equals(segment.joinStatement) : segment.joinStatement == null) && ((str4 = this.criteria) != null ? str4.equals(segment.criteria) : segment.criteria == null) && ((str5 = this.defaultTableName) != null ? str5.equals(segment.defaultTableName) : segment.defaultTableName == null)) {
                Integer num = this.limit;
                Integer num2 = segment.limit;
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
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.template;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.joinStatement;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.criteria;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.defaultTableName;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.limit;
                this.$hashCode = iHashCode6 ^ (num != null ? num.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String joinStatement() {
            return this.joinStatement;
        }

        public Integer limit() {
            return this.limit;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateEntityActionDefinitionMutation.Segment.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Segment.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Segment.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Segment.this.name);
                    responseWriter.writeString(responseFieldArr[2], Segment.this.template);
                    responseWriter.writeString(responseFieldArr[3], Segment.this.joinStatement);
                    responseWriter.writeString(responseFieldArr[4], Segment.this.criteria);
                    responseWriter.writeString(responseFieldArr[5], Segment.this.defaultTableName);
                    responseWriter.writeInt(responseFieldArr[6], Segment.this.limit);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String template() {
            return this.template;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Segment{__typename=" + this.__typename + ", name=" + this.name + ", template=" + this.template + ", joinStatement=" + this.joinStatement + ", criteria=" + this.criteria + ", defaultTableName=" + this.defaultTableName + ", limit=" + this.limit + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelEntityActionDefinitionConditionInput condition;
        private final CreateEntityActionDefinitionInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateEntityActionDefinitionInput createEntityActionDefinitionInput, ModelEntityActionDefinitionConditionInput modelEntityActionDefinitionConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createEntityActionDefinitionInput;
            this.condition = modelEntityActionDefinitionConditionInput;
            linkedHashMap.put("input", createEntityActionDefinitionInput);
            linkedHashMap.put("condition", modelEntityActionDefinitionConditionInput);
        }

        public ModelEntityActionDefinitionConditionInput condition() {
            return this.condition;
        }

        public CreateEntityActionDefinitionInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateEntityActionDefinitionMutation.Variables.1
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

    public CreateEntityActionDefinitionMutation(CreateEntityActionDefinitionInput createEntityActionDefinitionInput, ModelEntityActionDefinitionConditionInput modelEntityActionDefinitionConditionInput) {
        Utils.checkNotNull(createEntityActionDefinitionInput, "input == null");
        this.variables = new Variables(createEntityActionDefinitionInput, modelEntityActionDefinitionConditionInput);
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
        return "7ea67d88a800552190df33d0dd5af0fd531e7c246affe273664adbf9916bd141";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateEntityActionDefinition($input: CreateEntityActionDefinitionInput!, $condition: ModelEntityActionDefinitionConditionInput) {\n  createEntityActionDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    segment {\n      __typename\n      name\n      template\n      joinStatement\n      criteria\n      defaultTableName\n      limit\n    }\n    action\n    target\n    subscriptionType\n    periodicFrequency\n    periodicFrequencyUnit\n    startDateTime\n    endDateTime\n    status\n    ownerId\n    createdAt\n    updatedAt\n    createdBy\n    updatedBy\n  }\n}";
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
