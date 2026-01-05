package p001o;

import android.content.Context;
import androidx.lifecycle.AbstractC2145n;
import com.amazonaws.amplify.generated.graphql.OnUpdateAccountMemberActivityByUserSubscription;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import com.amplifyframework.rx.RxAmplify;
import com.amplifyframework.rx.RxOperations;
import com.apollographql.apollo.api.Subscription;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import p001o.ga1;

/* loaded from: classes.dex */
public final class ga1 {

    /* renamed from: h */
    public static final C13640a f24776h = new C13640a(null);

    /* renamed from: i */
    public static final int f24777i = 8;

    /* renamed from: j */
    public static final ga1 f24778j = new ga1();

    /* renamed from: a */
    public z9b f24779a = new z9b();

    /* renamed from: b */
    public final AtomicBoolean f24780b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Map f24781c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f24782d = new LinkedHashMap();

    /* renamed from: e */
    public volatile lag f24783e;

    /* renamed from: f */
    public final AtomicReference f24784f;

    /* renamed from: g */
    public AbstractC2145n f24785g;

    /* renamed from: o.ga1$a */
    public static final class C13640a {
        public C13640a() {
        }

        public /* synthetic */ C13640a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ga1 m28255a() {
            return ga1.f24778j;
        }
    }

    /* renamed from: o.ga1$b */
    public static final class C13641b extends jgg implements xk7 {

        /* renamed from: a */
        public int f24786a;

        /* renamed from: b */
        public final /* synthetic */ boolean f24787b;

        /* renamed from: c */
        public final /* synthetic */ ga1 f24788c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC2145n f24789d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13641b(boolean z, ga1 ga1Var, AbstractC2145n abstractC2145n, n64 n64Var) {
            super(1, n64Var);
            this.f24787b = z;
            this.f24788c = ga1Var;
            this.f24789d = abstractC2145n;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C13641b(this.f24787b, this.f24788c, this.f24789d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f24786a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            if (this.f24787b) {
                this.f24788c.m28245C(this.f24789d);
            } else {
                this.f24788c.m28251u(this.f24789d);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C13641b) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.ga1$c */
    public static final class C13642c implements ggd {

        /* renamed from: a */
        public final /* synthetic */ Predicate f24790a;

        public C13642c(Predicate predicate) {
            this.f24790a = predicate;
        }

        @Override // p001o.ggd
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(AccountMemberActivity accountMemberActivity) {
            sq8.m48649h(accountMemberActivity, "it");
            return this.f24790a.test(accountMemberActivity);
        }
    }

    /* renamed from: o.ga1$d */
    public static final class C13643d implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ l1 f24791a;

        /* renamed from: b */
        public final /* synthetic */ Function f24792b;

        public C13643d(l1 l1Var, Function function) {
            this.f24791a = l1Var;
            this.f24792b = function;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ryh apply(AccountMemberActivity accountMemberActivity) {
            return uyh.of(this.f24791a, this.f24792b.apply(accountMemberActivity));
        }
    }

    /* renamed from: o.ga1$e */
    public static final class C13644e implements rl7 {

        /* renamed from: b */
        public final /* synthetic */ l1 f24794b;

        public C13644e(l1 l1Var) {
            this.f24794b = l1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountMemberActivity apply(Map map) {
            sq8.m48649h(map, "it");
            return ga1.this.m28250t(this.f24794b, map);
        }
    }

    /* renamed from: o.ga1$f */
    public static final class C13645f extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13645f f24795a = new C13645f();

        public C13645f() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OnUpdateAccountMemberActivityByUserSubscription.OnUpdateAccountMemberActivityByUser invoke(OnUpdateAccountMemberActivityByUserSubscription.Data data) {
            if (data != null) {
                return data.onUpdateAccountMemberActivityByUser();
            }
            return null;
        }
    }

    /* renamed from: o.ga1$g */
    public static final class C13646g extends kf9 implements xk7 {
        public C13646g() {
            super(1);
        }

        /* renamed from: a */
        public final void m28260a(l1 l1Var) {
            ga1.this.f24779a.setValue(l1Var);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m28260a((l1) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.ga1$h */
    public static final class C13647h extends kf9 implements xk7 {
        public C13647h() {
            super(1);
        }

        /* renamed from: a */
        public final void m28261a(l1 l1Var) {
            if (l1Var != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("onNext called for the object to start the registration pipe with ");
                sb.append(l1Var);
                ga1.this.f24783e.mo16560e(l1Var);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m28261a((l1) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.ga1$i */
    public static final class C13648i implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f24798a;

        public C13648i(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f24798a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f24798a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof n9c) && (obj instanceof am7)) {
                return sq8.m48644c(mo37a(), ((am7) obj).mo37a());
            }
            return false;
        }

        public final int hashCode() {
            return mo37a().hashCode();
        }

        @Override // p001o.n9c
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24798a.invoke(obj);
        }
    }

    /* renamed from: o.ga1$j */
    public static final class C13649j implements rl7 {
        public C13649j() {
        }

        /* renamed from: d */
        public static final boolean m28264d(AccountMemberActivity accountMemberActivity) {
            return e9g.m24606x("PLACE_CALL", accountMemberActivity != null ? accountMemberActivity.getInCall() : null, true);
        }

        /* renamed from: e */
        public static final AccountMemberActivity m28265e(AccountMemberActivity accountMemberActivity) {
            return accountMemberActivity;
        }

        @Override // p001o.rl7
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            sq8.m48649h(l1Var, "it");
            return ga1.this.m28254z(l1Var, new Predicate() { // from class: o.ha1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ga1.C13649j.m28264d((AccountMemberActivity) obj);
                }
            }, new Function() { // from class: o.ia1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ga1.C13649j.m28265e((AccountMemberActivity) obj);
                }
            });
        }
    }

    /* renamed from: o.ga1$k */
    public static final class C13650k implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ ob9 f24800a;

        /* renamed from: b */
        public final /* synthetic */ ga1 f24801b;

        /* renamed from: c */
        public final /* synthetic */ rg6 f24802c;

        public C13650k(ob9 ob9Var, ga1 ga1Var, rg6 rg6Var) {
            this.f24800a = ob9Var;
            this.f24801b = ga1Var;
            this.f24802c = rg6Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(ryh ryhVar) {
            sq8.m48649h(ryhVar, "next");
            String simpleName = hb9.m30150a(this.f24800a).getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append("Event received for the listener: ");
            sb.append(simpleName);
            sb.append(" is: ");
            sb.append(ryhVar);
            try {
                boolean z = true;
                ryh ryhVar2 = ryhVar.m47300g() != null && ryhVar.m47301h() != null ? ryhVar : null;
                if (ryhVar2 != null) {
                    rg6 rg6Var = this.f24802c;
                    if (rg6Var != null) {
                        Object objM47301h = ryhVar2.m47301h();
                        sq8.m48646e(objM47301h);
                        Object obj = ((l1) ryhVar2.m47300g()).getContext().get();
                        sq8.m48648g(obj, "get(...)");
                        rg6Var.mo43496b(objM47301h, (Context) obj);
                        return;
                    }
                    return;
                }
                boolean z2 = ryhVar.m47300g() == null;
                if (ryhVar.m47301h() != null) {
                    z = false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Event is not processing. required values are missing with Membership: ");
                sb2.append(z2);
                sb2.append(" and apiService: ");
                sb2.append(z);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: o.ga1$l */
    public static final class C13651l implements gu3 {

        /* renamed from: a */
        public static final C13651l f24803a = new C13651l();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    /* renamed from: o.ga1$m */
    public static final class C13652m implements gu3 {

        /* renamed from: a */
        public static final C13652m f24804a = new C13652m();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        }
    }

    /* renamed from: o.ga1$n */
    public static final class C13653n implements ggd {

        /* renamed from: a */
        public final /* synthetic */ l1 f24805a;

        public C13653n(l1 l1Var) {
            this.f24805a = l1Var;
        }

        @Override // p001o.ggd
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(GraphQLResponse graphQLResponse) {
            return this.f24805a.raiseIfOnlyErrorInResponse(graphQLResponse);
        }
    }

    /* renamed from: o.ga1$o */
    public static final class C13654o implements rl7 {

        /* renamed from: a */
        public static final C13654o f24806a = new C13654o();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object apply(GraphQLResponse graphQLResponse) {
            return graphQLResponse.getData();
        }
    }

    /* renamed from: o.ga1$p */
    public static final class C13655p implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ Function f24807a;

        public C13655p(Function function) {
            this.f24807a = function;
        }

        @Override // p001o.rl7
        public final Object apply(Object obj) {
            return this.f24807a.apply(obj);
        }
    }

    /* renamed from: o.ga1$q */
    public static final class C13656q implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ l1 f24808a;

        /* renamed from: b */
        public final /* synthetic */ Class f24809b;

        public C13656q(l1 l1Var, Class cls) {
            this.f24808a = l1Var;
            this.f24809b = cls;
        }

        @Override // p001o.rl7
        public final Object apply(Object obj) {
            return this.f24808a.sf(obj, this.f24809b);
        }
    }

    /* renamed from: o.ga1$r */
    public static final class C13657r implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ Subscription f24810a;

        public C13657r(Subscription subscription) {
            this.f24810a = subscription;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(su5 su5Var) {
            sq8.m48649h(su5Var, "it");
            String simpleName = this.f24810a.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append("Subscription invoked for ");
            sb.append(simpleName);
        }
    }

    /* renamed from: o.ga1$s */
    public static final class C13658s implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ q7c f24811a;

        public C13658s(q7c q7cVar) {
            this.f24811a = q7cVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (this.f24811a.isDisposed()) {
                return;
            }
            this.f24811a.onError(th);
        }
    }

    /* renamed from: o.ga1$t */
    public static final class C13659t implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ q7c f24812a;

        public C13659t(q7c q7cVar) {
            this.f24812a = q7cVar;
        }

        @Override // p001o.gu3
        public final void accept(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Notification received: ");
            sb.append(obj);
            if (this.f24812a.isDisposed()) {
                return;
            }
            this.f24812a.mo16430e(obj);
        }
    }

    /* renamed from: o.ga1$u */
    public static final class C13660u implements gu3 {

        /* renamed from: a */
        public static final C13660u f24813a = new C13660u();

        /* renamed from: o.ga1$u$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24814a;

            static {
                int[] iArr = new int[RxOperations.RxSubscriptionOperation.ConnectionState.values().length];
                try {
                    iArr[RxOperations.RxSubscriptionOperation.ConnectionState.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f24814a = iArr;
            }
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(RxOperations.RxSubscriptionOperation.ConnectionStateEvent connectionStateEvent) {
            sq8.m48649h(connectionStateEvent, "it");
            if (a.f24814a[connectionStateEvent.getConnectionState().ordinal()] == 1) {
                String subscriptionId = connectionStateEvent.getSubscriptionId();
                StringBuilder sb = new StringBuilder();
                sb.append("Connection connection for id: ");
                sb.append(subscriptionId);
                return;
            }
            String subscriptionId2 = connectionStateEvent.getSubscriptionId();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Connection disconnected for id: ");
            sb2.append(subscriptionId2);
        }
    }

    /* renamed from: o.ga1$v */
    public static final class C13661v implements rl7 {

        /* renamed from: a */
        public static final C13661v f24815a = new C13661v();

        /* renamed from: o.ga1$v$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f24816a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x8c apply(Throwable th) {
                sq8.m48649h(th, "throwable");
                String message = th.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Retrying after error: ");
                sb.append(message);
                return x6c.A0(5L, TimeUnit.SECONDS);
            }
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(x6c x6cVar) {
            sq8.m48649h(x6cVar, "errors");
            return x6cVar.m55717M(a.f24816a);
        }
    }

    public ga1() {
        f3e f3eVarN0 = f3e.N0();
        sq8.m48648g(f3eVarN0, "create(...)");
        this.f24783e = f3eVarN0;
        this.f24784f = new AtomicReference();
    }

    /* renamed from: B */
    public static final OnUpdateAccountMemberActivityByUserSubscription.OnUpdateAccountMemberActivityByUser m28215B(xk7 xk7Var, OnUpdateAccountMemberActivityByUserSubscription.Data data) {
        sq8.m48649h(xk7Var, "$tmp0");
        sq8.m48649h(data, "p0");
        return (OnUpdateAccountMemberActivityByUserSubscription.OnUpdateAccountMemberActivityByUser) xk7Var.invoke(data);
    }

    /* renamed from: D */
    public static final void m28216D(ga1 ga1Var, AbstractC2145n abstractC2145n) {
        sq8.m48649h(ga1Var, "this$0");
        sq8.m48649h(abstractC2145n, "$apiService");
        ga1Var.f24785g = abstractC2145n;
        if (ga1Var.f24779a.hasObservers()) {
            return;
        }
        ga1Var.f24779a.addSource(abstractC2145n, new C13648i(ga1Var.new C13646g()));
        ga1Var.f24779a.observeForever(new C13648i(ga1Var.new C13647h()));
    }

    /* renamed from: F */
    public static final void m28217F() {
    }

    /* renamed from: G */
    public static final void m28218G() {
    }

    /* renamed from: J */
    public static final void m28219J(String str, l1 l1Var, Subscription subscription, Class cls, ga1 ga1Var, Function function, Class cls2, final q7c q7cVar) {
        sq8.m48649h(str, "$queryDocument");
        sq8.m48649h(l1Var, "$apiService");
        sq8.m48649h(subscription, "$query");
        sq8.m48649h(cls, "$graphqlResponseType");
        sq8.m48649h(ga1Var, "this$0");
        sq8.m48649h(function, "$intermediateConverter");
        sq8.m48649h(cls2, "$responseType");
        sq8.m48649h(q7cVar, "emitter");
        final RxOperations.RxSubscriptionOperation rxSubscriptionOperationSubscribe = RxAmplify.API.subscribe(new SimpleGraphQLRequest(str, l1Var.toVariablesMap(subscription), cls, new GsonVariablesSerializer()));
        sq8.m48648g(rxSubscriptionOperationSubscribe, "subscribe(...)");
        sq8.m48648g(rxSubscriptionOperationSubscribe.observeConnectionState().u0(C13660u.f24813a), "subscribe(...)");
        final su5 su5VarV0 = rxSubscriptionOperationSubscribe.observeSubscriptionData().m55714J(new C13653n(l1Var)).d0(C13654o.f24806a).d0(new C13655p(function)).d0(new C13656q(l1Var, cls2)).m55711D(new C13657r(subscription)).m55708A(new C13658s(q7cVar)).m55740x(new jm() { // from class: o.ea1
            @Override // p001o.jm
            public final void run() {
                ga1.m28222M(q7cVar);
            }
        }).m55739w(new jm() { // from class: o.fa1
            @Override // p001o.jm
            public final void run() {
                ga1.m28220K(rxSubscriptionOperationSubscribe);
            }
        }).v0(new C13659t(q7cVar), C13652m.f24804a);
        sq8.m48648g(su5VarV0, "subscribe(...)");
        su5 su5Var = (su5) ga1Var.f24784f.getAndSet(su5VarV0);
        if (su5Var != null && !su5Var.isDisposed() && !sq8.m48644c(su5Var, su5VarV0)) {
            su5Var.dispose();
        }
        q7cVar.mo28140b(new vb2() { // from class: o.w91
            @Override // p001o.vb2
            public final void cancel() {
                ga1.m28221L(su5VarV0);
            }
        });
    }

    /* renamed from: K */
    public static final void m28220K(RxOperations.RxSubscriptionOperation rxSubscriptionOperation) {
        sq8.m48649h(rxSubscriptionOperation, "$subscriptionOperation");
        rxSubscriptionOperation.cancel();
    }

    /* renamed from: L */
    public static final void m28221L(su5 su5Var) {
        sq8.m48649h(su5Var, "$disposable");
        if (su5Var.isDisposed()) {
            return;
        }
        su5Var.dispose();
    }

    /* renamed from: M */
    public static final void m28222M(q7c q7cVar) {
        sq8.m48649h(q7cVar, "$emitter");
        if (q7cVar.isDisposed()) {
            return;
        }
        q7cVar.onComplete();
    }

    /* renamed from: N */
    public static final void m28223N() {
    }

    /* renamed from: v */
    public static final void m28242v(ga1 ga1Var, AbstractC2145n abstractC2145n) {
        sq8.m48649h(ga1Var, "this$0");
        sq8.m48649h(abstractC2145n, "$apiService");
        ga1Var.f24779a.removeSource(abstractC2145n);
    }

    /* renamed from: w */
    public static final void m28243w(ga1 ga1Var, AbstractC2145n abstractC2145n) {
        sq8.m48649h(ga1Var, "this$0");
        sq8.m48649h(abstractC2145n, "$apiService");
        ga1Var.f24779a.removeSource(abstractC2145n);
    }

    /* renamed from: A */
    public final x6c m28244A(l1 l1Var, String str) {
        OnUpdateAccountMemberActivityByUserSubscription onUpdateAccountMemberActivityByUserSubscriptionBuild = OnUpdateAccountMemberActivityByUserSubscription.builder().accountId(l1Var.on()).userId(str).build();
        final C13645f c13645f = C13645f.f24795a;
        sq8.m48646e(onUpdateAccountMemberActivityByUserSubscriptionBuild);
        String strQueryDocument = onUpdateAccountMemberActivityByUserSubscriptionBuild.queryDocument();
        sq8.m48648g(strQueryDocument, "queryDocument(...)");
        x6c x6cVarD0 = m28248I(l1Var, onUpdateAccountMemberActivityByUserSubscriptionBuild, strQueryDocument, OnUpdateAccountMemberActivityByUserSubscription.Data.class, new Function() { // from class: o.ba1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ga1.m28215B(c13645f, (OnUpdateAccountMemberActivityByUserSubscription.Data) obj);
            }
        }, Map.class).d0(new C13644e(l1Var));
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    /* renamed from: C */
    public final void m28245C(final AbstractC2145n abstractC2145n) {
        boolean z = this.f24780b.get();
        StringBuilder sb = new StringBuilder();
        sb.append("Going to register the service with previous state is: ");
        sb.append(z);
        m28246E(kge.m35689b(AccountMemberActivity.class));
        j0f.m33008i(new Runnable() { // from class: o.v91
            @Override // java.lang.Runnable
            public final void run() {
                ga1.m28216D(this.f50026a, abstractC2145n);
            }
        });
    }

    /* renamed from: E */
    public final void m28246E(ob9 ob9Var) {
        su5 su5Var = (su5) this.f24781c.get(hb9.m30150a(ob9Var).getSimpleName());
        Boolean boolValueOf = su5Var != null ? Boolean.valueOf(su5Var.isDisposed()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("Is disposed: ");
        sb.append(boolValueOf);
        m28252x(ob9Var);
        if (sq8.m48644c(hb9.m30150a(ob9Var).getSimpleName(), AccountMemberActivity.class.getSimpleName())) {
            su5 su5VarW0 = this.f24783e.m55717M(new C13649j()).m55741y(new jm() { // from class: o.z91
                @Override // p001o.jm
                public final void run() {
                    ga1.m28217F();
                }
            }).y0(i5f.m31599c()).h0(i5f.m31599c()).w0(new C13650k(ob9Var, this, (rg6) this.f24782d.get(hb9.m30150a(ob9Var))), C13651l.f24803a, new jm() { // from class: o.aa1
                @Override // p001o.jm
                public final void run() {
                    ga1.m28218G();
                }
            });
            sq8.m48648g(su5VarW0, "subscribe(...)");
            Map map = this.f24781c;
            String simpleName = hb9.m30150a(ob9Var).getSimpleName();
            sq8.m48648g(simpleName, "getSimpleName(...)");
            map.put(simpleName, su5VarW0);
        }
    }

    /* renamed from: H */
    public final void m28247H() {
        for (Map.Entry entry : this.f24781c.entrySet()) {
            if (!((su5) entry.getValue()).isDisposed()) {
                ((su5) entry.getValue()).dispose();
                f3e f3eVarN0 = f3e.N0();
                sq8.m48648g(f3eVarN0, "create(...)");
                this.f24783e = f3eVarN0;
            }
        }
    }

    /* renamed from: I */
    public final x6c m28248I(final l1 l1Var, final Subscription subscription, final String str, final Class cls, final Function function, final Class cls2) {
        x6c x6cVarM55741y = x6c.m55706q(new m8c() { // from class: o.ca1
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                ga1.m28219J(str, l1Var, subscription, cls, this, function, cls2, q7cVar);
            }
        }).m0(C13661v.f24815a).m55741y(new jm() { // from class: o.da1
            @Override // p001o.jm
            public final void run() {
                ga1.m28223N();
            }
        });
        sq8.m48648g(x6cVarM55741y, "doOnDispose(...)");
        return x6cVarM55741y;
    }

    /* renamed from: s */
    public final void m28249s(Class cls, rg6 rg6Var) {
        sq8.m48649h(cls, "clazz");
        sq8.m48649h(rg6Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Map map = this.f24782d;
        if (map.get(cls) == null) {
            map.put(cls, rg6Var);
        }
    }

    /* renamed from: t */
    public final AccountMemberActivity m28250t(l1 l1Var, Map map) {
        return (AccountMemberActivity) l1Var.sf(map, AccountMemberActivity.class);
    }

    /* renamed from: u */
    public final void m28251u(final AbstractC2145n abstractC2145n) {
        if (this.f24780b.compareAndSet(true, false)) {
            m28247H();
            j0f.m33008i(new Runnable() { // from class: o.x91
                @Override // java.lang.Runnable
                public final void run() {
                    ga1.m28242v(this.f53374a, abstractC2145n);
                }
            });
        }
        j0f.m33008i(new Runnable() { // from class: o.y91
            @Override // java.lang.Runnable
            public final void run() {
                ga1.m28243w(this.f55079a, abstractC2145n);
            }
        });
    }

    /* renamed from: x */
    public final void m28252x(ob9 ob9Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("disposing observable for class: ");
        sb.append(ob9Var);
        sb.append(".");
        su5 su5Var = (su5) this.f24781c.get(hb9.m30150a(ob9Var).getSimpleName());
        if (su5Var != null) {
            boolean zIsDisposed = su5Var.isDisposed();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("disposing observable for class: ");
            sb2.append(ob9Var);
            sb2.append(". isdisposed: ");
            sb2.append(zIsDisposed);
            if (su5Var.isDisposed()) {
                return;
            }
            su5Var.dispose();
            boolean zIsDisposed2 = su5Var.isDisposed();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("disposing observable for class: ");
            sb3.append(ob9Var);
            sb3.append(". isdisposed: ");
            sb3.append(zIsDisposed2);
            sb3.append(" post dispose call");
            f3e f3eVarN0 = f3e.N0();
            sq8.m48648g(f3eVarN0, "create(...)");
            this.f24783e = f3eVarN0;
        }
    }

    /* renamed from: y */
    public final void m28253y(boolean z, AbstractC2145n abstractC2145n) {
        sq8.m48649h(abstractC2145n, "apiService");
        p74.f39487a.m43079g(new C13641b(z, this, abstractC2145n, null));
    }

    /* renamed from: z */
    public final x6c m28254z(l1 l1Var, Predicate predicate, Function function) {
        String strEo = l1Var.Eo();
        sq8.m48648g(strEo, "getUserId(...)");
        x6c x6cVarD0 = m28244A(l1Var, strEo).m55714J(new C13642c(predicate)).d0(new C13643d(l1Var, function));
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }
}
