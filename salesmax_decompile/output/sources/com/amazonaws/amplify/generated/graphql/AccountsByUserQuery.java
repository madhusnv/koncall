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
import type.AuthorizationLevel;
import type.CustomType;
import type.ModelAccountMembershipFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;
import type.UserStatus;

/* loaded from: classes.dex */
public final class AccountsByUserQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query AccountsByUser($userId: ID, $userAccountStatus: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountMembershipFilterInput, $limit: Int, $nextToken: String) {\n  accountsByUser(userId: $userId, userAccountStatus: $userAccountStatus, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      allowedDeviceId\n      designation\n      authorizationLevel\n      signature\n      isBillingMember\n      addedById\n      updatedById\n      addedOn\n      approvedById\n      approvedOn\n      acceptedOn\n      userAccountStatus\n      whatsappApiAccess\n      sharedInboxPermission\n      canInitiateNewConversation\n      canCreateWaCampaigns\n      mapRegisteredMobileNumberToAccount\n      mapSecondaryMobileNumberToAccount\n      accountEmail\n      accountEmailVerified\n      migrateToUserIdOnRemoval\n      prefScreenPop\n      prefSaveBusinessCall\n      prefPostCallDisposition\n      prefDefaultSimToCall\n      prefTrackLocationOnActivity\n      prefUseBusinessWhatsapp\n      prefTrackAllCalls\n      prefTrackAllCallsSpecificSim\n      onLeave\n      onLeaveTill\n      lastViewedChatNotification\n      prefReadOnlyInfo\n      customMemberAttributes\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "AccountsByUser";
        }
    };
    public static final String QUERY_DOCUMENT = "query AccountsByUser($userId: ID, $userAccountStatus: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountMembershipFilterInput, $limit: Int, $nextToken: String) {\n  accountsByUser(userId: $userId, userAccountStatus: $userAccountStatus, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      allowedDeviceId\n      designation\n      authorizationLevel\n      signature\n      isBillingMember\n      addedById\n      updatedById\n      addedOn\n      approvedById\n      approvedOn\n      acceptedOn\n      userAccountStatus\n      whatsappApiAccess\n      sharedInboxPermission\n      canInitiateNewConversation\n      canCreateWaCampaigns\n      mapRegisteredMobileNumberToAccount\n      mapSecondaryMobileNumberToAccount\n      accountEmail\n      accountEmailVerified\n      migrateToUserIdOnRemoval\n      prefScreenPop\n      prefSaveBusinessCall\n      prefPostCallDisposition\n      prefDefaultSimToCall\n      prefTrackLocationOnActivity\n      prefUseBusinessWhatsapp\n      prefTrackAllCalls\n      prefTrackAllCallsSpecificSim\n      onLeave\n      onLeaveTill\n      lastViewedChatNotification\n      prefReadOnlyInfo\n      customMemberAttributes\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static class AccountsByUser {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<AccountsByUser> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AccountsByUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AccountsByUser.$responseFields;
                return new AccountsByUser(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.AccountsByUser.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.AccountsByUser.Mapper.1.1
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

        public AccountsByUser(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof AccountsByUser)) {
                return false;
            }
            AccountsByUser accountsByUser = (AccountsByUser) obj;
            if (this.__typename.equals(accountsByUser.__typename) && this.items.equals(accountsByUser.items)) {
                String str = this.nextToken;
                String str2 = accountsByUser.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.AccountsByUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AccountsByUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AccountsByUser.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], AccountsByUser.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.AccountsByUser.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], AccountsByUser.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AccountsByUser{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Builder {
        private ModelAccountMembershipFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private ModelStringKeyConditionInput userAccountStatus;
        private String userId;

        public AccountsByUserQuery build() {
            return new AccountsByUserQuery(this.userId, this.userAccountStatus, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelAccountMembershipFilterInput modelAccountMembershipFilterInput) {
            this.filter = modelAccountMembershipFilterInput;
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

        public Builder userAccountStatus(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.userAccountStatus = modelStringKeyConditionInput;
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("accountsByUser", "accountsByUser", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("userAccountStatus", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userAccountStatus").build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final AccountsByUser accountsByUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final AccountsByUser.Mapper accountsByUserFieldMapper = new AccountsByUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((AccountsByUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<AccountsByUser>() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AccountsByUser read(ResponseReader responseReader2) {
                        return Mapper.this.accountsByUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(AccountsByUser accountsByUser) {
            this.accountsByUser = accountsByUser;
        }

        public AccountsByUser accountsByUser() {
            return this.accountsByUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            AccountsByUser accountsByUser = this.accountsByUser;
            AccountsByUser accountsByUser2 = ((Data) obj).accountsByUser;
            return accountsByUser == null ? accountsByUser2 == null : accountsByUser.equals(accountsByUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                AccountsByUser accountsByUser = this.accountsByUser;
                this.$hashCode = (accountsByUser == null ? 0 : accountsByUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    AccountsByUser accountsByUser = Data.this.accountsByUser;
                    responseWriter.writeObject(responseField, accountsByUser != null ? accountsByUser.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{accountsByUser=" + this.accountsByUser + "}";
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
        final String acceptedOn;
        final String accountEmail;
        final Boolean accountEmailVerified;
        final String accountId;
        final String addedById;
        final String addedOn;
        final List<String> allowedDeviceId;
        final String approvedById;
        final String approvedOn;
        final AuthorizationLevel authorizationLevel;
        final String canCreateWaCampaigns;
        final String canInitiateNewConversation;
        final String createdAt;
        final String customMemberAttributes;
        final String designation;
        final String id;
        final Boolean isBillingMember;
        final String lastViewedChatNotification;
        final boolean mapRegisteredMobileNumberToAccount;
        final boolean mapSecondaryMobileNumberToAccount;
        final String migrateToUserIdOnRemoval;
        final Boolean onLeave;
        final String onLeaveTill;
        final Integer prefDefaultSimToCall;
        final Boolean prefPostCallDisposition;
        final String prefReadOnlyInfo;
        final Boolean prefSaveBusinessCall;
        final Boolean prefScreenPop;
        final Boolean prefTrackAllCalls;
        final Integer prefTrackAllCallsSpecificSim;
        final Boolean prefTrackLocationOnActivity;
        final Boolean prefUseBusinessWhatsapp;
        final String sharedInboxPermission;
        final String signature;
        final String updatedAt;
        final String updatedById;
        final UserStatus userAccountStatus;
        final String userId;
        final String whatsappApiAccess;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                List list = responseReader.readList(responseFieldArr[4], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string2 = responseReader.readString(responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                AuthorizationLevel authorizationLevelValueOf = string3 != null ? AuthorizationLevel.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[7]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String str8 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                String str9 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]);
                String string5 = responseReader.readString(responseFieldArr[15]);
                return new Item(string, str, str2, str3, list, string2, authorizationLevelValueOf, string4, bool, str4, str5, str6, str7, str8, str9, string5 != null ? UserStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), responseReader.readString(responseFieldArr[19]), responseReader.readBoolean(responseFieldArr[20]).booleanValue(), responseReader.readBoolean(responseFieldArr[21]).booleanValue(), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), responseReader.readBoolean(responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), responseReader.readBoolean(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), responseReader.readBoolean(responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readBoolean(responseFieldArr[29]), responseReader.readBoolean(responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), responseReader.readInt(responseFieldArr[32]), responseReader.readBoolean(responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[39]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forList("allowedDeviceId", "allowedDeviceId", null, true, Collections.emptyList()), ResponseField.forString("designation", "designation", null, true, Collections.emptyList()), ResponseField.forString("authorizationLevel", "authorizationLevel", null, false, Collections.emptyList()), ResponseField.forString("signature", "signature", null, true, Collections.emptyList()), ResponseField.forBoolean("isBillingMember", "isBillingMember", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("addedOn", "addedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("approvedById", "approvedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("approvedOn", "approvedOn", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("acceptedOn", "acceptedOn", null, true, customType2, Collections.emptyList()), ResponseField.forString("userAccountStatus", "userAccountStatus", null, false, Collections.emptyList()), ResponseField.forString("whatsappApiAccess", "whatsappApiAccess", null, true, Collections.emptyList()), ResponseField.forString("sharedInboxPermission", "sharedInboxPermission", null, true, Collections.emptyList()), ResponseField.forString("canInitiateNewConversation", "canInitiateNewConversation", null, true, Collections.emptyList()), ResponseField.forString("canCreateWaCampaigns", "canCreateWaCampaigns", null, true, Collections.emptyList()), ResponseField.forBoolean("mapRegisteredMobileNumberToAccount", "mapRegisteredMobileNumberToAccount", null, false, Collections.emptyList()), ResponseField.forBoolean("mapSecondaryMobileNumberToAccount", "mapSecondaryMobileNumberToAccount", null, false, Collections.emptyList()), ResponseField.forCustomType("accountEmail", "accountEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("accountEmailVerified", "accountEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("migrateToUserIdOnRemoval", "migrateToUserIdOnRemoval", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("prefScreenPop", "prefScreenPop", null, true, Collections.emptyList()), ResponseField.forBoolean("prefSaveBusinessCall", "prefSaveBusinessCall", null, true, Collections.emptyList()), ResponseField.forBoolean("prefPostCallDisposition", "prefPostCallDisposition", null, true, Collections.emptyList()), ResponseField.forInt("prefDefaultSimToCall", "prefDefaultSimToCall", null, true, Collections.emptyList()), ResponseField.forBoolean("prefTrackLocationOnActivity", "prefTrackLocationOnActivity", null, true, Collections.emptyList()), ResponseField.forBoolean("prefUseBusinessWhatsapp", "prefUseBusinessWhatsapp", null, true, Collections.emptyList()), ResponseField.forBoolean("prefTrackAllCalls", "prefTrackAllCalls", null, true, Collections.emptyList()), ResponseField.forInt("prefTrackAllCallsSpecificSim", "prefTrackAllCallsSpecificSim", null, true, Collections.emptyList()), ResponseField.forBoolean("onLeave", "onLeave", null, true, Collections.emptyList()), ResponseField.forCustomType("onLeaveTill", "onLeaveTill", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastViewedChatNotification", "lastViewedChatNotification", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("prefReadOnlyInfo", "prefReadOnlyInfo", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("customMemberAttributes", "customMemberAttributes", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, List<String> list, String str5, AuthorizationLevel authorizationLevel, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, UserStatus userStatus, String str13, String str14, String str15, String str16, boolean z, boolean z2, String str17, Boolean bool2, String str18, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Boolean bool6, Boolean bool7, Boolean bool8, Integer num2, Boolean bool9, String str19, String str20, String str21, String str22, String str23, String str24) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str4, "userId == null");
            this.allowedDeviceId = list;
            this.designation = str5;
            this.authorizationLevel = (AuthorizationLevel) Utils.checkNotNull(authorizationLevel, "authorizationLevel == null");
            this.signature = str6;
            this.isBillingMember = bool;
            this.addedById = str7;
            this.updatedById = str8;
            this.addedOn = str9;
            this.approvedById = str10;
            this.approvedOn = str11;
            this.acceptedOn = str12;
            this.userAccountStatus = (UserStatus) Utils.checkNotNull(userStatus, "userAccountStatus == null");
            this.whatsappApiAccess = str13;
            this.sharedInboxPermission = str14;
            this.canInitiateNewConversation = str15;
            this.canCreateWaCampaigns = str16;
            this.mapRegisteredMobileNumberToAccount = z;
            this.mapSecondaryMobileNumberToAccount = z2;
            this.accountEmail = str17;
            this.accountEmailVerified = bool2;
            this.migrateToUserIdOnRemoval = str18;
            this.prefScreenPop = bool3;
            this.prefSaveBusinessCall = bool4;
            this.prefPostCallDisposition = bool5;
            this.prefDefaultSimToCall = num;
            this.prefTrackLocationOnActivity = bool6;
            this.prefUseBusinessWhatsapp = bool7;
            this.prefTrackAllCalls = bool8;
            this.prefTrackAllCallsSpecificSim = num2;
            this.onLeave = bool9;
            this.onLeaveTill = str19;
            this.lastViewedChatNotification = str20;
            this.prefReadOnlyInfo = str21;
            this.customMemberAttributes = str22;
            this.createdAt = str23;
            this.updatedAt = str24;
        }

        public String __typename() {
            return this.__typename;
        }

        public String acceptedOn() {
            return this.acceptedOn;
        }

        public String accountEmail() {
            return this.accountEmail;
        }

        public Boolean accountEmailVerified() {
            return this.accountEmailVerified;
        }

        public String accountId() {
            return this.accountId;
        }

        public String addedById() {
            return this.addedById;
        }

        public String addedOn() {
            return this.addedOn;
        }

        public List<String> allowedDeviceId() {
            return this.allowedDeviceId;
        }

        public String approvedById() {
            return this.approvedById;
        }

        public String approvedOn() {
            return this.approvedOn;
        }

        public AuthorizationLevel authorizationLevel() {
            return this.authorizationLevel;
        }

        public String canCreateWaCampaigns() {
            return this.canCreateWaCampaigns;
        }

        public String canInitiateNewConversation() {
            return this.canInitiateNewConversation;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String customMemberAttributes() {
            return this.customMemberAttributes;
        }

        public String designation() {
            return this.designation;
        }

        public boolean equals(Object obj) {
            List<String> list;
            String str;
            String str2;
            Boolean bool;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            Boolean bool2;
            String str14;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Integer num;
            Boolean bool6;
            Boolean bool7;
            Boolean bool8;
            Integer num2;
            Boolean bool9;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.userId.equals(item.userId) && ((list = this.allowedDeviceId) != null ? list.equals(item.allowedDeviceId) : item.allowedDeviceId == null) && ((str = this.designation) != null ? str.equals(item.designation) : item.designation == null) && this.authorizationLevel.equals(item.authorizationLevel) && ((str2 = this.signature) != null ? str2.equals(item.signature) : item.signature == null) && ((bool = this.isBillingMember) != null ? bool.equals(item.isBillingMember) : item.isBillingMember == null) && ((str3 = this.addedById) != null ? str3.equals(item.addedById) : item.addedById == null) && ((str4 = this.updatedById) != null ? str4.equals(item.updatedById) : item.updatedById == null) && ((str5 = this.addedOn) != null ? str5.equals(item.addedOn) : item.addedOn == null) && ((str6 = this.approvedById) != null ? str6.equals(item.approvedById) : item.approvedById == null) && ((str7 = this.approvedOn) != null ? str7.equals(item.approvedOn) : item.approvedOn == null) && ((str8 = this.acceptedOn) != null ? str8.equals(item.acceptedOn) : item.acceptedOn == null) && this.userAccountStatus.equals(item.userAccountStatus) && ((str9 = this.whatsappApiAccess) != null ? str9.equals(item.whatsappApiAccess) : item.whatsappApiAccess == null) && ((str10 = this.sharedInboxPermission) != null ? str10.equals(item.sharedInboxPermission) : item.sharedInboxPermission == null) && ((str11 = this.canInitiateNewConversation) != null ? str11.equals(item.canInitiateNewConversation) : item.canInitiateNewConversation == null) && ((str12 = this.canCreateWaCampaigns) != null ? str12.equals(item.canCreateWaCampaigns) : item.canCreateWaCampaigns == null) && this.mapRegisteredMobileNumberToAccount == item.mapRegisteredMobileNumberToAccount && this.mapSecondaryMobileNumberToAccount == item.mapSecondaryMobileNumberToAccount && ((str13 = this.accountEmail) != null ? str13.equals(item.accountEmail) : item.accountEmail == null) && ((bool2 = this.accountEmailVerified) != null ? bool2.equals(item.accountEmailVerified) : item.accountEmailVerified == null) && ((str14 = this.migrateToUserIdOnRemoval) != null ? str14.equals(item.migrateToUserIdOnRemoval) : item.migrateToUserIdOnRemoval == null) && ((bool3 = this.prefScreenPop) != null ? bool3.equals(item.prefScreenPop) : item.prefScreenPop == null) && ((bool4 = this.prefSaveBusinessCall) != null ? bool4.equals(item.prefSaveBusinessCall) : item.prefSaveBusinessCall == null) && ((bool5 = this.prefPostCallDisposition) != null ? bool5.equals(item.prefPostCallDisposition) : item.prefPostCallDisposition == null) && ((num = this.prefDefaultSimToCall) != null ? num.equals(item.prefDefaultSimToCall) : item.prefDefaultSimToCall == null) && ((bool6 = this.prefTrackLocationOnActivity) != null ? bool6.equals(item.prefTrackLocationOnActivity) : item.prefTrackLocationOnActivity == null) && ((bool7 = this.prefUseBusinessWhatsapp) != null ? bool7.equals(item.prefUseBusinessWhatsapp) : item.prefUseBusinessWhatsapp == null) && ((bool8 = this.prefTrackAllCalls) != null ? bool8.equals(item.prefTrackAllCalls) : item.prefTrackAllCalls == null) && ((num2 = this.prefTrackAllCallsSpecificSim) != null ? num2.equals(item.prefTrackAllCallsSpecificSim) : item.prefTrackAllCallsSpecificSim == null) && ((bool9 = this.onLeave) != null ? bool9.equals(item.onLeave) : item.onLeave == null) && ((str15 = this.onLeaveTill) != null ? str15.equals(item.onLeaveTill) : item.onLeaveTill == null) && ((str16 = this.lastViewedChatNotification) != null ? str16.equals(item.lastViewedChatNotification) : item.lastViewedChatNotification == null) && ((str17 = this.prefReadOnlyInfo) != null ? str17.equals(item.prefReadOnlyInfo) : item.prefReadOnlyInfo == null) && ((str18 = this.customMemberAttributes) != null ? str18.equals(item.customMemberAttributes) : item.customMemberAttributes == null) && ((str19 = this.createdAt) != null ? str19.equals(item.createdAt) : item.createdAt == null)) {
                String str20 = this.updatedAt;
                String str21 = item.updatedAt;
                if (str20 == null) {
                    if (str21 == null) {
                        return true;
                    }
                } else if (str20.equals(str21)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003;
                List<String> list = this.allowedDeviceId;
                int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.designation;
                int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.authorizationLevel.hashCode()) * 1000003;
                String str2 = this.signature;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.isBillingMember;
                int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str3 = this.addedById;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.updatedById;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.addedOn;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.approvedById;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.approvedOn;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.acceptedOn;
                int iHashCode11 = (((iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.userAccountStatus.hashCode()) * 1000003;
                String str9 = this.whatsappApiAccess;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.sharedInboxPermission;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.canInitiateNewConversation;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.canCreateWaCampaigns;
                int iHashCode15 = (((((iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003) ^ Boolean.valueOf(this.mapRegisteredMobileNumberToAccount).hashCode()) * 1000003) ^ Boolean.valueOf(this.mapSecondaryMobileNumberToAccount).hashCode()) * 1000003;
                String str13 = this.accountEmail;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                Boolean bool2 = this.accountEmailVerified;
                int iHashCode17 = (iHashCode16 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str14 = this.migrateToUserIdOnRemoval;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                Boolean bool3 = this.prefScreenPop;
                int iHashCode19 = (iHashCode18 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.prefSaveBusinessCall;
                int iHashCode20 = (iHashCode19 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.prefPostCallDisposition;
                int iHashCode21 = (iHashCode20 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Integer num = this.prefDefaultSimToCall;
                int iHashCode22 = (iHashCode21 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Boolean bool6 = this.prefTrackLocationOnActivity;
                int iHashCode23 = (iHashCode22 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                Boolean bool7 = this.prefUseBusinessWhatsapp;
                int iHashCode24 = (iHashCode23 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
                Boolean bool8 = this.prefTrackAllCalls;
                int iHashCode25 = (iHashCode24 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
                Integer num2 = this.prefTrackAllCallsSpecificSim;
                int iHashCode26 = (iHashCode25 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Boolean bool9 = this.onLeave;
                int iHashCode27 = (iHashCode26 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
                String str15 = this.onLeaveTill;
                int iHashCode28 = (iHashCode27 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.lastViewedChatNotification;
                int iHashCode29 = (iHashCode28 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.prefReadOnlyInfo;
                int iHashCode30 = (iHashCode29 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.customMemberAttributes;
                int iHashCode31 = (iHashCode30 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.createdAt;
                int iHashCode32 = (iHashCode31 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.updatedAt;
                this.$hashCode = iHashCode32 ^ (str20 != null ? str20.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isBillingMember() {
            return this.isBillingMember;
        }

        public String lastViewedChatNotification() {
            return this.lastViewedChatNotification;
        }

        public boolean mapRegisteredMobileNumberToAccount() {
            return this.mapRegisteredMobileNumberToAccount;
        }

        public boolean mapSecondaryMobileNumberToAccount() {
            return this.mapSecondaryMobileNumberToAccount;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.userId);
                    responseWriter.writeList(responseFieldArr[4], Item.this.allowedDeviceId, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[5], Item.this.designation);
                    responseWriter.writeString(responseFieldArr[6], Item.this.authorizationLevel.name());
                    responseWriter.writeString(responseFieldArr[7], Item.this.signature);
                    responseWriter.writeBoolean(responseFieldArr[8], Item.this.isBillingMember);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.addedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.approvedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.approvedOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.acceptedOn);
                    responseWriter.writeString(responseFieldArr[15], Item.this.userAccountStatus.name());
                    responseWriter.writeString(responseFieldArr[16], Item.this.whatsappApiAccess);
                    responseWriter.writeString(responseFieldArr[17], Item.this.sharedInboxPermission);
                    responseWriter.writeString(responseFieldArr[18], Item.this.canInitiateNewConversation);
                    responseWriter.writeString(responseFieldArr[19], Item.this.canCreateWaCampaigns);
                    responseWriter.writeBoolean(responseFieldArr[20], Boolean.valueOf(Item.this.mapRegisteredMobileNumberToAccount));
                    responseWriter.writeBoolean(responseFieldArr[21], Boolean.valueOf(Item.this.mapSecondaryMobileNumberToAccount));
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.accountEmail);
                    responseWriter.writeBoolean(responseFieldArr[23], Item.this.accountEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Item.this.migrateToUserIdOnRemoval);
                    responseWriter.writeBoolean(responseFieldArr[25], Item.this.prefScreenPop);
                    responseWriter.writeBoolean(responseFieldArr[26], Item.this.prefSaveBusinessCall);
                    responseWriter.writeBoolean(responseFieldArr[27], Item.this.prefPostCallDisposition);
                    responseWriter.writeInt(responseFieldArr[28], Item.this.prefDefaultSimToCall);
                    responseWriter.writeBoolean(responseFieldArr[29], Item.this.prefTrackLocationOnActivity);
                    responseWriter.writeBoolean(responseFieldArr[30], Item.this.prefUseBusinessWhatsapp);
                    responseWriter.writeBoolean(responseFieldArr[31], Item.this.prefTrackAllCalls);
                    responseWriter.writeInt(responseFieldArr[32], Item.this.prefTrackAllCallsSpecificSim);
                    responseWriter.writeBoolean(responseFieldArr[33], Item.this.onLeave);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], Item.this.onLeaveTill);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], Item.this.lastViewedChatNotification);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[36], Item.this.prefReadOnlyInfo);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], Item.this.customMemberAttributes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], Item.this.updatedAt);
                }
            };
        }

        public String migrateToUserIdOnRemoval() {
            return this.migrateToUserIdOnRemoval;
        }

        public Boolean onLeave() {
            return this.onLeave;
        }

        public String onLeaveTill() {
            return this.onLeaveTill;
        }

        public Integer prefDefaultSimToCall() {
            return this.prefDefaultSimToCall;
        }

        public Boolean prefPostCallDisposition() {
            return this.prefPostCallDisposition;
        }

        public String prefReadOnlyInfo() {
            return this.prefReadOnlyInfo;
        }

        public Boolean prefSaveBusinessCall() {
            return this.prefSaveBusinessCall;
        }

        public Boolean prefScreenPop() {
            return this.prefScreenPop;
        }

        public Boolean prefTrackAllCalls() {
            return this.prefTrackAllCalls;
        }

        public Integer prefTrackAllCallsSpecificSim() {
            return this.prefTrackAllCallsSpecificSim;
        }

        public Boolean prefTrackLocationOnActivity() {
            return this.prefTrackLocationOnActivity;
        }

        public Boolean prefUseBusinessWhatsapp() {
            return this.prefUseBusinessWhatsapp;
        }

        public String sharedInboxPermission() {
            return this.sharedInboxPermission;
        }

        public String signature() {
            return this.signature;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", allowedDeviceId=" + this.allowedDeviceId + ", designation=" + this.designation + ", authorizationLevel=" + this.authorizationLevel + ", signature=" + this.signature + ", isBillingMember=" + this.isBillingMember + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", addedOn=" + this.addedOn + ", approvedById=" + this.approvedById + ", approvedOn=" + this.approvedOn + ", acceptedOn=" + this.acceptedOn + ", userAccountStatus=" + this.userAccountStatus + ", whatsappApiAccess=" + this.whatsappApiAccess + ", sharedInboxPermission=" + this.sharedInboxPermission + ", canInitiateNewConversation=" + this.canInitiateNewConversation + ", canCreateWaCampaigns=" + this.canCreateWaCampaigns + ", mapRegisteredMobileNumberToAccount=" + this.mapRegisteredMobileNumberToAccount + ", mapSecondaryMobileNumberToAccount=" + this.mapSecondaryMobileNumberToAccount + ", accountEmail=" + this.accountEmail + ", accountEmailVerified=" + this.accountEmailVerified + ", migrateToUserIdOnRemoval=" + this.migrateToUserIdOnRemoval + ", prefScreenPop=" + this.prefScreenPop + ", prefSaveBusinessCall=" + this.prefSaveBusinessCall + ", prefPostCallDisposition=" + this.prefPostCallDisposition + ", prefDefaultSimToCall=" + this.prefDefaultSimToCall + ", prefTrackLocationOnActivity=" + this.prefTrackLocationOnActivity + ", prefUseBusinessWhatsapp=" + this.prefUseBusinessWhatsapp + ", prefTrackAllCalls=" + this.prefTrackAllCalls + ", prefTrackAllCallsSpecificSim=" + this.prefTrackAllCallsSpecificSim + ", onLeave=" + this.onLeave + ", onLeaveTill=" + this.onLeaveTill + ", lastViewedChatNotification=" + this.lastViewedChatNotification + ", prefReadOnlyInfo=" + this.prefReadOnlyInfo + ", customMemberAttributes=" + this.customMemberAttributes + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public UserStatus userAccountStatus() {
            return this.userAccountStatus;
        }

        public String userId() {
            return this.userId;
        }

        public String whatsappApiAccess() {
            return this.whatsappApiAccess;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelAccountMembershipFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final ModelStringKeyConditionInput userAccountStatus;
        private final String userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelAccountMembershipFilterInput modelAccountMembershipFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.userId = str;
            this.userAccountStatus = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelAccountMembershipFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("userId", str);
            linkedHashMap.put("userAccountStatus", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelAccountMembershipFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelAccountMembershipFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.AccountsByUserQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("userId", Variables.this.userId);
                    inputFieldWriter.writeObject("userAccountStatus", Variables.this.userAccountStatus != null ? Variables.this.userAccountStatus.marshaller() : null);
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

        public ModelStringKeyConditionInput userAccountStatus() {
            return this.userAccountStatus;
        }

        public String userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public AccountsByUserQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelAccountMembershipFilterInput modelAccountMembershipFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelAccountMembershipFilterInput, num, str2);
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
        return "86469a9ea39064fd2fe503f18501181ca42e79f883df192b98538b38fb2a8e73";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query AccountsByUser($userId: ID, $userAccountStatus: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelAccountMembershipFilterInput, $limit: Int, $nextToken: String) {\n  accountsByUser(userId: $userId, userAccountStatus: $userAccountStatus, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      allowedDeviceId\n      designation\n      authorizationLevel\n      signature\n      isBillingMember\n      addedById\n      updatedById\n      addedOn\n      approvedById\n      approvedOn\n      acceptedOn\n      userAccountStatus\n      whatsappApiAccess\n      sharedInboxPermission\n      canInitiateNewConversation\n      canCreateWaCampaigns\n      mapRegisteredMobileNumberToAccount\n      mapSecondaryMobileNumberToAccount\n      accountEmail\n      accountEmailVerified\n      migrateToUserIdOnRemoval\n      prefScreenPop\n      prefSaveBusinessCall\n      prefPostCallDisposition\n      prefDefaultSimToCall\n      prefTrackLocationOnActivity\n      prefUseBusinessWhatsapp\n      prefTrackAllCalls\n      prefTrackAllCallsSpecificSim\n      onLeave\n      onLeaveTill\n      lastViewedChatNotification\n      prefReadOnlyInfo\n      customMemberAttributes\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
