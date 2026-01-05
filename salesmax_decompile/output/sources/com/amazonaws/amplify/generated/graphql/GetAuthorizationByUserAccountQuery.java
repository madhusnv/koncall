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
import type.AccountStatus;
import type.AccountType;
import type.AuthorizationLevel;
import type.CustomType;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;
import type.ModelUserAuthorizationFilterInput;
import type.UserRegistrationStatus;
import type.UserStatus;

/* loaded from: classes7.dex */
public final class GetAuthorizationByUserAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetAuthorizationByUserAccount($accountId: ID, $userId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelUserAuthorizationFilterInput, $limit: Int, $nextToken: String) {\n  getAuthorizationByUserAccount(accountId: $accountId, userId: $userId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      userId\n      userRegistrationStatus\n      accountId\n      accountType\n      accountStatus\n      userAccountStatus\n      authorizationLevel\n      userAccountPrimaryNumber\n      userAccountSecondaryNumber\n      userAccountEmailVerification\n      defaultTeamId\n      allAllowedTeams\n      teamsAsLead\n      teamsAsReportees\n      allDirectReportees\n      allIndirectReportees\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetAuthorizationByUserAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetAuthorizationByUserAccount($accountId: ID, $userId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelUserAuthorizationFilterInput, $limit: Int, $nextToken: String) {\n  getAuthorizationByUserAccount(accountId: $accountId, userId: $userId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      userId\n      userRegistrationStatus\n      accountId\n      accountType\n      accountStatus\n      userAccountStatus\n      authorizationLevel\n      userAccountPrimaryNumber\n      userAccountSecondaryNumber\n      userAccountEmailVerification\n      defaultTeamId\n      allAllowedTeams\n      teamsAsLead\n      teamsAsReportees\n      allDirectReportees\n      allIndirectReportees\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelUserAuthorizationFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private ModelIDKeyConditionInput userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetAuthorizationByUserAccountQuery build() {
            return new GetAuthorizationByUserAccountQuery(this.accountId, this.userId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelUserAuthorizationFilterInput modelUserAuthorizationFilterInput) {
            this.filter = modelUserAuthorizationFilterInput;
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

        public Builder userId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.userId = modelIDKeyConditionInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getAuthorizationByUserAccount", "getAuthorizationByUserAccount", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetAuthorizationByUserAccount getAuthorizationByUserAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetAuthorizationByUserAccount.Mapper getAuthorizationByUserAccountFieldMapper = new GetAuthorizationByUserAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetAuthorizationByUserAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetAuthorizationByUserAccount>() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetAuthorizationByUserAccount read(ResponseReader responseReader2) {
                        return Mapper.this.getAuthorizationByUserAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetAuthorizationByUserAccount getAuthorizationByUserAccount) {
            this.getAuthorizationByUserAccount = getAuthorizationByUserAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetAuthorizationByUserAccount getAuthorizationByUserAccount = this.getAuthorizationByUserAccount;
            GetAuthorizationByUserAccount getAuthorizationByUserAccount2 = ((Data) obj).getAuthorizationByUserAccount;
            return getAuthorizationByUserAccount == null ? getAuthorizationByUserAccount2 == null : getAuthorizationByUserAccount.equals(getAuthorizationByUserAccount2);
        }

        public GetAuthorizationByUserAccount getAuthorizationByUserAccount() {
            return this.getAuthorizationByUserAccount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetAuthorizationByUserAccount getAuthorizationByUserAccount = this.getAuthorizationByUserAccount;
                this.$hashCode = (getAuthorizationByUserAccount == null ? 0 : getAuthorizationByUserAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetAuthorizationByUserAccount getAuthorizationByUserAccount = Data.this.getAuthorizationByUserAccount;
                    responseWriter.writeObject(responseField, getAuthorizationByUserAccount != null ? getAuthorizationByUserAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getAuthorizationByUserAccount=" + this.getAuthorizationByUserAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetAuthorizationByUserAccount {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetAuthorizationByUserAccount> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetAuthorizationByUserAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetAuthorizationByUserAccount.$responseFields;
                return new GetAuthorizationByUserAccount(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.GetAuthorizationByUserAccount.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.GetAuthorizationByUserAccount.Mapper.1.1
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

        public GetAuthorizationByUserAccount(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetAuthorizationByUserAccount)) {
                return false;
            }
            GetAuthorizationByUserAccount getAuthorizationByUserAccount = (GetAuthorizationByUserAccount) obj;
            if (this.__typename.equals(getAuthorizationByUserAccount.__typename) && this.items.equals(getAuthorizationByUserAccount.items)) {
                String str = this.nextToken;
                String str2 = getAuthorizationByUserAccount.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.GetAuthorizationByUserAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetAuthorizationByUserAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetAuthorizationByUserAccount.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetAuthorizationByUserAccount.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.GetAuthorizationByUserAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetAuthorizationByUserAccount.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetAuthorizationByUserAccount{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final AccountStatus accountStatus;
        final AccountType accountType;
        final List<String> allAllowedTeams;
        final List<String> allDirectReportees;
        final List<String> allIndirectReportees;
        final AuthorizationLevel authorizationLevel;
        final String createdAt;
        final String defaultTeamId;
        final String id;
        final List<String> teamsAsLead;
        final List<String> teamsAsReportees;
        final String updatedAt;
        final Boolean userAccountEmailVerification;
        final String userAccountPrimaryNumber;
        final String userAccountSecondaryNumber;
        final UserStatus userAccountStatus;
        final String userId;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                UserRegistrationStatus userRegistrationStatusValueOf = string2 != null ? UserRegistrationStatus.valueOf(string2) : null;
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String string3 = responseReader.readString(responseFieldArr[5]);
                AccountType accountTypeValueOf = string3 != null ? AccountType.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[6]);
                AccountStatus accountStatusValueOf = string4 != null ? AccountStatus.valueOf(string4) : null;
                String string5 = responseReader.readString(responseFieldArr[7]);
                UserStatus userStatusValueOf = string5 != null ? UserStatus.valueOf(string5) : null;
                String string6 = responseReader.readString(responseFieldArr[8]);
                return new Item(string, str, str2, userRegistrationStatusValueOf, str3, accountTypeValueOf, accountStatusValueOf, userStatusValueOf, string6 != null ? AuthorizationLevel.valueOf(string6) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), responseReader.readBoolean(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readList(responseFieldArr[13], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), responseReader.readList(responseFieldArr[14], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), responseReader.readList(responseFieldArr[16], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), responseReader.readList(responseFieldArr[17], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("accountType", "accountType", null, false, Collections.emptyList()), ResponseField.forString("accountStatus", "accountStatus", null, false, Collections.emptyList()), ResponseField.forString("userAccountStatus", "userAccountStatus", null, false, Collections.emptyList()), ResponseField.forString("authorizationLevel", "authorizationLevel", null, false, Collections.emptyList()), ResponseField.forCustomType("userAccountPrimaryNumber", "userAccountPrimaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("userAccountSecondaryNumber", "userAccountSecondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("userAccountEmailVerification", "userAccountEmailVerification", null, true, Collections.emptyList()), ResponseField.forCustomType("defaultTeamId", "defaultTeamId", null, true, customType, Collections.emptyList()), ResponseField.forList("allAllowedTeams", "allAllowedTeams", null, true, Collections.emptyList()), ResponseField.forList("teamsAsLead", "teamsAsLead", null, true, Collections.emptyList()), ResponseField.forList("teamsAsReportees", "teamsAsReportees", null, true, Collections.emptyList()), ResponseField.forList("allDirectReportees", "allDirectReportees", null, true, Collections.emptyList()), ResponseField.forList("allIndirectReportees", "allIndirectReportees", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, UserRegistrationStatus userRegistrationStatus, String str4, AccountType accountType, AccountStatus accountStatus, UserStatus userStatus, AuthorizationLevel authorizationLevel, String str5, String str6, Boolean bool, String str7, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.userId = (String) Utils.checkNotNull(str3, "userId == null");
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.accountType = (AccountType) Utils.checkNotNull(accountType, "accountType == null");
            this.accountStatus = (AccountStatus) Utils.checkNotNull(accountStatus, "accountStatus == null");
            this.userAccountStatus = (UserStatus) Utils.checkNotNull(userStatus, "userAccountStatus == null");
            this.authorizationLevel = (AuthorizationLevel) Utils.checkNotNull(authorizationLevel, "authorizationLevel == null");
            this.userAccountPrimaryNumber = str5;
            this.userAccountSecondaryNumber = str6;
            this.userAccountEmailVerification = bool;
            this.defaultTeamId = str7;
            this.allAllowedTeams = list;
            this.teamsAsLead = list2;
            this.teamsAsReportees = list3;
            this.allDirectReportees = list4;
            this.allIndirectReportees = list5;
            this.createdAt = str8;
            this.updatedAt = str9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public AccountStatus accountStatus() {
            return this.accountStatus;
        }

        public AccountType accountType() {
            return this.accountType;
        }

        public List<String> allAllowedTeams() {
            return this.allAllowedTeams;
        }

        public List<String> allDirectReportees() {
            return this.allDirectReportees;
        }

        public List<String> allIndirectReportees() {
            return this.allIndirectReportees;
        }

        public AuthorizationLevel authorizationLevel() {
            return this.authorizationLevel;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String defaultTeamId() {
            return this.defaultTeamId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            String str3;
            List<String> list;
            List<String> list2;
            List<String> list3;
            List<String> list4;
            List<String> list5;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.userId.equals(item.userId) && this.userRegistrationStatus.equals(item.userRegistrationStatus) && this.accountId.equals(item.accountId) && this.accountType.equals(item.accountType) && this.accountStatus.equals(item.accountStatus) && this.userAccountStatus.equals(item.userAccountStatus) && this.authorizationLevel.equals(item.authorizationLevel) && ((str = this.userAccountPrimaryNumber) != null ? str.equals(item.userAccountPrimaryNumber) : item.userAccountPrimaryNumber == null) && ((str2 = this.userAccountSecondaryNumber) != null ? str2.equals(item.userAccountSecondaryNumber) : item.userAccountSecondaryNumber == null) && ((bool = this.userAccountEmailVerification) != null ? bool.equals(item.userAccountEmailVerification) : item.userAccountEmailVerification == null) && ((str3 = this.defaultTeamId) != null ? str3.equals(item.defaultTeamId) : item.defaultTeamId == null) && ((list = this.allAllowedTeams) != null ? list.equals(item.allAllowedTeams) : item.allAllowedTeams == null) && ((list2 = this.teamsAsLead) != null ? list2.equals(item.teamsAsLead) : item.teamsAsLead == null) && ((list3 = this.teamsAsReportees) != null ? list3.equals(item.teamsAsReportees) : item.teamsAsReportees == null) && ((list4 = this.allDirectReportees) != null ? list4.equals(item.allDirectReportees) : item.allDirectReportees == null) && ((list5 = this.allIndirectReportees) != null ? list5.equals(item.allIndirectReportees) : item.allIndirectReportees == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
                String str5 = this.updatedAt;
                String str6 = item.updatedAt;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.accountType.hashCode()) * 1000003) ^ this.accountStatus.hashCode()) * 1000003) ^ this.userAccountStatus.hashCode()) * 1000003) ^ this.authorizationLevel.hashCode()) * 1000003;
                String str = this.userAccountPrimaryNumber;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.userAccountSecondaryNumber;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.userAccountEmailVerification;
                int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str3 = this.defaultTeamId;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                List<String> list = this.allAllowedTeams;
                int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.teamsAsLead;
                int iHashCode7 = (iHashCode6 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<String> list3 = this.teamsAsReportees;
                int iHashCode8 = (iHashCode7 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                List<String> list4 = this.allDirectReportees;
                int iHashCode9 = (iHashCode8 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                List<String> list5 = this.allIndirectReportees;
                int iHashCode10 = (iHashCode9 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode11 = (iHashCode10 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode11 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.userId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.accountType.name());
                    responseWriter.writeString(responseFieldArr[6], Item.this.accountStatus.name());
                    responseWriter.writeString(responseFieldArr[7], Item.this.userAccountStatus.name());
                    responseWriter.writeString(responseFieldArr[8], Item.this.authorizationLevel.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.userAccountPrimaryNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.userAccountSecondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[11], Item.this.userAccountEmailVerification);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.defaultTeamId);
                    responseWriter.writeList(responseFieldArr[13], Item.this.allAllowedTeams, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[14], Item.this.teamsAsLead, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[15], Item.this.teamsAsReportees, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[16], Item.this.allDirectReportees, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[17], Item.this.allIndirectReportees, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Item.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.updatedAt);
                }
            };
        }

        public List<String> teamsAsLead() {
            return this.teamsAsLead;
        }

        public List<String> teamsAsReportees() {
            return this.teamsAsReportees;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", userId=" + this.userId + ", userRegistrationStatus=" + this.userRegistrationStatus + ", accountId=" + this.accountId + ", accountType=" + this.accountType + ", accountStatus=" + this.accountStatus + ", userAccountStatus=" + this.userAccountStatus + ", authorizationLevel=" + this.authorizationLevel + ", userAccountPrimaryNumber=" + this.userAccountPrimaryNumber + ", userAccountSecondaryNumber=" + this.userAccountSecondaryNumber + ", userAccountEmailVerification=" + this.userAccountEmailVerification + ", defaultTeamId=" + this.defaultTeamId + ", allAllowedTeams=" + this.allAllowedTeams + ", teamsAsLead=" + this.teamsAsLead + ", teamsAsReportees=" + this.teamsAsReportees + ", allDirectReportees=" + this.allDirectReportees + ", allIndirectReportees=" + this.allIndirectReportees + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public Boolean userAccountEmailVerification() {
            return this.userAccountEmailVerification;
        }

        public String userAccountPrimaryNumber() {
            return this.userAccountPrimaryNumber;
        }

        public String userAccountSecondaryNumber() {
            return this.userAccountSecondaryNumber;
        }

        public UserStatus userAccountStatus() {
            return this.userAccountStatus;
        }

        public String userId() {
            return this.userId;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelUserAuthorizationFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final ModelIDKeyConditionInput userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelUserAuthorizationFilterInput modelUserAuthorizationFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.userId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelUserAuthorizationFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("userId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelUserAuthorizationFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelUserAuthorizationFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("userId", Variables.this.userId != null ? Variables.this.userId.marshaller() : null);
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

        public ModelIDKeyConditionInput userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetAuthorizationByUserAccountQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelUserAuthorizationFilterInput modelUserAuthorizationFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelUserAuthorizationFilterInput, num, str2);
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
        return "b3f353c9b3b83fba6f40a23ed907eb2496553d2b336c4f66ed21c3725164ecdf";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetAuthorizationByUserAccount($accountId: ID, $userId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelUserAuthorizationFilterInput, $limit: Int, $nextToken: String) {\n  getAuthorizationByUserAccount(accountId: $accountId, userId: $userId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      userId\n      userRegistrationStatus\n      accountId\n      accountType\n      accountStatus\n      userAccountStatus\n      authorizationLevel\n      userAccountPrimaryNumber\n      userAccountSecondaryNumber\n      userAccountEmailVerification\n      defaultTeamId\n      allAllowedTeams\n      teamsAsLead\n      teamsAsReportees\n      allDirectReportees\n      allIndirectReportees\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
