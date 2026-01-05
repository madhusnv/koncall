package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ActionInteractiveInput implements InputType {
    private final Input<String> actionName;
    private final Input<String> addressCountry;
    private final Input<String> button;
    private final Input<List<ReplyButtonInput>> buttons;
    private final Input<String> catalog_id;
    private final Input<String> ctaUrl;
    private final Input<String> display_text;
    private final Input<String> flow_action;
    private final Input<FlowActionPayloadInput> flow_action_payload;
    private final Input<String> flow_cta;
    private final Input<String> flow_id;
    private final Input<String> flow_message_version;
    private final Input<String> flow_mode;
    private final Input<String> flow_token;
    private final Input<String> product_retailer_id;
    private final Input<List<String>> savedAddresses;
    private final Input<List<SectionInteractiveInput>> sections;

    public static final class Builder {
        private Input<String> actionName = Input.absent();
        private Input<String> display_text = Input.absent();
        private Input<String> ctaUrl = Input.absent();
        private Input<String> addressCountry = Input.absent();
        private Input<List<String>> savedAddresses = Input.absent();
        private Input<String> button = Input.absent();
        private Input<List<ReplyButtonInput>> buttons = Input.absent();
        private Input<String> catalog_id = Input.absent();
        private Input<String> product_retailer_id = Input.absent();
        private Input<List<SectionInteractiveInput>> sections = Input.absent();
        private Input<String> flow_mode = Input.absent();
        private Input<String> flow_message_version = Input.absent();
        private Input<String> flow_token = Input.absent();
        private Input<String> flow_id = Input.absent();
        private Input<String> flow_cta = Input.absent();
        private Input<String> flow_action = Input.absent();
        private Input<FlowActionPayloadInput> flow_action_payload = Input.absent();

        public Builder actionName(String str) {
            this.actionName = Input.fromNullable(str);
            return this;
        }

        public Builder addressCountry(String str) {
            this.addressCountry = Input.fromNullable(str);
            return this;
        }

        public ActionInteractiveInput build() {
            return new ActionInteractiveInput(this.actionName, this.display_text, this.ctaUrl, this.addressCountry, this.savedAddresses, this.button, this.buttons, this.catalog_id, this.product_retailer_id, this.sections, this.flow_mode, this.flow_message_version, this.flow_token, this.flow_id, this.flow_cta, this.flow_action, this.flow_action_payload);
        }

        public Builder button(String str) {
            this.button = Input.fromNullable(str);
            return this;
        }

        public Builder buttons(List<ReplyButtonInput> list) {
            this.buttons = Input.fromNullable(list);
            return this;
        }

        public Builder catalog_id(String str) {
            this.catalog_id = Input.fromNullable(str);
            return this;
        }

        public Builder ctaUrl(String str) {
            this.ctaUrl = Input.fromNullable(str);
            return this;
        }

        public Builder display_text(String str) {
            this.display_text = Input.fromNullable(str);
            return this;
        }

        public Builder flow_action(String str) {
            this.flow_action = Input.fromNullable(str);
            return this;
        }

        public Builder flow_action_payload(FlowActionPayloadInput flowActionPayloadInput) {
            this.flow_action_payload = Input.fromNullable(flowActionPayloadInput);
            return this;
        }

        public Builder flow_cta(String str) {
            this.flow_cta = Input.fromNullable(str);
            return this;
        }

        public Builder flow_id(String str) {
            this.flow_id = Input.fromNullable(str);
            return this;
        }

        public Builder flow_message_version(String str) {
            this.flow_message_version = Input.fromNullable(str);
            return this;
        }

        public Builder flow_mode(String str) {
            this.flow_mode = Input.fromNullable(str);
            return this;
        }

        public Builder flow_token(String str) {
            this.flow_token = Input.fromNullable(str);
            return this;
        }

        public Builder product_retailer_id(String str) {
            this.product_retailer_id = Input.fromNullable(str);
            return this;
        }

        public Builder savedAddresses(List<String> list) {
            this.savedAddresses = Input.fromNullable(list);
            return this;
        }

        public Builder sections(List<SectionInteractiveInput> list) {
            this.sections = Input.fromNullable(list);
            return this;
        }
    }

    public ActionInteractiveInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<List<String>> input5, Input<String> input6, Input<List<ReplyButtonInput>> input7, Input<String> input8, Input<String> input9, Input<List<SectionInteractiveInput>> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<FlowActionPayloadInput> input17) {
        this.actionName = input;
        this.display_text = input2;
        this.ctaUrl = input3;
        this.addressCountry = input4;
        this.savedAddresses = input5;
        this.button = input6;
        this.buttons = input7;
        this.catalog_id = input8;
        this.product_retailer_id = input9;
        this.sections = input10;
        this.flow_mode = input11;
        this.flow_message_version = input12;
        this.flow_token = input13;
        this.flow_id = input14;
        this.flow_cta = input15;
        this.flow_action = input16;
        this.flow_action_payload = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String actionName() {
        return this.actionName.value;
    }

    public String addressCountry() {
        return this.addressCountry.value;
    }

    public String button() {
        return this.button.value;
    }

    public List<ReplyButtonInput> buttons() {
        return this.buttons.value;
    }

    public String catalog_id() {
        return this.catalog_id.value;
    }

    public String ctaUrl() {
        return this.ctaUrl.value;
    }

    public String display_text() {
        return this.display_text.value;
    }

    public String flow_action() {
        return this.flow_action.value;
    }

    public FlowActionPayloadInput flow_action_payload() {
        return this.flow_action_payload.value;
    }

    public String flow_cta() {
        return this.flow_cta.value;
    }

    public String flow_id() {
        return this.flow_id.value;
    }

    public String flow_message_version() {
        return this.flow_message_version.value;
    }

    public String flow_mode() {
        return this.flow_mode.value;
    }

    public String flow_token() {
        return this.flow_token.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ActionInteractiveInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ActionInteractiveInput.this.actionName.defined) {
                    inputFieldWriter.writeString("actionName", (String) ActionInteractiveInput.this.actionName.value);
                }
                if (ActionInteractiveInput.this.display_text.defined) {
                    inputFieldWriter.writeString("display_text", (String) ActionInteractiveInput.this.display_text.value);
                }
                if (ActionInteractiveInput.this.ctaUrl.defined) {
                    inputFieldWriter.writeString("ctaUrl", (String) ActionInteractiveInput.this.ctaUrl.value);
                }
                if (ActionInteractiveInput.this.addressCountry.defined) {
                    inputFieldWriter.writeString("addressCountry", (String) ActionInteractiveInput.this.addressCountry.value);
                }
                if (ActionInteractiveInput.this.savedAddresses.defined) {
                    inputFieldWriter.writeList("savedAddresses", ActionInteractiveInput.this.savedAddresses.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ActionInteractiveInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ActionInteractiveInput.this.savedAddresses.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSJSON, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (ActionInteractiveInput.this.button.defined) {
                    inputFieldWriter.writeString("button", (String) ActionInteractiveInput.this.button.value);
                }
                if (ActionInteractiveInput.this.buttons.defined) {
                    inputFieldWriter.writeList("buttons", ActionInteractiveInput.this.buttons.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ActionInteractiveInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ActionInteractiveInput.this.buttons.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ReplyButtonInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ActionInteractiveInput.this.catalog_id.defined) {
                    inputFieldWriter.writeString("catalog_id", (String) ActionInteractiveInput.this.catalog_id.value);
                }
                if (ActionInteractiveInput.this.product_retailer_id.defined) {
                    inputFieldWriter.writeString("product_retailer_id", (String) ActionInteractiveInput.this.product_retailer_id.value);
                }
                if (ActionInteractiveInput.this.sections.defined) {
                    inputFieldWriter.writeList("sections", ActionInteractiveInput.this.sections.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ActionInteractiveInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ActionInteractiveInput.this.sections.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SectionInteractiveInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ActionInteractiveInput.this.flow_mode.defined) {
                    inputFieldWriter.writeString("flow_mode", (String) ActionInteractiveInput.this.flow_mode.value);
                }
                if (ActionInteractiveInput.this.flow_message_version.defined) {
                    inputFieldWriter.writeString("flow_message_version", (String) ActionInteractiveInput.this.flow_message_version.value);
                }
                if (ActionInteractiveInput.this.flow_token.defined) {
                    inputFieldWriter.writeString("flow_token", (String) ActionInteractiveInput.this.flow_token.value);
                }
                if (ActionInteractiveInput.this.flow_id.defined) {
                    inputFieldWriter.writeString("flow_id", (String) ActionInteractiveInput.this.flow_id.value);
                }
                if (ActionInteractiveInput.this.flow_cta.defined) {
                    inputFieldWriter.writeString("flow_cta", (String) ActionInteractiveInput.this.flow_cta.value);
                }
                if (ActionInteractiveInput.this.flow_action.defined) {
                    inputFieldWriter.writeString("flow_action", (String) ActionInteractiveInput.this.flow_action.value);
                }
                if (ActionInteractiveInput.this.flow_action_payload.defined) {
                    inputFieldWriter.writeObject("flow_action_payload", ActionInteractiveInput.this.flow_action_payload.value != 0 ? ((FlowActionPayloadInput) ActionInteractiveInput.this.flow_action_payload.value).marshaller() : null);
                }
            }
        };
    }

    public String product_retailer_id() {
        return this.product_retailer_id.value;
    }

    public List<String> savedAddresses() {
        return this.savedAddresses.value;
    }

    public List<SectionInteractiveInput> sections() {
        return this.sections.value;
    }
}
