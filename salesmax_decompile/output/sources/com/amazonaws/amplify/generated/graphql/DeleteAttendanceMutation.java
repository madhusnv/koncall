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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.DeleteAttendanceInput;
import type.ModelAttendanceConditionInput;

/* loaded from: classes6.dex */
public final class DeleteAttendanceMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteAttendance($input: DeleteAttendanceInput!, $condition: ModelAttendanceConditionInput) {\n  deleteAttendance(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    dateOfAttendance\n    timeOfAttendance\n    checkoutTime\n    totalDurationInMinutes\n    lat\n    lng\n    checkoutLat\n    checkoutLng\n    reasonForNonAttendance\n    capturedImageUrl\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteAttendanceMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteAttendance";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteAttendance($input: DeleteAttendanceInput!, $condition: ModelAttendanceConditionInput) {\n  deleteAttendance(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    dateOfAttendance\n    timeOfAttendance\n    checkoutTime\n    totalDurationInMinutes\n    lat\n    lng\n    checkoutLat\n    checkoutLng\n    reasonForNonAttendance\n    capturedImageUrl\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelAttendanceConditionInput condition;
        private DeleteAttendanceInput input;

        public DeleteAttendanceMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteAttendanceMutation(this.input, this.condition);
        }

        public Builder condition(ModelAttendanceConditionInput modelAttendanceConditionInput) {
            this.condition = modelAttendanceConditionInput;
            return this;
        }

        public Builder input(DeleteAttendanceInput deleteAttendanceInput) {
            this.input = deleteAttendanceInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteAttendance", "deleteAttendance", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteAttendance deleteAttendance;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteAttendance.Mapper deleteAttendanceFieldMapper = new DeleteAttendance.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteAttendance) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteAttendance>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteAttendanceMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteAttendance read(ResponseReader responseReader2) {
                        return Mapper.this.deleteAttendanceFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteAttendance deleteAttendance) {
            this.deleteAttendance = deleteAttendance;
        }

        public DeleteAttendance deleteAttendance() {
            return this.deleteAttendance;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteAttendance deleteAttendance = this.deleteAttendance;
            DeleteAttendance deleteAttendance2 = ((Data) obj).deleteAttendance;
            return deleteAttendance == null ? deleteAttendance2 == null : deleteAttendance.equals(deleteAttendance2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteAttendance deleteAttendance = this.deleteAttendance;
                this.$hashCode = (deleteAttendance == null ? 0 : deleteAttendance.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteAttendanceMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteAttendance deleteAttendance = Data.this.deleteAttendance;
                    responseWriter.writeObject(responseField, deleteAttendance != null ? deleteAttendance.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteAttendance=" + this.deleteAttendance + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteAttendance {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String capturedImageUrl;
        final Double checkoutLat;
        final Double checkoutLng;
        final String checkoutTime;
        final String createdAt;
        final String createdById;
        final String dateOfAttendance;
        final String id;
        final Double lat;
        final Double lng;
        final String reasonForNonAttendance;
        final String timeOfAttendance;
        final Integer totalDurationInMinutes;
        final String updatedAt;
        final String updatedById;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<DeleteAttendance> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteAttendance map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteAttendance.$responseFields;
                return new DeleteAttendance(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readDouble(responseFieldArr[8]), responseReader.readDouble(responseFieldArr[9]), responseReader.readDouble(responseFieldArr[10]), responseReader.readDouble(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSTIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("dateOfAttendance", "dateOfAttendance", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("timeOfAttendance", "timeOfAttendance", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("checkoutTime", "checkoutTime", null, true, customType3, Collections.emptyList()), ResponseField.forInt("totalDurationInMinutes", "totalDurationInMinutes", null, true, Collections.emptyList()), ResponseField.forDouble("lat", "lat", null, true, Collections.emptyList()), ResponseField.forDouble("lng", "lng", null, true, Collections.emptyList()), ResponseField.forDouble("checkoutLat", "checkoutLat", null, true, Collections.emptyList()), ResponseField.forDouble("checkoutLng", "checkoutLng", null, true, Collections.emptyList()), ResponseField.forString("reasonForNonAttendance", "reasonForNonAttendance", null, true, Collections.emptyList()), ResponseField.forString("capturedImageUrl", "capturedImageUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public DeleteAttendance(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Double d, Double d2, Double d3, Double d4, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str4, "userId == null");
            this.dateOfAttendance = str5;
            this.timeOfAttendance = str6;
            this.checkoutTime = str7;
            this.totalDurationInMinutes = num;
            this.lat = d;
            this.lng = d2;
            this.checkoutLat = d3;
            this.checkoutLng = d4;
            this.reasonForNonAttendance = str8;
            this.capturedImageUrl = str9;
            this.createdById = str10;
            this.updatedById = str11;
            this.createdAt = str12;
            this.updatedAt = str13;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String capturedImageUrl() {
            return this.capturedImageUrl;
        }

        public Double checkoutLat() {
            return this.checkoutLat;
        }

        public Double checkoutLng() {
            return this.checkoutLng;
        }

        public String checkoutTime() {
            return this.checkoutTime;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String dateOfAttendance() {
            return this.dateOfAttendance;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Integer num;
            Double d;
            Double d2;
            Double d3;
            Double d4;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteAttendance)) {
                return false;
            }
            DeleteAttendance deleteAttendance = (DeleteAttendance) obj;
            if (this.__typename.equals(deleteAttendance.__typename) && this.id.equals(deleteAttendance.id) && this.accountId.equals(deleteAttendance.accountId) && this.userId.equals(deleteAttendance.userId) && ((str = this.dateOfAttendance) != null ? str.equals(deleteAttendance.dateOfAttendance) : deleteAttendance.dateOfAttendance == null) && ((str2 = this.timeOfAttendance) != null ? str2.equals(deleteAttendance.timeOfAttendance) : deleteAttendance.timeOfAttendance == null) && ((str3 = this.checkoutTime) != null ? str3.equals(deleteAttendance.checkoutTime) : deleteAttendance.checkoutTime == null) && ((num = this.totalDurationInMinutes) != null ? num.equals(deleteAttendance.totalDurationInMinutes) : deleteAttendance.totalDurationInMinutes == null) && ((d = this.lat) != null ? d.equals(deleteAttendance.lat) : deleteAttendance.lat == null) && ((d2 = this.lng) != null ? d2.equals(deleteAttendance.lng) : deleteAttendance.lng == null) && ((d3 = this.checkoutLat) != null ? d3.equals(deleteAttendance.checkoutLat) : deleteAttendance.checkoutLat == null) && ((d4 = this.checkoutLng) != null ? d4.equals(deleteAttendance.checkoutLng) : deleteAttendance.checkoutLng == null) && ((str4 = this.reasonForNonAttendance) != null ? str4.equals(deleteAttendance.reasonForNonAttendance) : deleteAttendance.reasonForNonAttendance == null) && ((str5 = this.capturedImageUrl) != null ? str5.equals(deleteAttendance.capturedImageUrl) : deleteAttendance.capturedImageUrl == null) && ((str6 = this.createdById) != null ? str6.equals(deleteAttendance.createdById) : deleteAttendance.createdById == null) && ((str7 = this.updatedById) != null ? str7.equals(deleteAttendance.updatedById) : deleteAttendance.updatedById == null) && ((str8 = this.createdAt) != null ? str8.equals(deleteAttendance.createdAt) : deleteAttendance.createdAt == null)) {
                String str9 = this.updatedAt;
                String str10 = deleteAttendance.updatedAt;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003;
                String str = this.dateOfAttendance;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.timeOfAttendance;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.checkoutTime;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.totalDurationInMinutes;
                int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Double d = this.lat;
                int iHashCode6 = (iHashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.lng;
                int iHashCode7 = (iHashCode6 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                Double d3 = this.checkoutLat;
                int iHashCode8 = (iHashCode7 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.checkoutLng;
                int iHashCode9 = (iHashCode8 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                String str4 = this.reasonForNonAttendance;
                int iHashCode10 = (iHashCode9 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.capturedImageUrl;
                int iHashCode11 = (iHashCode10 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.createdById;
                int iHashCode12 = (iHashCode11 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedById;
                int iHashCode13 = (iHashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str9 != null ? str9.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Double lat() {
            return this.lat;
        }

        public Double lng() {
            return this.lng;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteAttendanceMutation.DeleteAttendance.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteAttendance.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteAttendance.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteAttendance.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteAttendance.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteAttendance.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], DeleteAttendance.this.dateOfAttendance);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteAttendance.this.timeOfAttendance);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], DeleteAttendance.this.checkoutTime);
                    responseWriter.writeInt(responseFieldArr[7], DeleteAttendance.this.totalDurationInMinutes);
                    responseWriter.writeDouble(responseFieldArr[8], DeleteAttendance.this.lat);
                    responseWriter.writeDouble(responseFieldArr[9], DeleteAttendance.this.lng);
                    responseWriter.writeDouble(responseFieldArr[10], DeleteAttendance.this.checkoutLat);
                    responseWriter.writeDouble(responseFieldArr[11], DeleteAttendance.this.checkoutLng);
                    responseWriter.writeString(responseFieldArr[12], DeleteAttendance.this.reasonForNonAttendance);
                    responseWriter.writeString(responseFieldArr[13], DeleteAttendance.this.capturedImageUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], DeleteAttendance.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], DeleteAttendance.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], DeleteAttendance.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], DeleteAttendance.this.updatedAt);
                }
            };
        }

        public String reasonForNonAttendance() {
            return this.reasonForNonAttendance;
        }

        public String timeOfAttendance() {
            return this.timeOfAttendance;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteAttendance{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", dateOfAttendance=" + this.dateOfAttendance + ", timeOfAttendance=" + this.timeOfAttendance + ", checkoutTime=" + this.checkoutTime + ", totalDurationInMinutes=" + this.totalDurationInMinutes + ", lat=" + this.lat + ", lng=" + this.lng + ", checkoutLat=" + this.checkoutLat + ", checkoutLng=" + this.checkoutLng + ", reasonForNonAttendance=" + this.reasonForNonAttendance + ", capturedImageUrl=" + this.capturedImageUrl + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public Integer totalDurationInMinutes() {
            return this.totalDurationInMinutes;
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

    public static final class Variables extends Operation.Variables {
        private final ModelAttendanceConditionInput condition;
        private final DeleteAttendanceInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteAttendanceInput deleteAttendanceInput, ModelAttendanceConditionInput modelAttendanceConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteAttendanceInput;
            this.condition = modelAttendanceConditionInput;
            linkedHashMap.put("input", deleteAttendanceInput);
            linkedHashMap.put("condition", modelAttendanceConditionInput);
        }

        public ModelAttendanceConditionInput condition() {
            return this.condition;
        }

        public DeleteAttendanceInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteAttendanceMutation.Variables.1
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

    public DeleteAttendanceMutation(DeleteAttendanceInput deleteAttendanceInput, ModelAttendanceConditionInput modelAttendanceConditionInput) {
        Utils.checkNotNull(deleteAttendanceInput, "input == null");
        this.variables = new Variables(deleteAttendanceInput, modelAttendanceConditionInput);
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
        return "38b3b3ab065acfa1471463ebf4d5ec8e6ff90c4cae54cffb7cd0265fd85ddb87";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteAttendance($input: DeleteAttendanceInput!, $condition: ModelAttendanceConditionInput) {\n  deleteAttendance(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    dateOfAttendance\n    timeOfAttendance\n    checkoutTime\n    totalDurationInMinutes\n    lat\n    lng\n    checkoutLat\n    checkoutLng\n    reasonForNonAttendance\n    capturedImageUrl\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n  }\n}";
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
