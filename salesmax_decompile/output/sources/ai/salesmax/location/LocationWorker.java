package ai.salesmax.location;

import ai.salesmax.location.LocationWorker;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.datastore.generated.model.ActivityLocation;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import p001o.gu3;
import p001o.h4e;
import p001o.i5f;
import p001o.id5;
import p001o.ke1;
import p001o.kf9;
import p001o.l1;
import p001o.mbj;
import p001o.mii;
import p001o.n64;
import p001o.q83;
import p001o.rl7;
import p001o.sq8;
import p001o.uni;
import p001o.vha;
import p001o.x6c;
import p001o.x8c;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LocationWorker extends CoroutineWorker {
    private static final String TAG = "location-worker";
    private final Context context;
    private final WorkerParameters workerParameters;
    public static final C0083a Companion = new C0083a(null);
    public static final int $stable = 8;

    /* renamed from: ai.salesmax.location.LocationWorker$a */
    public static final class C0083a {
        public C0083a() {
        }

        public /* synthetic */ C0083a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.location.LocationWorker$b */
    public static final class C0084b implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ l1 f326a;

        /* renamed from: b */
        public final /* synthetic */ vha f327b;

        public C0084b(l1 l1Var, vha vhaVar) {
            this.f326a = l1Var;
            this.f327b = vhaVar;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(Optional optional) {
            sq8.m48649h(optional, "it");
            return this.f326a.b9(this.f327b);
        }
    }

    /* renamed from: ai.salesmax.location.LocationWorker$c */
    public static final class C0085c implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ ke1 f328a;

        /* renamed from: b */
        public final /* synthetic */ vha f329b;

        public C0085c(ke1 ke1Var, vha vhaVar) {
            this.f328a = ke1Var;
            this.f329b = vhaVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(ActivityLocation activityLocation) {
            sq8.m48649h(activityLocation, "it");
            ke1 ke1Var = this.f328a;
            vha vhaVar = this.f329b;
            ke1Var.m35505I(vhaVar.m52771a((31 & 1) != 0 ? vhaVar.f50335a : null, (31 & 2) != 0 ? vhaVar.f50336b : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (31 & 4) != 0 ? vhaVar.f50337c : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (31 & 8) != 0 ? vhaVar.f50338d : null, (31 & 16) != 0 ? vhaVar.f50339e : 0L, (31 & 32) != 0 ? vhaVar.f50340f : true, (31 & 64) != 0 ? vhaVar.f50341g : activityLocation.getId()));
        }
    }

    /* renamed from: ai.salesmax.location.LocationWorker$d */
    public static final class C0086d implements gu3 {

        /* renamed from: a */
        public static final C0086d f330a = new C0086d();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    /* renamed from: ai.salesmax.location.LocationWorker$e */
    public static final class C0087e implements rl7 {

        /* renamed from: a */
        public static final C0087e f331a = new C0087e();

        /* renamed from: ai.salesmax.location.LocationWorker$e$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f332a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final mii invoke(uni uniVar) {
                return uniVar.SB();
            }
        }

        /* renamed from: ai.salesmax.location.LocationWorker$e$b */
        public static final class b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final b f333a = new b();

            public b() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l1 invoke(mii miiVar) {
                return miiVar.m39161k();
            }
        }

        /* renamed from: d */
        public static final mii m251d(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (mii) xk7Var.invoke(obj);
        }

        /* renamed from: e */
        public static final l1 m252e(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (l1) xk7Var.invoke(obj);
        }

        @Override // p001o.rl7
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Optional apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            Optional optionalOf = Optional.of(uniVar);
            final a aVar = a.f332a;
            Optional map = optionalOf.map(new Function() { // from class: o.gia
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return LocationWorker.C0087e.m251d(aVar, obj);
                }
            });
            final b bVar = b.f333a;
            return map.map(new Function() { // from class: o.hia
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return LocationWorker.C0087e.m252e(bVar, obj);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    @SuppressLint({"CheckResult"})
    public Object doWork(n64 n64Var) {
        q83 q83VarM35518t;
        mbj mbjVar = mbj.LOCATION_RECONCILIATION;
        StringBuilder sb = new StringBuilder();
        sb.append("Worker start for ");
        sb.append(mbjVar);
        ke1 ke1VarM35525a = ke1.f32003i.m35525a();
        Optional optional = (Optional) uni.LB().h0(i5f.m31599c()).y0(i5f.m31599c()).d0(C0087e.f331a).m55727f();
        if (!optional.isPresent()) {
            optional = null;
        }
        if (optional != null) {
            Object obj = optional.get();
            sq8.m48648g(obj, "get(...)");
            l1 l1Var = (l1) obj;
            if (ke1VarM35525a != null) {
                String strName = mbjVar.name();
                String strOn = l1Var.on();
                sq8.m48648g(strOn, "getAccountId(...)");
                String strEo = l1Var.Eo();
                sq8.m48648g(strEo, "getUserId(...)");
                q83VarM35518t = ke1VarM35525a.m35518t(strName, strOn, strEo);
            } else {
                q83VarM35518t = null;
            }
            long jM44966g = q83VarM35518t != null ? q83VarM35518t.m44966g() : h4e.f26198a.m29804b();
            l1Var.on();
            l1Var.Eo();
            List<vha> listM35519u = ke1VarM35525a != null ? ke1VarM35525a.m35519u(jM44966g, false) : null;
            if (listM35519u != null) {
                for (vha vhaVar : listM35519u) {
                    x6c.c0(optional).m55717M(new C0084b(l1Var, vhaVar)).y0(i5f.m31599c()).h0(i5f.m31599c()).v0(new C0085c(ke1VarM35525a, vhaVar), C0086d.f330a);
                }
            }
            List listM35519u2 = ke1VarM35525a != null ? ke1VarM35525a.m35519u(jM44966g, true) : null;
            if (listM35519u2 != null) {
                ArrayList<vha> arrayList = new ArrayList();
                for (Object obj2 : listM35519u2) {
                    if (((vha) obj2).m52772c() != null) {
                        arrayList.add(obj2);
                    }
                }
                for (vha vhaVar2 : arrayList) {
                    ke1VarM35525a.m35508j(vhaVar2);
                    String strM52772c = vhaVar2.m52772c();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Removing processed location with id: ");
                    sb2.append(strM52772c);
                }
            }
            if (q83VarM35518t != null) {
                ke1VarM35525a.m35503G(q83.m44960b(q83VarM35518t, 0, null, null, null, h4e.f26198a.m29804b(), 15, null));
            } else if (ke1VarM35525a != null) {
                String strName2 = mbjVar.name();
                String strOn2 = l1Var.on();
                sq8.m48648g(strOn2, "getAccountId(...)");
                String strEo2 = l1Var.Eo();
                sq8.m48648g(strEo2, "getUserId(...)");
                ke1VarM35525a.m35524z(new q83(0, strName2, strOn2, strEo2, jM44966g, 1, null));
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("processing completed for worker: ");
        sb3.append(mbjVar);
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        sq8.m48648g(resultSuccess, "success(...)");
        return resultSuccess;
    }
}
