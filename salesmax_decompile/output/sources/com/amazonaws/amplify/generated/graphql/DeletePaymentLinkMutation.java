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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.DeletePaymentLinkInput;
import type.ModelPaymentLinkConditionInput;

/* loaded from: classes7.dex */
public final class DeletePaymentLinkMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeletePaymentLink($input: DeletePaymentLinkInput!, $condition: ModelPaymentLinkConditionInput) {\n  deletePaymentLink(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    orderId\n    acceptPartial\n    firstMinPartialAmount\n    currency\n    amount\n    amountPaid\n    description\n    note\n    shortUrl\n    upiLink\n    status\n    expireBy\n    expiredAt\n    cancelledAt\n    createdAt\n    updatedAt\n    externalUserReference\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeletePaymentLinkMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeletePaymentLink";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeletePaymentLink($input: DeletePaymentLinkInput!, $condition: ModelPaymentLinkConditionInput) {\n  deletePaymentLink(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    orderId\n    acceptPartial\n    firstMinPartialAmount\n    currency\n    amount\n    amountPaid\n    description\n    note\n    shortUrl\n    upiLink\n    status\n    expireBy\n    expiredAt\n    cancelledAt\n    createdAt\n    updatedAt\n    externalUserReference\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelPaymentLinkConditionInput condition;
        private DeletePaymentLinkInput input;

        public DeletePaymentLinkMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeletePaymentLinkMutation(this.input, this.condition);
        }

        public Builder condition(ModelPaymentLinkConditionInput modelPaymentLinkConditionInput) {
            this.condition = modelPaymentLinkConditionInput;
            return this;
        }

        public Builder input(DeletePaymentLinkInput deletePaymentLinkInput) {
            this.input = deletePaymentLinkInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deletePaymentLink", "deletePaymentLink", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeletePaymentLink deletePaymentLink;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeletePaymentLink.Mapper deletePaymentLinkFieldMapper = new DeletePaymentLink.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeletePaymentLink) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeletePaymentLink>() { // from class: com.amazonaws.amplify.generated.graphql.DeletePaymentLinkMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeletePaymentLink read(ResponseReader responseReader2) {
                        return Mapper.this.deletePaymentLinkFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeletePaymentLink deletePaymentLink) {
            this.deletePaymentLink = deletePaymentLink;
        }

        public DeletePaymentLink deletePaymentLink() {
            return this.deletePaymentLink;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeletePaymentLink deletePaymentLink = this.deletePaymentLink;
            DeletePaymentLink deletePaymentLink2 = ((Data) obj).deletePaymentLink;
            return deletePaymentLink == null ? deletePaymentLink2 == null : deletePaymentLink.equals(deletePaymentLink2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeletePaymentLink deletePaymentLink = this.deletePaymentLink;
                this.$hashCode = (deletePaymentLink == null ? 0 : deletePaymentLink.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeletePaymentLinkMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeletePaymentLink deletePaymentLink = Data.this.deletePaymentLink;
                    responseWriter.writeObject(responseField, deletePaymentLink != null ? deletePaymentLink.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deletePaymentLink=" + this.deletePaymentLink + "}";
            }
            return this.$toString;
        }
    }

    public static class DeletePaymentLink {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Boolean acceptPartial;
        final String accountId;
        final Integer amount;
        final Integer amountPaid;
        final String cancelledAt;
        final String contactId;
        final String createdAt;
        final String createdById;
        final String currency;
        final String description;
        final String expireBy;
        final String expiredAt;
        final String externalUserReference;
        final Integer firstMinPartialAmount;
        final String id;
        final String idInPaymentProvider;
        final String note;
        final String orderId;
        final String paymentProvider;
        final String shortUrl;
        final String status;
        final String updatedAt;
        final String updatedById;
        final String upiLink;

        public static final class Mapper implements ResponseFieldMapper<DeletePaymentLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeletePaymentLink map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeletePaymentLink.$responseFields;
                return new DeletePaymentLink(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readInt(responseFieldArr[10]), responseReader.readInt(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("idInPaymentProvider", "idInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forCustomType("orderId", "orderId", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("acceptPartial", "acceptPartial", null, true, Collections.emptyList()), ResponseField.forInt("firstMinPartialAmount", "firstMinPartialAmount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forInt("amountPaid", "amountPaid", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forString("shortUrl", "shortUrl", null, true, Collections.emptyList()), ResponseField.forString("upiLink", "upiLink", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("expireBy", "expireBy", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("expiredAt", "expiredAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("cancelledAt", "cancelledAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("externalUserReference", "externalUserReference", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public DeletePaymentLink(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Integer num, String str8, Integer num2, Integer num3, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = str4;
            this.paymentProvider = str5;
            this.idInPaymentProvider = str6;
            this.orderId = str7;
            this.acceptPartial = bool;
            this.firstMinPartialAmount = num;
            this.currency = str8;
            this.amount = num2;
            this.amountPaid = num3;
            this.description = str9;
            this.note = str10;
            this.shortUrl = str11;
            this.upiLink = str12;
            this.status = str13;
            this.expireBy = str14;
            this.expiredAt = str15;
            this.cancelledAt = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
            this.externalUserReference = str19;
            this.createdById = str20;
            this.updatedById = str21;
        }

        public String __typename() {
            return this.__typename;
        }

        public Boolean acceptPartial() {
            return this.acceptPartial;
        }

        public String accountId() {
            return this.accountId;
        }

        public Integer amount() {
            return this.amount;
        }

        public Integer amountPaid() {
            return this.amountPaid;
        }

        public String cancelledAt() {
            return this.cancelledAt;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String currency() {
            return this.currency;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            Boolean bool;
            Integer num;
            String str5;
            Integer num2;
            Integer num3;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeletePaymentLink)) {
                return false;
            }
            DeletePaymentLink deletePaymentLink = (DeletePaymentLink) obj;
            if (this.__typename.equals(deletePaymentLink.__typename) && this.id.equals(deletePaymentLink.id) && this.accountId.equals(deletePaymentLink.accountId) && ((str = this.contactId) != null ? str.equals(deletePaymentLink.contactId) : deletePaymentLink.contactId == null) && ((str2 = this.paymentProvider) != null ? str2.equals(deletePaymentLink.paymentProvider) : deletePaymentLink.paymentProvider == null) && ((str3 = this.idInPaymentProvider) != null ? str3.equals(deletePaymentLink.idInPaymentProvider) : deletePaymentLink.idInPaymentProvider == null) && ((str4 = this.orderId) != null ? str4.equals(deletePaymentLink.orderId) : deletePaymentLink.orderId == null) && ((bool = this.acceptPartial) != null ? bool.equals(deletePaymentLink.acceptPartial) : deletePaymentLink.acceptPartial == null) && ((num = this.firstMinPartialAmount) != null ? num.equals(deletePaymentLink.firstMinPartialAmount) : deletePaymentLink.firstMinPartialAmount == null) && ((str5 = this.currency) != null ? str5.equals(deletePaymentLink.currency) : deletePaymentLink.currency == null) && ((num2 = this.amount) != null ? num2.equals(deletePaymentLink.amount) : deletePaymentLink.amount == null) && ((num3 = this.amountPaid) != null ? num3.equals(deletePaymentLink.amountPaid) : deletePaymentLink.amountPaid == null) && ((str6 = this.description) != null ? str6.equals(deletePaymentLink.description) : deletePaymentLink.description == null) && ((str7 = this.note) != null ? str7.equals(deletePaymentLink.note) : deletePaymentLink.note == null) && ((str8 = this.shortUrl) != null ? str8.equals(deletePaymentLink.shortUrl) : deletePaymentLink.shortUrl == null) && ((str9 = this.upiLink) != null ? str9.equals(deletePaymentLink.upiLink) : deletePaymentLink.upiLink == null) && ((str10 = this.status) != null ? str10.equals(deletePaymentLink.status) : deletePaymentLink.status == null) && ((str11 = this.expireBy) != null ? str11.equals(deletePaymentLink.expireBy) : deletePaymentLink.expireBy == null) && ((str12 = this.expiredAt) != null ? str12.equals(deletePaymentLink.expiredAt) : deletePaymentLink.expiredAt == null) && ((str13 = this.cancelledAt) != null ? str13.equals(deletePaymentLink.cancelledAt) : deletePaymentLink.cancelledAt == null) && ((str14 = this.createdAt) != null ? str14.equals(deletePaymentLink.createdAt) : deletePaymentLink.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(deletePaymentLink.updatedAt) : deletePaymentLink.updatedAt == null) && ((str16 = this.externalUserReference) != null ? str16.equals(deletePaymentLink.externalUserReference) : deletePaymentLink.externalUserReference == null) && ((str17 = this.createdById) != null ? str17.equals(deletePaymentLink.createdById) : deletePaymentLink.createdById == null)) {
                String str18 = this.updatedById;
                String str19 = deletePaymentLink.updatedById;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
                    return true;
                }
            }
            return false;
        }

        public String expireBy() {
            return this.expireBy;
        }

        public String expiredAt() {
            return this.expiredAt;
        }

        public String externalUserReference() {
            return this.externalUserReference;
        }

        public Integer firstMinPartialAmount() {
            return this.firstMinPartialAmount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.paymentProvider;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.idInPaymentProvider;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.orderId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                Boolean bool = this.acceptPartial;
                int iHashCode6 = (iHashCode5 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Integer num = this.firstMinPartialAmount;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str5 = this.currency;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num2 = this.amount;
                int iHashCode9 = (iHashCode8 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.amountPaid;
                int iHashCode10 = (iHashCode9 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str6 = this.description;
                int iHashCode11 = (iHashCode10 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.note;
                int iHashCode12 = (iHashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.shortUrl;
                int iHashCode13 = (iHashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.upiLink;
                int iHashCode14 = (iHashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.status;
                int iHashCode15 = (iHashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.expireBy;
                int iHashCode16 = (iHashCode15 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.expiredAt;
                int iHashCode17 = (iHashCode16 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.cancelledAt;
                int iHashCode18 = (iHashCode17 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode19 = (iHashCode18 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                int iHashCode20 = (iHashCode19 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.externalUserReference;
                int iHashCode21 = (iHashCode20 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdById;
                int iHashCode22 = (iHashCode21 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedById;
                this.$hashCode = iHashCode22 ^ (str18 != null ? str18.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String idInPaymentProvider() {
            return this.idInPaymentProvider;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeletePaymentLinkMutation.DeletePaymentLink.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeletePaymentLink.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeletePaymentLink.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeletePaymentLink.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeletePaymentLink.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeletePaymentLink.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], DeletePaymentLink.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[5], DeletePaymentLink.this.idInPaymentProvider);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], DeletePaymentLink.this.orderId);
                    responseWriter.writeBoolean(responseFieldArr[7], DeletePaymentLink.this.acceptPartial);
                    responseWriter.writeInt(responseFieldArr[8], DeletePaymentLink.this.firstMinPartialAmount);
                    responseWriter.writeString(responseFieldArr[9], DeletePaymentLink.this.currency);
                    responseWriter.writeInt(responseFieldArr[10], DeletePaymentLink.this.amount);
                    responseWriter.writeInt(responseFieldArr[11], DeletePaymentLink.this.amountPaid);
                    responseWriter.writeString(responseFieldArr[12], DeletePaymentLink.this.description);
                    responseWriter.writeString(responseFieldArr[13], DeletePaymentLink.this.note);
                    responseWriter.writeString(responseFieldArr[14], DeletePaymentLink.this.shortUrl);
                    responseWriter.writeString(responseFieldArr[15], DeletePaymentLink.this.upiLink);
                    responseWriter.writeString(responseFieldArr[16], DeletePaymentLink.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], DeletePaymentLink.this.expireBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], DeletePaymentLink.this.expiredAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], DeletePaymentLink.this.cancelledAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], DeletePaymentLink.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], DeletePaymentLink.this.updatedAt);
                    responseWriter.writeString(responseFieldArr[22], DeletePaymentLink.this.externalUserReference);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], DeletePaymentLink.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], DeletePaymentLink.this.updatedById);
                }
            };
        }

        public String note() {
            return this.note;
        }

        public String orderId() {
            return this.orderId;
        }

        public String paymentProvider() {
            return this.paymentProvider;
        }

        public String shortUrl() {
            return this.shortUrl;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeletePaymentLink{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentProvider=" + this.paymentProvider + ", idInPaymentProvider=" + this.idInPaymentProvider + ", orderId=" + this.orderId + ", acceptPartial=" + this.acceptPartial + ", firstMinPartialAmount=" + this.firstMinPartialAmount + ", currency=" + this.currency + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", description=" + this.description + ", note=" + this.note + ", shortUrl=" + this.shortUrl + ", upiLink=" + this.upiLink + ", status=" + this.status + ", expireBy=" + this.expireBy + ", expiredAt=" + this.expiredAt + ", cancelledAt=" + this.cancelledAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", externalUserReference=" + this.externalUserReference + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String upiLink() {
            return this.upiLink;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelPaymentLinkConditionInput condition;
        private final DeletePaymentLinkInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeletePaymentLinkInput deletePaymentLinkInput, ModelPaymentLinkConditionInput modelPaymentLinkConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deletePaymentLinkInput;
            this.condition = modelPaymentLinkConditionInput;
            linkedHashMap.put("input", deletePaymentLinkInput);
            linkedHashMap.put("condition", modelPaymentLinkConditionInput);
        }

        public ModelPaymentLinkConditionInput condition() {
            return this.condition;
        }

        public DeletePaymentLinkInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeletePaymentLinkMutation.Variables.1
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

    public DeletePaymentLinkMutation(DeletePaymentLinkInput deletePaymentLinkInput, ModelPaymentLinkConditionInput modelPaymentLinkConditionInput) {
        Utils.checkNotNull(deletePaymentLinkInput, "input == null");
        this.variables = new Variables(deletePaymentLinkInput, modelPaymentLinkConditionInput);
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
        return "26dc40a5529e37808e545b7c5c91a442466461a9394b3313793919475877b9f7";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeletePaymentLink($input: DeletePaymentLinkInput!, $condition: ModelPaymentLinkConditionInput) {\n  deletePaymentLink(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    paymentProvider\n    idInPaymentProvider\n    orderId\n    acceptPartial\n    firstMinPartialAmount\n    currency\n    amount\n    amountPaid\n    description\n    note\n    shortUrl\n    upiLink\n    status\n    expireBy\n    expiredAt\n    cancelledAt\n    createdAt\n    updatedAt\n    externalUserReference\n    createdById\n    updatedById\n  }\n}";
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
