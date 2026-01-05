package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
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
import type.CustomType;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;
import type.ModelTeamMemberFilterInput;
import type.TeamMemberType;
import type.TeamRole;

/* loaded from: classes4.dex */
public final class MemberByTeamQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query MemberByTeam($accountId: ID, $teamId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelTeamMemberFilterInput, $limit: Int, $nextToken: String) {\n  memberByTeam(accountId: $accountId, teamId: $teamId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      teamId\n      accountId\n      teamRole\n      updatedById\n      createdById\n      userId\n      memberTeamId\n      memberType\n      isDefaultTeam\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "MemberByTeam";
        }
    };
    public static final String QUERY_DOCUMENT = "query MemberByTeam($accountId: ID, $teamId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelTeamMemberFilterInput, $limit: Int, $nextToken: String) {\n  memberByTeam(accountId: $accountId, teamId: $teamId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      teamId\n      accountId\n      teamRole\n      updatedById\n      createdById\n      userId\n      memberTeamId\n      memberType\n      isDefaultTeam\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelTeamMemberFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private ModelIDKeyConditionInput teamId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public MemberByTeamQuery build() {
            return new MemberByTeamQuery(this.accountId, this.teamId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelTeamMemberFilterInput modelTeamMemberFilterInput) {
            this.filter = modelTeamMemberFilterInput;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }

        public Builder teamId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.teamId = modelIDKeyConditionInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("memberByTeam", "memberByTeam", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("teamId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "teamId").build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final MemberByTeam memberByTeam;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final MemberByTeam.Mapper memberByTeamFieldMapper = new MemberByTeam.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((MemberByTeam) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<MemberByTeam>() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public MemberByTeam read(ResponseReader responseReader2) {
                        return Mapper.this.memberByTeamFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(MemberByTeam memberByTeam) {
            this.memberByTeam = memberByTeam;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            MemberByTeam memberByTeam = this.memberByTeam;
            MemberByTeam memberByTeam2 = ((Data) obj).memberByTeam;
            return memberByTeam == null ? memberByTeam2 == null : memberByTeam.equals(memberByTeam2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                MemberByTeam memberByTeam = this.memberByTeam;
                this.$hashCode = (memberByTeam == null ? 0 : memberByTeam.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    MemberByTeam memberByTeam = Data.this.memberByTeam;
                    responseWriter.writeObject(responseField, memberByTeam != null ? memberByTeam.marshaller() : null);
                }
            };
        }

        public MemberByTeam memberByTeam() {
            return this.memberByTeam;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{memberByTeam=" + this.memberByTeam + "}";
            }
            return this.$toString;
        }
    }

    public static class Item {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String id;
        final Boolean isDefaultTeam;
        final String memberTeamId;
        final TeamMemberType memberType;
        final String teamId;
        final TeamRole teamRole;
        final String updatedAt;
        final String updatedById;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                TeamRole teamRoleValueOf = string2 != null ? TeamRole.valueOf(string2) : null;
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String string3 = responseReader.readString(responseFieldArr[9]);
                return new Item(string, str, str2, str3, teamRoleValueOf, str4, str5, str6, str7, string3 != null ? TeamMemberType.valueOf(string3) : null, responseReader.readBoolean(responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("teamId", "teamId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("teamRole", "teamRole", null, false, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("memberTeamId", "memberTeamId", null, true, customType, Collections.emptyList()), ResponseField.forString("memberType", "memberType", null, false, Collections.emptyList()), ResponseField.forBoolean("isDefaultTeam", "isDefaultTeam", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, TeamRole teamRole, String str5, String str6, String str7, String str8, TeamMemberType teamMemberType, Boolean bool, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.teamId = (String) Utils.checkNotNull(str3, "teamId == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.teamRole = (TeamRole) Utils.checkNotNull(teamRole, "teamRole == null");
            this.updatedById = (String) Utils.checkNotNull(str5, "updatedById == null");
            this.createdById = (String) Utils.checkNotNull(str6, "createdById == null");
            this.userId = (String) Utils.checkNotNull(str7, "userId == null");
            this.memberTeamId = str8;
            this.memberType = (TeamMemberType) Utils.checkNotNull(teamMemberType, "memberType == null");
            this.isDefaultTeam = bool;
            this.createdAt = str9;
            this.updatedAt = str10;
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

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.teamId.equals(item.teamId) && this.accountId.equals(item.accountId) && this.teamRole.equals(item.teamRole) && this.updatedById.equals(item.updatedById) && this.createdById.equals(item.createdById) && this.userId.equals(item.userId) && ((str = this.memberTeamId) != null ? str.equals(item.memberTeamId) : item.memberTeamId == null) && this.memberType.equals(item.memberType) && ((bool = this.isDefaultTeam) != null ? bool.equals(item.isDefaultTeam) : item.isDefaultTeam == null) && ((str2 = this.createdAt) != null ? str2.equals(item.createdAt) : item.createdAt == null)) {
                String str3 = this.updatedAt;
                String str4 = item.updatedAt;
                if (str3 == null) {
                    if (str4 == null) {
                        return true;
                    }
                } else if (str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.teamId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.teamRole.hashCode()) * 1000003) ^ this.updatedById.hashCode()) * 1000003) ^ this.createdById.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003;
                String str = this.memberTeamId;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.memberType.hashCode()) * 1000003;
                Boolean bool = this.isDefaultTeam;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.createdAt;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updatedAt;
                this.$hashCode = iHashCode4 ^ (str3 != null ? str3.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isDefaultTeam() {
            return this.isDefaultTeam;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.teamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.teamRole.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.memberTeamId);
                    responseWriter.writeString(responseFieldArr[9], Item.this.memberType.name());
                    responseWriter.writeBoolean(responseFieldArr[10], Item.this.isDefaultTeam);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.updatedAt);
                }
            };
        }

        public String memberTeamId() {
            return this.memberTeamId;
        }

        public TeamMemberType memberType() {
            return this.memberType;
        }

        public String teamId() {
            return this.teamId;
        }

        public TeamRole teamRole() {
            return this.teamRole;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", teamId=" + this.teamId + ", accountId=" + this.accountId + ", teamRole=" + this.teamRole + ", updatedById=" + this.updatedById + ", createdById=" + this.createdById + ", userId=" + this.userId + ", memberTeamId=" + this.memberTeamId + ", memberType=" + this.memberType + ", isDefaultTeam=" + this.isDefaultTeam + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static class MemberByTeam {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<MemberByTeam> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public MemberByTeam map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = MemberByTeam.$responseFields;
                return new MemberByTeam(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.MemberByTeam.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.MemberByTeam.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]));
            }
        }

        public MemberByTeam(String str, List<Item> list, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MemberByTeam)) {
                return false;
            }
            MemberByTeam memberByTeam = (MemberByTeam) obj;
            if (this.__typename.equals(memberByTeam.__typename) && this.items.equals(memberByTeam.items)) {
                String str = this.nextToken;
                String str2 = memberByTeam.nextToken;
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
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.MemberByTeam.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = MemberByTeam.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], MemberByTeam.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], MemberByTeam.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.MemberByTeam.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], MemberByTeam.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MemberByTeam{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelTeamMemberFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final ModelIDKeyConditionInput teamId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelTeamMemberFilterInput modelTeamMemberFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.teamId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelTeamMemberFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("teamId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelTeamMemberFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelTeamMemberFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.MemberByTeamQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("teamId", Variables.this.teamId != null ? Variables.this.teamId.marshaller() : null);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        public ModelIDKeyConditionInput teamId() {
            return this.teamId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public MemberByTeamQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelTeamMemberFilterInput modelTeamMemberFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelTeamMemberFilterInput, num, str2);
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
        return "159c25260f8112b4967f165265ecc96a048b59064f8baff8b4ca5d18d35a6563";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query MemberByTeam($accountId: ID, $teamId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelTeamMemberFilterInput, $limit: Int, $nextToken: String) {\n  memberByTeam(accountId: $accountId, teamId: $teamId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      teamId\n      accountId\n      teamRole\n      updatedById\n      createdById\n      userId\n      memberTeamId\n      memberType\n      isDefaultTeam\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
