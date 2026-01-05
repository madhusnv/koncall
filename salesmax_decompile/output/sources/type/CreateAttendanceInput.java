package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateAttendanceInput implements InputType {
    private final String accountId;
    private final Input<String> capturedImageUrl;
    private final Input<Double> checkoutLat;
    private final Input<Double> checkoutLng;
    private final Input<String> checkoutTime;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> dateOfAttendance;
    private final Input<String> id;
    private final Input<Double> lat;
    private final Input<Double> lng;
    private final Input<String> reasonForNonAttendance;
    private final Input<String> timeOfAttendance;
    private final Input<Integer> totalDurationInMinutes;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private String userId;
        private Input<String> id = Input.absent();
        private Input<String> dateOfAttendance = Input.absent();
        private Input<String> timeOfAttendance = Input.absent();
        private Input<String> checkoutTime = Input.absent();
        private Input<Integer> totalDurationInMinutes = Input.absent();
        private Input<Double> lat = Input.absent();
        private Input<Double> lng = Input.absent();
        private Input<Double> checkoutLat = Input.absent();
        private Input<Double> checkoutLng = Input.absent();
        private Input<String> reasonForNonAttendance = Input.absent();
        private Input<String> capturedImageUrl = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateAttendanceInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            return new CreateAttendanceInput(this.id, this.accountId, this.userId, this.dateOfAttendance, this.timeOfAttendance, this.checkoutTime, this.totalDurationInMinutes, this.lat, this.lng, this.checkoutLat, this.checkoutLng, this.reasonForNonAttendance, this.capturedImageUrl, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
        }

        public Builder capturedImageUrl(String str) {
            this.capturedImageUrl = Input.fromNullable(str);
            return this;
        }

        public Builder checkoutLat(Double d) {
            this.checkoutLat = Input.fromNullable(d);
            return this;
        }

        public Builder checkoutLng(Double d) {
            this.checkoutLng = Input.fromNullable(d);
            return this;
        }

        public Builder checkoutTime(String str) {
            this.checkoutTime = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder dateOfAttendance(String str) {
            this.dateOfAttendance = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder lat(Double d) {
            this.lat = Input.fromNullable(d);
            return this;
        }

        public Builder lng(Double d) {
            this.lng = Input.fromNullable(d);
            return this;
        }

        public Builder reasonForNonAttendance(String str) {
            this.reasonForNonAttendance = Input.fromNullable(str);
            return this;
        }

        public Builder timeOfAttendance(String str) {
            this.timeOfAttendance = Input.fromNullable(str);
            return this;
        }

        public Builder totalDurationInMinutes(Integer num) {
            this.totalDurationInMinutes = Input.fromNullable(num);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public CreateAttendanceInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, Input<String> input4, Input<Integer> input5, Input<Double> input6, Input<Double> input7, Input<Double> input8, Input<Double> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15) {
        this.id = input;
        this.accountId = str;
        this.userId = str2;
        this.dateOfAttendance = input2;
        this.timeOfAttendance = input3;
        this.checkoutTime = input4;
        this.totalDurationInMinutes = input5;
        this.lat = input6;
        this.lng = input7;
        this.checkoutLat = input8;
        this.checkoutLng = input9;
        this.reasonForNonAttendance = input10;
        this.capturedImageUrl = input11;
        this.createdById = input12;
        this.updatedById = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String capturedImageUrl() {
        return this.capturedImageUrl.value;
    }

    public Double checkoutLat() {
        return this.checkoutLat.value;
    }

    public Double checkoutLng() {
        return this.checkoutLng.value;
    }

    public String checkoutTime() {
        return this.checkoutTime.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String dateOfAttendance() {
        return this.dateOfAttendance.value;
    }

    public String id() {
        return this.id.value;
    }

    public Double lat() {
        return this.lat.value;
    }

    public Double lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateAttendanceInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateAttendanceInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateAttendanceInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateAttendanceInput.this.accountId);
                inputFieldWriter.writeString("userId", CreateAttendanceInput.this.userId);
                if (CreateAttendanceInput.this.dateOfAttendance.defined) {
                    inputFieldWriter.writeString("dateOfAttendance", (String) CreateAttendanceInput.this.dateOfAttendance.value);
                }
                if (CreateAttendanceInput.this.timeOfAttendance.defined) {
                    inputFieldWriter.writeString("timeOfAttendance", (String) CreateAttendanceInput.this.timeOfAttendance.value);
                }
                if (CreateAttendanceInput.this.checkoutTime.defined) {
                    inputFieldWriter.writeString("checkoutTime", (String) CreateAttendanceInput.this.checkoutTime.value);
                }
                if (CreateAttendanceInput.this.totalDurationInMinutes.defined) {
                    inputFieldWriter.writeInt("totalDurationInMinutes", (Integer) CreateAttendanceInput.this.totalDurationInMinutes.value);
                }
                if (CreateAttendanceInput.this.lat.defined) {
                    inputFieldWriter.writeDouble("lat", (Double) CreateAttendanceInput.this.lat.value);
                }
                if (CreateAttendanceInput.this.lng.defined) {
                    inputFieldWriter.writeDouble("lng", (Double) CreateAttendanceInput.this.lng.value);
                }
                if (CreateAttendanceInput.this.checkoutLat.defined) {
                    inputFieldWriter.writeDouble("checkoutLat", (Double) CreateAttendanceInput.this.checkoutLat.value);
                }
                if (CreateAttendanceInput.this.checkoutLng.defined) {
                    inputFieldWriter.writeDouble("checkoutLng", (Double) CreateAttendanceInput.this.checkoutLng.value);
                }
                if (CreateAttendanceInput.this.reasonForNonAttendance.defined) {
                    inputFieldWriter.writeString("reasonForNonAttendance", (String) CreateAttendanceInput.this.reasonForNonAttendance.value);
                }
                if (CreateAttendanceInput.this.capturedImageUrl.defined) {
                    inputFieldWriter.writeString("capturedImageUrl", (String) CreateAttendanceInput.this.capturedImageUrl.value);
                }
                if (CreateAttendanceInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateAttendanceInput.this.createdById.value);
                }
                if (CreateAttendanceInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateAttendanceInput.this.updatedById.value);
                }
                if (CreateAttendanceInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateAttendanceInput.this.createdAt.value);
                }
                if (CreateAttendanceInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateAttendanceInput.this.updatedAt.value);
                }
            }
        };
    }

    public String reasonForNonAttendance() {
        return this.reasonForNonAttendance.value;
    }

    public String timeOfAttendance() {
        return this.timeOfAttendance.value;
    }

    public Integer totalDurationInMinutes() {
        return this.totalDurationInMinutes.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public String userId() {
        return this.userId;
    }
}
