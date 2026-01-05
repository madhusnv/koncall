package p001o;

import ai.salesmax.services.model.CloudTelephonyAgent;
import ai.salesmax.services.model.CloudTelephonyClickToCallResponse;
import ai.salesmax.services.model.ModelCloudTelephonyAccountConnection;
import ai.salesmax.services.model.ModelCloudTelephonyUserConnection;
import com.amazonaws.amplify.generated.graphql.FetchLiveCallEngagementQuery;
import com.amazonaws.amplify.generated.graphql.GetTelephonyByAccountQuery;
import com.amazonaws.amplify.generated.graphql.GetTelephonyByUserIdQuery;
import com.amazonaws.amplify.generated.graphql.InitiateCloudCallActionMutation;
import com.amplifyframework.datastore.generated.model.CloudTelephonyAccount;
import com.amplifyframework.datastore.generated.model.CloudTelephonyUser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import type.CallDirection;
import type.ModelIDKeyConditionInput;

/* loaded from: classes.dex */
public interface he3 extends me1 {

    /* renamed from: a */
    public static final Map f26729a = qd3.m45109a(new Map.Entry[]{new AbstractMap.SimpleEntry("Servetel", "{\n    \"destination_number\": \"{{customer_number}}\",\n    \"agent_number\": \"{{agent_number}}\",\n    \"caller_id\": \"{{virtual_number}}\",\n    \"async\": 1,\n    \"get_call_id\": 1\n}"), new AbstractMap.SimpleEntry("Callerdesk", "{\n    \"destination_number\": \"{{customer_number}}\",\n    \"agent_number\": \"{{agent_id}}\",\n    \"caller_id\": \"{{virtual_number}}\",\n    \"async\": 1,\n    \"get_call_id\": 1\n}"), new AbstractMap.SimpleEntry("TATATELESERVICES", "{\n    \"destination_number\": \"{{customer_number}}\",\n    \"agent_number\": \"{{agent_id}}\",\n    \"caller_id\": \"{{virtual_number}}\",\n    \"async\": 1,\n    \"get_call_id\": 1\n}")});

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default CloudTelephonyClickToCallResponse Rg(CloudTelephonyAgent cloudTelephonyAgent, String str, InitiateCloudCallActionMutation.Data data) {
        return Ei(data, CallDirection.OUTGOING, cloudTelephonyAgent.getAgentNumber(), cloudTelephonyAgent.getCloudTelephonyProvider(), str);
    }

    static /* synthetic */ boolean Ry(String str, String str2, CloudTelephonyClickToCallResponse cloudTelephonyClickToCallResponse) {
        String.format("Response of click to call for provider %s with agent number %s is %s", str, str2, ja8.f30035c.toJson(cloudTelephonyClickToCallResponse));
        return true;
    }

    static /* synthetic */ ryh b2(ModelCloudTelephonyAccountConnection modelCloudTelephonyAccountConnection) {
        return uyh.of(modelCloudTelephonyAccountConnection.getItems(), modelCloudTelephonyAccountConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default s47 id(String str, String str2, String str3) {
        return Sc(str, str2, str3, 100);
    }

    static /* synthetic */ ryh lf(ModelCloudTelephonyUserConnection modelCloudTelephonyUserConnection) {
        return uyh.of(modelCloudTelephonyUserConnection.getItems(), modelCloudTelephonyUserConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default s47 nz(String str, String str2) {
        return Au(str, str2, 100);
    }

    static /* synthetic */ String uz(Object obj) {
        return obj instanceof Double ? String.valueOf(((Double) obj).longValue()) : String.valueOf(obj);
    }

    default s47 Au(String str, String str2, int i) {
        final GetTelephonyByAccountQuery.Builder builderLimit = GetTelephonyByAccountQuery.builder().accountId(str).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.wd3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.nextToken((String) obj);
            }
        });
        return graphqlQuery(builderLimit.build(), GetTelephonyByAccountQuery.Data.class, new Function() { // from class: o.xd3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetTelephonyByAccountQuery.Data) obj).getTelephonyByAccount();
            }
        }, ModelCloudTelephonyAccountConnection.class).d0(new rl7() { // from class: o.yd3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return he3.b2((ModelCloudTelephonyAccountConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default x6c E3(final CloudTelephonyAgent cloudTelephonyAgent, final String str, final String str2) {
        final String cloudTelephonyProvider = cloudTelephonyAgent.getCloudTelephonyProvider();
        String strLx = lx(cloudTelephonyProvider, qd3.m45109a(new Map.Entry[]{new AbstractMap.SimpleEntry("customer_number", str2), new AbstractMap.SimpleEntry("agent_id", (String) Optional.ofNullable(cloudTelephonyAgent.getAgentId()).orElse("")), new AbstractMap.SimpleEntry("agent_number", (String) Optional.ofNullable(cloudTelephonyAgent.getAgentNumber()).orElse("")), new AbstractMap.SimpleEntry("virtual_number", str)}));
        String.format("Click To Call Requesting %s", strLx);
        InitiateCloudCallActionMutation initiateCloudCallActionMutationBuild = InitiateCloudCallActionMutation.builder().accountId(on()).providerName(cloudTelephonyProvider).action("CLICK_TO_CALL").payload(strLx).build();
        return graphqlMutation(initiateCloudCallActionMutationBuild, initiateCloudCallActionMutationBuild.queryDocument(), InitiateCloudCallActionMutation.Data.class, new Function() { // from class: o.sd3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f45233a.Rg(cloudTelephonyAgent, str2, (InitiateCloudCallActionMutation.Data) obj);
            }
        }, CloudTelephonyClickToCallResponse.class).m55714J(new ggd() { // from class: o.td3
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return he3.Ry(cloudTelephonyProvider, str, (CloudTelephonyClickToCallResponse) obj);
            }
        });
    }

    default CloudTelephonyClickToCallResponse Ei(InitiateCloudCallActionMutation.Data data, CallDirection callDirection, String str, String str2, String str3) {
        Map map = (Map) ja8.f30035c.fromJson(data.initiateCloudCallAction(), Map.class);
        String str4 = (String) Optional.ofNullable(map.get("call_id")).map(new Function() { // from class: o.vd3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f50143a.ac(obj);
            }
        }).orElse("");
        String str5 = (String) Optional.ofNullable(map.get(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)).map(new ppd()).orElse("");
        Boolean bool = (Boolean) Optional.ofNullable(map.get(FirebaseAnalytics.Param.SUCCESS)).map(new ppd()).map(new j1()).orElse(Boolean.FALSE);
        if (!bool.booleanValue()) {
            str5 = String.format("Couldn't place click to call %s", str5);
        }
        CloudTelephonyClickToCallResponse cloudTelephonyClickToCallResponse = new CloudTelephonyClickToCallResponse(bool, str5, str4);
        cloudTelephonyClickToCallResponse.setCallDirection(callDirection);
        cloudTelephonyClickToCallResponse.setAgentNumber(str);
        cloudTelephonyClickToCallResponse.setProviderName(str2);
        cloudTelephonyClickToCallResponse.setCustomerNumber(str3);
        return cloudTelephonyClickToCallResponse;
    }

    default x6c Mo(final String str) {
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.ce3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f17981a.nz(str, (String) obj);
            }
        }).m47707o(new ArrayList(), new eh1() { // from class: o.de3
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                ((ArrayList) obj).add((CloudTelephonyAccount) obj2);
            }
        }).m55027y();
    }

    default s47 Sc(String str, String str2, String str3, int i) {
        final GetTelephonyByUserIdQuery.Builder builderLimit = GetTelephonyByUserIdQuery.builder().accountId(str).userId(ModelIDKeyConditionInput.builder().eq(str2).build()).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(str3);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.ee3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.nextToken((String) obj);
            }
        });
        return graphqlQuery(builderLimit.build(), GetTelephonyByUserIdQuery.Data.class, new Function() { // from class: o.fe3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetTelephonyByUserIdQuery.Data) obj).getTelephonyByUserId();
            }
        }, ModelCloudTelephonyUserConnection.class).d0(new rl7() { // from class: o.ge3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return he3.lf((ModelCloudTelephonyUserConnection) obj);
            }
        }).C0(la1.BUFFER);
    }

    default x6c Va(final String str, final String str2) {
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.ae3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f14561a.id(str, str2, (String) obj);
            }
        }).m47707o(new ArrayList(), new eh1() { // from class: o.be3
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                ((ArrayList) obj).add((CloudTelephonyUser) obj2);
            }
        }).m55027y();
    }

    default String ac(Object obj) {
        return (String) Optional.ofNullable(obj).map(new Function() { // from class: o.zd3
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return he3.uz(obj2);
            }
        }).orElse("");
    }

    default x6c ef(CloudTelephonyUser cloudTelephonyUser, CloudTelephonyAccount cloudTelephonyAccount, String str, String str2, String str3) {
        return yg(cloudTelephonyUser, cloudTelephonyAccount, str, str2, str3, null);
    }

    default String lx(String str, Map map) {
        String strReplaceAll = (String) f26729a.getOrDefault(str, "{\n    \"destination_number\": \"{{customer_number}}\",\n    \"agent_id\": \"{{agent_id}}\",\n    \"agent_number\": \"{{agent_number}}\",\n    \"caller_id\": \"{{virtual_number}}\"\n}");
        for (Map.Entry entry : map.entrySet()) {
            strReplaceAll = strReplaceAll.replaceAll("\\{\\{" + ((String) entry.getKey()) + "\\}\\}", (String) entry.getValue());
        }
        return strReplaceAll;
    }

    default x6c yg(CloudTelephonyUser cloudTelephonyUser, CloudTelephonyAccount cloudTelephonyAccount, String str, String str2, String str3, String str4) {
        return graphqlQuery(new FetchLiveCallEngagementQuery(cloudTelephonyUser.getAgentNumber(), str, cloudTelephonyAccount.getTelephonyNumber(), cloudTelephonyUser.getAccountId(), cloudTelephonyUser.getUserId(), str2, str3, str3, str4), FetchLiveCallEngagementQuery.Data.class, new Function() { // from class: o.ud3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((FetchLiveCallEngagementQuery.Data) obj).fetchLiveCallEngagement();
            }
        }, FetchLiveCallEngagementQuery.FetchLiveCallEngagement.class);
    }
}
