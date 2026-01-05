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
public final class OnUpdateCloudTelephonyAccountSubscription implements Subscription<Data, Data, Operation.Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnUpdateCloudTelephonyAccount {\n  onUpdateCloudTelephonyAccount {\n    __typename\n    id\n    accountId\n    providerName\n    telephonyNumber\n    providerAccountId\n    displayNumber\n    hasOutbound\n    createNewLead\n    accessToken\n    cloudTelephonySubdomain\n    cloudTelephonyAccountSid\n    createdAt\n    updatedAt\n    entityListId\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateCloudTelephonyAccountSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnUpdateCloudTelephonyAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnUpdateCloudTelephonyAccount {\n  onUpdateCloudTelephonyAccount {\n    __typename\n    id\n    accountId\n    providerName\n    telephonyNumber\n    providerAccountId\n    displayNumber\n    hasOutbound\n    createNewLead\n    accessToken\n    cloudTelephonySubdomain\n    cloudTelephonyAccountSid\n    createdAt\n    updatedAt\n    entityListId\n    createdById\n    updatedById\n  }\n}";
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    public static final class Builder {
        public OnUpdateCloudTelephonyAccountSubscription build() {
            return new OnUpdateCloudTelephonyAccountSubscription();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onUpdateCloudTelephonyAccount", "onUpdateCloudTelephonyAccount", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnUpdateCloudTelephonyAccount onUpdateCloudTelephonyAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnUpdateCloudTelephonyAccount.Mapper onUpdateCloudTelephonyAccountFieldMapper = new OnUpdateCloudTelephonyAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnUpdateCloudTelephonyAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnUpdateCloudTelephonyAccount>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateCloudTelephonyAccountSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnUpdateCloudTelephonyAccount read(ResponseReader responseReader2) {
                        return Mapper.this.onUpdateCloudTelephonyAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnUpdateCloudTelephonyAccount onUpdateCloudTelephonyAccount) {
            this.onUpdateCloudTelephonyAccount = onUpdateCloudTelephonyAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnUpdateCloudTelephonyAccount onUpdateCloudTelephonyAccount = this.onUpdateCloudTelephonyAccount;
            OnUpdateCloudTelephonyAccount onUpdateCloudTelephonyAccount2 = ((Data) obj).onUpdateCloudTelephonyAccount;
            return onUpdateCloudTelephonyAccount == null ? onUpdateCloudTelephonyAccount2 == null : onUpdateCloudTelephonyAccount.equals(onUpdateCloudTelephonyAccount2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnUpdateCloudTelephonyAccount onUpdateCloudTelephonyAccount = this.onUpdateCloudTelephonyAccount;
                this.$hashCode = (onUpdateCloudTelephonyAccount == null ? 0 : onUpdateCloudTelephonyAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateCloudTelephonyAccountSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnUpdateCloudTelephonyAccount onUpdateCloudTelephonyAccount = Data.this.onUpdateCloudTelephonyAccount;
                    responseWriter.writeObject(responseField, onUpdateCloudTelephonyAccount != null ? onUpdateCloudTelephonyAccount.marshaller() : null);
                }
            };
        }

        public OnUpdateCloudTelephonyAccount onUpdateCloudTelephonyAccount() {
            return this.onUpdateCloudTelephonyAccount;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onUpdateCloudTelephonyAccount=" + this.onUpdateCloudTelephonyAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class OnUpdateCloudTelephonyAccount {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accessToken;
        final String accountId;
        final String cloudTelephonyAccountSid;
        final String cloudTelephonySubdomain;
        final Boolean createNewLead;
        final String createdAt;
        final String createdById;
        final String displayNumber;
        final String entityListId;
        final Boolean hasOutbound;
        final String id;
        final String providerAccountId;
        final String providerName;
        final String telephonyNumber;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<OnUpdateCloudTelephonyAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnUpdateCloudTelephonyAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnUpdateCloudTelephonyAccount.$responseFields;
                return new OnUpdateCloudTelephonyAccount(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readBoolean(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("providerName", "providerName", null, false, Collections.emptyList()), ResponseField.forString("telephonyNumber", "telephonyNumber", null, true, Collections.emptyList()), ResponseField.forString("providerAccountId", "providerAccountId", null, true, Collections.emptyList()), ResponseField.forString("displayNumber", "displayNumber", null, true, Collections.emptyList()), ResponseField.forBoolean("hasOutbound", "hasOutbound", null, true, Collections.emptyList()), ResponseField.forBoolean("createNewLead", "createNewLead", null, true, Collections.emptyList()), ResponseField.forString("accessToken", "accessToken", null, true, Collections.emptyList()), ResponseField.forString("cloudTelephonySubdomain", "cloudTelephonySubdomain", null, true, Collections.emptyList()), ResponseField.forString("cloudTelephonyAccountSid", "cloudTelephonyAccountSid", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("entityListId", "entityListId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public OnUpdateCloudTelephonyAccount(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.providerName = (String) Utils.checkNotNull(str4, "providerName == null");
            this.telephonyNumber = str5;
            this.providerAccountId = str6;
            this.displayNumber = str7;
            this.hasOutbound = bool;
            this.createNewLead = bool2;
            this.accessToken = str8;
            this.cloudTelephonySubdomain = str9;
            this.cloudTelephonyAccountSid = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.entityListId = str13;
            this.createdById = str14;
            this.updatedById = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accessToken() {
            return this.accessToken;
        }

        public String accountId() {
            return this.accountId;
        }

        public String cloudTelephonyAccountSid() {
            return this.cloudTelephonyAccountSid;
        }

        public String cloudTelephonySubdomain() {
            return this.cloudTelephonySubdomain;
        }

        public Boolean createNewLead() {
            return this.createNewLead;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String displayNumber() {
            return this.displayNumber;
        }

        public String entityListId() {
            return this.entityListId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Boolean bool;
            Boolean bool2;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnUpdateCloudTelephonyAccount)) {
                return false;
            }
            OnUpdateCloudTelephonyAccount onUpdateCloudTelephonyAccount = (OnUpdateCloudTelephonyAccount) obj;
            if (this.__typename.equals(onUpdateCloudTelephonyAccount.__typename) && this.id.equals(onUpdateCloudTelephonyAccount.id) && this.accountId.equals(onUpdateCloudTelephonyAccount.accountId) && this.providerName.equals(onUpdateCloudTelephonyAccount.providerName) && ((str = this.telephonyNumber) != null ? str.equals(onUpdateCloudTelephonyAccount.telephonyNumber) : onUpdateCloudTelephonyAccount.telephonyNumber == null) && ((str2 = this.providerAccountId) != null ? str2.equals(onUpdateCloudTelephonyAccount.providerAccountId) : onUpdateCloudTelephonyAccount.providerAccountId == null) && ((str3 = this.displayNumber) != null ? str3.equals(onUpdateCloudTelephonyAccount.displayNumber) : onUpdateCloudTelephonyAccount.displayNumber == null) && ((bool = this.hasOutbound) != null ? bool.equals(onUpdateCloudTelephonyAccount.hasOutbound) : onUpdateCloudTelephonyAccount.hasOutbound == null) && ((bool2 = this.createNewLead) != null ? bool2.equals(onUpdateCloudTelephonyAccount.createNewLead) : onUpdateCloudTelephonyAccount.createNewLead == null) && ((str4 = this.accessToken) != null ? str4.equals(onUpdateCloudTelephonyAccount.accessToken) : onUpdateCloudTelephonyAccount.accessToken == null) && ((str5 = this.cloudTelephonySubdomain) != null ? str5.equals(onUpdateCloudTelephonyAccount.cloudTelephonySubdomain) : onUpdateCloudTelephonyAccount.cloudTelephonySubdomain == null) && ((str6 = this.cloudTelephonyAccountSid) != null ? str6.equals(onUpdateCloudTelephonyAccount.cloudTelephonyAccountSid) : onUpdateCloudTelephonyAccount.cloudTelephonyAccountSid == null) && ((str7 = this.createdAt) != null ? str7.equals(onUpdateCloudTelephonyAccount.createdAt) : onUpdateCloudTelephonyAccount.createdAt == null) && ((str8 = this.updatedAt) != null ? str8.equals(onUpdateCloudTelephonyAccount.updatedAt) : onUpdateCloudTelephonyAccount.updatedAt == null) && ((str9 = this.entityListId) != null ? str9.equals(onUpdateCloudTelephonyAccount.entityListId) : onUpdateCloudTelephonyAccount.entityListId == null) && ((str10 = this.createdById) != null ? str10.equals(onUpdateCloudTelephonyAccount.createdById) : onUpdateCloudTelephonyAccount.createdById == null)) {
                String str11 = this.updatedById;
                String str12 = onUpdateCloudTelephonyAccount.updatedById;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public Boolean hasOutbound() {
            return this.hasOutbound;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.providerName.hashCode()) * 1000003;
                String str = this.telephonyNumber;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.providerAccountId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.displayNumber;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool = this.hasOutbound;
                int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.createNewLead;
                int iHashCode6 = (iHashCode5 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str4 = this.accessToken;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.cloudTelephonySubdomain;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.cloudTelephonyAccountSid;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.entityListId;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdById;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedById;
                this.$hashCode = iHashCode13 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateCloudTelephonyAccountSubscription.OnUpdateCloudTelephonyAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnUpdateCloudTelephonyAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnUpdateCloudTelephonyAccount.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnUpdateCloudTelephonyAccount.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnUpdateCloudTelephonyAccount.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], OnUpdateCloudTelephonyAccount.this.providerName);
                    responseWriter.writeString(responseFieldArr[4], OnUpdateCloudTelephonyAccount.this.telephonyNumber);
                    responseWriter.writeString(responseFieldArr[5], OnUpdateCloudTelephonyAccount.this.providerAccountId);
                    responseWriter.writeString(responseFieldArr[6], OnUpdateCloudTelephonyAccount.this.displayNumber);
                    responseWriter.writeBoolean(responseFieldArr[7], OnUpdateCloudTelephonyAccount.this.hasOutbound);
                    responseWriter.writeBoolean(responseFieldArr[8], OnUpdateCloudTelephonyAccount.this.createNewLead);
                    responseWriter.writeString(responseFieldArr[9], OnUpdateCloudTelephonyAccount.this.accessToken);
                    responseWriter.writeString(responseFieldArr[10], OnUpdateCloudTelephonyAccount.this.cloudTelephonySubdomain);
                    responseWriter.writeString(responseFieldArr[11], OnUpdateCloudTelephonyAccount.this.cloudTelephonyAccountSid);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], OnUpdateCloudTelephonyAccount.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], OnUpdateCloudTelephonyAccount.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], OnUpdateCloudTelephonyAccount.this.entityListId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], OnUpdateCloudTelephonyAccount.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], OnUpdateCloudTelephonyAccount.this.updatedById);
                }
            };
        }

        public String providerAccountId() {
            return this.providerAccountId;
        }

        public String providerName() {
            return this.providerName;
        }

        public String telephonyNumber() {
            return this.telephonyNumber;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnUpdateCloudTelephonyAccount{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", providerName=" + this.providerName + ", telephonyNumber=" + this.telephonyNumber + ", providerAccountId=" + this.providerAccountId + ", displayNumber=" + this.displayNumber + ", hasOutbound=" + this.hasOutbound + ", createNewLead=" + this.createNewLead + ", accessToken=" + this.accessToken + ", cloudTelephonySubdomain=" + this.cloudTelephonySubdomain + ", cloudTelephonyAccountSid=" + this.cloudTelephonyAccountSid + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", entityListId=" + this.entityListId + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
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
        return "a21b311d060aab05ce01507cd3f22417ff9cabbb8a09f3f1a75febe60dd8bb0e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnUpdateCloudTelephonyAccount {\n  onUpdateCloudTelephonyAccount {\n    __typename\n    id\n    accountId\n    providerName\n    telephonyNumber\n    providerAccountId\n    displayNumber\n    hasOutbound\n    createNewLead\n    accessToken\n    cloudTelephonySubdomain\n    cloudTelephonyAccountSid\n    createdAt\n    updatedAt\n    entityListId\n    createdById\n    updatedById\n  }\n}";
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
