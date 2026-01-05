package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableDeviceRegistrationRequestFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableDeviceRegistrationRequestFilterInput>> and;
    private final Input<SearchableStringFilterInput> approvedAt;
    private final Input<SearchableIDFilterInput> approvedBy;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> deviceModel;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> ipAddress;
    private final Input<SearchableDeviceRegistrationRequestFilterInput> not;
    private final Input<List<SearchableDeviceRegistrationRequestFilterInput>> or;
    private final Input<SearchableStringFilterInput> osVersion;
    private final Input<SearchableStringFilterInput> reason;
    private final Input<SearchableStringFilterInput> requestedAt;
    private final Input<SearchableStringFilterInput> requestedDeviceId;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> userId;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> userId = Input.absent();
        private Input<SearchableStringFilterInput> requestedDeviceId = Input.absent();
        private Input<SearchableStringFilterInput> deviceModel = Input.absent();
        private Input<SearchableStringFilterInput> osVersion = Input.absent();
        private Input<SearchableStringFilterInput> ipAddress = Input.absent();
        private Input<SearchableStringFilterInput> reason = Input.absent();
        private Input<SearchableStringFilterInput> requestedAt = Input.absent();
        private Input<SearchableIDFilterInput> approvedBy = Input.absent();
        private Input<SearchableStringFilterInput> approvedAt = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableDeviceRegistrationRequestFilterInput>> and = Input.absent();
        private Input<List<SearchableDeviceRegistrationRequestFilterInput>> or = Input.absent();
        private Input<SearchableDeviceRegistrationRequestFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableDeviceRegistrationRequestFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder approvedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.approvedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder approvedBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.approvedBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public SearchableDeviceRegistrationRequestFilterInput build() {
            return new SearchableDeviceRegistrationRequestFilterInput(this.id, this.accountId, this.userId, this.requestedDeviceId, this.deviceModel, this.osVersion, this.ipAddress, this.reason, this.requestedAt, this.approvedBy, this.approvedAt, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder deviceModel(SearchableStringFilterInput searchableStringFilterInput) {
            this.deviceModel = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder ipAddress(SearchableStringFilterInput searchableStringFilterInput) {
            this.ipAddress = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableDeviceRegistrationRequestFilterInput searchableDeviceRegistrationRequestFilterInput) {
            this.not = Input.fromNullable(searchableDeviceRegistrationRequestFilterInput);
            return this;
        }

        public Builder or(List<SearchableDeviceRegistrationRequestFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder osVersion(SearchableStringFilterInput searchableStringFilterInput) {
            this.osVersion = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder reason(SearchableStringFilterInput searchableStringFilterInput) {
            this.reason = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder requestedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.requestedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder requestedDeviceId(SearchableStringFilterInput searchableStringFilterInput) {
            this.requestedDeviceId = Input.fromNullable(searchableStringFilterInput);
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

    public SearchableDeviceRegistrationRequestFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableIDFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<List<SearchableDeviceRegistrationRequestFilterInput>> input14, Input<List<SearchableDeviceRegistrationRequestFilterInput>> input15, Input<SearchableDeviceRegistrationRequestFilterInput> input16) {
        this.id = input;
        this.accountId = input2;
        this.userId = input3;
        this.requestedDeviceId = input4;
        this.deviceModel = input5;
        this.osVersion = input6;
        this.ipAddress = input7;
        this.reason = input8;
        this.requestedAt = input9;
        this.approvedBy = input10;
        this.approvedAt = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
        this.and = input14;
        this.or = input15;
        this.not = input16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableDeviceRegistrationRequestFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput approvedAt() {
        return this.approvedAt.value;
    }

    public SearchableIDFilterInput approvedBy() {
        return this.approvedBy.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput deviceModel() {
        return this.deviceModel.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput ipAddress() {
        return this.ipAddress.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableDeviceRegistrationRequestFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableDeviceRegistrationRequestFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableDeviceRegistrationRequestFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableDeviceRegistrationRequestFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", SearchableDeviceRegistrationRequestFilterInput.this.userId.value != 0 ? ((SearchableIDFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.userId.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.requestedDeviceId.defined) {
                    inputFieldWriter.writeObject("requestedDeviceId", SearchableDeviceRegistrationRequestFilterInput.this.requestedDeviceId.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.requestedDeviceId.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.deviceModel.defined) {
                    inputFieldWriter.writeObject("deviceModel", SearchableDeviceRegistrationRequestFilterInput.this.deviceModel.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.deviceModel.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.osVersion.defined) {
                    inputFieldWriter.writeObject("osVersion", SearchableDeviceRegistrationRequestFilterInput.this.osVersion.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.osVersion.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.ipAddress.defined) {
                    inputFieldWriter.writeObject("ipAddress", SearchableDeviceRegistrationRequestFilterInput.this.ipAddress.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.ipAddress.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.reason.defined) {
                    inputFieldWriter.writeObject("reason", SearchableDeviceRegistrationRequestFilterInput.this.reason.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.reason.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.requestedAt.defined) {
                    inputFieldWriter.writeObject("requestedAt", SearchableDeviceRegistrationRequestFilterInput.this.requestedAt.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.requestedAt.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.approvedBy.defined) {
                    inputFieldWriter.writeObject("approvedBy", SearchableDeviceRegistrationRequestFilterInput.this.approvedBy.value != 0 ? ((SearchableIDFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.approvedBy.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.approvedAt.defined) {
                    inputFieldWriter.writeObject("approvedAt", SearchableDeviceRegistrationRequestFilterInput.this.approvedAt.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.approvedAt.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableDeviceRegistrationRequestFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableDeviceRegistrationRequestFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableDeviceRegistrationRequestFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableDeviceRegistrationRequestFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableDeviceRegistrationRequestFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableDeviceRegistrationRequestFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableDeviceRegistrationRequestFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableDeviceRegistrationRequestFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableDeviceRegistrationRequestFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableDeviceRegistrationRequestFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableDeviceRegistrationRequestFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableDeviceRegistrationRequestFilterInput.this.not.value != 0 ? ((SearchableDeviceRegistrationRequestFilterInput) SearchableDeviceRegistrationRequestFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableDeviceRegistrationRequestFilterInput not() {
        return this.not.value;
    }

    public List<SearchableDeviceRegistrationRequestFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput osVersion() {
        return this.osVersion.value;
    }

    public SearchableStringFilterInput reason() {
        return this.reason.value;
    }

    public SearchableStringFilterInput requestedAt() {
        return this.requestedAt.value;
    }

    public SearchableStringFilterInput requestedDeviceId() {
        return this.requestedDeviceId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput userId() {
        return this.userId.value;
    }
}
