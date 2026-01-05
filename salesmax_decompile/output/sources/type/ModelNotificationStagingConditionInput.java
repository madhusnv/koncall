package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelNotificationStagingConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> activityDoneByUserId;
    private final Input<List<ModelNotificationStagingConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> content;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIntInput> expirationUnixTime;
    private final Input<ModelNotificationStagingConditionInput> not;
    private final Input<ModelStringInput> notificationChannel;
    private final Input<ModelIDInput> notificationId;
    private final Input<ModelIDInput> notificationRelatedObjectId;
    private final Input<ModelActivityRelatedObjectTypeInput> notificationRelatedObjectType;
    private final Input<ModelStringInput> notificationStatus;
    private final Input<ModelStringInput> notificationType;
    private final Input<List<ModelNotificationStagingConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> scheduledAt;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> notificationId = Input.absent();
        private Input<ModelStringInput> notificationChannel = Input.absent();
        private Input<ModelStringInput> notificationStatus = Input.absent();
        private Input<ModelStringInput> notificationType = Input.absent();
        private Input<ModelActivityRelatedObjectTypeInput> notificationRelatedObjectType = Input.absent();
        private Input<ModelIDInput> notificationRelatedObjectId = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> activityDoneByUserId = Input.absent();
        private Input<ModelStringInput> content = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelStringInput> scheduledAt = Input.absent();
        private Input<ModelIntInput> expirationUnixTime = Input.absent();
        private Input<List<ModelNotificationStagingConditionInput>> and = Input.absent();
        private Input<List<ModelNotificationStagingConditionInput>> or = Input.absent();
        private Input<ModelNotificationStagingConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder activityDoneByUserId(ModelIDInput modelIDInput) {
            this.activityDoneByUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelNotificationStagingConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelNotificationStagingConditionInput build() {
            return new ModelNotificationStagingConditionInput(this.accountId, this.notificationId, this.notificationChannel, this.notificationStatus, this.notificationType, this.notificationRelatedObjectType, this.notificationRelatedObjectId, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.content, this.createdAt, this.updatedAt, this.scheduledAt, this.expirationUnixTime, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder content(ModelStringInput modelStringInput) {
            this.content = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder expirationUnixTime(ModelIntInput modelIntInput) {
            this.expirationUnixTime = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder not(ModelNotificationStagingConditionInput modelNotificationStagingConditionInput) {
            this.not = Input.fromNullable(modelNotificationStagingConditionInput);
            return this;
        }

        public Builder notificationChannel(ModelStringInput modelStringInput) {
            this.notificationChannel = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder notificationId(ModelIDInput modelIDInput) {
            this.notificationId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder notificationRelatedObjectId(ModelIDInput modelIDInput) {
            this.notificationRelatedObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder notificationRelatedObjectType(ModelActivityRelatedObjectTypeInput modelActivityRelatedObjectTypeInput) {
            this.notificationRelatedObjectType = Input.fromNullable(modelActivityRelatedObjectTypeInput);
            return this;
        }

        public Builder notificationStatus(ModelStringInput modelStringInput) {
            this.notificationStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder notificationType(ModelStringInput modelStringInput) {
            this.notificationType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelNotificationStagingConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder primaryTeamId(ModelIDInput modelIDInput) {
            this.primaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder scheduledAt(ModelStringInput modelStringInput) {
            this.scheduledAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelNotificationStagingConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelActivityRelatedObjectTypeInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelIntInput> input16, Input<List<ModelNotificationStagingConditionInput>> input17, Input<List<ModelNotificationStagingConditionInput>> input18, Input<ModelNotificationStagingConditionInput> input19) {
        this.accountId = input;
        this.notificationId = input2;
        this.notificationChannel = input3;
        this.notificationStatus = input4;
        this.notificationType = input5;
        this.notificationRelatedObjectType = input6;
        this.notificationRelatedObjectId = input7;
        this.ownerId = input8;
        this.primaryTeamId = input9;
        this.contactId = input10;
        this.activityDoneByUserId = input11;
        this.content = input12;
        this.createdAt = input13;
        this.updatedAt = input14;
        this.scheduledAt = input15;
        this.expirationUnixTime = input16;
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

    public ModelIDInput activityDoneByUserId() {
        return this.activityDoneByUserId.value;
    }

    public List<ModelNotificationStagingConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput content() {
        return this.content.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIntInput expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelNotificationStagingConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelNotificationStagingConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelNotificationStagingConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelNotificationStagingConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.notificationId.defined) {
                    inputFieldWriter.writeObject("notificationId", ModelNotificationStagingConditionInput.this.notificationId.value != 0 ? ((ModelIDInput) ModelNotificationStagingConditionInput.this.notificationId.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.notificationChannel.defined) {
                    inputFieldWriter.writeObject("notificationChannel", ModelNotificationStagingConditionInput.this.notificationChannel.value != 0 ? ((ModelStringInput) ModelNotificationStagingConditionInput.this.notificationChannel.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.notificationStatus.defined) {
                    inputFieldWriter.writeObject("notificationStatus", ModelNotificationStagingConditionInput.this.notificationStatus.value != 0 ? ((ModelStringInput) ModelNotificationStagingConditionInput.this.notificationStatus.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.notificationType.defined) {
                    inputFieldWriter.writeObject("notificationType", ModelNotificationStagingConditionInput.this.notificationType.value != 0 ? ((ModelStringInput) ModelNotificationStagingConditionInput.this.notificationType.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.notificationRelatedObjectType.defined) {
                    inputFieldWriter.writeObject("notificationRelatedObjectType", ModelNotificationStagingConditionInput.this.notificationRelatedObjectType.value != 0 ? ((ModelActivityRelatedObjectTypeInput) ModelNotificationStagingConditionInput.this.notificationRelatedObjectType.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.notificationRelatedObjectId.defined) {
                    inputFieldWriter.writeObject("notificationRelatedObjectId", ModelNotificationStagingConditionInput.this.notificationRelatedObjectId.value != 0 ? ((ModelIDInput) ModelNotificationStagingConditionInput.this.notificationRelatedObjectId.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelNotificationStagingConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelNotificationStagingConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelNotificationStagingConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelNotificationStagingConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelNotificationStagingConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelNotificationStagingConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.activityDoneByUserId.defined) {
                    inputFieldWriter.writeObject("activityDoneByUserId", ModelNotificationStagingConditionInput.this.activityDoneByUserId.value != 0 ? ((ModelIDInput) ModelNotificationStagingConditionInput.this.activityDoneByUserId.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.content.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CONTENT, ModelNotificationStagingConditionInput.this.content.value != 0 ? ((ModelStringInput) ModelNotificationStagingConditionInput.this.content.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelNotificationStagingConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelNotificationStagingConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelNotificationStagingConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelNotificationStagingConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.scheduledAt.defined) {
                    inputFieldWriter.writeObject("scheduledAt", ModelNotificationStagingConditionInput.this.scheduledAt.value != 0 ? ((ModelStringInput) ModelNotificationStagingConditionInput.this.scheduledAt.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeObject("expirationUnixTime", ModelNotificationStagingConditionInput.this.expirationUnixTime.value != 0 ? ((ModelIntInput) ModelNotificationStagingConditionInput.this.expirationUnixTime.value).marshaller() : null);
                }
                if (ModelNotificationStagingConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelNotificationStagingConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelNotificationStagingConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelNotificationStagingConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelNotificationStagingConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelNotificationStagingConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelNotificationStagingConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelNotificationStagingConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelNotificationStagingConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelNotificationStagingConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelNotificationStagingConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelNotificationStagingConditionInput.this.not.value != 0 ? ((ModelNotificationStagingConditionInput) ModelNotificationStagingConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelNotificationStagingConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput notificationChannel() {
        return this.notificationChannel.value;
    }

    public ModelIDInput notificationId() {
        return this.notificationId.value;
    }

    public ModelIDInput notificationRelatedObjectId() {
        return this.notificationRelatedObjectId.value;
    }

    public ModelActivityRelatedObjectTypeInput notificationRelatedObjectType() {
        return this.notificationRelatedObjectType.value;
    }

    public ModelStringInput notificationStatus() {
        return this.notificationStatus.value;
    }

    public ModelStringInput notificationType() {
        return this.notificationType.value;
    }

    public List<ModelNotificationStagingConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelStringInput scheduledAt() {
        return this.scheduledAt.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
