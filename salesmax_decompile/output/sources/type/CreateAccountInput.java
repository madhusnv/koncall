package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateAccountInput implements InputType {
    private final String accountName;
    private final Input<String> billingEmail;
    private final Input<String> businessLogoUrl;
    private final Input<String> createdById;
    private final Input<String> dateFormat;
    private final Input<String> dateTimeViewStyle;
    private final Input<String> defaultCurrency;
    private final Input<String> denomination;
    private final Input<String> industry;
    private final Input<String> nameOfBusiness;
    private final Input<List<String>> productOrService;
    private final Input<String> taxId;
    private final Input<String> taxIdType;
    private final Input<String> timeFormat;
    private final Input<String> timeZone;
    private final Input<String> trialAccountEndDate;
    private final Input<String> website;
    private final Input<List<WorkingHourInput>> workingHours;

    public static final class Builder {
        private String accountName;
        private Input<String> businessLogoUrl = Input.absent();
        private Input<String> dateFormat = Input.absent();
        private Input<String> dateTimeViewStyle = Input.absent();
        private Input<String> defaultCurrency = Input.absent();
        private Input<String> denomination = Input.absent();
        private Input<String> industry = Input.absent();
        private Input<String> nameOfBusiness = Input.absent();
        private Input<String> billingEmail = Input.absent();
        private Input<String> taxId = Input.absent();
        private Input<String> taxIdType = Input.absent();
        private Input<String> trialAccountEndDate = Input.absent();
        private Input<List<String>> productOrService = Input.absent();
        private Input<String> timeFormat = Input.absent();
        private Input<String> timeZone = Input.absent();
        private Input<String> website = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<List<WorkingHourInput>> workingHours = Input.absent();

        public Builder accountName(String str) {
            this.accountName = str;
            return this;
        }

        public Builder billingEmail(String str) {
            this.billingEmail = Input.fromNullable(str);
            return this;
        }

        public CreateAccountInput build() {
            Utils.checkNotNull(this.accountName, "accountName == null");
            return new CreateAccountInput(this.accountName, this.businessLogoUrl, this.dateFormat, this.dateTimeViewStyle, this.defaultCurrency, this.denomination, this.industry, this.nameOfBusiness, this.billingEmail, this.taxId, this.taxIdType, this.trialAccountEndDate, this.productOrService, this.timeFormat, this.timeZone, this.website, this.createdById, this.workingHours);
        }

        public Builder businessLogoUrl(String str) {
            this.businessLogoUrl = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder dateFormat(String str) {
            this.dateFormat = Input.fromNullable(str);
            return this;
        }

        public Builder dateTimeViewStyle(String str) {
            this.dateTimeViewStyle = Input.fromNullable(str);
            return this;
        }

        public Builder defaultCurrency(String str) {
            this.defaultCurrency = Input.fromNullable(str);
            return this;
        }

        public Builder denomination(String str) {
            this.denomination = Input.fromNullable(str);
            return this;
        }

        public Builder industry(String str) {
            this.industry = Input.fromNullable(str);
            return this;
        }

        public Builder nameOfBusiness(String str) {
            this.nameOfBusiness = Input.fromNullable(str);
            return this;
        }

        public Builder productOrService(List<String> list) {
            this.productOrService = Input.fromNullable(list);
            return this;
        }

        public Builder taxId(String str) {
            this.taxId = Input.fromNullable(str);
            return this;
        }

        public Builder taxIdType(String str) {
            this.taxIdType = Input.fromNullable(str);
            return this;
        }

        public Builder timeFormat(String str) {
            this.timeFormat = Input.fromNullable(str);
            return this;
        }

        public Builder timeZone(String str) {
            this.timeZone = Input.fromNullable(str);
            return this;
        }

        public Builder trialAccountEndDate(String str) {
            this.trialAccountEndDate = Input.fromNullable(str);
            return this;
        }

        public Builder website(String str) {
            this.website = Input.fromNullable(str);
            return this;
        }

        public Builder workingHours(List<WorkingHourInput> list) {
            this.workingHours = Input.fromNullable(list);
            return this;
        }
    }

    public CreateAccountInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<List<String>> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<List<WorkingHourInput>> input17) {
        this.accountName = str;
        this.businessLogoUrl = input;
        this.dateFormat = input2;
        this.dateTimeViewStyle = input3;
        this.defaultCurrency = input4;
        this.denomination = input5;
        this.industry = input6;
        this.nameOfBusiness = input7;
        this.billingEmail = input8;
        this.taxId = input9;
        this.taxIdType = input10;
        this.trialAccountEndDate = input11;
        this.productOrService = input12;
        this.timeFormat = input13;
        this.timeZone = input14;
        this.website = input15;
        this.createdById = input16;
        this.workingHours = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountName() {
        return this.accountName;
    }

    public String billingEmail() {
        return this.billingEmail.value;
    }

    public String businessLogoUrl() {
        return this.businessLogoUrl.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String dateFormat() {
        return this.dateFormat.value;
    }

    public String dateTimeViewStyle() {
        return this.dateTimeViewStyle.value;
    }

    public String defaultCurrency() {
        return this.defaultCurrency.value;
    }

    public String denomination() {
        return this.denomination.value;
    }

    public String industry() {
        return this.industry.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountName", CreateAccountInput.this.accountName);
                if (CreateAccountInput.this.businessLogoUrl.defined) {
                    inputFieldWriter.writeString("businessLogoUrl", (String) CreateAccountInput.this.businessLogoUrl.value);
                }
                if (CreateAccountInput.this.dateFormat.defined) {
                    inputFieldWriter.writeString("dateFormat", (String) CreateAccountInput.this.dateFormat.value);
                }
                if (CreateAccountInput.this.dateTimeViewStyle.defined) {
                    inputFieldWriter.writeString("dateTimeViewStyle", (String) CreateAccountInput.this.dateTimeViewStyle.value);
                }
                if (CreateAccountInput.this.defaultCurrency.defined) {
                    inputFieldWriter.writeString("defaultCurrency", (String) CreateAccountInput.this.defaultCurrency.value);
                }
                if (CreateAccountInput.this.denomination.defined) {
                    inputFieldWriter.writeString("denomination", (String) CreateAccountInput.this.denomination.value);
                }
                if (CreateAccountInput.this.industry.defined) {
                    inputFieldWriter.writeString("industry", (String) CreateAccountInput.this.industry.value);
                }
                if (CreateAccountInput.this.nameOfBusiness.defined) {
                    inputFieldWriter.writeString("nameOfBusiness", (String) CreateAccountInput.this.nameOfBusiness.value);
                }
                if (CreateAccountInput.this.billingEmail.defined) {
                    inputFieldWriter.writeString("billingEmail", (String) CreateAccountInput.this.billingEmail.value);
                }
                if (CreateAccountInput.this.taxId.defined) {
                    inputFieldWriter.writeString("taxId", (String) CreateAccountInput.this.taxId.value);
                }
                if (CreateAccountInput.this.taxIdType.defined) {
                    inputFieldWriter.writeString("taxIdType", (String) CreateAccountInput.this.taxIdType.value);
                }
                if (CreateAccountInput.this.trialAccountEndDate.defined) {
                    inputFieldWriter.writeString("trialAccountEndDate", (String) CreateAccountInput.this.trialAccountEndDate.value);
                }
                if (CreateAccountInput.this.productOrService.defined) {
                    inputFieldWriter.writeList("productOrService", CreateAccountInput.this.productOrService.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateAccountInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateAccountInput.this.productOrService.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateAccountInput.this.timeFormat.defined) {
                    inputFieldWriter.writeString("timeFormat", (String) CreateAccountInput.this.timeFormat.value);
                }
                if (CreateAccountInput.this.timeZone.defined) {
                    inputFieldWriter.writeString(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, (String) CreateAccountInput.this.timeZone.value);
                }
                if (CreateAccountInput.this.website.defined) {
                    inputFieldWriter.writeString("website", (String) CreateAccountInput.this.website.value);
                }
                if (CreateAccountInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateAccountInput.this.createdById.value);
                }
                if (CreateAccountInput.this.workingHours.defined) {
                    inputFieldWriter.writeList("workingHours", CreateAccountInput.this.workingHours.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateAccountInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateAccountInput.this.workingHours.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WorkingHourInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public String nameOfBusiness() {
        return this.nameOfBusiness.value;
    }

    public List<String> productOrService() {
        return this.productOrService.value;
    }

    public String taxId() {
        return this.taxId.value;
    }

    public String taxIdType() {
        return this.taxIdType.value;
    }

    public String timeFormat() {
        return this.timeFormat.value;
    }

    public String timeZone() {
        return this.timeZone.value;
    }

    public String trialAccountEndDate() {
        return this.trialAccountEndDate.value;
    }

    public String website() {
        return this.website.value;
    }

    public List<WorkingHourInput> workingHours() {
        return this.workingHours.value;
    }
}
