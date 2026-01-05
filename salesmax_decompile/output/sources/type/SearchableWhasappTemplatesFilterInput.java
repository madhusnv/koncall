package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableWhasappTemplatesFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableWhasappTemplatesFilterInput>> and;
    private final Input<SearchableStringFilterInput> archivedStatus;
    private final Input<SearchableStringFilterInput> category;
    private final Input<SearchableStringFilterInput> components;
    private final Input<SearchableStringFilterInput> components__waBody__waText;
    private final Input<SearchableStringFilterInput> components__waFooter__waText;
    private final Input<SearchableStringFilterInput> components__waHeader__waText;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdBy;
    private final Input<SearchableIDFilterInput> defaultMediaId;
    private final Input<SearchableStringFilterInput> footerText;
    private final Input<SearchableStringFilterInput> headerText;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableBooleanFilterInput> isSample;
    private final Input<SearchableStringFilterInput> language;
    private final Input<SearchableStringFilterInput> lastUsed;
    private final Input<SearchableStringFilterInput> messageSubType;
    private final Input<SearchableStringFilterInput> messageType;
    private final Input<SearchableStringFilterInput> name;
    private final Input<SearchableWhasappTemplatesFilterInput> not;
    private final Input<List<SearchableWhasappTemplatesFilterInput>> or;
    private final Input<SearchableStringFilterInput> platform;
    private final Input<SearchableStringFilterInput> snippetType;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> templateId;
    private final Input<SearchableStringFilterInput> templateType;
    private final Input<SearchableStringFilterInput> text;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedBy;
    private final Input<SearchableIDFilterInput> whatsappBusinessAccount;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> whatsappBusinessAccount = Input.absent();
        private Input<SearchableStringFilterInput> platform = Input.absent();
        private Input<SearchableStringFilterInput> templateType = Input.absent();
        private Input<SearchableStringFilterInput> snippetType = Input.absent();
        private Input<SearchableStringFilterInput> messageType = Input.absent();
        private Input<SearchableStringFilterInput> messageSubType = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> components = Input.absent();
        private Input<SearchableStringFilterInput> components__waHeader__waText = Input.absent();
        private Input<SearchableStringFilterInput> components__waBody__waText = Input.absent();
        private Input<SearchableStringFilterInput> components__waFooter__waText = Input.absent();
        private Input<SearchableStringFilterInput> language = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> category = Input.absent();
        private Input<SearchableIDFilterInput> createdBy = Input.absent();
        private Input<SearchableIDFilterInput> updatedBy = Input.absent();
        private Input<SearchableStringFilterInput> archivedStatus = Input.absent();
        private Input<SearchableIDFilterInput> defaultMediaId = Input.absent();
        private Input<SearchableStringFilterInput> templateId = Input.absent();
        private Input<SearchableStringFilterInput> lastUsed = Input.absent();
        private Input<SearchableBooleanFilterInput> isSample = Input.absent();
        private Input<SearchableStringFilterInput> text = Input.absent();
        private Input<SearchableStringFilterInput> headerText = Input.absent();
        private Input<SearchableStringFilterInput> footerText = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableWhasappTemplatesFilterInput>> and = Input.absent();
        private Input<List<SearchableWhasappTemplatesFilterInput>> or = Input.absent();
        private Input<SearchableWhasappTemplatesFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableWhasappTemplatesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder archivedStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.archivedStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableWhasappTemplatesFilterInput build() {
            return new SearchableWhasappTemplatesFilterInput(this.id, this.accountId, this.whatsappBusinessAccount, this.platform, this.templateType, this.snippetType, this.messageType, this.messageSubType, this.name, this.components, this.components__waHeader__waText, this.components__waBody__waText, this.components__waFooter__waText, this.language, this.status, this.category, this.createdBy, this.updatedBy, this.archivedStatus, this.defaultMediaId, this.templateId, this.lastUsed, this.isSample, this.text, this.headerText, this.footerText, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder category(SearchableStringFilterInput searchableStringFilterInput) {
            this.category = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder components(SearchableStringFilterInput searchableStringFilterInput) {
            this.components = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder components__waBody__waText(SearchableStringFilterInput searchableStringFilterInput) {
            this.components__waBody__waText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder components__waFooter__waText(SearchableStringFilterInput searchableStringFilterInput) {
            this.components__waFooter__waText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder components__waHeader__waText(SearchableStringFilterInput searchableStringFilterInput) {
            this.components__waHeader__waText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder defaultMediaId(SearchableIDFilterInput searchableIDFilterInput) {
            this.defaultMediaId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder footerText(SearchableStringFilterInput searchableStringFilterInput) {
            this.footerText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder headerText(SearchableStringFilterInput searchableStringFilterInput) {
            this.headerText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isSample(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isSample = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder language(SearchableStringFilterInput searchableStringFilterInput) {
            this.language = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lastUsed(SearchableStringFilterInput searchableStringFilterInput) {
            this.lastUsed = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder messageSubType(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageSubType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder messageType(SearchableStringFilterInput searchableStringFilterInput) {
            this.messageType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableWhasappTemplatesFilterInput searchableWhasappTemplatesFilterInput) {
            this.not = Input.fromNullable(searchableWhasappTemplatesFilterInput);
            return this;
        }

        public Builder or(List<SearchableWhasappTemplatesFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder platform(SearchableStringFilterInput searchableStringFilterInput) {
            this.platform = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder snippetType(SearchableStringFilterInput searchableStringFilterInput) {
            this.snippetType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder templateId(SearchableStringFilterInput searchableStringFilterInput) {
            this.templateId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder templateType(SearchableStringFilterInput searchableStringFilterInput) {
            this.templateType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder text(SearchableStringFilterInput searchableStringFilterInput) {
            this.text = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.updatedBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder whatsappBusinessAccount(SearchableIDFilterInput searchableIDFilterInput) {
            this.whatsappBusinessAccount = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableWhasappTemplatesFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableIDFilterInput> input17, Input<SearchableIDFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableIDFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableBooleanFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<SearchableStringFilterInput> input25, Input<SearchableStringFilterInput> input26, Input<SearchableStringFilterInput> input27, Input<SearchableStringFilterInput> input28, Input<List<SearchableWhasappTemplatesFilterInput>> input29, Input<List<SearchableWhasappTemplatesFilterInput>> input30, Input<SearchableWhasappTemplatesFilterInput> input31) {
        this.id = input;
        this.accountId = input2;
        this.whatsappBusinessAccount = input3;
        this.platform = input4;
        this.templateType = input5;
        this.snippetType = input6;
        this.messageType = input7;
        this.messageSubType = input8;
        this.name = input9;
        this.components = input10;
        this.components__waHeader__waText = input11;
        this.components__waBody__waText = input12;
        this.components__waFooter__waText = input13;
        this.language = input14;
        this.status = input15;
        this.category = input16;
        this.createdBy = input17;
        this.updatedBy = input18;
        this.archivedStatus = input19;
        this.defaultMediaId = input20;
        this.templateId = input21;
        this.lastUsed = input22;
        this.isSample = input23;
        this.text = input24;
        this.headerText = input25;
        this.footerText = input26;
        this.createdAt = input27;
        this.updatedAt = input28;
        this.and = input29;
        this.or = input30;
        this.not = input31;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableWhasappTemplatesFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput archivedStatus() {
        return this.archivedStatus.value;
    }

    public SearchableStringFilterInput category() {
        return this.category.value;
    }

    public SearchableStringFilterInput components() {
        return this.components.value;
    }

    public SearchableStringFilterInput components__waBody__waText() {
        return this.components__waBody__waText.value;
    }

    public SearchableStringFilterInput components__waFooter__waText() {
        return this.components__waFooter__waText.value;
    }

    public SearchableStringFilterInput components__waHeader__waText() {
        return this.components__waHeader__waText.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdBy() {
        return this.createdBy.value;
    }

    public SearchableIDFilterInput defaultMediaId() {
        return this.defaultMediaId.value;
    }

    public SearchableStringFilterInput footerText() {
        return this.footerText.value;
    }

    public SearchableStringFilterInput headerText() {
        return this.headerText.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableBooleanFilterInput isSample() {
        return this.isSample.value;
    }

    public SearchableStringFilterInput language() {
        return this.language.value;
    }

    public SearchableStringFilterInput lastUsed() {
        return this.lastUsed.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableWhasappTemplatesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableWhasappTemplatesFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableWhasappTemplatesFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableWhasappTemplatesFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableWhasappTemplatesFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableWhasappTemplatesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.whatsappBusinessAccount.defined) {
                    inputFieldWriter.writeObject("whatsappBusinessAccount", SearchableWhasappTemplatesFilterInput.this.whatsappBusinessAccount.value != 0 ? ((SearchableIDFilterInput) SearchableWhasappTemplatesFilterInput.this.whatsappBusinessAccount.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.platform.defined) {
                    inputFieldWriter.writeObject("platform", SearchableWhasappTemplatesFilterInput.this.platform.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.platform.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.templateType.defined) {
                    inputFieldWriter.writeObject("templateType", SearchableWhasappTemplatesFilterInput.this.templateType.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.templateType.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.snippetType.defined) {
                    inputFieldWriter.writeObject("snippetType", SearchableWhasappTemplatesFilterInput.this.snippetType.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.snippetType.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.messageType.defined) {
                    inputFieldWriter.writeObject("messageType", SearchableWhasappTemplatesFilterInput.this.messageType.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.messageType.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.messageSubType.defined) {
                    inputFieldWriter.writeObject("messageSubType", SearchableWhasappTemplatesFilterInput.this.messageSubType.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.messageSubType.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableWhasappTemplatesFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.components.defined) {
                    inputFieldWriter.writeObject("components", SearchableWhasappTemplatesFilterInput.this.components.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.components.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.components__waHeader__waText.defined) {
                    inputFieldWriter.writeObject("components__waHeader__waText", SearchableWhasappTemplatesFilterInput.this.components__waHeader__waText.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.components__waHeader__waText.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.components__waBody__waText.defined) {
                    inputFieldWriter.writeObject("components__waBody__waText", SearchableWhasappTemplatesFilterInput.this.components__waBody__waText.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.components__waBody__waText.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.components__waFooter__waText.defined) {
                    inputFieldWriter.writeObject("components__waFooter__waText", SearchableWhasappTemplatesFilterInput.this.components__waFooter__waText.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.components__waFooter__waText.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.language.defined) {
                    inputFieldWriter.writeObject("language", SearchableWhasappTemplatesFilterInput.this.language.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.language.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableWhasappTemplatesFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", SearchableWhasappTemplatesFilterInput.this.category.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.category.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", SearchableWhasappTemplatesFilterInput.this.createdBy.value != 0 ? ((SearchableIDFilterInput) SearchableWhasappTemplatesFilterInput.this.createdBy.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", SearchableWhasappTemplatesFilterInput.this.updatedBy.value != 0 ? ((SearchableIDFilterInput) SearchableWhasappTemplatesFilterInput.this.updatedBy.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.archivedStatus.defined) {
                    inputFieldWriter.writeObject("archivedStatus", SearchableWhasappTemplatesFilterInput.this.archivedStatus.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.archivedStatus.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.defaultMediaId.defined) {
                    inputFieldWriter.writeObject("defaultMediaId", SearchableWhasappTemplatesFilterInput.this.defaultMediaId.value != 0 ? ((SearchableIDFilterInput) SearchableWhasappTemplatesFilterInput.this.defaultMediaId.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.templateId.defined) {
                    inputFieldWriter.writeObject("templateId", SearchableWhasappTemplatesFilterInput.this.templateId.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.templateId.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.lastUsed.defined) {
                    inputFieldWriter.writeObject("lastUsed", SearchableWhasappTemplatesFilterInput.this.lastUsed.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.lastUsed.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.isSample.defined) {
                    inputFieldWriter.writeObject("isSample", SearchableWhasappTemplatesFilterInput.this.isSample.value != 0 ? ((SearchableBooleanFilterInput) SearchableWhasappTemplatesFilterInput.this.isSample.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.text.defined) {
                    inputFieldWriter.writeObject("text", SearchableWhasappTemplatesFilterInput.this.text.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.text.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.headerText.defined) {
                    inputFieldWriter.writeObject("headerText", SearchableWhasappTemplatesFilterInput.this.headerText.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.headerText.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.footerText.defined) {
                    inputFieldWriter.writeObject("footerText", SearchableWhasappTemplatesFilterInput.this.footerText.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.footerText.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableWhasappTemplatesFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableWhasappTemplatesFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableWhasappTemplatesFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableWhasappTemplatesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableWhasappTemplatesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableWhasappTemplatesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableWhasappTemplatesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableWhasappTemplatesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableWhasappTemplatesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableWhasappTemplatesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableWhasappTemplatesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableWhasappTemplatesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableWhasappTemplatesFilterInput.this.not.value != 0 ? ((SearchableWhasappTemplatesFilterInput) SearchableWhasappTemplatesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput messageSubType() {
        return this.messageSubType.value;
    }

    public SearchableStringFilterInput messageType() {
        return this.messageType.value;
    }

    public SearchableStringFilterInput name() {
        return this.name.value;
    }

    public SearchableWhasappTemplatesFilterInput not() {
        return this.not.value;
    }

    public List<SearchableWhasappTemplatesFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput platform() {
        return this.platform.value;
    }

    public SearchableStringFilterInput snippetType() {
        return this.snippetType.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput templateId() {
        return this.templateId.value;
    }

    public SearchableStringFilterInput templateType() {
        return this.templateType.value;
    }

    public SearchableStringFilterInput text() {
        return this.text.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedBy() {
        return this.updatedBy.value;
    }

    public SearchableIDFilterInput whatsappBusinessAccount() {
        return this.whatsappBusinessAccount.value;
    }
}
