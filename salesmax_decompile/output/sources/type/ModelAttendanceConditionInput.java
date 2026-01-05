package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAttendanceConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelAttendanceConditionInput>> and;
    private final Input<ModelStringInput> capturedImageUrl;
    private final Input<ModelFloatInput> checkoutLat;
    private final Input<ModelFloatInput> checkoutLng;
    private final Input<ModelStringInput> checkoutTime;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> dateOfAttendance;
    private final Input<ModelFloatInput> lat;
    private final Input<ModelFloatInput> lng;
    private final Input<ModelAttendanceConditionInput> not;
    private final Input<List<ModelAttendanceConditionInput>> or;
    private final Input<ModelStringInput> reasonForNonAttendance;
    private final Input<ModelStringInput> timeOfAttendance;
    private final Input<ModelIntInput> totalDurationInMinutes;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelStringInput> dateOfAttendance = Input.absent();
        private Input<ModelStringInput> timeOfAttendance = Input.absent();
        private Input<ModelStringInput> checkoutTime = Input.absent();
        private Input<ModelIntInput> totalDurationInMinutes = Input.absent();
        private Input<ModelFloatInput> lat = Input.absent();
        private Input<ModelFloatInput> lng = Input.absent();
        private Input<ModelFloatInput> checkoutLat = Input.absent();
        private Input<ModelFloatInput> checkoutLng = Input.absent();
        private Input<ModelStringInput> reasonForNonAttendance = Input.absent();
        private Input<ModelStringInput> capturedImageUrl = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelAttendanceConditionInput>> and = Input.absent();
        private Input<List<ModelAttendanceConditionInput>> or = Input.absent();
        private Input<ModelAttendanceConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelAttendanceConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelAttendanceConditionInput build() {
            return new ModelAttendanceConditionInput(this.accountId, this.userId, this.dateOfAttendance, this.timeOfAttendance, this.checkoutTime, this.totalDurationInMinutes, this.lat, this.lng, this.checkoutLat, this.checkoutLng, this.reasonForNonAttendance, this.capturedImageUrl, this.createdById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder capturedImageUrl(ModelStringInput modelStringInput) {
            this.capturedImageUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder checkoutLat(ModelFloatInput modelFloatInput) {
            this.checkoutLat = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder checkoutLng(ModelFloatInput modelFloatInput) {
            this.checkoutLng = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder checkoutTime(ModelStringInput modelStringInput) {
            this.checkoutTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder dateOfAttendance(ModelStringInput modelStringInput) {
            this.dateOfAttendance = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lat(ModelFloatInput modelFloatInput) {
            this.lat = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder lng(ModelFloatInput modelFloatInput) {
            this.lng = Input.fromNullable(modelFloatInput);
            return this;
        }

        public Builder not(ModelAttendanceConditionInput modelAttendanceConditionInput) {
            this.not = Input.fromNullable(modelAttendanceConditionInput);
            return this;
        }

        public Builder or(List<ModelAttendanceConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder reasonForNonAttendance(ModelStringInput modelStringInput) {
            this.reasonForNonAttendance = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder timeOfAttendance(ModelStringInput modelStringInput) {
            this.timeOfAttendance = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder totalDurationInMinutes(ModelIntInput modelIntInput) {
            this.totalDurationInMinutes = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelAttendanceConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIntInput> input6, Input<ModelFloatInput> input7, Input<ModelFloatInput> input8, Input<ModelFloatInput> input9, Input<ModelFloatInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<List<ModelAttendanceConditionInput>> input17, Input<List<ModelAttendanceConditionInput>> input18, Input<ModelAttendanceConditionInput> input19) {
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
        this.and = input17;
        this.or = input18;
        this.not = input19;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelAttendanceConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput capturedImageUrl() {
        return this.capturedImageUrl.value;
    }

    public ModelFloatInput checkoutLat() {
        return this.checkoutLat.value;
    }

    public ModelFloatInput checkoutLng() {
        return this.checkoutLng.value;
    }

    public ModelStringInput checkoutTime() {
        return this.checkoutTime.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput dateOfAttendance() {
        return this.dateOfAttendance.value;
    }

    public ModelFloatInput lat() {
        return this.lat.value;
    }

    public ModelFloatInput lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAttendanceConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAttendanceConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAttendanceConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAttendanceConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelAttendanceConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelAttendanceConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.dateOfAttendance.defined) {
                    inputFieldWriter.writeObject("dateOfAttendance", ModelAttendanceConditionInput.this.dateOfAttendance.value != 0 ? ((ModelStringInput) ModelAttendanceConditionInput.this.dateOfAttendance.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.timeOfAttendance.defined) {
                    inputFieldWriter.writeObject("timeOfAttendance", ModelAttendanceConditionInput.this.timeOfAttendance.value != 0 ? ((ModelStringInput) ModelAttendanceConditionInput.this.timeOfAttendance.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.checkoutTime.defined) {
                    inputFieldWriter.writeObject("checkoutTime", ModelAttendanceConditionInput.this.checkoutTime.value != 0 ? ((ModelStringInput) ModelAttendanceConditionInput.this.checkoutTime.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.totalDurationInMinutes.defined) {
                    inputFieldWriter.writeObject("totalDurationInMinutes", ModelAttendanceConditionInput.this.totalDurationInMinutes.value != 0 ? ((ModelIntInput) ModelAttendanceConditionInput.this.totalDurationInMinutes.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.lat.defined) {
                    inputFieldWriter.writeObject("lat", ModelAttendanceConditionInput.this.lat.value != 0 ? ((ModelFloatInput) ModelAttendanceConditionInput.this.lat.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.lng.defined) {
                    inputFieldWriter.writeObject("lng", ModelAttendanceConditionInput.this.lng.value != 0 ? ((ModelFloatInput) ModelAttendanceConditionInput.this.lng.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.checkoutLat.defined) {
                    inputFieldWriter.writeObject("checkoutLat", ModelAttendanceConditionInput.this.checkoutLat.value != 0 ? ((ModelFloatInput) ModelAttendanceConditionInput.this.checkoutLat.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.checkoutLng.defined) {
                    inputFieldWriter.writeObject("checkoutLng", ModelAttendanceConditionInput.this.checkoutLng.value != 0 ? ((ModelFloatInput) ModelAttendanceConditionInput.this.checkoutLng.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.reasonForNonAttendance.defined) {
                    inputFieldWriter.writeObject("reasonForNonAttendance", ModelAttendanceConditionInput.this.reasonForNonAttendance.value != 0 ? ((ModelStringInput) ModelAttendanceConditionInput.this.reasonForNonAttendance.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.capturedImageUrl.defined) {
                    inputFieldWriter.writeObject("capturedImageUrl", ModelAttendanceConditionInput.this.capturedImageUrl.value != 0 ? ((ModelStringInput) ModelAttendanceConditionInput.this.capturedImageUrl.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelAttendanceConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelAttendanceConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelAttendanceConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelAttendanceConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAttendanceConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAttendanceConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAttendanceConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAttendanceConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAttendanceConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAttendanceConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAttendanceConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAttendanceConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAttendanceConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAttendanceConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAttendanceConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAttendanceConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAttendanceConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAttendanceConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAttendanceConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAttendanceConditionInput.this.not.value != 0 ? ((ModelAttendanceConditionInput) ModelAttendanceConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelAttendanceConditionInput not() {
        return this.not.value;
    }

    public List<ModelAttendanceConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput reasonForNonAttendance() {
        return this.reasonForNonAttendance.value;
    }

    public ModelStringInput timeOfAttendance() {
        return this.timeOfAttendance.value;
    }

    public ModelIntInput totalDurationInMinutes() {
        return this.totalDurationInMinutes.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
