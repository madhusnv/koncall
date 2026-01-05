package p001o;

import android.util.Log;
import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.hub.HubSubscriber;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p001o.vre;

/* loaded from: classes.dex */
public final class o58 {

    /* renamed from: b */
    public static final C15713a f37789b = new C15713a(null);

    /* renamed from: c */
    public static final int f37790c = 8;

    /* renamed from: d */
    public static final o58 f37791d = new o58();

    /* renamed from: a */
    public final Set f37792a = new LinkedHashSet();

    /* renamed from: o.o58$a */
    public static final class C15713a {
        public C15713a() {
        }

        public /* synthetic */ C15713a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final o58 m41624a() {
            return o58.f37791d;
        }
    }

    /* renamed from: o.o58$b */
    public /* synthetic */ class C15714b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37793a;

        static {
            int[] iArr = new int[HubChannel.values().length];
            try {
                iArr[HubChannel.ANALYTICS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HubChannel.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HubChannel.AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HubChannel.DATASTORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HubChannel.GEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HubChannel.HUB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HubChannel.LOGGING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HubChannel.PREDICTIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HubChannel.NOTIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HubChannel.STORAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f37793a = iArr;
        }
    }

    /* renamed from: o.o58$c */
    public static final class C15715c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ a58 f37794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15715c(a58 a58Var) {
            super(1);
            this.f37794a = a58Var;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(a58 a58Var) {
            return Boolean.valueOf(sq8.m48644c(a58Var.getClass().getName(), this.f37794a.getClass().getName()));
        }
    }

    /* renamed from: o.o58$d */
    public static final class C15716d extends jgg implements xk7 {

        /* renamed from: a */
        public int f37795a;

        /* renamed from: c */
        public final /* synthetic */ a58 f37797c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15716d(a58 a58Var, n64 n64Var) {
            super(1, n64Var);
            this.f37797c = a58Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return o58.this.new C15716d(this.f37797c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM53351b;
            uq8.m51918f();
            if (this.f37795a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            a58 a58Var = this.f37797c;
            try {
                vre.C17665a c17665a = vre.f50797b;
                a58Var.mo16435b();
                objM53351b = vre.m53351b(y3i.f54824a);
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            return ml1.m39304d(Log.d("hub-manager", "Result of delegating to onLogin: " + vre.m53358i(objM53351b)));
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C15716d) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.o58$e */
    public static final class C15717e extends jgg implements xk7 {

        /* renamed from: a */
        public int f37798a;

        /* renamed from: c */
        public final /* synthetic */ a58 f37800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15717e(a58 a58Var, n64 n64Var) {
            super(1, n64Var);
            this.f37800c = a58Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return o58.this.new C15717e(this.f37800c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM53351b;
            uq8.m51918f();
            if (this.f37798a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            a58 a58Var = this.f37800c;
            try {
                vre.C17665a c17665a = vre.f50797b;
                a58Var.mo16434a();
                objM53351b = vre.m53351b(y3i.f54824a);
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            return ml1.m39304d(Log.d("hub-manager", "Result of delegating to onLogin: " + vre.m53358i(objM53351b)));
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C15717e) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: f */
    public static final boolean m41617f(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* renamed from: h */
    public static final void m41618h(HubEvent hubEvent) {
        sq8.m48649h(hubEvent, "hubEvent");
        String name = hubEvent.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("Auth hub event received of type: ");
        sb.append(name);
        String name2 = hubEvent.getName();
        if (sq8.m48644c(name2, AuthChannelEventName.SIGNED_OUT.toString())) {
            Amplify.Hub.publish(HubChannel.LOGGING, HubEvent.create("LOGOUT"));
            return;
        }
        if (sq8.m48644c(name2, AuthChannelEventName.SIGNED_IN.toString())) {
            Amplify.Hub.publish(HubChannel.LOGGING, HubEvent.create("LOGIN"));
            return;
        }
        if (sq8.m48644c(name2, AuthChannelEventName.SESSION_EXPIRED.toString()) || sq8.m48644c(name2, AuthChannelEventName.USER_DELETED.toString())) {
            return;
        }
        if (sq8.m48644c(name2, "SUCCEEDED")) {
            Amplify.Hub.publish(HubChannel.LOGGING, HubEvent.create("LOGIN"));
        } else if (sq8.m48644c(name2, "FAILED")) {
            Amplify.Hub.publish(HubChannel.LOGGING, HubEvent.create("LOGOUT"));
        }
    }

    /* renamed from: k */
    public static final void m41619k(o58 o58Var, HubEvent hubEvent) {
        sq8.m48649h(o58Var, "this$0");
        sq8.m48649h(hubEvent, "hubEvent");
        StringBuilder sb = new StringBuilder();
        sb.append("Hub event received ");
        sb.append(hubEvent);
        String name = hubEvent.getName();
        int iHashCode = name.hashCode();
        if (iHashCode != -2043999862) {
            if (iHashCode == 72611657 && name.equals("LOGIN")) {
                Iterator it = o58Var.f37792a.iterator();
                while (it.hasNext()) {
                    p74.f39487a.m43079g(o58Var.new C15716d((a58) it.next(), null));
                }
                return;
            }
        } else if (name.equals("LOGOUT")) {
            Iterator it2 = o58Var.f37792a.iterator();
            while (it2.hasNext()) {
                p74.f39487a.m43079g(o58Var.new C15717e((a58) it2.next(), null));
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Received event of type : ");
        sb2.append(hubEvent);
    }

    /* renamed from: e */
    public final void m41620e(a58 a58Var) {
        sq8.m48649h(a58Var, "hubAuthenticationListener");
        Stream stream = this.f37792a.stream();
        final C15715c c15715c = new C15715c(a58Var);
        if (!stream.filter(new Predicate() { // from class: o.l58
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return o58.m41617f(c15715c, obj);
            }
        }).findAny().isPresent()) {
            this.f37792a.add(a58Var);
            return;
        }
        String name = a58Var.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append("Listener type is already registered: ");
        sb.append(name);
    }

    /* renamed from: g */
    public final void m41621g() {
        Amplify.Hub.subscribe(HubChannel.AUTH, new HubSubscriber() { // from class: o.n58
            @Override // com.amplifyframework.hub.HubSubscriber
            public final void onEvent(HubEvent hubEvent) {
                o58.m41618h(hubEvent);
            }
        });
    }

    /* renamed from: i */
    public final void m41622i(HubChannel hubChannel) {
        sq8.m48649h(hubChannel, "hubChannel");
        StringBuilder sb = new StringBuilder();
        sb.append("Registering auth channel of type: ");
        sb.append(hubChannel);
        switch (C15714b.f37793a[hubChannel.ordinal()]) {
            case 1:
                throw new v0c(null, 1, null);
            case 2:
                throw new v0c(null, 1, null);
            case 3:
                m41621g();
                return;
            case 4:
                throw new v0c(null, 1, null);
            case 5:
                throw new v0c(null, 1, null);
            case 6:
                throw new v0c(null, 1, null);
            case 7:
                m41623j();
                return;
            case 8:
                throw new v0c(null, 1, null);
            case 9:
                throw new v0c(null, 1, null);
            case 10:
                throw new v0c(null, 1, null);
            default:
                return;
        }
    }

    /* renamed from: j */
    public final void m41623j() {
        Amplify.Hub.subscribe(HubChannel.LOGGING, new HubSubscriber() { // from class: o.m58
            @Override // com.amplifyframework.hub.HubSubscriber
            public final void onEvent(HubEvent hubEvent) {
                o58.m41619k(this.f34828a, hubEvent);
            }
        });
    }
}
