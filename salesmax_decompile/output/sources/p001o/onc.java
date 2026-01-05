package p001o;

import ai.salesmax.services.model.ModelDealAssociationConnection;
import com.amazonaws.amplify.generated.graphql.GetDealsByBusinessIdQuery;
import com.amazonaws.amplify.generated.graphql.GetDealsByContactIdQuery;
import com.amazonaws.amplify.generated.graphql.GetDealsByDealIdQuery;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.DealAssociation;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import type.ModelIDKeyConditionInput;

/* loaded from: classes.dex */
public interface onc extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default s47 F2(String str, int i, String str2) {
        return pn(uyh.of(str, "getDealsByContactId"), str2, i);
    }

    static /* synthetic */ List Km(List list) {
        return (List) list.stream().map(new Function() { // from class: o.fnc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DealAssociation) obj).getDeal();
            }
        }).collect(Collectors.toList());
    }

    static ModelDealAssociationConnection V9() {
        return ModelDealAssociationConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    static /* synthetic */ Map ta(String str, Map map) {
        return (Map) map.get(str);
    }

    static /* synthetic */ ryh un(ModelDealAssociationConnection modelDealAssociationConnection) {
        return uyh.of(modelDealAssociationConnection.getItems(), modelDealAssociationConnection.getNextToken());
    }

    static /* synthetic */ RuntimeException vq() {
        return new RuntimeException("Deal id must be specified for query");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelDealAssociationConnection wl(Map map) {
        return (ModelDealAssociationConnection) sf(map, ModelDealAssociationConnection.class);
    }

    default s47 Og(final String str, final int i) {
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.gnc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f25563a.F2(str, i, (String) obj);
            }
        }).m47706n(new rr(), new eh1() { // from class: o.hnc
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                ((List) obj).add((DealAssociation) obj2);
            }
        }).m55026x();
    }

    default SimpleGraphQLRequest Sv(String str, String str2, Optional optional, int i) throws Throwable {
        if (Objects.isNull(str2) && !optional.isPresent()) {
            return null;
        }
        str2.hashCode();
        switch (str2) {
            case "getDealsByBusinessId":
                final GetDealsByBusinessIdQuery.Builder builderAccountId = GetDealsByBusinessIdQuery.builder().accountId(ModelIDKeyConditionInput.builder().eq(on()).build());
                Optional optionalOfNullable = Optional.ofNullable(str);
                Objects.requireNonNull(builderAccountId);
                optionalOfNullable.ifPresent(new Consumer() { // from class: o.nnc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderAccountId.businessId((String) obj);
                    }
                });
                optional.ifPresent(new Consumer() { // from class: o.bnc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderAccountId.nextToken((String) obj);
                    }
                });
                builderAccountId.limit(Integer.valueOf(i));
                GetDealsByBusinessIdQuery getDealsByBusinessIdQueryBuild = builderAccountId.build();
                break;
            case "getDealsByContactId":
                final GetDealsByContactIdQuery.Builder builderAccountId2 = GetDealsByContactIdQuery.builder().accountId(ModelIDKeyConditionInput.builder().eq(on()).build());
                Optional optionalOfNullable2 = Optional.ofNullable(str);
                Objects.requireNonNull(builderAccountId2);
                optionalOfNullable2.ifPresent(new Consumer() { // from class: o.lnc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderAccountId2.contactId((String) obj);
                    }
                });
                optional.ifPresent(new Consumer() { // from class: o.mnc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderAccountId2.nextToken((String) obj);
                    }
                });
                builderAccountId2.limit(Integer.valueOf(i));
                break;
            case "getDealsByDealId":
                Optional.ofNullable(str).orElseThrow(new Supplier() { // from class: o.jnc
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return onc.vq();
                    }
                });
                final GetDealsByDealIdQuery.Builder builderAccountId3 = GetDealsByDealIdQuery.builder().dealId(str).accountId(ModelIDKeyConditionInput.builder().eq(on()).build());
                Objects.requireNonNull(builderAccountId3);
                optional.ifPresent(new Consumer() { // from class: o.knc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderAccountId3.nextToken((String) obj);
                    }
                });
                builderAccountId3.limit(Integer.valueOf(i));
                break;
        }
        return null;
    }

    default s47 ot(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(V9()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.cnc
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f18409a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.dnc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return onc.ta(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.enc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f21961a.wl((Map) obj);
            }
        }).m27845m();
    }

    default s47 pc(String str, int i) {
        return Og(str, i).m47686M(new rl7() { // from class: o.anc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return onc.Km((List) obj);
            }
        });
    }

    default s47 pn(ryh ryhVar, String str, int i) {
        return ot(Sv((String) ryhVar.f44265a, (String) ryhVar.f44266b, Optional.ofNullable(str), i), (String) ryhVar.f44266b).m47686M(new rl7() { // from class: o.inc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return onc.un((ModelDealAssociationConnection) obj);
            }
        });
    }
}
