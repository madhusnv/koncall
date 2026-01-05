package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMentionUserMembershipFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelMentionUserMembershipFilterInput>> and;
    private final Input<ModelIDInput> commentId;
    private final Input<ModelIDInput> commentedById;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> id;
    private final Input<ModelAnnouncementInput> isAnnouncement;
    private final Input<ModelIDInput> mentionedUserId;
    private final Input<ModelMentionUserMembershipFilterInput> not;
    private final Input<List<ModelMentionUserMembershipFilterInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> commentId = Input.absent();
        private Input<ModelIDInput> mentionedUserId = Input.absent();
        private Input<ModelAnnouncementInput> isAnnouncement = Input.absent();
        private Input<ModelIDInput> commentedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelMentionUserMembershipFilterInput>> and = Input.absent();
        private Input<List<ModelMentionUserMembershipFilterInput>> or = Input.absent();
        private Input<ModelMentionUserMembershipFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelMentionUserMembershipFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelMentionUserMembershipFilterInput build() {
            return new ModelMentionUserMembershipFilterInput(this.id, this.accountId, this.commentId, this.mentionedUserId, this.isAnnouncement, this.commentedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder commentId(ModelIDInput modelIDInput) {
            this.commentId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder commentedById(ModelIDInput modelIDInput) {
            this.commentedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isAnnouncement(ModelAnnouncementInput modelAnnouncementInput) {
            this.isAnnouncement = Input.fromNullable(modelAnnouncementInput);
            return this;
        }

        public Builder mentionedUserId(ModelIDInput modelIDInput) {
            this.mentionedUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelMentionUserMembershipFilterInput modelMentionUserMembershipFilterInput) {
            this.not = Input.fromNullable(modelMentionUserMembershipFilterInput);
            return this;
        }

        public Builder or(List<ModelMentionUserMembershipFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelMentionUserMembershipFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelAnnouncementInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelMentionUserMembershipFilterInput>> input9, Input<List<ModelMentionUserMembershipFilterInput>> input10, Input<ModelMentionUserMembershipFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.commentId = input3;
        this.mentionedUserId = input4;
        this.isAnnouncement = input5;
        this.commentedById = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelMentionUserMembershipFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput commentId() {
        return this.commentId.value;
    }

    public ModelIDInput commentedById() {
        return this.commentedById.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelAnnouncementInput isAnnouncement() {
        return this.isAnnouncement.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMentionUserMembershipFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMentionUserMembershipFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelMentionUserMembershipFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelMentionUserMembershipFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.commentId.defined) {
                    inputFieldWriter.writeObject("commentId", ModelMentionUserMembershipFilterInput.this.commentId.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipFilterInput.this.commentId.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.mentionedUserId.defined) {
                    inputFieldWriter.writeObject("mentionedUserId", ModelMentionUserMembershipFilterInput.this.mentionedUserId.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipFilterInput.this.mentionedUserId.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.isAnnouncement.defined) {
                    inputFieldWriter.writeObject("isAnnouncement", ModelMentionUserMembershipFilterInput.this.isAnnouncement.value != 0 ? ((ModelAnnouncementInput) ModelMentionUserMembershipFilterInput.this.isAnnouncement.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.commentedById.defined) {
                    inputFieldWriter.writeObject("commentedById", ModelMentionUserMembershipFilterInput.this.commentedById.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipFilterInput.this.commentedById.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelMentionUserMembershipFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelMentionUserMembershipFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelMentionUserMembershipFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelMentionUserMembershipFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelMentionUserMembershipFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMentionUserMembershipFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMentionUserMembershipFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMentionUserMembershipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelMentionUserMembershipFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMentionUserMembershipFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMentionUserMembershipFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMentionUserMembershipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMentionUserMembershipFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelMentionUserMembershipFilterInput.this.not.value != 0 ? ((ModelMentionUserMembershipFilterInput) ModelMentionUserMembershipFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput mentionedUserId() {
        return this.mentionedUserId.value;
    }

    public ModelMentionUserMembershipFilterInput not() {
        return this.not.value;
    }

    public List<ModelMentionUserMembershipFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
