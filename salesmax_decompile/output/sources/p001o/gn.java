package p001o;

import ai.salesmax.model.Activities;
import ai.salesmax.model.ActivitiesStatus;
import ai.salesmax.model.FilterData;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ActivityMetrices;
import ai.salesmax.services.model.ActivityMetrics;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.amplifyframework.datastore.generated.model.Team;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.objectweb.asm.Opcodes;
import p001o.yne;

/* loaded from: classes.dex */
public final class gn extends zf0 {

    /* renamed from: c */
    public xz4 f25509c;

    /* renamed from: o.gn$a */
    public /* synthetic */ class C13781a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25510a;

        static {
            int[] iArr = new int[ActivityMetrics.Period.values().length];
            try {
                iArr[ActivityMetrics.Period.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityMetrics.Period.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityMetrics.Period.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityMetrics.Period.PREVIOUS_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActivityMetrics.Period.PREVIOUS_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActivityMetrics.Period.PREVIOUS_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f25510a = iArr;
        }
    }

    /* renamed from: o.gn$b */
    public static final class C13782b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Map f25511a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13782b(Map map) {
            super(1);
            this.f25511a = map;
        }

        /* renamed from: a */
        public final void m29125a(ActivitiesStatus activitiesStatus) {
            ActivitiesStatus activitiesStatus2 = (ActivitiesStatus) this.f25511a.get(activitiesStatus.getMetricsName());
            activitiesStatus.setPreviousMetricsValue(activitiesStatus2 == null ? 0L : activitiesStatus2.getMetricsValue());
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m29125a((ActivitiesStatus) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gn$d */
    public static final class C13784d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13784d f25513a = new C13784d();

        public C13784d() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional invoke(vt vtVar) {
            return vtVar.m53392e();
        }
    }

    /* renamed from: o.gn$e */
    public static final class C13785e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13785e f25514a = new C13785e();

        public C13785e() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional invoke(Optional optional) {
            return optional;
        }
    }

    /* renamed from: o.gn$f */
    public static final class C13786f extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13786f f25515a = new C13786f();

        public C13786f() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(ryh ryhVar) {
            return (String) ryhVar.f44265a;
        }
    }

    /* renamed from: o.gn$g */
    public static final class C13787g extends jgg implements nl7 {

        /* renamed from: a */
        public int f25516a;

        /* renamed from: b */
        public /* synthetic */ Object f25517b;

        /* renamed from: d */
        public final /* synthetic */ ActivityMetrics.Period f25519d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13787g(ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f25519d = period;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13787g c13787g = gn.this.new C13787g(this.f25519d, n64Var);
            c13787g.f25517b = obj;
            return c13787g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13787g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f25516a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f25517b = null;
                this.f25516a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f25517b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f25517b = ogaVar2;
                this.f25516a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    oga ogaVar3 = (oga) this.f25517b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f25517b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(gn.this.m29118o(this.f25519d));
            this.f25517b = ogaVar;
            this.f25516a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gn$h */
    public static final class C13788h extends jgg implements nl7 {

        /* renamed from: a */
        public int f25520a;

        /* renamed from: b */
        public /* synthetic */ Object f25521b;

        /* renamed from: c */
        public final /* synthetic */ String f25522c;

        /* renamed from: o.gn$h$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f25523a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Activities", paginatedTokenResults);
            }
        }

        /* renamed from: o.gn$h$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f25524a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Activities", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13788h(String str, n64 n64Var) {
            super(2, n64Var);
            this.f25522c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13788h c13788h = new C13788h(this.f25522c, n64Var);
            c13788h.f25521b = obj;
            return c13788h;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13788h) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f25520a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f25521b = null;
                this.f25520a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f25521b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f25521b = ogaVar2;
                this.f25520a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        wre.m54934b(obj);
                    } else {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f25521b;
                wre.m54934b(obj);
            }
            lv lvVarM37946X = lv.m37946X(mv.ALL);
            sq8.m48648g(lvVarM37946X, "of(...)");
            lvVarM37946X.c0(this.f25522c);
            if (lvVarM37946X.m37969D()) {
                Object objM47698c = tt.m50460s(10).m47686M(b.f25524a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Object objM47698c2 = gt.m29467r(10).m47686M(a.f25523a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f25521b = ogaVar;
            this.f25520a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gn$i */
    public static final class C13789i extends jgg implements nl7 {

        /* renamed from: a */
        public int f25525a;

        /* renamed from: b */
        public /* synthetic */ Object f25526b;

        /* renamed from: c */
        public final /* synthetic */ String f25527c;

        /* renamed from: o.gn$i$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f25528a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Activities", paginatedTokenResults);
            }
        }

        /* renamed from: o.gn$i$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f25529a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Activities", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13789i(String str, n64 n64Var) {
            super(2, n64Var);
            this.f25527c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13789i c13789i = new C13789i(this.f25527c, n64Var);
            c13789i.f25526b = obj;
            return c13789i;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13789i) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f25525a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f25526b = null;
                this.f25525a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f25526b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f25526b = ogaVar2;
                this.f25525a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        wre.m54934b(obj);
                    } else {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f25526b;
                wre.m54934b(obj);
            }
            lv lvVarM37946X = lv.m37946X(mv.ME);
            sq8.m48648g(lvVarM37946X, "of(...)");
            lvVarM37946X.c0(this.f25527c);
            if (lvVarM37946X.m37969D()) {
                Object objM47698c = tt.m50466y(10).m47686M(b.f25529a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Object objM47698c2 = gt.m29468s(10).m47686M(a.f25528a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f25526b = ogaVar;
            this.f25525a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gn$j */
    public static final class C13790j extends jgg implements nl7 {

        /* renamed from: a */
        public int f25530a;

        /* renamed from: b */
        public /* synthetic */ Object f25531b;

        /* renamed from: d */
        public final /* synthetic */ ActivityMetrics.Period f25533d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13790j(ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f25533d = period;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13790j c13790j = gn.this.new C13790j(this.f25533d, n64Var);
            c13790j.f25531b = obj;
            return c13790j;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13790j) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f25530a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f25531b = null;
                this.f25530a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f25531b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f25531b = ogaVar2;
                this.f25530a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    oga ogaVar3 = (oga) this.f25531b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f25531b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(gn.this.m29112G(this.f25533d));
            this.f25531b = ogaVar;
            this.f25530a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gn$k */
    public static final class C13791k extends jgg implements nl7 {

        /* renamed from: a */
        public int f25534a;

        /* renamed from: b */
        public /* synthetic */ Object f25535b;

        /* renamed from: c */
        public final /* synthetic */ String f25536c;

        /* renamed from: d */
        public final /* synthetic */ String f25537d;

        /* renamed from: e */
        public final /* synthetic */ List f25538e;

        /* renamed from: o.gn$k$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f25539a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("Team Activities", paginatedTokenResults);
            }
        }

        /* renamed from: o.gn$k$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f25540a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("Team Activities", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13791k(String str, String str2, List list, n64 n64Var) {
            super(2, n64Var);
            this.f25536c = str;
            this.f25537d = str2;
            this.f25538e = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13791k c13791k = new C13791k(this.f25536c, this.f25537d, this.f25538e, n64Var);
            c13791k.f25535b = obj;
            return c13791k;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13791k) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f25534a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f25535b = null;
                this.f25534a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f25535b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f25535b = ogaVar2;
                this.f25534a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        wre.m54934b(obj);
                    } else {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f25535b;
                wre.m54934b(obj);
            }
            lv lvVarM37946X = lv.m37946X(mv.MY_TEAM);
            sq8.m48648g(lvVarM37946X, "of(...)");
            lvVarM37946X.c0(this.f25536c);
            if (lvVarM37946X.m37969D()) {
                Object objM47698c = tt.m50441B(this.f25537d, this.f25538e, 10).m47686M(b.f25540a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Team teamJustId = Team.justId(this.f25537d);
                sq8.m48648g(teamJustId, "justId(...)");
                List list = this.f25538e;
                ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Team.justId((String) it.next()));
                }
                lvVarM37946X.d0(teamJustId);
                lvVarM37946X.b0(arrayList);
                Object objM47698c2 = gt.m29469t(10).m47686M(a.f25539a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f25535b = ogaVar;
            this.f25534a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.gn$l */
    public static final class C13792l extends jgg implements nl7 {

        /* renamed from: a */
        public int f25541a;

        /* renamed from: b */
        public /* synthetic */ Object f25542b;

        /* renamed from: d */
        public final /* synthetic */ String f25544d;

        /* renamed from: e */
        public final /* synthetic */ ActivityMetrics.Period f25545e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13792l(String str, ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f25544d = str;
            this.f25545e = period;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13792l c13792l = gn.this.new C13792l(this.f25544d, this.f25545e, n64Var);
            c13792l.f25542b = obj;
            return c13792l;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13792l) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f25541a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f25542b = null;
                this.f25541a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f25542b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f25542b = ogaVar2;
                this.f25541a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    oga ogaVar3 = (oga) this.f25542b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f25542b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(gn.this.m29114J(this.f25544d, this.f25545e));
            this.f25542b = ogaVar;
            this.f25541a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(Application application) {
        super(application);
        sq8.m48649h(application, "application");
        this.f25509c = xz4.Others;
    }

    /* renamed from: I */
    public static /* synthetic */ void m29092I(gn gnVar, List list, String str, String str2, tz4 tz4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            tz4Var = null;
        }
        gnVar.m29113H(list, str, str2, tz4Var);
    }

    /* renamed from: q */
    public static final String m29101q(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* renamed from: r */
    public static final void m29102r(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* renamed from: t */
    public static final Optional m29103t(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Optional) xk7Var.invoke(obj);
    }

    /* renamed from: u */
    public static final Optional m29104u(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Optional) xk7Var.invoke(obj);
    }

    /* renamed from: v */
    public static final String m29105v(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* renamed from: A */
    public final AbstractC2145n m29106A(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C13788h(str, null), 2, null);
    }

    /* renamed from: B */
    public final AbstractC2145n m29107B(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C13789i(str, null), 2, null);
    }

    /* renamed from: C */
    public final AbstractC2145n m29108C(String str, ActivityMetrics.Period period) {
        sq8.m48649h(str, "searchText");
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new C13790j(period, null), 2, null);
    }

    /* renamed from: D */
    public final AbstractC2145n m29109D(String str, List list, String str2) {
        sq8.m48649h(str, "teamID");
        sq8.m48649h(list, "teamIds");
        sq8.m48649h(str2, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C13791k(str2, str, list, null), 2, null);
    }

    /* renamed from: E */
    public final AbstractC2145n m29110E(String str, ActivityMetrics.Period period) {
        sq8.m48649h(str, "teamId");
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new C13792l(str, period, null), 2, null);
    }

    /* renamed from: F */
    public final mii m29111F() {
        return wi0.m54444J();
    }

    /* renamed from: G */
    public final ArrayList m29112G(ActivityMetrics.Period period) {
        Object objM55727f = tr.m50380x().m50391z().m55727f();
        sq8.m48648g(objM55727f, "blockingFirst(...)");
        return m29116L((ActivityMetrices) objM55727f, period);
    }

    /* renamed from: H */
    public final void m29113H(List list, String str, String str2, tz4 tz4Var) {
        no noVar;
        vt vtVar = null;
        if (list == null || !(!list.isEmpty())) {
            noVar = null;
        } else {
            noVar = new no();
            noVar.m24033h(list);
        }
        if (str != null) {
            vtVar = new vt();
            vtVar.m34797c(str);
        }
        if (tz4Var != null) {
            if (noVar == null) {
                noVar = new no();
            }
            noVar.m24032g(tz4Var);
        }
        if (str2 != null) {
            lv.m37945W(str2).e0(vtVar);
            lv.m37945W(str2).a0(noVar);
            return;
        }
        mv mvVar = mv.ME;
        lv.m37946X(mvVar).e0(vtVar);
        mv mvVar2 = mv.MY_TEAM;
        lv.m37946X(mvVar2).e0(vtVar);
        mv mvVar3 = mv.ALL;
        lv.m37946X(mvVar3).e0(vtVar);
        lv.m37946X(mvVar).a0(noVar);
        lv.m37946X(mvVar2).a0(noVar);
        lv.m37946X(mvVar3).a0(noVar);
    }

    /* renamed from: J */
    public final ArrayList m29114J(String str, ActivityMetrics.Period period) {
        Object objM55727f = tr.m50380x().m50381A(str).m55727f();
        sq8.m48648g(objM55727f, "blockingFirst(...)");
        return m29116L((ActivityMetrices) objM55727f, period);
    }

    /* renamed from: K */
    public final ArrayList m29115K(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        ArrayList arrayList = new ArrayList();
        ActivityMetrics activityMetrics = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.CONTACT_CREATED.name(), period);
        Long metricsValue = activityMetrics.getMetricsValue();
        sq8.m48648g(metricsValue, "getMetricsValue(...)");
        metricsValue.longValue();
        ActivityMetrics activityMetrics2 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.CONNECTED_INCOMING_CALL_LOGGED.name(), period);
        ActivityMetrics activityMetrics3 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.CONNECTED_OUTGOING_CALL_LOGGED.name(), period);
        ActivityMetrics activityMetrics4 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.CALL_OUTCOME_LOGGED.name(), period);
        ActivityMetrics activityMetrics5 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.CALL_LOGGED.name(), period);
        Long metricsValue2 = activityMetrics5.getMetricsValue();
        sq8.m48648g(metricsValue2, "getMetricsValue(...)");
        metricsValue2.longValue();
        ActivityMetrics activityMetrics6 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.VISIT_OUTCOME_LOGGED.name(), period);
        ActivityMetrics activityMetrics7 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.VISIT_LOGGED.name(), period);
        Long metricsValue3 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue3, "getMetricsValue(...)");
        metricsValue3.longValue();
        ActivityMetrics activityMetrics8 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.NOTE_ADDED.name(), period);
        Long metricsValue4 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue4, "getMetricsValue(...)");
        metricsValue4.longValue();
        ActivityMetrics activityMetrics9 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.TASK_CREATED.name(), period);
        ActivityMetrics activityMetrics10 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.TASK_COMPLETED.name(), period);
        ActivityMetrics activityMetrics11 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.TASK_UPDATED.name(), period);
        Long metricsValue5 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue5, "getMetricsValue(...)");
        metricsValue5.longValue();
        Long metricsValue6 = activityMetrics10.getMetricsValue();
        sq8.m48648g(metricsValue6, "getMetricsValue(...)");
        metricsValue6.longValue();
        Long metricsValue7 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue7, "getMetricsValue(...)");
        metricsValue7.longValue();
        String str = String.format("%s Leads Created", Arrays.copyOf(new Object[]{activityMetrics.getMetricsValue()}, 1));
        sq8.m48648g(str, "format(...)");
        Long metricsValue8 = activityMetrics.getMetricsValue();
        sq8.m48648g(metricsValue8, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str, "Leads Created", metricsValue8.longValue(), Integer.valueOf(w7e.ic_activity_user_added), vs6.m53365b(), 0L, 64, null));
        String str2 = String.format("%s Call Dispositions Added", Arrays.copyOf(new Object[]{activityMetrics4.getMetricsValue()}, 1));
        sq8.m48648g(str2, "format(...)");
        Long metricsValue9 = activityMetrics4.getMetricsValue();
        sq8.m48648g(metricsValue9, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str2, "Call Dispositions Added", metricsValue9.longValue(), Integer.valueOf(w7e.ic_call), vs6.m53365b(), 0L, 64, null));
        String str3 = String.format("%s Incoming Call Connected", Arrays.copyOf(new Object[]{activityMetrics2.getMetricsValue()}, 1));
        sq8.m48648g(str3, "format(...)");
        Long metricsValue10 = activityMetrics2.getMetricsValue();
        sq8.m48648g(metricsValue10, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str3, "Incoming Call Connected", metricsValue10.longValue(), Integer.valueOf(w7e.ic_call_in), vs6.m53365b(), 0L, 64, null));
        String str4 = String.format("%s Outgoing Call Connected", Arrays.copyOf(new Object[]{activityMetrics3.getMetricsValue()}, 1));
        sq8.m48648g(str4, "format(...)");
        Long metricsValue11 = activityMetrics3.getMetricsValue();
        sq8.m48648g(metricsValue11, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str4, "Outgoing Call Connected", metricsValue11.longValue(), Integer.valueOf(w7e.ic_call_out), vs6.m53365b(), 0L, 64, null));
        String str5 = String.format("%s Call Placed", Arrays.copyOf(new Object[]{activityMetrics5.getMetricsValue()}, 1));
        sq8.m48648g(str5, "format(...)");
        Long metricsValue12 = activityMetrics5.getMetricsValue();
        sq8.m48648g(metricsValue12, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str5, "Call Placed", metricsValue12.longValue(), Integer.valueOf(w7e.ic_home_calls_all), vs6.m53365b(), 0L, 64, null));
        String str6 = String.format("%s Visit Dispositions Added", Arrays.copyOf(new Object[]{activityMetrics6.getMetricsValue()}, 1));
        sq8.m48648g(str6, "format(...)");
        Long metricsValue13 = activityMetrics6.getMetricsValue();
        sq8.m48648g(metricsValue13, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str6, "Visit Dispositions Added", metricsValue13.longValue(), Integer.valueOf(w7e.ic_add_visit), vs6.m53365b(), 0L, 64, null));
        String str7 = String.format("%s Visits Done", Arrays.copyOf(new Object[]{activityMetrics7.getMetricsValue()}, 1));
        sq8.m48648g(str7, "format(...)");
        Long metricsValue14 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue14, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str7, "Visits Done", metricsValue14.longValue(), Integer.valueOf(w7e.ic_activity_visits_done), vs6.m53365b(), 0L, 64, null));
        String str8 = String.format("%s Notes Added", Arrays.copyOf(new Object[]{activityMetrics8.getMetricsValue()}, 1));
        sq8.m48648g(str8, "format(...)");
        Long metricsValue15 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue15, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str8, "Notes Added", metricsValue15.longValue(), Integer.valueOf(w7e.ic_activity_notes_added), vs6.m53365b(), 0L, 64, null));
        String str9 = String.format("%s Tasks Created", Arrays.copyOf(new Object[]{activityMetrics9.getMetricsValue()}, 1));
        sq8.m48648g(str9, "format(...)");
        Long metricsValue16 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue16, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str9, "Tasks Created", metricsValue16.longValue(), Integer.valueOf(w7e.ic_tasks), vs6.m53365b(), 0L, 64, null));
        String str10 = String.format("%s Tasks Updated", Arrays.copyOf(new Object[]{activityMetrics11.getMetricsValue()}, 1));
        sq8.m48648g(str10, "format(...)");
        Long metricsValue17 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue17, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str10, "Tasks Updated", metricsValue17.longValue(), Integer.valueOf(w7e.ic_home_updated_tasks), vs6.m53365b(), 0L, 64, null));
        String str11 = String.format("%s Tasks Completed", Arrays.copyOf(new Object[]{activityMetrics10.getMetricsValue()}, 1));
        sq8.m48648g(str11, "format(...)");
        Long metricsValue18 = activityMetrics10.getMetricsValue();
        sq8.m48648g(metricsValue18, "getMetricsValue(...)");
        arrayList.add(new ActivitiesStatus(1L, str11, "Tasks Completed", metricsValue18.longValue(), Integer.valueOf(w7e.ic_home_completed_tasks), vs6.m53365b(), 0L, 64, null));
        return arrayList;
    }

    /* renamed from: L */
    public final ArrayList m29116L(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        return m29119p(m29115K(activityMetrices, period), m29117M(activityMetrices, period));
    }

    /* renamed from: M */
    public final ArrayList m29117M(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        switch (C13781a.f25510a[period.ordinal()]) {
            case 1:
                return m29115K(activityMetrices, ActivityMetrics.Period.PREVIOUS_DAY);
            case 2:
                return m29115K(activityMetrices, ActivityMetrics.Period.PREVIOUS_WEEK);
            case 3:
                return m29115K(activityMetrices, ActivityMetrics.Period.PREVIOUS_MONTH);
            case 4:
                return m29115K(activityMetrices, ActivityMetrics.Period.DAY);
            case 5:
                return m29115K(activityMetrices, ActivityMetrics.Period.WEEK);
            case 6:
                return m29115K(activityMetrices, ActivityMetrics.Period.MONTH);
            default:
                return m29115K(activityMetrices, period);
        }
    }

    /* renamed from: o */
    public final ArrayList m29118o(ActivityMetrics.Period period) {
        Object objM55727f = tr.m50380x().m50385s().m55727f();
        sq8.m48648g(objM55727f, "blockingFirst(...)");
        return m29116L((ActivityMetrices) objM55727f, period);
    }

    /* renamed from: p */
    public final ArrayList m29119p(ArrayList arrayList, ArrayList arrayList2) {
        Stream stream = arrayList2.stream();
        final C13783c c13783c = new tpb() { // from class: o.gn.c
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((ActivitiesStatus) obj).getMetricsName();
            }
        };
        Map map = (Map) stream.collect(Collectors.toMap(new Function() { // from class: o.en
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return gn.m29101q(c13783c, obj);
            }
        }, Function.identity()));
        Stream stream2 = arrayList.stream();
        final C13782b c13782b = new C13782b(map);
        stream2.forEach(new Consumer() { // from class: o.fn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                gn.m29102r(c13782b, obj);
            }
        });
        return arrayList;
    }

    /* renamed from: s */
    public final void m29120s(Activities activities, Activities activities2, mv mvVar) {
        sq8.m48649h(activities, "activities");
        sq8.m48649h(mvVar, "activityViewOptionType");
        Optional optionalM37967B = lv.m37946X(mvVar).m37967B();
        final C13784d c13784d = C13784d.f25513a;
        Optional map = optionalM37967B.map(new Function() { // from class: o.bn
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return gn.m29103t(c13784d, obj);
            }
        });
        final C13785e c13785e = C13785e.f25514a;
        Optional optionalFlatMap = map.flatMap(new Function() { // from class: o.cn
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return gn.m29104u(c13785e, obj);
            }
        });
        final C13786f c13786f = C13786f.f25515a;
        activities.setSortedByField((String) optionalFlatMap.map(new Function() { // from class: o.dn
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return gn.m29105v(c13786f, obj);
            }
        }).orElse("updatedAt"));
        String sortedByField = activities.getSortedByField();
        if (sortedByField != null) {
            int iHashCode = sortedByField.hashCode();
            if (iHashCode == -1949194674) {
                if (sortedByField.equals("updatedAt")) {
                    activities.setCurrentSortByValue(activities.getUpdatedAt());
                    activities.setOldSortByValue(activities2 != null ? activities2.getUpdatedAt() : null);
                    activities.setSortedByDataType(zfe.DATE_TIME_TYPE);
                    return;
                }
                return;
            }
            if (iHashCode == 598371643) {
                if (sortedByField.equals("createdAt")) {
                    activities.setCurrentSortByValue(activities.getCreatedAt());
                    activities.setOldSortByValue(activities2 != null ? activities2.getCreatedAt() : null);
                    activities.setSortedByDataType(zfe.DATE_TIME_TYPE);
                    return;
                }
                return;
            }
            if (iHashCode == 1628821225 && sortedByField.equals("activityType")) {
                activities.setCurrentSortByValue(activities.getActivityType());
                activities.setOldSortByValue(activities2 != null ? activities2.getActivityType() : null);
                activities.setSortedByDataType(zfe.CATEGORY);
            }
        }
    }

    /* renamed from: w */
    public final AbstractC2145n m29121w(ActivityMetrics.Period period) {
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new C13787g(period, null), 2, null);
    }

    /* renamed from: x */
    public final ArrayList m29122x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FilterData(true, "leadFilterLeadType", "Activity Type", false, null, null, null, 120, null));
        arrayList.add(new FilterData(false, "leadFilterLeadType", "All", false, null, null, null, Opcodes.LSHL, null));
        Iterator it = m29123y().iterator();
        while (it.hasNext()) {
            arrayList.add(new FilterData(false, "leadFilterLeadType", (String) it.next(), false, null, null, null, Opcodes.LSHL, null));
        }
        lv lvVarM29124z = m29124z();
        if (lvVarM29124z.m37976x().isPresent() && ((no) lvVarM29124z.m37976x().get()).m24028c().isPresent()) {
            Object obj = ((no) lvVarM29124z.m37976x().get()).m24028c().get();
            sq8.m48648g(obj, "get(...)");
            ArrayList arrayList2 = new ArrayList();
            for (String str : (List) obj) {
                sq8.m48646e(str);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                arrayList2.add(lowerCase);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                FilterData filterData = (FilterData) it2.next();
                String lowerCase2 = filterData.getText().toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                if (arrayList2.contains(lowerCase2)) {
                    filterData.setSelected(true);
                }
            }
        }
        if (lvVarM29124z.m37967B().isPresent() && ((vt) lvVarM29124z.m37967B().get()).m34795a().isPresent()) {
            Object obj2 = ((vt) lvVarM29124z.m37967B().get()).m34795a().get();
            sq8.m48648g(obj2, "get(...)");
            String str2 = (String) obj2;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                FilterData filterData2 = (FilterData) it3.next();
                if (e9g.m24606x(str2, filterData2.getText(), true)) {
                    filterData2.setSelected(true);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public final List m29123y() {
        return new ArrayList(no.m40815l());
    }

    /* renamed from: z */
    public final lv m29124z() {
        lv lvVarM37946X = lv.m37946X(mv.ME);
        sq8.m48648g(lvVarM37946X, "of(...)");
        return lvVarM37946X;
    }
}
