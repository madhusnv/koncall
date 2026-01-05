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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CreateInitialProductPlanSubscriptionInput;
import type.CustomType;

/* loaded from: classes6.dex */
public final class CreateInitialProductPlanSubscriptionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateInitialProductPlanSubscription($input: CreateInitialProductPlanSubscriptionInput!) {\n  createInitialProductPlanSubscription(input: $input) {\n    __typename\n    id\n    accountId\n    addedById\n    productAccountId\n    productPlanId\n    planDescription\n    planStatus\n    planFeePerUnit\n    planFeeProRataPerUnit\n    period\n    amount\n    currency\n    status\n    numberOfUnits\n    numberOfFreeUnits\n    unitType\n    subscriptionPaymentStatus\n    subscriptionStartDate\n    subscriptionEndDate\n    createdAt\n    updatedAt\n    productPlan {\n      __typename\n      id\n      accountId\n      productId\n      planDescription\n      planStatus\n      period\n      fee\n      proRataFee\n      currency\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateInitialProductPlanSubscriptionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateInitialProductPlanSubscription";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateInitialProductPlanSubscription($input: CreateInitialProductPlanSubscriptionInput!) {\n  createInitialProductPlanSubscription(input: $input) {\n    __typename\n    id\n    accountId\n    addedById\n    productAccountId\n    productPlanId\n    planDescription\n    planStatus\n    planFeePerUnit\n    planFeeProRataPerUnit\n    period\n    amount\n    currency\n    status\n    numberOfUnits\n    numberOfFreeUnits\n    unitType\n    subscriptionPaymentStatus\n    subscriptionStartDate\n    subscriptionEndDate\n    createdAt\n    updatedAt\n    productPlan {\n      __typename\n      id\n      accountId\n      productId\n      planDescription\n      planStatus\n      period\n      fee\n      proRataFee\n      currency\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private CreateInitialProductPlanSubscriptionInput input;

        public CreateInitialProductPlanSubscriptionMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateInitialProductPlanSubscriptionMutation(this.input);
        }

        public Builder input(CreateInitialProductPlanSubscriptionInput createInitialProductPlanSubscriptionInput) {
            this.input = createInitialProductPlanSubscriptionInput;
            return this;
        }
    }

    public static class CreateInitialProductPlanSubscription {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String addedById;
        final Integer amount;
        final String createdAt;
        final String currency;
        final String id;
        final Integer numberOfFreeUnits;
        final Integer numberOfUnits;
        final String period;
        final String planDescription;
        final Integer planFeePerUnit;
        final Integer planFeeProRataPerUnit;
        final String planStatus;
        final String productAccountId;
        final ProductPlan productPlan;
        final String productPlanId;
        final String status;
        final String subscriptionEndDate;
        final String subscriptionPaymentStatus;
        final String subscriptionStartDate;
        final String unitType;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<CreateInitialProductPlanSubscription> {
            final ProductPlan.Mapper productPlanFieldMapper = new ProductPlan.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateInitialProductPlanSubscription map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateInitialProductPlanSubscription.$responseFields;
                return new CreateInitialProductPlanSubscription(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readInt(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readInt(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readInt(responseFieldArr[14]), responseReader.readInt(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (ProductPlan) responseReader.readObject(responseFieldArr[22], new ResponseReader.ObjectReader<ProductPlan>() { // from class: com.amazonaws.amplify.generated.graphql.CreateInitialProductPlanSubscriptionMutation.CreateInitialProductPlanSubscription.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ProductPlan read(ResponseReader responseReader2) {
                        return Mapper.this.productPlanFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productAccountId", "productAccountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("productPlanId", "productPlanId", null, false, customType, Collections.emptyList()), ResponseField.forString("planDescription", "planDescription", null, true, Collections.emptyList()), ResponseField.forString("planStatus", "planStatus", null, true, Collections.emptyList()), ResponseField.forInt("planFeePerUnit", "planFeePerUnit", null, true, Collections.emptyList()), ResponseField.forInt("planFeeProRataPerUnit", "planFeeProRataPerUnit", null, true, Collections.emptyList()), ResponseField.forString("period", "period", null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forInt("numberOfUnits", "numberOfUnits", null, true, Collections.emptyList()), ResponseField.forInt("numberOfFreeUnits", "numberOfFreeUnits", null, true, Collections.emptyList()), ResponseField.forString("unitType", "unitType", null, true, Collections.emptyList()), ResponseField.forString("subscriptionPaymentStatus", "subscriptionPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("subscriptionStartDate", "subscriptionStartDate", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("subscriptionEndDate", "subscriptionEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList()), ResponseField.forObject("productPlan", "productPlan", null, true, Collections.emptyList())};
        }

        public CreateInitialProductPlanSubscription(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9, Integer num3, String str10, String str11, Integer num4, Integer num5, String str12, String str13, String str14, String str15, String str16, String str17, ProductPlan productPlan) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.addedById = (String) Utils.checkNotNull(str4, "addedById == null");
            this.productAccountId = str5;
            this.productPlanId = (String) Utils.checkNotNull(str6, "productPlanId == null");
            this.planDescription = str7;
            this.planStatus = str8;
            this.planFeePerUnit = num;
            this.planFeeProRataPerUnit = num2;
            this.period = str9;
            this.amount = num3;
            this.currency = str10;
            this.status = str11;
            this.numberOfUnits = num4;
            this.numberOfFreeUnits = num5;
            this.unitType = str12;
            this.subscriptionPaymentStatus = str13;
            this.subscriptionStartDate = (String) Utils.checkNotNull(str14, "subscriptionStartDate == null");
            this.subscriptionEndDate = str15;
            this.createdAt = (String) Utils.checkNotNull(str16, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str17, "updatedAt == null");
            this.productPlan = productPlan;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String addedById() {
            return this.addedById;
        }

        public Integer amount() {
            return this.amount;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Integer num;
            Integer num2;
            String str4;
            Integer num3;
            String str5;
            String str6;
            Integer num4;
            Integer num5;
            String str7;
            String str8;
            String str9;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateInitialProductPlanSubscription)) {
                return false;
            }
            CreateInitialProductPlanSubscription createInitialProductPlanSubscription = (CreateInitialProductPlanSubscription) obj;
            if (this.__typename.equals(createInitialProductPlanSubscription.__typename) && this.id.equals(createInitialProductPlanSubscription.id) && this.accountId.equals(createInitialProductPlanSubscription.accountId) && this.addedById.equals(createInitialProductPlanSubscription.addedById) && ((str = this.productAccountId) != null ? str.equals(createInitialProductPlanSubscription.productAccountId) : createInitialProductPlanSubscription.productAccountId == null) && this.productPlanId.equals(createInitialProductPlanSubscription.productPlanId) && ((str2 = this.planDescription) != null ? str2.equals(createInitialProductPlanSubscription.planDescription) : createInitialProductPlanSubscription.planDescription == null) && ((str3 = this.planStatus) != null ? str3.equals(createInitialProductPlanSubscription.planStatus) : createInitialProductPlanSubscription.planStatus == null) && ((num = this.planFeePerUnit) != null ? num.equals(createInitialProductPlanSubscription.planFeePerUnit) : createInitialProductPlanSubscription.planFeePerUnit == null) && ((num2 = this.planFeeProRataPerUnit) != null ? num2.equals(createInitialProductPlanSubscription.planFeeProRataPerUnit) : createInitialProductPlanSubscription.planFeeProRataPerUnit == null) && ((str4 = this.period) != null ? str4.equals(createInitialProductPlanSubscription.period) : createInitialProductPlanSubscription.period == null) && ((num3 = this.amount) != null ? num3.equals(createInitialProductPlanSubscription.amount) : createInitialProductPlanSubscription.amount == null) && ((str5 = this.currency) != null ? str5.equals(createInitialProductPlanSubscription.currency) : createInitialProductPlanSubscription.currency == null) && ((str6 = this.status) != null ? str6.equals(createInitialProductPlanSubscription.status) : createInitialProductPlanSubscription.status == null) && ((num4 = this.numberOfUnits) != null ? num4.equals(createInitialProductPlanSubscription.numberOfUnits) : createInitialProductPlanSubscription.numberOfUnits == null) && ((num5 = this.numberOfFreeUnits) != null ? num5.equals(createInitialProductPlanSubscription.numberOfFreeUnits) : createInitialProductPlanSubscription.numberOfFreeUnits == null) && ((str7 = this.unitType) != null ? str7.equals(createInitialProductPlanSubscription.unitType) : createInitialProductPlanSubscription.unitType == null) && ((str8 = this.subscriptionPaymentStatus) != null ? str8.equals(createInitialProductPlanSubscription.subscriptionPaymentStatus) : createInitialProductPlanSubscription.subscriptionPaymentStatus == null) && this.subscriptionStartDate.equals(createInitialProductPlanSubscription.subscriptionStartDate) && ((str9 = this.subscriptionEndDate) != null ? str9.equals(createInitialProductPlanSubscription.subscriptionEndDate) : createInitialProductPlanSubscription.subscriptionEndDate == null) && this.createdAt.equals(createInitialProductPlanSubscription.createdAt) && this.updatedAt.equals(createInitialProductPlanSubscription.updatedAt)) {
                ProductPlan productPlan = this.productPlan;
                ProductPlan productPlan2 = createInitialProductPlanSubscription.productPlan;
                if (productPlan == null) {
                    if (productPlan2 == null) {
                        return true;
                    }
                } else if (productPlan.equals(productPlan2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.addedById.hashCode()) * 1000003;
                String str = this.productAccountId;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.productPlanId.hashCode()) * 1000003;
                String str2 = this.planDescription;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.planStatus;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.planFeePerUnit;
                int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.planFeeProRataPerUnit;
                int iHashCode6 = (iHashCode5 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str4 = this.period;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                Integer num3 = this.amount;
                int iHashCode8 = (iHashCode7 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str5 = this.currency;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.status;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num4 = this.numberOfUnits;
                int iHashCode11 = (iHashCode10 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.numberOfFreeUnits;
                int iHashCode12 = (iHashCode11 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                String str7 = this.unitType;
                int iHashCode13 = (iHashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.subscriptionPaymentStatus;
                int iHashCode14 = (((iHashCode13 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.subscriptionStartDate.hashCode()) * 1000003;
                String str9 = this.subscriptionEndDate;
                int iHashCode15 = (((((iHashCode14 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode()) * 1000003;
                ProductPlan productPlan = this.productPlan;
                this.$hashCode = iHashCode15 ^ (productPlan != null ? productPlan.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateInitialProductPlanSubscriptionMutation.CreateInitialProductPlanSubscription.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateInitialProductPlanSubscription.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateInitialProductPlanSubscription.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateInitialProductPlanSubscription.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateInitialProductPlanSubscription.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateInitialProductPlanSubscription.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], CreateInitialProductPlanSubscription.this.productAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], CreateInitialProductPlanSubscription.this.productPlanId);
                    responseWriter.writeString(responseFieldArr[6], CreateInitialProductPlanSubscription.this.planDescription);
                    responseWriter.writeString(responseFieldArr[7], CreateInitialProductPlanSubscription.this.planStatus);
                    responseWriter.writeInt(responseFieldArr[8], CreateInitialProductPlanSubscription.this.planFeePerUnit);
                    responseWriter.writeInt(responseFieldArr[9], CreateInitialProductPlanSubscription.this.planFeeProRataPerUnit);
                    responseWriter.writeString(responseFieldArr[10], CreateInitialProductPlanSubscription.this.period);
                    responseWriter.writeInt(responseFieldArr[11], CreateInitialProductPlanSubscription.this.amount);
                    responseWriter.writeString(responseFieldArr[12], CreateInitialProductPlanSubscription.this.currency);
                    responseWriter.writeString(responseFieldArr[13], CreateInitialProductPlanSubscription.this.status);
                    responseWriter.writeInt(responseFieldArr[14], CreateInitialProductPlanSubscription.this.numberOfUnits);
                    responseWriter.writeInt(responseFieldArr[15], CreateInitialProductPlanSubscription.this.numberOfFreeUnits);
                    responseWriter.writeString(responseFieldArr[16], CreateInitialProductPlanSubscription.this.unitType);
                    responseWriter.writeString(responseFieldArr[17], CreateInitialProductPlanSubscription.this.subscriptionPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], CreateInitialProductPlanSubscription.this.subscriptionStartDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], CreateInitialProductPlanSubscription.this.subscriptionEndDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], CreateInitialProductPlanSubscription.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], CreateInitialProductPlanSubscription.this.updatedAt);
                    ResponseField responseField = responseFieldArr[22];
                    ProductPlan productPlan = CreateInitialProductPlanSubscription.this.productPlan;
                    responseWriter.writeObject(responseField, productPlan != null ? productPlan.marshaller() : null);
                }
            };
        }

        public Integer numberOfFreeUnits() {
            return this.numberOfFreeUnits;
        }

        public Integer numberOfUnits() {
            return this.numberOfUnits;
        }

        public String period() {
            return this.period;
        }

        public String planDescription() {
            return this.planDescription;
        }

        public Integer planFeePerUnit() {
            return this.planFeePerUnit;
        }

        public Integer planFeeProRataPerUnit() {
            return this.planFeeProRataPerUnit;
        }

        public String planStatus() {
            return this.planStatus;
        }

        public String productAccountId() {
            return this.productAccountId;
        }

        public ProductPlan productPlan() {
            return this.productPlan;
        }

        public String productPlanId() {
            return this.productPlanId;
        }

        public String status() {
            return this.status;
        }

        public String subscriptionEndDate() {
            return this.subscriptionEndDate;
        }

        public String subscriptionPaymentStatus() {
            return this.subscriptionPaymentStatus;
        }

        public String subscriptionStartDate() {
            return this.subscriptionStartDate;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateInitialProductPlanSubscription{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", addedById=" + this.addedById + ", productAccountId=" + this.productAccountId + ", productPlanId=" + this.productPlanId + ", planDescription=" + this.planDescription + ", planStatus=" + this.planStatus + ", planFeePerUnit=" + this.planFeePerUnit + ", planFeeProRataPerUnit=" + this.planFeeProRataPerUnit + ", period=" + this.period + ", amount=" + this.amount + ", currency=" + this.currency + ", status=" + this.status + ", numberOfUnits=" + this.numberOfUnits + ", numberOfFreeUnits=" + this.numberOfFreeUnits + ", unitType=" + this.unitType + ", subscriptionPaymentStatus=" + this.subscriptionPaymentStatus + ", subscriptionStartDate=" + this.subscriptionStartDate + ", subscriptionEndDate=" + this.subscriptionEndDate + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", productPlan=" + this.productPlan + "}";
            }
            return this.$toString;
        }

        public String unitType() {
            return this.unitType;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createInitialProductPlanSubscription", "createInitialProductPlanSubscription", new UnmodifiableMapBuilder(1).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateInitialProductPlanSubscription createInitialProductPlanSubscription;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateInitialProductPlanSubscription.Mapper createInitialProductPlanSubscriptionFieldMapper = new CreateInitialProductPlanSubscription.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateInitialProductPlanSubscription) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateInitialProductPlanSubscription>() { // from class: com.amazonaws.amplify.generated.graphql.CreateInitialProductPlanSubscriptionMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateInitialProductPlanSubscription read(ResponseReader responseReader2) {
                        return Mapper.this.createInitialProductPlanSubscriptionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateInitialProductPlanSubscription createInitialProductPlanSubscription) {
            this.createInitialProductPlanSubscription = createInitialProductPlanSubscription;
        }

        public CreateInitialProductPlanSubscription createInitialProductPlanSubscription() {
            return this.createInitialProductPlanSubscription;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateInitialProductPlanSubscription createInitialProductPlanSubscription = this.createInitialProductPlanSubscription;
            CreateInitialProductPlanSubscription createInitialProductPlanSubscription2 = ((Data) obj).createInitialProductPlanSubscription;
            return createInitialProductPlanSubscription == null ? createInitialProductPlanSubscription2 == null : createInitialProductPlanSubscription.equals(createInitialProductPlanSubscription2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateInitialProductPlanSubscription createInitialProductPlanSubscription = this.createInitialProductPlanSubscription;
                this.$hashCode = (createInitialProductPlanSubscription == null ? 0 : createInitialProductPlanSubscription.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateInitialProductPlanSubscriptionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateInitialProductPlanSubscription createInitialProductPlanSubscription = Data.this.createInitialProductPlanSubscription;
                    responseWriter.writeObject(responseField, createInitialProductPlanSubscription != null ? createInitialProductPlanSubscription.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createInitialProductPlanSubscription=" + this.createInitialProductPlanSubscription + "}";
            }
            return this.$toString;
        }
    }

    public static class ProductPlan {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String currency;
        final int fee;
        final String id;
        final String period;
        final String planDescription;
        final String planStatus;
        final Integer proRataFee;
        final String productId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<ProductPlan> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ProductPlan map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ProductPlan.$responseFields;
                return new ProductPlan(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]).intValue(), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, false, customType, Collections.emptyList()), ResponseField.forString("planDescription", "planDescription", null, true, Collections.emptyList()), ResponseField.forString("planStatus", "planStatus", null, false, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forInt("fee", "fee", null, false, Collections.emptyList()), ResponseField.forInt("proRataFee", "proRataFee", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, false, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public ProductPlan(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Integer num, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.productId = (String) Utils.checkNotNull(str4, "productId == null");
            this.planDescription = str5;
            this.planStatus = (String) Utils.checkNotNull(str6, "planStatus == null");
            this.period = (String) Utils.checkNotNull(str7, "period == null");
            this.fee = i;
            this.proRataFee = num;
            this.currency = (String) Utils.checkNotNull(str8, "currency == null");
            this.createdAt = (String) Utils.checkNotNull(str9, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str10, "updatedAt == null");
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

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            String str;
            Integer num;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProductPlan)) {
                return false;
            }
            ProductPlan productPlan = (ProductPlan) obj;
            return this.__typename.equals(productPlan.__typename) && this.id.equals(productPlan.id) && this.accountId.equals(productPlan.accountId) && this.productId.equals(productPlan.productId) && ((str = this.planDescription) != null ? str.equals(productPlan.planDescription) : productPlan.planDescription == null) && this.planStatus.equals(productPlan.planStatus) && this.period.equals(productPlan.period) && this.fee == productPlan.fee && ((num = this.proRataFee) != null ? num.equals(productPlan.proRataFee) : productPlan.proRataFee == null) && this.currency.equals(productPlan.currency) && this.createdAt.equals(productPlan.createdAt) && this.updatedAt.equals(productPlan.updatedAt);
        }

        public int fee() {
            return this.fee;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003;
                String str = this.planDescription;
                int iHashCode2 = (((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.planStatus.hashCode()) * 1000003) ^ this.period.hashCode()) * 1000003) ^ this.fee) * 1000003;
                Integer num = this.proRataFee;
                this.$hashCode = ((((((iHashCode2 ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ this.currency.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateInitialProductPlanSubscriptionMutation.ProductPlan.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ProductPlan.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ProductPlan.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ProductPlan.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ProductPlan.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], ProductPlan.this.productId);
                    responseWriter.writeString(responseFieldArr[4], ProductPlan.this.planDescription);
                    responseWriter.writeString(responseFieldArr[5], ProductPlan.this.planStatus);
                    responseWriter.writeString(responseFieldArr[6], ProductPlan.this.period);
                    responseWriter.writeInt(responseFieldArr[7], Integer.valueOf(ProductPlan.this.fee));
                    responseWriter.writeInt(responseFieldArr[8], ProductPlan.this.proRataFee);
                    responseWriter.writeString(responseFieldArr[9], ProductPlan.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], ProductPlan.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], ProductPlan.this.updatedAt);
                }
            };
        }

        public String period() {
            return this.period;
        }

        public String planDescription() {
            return this.planDescription;
        }

        public String planStatus() {
            return this.planStatus;
        }

        public Integer proRataFee() {
            return this.proRataFee;
        }

        public String productId() {
            return this.productId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ProductPlan{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", productId=" + this.productId + ", planDescription=" + this.planDescription + ", planStatus=" + this.planStatus + ", period=" + this.period + ", fee=" + this.fee + ", proRataFee=" + this.proRataFee + ", currency=" + this.currency + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final CreateInitialProductPlanSubscriptionInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateInitialProductPlanSubscriptionInput createInitialProductPlanSubscriptionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createInitialProductPlanSubscriptionInput;
            linkedHashMap.put("input", createInitialProductPlanSubscriptionInput);
        }

        public CreateInitialProductPlanSubscriptionInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateInitialProductPlanSubscriptionMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public CreateInitialProductPlanSubscriptionMutation(CreateInitialProductPlanSubscriptionInput createInitialProductPlanSubscriptionInput) {
        Utils.checkNotNull(createInitialProductPlanSubscriptionInput, "input == null");
        this.variables = new Variables(createInitialProductPlanSubscriptionInput);
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
        return "b45eabfb5e705752d2963146243ace4800ed8306f8f165ad1c2c7fb615248158";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateInitialProductPlanSubscription($input: CreateInitialProductPlanSubscriptionInput!) {\n  createInitialProductPlanSubscription(input: $input) {\n    __typename\n    id\n    accountId\n    addedById\n    productAccountId\n    productPlanId\n    planDescription\n    planStatus\n    planFeePerUnit\n    planFeeProRataPerUnit\n    period\n    amount\n    currency\n    status\n    numberOfUnits\n    numberOfFreeUnits\n    unitType\n    subscriptionPaymentStatus\n    subscriptionStartDate\n    subscriptionEndDate\n    createdAt\n    updatedAt\n    productPlan {\n      __typename\n      id\n      accountId\n      productId\n      planDescription\n      planStatus\n      period\n      fee\n      proRataFee\n      currency\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
