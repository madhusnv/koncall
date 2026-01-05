package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class GoogleMeetRequest implements InputType {
    private final String accountId;
    private final Input<List<String>> attendees;
    private final Input<String> contactId;
    private final Input<String> contactName;
    private final Input<String> description;
    private final Input<String> endTime;
    private final Input<String> primaryParticipantEmailId;
    private final Input<String> primaryParticipantName;
    private final Input<String> startTime;
    private final String summary;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private String summary;
        private String userId;
        private Input<String> contactId = Input.absent();
        private Input<String> contactName = Input.absent();
        private Input<String> primaryParticipantEmailId = Input.absent();
        private Input<String> primaryParticipantName = Input.absent();
        private Input<String> description = Input.absent();
        private Input<List<String>> attendees = Input.absent();
        private Input<String> startTime = Input.absent();
        private Input<String> endTime = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder attendees(List<String> list) {
            this.attendees = Input.fromNullable(list);
            return this;
        }

        public GoogleMeetRequest build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            Utils.checkNotNull(this.summary, "summary == null");
            return new GoogleMeetRequest(this.accountId, this.userId, this.contactId, this.contactName, this.primaryParticipantEmailId, this.primaryParticipantName, this.summary, this.description, this.attendees, this.startTime, this.endTime);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder contactName(String str) {
            this.contactName = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder endTime(String str) {
            this.endTime = Input.fromNullable(str);
            return this;
        }

        public Builder primaryParticipantEmailId(String str) {
            this.primaryParticipantEmailId = Input.fromNullable(str);
            return this;
        }

        public Builder primaryParticipantName(String str) {
            this.primaryParticipantName = Input.fromNullable(str);
            return this;
        }

        public Builder startTime(String str) {
            this.startTime = Input.fromNullable(str);
            return this;
        }

        public Builder summary(String str) {
            this.summary = str;
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public GoogleMeetRequest(String str, String str2, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, String str3, Input<String> input5, Input<List<String>> input6, Input<String> input7, Input<String> input8) {
        this.accountId = str;
        this.userId = str2;
        this.contactId = input;
        this.contactName = input2;
        this.primaryParticipantEmailId = input3;
        this.primaryParticipantName = input4;
        this.summary = str3;
        this.description = input5;
        this.attendees = input6;
        this.startTime = input7;
        this.endTime = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public List<String> attendees() {
        return this.attendees.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String contactName() {
        return this.contactName.value;
    }

    public String description() {
        return this.description.value;
    }

    public String endTime() {
        return this.endTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.GoogleMeetRequest.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", GoogleMeetRequest.this.accountId);
                inputFieldWriter.writeString("userId", GoogleMeetRequest.this.userId);
                if (GoogleMeetRequest.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) GoogleMeetRequest.this.contactId.value);
                }
                if (GoogleMeetRequest.this.contactName.defined) {
                    inputFieldWriter.writeString("contactName", (String) GoogleMeetRequest.this.contactName.value);
                }
                if (GoogleMeetRequest.this.primaryParticipantEmailId.defined) {
                    inputFieldWriter.writeString("primaryParticipantEmailId", (String) GoogleMeetRequest.this.primaryParticipantEmailId.value);
                }
                if (GoogleMeetRequest.this.primaryParticipantName.defined) {
                    inputFieldWriter.writeString("primaryParticipantName", (String) GoogleMeetRequest.this.primaryParticipantName.value);
                }
                inputFieldWriter.writeString("summary", GoogleMeetRequest.this.summary);
                if (GoogleMeetRequest.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) GoogleMeetRequest.this.description.value);
                }
                if (GoogleMeetRequest.this.attendees.defined) {
                    inputFieldWriter.writeList("attendees", GoogleMeetRequest.this.attendees.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.GoogleMeetRequest.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) GoogleMeetRequest.this.attendees.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSEMAIL, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (GoogleMeetRequest.this.startTime.defined) {
                    inputFieldWriter.writeString("startTime", (String) GoogleMeetRequest.this.startTime.value);
                }
                if (GoogleMeetRequest.this.endTime.defined) {
                    inputFieldWriter.writeString("endTime", (String) GoogleMeetRequest.this.endTime.value);
                }
            }
        };
    }

    public String primaryParticipantEmailId() {
        return this.primaryParticipantEmailId.value;
    }

    public String primaryParticipantName() {
        return this.primaryParticipantName.value;
    }

    public String startTime() {
        return this.startTime.value;
    }

    public String summary() {
        return this.summary;
    }

    public String userId() {
        return this.userId;
    }
}
