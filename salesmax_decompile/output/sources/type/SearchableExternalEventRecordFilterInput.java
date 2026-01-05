package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableExternalEventRecordFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableExternalEventRecordFilterInput>> and;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> contactName;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> engagementId;
    private final Input<SearchableStringFilterInput> eventDescription;
    private final Input<SearchableStringFilterInput> eventEndTime;
    private final Input<SearchableStringFilterInput> eventStartTime;
    private final Input<SearchableStringFilterInput> eventSummary;
    private final Input<SearchableStringFilterInput> eventUrl;
    private final Input<SearchableIDFilterInput> externalSourceId;
    private final Input<SearchableStringFilterInput> externalSourceType;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> message;
    private final Input<SearchableExternalEventRecordFilterInput> not;
    private final Input<List<SearchableExternalEventRecordFilterInput>> or;
    private final Input<SearchableStringFilterInput> primaryParticipantEmailId;
    private final Input<SearchableStringFilterInput> primaryParticipantName;
    private final Input<SearchableStringFilterInput> rawEvent;
    private final Input<SearchableStringFilterInput> recordingUrl;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> transcriptUrl;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> userId;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> externalSourceId = Input.absent();
        private Input<SearchableStringFilterInput> externalSourceType = Input.absent();
        private Input<SearchableIDFilterInput> engagementId = Input.absent();
        private Input<SearchableIDFilterInput> userId = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableStringFilterInput> contactName = Input.absent();
        private Input<SearchableStringFilterInput> primaryParticipantEmailId = Input.absent();
        private Input<SearchableStringFilterInput> primaryParticipantName = Input.absent();
        private Input<SearchableStringFilterInput> recordingUrl = Input.absent();
        private Input<SearchableStringFilterInput> transcriptUrl = Input.absent();
        private Input<SearchableStringFilterInput> rawEvent = Input.absent();
        private Input<SearchableStringFilterInput> message = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> eventSummary = Input.absent();
        private Input<SearchableStringFilterInput> eventDescription = Input.absent();
        private Input<SearchableStringFilterInput> eventUrl = Input.absent();
        private Input<SearchableStringFilterInput> eventStartTime = Input.absent();
        private Input<SearchableStringFilterInput> eventEndTime = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableExternalEventRecordFilterInput>> and = Input.absent();
        private Input<List<SearchableExternalEventRecordFilterInput>> or = Input.absent();
        private Input<SearchableExternalEventRecordFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableExternalEventRecordFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableExternalEventRecordFilterInput build() {
            return new SearchableExternalEventRecordFilterInput(this.id, this.accountId, this.externalSourceId, this.externalSourceType, this.engagementId, this.userId, this.contactId, this.contactName, this.primaryParticipantEmailId, this.primaryParticipantName, this.recordingUrl, this.transcriptUrl, this.rawEvent, this.message, this.status, this.eventSummary, this.eventDescription, this.eventUrl, this.eventStartTime, this.eventEndTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactName(SearchableStringFilterInput searchableStringFilterInput) {
            this.contactName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder engagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.engagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder eventDescription(SearchableStringFilterInput searchableStringFilterInput) {
            this.eventDescription = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder eventEndTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.eventEndTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder eventStartTime(SearchableStringFilterInput searchableStringFilterInput) {
            this.eventStartTime = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder eventSummary(SearchableStringFilterInput searchableStringFilterInput) {
            this.eventSummary = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder eventUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.eventUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalSourceId(SearchableIDFilterInput searchableIDFilterInput) {
            this.externalSourceId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder externalSourceType(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalSourceType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder message(SearchableStringFilterInput searchableStringFilterInput) {
            this.message = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableExternalEventRecordFilterInput searchableExternalEventRecordFilterInput) {
            this.not = Input.fromNullable(searchableExternalEventRecordFilterInput);
            return this;
        }

        public Builder or(List<SearchableExternalEventRecordFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder primaryParticipantEmailId(SearchableStringFilterInput searchableStringFilterInput) {
            this.primaryParticipantEmailId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder primaryParticipantName(SearchableStringFilterInput searchableStringFilterInput) {
            this.primaryParticipantName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder rawEvent(SearchableStringFilterInput searchableStringFilterInput) {
            this.rawEvent = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder recordingUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.recordingUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder transcriptUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.transcriptUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder userId(SearchableIDFilterInput searchableIDFilterInput) {
            this.userId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableExternalEventRecordFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<List<SearchableExternalEventRecordFilterInput>> input23, Input<List<SearchableExternalEventRecordFilterInput>> input24, Input<SearchableExternalEventRecordFilterInput> input25) {
        this.id = input;
        this.accountId = input2;
        this.externalSourceId = input3;
        this.externalSourceType = input4;
        this.engagementId = input5;
        this.userId = input6;
        this.contactId = input7;
        this.contactName = input8;
        this.primaryParticipantEmailId = input9;
        this.primaryParticipantName = input10;
        this.recordingUrl = input11;
        this.transcriptUrl = input12;
        this.rawEvent = input13;
        this.message = input14;
        this.status = input15;
        this.eventSummary = input16;
        this.eventDescription = input17;
        this.eventUrl = input18;
        this.eventStartTime = input19;
        this.eventEndTime = input20;
        this.createdAt = input21;
        this.updatedAt = input22;
        this.and = input23;
        this.or = input24;
        this.not = input25;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableExternalEventRecordFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput contactName() {
        return this.contactName.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput engagementId() {
        return this.engagementId.value;
    }

    public SearchableStringFilterInput eventDescription() {
        return this.eventDescription.value;
    }

    public SearchableStringFilterInput eventEndTime() {
        return this.eventEndTime.value;
    }

    public SearchableStringFilterInput eventStartTime() {
        return this.eventStartTime.value;
    }

    public SearchableStringFilterInput eventSummary() {
        return this.eventSummary.value;
    }

    public SearchableStringFilterInput eventUrl() {
        return this.eventUrl.value;
    }

    public SearchableIDFilterInput externalSourceId() {
        return this.externalSourceId.value;
    }

    public SearchableStringFilterInput externalSourceType() {
        return this.externalSourceType.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableExternalEventRecordFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableExternalEventRecordFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableExternalEventRecordFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableExternalEventRecordFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableExternalEventRecordFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableExternalEventRecordFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.externalSourceId.defined) {
                    inputFieldWriter.writeObject("externalSourceId", SearchableExternalEventRecordFilterInput.this.externalSourceId.value != 0 ? ((SearchableIDFilterInput) SearchableExternalEventRecordFilterInput.this.externalSourceId.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.externalSourceType.defined) {
                    inputFieldWriter.writeObject("externalSourceType", SearchableExternalEventRecordFilterInput.this.externalSourceType.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.externalSourceType.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", SearchableExternalEventRecordFilterInput.this.engagementId.value != 0 ? ((SearchableIDFilterInput) SearchableExternalEventRecordFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", SearchableExternalEventRecordFilterInput.this.userId.value != 0 ? ((SearchableIDFilterInput) SearchableExternalEventRecordFilterInput.this.userId.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableExternalEventRecordFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableExternalEventRecordFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.contactName.defined) {
                    inputFieldWriter.writeObject("contactName", SearchableExternalEventRecordFilterInput.this.contactName.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.contactName.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.primaryParticipantEmailId.defined) {
                    inputFieldWriter.writeObject("primaryParticipantEmailId", SearchableExternalEventRecordFilterInput.this.primaryParticipantEmailId.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.primaryParticipantEmailId.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.primaryParticipantName.defined) {
                    inputFieldWriter.writeObject("primaryParticipantName", SearchableExternalEventRecordFilterInput.this.primaryParticipantName.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.primaryParticipantName.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.recordingUrl.defined) {
                    inputFieldWriter.writeObject("recordingUrl", SearchableExternalEventRecordFilterInput.this.recordingUrl.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.recordingUrl.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.transcriptUrl.defined) {
                    inputFieldWriter.writeObject("transcriptUrl", SearchableExternalEventRecordFilterInput.this.transcriptUrl.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.transcriptUrl.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.rawEvent.defined) {
                    inputFieldWriter.writeObject("rawEvent", SearchableExternalEventRecordFilterInput.this.rawEvent.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.rawEvent.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.message.defined) {
                    inputFieldWriter.writeObject(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, SearchableExternalEventRecordFilterInput.this.message.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.message.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableExternalEventRecordFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.eventSummary.defined) {
                    inputFieldWriter.writeObject("eventSummary", SearchableExternalEventRecordFilterInput.this.eventSummary.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.eventSummary.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.eventDescription.defined) {
                    inputFieldWriter.writeObject("eventDescription", SearchableExternalEventRecordFilterInput.this.eventDescription.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.eventDescription.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.eventUrl.defined) {
                    inputFieldWriter.writeObject("eventUrl", SearchableExternalEventRecordFilterInput.this.eventUrl.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.eventUrl.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.eventStartTime.defined) {
                    inputFieldWriter.writeObject("eventStartTime", SearchableExternalEventRecordFilterInput.this.eventStartTime.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.eventStartTime.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.eventEndTime.defined) {
                    inputFieldWriter.writeObject("eventEndTime", SearchableExternalEventRecordFilterInput.this.eventEndTime.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.eventEndTime.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableExternalEventRecordFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableExternalEventRecordFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableExternalEventRecordFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableExternalEventRecordFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableExternalEventRecordFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableExternalEventRecordFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableExternalEventRecordFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableExternalEventRecordFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableExternalEventRecordFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableExternalEventRecordFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableExternalEventRecordFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableExternalEventRecordFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableExternalEventRecordFilterInput.this.not.value != 0 ? ((SearchableExternalEventRecordFilterInput) SearchableExternalEventRecordFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput message() {
        return this.message.value;
    }

    public SearchableExternalEventRecordFilterInput not() {
        return this.not.value;
    }

    public List<SearchableExternalEventRecordFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput primaryParticipantEmailId() {
        return this.primaryParticipantEmailId.value;
    }

    public SearchableStringFilterInput primaryParticipantName() {
        return this.primaryParticipantName.value;
    }

    public SearchableStringFilterInput rawEvent() {
        return this.rawEvent.value;
    }

    public SearchableStringFilterInput recordingUrl() {
        return this.recordingUrl.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput transcriptUrl() {
        return this.transcriptUrl.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput userId() {
        return this.userId.value;
    }
}
