package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableTemplateGalleryFilterInput implements InputType {
    private final Input<List<SearchableTemplateGalleryFilterInput>> and;
    private final Input<SearchableStringFilterInput> applicableForIndustry;
    private final Input<SearchableStringFilterInput> archivedAt;
    private final Input<SearchableStringFilterInput> archivedStatus;
    private final Input<SearchableStringFilterInput> category;
    private final Input<SearchableStringFilterInput> categoryLevelOne;
    private final Input<SearchableStringFilterInput> categoryLevelTwo;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdBy;
    private final Input<SearchableIDFilterInput> defaultMediaId;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> language;
    private final Input<SearchableStringFilterInput> name;
    private final Input<SearchableTemplateGalleryFilterInput> not;
    private final Input<List<SearchableTemplateGalleryFilterInput>> or;
    private final Input<SearchableStringFilterInput> platform;
    private final Input<SearchableIntFilterInput> savedToWorkspaceTimes;
    private final Input<SearchableIntFilterInput> sentToWhatsappTimes;
    private final Input<SearchableStringFilterInput> status;
    private final Input<SearchableStringFilterInput> tags;
    private final Input<SearchableStringFilterInput> templateId;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedBy;
    private final Input<SearchableIntFilterInput> viewedTimes;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableStringFilterInput> platform = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> language = Input.absent();
        private Input<SearchableStringFilterInput> status = Input.absent();
        private Input<SearchableStringFilterInput> category = Input.absent();
        private Input<SearchableIDFilterInput> createdBy = Input.absent();
        private Input<SearchableIDFilterInput> updatedBy = Input.absent();
        private Input<SearchableStringFilterInput> archivedStatus = Input.absent();
        private Input<SearchableStringFilterInput> archivedAt = Input.absent();
        private Input<SearchableIDFilterInput> defaultMediaId = Input.absent();
        private Input<SearchableStringFilterInput> templateId = Input.absent();
        private Input<SearchableStringFilterInput> tags = Input.absent();
        private Input<SearchableStringFilterInput> categoryLevelOne = Input.absent();
        private Input<SearchableStringFilterInput> categoryLevelTwo = Input.absent();
        private Input<SearchableStringFilterInput> applicableForIndustry = Input.absent();
        private Input<SearchableIntFilterInput> viewedTimes = Input.absent();
        private Input<SearchableIntFilterInput> savedToWorkspaceTimes = Input.absent();
        private Input<SearchableIntFilterInput> sentToWhatsappTimes = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableTemplateGalleryFilterInput>> and = Input.absent();
        private Input<List<SearchableTemplateGalleryFilterInput>> or = Input.absent();
        private Input<SearchableTemplateGalleryFilterInput> not = Input.absent();

        public Builder and(List<SearchableTemplateGalleryFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder applicableForIndustry(SearchableStringFilterInput searchableStringFilterInput) {
            this.applicableForIndustry = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder archivedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.archivedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder archivedStatus(SearchableStringFilterInput searchableStringFilterInput) {
            this.archivedStatus = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableTemplateGalleryFilterInput build() {
            return new SearchableTemplateGalleryFilterInput(this.id, this.platform, this.name, this.language, this.status, this.category, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMediaId, this.templateId, this.tags, this.categoryLevelOne, this.categoryLevelTwo, this.applicableForIndustry, this.viewedTimes, this.savedToWorkspaceTimes, this.sentToWhatsappTimes, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder category(SearchableStringFilterInput searchableStringFilterInput) {
            this.category = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder categoryLevelOne(SearchableStringFilterInput searchableStringFilterInput) {
            this.categoryLevelOne = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder categoryLevelTwo(SearchableStringFilterInput searchableStringFilterInput) {
            this.categoryLevelTwo = Input.fromNullable(searchableStringFilterInput);
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

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder language(SearchableStringFilterInput searchableStringFilterInput) {
            this.language = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableTemplateGalleryFilterInput searchableTemplateGalleryFilterInput) {
            this.not = Input.fromNullable(searchableTemplateGalleryFilterInput);
            return this;
        }

        public Builder or(List<SearchableTemplateGalleryFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder platform(SearchableStringFilterInput searchableStringFilterInput) {
            this.platform = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder savedToWorkspaceTimes(SearchableIntFilterInput searchableIntFilterInput) {
            this.savedToWorkspaceTimes = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder sentToWhatsappTimes(SearchableIntFilterInput searchableIntFilterInput) {
            this.sentToWhatsappTimes = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder status(SearchableStringFilterInput searchableStringFilterInput) {
            this.status = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder tags(SearchableStringFilterInput searchableStringFilterInput) {
            this.tags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder templateId(SearchableStringFilterInput searchableStringFilterInput) {
            this.templateId = Input.fromNullable(searchableStringFilterInput);
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

        public Builder viewedTimes(SearchableIntFilterInput searchableIntFilterInput) {
            this.viewedTimes = Input.fromNullable(searchableIntFilterInput);
            return this;
        }
    }

    public SearchableTemplateGalleryFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableStringFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableIDFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableIntFilterInput> input17, Input<SearchableIntFilterInput> input18, Input<SearchableIntFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<List<SearchableTemplateGalleryFilterInput>> input22, Input<List<SearchableTemplateGalleryFilterInput>> input23, Input<SearchableTemplateGalleryFilterInput> input24) {
        this.id = input;
        this.platform = input2;
        this.name = input3;
        this.language = input4;
        this.status = input5;
        this.category = input6;
        this.createdBy = input7;
        this.updatedBy = input8;
        this.archivedStatus = input9;
        this.archivedAt = input10;
        this.defaultMediaId = input11;
        this.templateId = input12;
        this.tags = input13;
        this.categoryLevelOne = input14;
        this.categoryLevelTwo = input15;
        this.applicableForIndustry = input16;
        this.viewedTimes = input17;
        this.savedToWorkspaceTimes = input18;
        this.sentToWhatsappTimes = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
        this.and = input22;
        this.or = input23;
        this.not = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<SearchableTemplateGalleryFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput applicableForIndustry() {
        return this.applicableForIndustry.value;
    }

    public SearchableStringFilterInput archivedAt() {
        return this.archivedAt.value;
    }

    public SearchableStringFilterInput archivedStatus() {
        return this.archivedStatus.value;
    }

    public SearchableStringFilterInput category() {
        return this.category.value;
    }

    public SearchableStringFilterInput categoryLevelOne() {
        return this.categoryLevelOne.value;
    }

    public SearchableStringFilterInput categoryLevelTwo() {
        return this.categoryLevelTwo.value;
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

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput language() {
        return this.language.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableTemplateGalleryFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableTemplateGalleryFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableTemplateGalleryFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableTemplateGalleryFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.platform.defined) {
                    inputFieldWriter.writeObject("platform", SearchableTemplateGalleryFilterInput.this.platform.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.platform.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableTemplateGalleryFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.language.defined) {
                    inputFieldWriter.writeObject("language", SearchableTemplateGalleryFilterInput.this.language.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.language.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", SearchableTemplateGalleryFilterInput.this.status.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.status.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", SearchableTemplateGalleryFilterInput.this.category.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.category.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", SearchableTemplateGalleryFilterInput.this.createdBy.value != 0 ? ((SearchableIDFilterInput) SearchableTemplateGalleryFilterInput.this.createdBy.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", SearchableTemplateGalleryFilterInput.this.updatedBy.value != 0 ? ((SearchableIDFilterInput) SearchableTemplateGalleryFilterInput.this.updatedBy.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.archivedStatus.defined) {
                    inputFieldWriter.writeObject("archivedStatus", SearchableTemplateGalleryFilterInput.this.archivedStatus.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.archivedStatus.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.archivedAt.defined) {
                    inputFieldWriter.writeObject("archivedAt", SearchableTemplateGalleryFilterInput.this.archivedAt.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.archivedAt.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.defaultMediaId.defined) {
                    inputFieldWriter.writeObject("defaultMediaId", SearchableTemplateGalleryFilterInput.this.defaultMediaId.value != 0 ? ((SearchableIDFilterInput) SearchableTemplateGalleryFilterInput.this.defaultMediaId.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.templateId.defined) {
                    inputFieldWriter.writeObject("templateId", SearchableTemplateGalleryFilterInput.this.templateId.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.templateId.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", SearchableTemplateGalleryFilterInput.this.tags.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.tags.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.categoryLevelOne.defined) {
                    inputFieldWriter.writeObject("categoryLevelOne", SearchableTemplateGalleryFilterInput.this.categoryLevelOne.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.categoryLevelOne.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.categoryLevelTwo.defined) {
                    inputFieldWriter.writeObject("categoryLevelTwo", SearchableTemplateGalleryFilterInput.this.categoryLevelTwo.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.categoryLevelTwo.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.applicableForIndustry.defined) {
                    inputFieldWriter.writeObject("applicableForIndustry", SearchableTemplateGalleryFilterInput.this.applicableForIndustry.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.applicableForIndustry.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.viewedTimes.defined) {
                    inputFieldWriter.writeObject("viewedTimes", SearchableTemplateGalleryFilterInput.this.viewedTimes.value != 0 ? ((SearchableIntFilterInput) SearchableTemplateGalleryFilterInput.this.viewedTimes.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.savedToWorkspaceTimes.defined) {
                    inputFieldWriter.writeObject("savedToWorkspaceTimes", SearchableTemplateGalleryFilterInput.this.savedToWorkspaceTimes.value != 0 ? ((SearchableIntFilterInput) SearchableTemplateGalleryFilterInput.this.savedToWorkspaceTimes.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.sentToWhatsappTimes.defined) {
                    inputFieldWriter.writeObject("sentToWhatsappTimes", SearchableTemplateGalleryFilterInput.this.sentToWhatsappTimes.value != 0 ? ((SearchableIntFilterInput) SearchableTemplateGalleryFilterInput.this.sentToWhatsappTimes.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableTemplateGalleryFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableTemplateGalleryFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableTemplateGalleryFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableTemplateGalleryFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableTemplateGalleryFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableTemplateGalleryFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableTemplateGalleryFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableTemplateGalleryFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableTemplateGalleryFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableTemplateGalleryFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableTemplateGalleryFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableTemplateGalleryFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableTemplateGalleryFilterInput.this.not.value != 0 ? ((SearchableTemplateGalleryFilterInput) SearchableTemplateGalleryFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput name() {
        return this.name.value;
    }

    public SearchableTemplateGalleryFilterInput not() {
        return this.not.value;
    }

    public List<SearchableTemplateGalleryFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput platform() {
        return this.platform.value;
    }

    public SearchableIntFilterInput savedToWorkspaceTimes() {
        return this.savedToWorkspaceTimes.value;
    }

    public SearchableIntFilterInput sentToWhatsappTimes() {
        return this.sentToWhatsappTimes.value;
    }

    public SearchableStringFilterInput status() {
        return this.status.value;
    }

    public SearchableStringFilterInput tags() {
        return this.tags.value;
    }

    public SearchableStringFilterInput templateId() {
        return this.templateId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedBy() {
        return this.updatedBy.value;
    }

    public SearchableIntFilterInput viewedTimes() {
        return this.viewedTimes.value;
    }
}
