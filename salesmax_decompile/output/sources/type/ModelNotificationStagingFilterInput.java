package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelNotificationStagingFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> activityDoneByUserId;
    private final Input<List<ModelNotificationStagingFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> content;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIntInput> expirationUnixTime;
    private final Input<ModelIDInput> id;
    private final Input<ModelNotificationStagingFilterInput> not;
    private final Input<ModelStringInput> notificationChannel;
    private final Input<ModelIDInput> notificationId;
    private final Input<ModelIDInput> notificationRelatedObjectId;
    private final Input<ModelActivityRelatedObjectTypeInput> notificationRelatedObjectType;
    private final Input<ModelStringInput> notificationStatus;
    private final Input<ModelStringInput> notificationType;
    private final Input<List<ModelNotificationStagingFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelStringInput> scheduledAt;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelNotificationStagingFilterInput>> and = Input.absent();
        private Input<List<ModelNotificationStagingFilterInput>> or = Input.absent();
        private Input<ModelNotificationStagingFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder activityDoneByUserId(ModelIDInput modelIDInput) {
            this.activityDoneByUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelNotificationStagingFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelNotificationStagingFilterInput build() {
            return new ModelNotificationStagingFilterInput(this.id, this.accountId, this.notificationId, this.notificationChannel, this.notificationStatus, this.notificationType, this.notificationRelatedObjectType, this.notificationRelatedObjectId, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.content, this.createdAt, this.updatedAt, this.scheduledAt, this.expirationUnixTime, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelNotificationStagingFilterInput modelNotificationStagingFilterInput) {
            this.not = Input.fromNullable(modelNotificationStagingFilterInput);
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

        public Builder or(List<ModelNotificationStagingFilterInput> list) {
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

    public ModelNotificationStagingFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelActivityRelatedObjectTypeInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelIntInput> input17, Input<List<ModelNotificationStagingFilterInput>> input18, Input<List<ModelNotificationStagingFilterInput>> input19, Input<ModelNotificationStagingFilterInput> input20) {
        this.id = input;
        this.accountId = input2;
        this.notificationId = input3;
        this.notificationChannel = input4;
        this.notificationStatus = input5;
        this.notificationType = input6;
        this.notificationRelatedObjectType = input7;
        this.notificationRelatedObjectId = input8;
        this.ownerId = input9;
        this.primaryTeamId = input10;
        this.contactId = input11;
        this.activityDoneByUserId = input12;
        this.content = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
        this.scheduledAt = input16;
        this.expirationUnixTime = input17;
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

    public ModelIDInput activityDoneByUserId() {
        return this.activityDoneByUserId.value;
    }

    public List<ModelNotificationStagingFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelNotificationStagingFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelNotificationStagingFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelNotificationStagingFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelNotificationStagingFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelNotificationStagingFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelNotificationStagingFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.notificationId.defined) {
                    inputFieldWriter.writeObject("notificationId", ModelNotificationStagingFilterInput.this.notificationId.value != 0 ? ((ModelIDInput) ModelNotificationStagingFilterInput.this.notificationId.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.notificationChannel.defined) {
                    inputFieldWriter.writeObject("notificationChannel", ModelNotificationStagingFilterInput.this.notificationChannel.value != 0 ? ((ModelStringInput) ModelNotificationStagingFilterInput.this.notificationChannel.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.notificationStatus.defined) {
                    inputFieldWriter.writeObject("notificationStatus", ModelNotificationStagingFilterInput.this.notificationStatus.value != 0 ? ((ModelStringInput) ModelNotificationStagingFilterInput.this.notificationStatus.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.notificationType.defined) {
                    inputFieldWriter.writeObject("notificationType", ModelNotificationStagingFilterInput.this.notificationType.value != 0 ? ((ModelStringInput) ModelNotificationStagingFilterInput.this.notificationType.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.notificationRelatedObjectType.defined) {
                    inputFieldWriter.writeObject("notificationRelatedObjectType", ModelNotificationStagingFilterInput.this.notificationRelatedObjectType.value != 0 ? ((ModelActivityRelatedObjectTypeInput) ModelNotificationStagingFilterInput.this.notificationRelatedObjectType.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.notificationRelatedObjectId.defined) {
                    inputFieldWriter.writeObject("notificationRelatedObjectId", ModelNotificationStagingFilterInput.this.notificationRelatedObjectId.value != 0 ? ((ModelIDInput) ModelNotificationStagingFilterInput.this.notificationRelatedObjectId.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelNotificationStagingFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelNotificationStagingFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelNotificationStagingFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelNotificationStagingFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelNotificationStagingFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelNotificationStagingFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.activityDoneByUserId.defined) {
                    inputFieldWriter.writeObject("activityDoneByUserId", ModelNotificationStagingFilterInput.this.activityDoneByUserId.value != 0 ? ((ModelIDInput) ModelNotificationStagingFilterInput.this.activityDoneByUserId.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.content.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CONTENT, ModelNotificationStagingFilterInput.this.content.value != 0 ? ((ModelStringInput) ModelNotificationStagingFilterInput.this.content.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelNotificationStagingFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelNotificationStagingFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelNotificationStagingFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelNotificationStagingFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.scheduledAt.defined) {
                    inputFieldWriter.writeObject("scheduledAt", ModelNotificationStagingFilterInput.this.scheduledAt.value != 0 ? ((ModelStringInput) ModelNotificationStagingFilterInput.this.scheduledAt.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeObject("expirationUnixTime", ModelNotificationStagingFilterInput.this.expirationUnixTime.value != 0 ? ((ModelIntInput) ModelNotificationStagingFilterInput.this.expirationUnixTime.value).marshaller() : null);
                }
                if (ModelNotificationStagingFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelNotificationStagingFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelNotificationStagingFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelNotificationStagingFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelNotificationStagingFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelNotificationStagingFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelNotificationStagingFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelNotificationStagingFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelNotificationStagingFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelNotificationStagingFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelNotificationStagingFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelNotificationStagingFilterInput.this.not.value != 0 ? ((ModelNotificationStagingFilterInput) ModelNotificationStagingFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelNotificationStagingFilterInput not() {
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

    public List<ModelNotificationStagingFilterInput> or() {
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
