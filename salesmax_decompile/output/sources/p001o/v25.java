package p001o;

import com.amazonaws.amplify.generated.graphql.CreateDealMutation;
import com.amazonaws.amplify.generated.graphql.CreateDealOnContactMutation;
import com.amazonaws.amplify.generated.graphql.UpdateDealMutation;
import com.amazonaws.amplify.generated.graphql.UpdateDealOnContactMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Deal;
import com.amplifyframework.datastore.generated.model.ProductServiceUnit;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import type.CreateDealInput;
import type.CreateManualDealInput;
import type.DealOutcome;
import type.DealState;
import type.ModelDealConditionInput;
import type.ModelStringInput;
import type.MutationCreateDealOnContactBodyInput;
import type.MutationUpdateDealOnContactBodyInput;
import type.ProductServiceUnitInput;
import type.UpdateDealInput;
import type.UpdateManualDealInput;

/* loaded from: classes.dex */
public interface v25 extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c I9(UpdateManualDealInput updateManualDealInput) {
        return graphqlMutation(UpdateDealOnContactMutation.builder().body(MutationUpdateDealOnContactBodyInput.builder().input(updateManualDealInput).build()).build(), "mutation UpdateDealOnContact($query: MutationUpdateDealOnContactQueryInput, $body: MutationUpdateDealOnContactBodyInput) {\n  updateDealOnContact(query: $query, body: $body)\n}", UpdateDealOnContactMutation.Data.class, new Function() { // from class: o.d15
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateDealOnContactMutation.Data) obj).updateDealOnContact();
            }
        }, String.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c a7(UpdateDealInput updateDealInput) {
        return graphqlMutation(UpdateDealMutation.builder().input(updateDealInput).condition(ModelDealConditionInput.builder().createdAt(ModelStringInput.builder().attributeExists(Boolean.TRUE).build()).build()).build(), "mutation UpdateDeal($input: UpdateDealInput!, $condition: ModelDealConditionInput) {\n  updateDeal(input: $input, condition: $condition) {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      tags\n      recentEngagements\n      lastActivity\n      customDealData\n      dealStageCustomValues {\n         __typename\n         dealStage\n         customValue\n      }\n      createdAt\n      updatedAt\n  }\n}", UpdateDealMutation.Data.class, new Function() { // from class: o.b25
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateDealMutation.Data) obj).updateDeal();
            }
        }, Deal.class);
    }

    static /* synthetic */ ProductServiceUnitInput ic(ProductServiceUnit productServiceUnit) {
        return ProductServiceUnitInput.builder().productId(productServiceUnit.getProductId()).units(productServiceUnit.getUnits()).negotiatedPricePerUnit(productServiceUnit.getNegotiatedPricePerUnit()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c la(CreateDealInput createDealInput) {
        return graphqlMutation(CreateDealMutation.builder().input(createDealInput).build(), "mutation CreateDeal($input: CreateDealInput!, $condition: ModelDealConditionInput) {\n  createDeal(input: $input, condition: $condition) {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      tags\n      recentEngagements\n      lastActivity\n      customDealData\n      dealStageCustomValues {\n         __typename\n         dealStage\n         customValue\n      }\n      createdAt\n      updatedAt\n  }\n}", CreateDealMutation.Data.class, new Function() { // from class: o.o25
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateDealMutation.Data) obj).createDeal();
            }
        }, Deal.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c m5(CreateManualDealInput createManualDealInput) {
        return graphqlMutation(CreateDealOnContactMutation.builder().body(MutationCreateDealOnContactBodyInput.builder().input(createManualDealInput).build()).build(), "mutation CreateDealOnContact($query: MutationCreateDealOnContactQueryInput, $body: MutationCreateDealOnContactBodyInput) {\n  createDealOnContact(query: $query, body: $body)\n}", CreateDealOnContactMutation.Data.class, new Function() { // from class: o.r05
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateDealOnContactMutation.Data) obj).createDealOnContact();
            }
        }, String.class);
    }

    static List rz(List list) {
        return (List) list.stream().map(new Function() { // from class: o.q25
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return v25.ic((ProductServiceUnit) obj);
            }
        }).collect(Collectors.toList());
    }

    default x6c De(final Deal deal) {
        return tn().d0(new rl7() { // from class: o.e15
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f20727a.ek(deal, (String) obj);
            }
        }).m55717M(new rl7() { // from class: o.f15
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f22525a.la((CreateDealInput) obj);
            }
        });
    }

    default x6c Ft(Deal deal) {
        return StringUtils.isBlank(deal.getId()) ? De(deal) : Lo(deal);
    }

    /* renamed from: Kx, reason: merged with bridge method [inline-methods] */
    default UpdateDealInput S9(Deal deal, String str) {
        final UpdateDealInput.Builder builderOwnerId = UpdateDealInput.builder().id(deal.getId()).accountId(on()).ownerId(Eo());
        builderOwnerId.primaryTeamId((String) Optional.ofNullable(deal.getPrimaryTeamId()).orElse(str));
        Optional.ofNullable(deal.getAmount()).ifPresent(new Consumer() { // from class: o.c25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.amount((Double) obj);
            }
        });
        Optional.ofNullable(deal.getDealStage()).ifPresent(new Consumer() { // from class: o.k25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealStage((String) obj);
            }
        });
        Optional.ofNullable(deal.getName()).ifPresent(new Consumer() { // from class: o.l25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.name((String) obj);
            }
        });
        Optional.ofNullable(deal.getDealOutcome()).map(new w15()).map(new x15()).ifPresent(new Consumer() { // from class: o.m25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealOutcome((DealOutcome) obj);
            }
        });
        Optional.ofNullable(deal.getCurrency()).ifPresent(new Consumer() { // from class: o.g25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.currency((String) obj);
            }
        });
        Optional.ofNullable(deal.getDealLostReason()).ifPresent(new Consumer() { // from class: o.n25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealLostReason((String) obj);
            }
        });
        Optional.ofNullable(deal.getDealState()).map(new a25()).map(new k15()).ifPresent(new Consumer() { // from class: o.d25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealState((DealState) obj);
            }
        });
        Optional.ofNullable(deal.getDescription()).ifPresent(new Consumer() { // from class: o.f25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.description((String) obj);
            }
        });
        Optional.ofNullable(deal.getCurrency()).ifPresent(new Consumer() { // from class: o.g25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.currency((String) obj);
            }
        });
        Optional.ofNullable(deal.getDealStageUpdatedAt()).map(new ri()).ifPresent(new Consumer() { // from class: o.h25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealStageUpdatedAt((String) obj);
            }
        });
        Optional.ofNullable(deal.getTags()).ifPresent(new Consumer() { // from class: o.i25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.tags((List) obj);
            }
        });
        Optional.ofNullable(deal.getUnits()).map(new q15()).ifPresent(new Consumer() { // from class: o.j25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.units((List) obj);
            }
        });
        Optional.ofNullable(deal.getUnits()).map(new q15()).ifPresent(new Consumer() { // from class: o.j25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.units((List) obj);
            }
        });
        return builderOwnerId.build();
    }

    /* renamed from: L2, reason: merged with bridge method [inline-methods] */
    default CreateManualDealInput bo(Deal deal, String str, Long l, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        final CreateManualDealInput.Builder builderUserId = CreateManualDealInput.builder().accountId(on()).contactId(str).userId(Eo());
        builderUserId.primaryTeamId((String) Optional.ofNullable(deal.getPrimaryTeamId()).orElse(str6));
        Optional.ofNullable(deal.getAmount()).ifPresent(new Consumer() { // from class: o.e25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.amount((Double) obj);
            }
        });
        Optional.ofNullable(deal.getDealStage()).ifPresent(new Consumer() { // from class: o.r25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.dealStage((String) obj);
            }
        });
        Optional.ofNullable(deal.getCurrency()).ifPresent(new Consumer() { // from class: o.s25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.currency((String) obj);
            }
        });
        Optional.ofNullable(l).map(new ko()).ifPresent(new Consumer() { // from class: o.t25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.nextFollowUpOn((String) obj);
            }
        });
        Optional.ofNullable(str4).ifPresent(new Consumer() { // from class: o.u25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.taskAssigneeTeamId((String) obj);
            }
        });
        Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.n05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.taskAssigneeUserId((String) obj);
            }
        });
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.o05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.taskBody((String) obj);
            }
        });
        Optional.ofNullable(bool).ifPresent(new Consumer() { // from class: o.p05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.transferLead((Boolean) obj);
            }
        });
        Optional.ofNullable(deal.getCustomDealData()).ifPresent(new Consumer() { // from class: o.q05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.customDealData((String) obj);
            }
        });
        Optional.ofNullable(str5).ifPresent(new Consumer() { // from class: o.p25
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.formId((String) obj);
            }
        });
        return builderUserId.build();
    }

    default x6c Lo(final Deal deal) {
        return tn().d0(new rl7() { // from class: o.g15
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f24384a.S9(deal, (String) obj);
            }
        }).m55717M(new rl7() { // from class: o.h15
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f26082a.a7((UpdateDealInput) obj);
            }
        });
    }

    default x6c Ri(final Deal deal, final String str, final Long l, final String str2, final String str3, final String str4, final Boolean bool, final String str5) {
        return tn().d0(new rl7() { // from class: o.m05
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f34577a.bo(deal, str, l, str2, str3, str4, bool, str5, (String) obj);
            }
        }).m55717M(new rl7() { // from class: o.x05
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f53005a.m5((CreateManualDealInput) obj);
            }
        });
    }

    /* renamed from: Vx, reason: merged with bridge method [inline-methods] */
    default CreateDealInput ek(Deal deal, String str) {
        final CreateDealInput.Builder builderOwnerId = CreateDealInput.builder().accountId(on()).ownerId(Eo());
        builderOwnerId.primaryTeamId((String) Optional.ofNullable(deal.getPrimaryTeamId()).orElse(str));
        Optional.ofNullable(deal.getId()).ifPresent(new Consumer() { // from class: o.j15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.id((String) obj);
            }
        });
        Optional.ofNullable(deal.getAmount()).ifPresent(new Consumer() { // from class: o.s15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.amount((Double) obj);
            }
        });
        Optional.ofNullable(deal.getDealStage()).ifPresent(new Consumer() { // from class: o.u15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealStage((String) obj);
            }
        });
        Optional.ofNullable(deal.getName()).ifPresent(new Consumer() { // from class: o.v15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.name((String) obj);
            }
        });
        Optional.ofNullable(deal.getDealOutcome()).map(new w15()).map(new x15()).ifPresent(new Consumer() { // from class: o.y15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealOutcome((DealOutcome) obj);
            }
        });
        Optional.ofNullable(deal.getCurrency()).ifPresent(new Consumer() { // from class: o.n15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.currency((String) obj);
            }
        });
        Optional.ofNullable(deal.getDealLostReason()).ifPresent(new Consumer() { // from class: o.z15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealLostReason((String) obj);
            }
        });
        Optional.ofNullable(deal.getDealState()).map(new a25()).map(new k15()).ifPresent(new Consumer() { // from class: o.l15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealState((DealState) obj);
            }
        });
        Optional.ofNullable(deal.getDescription()).ifPresent(new Consumer() { // from class: o.m15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.description((String) obj);
            }
        });
        Optional.ofNullable(deal.getCurrency()).ifPresent(new Consumer() { // from class: o.n15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.currency((String) obj);
            }
        });
        Optional.ofNullable(deal.getDealStageUpdatedAt()).map(new ri()).ifPresent(new Consumer() { // from class: o.o15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.dealStageUpdatedAt((String) obj);
            }
        });
        Optional.ofNullable(deal.getTags()).ifPresent(new Consumer() { // from class: o.p15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.tags((List) obj);
            }
        });
        Optional.ofNullable(deal.getUnits()).map(new q15()).ifPresent(new Consumer() { // from class: o.r15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.units((List) obj);
            }
        });
        Optional.ofNullable(deal.getUnits()).map(new q15()).ifPresent(new Consumer() { // from class: o.r15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderOwnerId.units((List) obj);
            }
        });
        return builderOwnerId.build();
    }

    default x6c W0(Deal deal, String str, Long l, String str2, String str3, String str4, Boolean bool, String str5) {
        return StringUtils.isBlank(deal.getId()) ? Ri(deal, str, l, str2, str3, str4, bool, str5) : tq(deal, str, l, str2, str3, str4, bool, str5);
    }

    /* renamed from: d4, reason: merged with bridge method [inline-methods] */
    default UpdateManualDealInput Qh(Deal deal, String str, Long l, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        final UpdateManualDealInput.Builder builderUserId = UpdateManualDealInput.builder().accountId(on()).contactId(str).userId(Eo());
        builderUserId.primaryTeamId((String) Optional.ofNullable(deal.getPrimaryTeamId()).orElse(str6));
        builderUserId.dealId(deal.getId());
        Optional.ofNullable(deal.getAmount()).ifPresent(new Consumer() { // from class: o.s05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.amount((Double) obj);
            }
        });
        Optional.ofNullable(deal.getDealStage()).ifPresent(new Consumer() { // from class: o.u05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.dealStage((String) obj);
            }
        });
        Optional.ofNullable(deal.getCurrency()).ifPresent(new Consumer() { // from class: o.v05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.currency((String) obj);
            }
        });
        Optional.ofNullable(l).map(new ko()).ifPresent(new Consumer() { // from class: o.w05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.nextFollowUpOn((String) obj);
            }
        });
        Optional.ofNullable(str4).ifPresent(new Consumer() { // from class: o.y05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.taskAssigneeTeamId((String) obj);
            }
        });
        Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.z05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.taskAssigneeUserId((String) obj);
            }
        });
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.a15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.taskBody((String) obj);
            }
        });
        Optional.ofNullable(bool).ifPresent(new Consumer() { // from class: o.b15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.transferLead((Boolean) obj);
            }
        });
        Optional.ofNullable(deal.getCustomDealData()).ifPresent(new Consumer() { // from class: o.c15
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.customDealData((String) obj);
            }
        });
        Optional.ofNullable(str5).ifPresent(new Consumer() { // from class: o.t05
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUserId.formId((String) obj);
            }
        });
        return builderUserId.build();
    }

    default x6c tq(final Deal deal, final String str, final Long l, final String str2, final String str3, final String str4, final Boolean bool, final String str5) {
        return tn().d0(new rl7() { // from class: o.i15
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f27900a.Qh(deal, str, l, str2, str3, str4, bool, str5, (String) obj);
            }
        }).m55717M(new rl7() { // from class: o.t15
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f46200a.I9((UpdateManualDealInput) obj);
            }
        });
    }
}
