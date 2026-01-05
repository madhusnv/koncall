package p001o;

import com.amazonaws.amplify.generated.graphql.CreateWebInitiatedCallMutation;
import com.amazonaws.amplify.generated.graphql.GetWebInitiatedCallQuery;
import com.amazonaws.amplify.generated.graphql.UpdateWebInitiatedCallMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.WebInitiatedCall;
import java.util.Objects;
import java.util.function.Function;
import type.CreateWebInitiatedCallInput;
import type.UpdateWebInitiatedCallInput;

/* loaded from: classes.dex */
public interface s5j extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Sw(String str, String str2, WebInitiatedCall webInitiatedCall) {
        return (Objects.isNull(webInitiatedCall) || StringUtils.isBlank(webInitiatedCall.getCallId())) ? Nv(str, str2) : eu(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default WebInitiatedCall Zj(GetWebInitiatedCallQuery.Data data) {
        return data.getWebInitiatedCall() == null ? WebInitiatedCall.builder().accountId(on()).userId(Eo()).callId("").status("").build() : WebInitiatedCall.builder().accountId(data.getWebInitiatedCall().accountId()).userId(data.getWebInitiatedCall().userId()).callId(data.getWebInitiatedCall().callId()).status(data.getWebInitiatedCall().status()).build();
    }

    default x6c Kj() {
        return graphqlQuery(GetWebInitiatedCallQuery.builder().accountId(on()).userId(Eo()).build(), GetWebInitiatedCallQuery.Data.class, new Function() { // from class: o.q5j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f41332a.Zj((GetWebInitiatedCallQuery.Data) obj);
            }
        }, WebInitiatedCall.class);
    }

    default x6c Mt(final String str, final String str2) {
        return Kj().m55717M(new rl7() { // from class: o.o5j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f37811a.Sw(str, str2, (WebInitiatedCall) obj);
            }
        });
    }

    default x6c Nv(String str, String str2) {
        return graphqlMutation(CreateWebInitiatedCallMutation.builder().input(CreateWebInitiatedCallInput.builder().accountId(on()).userId(Eo()).callId(str).status(str2).build()).build(), CreateWebInitiatedCallMutation.Data.class, new Function() { // from class: o.p5j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateWebInitiatedCallMutation.Data) obj).createWebInitiatedCall();
            }
        }, WebInitiatedCall.class);
    }

    default x6c eu(String str, String str2) {
        return graphqlMutation(UpdateWebInitiatedCallMutation.builder().input(UpdateWebInitiatedCallInput.builder().accountId(on()).userId(Eo()).callId(str).status(str2).build()).build(), UpdateWebInitiatedCallMutation.Data.class, new Function() { // from class: o.r5j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateWebInitiatedCallMutation.Data) obj).updateWebInitiatedCall();
            }
        }, WebInitiatedCall.class);
    }
}
