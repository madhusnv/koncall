package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
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
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.DealOutcome;
import type.DealState;
import type.ModelDealConditionInput;
import type.UpdateDealInput;

/* loaded from: classes4.dex */
public final class UpdateDealMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateDeal($input: UpdateDealInput!, $condition: ModelDealConditionInput) {\n  updateDeal(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    dealStage\n    dealStageUpdatedAt\n    dealState\n    dealOutcome\n    dealLostReason\n    amount\n    currency\n    units {\n      __typename\n      productId\n      units\n      negotiatedPricePerUnit\n    }\n    createdByUser\n    lastUpdatedByUser\n    ownerId\n    primaryTeamId\n    openTaskDetail\n    transitionSummary\n    recentEngagements\n    recentEngagementsUpdatedAt\n    lastActivity\n    tags\n    dealStageCustomValues {\n      __typename\n      dealStage\n      customValue\n    }\n    customDealData\n    createdAt\n    updatedAt\n    associations {\n      __typename\n      nextToken\n    }\n    transitions {\n      __typename\n      nextToken\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateDeal";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateDeal($input: UpdateDealInput!, $condition: ModelDealConditionInput) {\n  updateDeal(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    dealStage\n    dealStageUpdatedAt\n    dealState\n    dealOutcome\n    dealLostReason\n    amount\n    currency\n    units {\n      __typename\n      productId\n      units\n      negotiatedPricePerUnit\n    }\n    createdByUser\n    lastUpdatedByUser\n    ownerId\n    primaryTeamId\n    openTaskDetail\n    transitionSummary\n    recentEngagements\n    recentEngagementsUpdatedAt\n    lastActivity\n    tags\n    dealStageCustomValues {\n      __typename\n      dealStage\n      customValue\n    }\n    customDealData\n    createdAt\n    updatedAt\n    associations {\n      __typename\n      nextToken\n    }\n    transitions {\n      __typename\n      nextToken\n    }\n  }\n}";
    private final Variables variables;

    public static class Associations {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Associations> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Associations map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Associations.$responseFields;
                return new Associations(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Associations(String str, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Associations)) {
                return false;
            }
            Associations associations = (Associations) obj;
            if (this.__typename.equals(associations.__typename)) {
                String str = this.nextToken;
                String str2 = associations.nextToken;
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
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.Associations.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Associations.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Associations.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Associations.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Associations{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Builder {
        private ModelDealConditionInput condition;
        private UpdateDealInput input;

        public UpdateDealMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateDealMutation(this.input, this.condition);
        }

        public Builder condition(ModelDealConditionInput modelDealConditionInput) {
            this.condition = modelDealConditionInput;
            return this;
        }

        public Builder input(UpdateDealInput updateDealInput) {
            this.input = updateDealInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateDeal", "updateDeal", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateDeal updateDeal;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateDeal.Mapper updateDealFieldMapper = new UpdateDeal.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateDeal) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateDeal>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateDeal read(ResponseReader responseReader2) {
                        return Mapper.this.updateDealFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateDeal updateDeal) {
            this.updateDeal = updateDeal;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateDeal updateDeal = this.updateDeal;
            UpdateDeal updateDeal2 = ((Data) obj).updateDeal;
            return updateDeal == null ? updateDeal2 == null : updateDeal.equals(updateDeal2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateDeal updateDeal = this.updateDeal;
                this.$hashCode = (updateDeal == null ? 0 : updateDeal.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateDeal updateDeal = Data.this.updateDeal;
                    responseWriter.writeObject(responseField, updateDeal != null ? updateDeal.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateDeal=" + this.updateDeal + "}";
            }
            return this.$toString;
        }

        public UpdateDeal updateDeal() {
            return this.updateDeal;
        }
    }

    public static class DealStageCustomValue {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("dealStage", "dealStage", null, false, Collections.emptyList()), ResponseField.forCustomType("customValue", "customValue", null, true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String customValue;
        final String dealStage;

        public static final class Mapper implements ResponseFieldMapper<DealStageCustomValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DealStageCustomValue map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DealStageCustomValue.$responseFields;
                return new DealStageCustomValue(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]));
            }
        }

        public DealStageCustomValue(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.dealStage = (String) Utils.checkNotNull(str2, "dealStage == null");
            this.customValue = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String customValue() {
            return this.customValue;
        }

        public String dealStage() {
            return this.dealStage;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DealStageCustomValue)) {
                return false;
            }
            DealStageCustomValue dealStageCustomValue = (DealStageCustomValue) obj;
            if (this.__typename.equals(dealStageCustomValue.__typename) && this.dealStage.equals(dealStageCustomValue.dealStage)) {
                String str = this.customValue;
                String str2 = dealStageCustomValue.customValue;
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
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.dealStage.hashCode()) * 1000003;
                String str = this.customValue;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.DealStageCustomValue.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DealStageCustomValue.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DealStageCustomValue.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], DealStageCustomValue.this.dealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DealStageCustomValue.this.customValue);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DealStageCustomValue{__typename=" + this.__typename + ", dealStage=" + this.dealStage + ", customValue=" + this.customValue + "}";
            }
            return this.$toString;
        }
    }

    public static class Transitions {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Transitions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Transitions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Transitions.$responseFields;
                return new Transitions(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Transitions(String str, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Transitions)) {
                return false;
            }
            Transitions transitions = (Transitions) obj;
            if (this.__typename.equals(transitions.__typename)) {
                String str = this.nextToken;
                String str2 = transitions.nextToken;
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
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.Transitions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Transitions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Transitions.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Transitions.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Transitions{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Unit {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, false, CustomType.ID, Collections.emptyList()), ResponseField.forInt("units", "units", null, true, Collections.emptyList()), ResponseField.forInt("negotiatedPricePerUnit", "negotiatedPricePerUnit", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Integer negotiatedPricePerUnit;
        final String productId;
        final Integer units;

        public static final class Mapper implements ResponseFieldMapper<Unit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Unit map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Unit.$responseFields;
                return new Unit(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readInt(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]));
            }
        }

        public Unit(String str, String str2, Integer num, Integer num2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.productId = (String) Utils.checkNotNull(str2, "productId == null");
            this.units = num;
            this.negotiatedPricePerUnit = num2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            Integer num;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unit)) {
                return false;
            }
            Unit unit = (Unit) obj;
            if (this.__typename.equals(unit.__typename) && this.productId.equals(unit.productId) && ((num = this.units) != null ? num.equals(unit.units) : unit.units == null)) {
                Integer num2 = this.negotiatedPricePerUnit;
                Integer num3 = unit.negotiatedPricePerUnit;
                if (num2 == null) {
                    if (num3 == null) {
                        return true;
                    }
                } else if (num2.equals(num3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.productId.hashCode()) * 1000003;
                Integer num = this.units;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.negotiatedPricePerUnit;
                this.$hashCode = iHashCode2 ^ (num2 != null ? num2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.Unit.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Unit.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Unit.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Unit.this.productId);
                    responseWriter.writeInt(responseFieldArr[2], Unit.this.units);
                    responseWriter.writeInt(responseFieldArr[3], Unit.this.negotiatedPricePerUnit);
                }
            };
        }

        public Integer negotiatedPricePerUnit() {
            return this.negotiatedPricePerUnit;
        }

        public String productId() {
            return this.productId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Unit{__typename=" + this.__typename + ", productId=" + this.productId + ", units=" + this.units + ", negotiatedPricePerUnit=" + this.negotiatedPricePerUnit + "}";
            }
            return this.$toString;
        }

        public Integer units() {
            return this.units;
        }
    }

    public static class UpdateDeal {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Double amount;
        final Associations associations;
        final String createdAt;
        final String createdByUser;
        final String currency;
        final String customDealData;
        final String dealLostReason;
        final DealOutcome dealOutcome;
        final String dealStage;
        final List<DealStageCustomValue> dealStageCustomValues;
        final String dealStageUpdatedAt;
        final DealState dealState;
        final String description;
        final String id;
        final String lastActivity;
        final String lastUpdatedByUser;
        final String name;
        final String openTaskDetail;
        final String ownerId;
        final String primaryTeamId;
        final List<String> recentEngagements;
        final String recentEngagementsUpdatedAt;
        final List<String> tags;
        final List<String> transitionSummary;
        final Transitions transitions;
        final List<Unit> units;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateDeal> {
            final Unit.Mapper unitFieldMapper = new Unit.Mapper();
            final DealStageCustomValue.Mapper dealStageCustomValueFieldMapper = new DealStageCustomValue.Mapper();
            final Associations.Mapper associationsFieldMapper = new Associations.Mapper();
            final Transitions.Mapper transitionsFieldMapper = new Transitions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateDeal map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateDeal.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                DealState dealStateValueOf = string5 != null ? DealState.valueOf(string5) : null;
                String string6 = responseReader.readString(responseFieldArr[8]);
                return new UpdateDeal(string, str, str2, string2, string3, string4, str3, dealStateValueOf, string6 != null ? DealOutcome.valueOf(string6) : null, responseReader.readString(responseFieldArr[9]), responseReader.readDouble(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readList(responseFieldArr[12], new ResponseReader.ListReader<Unit>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Unit read(ResponseReader.ListItemReader listItemReader) {
                        return (Unit) listItemReader.readObject(new ResponseReader.ObjectReader<Unit>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Unit read(ResponseReader responseReader2) {
                                return Mapper.this.unitFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readList(responseFieldArr[19], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), responseReader.readList(responseFieldArr[22], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[23], new ResponseReader.ListReader<DealStageCustomValue>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public DealStageCustomValue read(ResponseReader.ListItemReader listItemReader) {
                        return (DealStageCustomValue) listItemReader.readObject(new ResponseReader.ObjectReader<DealStageCustomValue>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.5.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public DealStageCustomValue read(ResponseReader responseReader2) {
                                return Mapper.this.dealStageCustomValueFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), (Associations) responseReader.readObject(responseFieldArr[27], new ResponseReader.ObjectReader<Associations>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Associations read(ResponseReader responseReader2) {
                        return Mapper.this.associationsFieldMapper.map(responseReader2);
                    }
                }), (Transitions) responseReader.readObject(responseFieldArr[28], new ResponseReader.ObjectReader<Transitions>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.Mapper.7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Transitions read(ResponseReader responseReader2) {
                        return Mapper.this.transitionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("dealStage", "dealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("dealStageUpdatedAt", "dealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealState", "dealState", null, true, Collections.emptyList()), ResponseField.forString("dealOutcome", "dealOutcome", null, true, Collections.emptyList()), ResponseField.forString("dealLostReason", "dealLostReason", null, true, Collections.emptyList()), ResponseField.forDouble("amount", "amount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forList("units", "units", null, true, Collections.emptyList()), ResponseField.forCustomType("createdByUser", "createdByUser", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastUpdatedByUser", "lastUpdatedByUser", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forList("transitionSummary", "transitionSummary", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastActivity", "lastActivity", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forList("dealStageCustomValues", "dealStageCustomValues", null, true, Collections.emptyList()), ResponseField.forCustomType("customDealData", "customDealData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("associations", "associations", null, true, Collections.emptyList()), ResponseField.forObject("transitions", "transitions", null, true, Collections.emptyList())};
        }

        public UpdateDeal(String str, String str2, String str3, String str4, String str5, String str6, String str7, DealState dealState, DealOutcome dealOutcome, String str8, Double d, String str9, List<Unit> list, String str10, String str11, String str12, String str13, String str14, List<String> list2, List<String> list3, String str15, String str16, List<String> list4, List<DealStageCustomValue> list5, String str17, String str18, String str19, Associations associations, Transitions transitions) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.dealStage = str6;
            this.dealStageUpdatedAt = str7;
            this.dealState = dealState;
            this.dealOutcome = dealOutcome;
            this.dealLostReason = str8;
            this.amount = d;
            this.currency = str9;
            this.units = list;
            this.createdByUser = str10;
            this.lastUpdatedByUser = str11;
            this.ownerId = str12;
            this.primaryTeamId = str13;
            this.openTaskDetail = str14;
            this.transitionSummary = list2;
            this.recentEngagements = list3;
            this.recentEngagementsUpdatedAt = str15;
            this.lastActivity = str16;
            this.tags = list4;
            this.dealStageCustomValues = list5;
            this.customDealData = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
            this.associations = associations;
            this.transitions = transitions;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Double amount() {
            return this.amount;
        }

        public Associations associations() {
            return this.associations;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdByUser() {
            return this.createdByUser;
        }

        public String currency() {
            return this.currency;
        }

        public String customDealData() {
            return this.customDealData;
        }

        public String dealLostReason() {
            return this.dealLostReason;
        }

        public DealOutcome dealOutcome() {
            return this.dealOutcome;
        }

        public String dealStage() {
            return this.dealStage;
        }

        public List<DealStageCustomValue> dealStageCustomValues() {
            return this.dealStageCustomValues;
        }

        public String dealStageUpdatedAt() {
            return this.dealStageUpdatedAt;
        }

        public DealState dealState() {
            return this.dealState;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            DealState dealState;
            DealOutcome dealOutcome;
            String str5;
            Double d;
            String str6;
            List<Unit> list;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            List<String> list2;
            List<String> list3;
            String str12;
            String str13;
            List<String> list4;
            List<DealStageCustomValue> list5;
            String str14;
            String str15;
            String str16;
            Associations associations;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateDeal)) {
                return false;
            }
            UpdateDeal updateDeal = (UpdateDeal) obj;
            if (this.__typename.equals(updateDeal.__typename) && this.id.equals(updateDeal.id) && this.accountId.equals(updateDeal.accountId) && ((str = this.name) != null ? str.equals(updateDeal.name) : updateDeal.name == null) && ((str2 = this.description) != null ? str2.equals(updateDeal.description) : updateDeal.description == null) && ((str3 = this.dealStage) != null ? str3.equals(updateDeal.dealStage) : updateDeal.dealStage == null) && ((str4 = this.dealStageUpdatedAt) != null ? str4.equals(updateDeal.dealStageUpdatedAt) : updateDeal.dealStageUpdatedAt == null) && ((dealState = this.dealState) != null ? dealState.equals(updateDeal.dealState) : updateDeal.dealState == null) && ((dealOutcome = this.dealOutcome) != null ? dealOutcome.equals(updateDeal.dealOutcome) : updateDeal.dealOutcome == null) && ((str5 = this.dealLostReason) != null ? str5.equals(updateDeal.dealLostReason) : updateDeal.dealLostReason == null) && ((d = this.amount) != null ? d.equals(updateDeal.amount) : updateDeal.amount == null) && ((str6 = this.currency) != null ? str6.equals(updateDeal.currency) : updateDeal.currency == null) && ((list = this.units) != null ? list.equals(updateDeal.units) : updateDeal.units == null) && ((str7 = this.createdByUser) != null ? str7.equals(updateDeal.createdByUser) : updateDeal.createdByUser == null) && ((str8 = this.lastUpdatedByUser) != null ? str8.equals(updateDeal.lastUpdatedByUser) : updateDeal.lastUpdatedByUser == null) && ((str9 = this.ownerId) != null ? str9.equals(updateDeal.ownerId) : updateDeal.ownerId == null) && ((str10 = this.primaryTeamId) != null ? str10.equals(updateDeal.primaryTeamId) : updateDeal.primaryTeamId == null) && ((str11 = this.openTaskDetail) != null ? str11.equals(updateDeal.openTaskDetail) : updateDeal.openTaskDetail == null) && ((list2 = this.transitionSummary) != null ? list2.equals(updateDeal.transitionSummary) : updateDeal.transitionSummary == null) && ((list3 = this.recentEngagements) != null ? list3.equals(updateDeal.recentEngagements) : updateDeal.recentEngagements == null) && ((str12 = this.recentEngagementsUpdatedAt) != null ? str12.equals(updateDeal.recentEngagementsUpdatedAt) : updateDeal.recentEngagementsUpdatedAt == null) && ((str13 = this.lastActivity) != null ? str13.equals(updateDeal.lastActivity) : updateDeal.lastActivity == null) && ((list4 = this.tags) != null ? list4.equals(updateDeal.tags) : updateDeal.tags == null) && ((list5 = this.dealStageCustomValues) != null ? list5.equals(updateDeal.dealStageCustomValues) : updateDeal.dealStageCustomValues == null) && ((str14 = this.customDealData) != null ? str14.equals(updateDeal.customDealData) : updateDeal.customDealData == null) && ((str15 = this.createdAt) != null ? str15.equals(updateDeal.createdAt) : updateDeal.createdAt == null) && ((str16 = this.updatedAt) != null ? str16.equals(updateDeal.updatedAt) : updateDeal.updatedAt == null) && ((associations = this.associations) != null ? associations.equals(updateDeal.associations) : updateDeal.associations == null)) {
                Transitions transitions = this.transitions;
                Transitions transitions2 = updateDeal.transitions;
                if (transitions == null) {
                    if (transitions2 == null) {
                        return true;
                    }
                } else if (transitions.equals(transitions2)) {
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
                String str3 = this.dealStage;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.dealStageUpdatedAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                DealState dealState = this.dealState;
                int iHashCode6 = (iHashCode5 ^ (dealState == null ? 0 : dealState.hashCode())) * 1000003;
                DealOutcome dealOutcome = this.dealOutcome;
                int iHashCode7 = (iHashCode6 ^ (dealOutcome == null ? 0 : dealOutcome.hashCode())) * 1000003;
                String str5 = this.dealLostReason;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.amount;
                int iHashCode9 = (iHashCode8 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                String str6 = this.currency;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                List<Unit> list = this.units;
                int iHashCode11 = (iHashCode10 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str7 = this.createdByUser;
                int iHashCode12 = (iHashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lastUpdatedByUser;
                int iHashCode13 = (iHashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.ownerId;
                int iHashCode14 = (iHashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.primaryTeamId;
                int iHashCode15 = (iHashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.openTaskDetail;
                int iHashCode16 = (iHashCode15 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                List<String> list2 = this.transitionSummary;
                int iHashCode17 = (iHashCode16 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<String> list3 = this.recentEngagements;
                int iHashCode18 = (iHashCode17 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str12 = this.recentEngagementsUpdatedAt;
                int iHashCode19 = (iHashCode18 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.lastActivity;
                int iHashCode20 = (iHashCode19 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                List<String> list4 = this.tags;
                int iHashCode21 = (iHashCode20 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                List<DealStageCustomValue> list5 = this.dealStageCustomValues;
                int iHashCode22 = (iHashCode21 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                String str14 = this.customDealData;
                int iHashCode23 = (iHashCode22 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.createdAt;
                int iHashCode24 = (iHashCode23 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.updatedAt;
                int iHashCode25 = (iHashCode24 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                Associations associations = this.associations;
                int iHashCode26 = (iHashCode25 ^ (associations == null ? 0 : associations.hashCode())) * 1000003;
                Transitions transitions = this.transitions;
                this.$hashCode = iHashCode26 ^ (transitions != null ? transitions.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastActivity() {
            return this.lastActivity;
        }

        public String lastUpdatedByUser() {
            return this.lastUpdatedByUser;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateDeal.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateDeal.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateDeal.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateDeal.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], UpdateDeal.this.name);
                    responseWriter.writeString(responseFieldArr[4], UpdateDeal.this.description);
                    responseWriter.writeString(responseFieldArr[5], UpdateDeal.this.dealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateDeal.this.dealStageUpdatedAt);
                    ResponseField responseField = responseFieldArr[7];
                    DealState dealState = UpdateDeal.this.dealState;
                    responseWriter.writeString(responseField, dealState != null ? dealState.name() : null);
                    ResponseField responseField2 = responseFieldArr[8];
                    DealOutcome dealOutcome = UpdateDeal.this.dealOutcome;
                    responseWriter.writeString(responseField2, dealOutcome != null ? dealOutcome.name() : null);
                    responseWriter.writeString(responseFieldArr[9], UpdateDeal.this.dealLostReason);
                    responseWriter.writeDouble(responseFieldArr[10], UpdateDeal.this.amount);
                    responseWriter.writeString(responseFieldArr[11], UpdateDeal.this.currency);
                    responseWriter.writeList(responseFieldArr[12], UpdateDeal.this.units, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Unit) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdateDeal.this.createdByUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], UpdateDeal.this.lastUpdatedByUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], UpdateDeal.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], UpdateDeal.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], UpdateDeal.this.openTaskDetail);
                    responseWriter.writeList(responseFieldArr[18], UpdateDeal.this.transitionSummary, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[19], UpdateDeal.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], UpdateDeal.this.recentEngagementsUpdatedAt);
                    responseWriter.writeString(responseFieldArr[21], UpdateDeal.this.lastActivity);
                    responseWriter.writeList(responseFieldArr[22], UpdateDeal.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[23], UpdateDeal.this.dealStageCustomValues, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.UpdateDeal.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((DealStageCustomValue) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], UpdateDeal.this.customDealData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], UpdateDeal.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], UpdateDeal.this.updatedAt);
                    ResponseField responseField3 = responseFieldArr[27];
                    Associations associations = UpdateDeal.this.associations;
                    responseWriter.writeObject(responseField3, associations != null ? associations.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[28];
                    Transitions transitions = UpdateDeal.this.transitions;
                    responseWriter.writeObject(responseField4, transitions != null ? transitions.marshaller() : null);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String openTaskDetail() {
            return this.openTaskDetail;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public List<String> recentEngagements() {
            return this.recentEngagements;
        }

        public String recentEngagementsUpdatedAt() {
            return this.recentEngagementsUpdatedAt;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateDeal{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", dealStage=" + this.dealStage + ", dealStageUpdatedAt=" + this.dealStageUpdatedAt + ", dealState=" + this.dealState + ", dealOutcome=" + this.dealOutcome + ", dealLostReason=" + this.dealLostReason + ", amount=" + this.amount + ", currency=" + this.currency + ", units=" + this.units + ", createdByUser=" + this.createdByUser + ", lastUpdatedByUser=" + this.lastUpdatedByUser + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", openTaskDetail=" + this.openTaskDetail + ", transitionSummary=" + this.transitionSummary + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", lastActivity=" + this.lastActivity + ", tags=" + this.tags + ", dealStageCustomValues=" + this.dealStageCustomValues + ", customDealData=" + this.customDealData + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", associations=" + this.associations + ", transitions=" + this.transitions + "}";
            }
            return this.$toString;
        }

        public List<String> transitionSummary() {
            return this.transitionSummary;
        }

        public Transitions transitions() {
            return this.transitions;
        }

        public List<Unit> units() {
            return this.units;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelDealConditionInput condition;
        private final UpdateDealInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateDealInput updateDealInput, ModelDealConditionInput modelDealConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateDealInput;
            this.condition = modelDealConditionInput;
            linkedHashMap.put("input", updateDealInput);
            linkedHashMap.put("condition", modelDealConditionInput);
        }

        public ModelDealConditionInput condition() {
            return this.condition;
        }

        public UpdateDealInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealMutation.Variables.1
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

    public UpdateDealMutation(UpdateDealInput updateDealInput, ModelDealConditionInput modelDealConditionInput) {
        Utils.checkNotNull(updateDealInput, "input == null");
        this.variables = new Variables(updateDealInput, modelDealConditionInput);
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
        return "9836dcd6022d01f042ed0d36700f3c667bc4df929faaba046bcb1eed165dc905";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateDeal($input: UpdateDealInput!, $condition: ModelDealConditionInput) {\n  updateDeal(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    dealStage\n    dealStageUpdatedAt\n    dealState\n    dealOutcome\n    dealLostReason\n    amount\n    currency\n    units {\n      __typename\n      productId\n      units\n      negotiatedPricePerUnit\n    }\n    createdByUser\n    lastUpdatedByUser\n    ownerId\n    primaryTeamId\n    openTaskDetail\n    transitionSummary\n    recentEngagements\n    recentEngagementsUpdatedAt\n    lastActivity\n    tags\n    dealStageCustomValues {\n      __typename\n      dealStage\n      customValue\n    }\n    customDealData\n    createdAt\n    updatedAt\n    associations {\n      __typename\n      nextToken\n    }\n    transitions {\n      __typename\n      nextToken\n    }\n  }\n}";
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
