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
import type.DeviceRequestStatus;
import type.ModelDeviceRegistrationRequestFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes4.dex */
public final class ListRequestByUserQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListRequestByUser($userId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDeviceRegistrationRequestFilterInput, $limit: Int, $nextToken: String) {\n  listRequestByUser(userId: $userId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      requestedDeviceId\n      deviceModel\n      osVersion\n      ipAddress\n      reason\n      status\n      requestedAt\n      approvedBy\n      approvedAt\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListRequestByUser";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListRequestByUser($userId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDeviceRegistrationRequestFilterInput, $limit: Int, $nextToken: String) {\n  listRequestByUser(userId: $userId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      requestedDeviceId\n      deviceModel\n      osVersion\n      ipAddress\n      reason\n      status\n      requestedAt\n      approvedBy\n      approvedAt\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelDeviceRegistrationRequestFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;
        private ModelStringKeyConditionInput updatedAt;
        private String userId;

        public ListRequestByUserQuery build() {
            return new ListRequestByUserQuery(this.userId, this.updatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelDeviceRegistrationRequestFilterInput modelDeviceRegistrationRequestFilterInput) {
            this.filter = modelDeviceRegistrationRequestFilterInput;
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

        public Builder updatedAt(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.updatedAt = modelStringKeyConditionInput;
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listRequestByUser", "listRequestByUser", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).put("updatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "updatedAt").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListRequestByUser listRequestByUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListRequestByUser.Mapper listRequestByUserFieldMapper = new ListRequestByUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListRequestByUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListRequestByUser>() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListRequestByUser read(ResponseReader responseReader2) {
                        return Mapper.this.listRequestByUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListRequestByUser listRequestByUser) {
            this.listRequestByUser = listRequestByUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListRequestByUser listRequestByUser = this.listRequestByUser;
            ListRequestByUser listRequestByUser2 = ((Data) obj).listRequestByUser;
            return listRequestByUser == null ? listRequestByUser2 == null : listRequestByUser.equals(listRequestByUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListRequestByUser listRequestByUser = this.listRequestByUser;
                this.$hashCode = (listRequestByUser == null ? 0 : listRequestByUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListRequestByUser listRequestByUser() {
            return this.listRequestByUser;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListRequestByUser listRequestByUser = Data.this.listRequestByUser;
                    responseWriter.writeObject(responseField, listRequestByUser != null ? listRequestByUser.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listRequestByUser=" + this.listRequestByUser + "}";
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
        final String approvedAt;
        final String approvedBy;
        final String createdAt;
        final String deviceModel;
        final String id;
        final String ipAddress;
        final String osVersion;
        final String reason;
        final String requestedAt;
        final String requestedDeviceId;
        final DeviceRequestStatus status;
        final String updatedAt;
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
                String string3 = responseReader.readString(responseFieldArr[5]);
                String string4 = responseReader.readString(responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                String string6 = responseReader.readString(responseFieldArr[8]);
                String string7 = responseReader.readString(responseFieldArr[9]);
                return new Item(string, str, str2, str3, string2, string3, string4, string5, string6, string7 != null ? DeviceRequestStatus.valueOf(string7) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forString("requestedDeviceId", "requestedDeviceId", null, false, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("osVersion", "osVersion", null, true, Collections.emptyList()), ResponseField.forString("ipAddress", "ipAddress", null, true, Collections.emptyList()), ResponseField.forString("reason", "reason", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forCustomType("requestedAt", "requestedAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("approvedBy", "approvedBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("approvedAt", "approvedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DeviceRequestStatus deviceRequestStatus, String str10, String str11, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str4, "userId == null");
            this.requestedDeviceId = (String) Utils.checkNotNull(str5, "requestedDeviceId == null");
            this.deviceModel = str6;
            this.osVersion = str7;
            this.ipAddress = str8;
            this.reason = str9;
            this.status = (DeviceRequestStatus) Utils.checkNotNull(deviceRequestStatus, "status == null");
            this.requestedAt = (String) Utils.checkNotNull(str10, "requestedAt == null");
            this.approvedBy = str11;
            this.approvedAt = str12;
            this.createdAt = str13;
            this.updatedAt = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String approvedAt() {
            return this.approvedAt;
        }

        public String approvedBy() {
            return this.approvedBy;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.userId.equals(item.userId) && this.requestedDeviceId.equals(item.requestedDeviceId) && ((str = this.deviceModel) != null ? str.equals(item.deviceModel) : item.deviceModel == null) && ((str2 = this.osVersion) != null ? str2.equals(item.osVersion) : item.osVersion == null) && ((str3 = this.ipAddress) != null ? str3.equals(item.ipAddress) : item.ipAddress == null) && ((str4 = this.reason) != null ? str4.equals(item.reason) : item.reason == null) && this.status.equals(item.status) && this.requestedAt.equals(item.requestedAt) && ((str5 = this.approvedBy) != null ? str5.equals(item.approvedBy) : item.approvedBy == null) && ((str6 = this.approvedAt) != null ? str6.equals(item.approvedAt) : item.approvedAt == null) && ((str7 = this.createdAt) != null ? str7.equals(item.createdAt) : item.createdAt == null)) {
                String str8 = this.updatedAt;
                String str9 = item.updatedAt;
                if (str8 == null) {
                    if (str9 == null) {
                        return true;
                    }
                } else if (str8.equals(str9)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.requestedDeviceId.hashCode()) * 1000003;
                String str = this.deviceModel;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.osVersion;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ipAddress;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.reason;
                int iHashCode5 = (((((iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.status.hashCode()) * 1000003) ^ this.requestedAt.hashCode()) * 1000003;
                String str5 = this.approvedBy;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.approvedAt;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                this.$hashCode = iHashCode8 ^ (str8 != null ? str8.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String ipAddress() {
            return this.ipAddress;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.userId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.requestedDeviceId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[6], Item.this.osVersion);
                    responseWriter.writeString(responseFieldArr[7], Item.this.ipAddress);
                    responseWriter.writeString(responseFieldArr[8], Item.this.reason);
                    responseWriter.writeString(responseFieldArr[9], Item.this.status.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.requestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.approvedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.approvedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.updatedAt);
                }
            };
        }

        public String osVersion() {
            return this.osVersion;
        }

        public String reason() {
            return this.reason;
        }

        public String requestedAt() {
            return this.requestedAt;
        }

        public String requestedDeviceId() {
            return this.requestedDeviceId;
        }

        public DeviceRequestStatus status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", requestedDeviceId=" + this.requestedDeviceId + ", deviceModel=" + this.deviceModel + ", osVersion=" + this.osVersion + ", ipAddress=" + this.ipAddress + ", reason=" + this.reason + ", status=" + this.status + ", requestedAt=" + this.requestedAt + ", approvedBy=" + this.approvedBy + ", approvedAt=" + this.approvedAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class ListRequestByUser {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListRequestByUser> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListRequestByUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListRequestByUser.$responseFields;
                return new ListRequestByUser(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.ListRequestByUser.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.ListRequestByUser.Mapper.1.1
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

        public ListRequestByUser(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListRequestByUser)) {
                return false;
            }
            ListRequestByUser listRequestByUser = (ListRequestByUser) obj;
            if (this.__typename.equals(listRequestByUser.__typename) && this.items.equals(listRequestByUser.items)) {
                String str = this.nextToken;
                String str2 = listRequestByUser.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.ListRequestByUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListRequestByUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListRequestByUser.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListRequestByUser.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.ListRequestByUser.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListRequestByUser.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListRequestByUser{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelDeviceRegistrationRequestFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final ModelStringKeyConditionInput updatedAt;
        private final String userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelDeviceRegistrationRequestFilterInput modelDeviceRegistrationRequestFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.userId = str;
            this.updatedAt = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelDeviceRegistrationRequestFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("userId", str);
            linkedHashMap.put("updatedAt", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelDeviceRegistrationRequestFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelDeviceRegistrationRequestFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListRequestByUserQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("userId", Variables.this.userId);
                    inputFieldWriter.writeObject("updatedAt", Variables.this.updatedAt != null ? Variables.this.updatedAt.marshaller() : null);
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

        public ModelStringKeyConditionInput updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListRequestByUserQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelDeviceRegistrationRequestFilterInput modelDeviceRegistrationRequestFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelDeviceRegistrationRequestFilterInput, num, str2);
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
        return "7eadcad9ffc8b2a4e125932fcb46f389e8550653341d6d5365e0f6d429e4ecb3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListRequestByUser($userId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDeviceRegistrationRequestFilterInput, $limit: Int, $nextToken: String) {\n  listRequestByUser(userId: $userId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      userId\n      requestedDeviceId\n      deviceModel\n      osVersion\n      ipAddress\n      reason\n      status\n      requestedAt\n      approvedBy\n      approvedAt\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
