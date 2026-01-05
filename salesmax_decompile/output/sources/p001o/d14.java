package p001o;

import android.util.Log;
import com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.Contact;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import type.ModelIDKeyConditionInput;

/* loaded from: classes.dex */
public interface d14 extends k04 {
    static /* synthetic */ Map Ad(Map map) {
        return (Map) map.get("getContactByNumber");
    }

    static /* synthetic */ Contact Bt(Map map) {
        return (Contact) ja8.Tu(map, Contact.class);
    }

    static Map D2(final Map map) {
        Optional.ofNullable((Map) map.get("businesses")).ifPresent(new Consumer() { // from class: o.c14
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d14.Dx(map, (Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ void Dx(Map map, Map map2) {
        map.put("businesses", (List) map2.get("items"));
    }

    static /* synthetic */ Contact I1(Map map) {
        return (Contact) ja8.Tu(map, Contact.class);
    }

    static /* synthetic */ Contact Nd(Contact contact) {
        String.format("Found contacts %s", contact.getName());
        return contact;
    }

    static /* synthetic */ Map Oh(List list) {
        return (Map) list.get(0);
    }

    static /* synthetic */ Integer Pk(Contact contact) {
        return Integer.valueOf(Log.i(d14.class.getSimpleName(), String.format("Found contacts %s", contact.getName())));
    }

    static /* synthetic */ List Rj(Map map) {
        return (List) map.get("items");
    }

    static /* synthetic */ List Ze(Map map) {
        return (List) map.get("items");
    }

    static x6c b7(String str, String str2) {
        return ja8.Ji(new SimpleGraphQLRequest("query GetContactByNumber($phoneNumber: AWSPhone, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactNumberFilterInput, $limit: Int, $nextToken: String) {\n  getContactByNumber(phoneNumber: $phoneNumber, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    items {\n      id\n      contactId\n      contact{\n    id\n    ownerId\n    contactNumberDetail {\n      isWhatsappNumber\n      phoneNumber\n    }\n    contactSource\n    profilePhotoUrl\n    emails {\n      email\n    }\n    name\n    activeDealStage\n    userDefinedTags\n    isCustomer\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    unsuccessfulCallAttempts\n    recentEngagements\n    customAttributes\n    lastCalledTime\n    updatedAt\n    latestRemark\n      }\n      doNotTrack\n      contactNumberType\n      phoneNumber\n      doNotTrack\n    }\n    nextToken\n  }\n}", ja8.Ou(GetContactByNumberQuery.builder().accountId(ModelIDKeyConditionInput.builder().eq(str2).build()).phoneNumber(str).limit(1).build().variables()), Map.class, new GsonVariablesSerializer()), 2).m55014i(new ggd() { // from class: o.l04
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return ja8.Nh((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.u04
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return d14.Ad((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.v04
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return d14.Rj((Map) obj);
            }
        }).m27841g(new ggd() { // from class: o.w04
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return d14.oo((List) obj);
            }
        }).m27844k(new rl7() { // from class: o.x04
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return d14.Oh((List) obj);
            }
        }).m27844k(new rl7() { // from class: o.y04
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return d14.en((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.z04
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return d14.D2((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.a14
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return d14.Bt((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.b14
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return d14.Nd((Contact) obj);
            }
        }).m27846n();
    }

    static /* synthetic */ Map en(Map map) {
        return (Map) map.get("contact");
    }

    static /* synthetic */ Map m0(Map map) {
        return (Map) map.get("contact");
    }

    static /* synthetic */ boolean m4(List list) {
        return !list.isEmpty();
    }

    static /* synthetic */ Map ne(List list) {
        return (Map) list.get(0);
    }

    static /* synthetic */ boolean oo(List list) {
        return !list.isEmpty();
    }

    static Optional t5(String str, String str2) {
        Optional optionalZ7 = ja8.z7(new SimpleGraphQLRequest("query GetContactByNumber($phoneNumber: AWSPhone, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactNumberFilterInput, $limit: Int, $nextToken: String) {\n  getContactByNumber(phoneNumber: $phoneNumber, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    items {\n      id\n      contactId\n      contact{\n    id\n    ownerId\n    contactNumberDetail {\n      isWhatsappNumber\n      phoneNumber\n    }\n    contactSource\n    profilePhotoUrl\n    emails {\n      email\n    }\n    name\n    activeDealStage\n    userDefinedTags\n    isCustomer\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    unsuccessfulCallAttempts\n    recentEngagements\n    customAttributes\n    lastCalledTime\n    updatedAt\n    latestRemark\n      }\n      doNotTrack\n      contactNumberType\n      phoneNumber\n      doNotTrack\n    }\n    nextToken\n  }\n}", ja8.Ou(GetContactByNumberQuery.builder().accountId(ModelIDKeyConditionInput.builder().eq(str2).build()).phoneNumber(str).limit(1).build().variables()), Map.class, new GsonVariablesSerializer()));
        if (optionalZ7.isPresent() && ((GraphQLResponse) optionalZ7.get()).hasErrors()) {
            return Optional.empty();
        }
        Optional map = optionalZ7.map(new g04()).map(new Function() { // from class: o.m04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d14.vh((Map) obj);
            }
        }).map(new Function() { // from class: o.n04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d14.Ze((Map) obj);
            }
        }).filter(new Predicate() { // from class: o.o04
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d14.m4((List) obj);
            }
        }).map(new Function() { // from class: o.p04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d14.ne((List) obj);
            }
        }).map(new Function() { // from class: o.q04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d14.m0((Map) obj);
            }
        }).map(new Function() { // from class: o.r04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d14.D2((Map) obj);
            }
        }).map(new Function() { // from class: o.s04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d14.I1((Map) obj);
            }
        });
        map.map(new Function() { // from class: o.t04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d14.Pk((Contact) obj);
            }
        });
        return map;
    }

    static /* synthetic */ Map vh(Map map) {
        return (Map) map.get("getContactByNumber");
    }
}
