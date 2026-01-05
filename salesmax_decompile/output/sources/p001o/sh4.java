package p001o;

import ai.salesmax.services.model.ModelCustomFormAttachConditionConnection;
import ai.salesmax.services.model.ModelCustomPropertyDefinitionsConnection;
import ai.salesmax.services.model.ModelSubmittedFormValueConnection;
import com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery;
import com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery;
import com.amazonaws.amplify.generated.graphql.SearchCustomFormAttachConditionsQuery;
import com.amazonaws.amplify.generated.graphql.SearchSubmittedFormValuesQuery;
import com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions;
import com.amplifyframework.datastore.generated.model.SubmittedFormValue;
import com.amplifyframework.datastore.generated.model.customFormAttachCondition;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import type.ModelStringKeyConditionInput;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;
import type.SearchableSubmittedFormValueFilterInput;
import type.SearchableSubmittedFormValueSortInput;
import type.SearchableSubmittedFormValueSortableFields;
import type.SearchablecustomFormAttachConditionFilterInput;

/* loaded from: classes.dex */
public interface sh4 extends pj4 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelCustomFormAttachConditionConnection B5(Map map) {
        return (ModelCustomFormAttachConditionConnection) sf((Map) map.get("searchCustomFormAttachConditions"), ModelCustomFormAttachConditionConnection.class);
    }

    static /* synthetic */ SubmittedFormValue Ha() {
        return SubmittedFormValue.justId("");
    }

    static /* synthetic */ ryh U8(ModelCustomPropertyDefinitionsConnection modelCustomPropertyDefinitionsConnection) {
        return uyh.of(modelCustomPropertyDefinitionsConnection.getItems(), modelCustomPropertyDefinitionsConnection.getNextToken());
    }

    static /* synthetic */ SubmittedFormValue Yd(ModelSubmittedFormValueConnection modelSubmittedFormValueConnection) {
        return modelSubmittedFormValueConnection.getItems().stream().findFirst().orElseGet(new Supplier() { // from class: o.nh4
            @Override // java.util.function.Supplier
            public final Object get() {
                return sh4.Ha();
            }
        });
    }

    static /* synthetic */ ryh ai(ModelCustomFormAttachConditionConnection modelCustomFormAttachConditionConnection) {
        return uyh.of(modelCustomFormAttachConditionConnection.getItems(), modelCustomFormAttachConditionConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelCustomPropertyDefinitionsConnection hp(Map map) {
        return (ModelCustomPropertyDefinitionsConnection) sf(map.get("getPropertiesByAccountAndType"), ModelCustomPropertyDefinitionsConnection.class);
    }

    static /* synthetic */ void zq(GetPropertiesByAccountAndTypeQuery.Builder builder, String str) {
        builder.parentObjectType(ModelStringKeyConditionInput.builder().eq(str).build());
    }

    default x6c Du(String str, String str2) {
        return graphqlQuery(SearchSubmittedFormValuesQuery.builder().filter(SearchableSubmittedFormValueFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).formId(SearchableIDFilterInput.builder().eq(str).build()).objectId(SearchableIDFilterInput.builder().eq(str2).build()).build()).sort(SearchableSubmittedFormValueSortInput.builder().field(SearchableSubmittedFormValueSortableFields.createdAt).direction(SearchableSortDirection.desc).build()).limit(1).build(), SearchSubmittedFormValuesQuery.Data.class, new Function() { // from class: o.eh4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((SearchSubmittedFormValuesQuery.Data) obj).searchSubmittedFormValues();
            }
        }, ModelSubmittedFormValueConnection.class).d0(new rl7() { // from class: o.jh4
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sh4.Yd((ModelSubmittedFormValueConnection) obj);
            }
        });
    }

    /* renamed from: Js, reason: merged with bridge method [inline-methods] */
    default s47 Gc(String str, String str2, int i) {
        final GetPropertiesByAccountAndTypeQuery.Builder builderLimit = GetPropertiesByAccountAndTypeQuery.builder().accountId(on()).limit(Integer.valueOf(i));
        Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.ph4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                sh4.zq(builderLimit, (String) obj);
            }
        });
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.qh4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.nextToken((String) obj);
            }
        });
        return graphqlQuery(builderLimit.build(), "query GetPropertiesByAccountAndType($accountId: ID, $parentObjectType: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCustomPropertyDefinitionsFilterInput, $limit: Int, $nextToken: String) {\n  getPropertiesByAccountAndType(accountId: $accountId, parentObjectType: $parentObjectType, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n    __typename\n    id\n    accountId\n    propertyName\n    displayName\n    displayOrder\n    description\n    scalarType\n    isMultiple\n    isArchived\n    parentObjectType\n    isSystemProperty\n    possibleValues {\n      __typename\n      value\n      viewValue\n      otherAttributes\n    }\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n    }\n    nextToken\n  }\n}", Map.class, new Function() { // from class: o.rh4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f43629a.hp((Map) obj);
            }
        }, ModelCustomPropertyDefinitionsConnection.class).d0(new rl7() { // from class: o.fh4
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sh4.U8((ModelCustomPropertyDefinitionsConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default x6c Qb(String str) {
        return gr(str).m47706n(new rr(), new eh1() { // from class: o.kh4
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                ((List) obj).add((customFormAttachCondition) obj2);
            }
        }).m55027y();
    }

    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    default s47 Xn(String str, String str2, int i) {
        SearchCustomFormAttachConditionsQuery.builder().filter(SearchablecustomFormAttachConditionFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).formType(SearchableStringFilterInput.builder().eq(str).build()).build()).limit(Integer.valueOf(i));
        final SearchCustomFormAttachConditionsQuery.Builder builderLimit = SearchCustomFormAttachConditionsQuery.builder().filter(SearchablecustomFormAttachConditionFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).formType(SearchableStringFilterInput.builder().eq(str).build()).build()).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.gh4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.nextToken((String) obj);
            }
        });
        return graphqlQuery(builderLimit.build(), "query SearchCustomFormAttachConditions($filter: SearchablecustomFormAttachConditionFilterInput, $sort: SearchablecustomFormAttachConditionSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCustomFormAttachConditions(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formDefinition{\n    __typename\n    id\n    accountId\n    formName\n    displayName\n    formTitle\n    formSchema {\n      __typename\n      fields {\n        __typename\n        fieldName\n        fieldParentObjectType\n        hintText\n        isHidden\n        isMandatory\n        isViewOnly\n        preSetValue\n        viewType\n        propertyDefinitionId\n        showCondition\n        hideCondition\n      }      stepTitle\n    }\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n      }\n      formType\n      callOutcome\n      visitOutcome\n      taskType\n      taskInputType\n      taskOutcomeType\n      dealStage\n      isDefaultFormForType\n      createdById\n      updatedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", Map.class, new Function() { // from class: o.hh4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f26861a.B5((Map) obj);
            }
        }, ModelCustomFormAttachConditionConnection.class).d0(new rl7() { // from class: o.ih4
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sh4.ai((ModelCustomFormAttachConditionConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default x6c Ym(String str) {
        return f7(str).m47706n(new rr(), new mf4()).m55027y();
    }

    default x6c e1(String str) {
        return graphqlQuery(GetCustomPropertyDefinitionsQuery.builder().id(str).build(), GetCustomPropertyDefinitionsQuery.Data.class, new Function() { // from class: o.lh4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetCustomPropertyDefinitionsQuery.Data) obj).getCustomPropertyDefinitions();
            }
        }, CustomPropertyDefinitions.class);
    }

    default s47 f7(final String str) {
        final int i = 100;
        return k1(new rl7() { // from class: o.oh4
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f38351a.Gc(str, i, (String) obj);
            }
        });
    }

    default s47 gr(final String str) {
        final int i = 100;
        return k1(new rl7() { // from class: o.mh4
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f35469a.Xn(str, i, (String) obj);
            }
        });
    }
}
