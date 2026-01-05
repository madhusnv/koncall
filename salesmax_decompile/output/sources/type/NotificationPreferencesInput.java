package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class NotificationPreferencesInput implements InputType {
    private final Input<List<Channels>> channels;
    private final ActivityType notificationType;

    public static final class Builder {
        private Input<List<Channels>> channels = Input.absent();
        private ActivityType notificationType;

        public NotificationPreferencesInput build() {
            Utils.checkNotNull(this.notificationType, "notificationType == null");
            return new NotificationPreferencesInput(this.notificationType, this.channels);
        }

        public Builder channels(List<Channels> list) {
            this.channels = Input.fromNullable(list);
            return this;
        }

        public Builder notificationType(ActivityType activityType) {
            this.notificationType = activityType;
            return this;
        }
    }

    public NotificationPreferencesInput(ActivityType activityType, Input<List<Channels>> input) {
        this.notificationType = activityType;
        this.channels = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<Channels> channels() {
        return this.channels.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.NotificationPreferencesInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("notificationType", NotificationPreferencesInput.this.notificationType.name());
                if (NotificationPreferencesInput.this.channels.defined) {
                    inputFieldWriter.writeList("channels", NotificationPreferencesInput.this.channels.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.NotificationPreferencesInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) NotificationPreferencesInput.this.channels.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString(((Channels) it.next()).name());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public ActivityType notificationType() {
        return this.notificationType;
    }
}
