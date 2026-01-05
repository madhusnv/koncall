package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelAttendanceFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelAttendanceFilterInput>> and;
    private final Input<ModelStringInput> capturedImageUrl;
    private final Input<ModelFloatInput> checkoutLat;
    private final Input<ModelFloatInput> checkoutLng;
    private final Input<ModelStringInput> checkoutTime;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> dateOfAttendance;
    private final Input<ModelIDInput> id;
    private final Input<ModelFloatInput> lat;
    private final Input<ModelFloatInput> lng;
    private final Input<ModelAttendanceFilterInput> not;
    private final Input<List<ModelAttendanceFilterInput>> or;
    private final Input<ModelStringInput> reasonForNonAttendance;
    private final Input<ModelStringInput> timeOfAttendance;
    private final Input<ModelIntInput> totalDurationInMinutes;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelAttendanceFilterInput>> and = Input.absent();
        private Input<List<ModelAttendanceFilterInput>> or = Input.absent();
        private Input<ModelAttendanceFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelAttendanceFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelAttendanceFilterInput build() {
            return new ModelAttendanceFilterInput(this.id, this.accountId, this.userId, this.dateOfAttendance, this.timeOfAttendance, this.checkoutTime, this.totalDurationInMinutes, this.lat, this.lng, this.checkoutLat, this.checkoutLng, this.reasonForNonAttendance, this.capturedImageUrl, this.createdById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelAttendanceFilterInput modelAttendanceFilterInput) {
            this.not = Input.fromNullable(modelAttendanceFilterInput);
            return this;
        }

        public Builder or(List<ModelAttendanceFilterInput> list) {
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

    public ModelAttendanceFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIntInput> input7, Input<ModelFloatInput> input8, Input<ModelFloatInput> input9, Input<ModelFloatInput> input10, Input<ModelFloatInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<List<ModelAttendanceFilterInput>> input18, Input<List<ModelAttendanceFilterInput>> input19, Input<ModelAttendanceFilterInput> input20) {
        this.id = input;
        this.accountId = input2;
        this.userId = input3;
        this.dateOfAttendance = input4;
        this.timeOfAttendance = input5;
        this.checkoutTime = input6;
        this.totalDurationInMinutes = input7;
        this.lat = input8;
        this.lng = input9;
        this.checkoutLat = input10;
        this.checkoutLng = input11;
        this.reasonForNonAttendance = input12;
        this.capturedImageUrl = input13;
        this.createdById = input14;
        this.updatedById = input15;
        this.createdAt = input16;
        this.updatedAt = input17;
        this.and = input18;
        this.or = input19;
        this.not = input20;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelAttendanceFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelFloatInput lat() {
        return this.lat.value;
    }

    public ModelFloatInput lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAttendanceFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAttendanceFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelAttendanceFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelAttendanceFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelAttendanceFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelAttendanceFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelAttendanceFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelAttendanceFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.dateOfAttendance.defined) {
                    inputFieldWriter.writeObject("dateOfAttendance", ModelAttendanceFilterInput.this.dateOfAttendance.value != 0 ? ((ModelStringInput) ModelAttendanceFilterInput.this.dateOfAttendance.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.timeOfAttendance.defined) {
                    inputFieldWriter.writeObject("timeOfAttendance", ModelAttendanceFilterInput.this.timeOfAttendance.value != 0 ? ((ModelStringInput) ModelAttendanceFilterInput.this.timeOfAttendance.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.checkoutTime.defined) {
                    inputFieldWriter.writeObject("checkoutTime", ModelAttendanceFilterInput.this.checkoutTime.value != 0 ? ((ModelStringInput) ModelAttendanceFilterInput.this.checkoutTime.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.totalDurationInMinutes.defined) {
                    inputFieldWriter.writeObject("totalDurationInMinutes", ModelAttendanceFilterInput.this.totalDurationInMinutes.value != 0 ? ((ModelIntInput) ModelAttendanceFilterInput.this.totalDurationInMinutes.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.lat.defined) {
                    inputFieldWriter.writeObject("lat", ModelAttendanceFilterInput.this.lat.value != 0 ? ((ModelFloatInput) ModelAttendanceFilterInput.this.lat.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.lng.defined) {
                    inputFieldWriter.writeObject("lng", ModelAttendanceFilterInput.this.lng.value != 0 ? ((ModelFloatInput) ModelAttendanceFilterInput.this.lng.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.checkoutLat.defined) {
                    inputFieldWriter.writeObject("checkoutLat", ModelAttendanceFilterInput.this.checkoutLat.value != 0 ? ((ModelFloatInput) ModelAttendanceFilterInput.this.checkoutLat.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.checkoutLng.defined) {
                    inputFieldWriter.writeObject("checkoutLng", ModelAttendanceFilterInput.this.checkoutLng.value != 0 ? ((ModelFloatInput) ModelAttendanceFilterInput.this.checkoutLng.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.reasonForNonAttendance.defined) {
                    inputFieldWriter.writeObject("reasonForNonAttendance", ModelAttendanceFilterInput.this.reasonForNonAttendance.value != 0 ? ((ModelStringInput) ModelAttendanceFilterInput.this.reasonForNonAttendance.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.capturedImageUrl.defined) {
                    inputFieldWriter.writeObject("capturedImageUrl", ModelAttendanceFilterInput.this.capturedImageUrl.value != 0 ? ((ModelStringInput) ModelAttendanceFilterInput.this.capturedImageUrl.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelAttendanceFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelAttendanceFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelAttendanceFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelAttendanceFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelAttendanceFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelAttendanceFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelAttendanceFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelAttendanceFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelAttendanceFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelAttendanceFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAttendanceFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAttendanceFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAttendanceFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAttendanceFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelAttendanceFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelAttendanceFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelAttendanceFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelAttendanceFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelAttendanceFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelAttendanceFilterInput.this.not.value != 0 ? ((ModelAttendanceFilterInput) ModelAttendanceFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelAttendanceFilterInput not() {
        return this.not.value;
    }

    public List<ModelAttendanceFilterInput> or() {
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
