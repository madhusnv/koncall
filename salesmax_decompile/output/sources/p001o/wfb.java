package p001o;

import com.amazonaws.amplify.generated.graphql.CreateMissedOpportunitiesMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.MissedOpportunities;
import com.amplifyframework.datastore.generated.model.MissedOpportunityType;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import type.CreateMissedOpportunitiesInput;

/* loaded from: classes.dex */
public interface wfb extends me1 {
    static /* synthetic */ boolean S7(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean a1(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean h1(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean x5(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean zc(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: C */
    default CreateMissedOpportunitiesInput m54331C(MissedOpportunities missedOpportunities) {
        final CreateMissedOpportunitiesInput.Builder builder = CreateMissedOpportunitiesInput.builder();
        builder.accountId(on());
        builder.ownerId(Eo());
        Optional.ofNullable(missedOpportunities.getMissedOpportunityType()).map(new Function() { // from class: o.nfb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MissedOpportunityType) obj).name();
            }
        }).map(new Function() { // from class: o.ufb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return type.MissedOpportunityType.valueOf((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.vfb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.missedOpportunityType((type.MissedOpportunityType) obj);
            }
        });
        Optional.ofNullable(missedOpportunities.getCallLaterDateTime()).map(new ri()).ifPresent(new Consumer() { // from class: o.ifb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.callLaterDateTime((String) obj);
            }
        });
        Optional.ofNullable(missedOpportunities.getContact()).map(new hu2()).filter(new Predicate() { // from class: o.jfb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return wfb.zc((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.kfb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.contactId((String) obj);
            }
        });
        Optional.ofNullable(missedOpportunities.getOwnerId()).filter(new Predicate() { // from class: o.lfb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return wfb.x5((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.mfb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.ownerId((String) obj);
            }
        });
        Optional.ofNullable(missedOpportunities.getPrimaryTeamId()).filter(new Predicate() { // from class: o.ofb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return wfb.S7((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.pfb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.primaryTeamId((String) obj);
            }
        });
        Optional.ofNullable(missedOpportunities.getRelatedEngagement()).map(new pj3()).filter(new Predicate() { // from class: o.qfb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return wfb.a1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.rfb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.relatedEngagementId((String) obj);
            }
        });
        Optional.ofNullable(missedOpportunities.getMessageBody()).filter(new Predicate() { // from class: o.sfb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return wfb.h1((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.tfb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.messageBody((String) obj);
            }
        });
        return builder.build();
    }

    default x6c Fs(MissedOpportunities missedOpportunities) {
        return graphqlMutation(CreateMissedOpportunitiesMutation.builder().input(m54331C(missedOpportunities)).build(), "mutation CreateMissedOpportunities($input: CreateMissedOpportunitiesInput!, $condition: ModelMissedOpportunitiesConditionInput) {\n  createMissedOpportunities(input: $input, condition: $condition) {\n    accountId\n    ownerId\n    primaryTeamId\n    contactId\n    messageBody\n    missedOpportunityType\n    callLaterDateTime\n    relatedEngagementId\n    createdAt\n    updatedAt\n  }\n}", CreateMissedOpportunitiesMutation.Data.class, new Function() { // from class: o.hfb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateMissedOpportunitiesMutation.Data) obj).createMissedOpportunities();
            }
        }, MissedOpportunities.class);
    }
}
