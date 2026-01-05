package p001o;

import com.amazonaws.amplify.generated.graphql.CreateCustomFormDefinitionsMutation;
import com.amazonaws.amplify.generated.graphql.CreateCustomPropertyDefinitionsMutation;
import com.amazonaws.amplify.generated.graphql.CreateSubmittedFormValueMutation;
import com.amazonaws.amplify.generated.graphql.UpdateCustomFormDefinitionsMutation;
import com.amazonaws.amplify.generated.graphql.UpdateCustomPropertyDefinitionsMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.CustomFormDefinitions;
import com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions;
import com.amplifyframework.datastore.generated.model.CustomPropertyOptions;
import com.amplifyframework.datastore.generated.model.Fields;
import com.amplifyframework.datastore.generated.model.FormStepSchema;
import com.amplifyframework.datastore.generated.model.SubmittedFormValue;
import com.amplifyframework.datastore.generated.model.User;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import type.CreateCustomFormDefinitionsInput;
import type.CreateCustomPropertyDefinitionsInput;
import type.CreateSubmittedFormValueInput;
import type.CustomPropertyOptionsInput;
import type.FieldsInput;
import type.FormStepSchemaInput;
import type.UpdateCustomFormDefinitionsInput;
import type.UpdateCustomPropertyDefinitionsInput;

/* loaded from: classes.dex */
public interface ah4 extends me1 {
    static /* synthetic */ Map F6(Map map) {
        return (Map) map.get("createCustomFormDefinitions");
    }

    static CreateSubmittedFormValueInput Lb(String str, String str2, SubmittedFormValue submittedFormValue) {
        return CreateSubmittedFormValueInput.builder().accountId(str).formId(submittedFormValue.getFormDefinition().getId()).value(submittedFormValue.getValue()).contactId(submittedFormValue.getContactId()).objectId(submittedFormValue.getObjectId()).extensionOfObject(submittedFormValue.getExtensionOfObject()).extensionOfProperty(submittedFormValue.getExtensionOfProperty()).submittedBy(str2).submittedByIdType(User.class.getSimpleName()).build();
    }

    static List Ok(List list) {
        return (List) list.stream().map(new Function() { // from class: o.kg4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ah4.Vg((CustomPropertyOptions) obj);
            }
        }).collect(Collectors.toList());
    }

    static UpdateCustomPropertyDefinitionsInput Q1(String str, String str2, CustomPropertyDefinitions customPropertyDefinitions) {
        final UpdateCustomPropertyDefinitionsInput.Builder builder = UpdateCustomPropertyDefinitionsInput.builder();
        builder.accountId(str);
        builder.id(customPropertyDefinitions.getId());
        Optional.ofNullable(customPropertyDefinitions.getParentObjectType()).ifPresent(new Consumer() { // from class: o.of4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.parentObjectType((String) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getDescription()).ifPresent(new Consumer() { // from class: o.pf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.description((String) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getDisplayName()).ifPresent(new Consumer() { // from class: o.qf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.displayName((String) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getIsSystemProperty()).ifPresent(new Consumer() { // from class: o.rf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isSystemProperty((Boolean) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getIsMultiple()).ifPresent(new Consumer() { // from class: o.sf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isMultiple((Boolean) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getPossibleValues()).map(new tf4()).ifPresent(new Consumer() { // from class: o.uf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.possibleValues((List) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getPropertyName()).ifPresent(new Consumer() { // from class: o.vf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.propertyName((String) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getScalarType()).ifPresent(new Consumer() { // from class: o.wf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.scalarType((String) obj);
            }
        });
        builder.updaedById(str2);
        return builder.build();
    }

    static FieldsInput S4(Fields fields) {
        final FieldsInput.Builder builder = FieldsInput.builder();
        Optional optionalOfNullable = Optional.ofNullable(fields.getFieldName());
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.lg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.fieldName((String) obj);
            }
        });
        Optional.ofNullable(fields.getFieldParentObjectType()).ifPresent(new Consumer() { // from class: o.mg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.fieldParentObjectType((String) obj);
            }
        });
        Optional.ofNullable(fields.getHintText()).ifPresent(new Consumer() { // from class: o.ng4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.hintText((String) obj);
            }
        });
        Optional.ofNullable(fields.getIsMandatory()).ifPresent(new Consumer() { // from class: o.og4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isMandatory((Boolean) obj);
            }
        });
        Optional.ofNullable(fields.getIsViewOnly()).ifPresent(new Consumer() { // from class: o.pg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isViewOnly((Boolean) obj);
            }
        });
        Optional.ofNullable(fields.getPreSetValue()).ifPresent(new Consumer() { // from class: o.qg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.preSetValue((String) obj);
            }
        });
        Optional.ofNullable(fields.getViewType()).ifPresent(new Consumer() { // from class: o.rg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.viewType((String) obj);
            }
        });
        Optional.ofNullable(fields.getShowCondition()).ifPresent(new Consumer() { // from class: o.sg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.showCondition((String) obj);
            }
        });
        Optional.ofNullable(fields.getHideCondition()).ifPresent(new Consumer() { // from class: o.ug4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.hideCondition((String) obj);
            }
        });
        return builder.build();
    }

    static CreateCustomPropertyDefinitionsInput St(String str, String str2, CustomPropertyDefinitions customPropertyDefinitions) {
        final CreateCustomPropertyDefinitionsInput.Builder builder = CreateCustomPropertyDefinitionsInput.builder();
        builder.accountId(str);
        Optional.ofNullable(customPropertyDefinitions.getParentObjectType()).ifPresent(new Consumer() { // from class: o.yf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.parentObjectType((String) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getDescription()).ifPresent(new Consumer() { // from class: o.zf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.description((String) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getDisplayName()).ifPresent(new Consumer() { // from class: o.ag4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.displayName((String) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getIsSystemProperty()).ifPresent(new Consumer() { // from class: o.bg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isSystemProperty(((Boolean) obj).booleanValue());
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getIsMultiple()).ifPresent(new Consumer() { // from class: o.cg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.isMultiple((Boolean) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getPossibleValues()).map(new tf4()).ifPresent(new Consumer() { // from class: o.dg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.possibleValues((List) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getPropertyName()).ifPresent(new Consumer() { // from class: o.eg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.propertyName((String) obj);
            }
        });
        Optional.ofNullable(customPropertyDefinitions.getScalarType()).ifPresent(new Consumer() { // from class: o.fg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.scalarType((String) obj);
            }
        });
        builder.createdById(str2);
        builder.updaedById(str2);
        return builder.build();
    }

    static CustomPropertyOptionsInput Vg(CustomPropertyOptions customPropertyOptions) {
        return CustomPropertyOptionsInput.builder().value(customPropertyOptions.getValue()).viewValue(customPropertyOptions.getViewValue()).otherAttributes(customPropertyOptions.getOtherAttributes()).build();
    }

    static FormStepSchemaInput c2(FormStepSchema formStepSchema) {
        final FormStepSchemaInput.Builder builder = FormStepSchemaInput.builder();
        List list = (List) formStepSchema.getFields().stream().map(new Function() { // from class: o.gg4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ah4.S4((Fields) obj);
            }
        }).collect(Collectors.toList());
        Optional optionalOfNullable = Optional.ofNullable(formStepSchema.getStepTitle());
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.hg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.stepTitle((String) obj);
            }
        });
        Optional.ofNullable(list).ifPresent(new Consumer() { // from class: o.jg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.fields((List) obj);
            }
        });
        return builder.build();
    }

    static UpdateCustomFormDefinitionsInput gs(String str, String str2, CustomFormDefinitions customFormDefinitions) {
        final UpdateCustomFormDefinitionsInput.Builder builder = UpdateCustomFormDefinitionsInput.builder();
        builder.accountId(str);
        builder.id(customFormDefinitions.getId());
        Optional.ofNullable(customFormDefinitions.getDisplayName()).ifPresent(new Consumer() { // from class: o.ff4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.displayName((String) obj);
            }
        });
        Optional.ofNullable(customFormDefinitions.getFormName()).ifPresent(new Consumer() { // from class: o.gf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.formName((String) obj);
            }
        });
        Optional.ofNullable(customFormDefinitions.getFormTitle()).ifPresent(new Consumer() { // from class: o.hf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.formTitle((String) obj);
            }
        });
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.if4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.createdById((String) obj);
            }
        });
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.jf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.updaedById((String) obj);
            }
        });
        Optional.ofNullable(customFormDefinitions.getFormSchema()).map(new df4()).ifPresent(new Consumer() { // from class: o.kf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.formSchema((List) obj);
            }
        });
        return builder.build();
    }

    static CreateCustomFormDefinitionsInput hh(String str, String str2, CustomFormDefinitions customFormDefinitions) {
        final CreateCustomFormDefinitionsInput.Builder builder = CreateCustomFormDefinitionsInput.builder();
        builder.accountId(str);
        Optional.ofNullable(customFormDefinitions.getDisplayName()).ifPresent(new Consumer() { // from class: o.wg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.displayName((String) obj);
            }
        });
        Optional.ofNullable(customFormDefinitions.getFormName()).ifPresent(new Consumer() { // from class: o.xg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.formName((String) obj);
            }
        });
        Optional.ofNullable(customFormDefinitions.getFormTitle()).ifPresent(new Consumer() { // from class: o.yg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.formTitle((String) obj);
            }
        });
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.zg4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.createdById((String) obj);
            }
        });
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.cf4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.updaedById((String) obj);
            }
        });
        Optional.ofNullable(customFormDefinitions.getFormSchema()).map(new df4()).ifPresent(new Consumer() { // from class: o.ef4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.formSchema((List) obj);
            }
        });
        return builder.build();
    }

    static /* synthetic */ Map op(Map map) {
        return (Map) map.get("updateCustomFormDefinitions");
    }

    static List ww(List list) {
        return (List) list.stream().map(new Function() { // from class: o.lf4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ah4.c2((FormStepSchema) obj);
            }
        }).collect(Collectors.toList());
    }

    default x6c Cq(CustomPropertyDefinitions customPropertyDefinitions) {
        return graphqlMutation(UpdateCustomPropertyDefinitionsMutation.builder().input(Q1(on(), Eo(), customPropertyDefinitions)).build(), UpdateCustomPropertyDefinitionsMutation.Data.class, new Function() { // from class: o.vg4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateCustomPropertyDefinitionsMutation.Data) obj).updateCustomPropertyDefinitions();
            }
        }, CustomPropertyDefinitions.class);
    }

    default x6c O7(CustomPropertyDefinitions customPropertyDefinitions) {
        return graphqlMutation(CreateCustomPropertyDefinitionsMutation.builder().input(St(on(), Eo(), customPropertyDefinitions)).build(), CreateCustomPropertyDefinitionsMutation.Data.class, new Function() { // from class: o.tg4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateCustomPropertyDefinitionsMutation.Data) obj).createCustomPropertyDefinitions();
            }
        }, CustomPropertyDefinitions.class);
    }

    default x6c Uk(CustomPropertyDefinitions customPropertyDefinitions) {
        return StringUtils.isBlank(customPropertyDefinitions.getId()) ? O7(customPropertyDefinitions) : Cq(customPropertyDefinitions);
    }

    default x6c Vu(List list) {
        return x6c.e0((Iterable) list.stream().map(new Function() { // from class: o.bf4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f16084a.Uk((CustomPropertyDefinitions) obj);
            }
        }).collect(Collectors.toList())).m55732l(new rr(), new mf4()).m55027y();
    }

    default x6c Wi(CustomFormDefinitions customFormDefinitions) {
        return StringUtils.isBlank(customFormDefinitions.getId()) ? Zt(customFormDefinitions) : lq(customFormDefinitions);
    }

    default x6c X4(SubmittedFormValue submittedFormValue) {
        return graphqlMutation(CreateSubmittedFormValueMutation.builder().input(Lb(on(), Eo(), submittedFormValue)).build(), CreateSubmittedFormValueMutation.Data.class, new Function() { // from class: o.nf4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateSubmittedFormValueMutation.Data) obj).createSubmittedFormValue();
            }
        }, SubmittedFormValue.class);
    }

    default x6c Zt(CustomFormDefinitions customFormDefinitions) {
        return graphqlMutation(CreateCustomFormDefinitionsMutation.builder().input(hh(on(), Eo(), customFormDefinitions)).build(), "mutation CreateCustomFormDefinitions($input: CreateCustomFormDefinitionsInput!, $condition: ModelCustomFormDefinitionsConditionInput) {\n  createCustomFormDefinitions(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formName\n    displayName\n    formTitle\n    formSchema {\n      __typename\n      fields {\n        __typename\n        fieldName\n        fieldParentObjectType\n        hintText\n        isHidden\n        isMandatory\n        isViewOnly\n        preSetValue\n        viewType\n        propertyDefinitionId\n        showCondition\n        hideCondition\n      }      stepTitle\n    }\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n  }\n}", Map.class, new Function() { // from class: o.ig4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ah4.F6((Map) obj);
            }
        }, CustomFormDefinitions.class);
    }

    default x6c lq(CustomFormDefinitions customFormDefinitions) {
        return graphqlMutation(UpdateCustomFormDefinitionsMutation.builder().input(gs(on(), Eo(), customFormDefinitions)).build(), "mutation UpdateCustomFormDefinitions($input: UpdateCustomFormDefinitionsInput!, $condition: ModelCustomFormDefinitionsConditionInput) {\n  updateCustomFormDefinitions(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    formName\n    displayName\n    formTitle\n    formSchema {\n      __typename\n      fields {\n        __typename\n        fieldName\n        fieldParentObjectType\n        hintText\n        isHidden\n        isMandatory\n        isViewOnly\n        preSetValue\n        viewType\n        propertyDefinitionId\n        showCondition\n        hideCondition\n      }      stepTitle\n    }\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n  }\n}", Map.class, new Function() { // from class: o.xf4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ah4.op((Map) obj);
            }
        }, CustomFormDefinitions.class);
    }
}
