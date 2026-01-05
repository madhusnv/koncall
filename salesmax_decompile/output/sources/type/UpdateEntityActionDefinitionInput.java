package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateEntityActionDefinitionInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> action;
    private final Input<String> createdAt;
    private final Input<String> createdBy;
    private final Input<String> description;
    private final Input<String> endDateTime;
    private final String id;
    private final Input<String> name;
    private final Input<String> ownerId;
    private final Input<Integer> periodicFrequency;
    private final Input<String> periodicFrequencyUnit;
    private final Input<SegmentInput> segment;
    private final Input<String> startDateTime;
    private final Input<String> status;
    private final Input<String> subscriptionType;
    private final Input<String> target;
    private final Input<String> updatedAt;
    private final Input<String> updatedBy;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> description = Input.absent();
        private Input<SegmentInput> segment = Input.absent();
        private Input<String> action = Input.absent();
        private Input<String> target = Input.absent();
        private Input<String> subscriptionType = Input.absent();
        private Input<Integer> periodicFrequency = Input.absent();
        private Input<String> periodicFrequencyUnit = Input.absent();
        private Input<String> startDateTime = Input.absent();
        private Input<String> endDateTime = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> createdBy = Input.absent();
        private Input<String> updatedBy = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder action(String str) {
            this.action = Input.fromNullable(str);
            return this;
        }

        public UpdateEntityActionDefinitionInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateEntityActionDefinitionInput(this.id, this.accountId, this.name, this.description, this.segment, this.action, this.target, this.subscriptionType, this.periodicFrequency, this.periodicFrequencyUnit, this.startDateTime, this.endDateTime, this.status, this.ownerId, this.createdAt, this.updatedAt, this.createdBy, this.updatedBy);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdBy(String str) {
            this.createdBy = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder endDateTime(String str) {
            this.endDateTime = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder periodicFrequency(Integer num) {
            this.periodicFrequency = Input.fromNullable(num);
            return this;
        }

        public Builder periodicFrequencyUnit(String str) {
            this.periodicFrequencyUnit = Input.fromNullable(str);
            return this;
        }

        public Builder segment(SegmentInput segmentInput) {
            this.segment = Input.fromNullable(segmentInput);
            return this;
        }

        public Builder startDateTime(String str) {
            this.startDateTime = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder subscriptionType(String str) {
            this.subscriptionType = Input.fromNullable(str);
            return this;
        }

        public Builder target(String str) {
            this.target = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedBy(String str) {
            this.updatedBy = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateEntityActionDefinitionInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<SegmentInput> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<Integer> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17) {
        this.id = str;
        this.accountId = input;
        this.name = input2;
        this.description = input3;
        this.segment = input4;
        this.action = input5;
        this.target = input6;
        this.subscriptionType = input7;
        this.periodicFrequency = input8;
        this.periodicFrequencyUnit = input9;
        this.startDateTime = input10;
        this.endDateTime = input11;
        this.status = input12;
        this.ownerId = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
        this.createdBy = input16;
        this.updatedBy = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String action() {
        return this.action.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdBy() {
        return this.createdBy.value;
    }

    public String description() {
        return this.description.value;
    }

    public String endDateTime() {
        return this.endDateTime.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateEntityActionDefinitionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateEntityActionDefinitionInput.this.id);
                if (UpdateEntityActionDefinitionInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateEntityActionDefinitionInput.this.accountId.value);
                }
                if (UpdateEntityActionDefinitionInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateEntityActionDefinitionInput.this.name.value);
                }
                if (UpdateEntityActionDefinitionInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateEntityActionDefinitionInput.this.description.value);
                }
                if (UpdateEntityActionDefinitionInput.this.segment.defined) {
                    inputFieldWriter.writeObject("segment", UpdateEntityActionDefinitionInput.this.segment.value != 0 ? ((SegmentInput) UpdateEntityActionDefinitionInput.this.segment.value).marshaller() : null);
                }
                if (UpdateEntityActionDefinitionInput.this.action.defined) {
                    inputFieldWriter.writeString("action", (String) UpdateEntityActionDefinitionInput.this.action.value);
                }
                if (UpdateEntityActionDefinitionInput.this.target.defined) {
                    inputFieldWriter.writeString("target", (String) UpdateEntityActionDefinitionInput.this.target.value);
                }
                if (UpdateEntityActionDefinitionInput.this.subscriptionType.defined) {
                    inputFieldWriter.writeString("subscriptionType", (String) UpdateEntityActionDefinitionInput.this.subscriptionType.value);
                }
                if (UpdateEntityActionDefinitionInput.this.periodicFrequency.defined) {
                    inputFieldWriter.writeInt("periodicFrequency", (Integer) UpdateEntityActionDefinitionInput.this.periodicFrequency.value);
                }
                if (UpdateEntityActionDefinitionInput.this.periodicFrequencyUnit.defined) {
                    inputFieldWriter.writeString("periodicFrequencyUnit", (String) UpdateEntityActionDefinitionInput.this.periodicFrequencyUnit.value);
                }
                if (UpdateEntityActionDefinitionInput.this.startDateTime.defined) {
                    inputFieldWriter.writeString("startDateTime", (String) UpdateEntityActionDefinitionInput.this.startDateTime.value);
                }
                if (UpdateEntityActionDefinitionInput.this.endDateTime.defined) {
                    inputFieldWriter.writeString("endDateTime", (String) UpdateEntityActionDefinitionInput.this.endDateTime.value);
                }
                if (UpdateEntityActionDefinitionInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateEntityActionDefinitionInput.this.status.value);
                }
                if (UpdateEntityActionDefinitionInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateEntityActionDefinitionInput.this.ownerId.value);
                }
                if (UpdateEntityActionDefinitionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateEntityActionDefinitionInput.this.createdAt.value);
                }
                if (UpdateEntityActionDefinitionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateEntityActionDefinitionInput.this.updatedAt.value);
                }
                if (UpdateEntityActionDefinitionInput.this.createdBy.defined) {
                    inputFieldWriter.writeString("createdBy", (String) UpdateEntityActionDefinitionInput.this.createdBy.value);
                }
                if (UpdateEntityActionDefinitionInput.this.updatedBy.defined) {
                    inputFieldWriter.writeString("updatedBy", (String) UpdateEntityActionDefinitionInput.this.updatedBy.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public Integer periodicFrequency() {
        return this.periodicFrequency.value;
    }

    public String periodicFrequencyUnit() {
        return this.periodicFrequencyUnit.value;
    }

    public SegmentInput segment() {
        return this.segment.value;
    }

    public String startDateTime() {
        return this.startDateTime.value;
    }

    public String status() {
        return this.status.value;
    }

    public String subscriptionType() {
        return this.subscriptionType.value;
    }

    public String target() {
        return this.target.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedBy() {
        return this.updatedBy.value;
    }
}
