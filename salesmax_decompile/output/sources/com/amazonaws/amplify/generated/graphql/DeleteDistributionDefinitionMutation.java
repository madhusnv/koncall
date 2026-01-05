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
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.DeleteDistributionDefinitionInput;
import type.DistributedEntityType;
import type.DistributionCreationType;
import type.DistributionType;
import type.IfOwnerExists;
import type.ModelDistributionDefinitionConditionInput;

/* loaded from: classes6.dex */
public final class DeleteDistributionDefinitionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteDistributionDefinition($input: DeleteDistributionDefinitionInput!, $condition: ModelDistributionDefinitionConditionInput) {\n  deleteDistributionDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    distributedEntityType\n    ifOwnerExists\n    assignLeadOwnerToTask\n    remeberAssigneeInDistributionScope\n    remeberAssigneeInGlobalScope\n    ownerId\n    rule {\n      __typename\n      incomingCondition\n      assigneeSetCondition\n      distributionType\n    }\n    distributionCreationType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteDistributionDefinition";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteDistributionDefinition($input: DeleteDistributionDefinitionInput!, $condition: ModelDistributionDefinitionConditionInput) {\n  deleteDistributionDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    distributedEntityType\n    ifOwnerExists\n    assignLeadOwnerToTask\n    remeberAssigneeInDistributionScope\n    remeberAssigneeInGlobalScope\n    ownerId\n    rule {\n      __typename\n      incomingCondition\n      assigneeSetCondition\n      distributionType\n    }\n    distributionCreationType\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelDistributionDefinitionConditionInput condition;
        private DeleteDistributionDefinitionInput input;

        public DeleteDistributionDefinitionMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteDistributionDefinitionMutation(this.input, this.condition);
        }

        public Builder condition(ModelDistributionDefinitionConditionInput modelDistributionDefinitionConditionInput) {
            this.condition = modelDistributionDefinitionConditionInput;
            return this;
        }

        public Builder input(DeleteDistributionDefinitionInput deleteDistributionDefinitionInput) {
            this.input = deleteDistributionDefinitionInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteDistributionDefinition", "deleteDistributionDefinition", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteDistributionDefinition deleteDistributionDefinition;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteDistributionDefinition.Mapper deleteDistributionDefinitionFieldMapper = new DeleteDistributionDefinition.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteDistributionDefinition) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteDistributionDefinition>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteDistributionDefinition read(ResponseReader responseReader2) {
                        return Mapper.this.deleteDistributionDefinitionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteDistributionDefinition deleteDistributionDefinition) {
            this.deleteDistributionDefinition = deleteDistributionDefinition;
        }

        public DeleteDistributionDefinition deleteDistributionDefinition() {
            return this.deleteDistributionDefinition;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteDistributionDefinition deleteDistributionDefinition = this.deleteDistributionDefinition;
            DeleteDistributionDefinition deleteDistributionDefinition2 = ((Data) obj).deleteDistributionDefinition;
            return deleteDistributionDefinition == null ? deleteDistributionDefinition2 == null : deleteDistributionDefinition.equals(deleteDistributionDefinition2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteDistributionDefinition deleteDistributionDefinition = this.deleteDistributionDefinition;
                this.$hashCode = (deleteDistributionDefinition == null ? 0 : deleteDistributionDefinition.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteDistributionDefinition deleteDistributionDefinition = Data.this.deleteDistributionDefinition;
                    responseWriter.writeObject(responseField, deleteDistributionDefinition != null ? deleteDistributionDefinition.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteDistributionDefinition=" + this.deleteDistributionDefinition + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteDistributionDefinition {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean assignLeadOwnerToTask;
        final String createdAt;
        final String description;
        final List<DistributedEntityType> distributedEntityType;
        final DistributionCreationType distributionCreationType;
        final String id;
        final IfOwnerExists ifOwnerExists;
        final String name;
        final String ownerId;
        final Boolean remeberAssigneeInDistributionScope;
        final Boolean remeberAssigneeInGlobalScope;
        final List<Rule> rule;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<DeleteDistributionDefinition> {
            final Rule.Mapper ruleFieldMapper = new Rule.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteDistributionDefinition map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteDistributionDefinition.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<DistributedEntityType>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.DeleteDistributionDefinition.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public DistributedEntityType read(ResponseReader.ListItemReader listItemReader) {
                        return DistributedEntityType.valueOf(listItemReader.readString());
                    }
                });
                String string4 = responseReader.readString(responseFieldArr[6]);
                IfOwnerExists ifOwnerExistsValueOf = string4 != null ? IfOwnerExists.valueOf(string4) : null;
                Boolean bool = responseReader.readBoolean(responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[9]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                List list2 = responseReader.readList(responseFieldArr[11], new ResponseReader.ListReader<Rule>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.DeleteDistributionDefinition.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Rule read(ResponseReader.ListItemReader listItemReader) {
                        return (Rule) listItemReader.readObject(new ResponseReader.ObjectReader<Rule>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.DeleteDistributionDefinition.Mapper.2.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Rule read(ResponseReader responseReader2) {
                                return Mapper.this.ruleFieldMapper.map(responseReader2);
                            }
                        });
                    }
                });
                String string5 = responseReader.readString(responseFieldArr[12]);
                return new DeleteDistributionDefinition(string, str, str2, string2, string3, list, ifOwnerExistsValueOf, bool, bool2, bool3, str3, list2, string5 != null ? DistributionCreationType.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forList("distributedEntityType", "distributedEntityType", null, false, Collections.emptyList()), ResponseField.forString("ifOwnerExists", "ifOwnerExists", null, true, Collections.emptyList()), ResponseField.forBoolean("assignLeadOwnerToTask", "assignLeadOwnerToTask", null, true, Collections.emptyList()), ResponseField.forBoolean("remeberAssigneeInDistributionScope", "remeberAssigneeInDistributionScope", null, true, Collections.emptyList()), ResponseField.forBoolean("remeberAssigneeInGlobalScope", "remeberAssigneeInGlobalScope", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forList("rule", "rule", null, true, Collections.emptyList()), ResponseField.forString("distributionCreationType", "distributionCreationType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public DeleteDistributionDefinition(String str, String str2, String str3, String str4, String str5, List<DistributedEntityType> list, IfOwnerExists ifOwnerExists, Boolean bool, Boolean bool2, Boolean bool3, String str6, List<Rule> list2, DistributionCreationType distributionCreationType, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.distributedEntityType = (List) Utils.checkNotNull(list, "distributedEntityType == null");
            this.ifOwnerExists = ifOwnerExists;
            this.assignLeadOwnerToTask = bool;
            this.remeberAssigneeInDistributionScope = bool2;
            this.remeberAssigneeInGlobalScope = bool3;
            this.ownerId = (String) Utils.checkNotNull(str6, "ownerId == null");
            this.rule = list2;
            this.distributionCreationType = distributionCreationType;
            this.createdAt = str7;
            this.updatedAt = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean assignLeadOwnerToTask() {
            return this.assignLeadOwnerToTask;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String description() {
            return this.description;
        }

        public List<DistributedEntityType> distributedEntityType() {
            return this.distributedEntityType;
        }

        public DistributionCreationType distributionCreationType() {
            return this.distributionCreationType;
        }

        public boolean equals(Object obj) {
            IfOwnerExists ifOwnerExists;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            List<Rule> list;
            DistributionCreationType distributionCreationType;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteDistributionDefinition)) {
                return false;
            }
            DeleteDistributionDefinition deleteDistributionDefinition = (DeleteDistributionDefinition) obj;
            if (this.__typename.equals(deleteDistributionDefinition.__typename) && this.id.equals(deleteDistributionDefinition.id) && this.accountId.equals(deleteDistributionDefinition.accountId) && this.name.equals(deleteDistributionDefinition.name) && this.description.equals(deleteDistributionDefinition.description) && this.distributedEntityType.equals(deleteDistributionDefinition.distributedEntityType) && ((ifOwnerExists = this.ifOwnerExists) != null ? ifOwnerExists.equals(deleteDistributionDefinition.ifOwnerExists) : deleteDistributionDefinition.ifOwnerExists == null) && ((bool = this.assignLeadOwnerToTask) != null ? bool.equals(deleteDistributionDefinition.assignLeadOwnerToTask) : deleteDistributionDefinition.assignLeadOwnerToTask == null) && ((bool2 = this.remeberAssigneeInDistributionScope) != null ? bool2.equals(deleteDistributionDefinition.remeberAssigneeInDistributionScope) : deleteDistributionDefinition.remeberAssigneeInDistributionScope == null) && ((bool3 = this.remeberAssigneeInGlobalScope) != null ? bool3.equals(deleteDistributionDefinition.remeberAssigneeInGlobalScope) : deleteDistributionDefinition.remeberAssigneeInGlobalScope == null) && this.ownerId.equals(deleteDistributionDefinition.ownerId) && ((list = this.rule) != null ? list.equals(deleteDistributionDefinition.rule) : deleteDistributionDefinition.rule == null) && ((distributionCreationType = this.distributionCreationType) != null ? distributionCreationType.equals(deleteDistributionDefinition.distributionCreationType) : deleteDistributionDefinition.distributionCreationType == null) && ((str = this.createdAt) != null ? str.equals(deleteDistributionDefinition.createdAt) : deleteDistributionDefinition.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = deleteDistributionDefinition.updatedAt;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.distributedEntityType.hashCode()) * 1000003;
                IfOwnerExists ifOwnerExists = this.ifOwnerExists;
                int iHashCode2 = (iHashCode ^ (ifOwnerExists == null ? 0 : ifOwnerExists.hashCode())) * 1000003;
                Boolean bool = this.assignLeadOwnerToTask;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.remeberAssigneeInDistributionScope;
                int iHashCode4 = (iHashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.remeberAssigneeInGlobalScope;
                int iHashCode5 = (((iHashCode4 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                List<Rule> list = this.rule;
                int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                DistributionCreationType distributionCreationType = this.distributionCreationType;
                int iHashCode7 = (iHashCode6 ^ (distributionCreationType == null ? 0 : distributionCreationType.hashCode())) * 1000003;
                String str = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode8 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public IfOwnerExists ifOwnerExists() {
            return this.ifOwnerExists;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.DeleteDistributionDefinition.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteDistributionDefinition.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteDistributionDefinition.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteDistributionDefinition.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteDistributionDefinition.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], DeleteDistributionDefinition.this.name);
                    responseWriter.writeString(responseFieldArr[4], DeleteDistributionDefinition.this.description);
                    responseWriter.writeList(responseFieldArr[5], DeleteDistributionDefinition.this.distributedEntityType, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.DeleteDistributionDefinition.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((DistributedEntityType) obj).name());
                        }
                    });
                    ResponseField responseField = responseFieldArr[6];
                    IfOwnerExists ifOwnerExists = DeleteDistributionDefinition.this.ifOwnerExists;
                    responseWriter.writeString(responseField, ifOwnerExists != null ? ifOwnerExists.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[7], DeleteDistributionDefinition.this.assignLeadOwnerToTask);
                    responseWriter.writeBoolean(responseFieldArr[8], DeleteDistributionDefinition.this.remeberAssigneeInDistributionScope);
                    responseWriter.writeBoolean(responseFieldArr[9], DeleteDistributionDefinition.this.remeberAssigneeInGlobalScope);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], DeleteDistributionDefinition.this.ownerId);
                    responseWriter.writeList(responseFieldArr[11], DeleteDistributionDefinition.this.rule, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.DeleteDistributionDefinition.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Rule) obj).marshaller());
                        }
                    });
                    ResponseField responseField2 = responseFieldArr[12];
                    DistributionCreationType distributionCreationType = DeleteDistributionDefinition.this.distributionCreationType;
                    responseWriter.writeString(responseField2, distributionCreationType != null ? distributionCreationType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], DeleteDistributionDefinition.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], DeleteDistributionDefinition.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Boolean remeberAssigneeInDistributionScope() {
            return this.remeberAssigneeInDistributionScope;
        }

        public Boolean remeberAssigneeInGlobalScope() {
            return this.remeberAssigneeInGlobalScope;
        }

        public List<Rule> rule() {
            return this.rule;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteDistributionDefinition{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", distributedEntityType=" + this.distributedEntityType + ", ifOwnerExists=" + this.ifOwnerExists + ", assignLeadOwnerToTask=" + this.assignLeadOwnerToTask + ", remeberAssigneeInDistributionScope=" + this.remeberAssigneeInDistributionScope + ", remeberAssigneeInGlobalScope=" + this.remeberAssigneeInGlobalScope + ", ownerId=" + this.ownerId + ", rule=" + this.rule + ", distributionCreationType=" + this.distributionCreationType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Rule {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("incomingCondition", "incomingCondition", null, true, Collections.emptyList()), ResponseField.forString("assigneeSetCondition", "assigneeSetCondition", null, true, Collections.emptyList()), ResponseField.forString("distributionType", "distributionType", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String assigneeSetCondition;
        final DistributionType distributionType;
        final String incomingCondition;

        public static final class Mapper implements ResponseFieldMapper<Rule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Rule map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Rule.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String string2 = responseReader.readString(responseFieldArr[1]);
                String string3 = responseReader.readString(responseFieldArr[2]);
                String string4 = responseReader.readString(responseFieldArr[3]);
                return new Rule(string, string2, string3, string4 != null ? DistributionType.valueOf(string4) : null);
            }
        }

        public Rule(String str, String str2, String str3, DistributionType distributionType) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.incomingCondition = str2;
            this.assigneeSetCondition = str3;
            this.distributionType = distributionType;
        }

        public String __typename() {
            return this.__typename;
        }

        public String assigneeSetCondition() {
            return this.assigneeSetCondition;
        }

        public DistributionType distributionType() {
            return this.distributionType;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) obj;
            if (this.__typename.equals(rule.__typename) && ((str = this.incomingCondition) != null ? str.equals(rule.incomingCondition) : rule.incomingCondition == null) && ((str2 = this.assigneeSetCondition) != null ? str2.equals(rule.assigneeSetCondition) : rule.assigneeSetCondition == null)) {
                DistributionType distributionType = this.distributionType;
                DistributionType distributionType2 = rule.distributionType;
                if (distributionType == null) {
                    if (distributionType2 == null) {
                        return true;
                    }
                } else if (distributionType.equals(distributionType2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.incomingCondition;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.assigneeSetCondition;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                DistributionType distributionType = this.distributionType;
                this.$hashCode = iHashCode3 ^ (distributionType != null ? distributionType.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String incomingCondition() {
            return this.incomingCondition;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.Rule.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Rule.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Rule.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Rule.this.incomingCondition);
                    responseWriter.writeString(responseFieldArr[2], Rule.this.assigneeSetCondition);
                    ResponseField responseField = responseFieldArr[3];
                    DistributionType distributionType = Rule.this.distributionType;
                    responseWriter.writeString(responseField, distributionType != null ? distributionType.name() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Rule{__typename=" + this.__typename + ", incomingCondition=" + this.incomingCondition + ", assigneeSetCondition=" + this.assigneeSetCondition + ", distributionType=" + this.distributionType + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelDistributionDefinitionConditionInput condition;
        private final DeleteDistributionDefinitionInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteDistributionDefinitionInput deleteDistributionDefinitionInput, ModelDistributionDefinitionConditionInput modelDistributionDefinitionConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteDistributionDefinitionInput;
            this.condition = modelDistributionDefinitionConditionInput;
            linkedHashMap.put("input", deleteDistributionDefinitionInput);
            linkedHashMap.put("condition", modelDistributionDefinitionConditionInput);
        }

        public ModelDistributionDefinitionConditionInput condition() {
            return this.condition;
        }

        public DeleteDistributionDefinitionInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteDistributionDefinitionMutation.Variables.1
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

    public DeleteDistributionDefinitionMutation(DeleteDistributionDefinitionInput deleteDistributionDefinitionInput, ModelDistributionDefinitionConditionInput modelDistributionDefinitionConditionInput) {
        Utils.checkNotNull(deleteDistributionDefinitionInput, "input == null");
        this.variables = new Variables(deleteDistributionDefinitionInput, modelDistributionDefinitionConditionInput);
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
        return "b004f1fb423c5253febe760a082d0fedd8d204141583abcb31a87d9d44317f9d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteDistributionDefinition($input: DeleteDistributionDefinitionInput!, $condition: ModelDistributionDefinitionConditionInput) {\n  deleteDistributionDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    distributedEntityType\n    ifOwnerExists\n    assignLeadOwnerToTask\n    remeberAssigneeInDistributionScope\n    remeberAssigneeInGlobalScope\n    ownerId\n    rule {\n      __typename\n      incomingCondition\n      assigneeSetCondition\n      distributionType\n    }\n    distributionCreationType\n    createdAt\n    updatedAt\n  }\n}";
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
