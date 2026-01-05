package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import type.CustomType;

/* loaded from: classes4.dex */
public final class OnUpdateWabaPhoneNumberUserSubscription implements Subscription<Data, Data, Operation.Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnUpdateWabaPhoneNumberUser {\n  onUpdateWabaPhoneNumberUser {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWabaPhoneNumberUserSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnUpdateWabaPhoneNumberUser";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnUpdateWabaPhoneNumberUser {\n  onUpdateWabaPhoneNumberUser {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    public static final class Builder {
        public OnUpdateWabaPhoneNumberUserSubscription build() {
            return new OnUpdateWabaPhoneNumberUserSubscription();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onUpdateWabaPhoneNumberUser", "onUpdateWabaPhoneNumberUser", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnUpdateWabaPhoneNumberUser onUpdateWabaPhoneNumberUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnUpdateWabaPhoneNumberUser.Mapper onUpdateWabaPhoneNumberUserFieldMapper = new OnUpdateWabaPhoneNumberUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnUpdateWabaPhoneNumberUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnUpdateWabaPhoneNumberUser>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWabaPhoneNumberUserSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnUpdateWabaPhoneNumberUser read(ResponseReader responseReader2) {
                        return Mapper.this.onUpdateWabaPhoneNumberUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnUpdateWabaPhoneNumberUser onUpdateWabaPhoneNumberUser) {
            this.onUpdateWabaPhoneNumberUser = onUpdateWabaPhoneNumberUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnUpdateWabaPhoneNumberUser onUpdateWabaPhoneNumberUser = this.onUpdateWabaPhoneNumberUser;
            OnUpdateWabaPhoneNumberUser onUpdateWabaPhoneNumberUser2 = ((Data) obj).onUpdateWabaPhoneNumberUser;
            return onUpdateWabaPhoneNumberUser == null ? onUpdateWabaPhoneNumberUser2 == null : onUpdateWabaPhoneNumberUser.equals(onUpdateWabaPhoneNumberUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnUpdateWabaPhoneNumberUser onUpdateWabaPhoneNumberUser = this.onUpdateWabaPhoneNumberUser;
                this.$hashCode = (onUpdateWabaPhoneNumberUser == null ? 0 : onUpdateWabaPhoneNumberUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWabaPhoneNumberUserSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnUpdateWabaPhoneNumberUser onUpdateWabaPhoneNumberUser = Data.this.onUpdateWabaPhoneNumberUser;
                    responseWriter.writeObject(responseField, onUpdateWabaPhoneNumberUser != null ? onUpdateWabaPhoneNumberUser.marshaller() : null);
                }
            };
        }

        public OnUpdateWabaPhoneNumberUser onUpdateWabaPhoneNumberUser() {
            return this.onUpdateWabaPhoneNumberUser;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onUpdateWabaPhoneNumberUser=" + this.onUpdateWabaPhoneNumberUser + "}";
            }
            return this.$toString;
        }
    }

    public static class OnUpdateWabaPhoneNumberUser {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String id;
        final Boolean isDefault;
        final String teamId;
        final String updatedAt;
        final String updatedById;
        final String userId;
        final String wabaPhoneNumberId;

        public static final class Mapper implements ResponseFieldMapper<OnUpdateWabaPhoneNumberUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnUpdateWabaPhoneNumberUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnUpdateWabaPhoneNumberUser.$responseFields;
                return new OnUpdateWabaPhoneNumberUser(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readBoolean(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("wabaPhoneNumberId", "wabaPhoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("isDefault", "isDefault", null, true, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("teamId", "teamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public OnUpdateWabaPhoneNumberUser(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.wabaPhoneNumberId = str4;
            this.isDefault = bool;
            this.userId = str5;
            this.teamId = str6;
            this.createdAt = str7;
            this.updatedAt = str8;
            this.createdById = str9;
            this.updatedById = str10;
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
            String str3;
            String str4;
            String str5;
            String str6;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnUpdateWabaPhoneNumberUser)) {
                return false;
            }
            OnUpdateWabaPhoneNumberUser onUpdateWabaPhoneNumberUser = (OnUpdateWabaPhoneNumberUser) obj;
            if (this.__typename.equals(onUpdateWabaPhoneNumberUser.__typename) && this.id.equals(onUpdateWabaPhoneNumberUser.id) && this.accountId.equals(onUpdateWabaPhoneNumberUser.accountId) && ((str = this.wabaPhoneNumberId) != null ? str.equals(onUpdateWabaPhoneNumberUser.wabaPhoneNumberId) : onUpdateWabaPhoneNumberUser.wabaPhoneNumberId == null) && ((bool = this.isDefault) != null ? bool.equals(onUpdateWabaPhoneNumberUser.isDefault) : onUpdateWabaPhoneNumberUser.isDefault == null) && ((str2 = this.userId) != null ? str2.equals(onUpdateWabaPhoneNumberUser.userId) : onUpdateWabaPhoneNumberUser.userId == null) && ((str3 = this.teamId) != null ? str3.equals(onUpdateWabaPhoneNumberUser.teamId) : onUpdateWabaPhoneNumberUser.teamId == null) && ((str4 = this.createdAt) != null ? str4.equals(onUpdateWabaPhoneNumberUser.createdAt) : onUpdateWabaPhoneNumberUser.createdAt == null) && ((str5 = this.updatedAt) != null ? str5.equals(onUpdateWabaPhoneNumberUser.updatedAt) : onUpdateWabaPhoneNumberUser.updatedAt == null) && ((str6 = this.createdById) != null ? str6.equals(onUpdateWabaPhoneNumberUser.createdById) : onUpdateWabaPhoneNumberUser.createdById == null)) {
                String str7 = this.updatedById;
                String str8 = onUpdateWabaPhoneNumberUser.updatedById;
                if (str7 == null) {
                    if (str8 == null) {
                        return true;
                    }
                } else if (str7.equals(str8)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.wabaPhoneNumberId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.isDefault;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.userId;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamId;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.createdById;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedById;
                this.$hashCode = iHashCode8 ^ (str7 != null ? str7.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isDefault() {
            return this.isDefault;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWabaPhoneNumberUserSubscription.OnUpdateWabaPhoneNumberUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnUpdateWabaPhoneNumberUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnUpdateWabaPhoneNumberUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnUpdateWabaPhoneNumberUser.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnUpdateWabaPhoneNumberUser.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnUpdateWabaPhoneNumberUser.this.wabaPhoneNumberId);
                    responseWriter.writeBoolean(responseFieldArr[4], OnUpdateWabaPhoneNumberUser.this.isDefault);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], OnUpdateWabaPhoneNumberUser.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], OnUpdateWabaPhoneNumberUser.this.teamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnUpdateWabaPhoneNumberUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnUpdateWabaPhoneNumberUser.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], OnUpdateWabaPhoneNumberUser.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], OnUpdateWabaPhoneNumberUser.this.updatedById);
                }
            };
        }

        public String teamId() {
            return this.teamId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnUpdateWabaPhoneNumberUser{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaPhoneNumberId=" + this.wabaPhoneNumberId + ", isDefault=" + this.isDefault + ", userId=" + this.userId + ", teamId=" + this.teamId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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

        public String wabaPhoneNumberId() {
            return this.wabaPhoneNumberId;
        }
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
        return "0e32d4555b3d3b63b6297293906f593c992df35cde64926d5831bd850f4f4f64";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnUpdateWabaPhoneNumberUser {\n  onUpdateWabaPhoneNumberUser {\n    __typename\n    id\n    accountId\n    wabaPhoneNumberId\n    isDefault\n    userId\n    teamId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Operation.Variables variables() {
        return this.variables;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }
}
