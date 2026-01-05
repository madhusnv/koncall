package ai.salesmax.worker;

import ai.salesmax.worker.AppVersionUpdateWorker;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.datastore.generated.model.User;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import p001o.fn0;
import p001o.ggd;
import p001o.gu3;
import p001o.h8g;
import p001o.i5f;
import p001o.id5;
import p001o.ke1;
import p001o.kf9;
import p001o.l1;
import p001o.mbj;
import p001o.mii;
import p001o.n64;
import p001o.rl7;
import p001o.sq8;
import p001o.uni;
import p001o.x6c;
import p001o.x8c;
import p001o.xk7;
import p001o.y3i;
import type.UpdateUserInput;

/* loaded from: classes2.dex */
public final class AppVersionUpdateWorker extends CoroutineWorker {
    private static final String TAG = "app-version-update-worker";
    private final Context context;
    public static final C1677a Companion = new C1677a(null);
    public static final int $stable = 8;

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$a */
    public static final class C1677a {
        public C1677a() {
        }

        public /* synthetic */ C1677a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$b */
    public static final class C1678b implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ ke1 f5084a;

        /* renamed from: b */
        public final /* synthetic */ fn0 f5085b;

        public C1678b(ke1 ke1Var, fn0 fn0Var) {
            this.f5084a = ke1Var;
            this.f5085b = fn0Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(fn0 fn0Var) {
            sq8.m48649h(fn0Var, "it");
            return Optional.ofNullable(this.f5084a.m35499C(this.f5085b));
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$c */
    public static final class C1679c implements ggd {

        /* renamed from: a */
        public static final C1679c f5086a = new C1679c();

        @Override // p001o.ggd
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Optional optional) {
            sq8.m48649h(optional, "it");
            return optional.isPresent();
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$d */
    public static final class C1680d implements rl7 {

        /* renamed from: a */
        public static final C1680d f5087a = new C1680d();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fn0 apply(Optional optional) {
            sq8.m48649h(optional, "it");
            return (fn0) optional.get();
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$e */
    public static final class C1681e implements ggd {

        /* renamed from: a */
        public static final C1681e f5088a = new C1681e();

        @Override // p001o.ggd
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(fn0 fn0Var) {
            sq8.m48649h(fn0Var, "it");
            return !sq8.m48644c(fn0Var.m27116g(), Boolean.TRUE);
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$f */
    public static final class C1682f implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ l1 f5089a;

        public C1682f(l1 l1Var) {
            this.f5089a = l1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(fn0 fn0Var) {
            sq8.m48649h(fn0Var, "it");
            return this.f5089a.cj(UpdateUserInput.builder().id(this.f5089a.Eo()).appVersion(fn0Var.m27117h()).deviceModel(fn0Var.m27115f()).deviceManufacturer(fn0Var.m27114e()).androidVersionRelease(fn0Var.m27112c()).build());
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$g */
    public static final class C1683g implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ ke1 f5090a;

        /* renamed from: b */
        public final /* synthetic */ fn0 f5091b;

        public C1683g(ke1 ke1Var, fn0 fn0Var) {
            this.f5090a = ke1Var;
            this.f5091b = fn0Var;
        }

        /* renamed from: a */
        public final void m3420a(User user) {
            sq8.m48649h(user, "it");
            this.f5090a.m35506J(fn0.m27110b(this.f5091b, 0, null, null, null, null, Boolean.TRUE, 31, null));
        }

        @Override // p001o.rl7
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            m3420a((User) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$h */
    public static final class C1684h implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f5092a;

        public C1684h(AtomicBoolean atomicBoolean) {
            this.f5092a = atomicBoolean;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(y3i y3iVar) {
            sq8.m48649h(y3iVar, "it");
            this.f5092a.set(true);
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$i */
    public static final class C1685i implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f5093a;

        public C1685i(AtomicBoolean atomicBoolean) {
            this.f5093a = atomicBoolean;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            this.f5093a.set(false);
        }
    }

    /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$j */
    public static final class C1686j implements rl7 {

        /* renamed from: a */
        public static final C1686j f5094a = new C1686j();

        /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$j$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f5095a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final mii invoke(uni uniVar) {
                return uniVar.SB();
            }
        }

        /* renamed from: ai.salesmax.worker.AppVersionUpdateWorker$j$b */
        public static final class b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final b f5096a = new b();

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
        public static final mii m3425d(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (mii) xk7Var.invoke(obj);
        }

        /* renamed from: e */
        public static final l1 m3426e(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (l1) xk7Var.invoke(obj);
        }

        @Override // p001o.rl7
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Optional apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            Optional optionalOf = Optional.of(uniVar);
            final a aVar = a.f5095a;
            Optional map = optionalOf.map(new Function() { // from class: o.jn0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return AppVersionUpdateWorker.C1686j.m3425d(aVar, obj);
                }
            });
            final b bVar = b.f5096a;
            return map.map(new Function() { // from class: o.kn0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return AppVersionUpdateWorker.C1686j.m3426e(bVar, obj);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVersionUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.context = context;
    }

    private final String getVersion() throws PackageManager.NameNotFoundException {
        String str;
        PackageInfo packageInfo = this.context.getApplicationContext().getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
        String str2 = packageInfo.versionName;
        if (Build.VERSION.SDK_INT <= 28) {
            h8g h8gVar = h8g.f26398a;
            str = String.format("(%s)", Arrays.copyOf(new Object[]{Integer.valueOf(packageInfo.versionCode)}, 1));
            sq8.m48648g(str, "format(...)");
        } else {
            h8g h8gVar2 = h8g.f26398a;
            str = String.format("(%s)", Arrays.copyOf(new Object[]{Long.valueOf(packageInfo.getLongVersionCode())}, 1));
            sq8.m48648g(str, "format(...)");
        }
        String str3 = str2 + str;
        sq8.m48646e(str3);
        return str3;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(n64 n64Var) {
        ListenableWorker.Result resultFailure;
        String str;
        mbj mbjVar = mbj.APP_VERSION_UPDATE;
        StringBuilder sb = new StringBuilder();
        sb.append("Worker start for ");
        sb.append(mbjVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ke1 ke1VarM35525a = ke1.f32003i.m35525a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Repository is ");
        sb2.append(ke1VarM35525a);
        if (ke1VarM35525a != null) {
            Optional optional = (Optional) uni.LB().h0(i5f.m31599c()).y0(i5f.m31599c()).d0(C1686j.f5094a).m55727f();
            if (!optional.isPresent()) {
                optional = null;
            }
            if (optional != null) {
                Object obj = optional.get();
                sq8.m48648g(obj, "get(...)");
                fn0 fn0Var = new fn0(0, getVersion(), Build.MODEL, Build.MANUFACTURER, Build.VERSION.RELEASE, null, 33, null);
                x6c.c0(fn0Var).d0(new C1678b(ke1VarM35525a, fn0Var)).m55714J(C1679c.f5086a).d0(C1680d.f5087a).m55714J(C1681e.f5088a).m55717M(new C1682f((l1) obj)).d0(new C1683g(ke1VarM35525a, fn0Var)).v0(new C1684h(atomicBoolean), new C1685i(atomicBoolean));
            }
        }
        if (atomicBoolean.get()) {
            resultFailure = ListenableWorker.Result.success();
            str = "success(...)";
        } else {
            resultFailure = ListenableWorker.Result.failure();
            str = "failure(...)";
        }
        sq8.m48648g(resultFailure, str);
        return resultFailure;
    }
}
