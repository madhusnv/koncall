package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ModelWhasappTemplatesConnection;
import com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery;
import com.amazonaws.amplify.generated.graphql.SearchWhasappTemplatessQuery;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import type.ModelIDInput;
import type.ModelWhasappTemplatesFilterInput;
import type.SearchableBooleanFilterInput;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;
import type.SearchableWhasappTemplatesFilterInput;
import type.SearchableWhasappTemplatesSortInput;
import type.SearchableWhasappTemplatesSortableFields;

/* loaded from: classes.dex */
public interface f8j extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Gv(SearchableWhasappTemplatesFilterInput searchableWhasappTemplatesFilterInput, int i) {
        return new PaginatedTokenResults(new y7j(this), uyh.of(on(), searchableWhasappTemplatesFilterInput), i);
    }

    static /* synthetic */ SearchWhasappTemplatessQuery Sa(SearchWhasappTemplatessQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    static /* synthetic */ Map Vq(String str, Map map) {
        return (Map) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Yu(ModelWhasappTemplatesFilterInput modelWhasappTemplatesFilterInput, int i) {
        return new PaginatedTokenResults(new x7j(this), uyh.of(on(), modelWhasappTemplatesFilterInput), i);
    }

    static /* synthetic */ ryh ga(ModelWhasappTemplatesConnection modelWhasappTemplatesConnection) {
        return uyh.of(modelWhasappTemplatesConnection.getItems(), modelWhasappTemplatesConnection.getNextToken());
    }

    static /* synthetic */ ryh kg(ModelWhasappTemplatesConnection modelWhasappTemplatesConnection) {
        return uyh.of(modelWhasappTemplatesConnection.getItems(), modelWhasappTemplatesConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelWhasappTemplatesConnection te(Map map) {
        return (ModelWhasappTemplatesConnection) sf(map, ModelWhasappTemplatesConnection.class);
    }

    static /* synthetic */ ListWhasappTemplatessQuery wf(ListWhasappTemplatessQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    /* renamed from: J */
    default s47 m26288J(ryh ryhVar, String str, int i) {
        return mn(Qf((String) ryhVar.f44265a, (ModelWhasappTemplatesFilterInput) ryhVar.f44266b, Optional.ofNullable(str), i), "listWhasappTemplatess").m47686M(new rl7() { // from class: o.a8j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return f8j.kg((ModelWhasappTemplatesConnection) obj);
            }
        });
    }

    default SimpleGraphQLRequest Qf(String str, ModelWhasappTemplatesFilterInput modelWhasappTemplatesFilterInput, Optional optional, final int i) {
        if (Objects.isNull(str) && !optional.isPresent()) {
            return null;
        }
        final ListWhasappTemplatessQuery.Builder builderLimit = ListWhasappTemplatessQuery.builder().limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(modelWhasappTemplatesFilterInput);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.u7j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.filter((ModelWhasappTemplatesFilterInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query ListWhasappTemplatess($filter: ModelWhasappTemplatesFilterInput, $limit: Int, $nextToken: String) {\n  listWhasappTemplatess(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n    __typename\n    id\n    accountId\n    whatsappBusinessAccount\n    platform\n    name\n    components {\n       waBody {\n        waText\n        waType\n        waExample\n       }\n       waButton {\n        waText\n        waType\n        waUrl\n        waNumber\n       }\n       waFooter {\n        waText\n        waType\n       }\n       waHeader {\n        waExample\n        waFormat\n        waText\n        waType\n       }\n    }\n    language\n    status\n    category\n    createdBy\n    updatedBy\n    archivedStatus\n    archivedAt\n    defaultMediaId\n    defaultVariableMap {\n      __typename\n      taType\n      variableId\n      mappedObject\n      mappedProperty\n      fallBackValue\n    }\n    templateId\n    tags\n    lastUsed\n    createdAt\n    updatedAt\n    defaultMedia {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    }\n    nextToken\n  }\n}", toVariablesMap((ListWhasappTemplatessQuery) optional.map(new Function() { // from class: o.v7j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f8j.wf(builderLimit, i, (String) obj);
            }
        }).orElse(builderLimit.build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 Rx(final int i) {
        final ModelWhasappTemplatesFilterInput modelWhasappTemplatesFilterInputBuild = ModelWhasappTemplatesFilterInput.builder().accountId(ModelIDInput.builder().eq(on()).build()).build();
        return s47.m47669H(new Callable() { // from class: o.w7j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f51592a.Yu(modelWhasappTemplatesFilterInputBuild, i);
            }
        });
    }

    default SimpleGraphQLRequest io(String str, SearchableWhasappTemplatesFilterInput searchableWhasappTemplatesFilterInput, Optional optional, final int i) {
        if (Objects.isNull(str) && !optional.isPresent()) {
            return null;
        }
        final SearchWhasappTemplatessQuery.Builder builderLimit = SearchWhasappTemplatessQuery.builder().sort(SearchableWhasappTemplatesSortInput.builder().field(SearchableWhasappTemplatesSortableFields.updatedAt).direction(SearchableSortDirection.desc).build()).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(searchableWhasappTemplatesFilterInput);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.b8j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.filter((SearchableWhasappTemplatesFilterInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query SearchWhasappTemplatess($filter: SearchableWhasappTemplatesFilterInput, $sort: SearchableWhasappTemplatesSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchWhasappTemplatess(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n    __typename\n    id\n    accountId\n    whatsappBusinessAccount\n    platform\n    name\n    components {\n       waBody {\n        waText\n        waType\n        waExample\n       }\n       waButton {\n        waText\n        waType\n        waUrl\n        waNumber\n       }\n       waFooter {\n        waText\n        waType\n       }\n       waHeader {\n        waExample\n        waFormat\n        waText\n        waType\n       }\n    }\n    language\n    status\n    category\n    createdBy\n    updatedBy\n    archivedStatus\n    archivedAt\n    defaultMediaId\n    defaultVariableMap {\n      __typename\n      taType\n      variableId\n      mappedObject\n      mappedProperty\n      fallBackValue\n    }\n    templateId\n    tags\n    lastUsed\n    createdAt\n    updatedAt\n    defaultMedia {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    }\n    nextToken\n  }\n}", toVariablesMap((SearchWhasappTemplatessQuery) optional.map(new Function() { // from class: o.c8j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f8j.Sa(builderLimit, i, (String) obj);
            }
        }).orElse(builderLimit.build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 j4(String str, final int i, String str2) {
        SearchableWhasappTemplatesFilterInput.Builder builderIsSample = SearchableWhasappTemplatesFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).status(SearchableStringFilterInput.builder().eq(str).build()).isSample(SearchableBooleanFilterInput.builder().ne(Boolean.TRUE).build());
        if (!StringUtils.isBlank(str2)) {
            String[] strArrSplit = str2.trim().split("\\s+");
            ArrayList arrayList = new ArrayList();
            for (String str3 : strArrSplit) {
                String str4 = "*" + str3 + "*";
                SearchableStringFilterInput searchableStringFilterInputBuild = SearchableStringFilterInput.builder().wildcard(str4).build();
                SearchableStringFilterInput searchableStringFilterInputBuild2 = SearchableStringFilterInput.builder().wildcard(str4).build();
                arrayList.add(SearchableWhasappTemplatesFilterInput.builder().name(searchableStringFilterInputBuild).build());
                arrayList.add(SearchableWhasappTemplatesFilterInput.builder().components__waHeader__waText(searchableStringFilterInputBuild2).build());
                arrayList.add(SearchableWhasappTemplatesFilterInput.builder().components__waBody__waText(searchableStringFilterInputBuild2).build());
                arrayList.add(SearchableWhasappTemplatesFilterInput.builder().components__waFooter__waText(searchableStringFilterInputBuild2).build());
            }
            builderIsSample.or(arrayList);
        }
        final SearchableWhasappTemplatesFilterInput searchableWhasappTemplatesFilterInputBuild = builderIsSample.build();
        return s47.m47669H(new Callable() { // from class: o.s7j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f44913a.Gv(searchableWhasappTemplatesFilterInputBuild, i);
            }
        });
    }

    default s47 mn(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(rq()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.d8j
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f19395a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.e8j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return f8j.Vq(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.t7j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f46607a.te((Map) obj);
            }
        }).m27845m();
    }

    default ModelWhasappTemplatesConnection rq() {
        return ModelWhasappTemplatesConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default s47 yu(ryh ryhVar, String str, int i) {
        return mn(io((String) ryhVar.f44265a, (SearchableWhasappTemplatesFilterInput) ryhVar.f44266b, Optional.ofNullable(str), i), "searchWhasappTemplatess").m47686M(new rl7() { // from class: o.z7j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return f8j.ga((ModelWhasappTemplatesConnection) obj);
            }
        });
    }
}
