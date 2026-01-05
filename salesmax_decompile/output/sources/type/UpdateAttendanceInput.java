package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateAttendanceInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> capturedImageUrl;
    private final Input<Double> checkoutLat;
    private final Input<Double> checkoutLng;
    private final Input<String> checkoutTime;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> dateOfAttendance;
    private final String id;
    private final Input<Double> lat;
    private final Input<Double> lng;
    private final Input<String> reasonForNonAttendance;
    private final Input<String> timeOfAttendance;
    private final Input<Integer> totalDurationInMinutes;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> userId;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> userId = Input.absent();
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
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateAttendanceInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateAttendanceInput(this.id, this.accountId, this.userId, this.dateOfAttendance, this.timeOfAttendance, this.checkoutTime, this.totalDurationInMinutes, this.lat, this.lng, this.checkoutLat, this.checkoutLng, this.reasonForNonAttendance, this.capturedImageUrl, this.createdById, this.updatedById, this.createdAt, this.updatedAt);
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
            this.id = str;
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
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateAttendanceInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Integer> input6, Input<Double> input7, Input<Double> input8, Input<Double> input9, Input<Double> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16) {
        this.id = str;
        this.accountId = input;
        this.userId = input2;
        this.dateOfAttendance = input3;
        this.timeOfAttendance = input4;
        this.checkoutTime = input5;
        this.totalDurationInMinutes = input6;
        this.lat = input7;
        this.lng = input8;
        this.checkoutLat = input9;
        this.checkoutLng = input10;
        this.reasonForNonAttendance = input11;
        this.capturedImageUrl = input12;
        this.createdById = input13;
        this.updatedById = input14;
        this.createdAt = input15;
        this.updatedAt = input16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
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
        return this.id;
    }

    public Double lat() {
        return this.lat.value;
    }

    public Double lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateAttendanceInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateAttendanceInput.this.id);
                if (UpdateAttendanceInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateAttendanceInput.this.accountId.value);
                }
                if (UpdateAttendanceInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) UpdateAttendanceInput.this.userId.value);
                }
                if (UpdateAttendanceInput.this.dateOfAttendance.defined) {
                    inputFieldWriter.writeString("dateOfAttendance", (String) UpdateAttendanceInput.this.dateOfAttendance.value);
                }
                if (UpdateAttendanceInput.this.timeOfAttendance.defined) {
                    inputFieldWriter.writeString("timeOfAttendance", (String) UpdateAttendanceInput.this.timeOfAttendance.value);
                }
                if (UpdateAttendanceInput.this.checkoutTime.defined) {
                    inputFieldWriter.writeString("checkoutTime", (String) UpdateAttendanceInput.this.checkoutTime.value);
                }
                if (UpdateAttendanceInput.this.totalDurationInMinutes.defined) {
                    inputFieldWriter.writeInt("totalDurationInMinutes", (Integer) UpdateAttendanceInput.this.totalDurationInMinutes.value);
                }
                if (UpdateAttendanceInput.this.lat.defined) {
                    inputFieldWriter.writeDouble("lat", (Double) UpdateAttendanceInput.this.lat.value);
                }
                if (UpdateAttendanceInput.this.lng.defined) {
                    inputFieldWriter.writeDouble("lng", (Double) UpdateAttendanceInput.this.lng.value);
                }
                if (UpdateAttendanceInput.this.checkoutLat.defined) {
                    inputFieldWriter.writeDouble("checkoutLat", (Double) UpdateAttendanceInput.this.checkoutLat.value);
                }
                if (UpdateAttendanceInput.this.checkoutLng.defined) {
                    inputFieldWriter.writeDouble("checkoutLng", (Double) UpdateAttendanceInput.this.checkoutLng.value);
                }
                if (UpdateAttendanceInput.this.reasonForNonAttendance.defined) {
                    inputFieldWriter.writeString("reasonForNonAttendance", (String) UpdateAttendanceInput.this.reasonForNonAttendance.value);
                }
                if (UpdateAttendanceInput.this.capturedImageUrl.defined) {
                    inputFieldWriter.writeString("capturedImageUrl", (String) UpdateAttendanceInput.this.capturedImageUrl.value);
                }
                if (UpdateAttendanceInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateAttendanceInput.this.createdById.value);
                }
                if (UpdateAttendanceInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateAttendanceInput.this.updatedById.value);
                }
                if (UpdateAttendanceInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateAttendanceInput.this.createdAt.value);
                }
                if (UpdateAttendanceInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateAttendanceInput.this.updatedAt.value);
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
        return this.userId.value;
    }
}
