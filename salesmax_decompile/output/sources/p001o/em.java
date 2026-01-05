package p001o;

import ai.salesmax.MainActivity;
import ai.salesmax.services.model.RealTimeDataShared;
import android.util.LruCache;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AbstractC2145n;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AccountUpdates;
import com.amplifyframework.datastore.generated.model.ActionType;
import com.amplifyframework.datastore.generated.model.EntityType;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class em {

    /* renamed from: j */
    public static LruCache f21819j = new LruCache(10);

    /* renamed from: k */
    public static final List f21820k = t3c.m49220a(new Object[]{new pe()});

    /* renamed from: l */
    public static em f21821l;

    /* renamed from: a */
    public uni f21822a;

    /* renamed from: b */
    public cz4 f21823b;

    /* renamed from: c */
    public AppCompatActivity f21824c;

    /* renamed from: d */
    public AbstractC2145n f21825d;

    /* renamed from: e */
    public c5f f21826e;

    /* renamed from: f */
    public su5 f21827f;

    /* renamed from: g */
    public su5 f21828g;

    /* renamed from: h */
    public su5 f21829h;

    /* renamed from: i */
    public n9c f21830i;

    /* renamed from: o.em$a */
    public static /* synthetic */ class C13215a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21831a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f21832b;

        static {
            int[] iArr = new int[EntityType.values().length];
            f21832b = iArr;
            try {
                iArr[EntityType.Account.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21832b[EntityType.AccountMembership.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21832b[EntityType.Team.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21832b[EntityType.TeamMembership.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ActionType.values().length];
            f21831a = iArr2;
            try {
                iArr2[ActionType.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21831a[ActionType.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21831a[ActionType.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: n */
    public static synchronized em m25232n(uni uniVar) {
        if (f21821l == null) {
            em emVar = new em();
            f21821l = emVar;
            emVar.m25246m(uniVar);
        }
        return f21821l;
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m25233p(String str, l1 l1Var) {
        return Objects.equals(l1Var.on(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m25234q() {
        ((MainActivity) this.f21824c).e3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m25235r(AccountUpdates accountUpdates) {
        String accountId = accountUpdates.getAccountId();
        ActionType actionType = accountUpdates.getActionType();
        String entityId = accountUpdates.getEntityId();
        int i = C13215a.f21832b[accountUpdates.getEntityType().ordinal()];
        if (i == 1) {
            m25242i(actionType, entityId);
            return;
        }
        if (i == 2) {
            m25243j(accountId, actionType, entityId);
            new ho1().m30871a(AccountMembership.justId(entityId));
        } else if (i == 3) {
            m25244k(accountId, actionType, entityId);
        } else {
            if (i != 4) {
                return;
            }
            m25245l(actionType, entityId);
            Optional.ofNullable((l1) this.f21825d.getValue()).ifPresent(new Consumer() { // from class: o.ul
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((l1) obj).BC();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m25237t(RealTimeDataShared realTimeDataShared, Map map) {
        if (map.isEmpty()) {
            return;
        }
        final List listPopAll = realTimeDataShared.popAll();
        this.f21826e.mo20302c(new Runnable() { // from class: o.sl
            @Override // java.lang.Runnable
            public final void run() {
                this.f45536a.m25236s(listPopAll);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ boolean m25238u(AppCompatActivity appCompatActivity) {
        return this.f21825d.hasActiveObservers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m25239v() {
        this.f21825d.removeObserver(this.f21830i);
    }

    /* renamed from: A */
    public final void m25240A() {
        Optional.ofNullable(this.f21827f).ifPresent(new dpd());
        Optional.ofNullable(this.f21829h).ifPresent(new dpd());
        Optional.ofNullable(this.f21828g).ifPresent(new dpd());
        this.f21827f = null;
        this.f21828g = null;
        f21819j.evictAll();
    }

    /* renamed from: B */
    public final void m25241B() {
        cz4 cz4Var = this.f21823b;
        if (cz4Var != null && cz4Var.z3().hasActiveObservers()) {
            RealTimeDataShared realTimeDataSharedZ3 = this.f21823b.z3();
            realTimeDataSharedZ3.removeObservers(this.f21824c);
            realTimeDataSharedZ3.clear();
        }
        if (this.f21825d != null && this.f21830i != null) {
            j0f.m33008i(new Runnable() { // from class: o.bm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16494a.m25239v();
                }
            });
        }
        m25240A();
    }

    /* renamed from: i */
    public final void m25242i(ActionType actionType, final String str) {
        if (C13215a.f21831a[actionType.ordinal()] != 2) {
            return;
        }
        Optional.of(this.f21825d).map(new Function() { // from class: o.vl
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (l1) ((AbstractC2145n) obj).getValue();
            }
        }).filter(new Predicate() { // from class: o.wl
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return em.m25233p(str, (l1) obj);
            }
        }).map(new Function() { // from class: o.xl
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((l1) obj).CC();
            }
        });
    }

    /* renamed from: j */
    public final void m25243j(String str, ActionType actionType, String str2) {
        int i = C13215a.f21831a[actionType.ordinal()];
        if (i == 1) {
            hci.m30244e(str2);
        } else if (i == 2) {
            hci.m30244e(str2);
        } else {
            if (i != 3) {
                return;
            }
            hci.m30245f(str, str2);
        }
    }

    /* renamed from: k */
    public final void m25244k(String str, ActionType actionType, String str2) {
        int i = C13215a.f21831a[actionType.ordinal()];
        if (i == 1) {
            daa.m22689f(str, str2);
        } else if (i == 2) {
            daa.m22700q(str, str2);
        } else {
            if (i != 3) {
                return;
            }
            daa.m22691h(str, str2);
        }
    }

    /* renamed from: l */
    public final void m25245l(ActionType actionType, String str) {
        int i = C13215a.f21831a[actionType.ordinal()];
        if (i == 1) {
            o4h.m41540D(str);
        } else if (i == 2) {
            o4h.p0(str);
        } else {
            if (i != 3) {
                return;
            }
            o4h.m41544H(str);
        }
    }

    /* renamed from: m */
    public final void m25246m(uni uniVar) {
        this.f21822a = uniVar;
        this.f21825d = uniVar.aC();
        this.f21826e = i5f.m31598b(Executors.newSingleThreadExecutor());
    }

    /* renamed from: o */
    public void m25247o() {
        if (this.f21824c instanceof MainActivity) {
            j0f.m33007h(new Runnable() { // from class: o.cm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18310a.m25234q();
                }
            }, 1000L);
        }
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void m25236s(List list) {
        try {
            String.format("Account updates received %s", ja8.f30035c.toJson(list));
            list.forEach(new Consumer() { // from class: o.tl
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f47360a.m25235r((AccountUpdates) obj);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public void m25249x(AppCompatActivity appCompatActivity) {
        this.f21824c = appCompatActivity;
        n9c n9cVar = new n9c() { // from class: o.am
            @Override // p001o.n9c
            public final void onChanged(Object obj) {
                this.f14934a.m25250y((l1) obj);
            }
        };
        this.f21830i = n9cVar;
        this.f21825d.observe(this.f21824c, n9cVar);
    }

    /* renamed from: y */
    public final void m25250y(l1 l1Var) {
        m25241B();
        m25240A();
        this.f21823b = this.f21822a.bC();
        final RealTimeDataShared realTimeDataSharedZ3 = this.f21823b.z3();
        realTimeDataSharedZ3.observe(this.f21824c, new n9c() { // from class: o.dm
            @Override // p001o.n9c
            public final void onChanged(Object obj) {
                this.f20200a.m25237t(realTimeDataSharedZ3, (Map) obj);
            }
        });
    }

    /* renamed from: z */
    public void m25251z() {
        m25241B();
        Optional optionalFilter = Optional.ofNullable(this.f21824c).filter(new Predicate() { // from class: o.yl
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f55673a.m25238u((AppCompatActivity) obj);
            }
        });
        AbstractC2145n abstractC2145n = this.f21825d;
        Objects.requireNonNull(abstractC2145n);
        optionalFilter.ifPresent(new zl(abstractC2145n));
        this.f21826e.mo20305f();
        this.f21823b = null;
        this.f21822a = null;
        this.f21824c = null;
        this.f21830i = null;
        this.f21825d = null;
        this.f21826e = null;
        f21821l = null;
    }
}
