package p001o;

import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.HomeActivity;
import ai.salesmax.model.HomeProgress;
import ai.salesmax.model.HomeProgressList;
import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.model.LeadFilter;
import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.PaginatedTokenResultsUpdater;
import ai.salesmax.services.model.ActivityMetrices;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.services.model.LeaderboardActivityMetrices;
import ai.salesmax.services.model.SavedTableViewInfo;
import ai.salesmax.services.model.SavedTableViewSummary;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.AbstractC2145n;
import com.amazonaws.amplify.generated.graphql.SelfRegisterDeviceMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.RealTimeMetrics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.JsonObject;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.objectweb.asm.Opcodes;
import p001o.pz7;
import p001o.yne;
import type.LeadLifecycleStage;
import type.SearchableContactFilterInput;
import type.TeamMemberType;

/* loaded from: classes.dex */
public final class pz7 extends zf0 {

    /* renamed from: c */
    public final long f40764c;

    /* renamed from: d */
    public final long f40765d;

    /* renamed from: e */
    public tr f40766e;

    /* renamed from: f */
    public final hpb f40767f;

    /* renamed from: o.pz7$a */
    public /* synthetic */ class C16217a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40768a;

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
            f40768a = iArr;
        }
    }

    public static final class a0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40769a;

        /* renamed from: b */
        public /* synthetic */ Object f40770b;

        /* renamed from: c */
        public final /* synthetic */ Resources f40771c;

        /* renamed from: d */
        public final /* synthetic */ String f40772d;

        /* renamed from: o.pz7$a0$a */
        public static final class C16218a implements rl7 {

            /* renamed from: a */
            public static final C16218a f40773a = new C16218a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Leads - Attention", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Resources resources, String str, n64 n64Var) {
            super(2, n64Var);
            this.f40771c = resources;
            this.f40772d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            a0 a0Var = new a0(this.f40771c, this.f40772d, n64Var);
            a0Var.f40770b = obj;
            return a0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((a0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40769a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40770b = null;
                this.f40769a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40770b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40770b = ogaVar2;
                this.f40769a = 1;
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
                    oga ogaVar3 = (oga) this.f40770b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40770b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = c8a.c3(this.f40771c, Optional.ofNullable(this.f40772d), 10).m47686M(C16218a.f40773a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40770b = ogaVar;
            this.f40769a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class a1 implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ String f40774a;

        public a1(String str) {
            this.f40774a = str;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            uniVar.WD(this.f40774a);
        }
    }

    /* renamed from: o.pz7$b */
    public static final class C16219b extends jgg implements nl7 {

        /* renamed from: a */
        public int f40775a;

        /* renamed from: b */
        public /* synthetic */ Object f40776b;

        /* renamed from: c */
        public final /* synthetic */ String f40777c;

        /* renamed from: o.pz7$b$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ String f40778a;

            public a(String str) {
                this.f40778a = str;
            }

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x8c apply(uni uniVar) {
                sq8.m48649h(uniVar, "it");
                return uniVar.TB().av(this.f40778a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16219b(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40777c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16219b c16219b = new C16219b(this.f40777c, n64Var);
            c16219b.f40776b = obj;
            return c16219b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16219b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40775a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unexpected error occurred";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40776b = null;
                this.f40775a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40776b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40776b = ogaVar2;
                this.f40775a = 1;
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
                    oga ogaVar3 = (oga) this.f40776b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40776b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = uni.LB().m55717M(new a(this.f40777c)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((String) objM55727f);
            this.f40776b = ogaVar;
            this.f40775a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class b0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40779a;

        /* renamed from: b */
        public /* synthetic */ Object f40780b;

        /* renamed from: c */
        public final /* synthetic */ Resources f40781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(Resources resources, n64 n64Var) {
            super(2, n64Var);
            this.f40781c = resources;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            b0 b0Var = new b0(this.f40781c, n64Var);
            b0Var.f40780b = obj;
            return b0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((b0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40779a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40780b = null;
                this.f40779a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40780b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40780b = ogaVar2;
                this.f40779a = 1;
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
                    oga ogaVar3 = (oga) this.f40780b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40780b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = c8a.O0(this.f40781c, Optional.empty(), ml1.m39301a(true)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f40780b = ogaVar;
            this.f40779a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class b1 implements gu3 {
        public b1() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            pz7.this.getClass();
        }
    }

    /* renamed from: o.pz7$c */
    public static final class C16220c implements rl7 {

        /* renamed from: a */
        public static final C16220c f40783a = new C16220c();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cz4 apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.bC();
        }
    }

    public static final class c0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40784a;

        /* renamed from: b */
        public /* synthetic */ Object f40785b;

        /* renamed from: c */
        public final /* synthetic */ Resources f40786c;

        /* renamed from: d */
        public final /* synthetic */ String f40787d;

        /* renamed from: o.pz7$c0$a */
        public static final class C16221a implements rl7 {

            /* renamed from: a */
            public static final C16221a f40788a = new C16221a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Leads - Attention", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Resources resources, String str, n64 n64Var) {
            super(2, n64Var);
            this.f40786c = resources;
            this.f40787d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            c0 c0Var = new c0(this.f40786c, this.f40787d, n64Var);
            c0Var.f40785b = obj;
            return c0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((c0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40784a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40785b = null;
                this.f40784a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40785b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40785b = ogaVar2;
                this.f40784a = 1;
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
                    oga ogaVar3 = (oga) this.f40785b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40785b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = c8a.d3(this.f40786c, Optional.ofNullable(this.f40787d), 10).m47686M(C16221a.f40788a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40785b = ogaVar;
            this.f40784a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$d */
    public static final class C16222d extends jgg implements nl7 {

        /* renamed from: a */
        public int f40789a;

        /* renamed from: b */
        public /* synthetic */ Object f40790b;

        /* renamed from: c */
        public final /* synthetic */ int f40791c;

        /* renamed from: o.pz7$d$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f40792a = new a();

            /* renamed from: c */
            public static final SavedTableViewInfo m44421c(SavedTableViewSummary savedTableViewSummary) {
                return savedTableViewSummary.toSavedTableViewInfo();
            }

            @Override // p001o.rl7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PaginatedTokenResults apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return paginatedTokenResults.map(new Function() { // from class: o.qz7
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return pz7.C16222d.a.m44421c((SavedTableViewSummary) obj);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16222d(int i, n64 n64Var) {
            super(2, n64Var);
            this.f40791c = i;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16222d c16222d = new C16222d(this.f40791c, n64Var);
            c16222d.f40790b = obj;
            return c16222d;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16222d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40789a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't fetch saved table views", e);
                this.f40790b = null;
                this.f40789a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40790b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40790b = ogaVar2;
                this.f40789a = 1;
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
                    oga ogaVar3 = (oga) this.f40790b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40790b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            PaginatedTokenResults paginatedTokenResults = (PaginatedTokenResults) v1f.m52252n(this.f40791c).d0(a.f40792a).m55727f();
            paginatedTokenResults.loadInitial();
            yne yneVarM58030d = yne.f55736e.m58030d(new PaginatedDataModel("My Saved Table Views", paginatedTokenResults));
            this.f40790b = ogaVar;
            this.f40789a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class d0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40793a;

        /* renamed from: b */
        public /* synthetic */ Object f40794b;

        /* renamed from: c */
        public final /* synthetic */ Resources f40795c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(Resources resources, n64 n64Var) {
            super(2, n64Var);
            this.f40795c = resources;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            d0 d0Var = new d0(this.f40795c, n64Var);
            d0Var.f40794b = obj;
            return d0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((d0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40793a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40794b = null;
                this.f40793a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40794b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40794b = ogaVar2;
                this.f40793a = 1;
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
                    oga ogaVar3 = (oga) this.f40794b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40794b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = c8a.P0(this.f40795c, Optional.empty(), ml1.m39301a(true)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f40794b = ogaVar;
            this.f40793a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$e */
    public static final class C16223e extends jgg implements nl7 {

        /* renamed from: a */
        public int f40796a;

        /* renamed from: b */
        public /* synthetic */ Object f40797b;

        /* renamed from: d */
        public final /* synthetic */ Resources f40799d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16223e(Resources resources, n64 n64Var) {
            super(2, n64Var);
            this.f40799d = resources;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16223e c16223e = pz7.this.new C16223e(this.f40799d, n64Var);
            c16223e.f40797b = obj;
            return c16223e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16223e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|37|(1:(3:(1:(1:7)(2:8|9))(2:10|11)|34|35)(1:15))(2:16|(1:18)(1:19))|40|20|(3:38|22|(1:24))|28|(1:30)|34|35|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        
            r8 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            yne yneVarM58030d;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40796a;
            try {
            } catch (Exception e) {
                r1.getClass();
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't load home progress list", e);
                this.f40797b = null;
                this.f40796a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40797b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40797b = ogaVar2;
                this.f40796a = 1;
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
                ogaVar = (oga) this.f40797b;
                wre.m54934b(obj);
            }
            ss9 ss9VarJ0 = PropertyDefinitionRepository.o0().j0();
            if (ss9VarJ0 != null) {
                try {
                    x6c x6cVarM48868k = ss9VarJ0.m48868k();
                    if (x6cVarM48868k != null) {
                    }
                } catch (Exception unused) {
                    ogaVar.getClass();
                    yneVarM58030d = yne.f55736e.m58030d(pz7.this.m44397n(this.f40799d, ss9VarJ0));
                    this.f40797b = ogaVar;
                    this.f40796a = 2;
                    if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    }
                    return y3i.f54824a;
                }
            }
            yneVarM58030d = yne.f55736e.m58030d(pz7.this.m44397n(this.f40799d, ss9VarJ0));
            this.f40797b = ogaVar;
            this.f40796a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class e0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40800a;

        /* renamed from: b */
        public /* synthetic */ Object f40801b;

        /* renamed from: c */
        public final /* synthetic */ long f40802c;

        /* renamed from: d */
        public final /* synthetic */ long f40803d;

        /* renamed from: o.pz7$e0$a */
        public static final class C16224a implements rl7 {

            /* renamed from: a */
            public static final C16224a f40804a = new C16224a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("Unreturned Call Leads", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(long j, long j2, n64 n64Var) {
            super(2, n64Var);
            this.f40802c = j;
            this.f40803d = j2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            e0 e0Var = new e0(this.f40802c, this.f40803d, n64Var);
            e0Var.f40801b = obj;
            return e0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((e0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40800a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40801b = null;
                this.f40800a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40801b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40801b = ogaVar2;
                this.f40800a = 1;
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
                    oga ogaVar3 = (oga) this.f40801b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40801b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = iu9.p0(ml1.m39305e(this.f40802c), ml1.m39305e(this.f40803d), 10).m47686M(C16224a.f40804a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40801b = ogaVar;
            this.f40800a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$f */
    public static final class C16225f extends jgg implements nl7 {

        /* renamed from: a */
        public int f40805a;

        /* renamed from: b */
        public /* synthetic */ Object f40806b;

        /* renamed from: c */
        public final /* synthetic */ Resources f40807c;

        /* renamed from: d */
        public final /* synthetic */ String f40808d;

        /* renamed from: e */
        public final /* synthetic */ String f40809e;

        /* renamed from: o.pz7$f$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f40810a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(String str) {
                return Boolean.valueOf(!StringUtils.isBlank(str));
            }
        }

        /* renamed from: o.pz7$f$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f40811a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads - Attention", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16225f(Resources resources, String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f40807c = resources;
            this.f40808d = str;
            this.f40809e = str2;
        }

        /* renamed from: h */
        public static final boolean m44428h(xk7 xk7Var, Object obj) {
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16225f c16225f = new C16225f(this.f40807c, this.f40808d, this.f40809e, n64Var);
            c16225f.f40806b = obj;
            return c16225f;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16225f) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40805a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40806b = null;
                this.f40805a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40806b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40806b = ogaVar2;
                this.f40805a = 1;
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
                    oga ogaVar3 = (oga) this.f40806b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40806b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Resources resources = this.f40807c;
            Optional optionalOfNullable = Optional.ofNullable(this.f40808d);
            final a aVar = a.f40810a;
            Object objM47698c = c8a.I2(resources, optionalOfNullable.filter(new Predicate() { // from class: o.rz7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pz7.C16225f.m44428h(aVar, obj2);
                }
            }), Optional.ofNullable(this.f40809e), 10).m47686M(b.f40811a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40806b = ogaVar;
            this.f40805a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class f0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40812a;

        /* renamed from: b */
        public /* synthetic */ Object f40813b;

        /* renamed from: o.pz7$f0$a */
        public static final class C16226a implements rl7 {

            /* renamed from: a */
            public static final C16226a f40814a = new C16226a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Missed Visits", paginatedTokenResults);
            }
        }

        public f0(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            f0 f0Var = new f0(n64Var);
            f0Var.f40813b = obj;
            return f0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((f0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40812a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40813b = null;
                this.f40812a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40813b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40813b = ogaVar2;
                this.f40812a = 1;
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
                    oga ogaVar3 = (oga) this.f40813b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40813b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.e2(10).m47686M(C16226a.f40814a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40813b = ogaVar;
            this.f40812a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$g */
    public static final class C16227g extends jgg implements nl7 {

        /* renamed from: a */
        public int f40815a;

        /* renamed from: b */
        public /* synthetic */ Object f40816b;

        /* renamed from: c */
        public final /* synthetic */ Resources f40817c;

        /* renamed from: d */
        public final /* synthetic */ String f40818d;

        /* renamed from: o.pz7$g$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f40819a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(String str) {
                return Boolean.valueOf(!StringUtils.isBlank(str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16227g(Resources resources, String str, n64 n64Var) {
            super(2, n64Var);
            this.f40817c = resources;
            this.f40818d = str;
        }

        /* renamed from: h */
        public static final boolean m44434h(xk7 xk7Var, Object obj) {
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16227g c16227g = new C16227g(this.f40817c, this.f40818d, n64Var);
            c16227g.f40816b = obj;
            return c16227g;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16227g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40815a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40816b = null;
                this.f40815a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40816b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40816b = ogaVar2;
                this.f40815a = 1;
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
                    oga ogaVar3 = (oga) this.f40816b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40816b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Resources resources = this.f40817c;
            Optional optionalOfNullable = Optional.ofNullable(this.f40818d);
            final a aVar = a.f40819a;
            Object objM55727f = c8a.O0(resources, optionalOfNullable.filter(new Predicate() { // from class: o.sz7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pz7.C16227g.m44434h(aVar, obj2);
                }
            }), ml1.m39301a(false)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f40816b = ogaVar;
            this.f40815a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class g0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40820a;

        /* renamed from: b */
        public /* synthetic */ Object f40821b;

        /* renamed from: d */
        public final /* synthetic */ String f40823d;

        /* renamed from: e */
        public final /* synthetic */ Resources f40824e;

        /* renamed from: f */
        public final /* synthetic */ String f40825f;

        /* renamed from: o.pz7$g0$a */
        public static final class C16228a implements rl7 {

            /* renamed from: a */
            public static final C16228a f40826a = new C16228a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Leads - Attention", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str, Resources resources, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f40823d = str;
            this.f40824e = resources;
            this.f40825f = str2;
        }

        /* renamed from: m */
        public static final Leads m44441m(Contact contact) {
            sq8.m48646e(contact);
            return new LeadsSummary(contact).toLeads();
        }

        /* renamed from: o */
        public static final Leads m44442o(Contact contact) {
            sq8.m48646e(contact);
            return new LeadsSummary(contact).toLeads();
        }

        /* renamed from: q */
        public static final boolean m44443q(Leads leads) {
            return true;
        }

        /* renamed from: r */
        public static final Boolean m44444r(Leads leads, Leads leads2) {
            return Boolean.valueOf(sq8.m48644c(leads.getContactID(), leads2.getContactID()));
        }

        /* renamed from: s */
        public static final boolean m44445s(Leads leads) {
            String leadLifecycleStage = leads.getLeadLifecycleStage();
            if (leadLifecycleStage == null) {
                leadLifecycleStage = "";
            }
            return !e9g.m24597K(leadLifecycleStage, "UNCONTACTED", false, 2, null);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            g0 g0Var = pz7.this.new g0(this.f40823d, this.f40824e, this.f40825f, n64Var);
            g0Var.f40821b = obj;
            return g0Var;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:(3:(1:(1:7)(2:8|9))(3:10|38|11)|36|37)(1:15))(2:16|(1:18))|19|40|20|(1:24)|25|(1:27)|36|37|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
        
            r4 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f4 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            l1 l1VarM39161k;
            Object objM51918f = uq8.m51918f();
            int i = this.f40820a;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f40821b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40821b = ogaVar;
                this.f40820a = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        oga ogaVar2 = (oga) this.f40821b;
                        try {
                            wre.m54934b(obj);
                        } catch (Exception e) {
                            e = e;
                            yne.C18447a c18447a = yne.f55736e;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "Error Occurred!";
                            }
                            yne yneVarM58028a = c18447a.m58028a(null, message, e);
                            this.f40821b = null;
                            this.f40820a = 3;
                            if (ogaVar2.emit(yneVarM58028a, this) == objM51918f) {
                                return objM51918f;
                            }
                            return y3i.f54824a;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f40821b;
                wre.m54934b(obj);
            }
            oga ogaVar3 = ogaVar;
            Object objM47698c = c8a.e3(this.f40824e, Optional.ofNullable(this.f40825f), Optional.ofNullable(pz7.this.o0(this.f40823d, "ME")), 10).m47686M(C16228a.f40826a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            PaginatedDataModel paginatedDataModel = (PaginatedDataModel) objM47698c;
            mii miiVarY0 = pz7.this.y0();
            if (miiVarY0 != null && (l1VarM39161k = miiVarY0.m39161k()) != null) {
                uni uniVarKC = uni.kC();
                paginatedDataModel.setPaginatedTokenResultsUpdater(new PaginatedTokenResultsUpdater(uniVarKC.bC().R2(l1VarM39161k, new Function() { // from class: o.i08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return pz7.g0.m44441m((Contact) obj2);
                    }
                }), uniVarKC.bC().N2(l1VarM39161k, new Function() { // from class: o.j08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return pz7.g0.m44442o((Contact) obj2);
                    }
                }), new ggd() { // from class: o.k08
                    @Override // p001o.ggd
                    public final boolean test(Object obj2) {
                        return pz7.g0.m44443q((Leads) obj2);
                    }
                }, new jh1() { // from class: o.l08
                    @Override // p001o.jh1
                    public final Object apply(Object obj2, Object obj3) {
                        return pz7.g0.m44444r((Leads) obj2, (Leads) obj3);
                    }
                }, new ggd() { // from class: o.m08
                    @Override // p001o.ggd
                    public final boolean test(Object obj2) {
                        return pz7.g0.m44445s((Leads) obj2);
                    }
                }, ml1.m39301a(true), ml1.m39301a(false)));
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f40821b = ogaVar3;
            this.f40820a = 2;
            if (ogaVar3.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((g0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.pz7$h */
    public static final class C16229h extends jgg implements nl7 {

        /* renamed from: a */
        public int f40827a;

        /* renamed from: b */
        public /* synthetic */ Object f40828b;

        /* renamed from: c */
        public final /* synthetic */ Resources f40829c;

        /* renamed from: d */
        public final /* synthetic */ String f40830d;

        /* renamed from: e */
        public final /* synthetic */ String f40831e;

        /* renamed from: o.pz7$h$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f40832a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(String str) {
                return Boolean.valueOf(!StringUtils.isBlank(str));
            }
        }

        /* renamed from: o.pz7$h$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f40833a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads - Attention", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16229h(Resources resources, String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f40829c = resources;
            this.f40830d = str;
            this.f40831e = str2;
        }

        /* renamed from: h */
        public static final boolean m44449h(xk7 xk7Var, Object obj) {
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16229h c16229h = new C16229h(this.f40829c, this.f40830d, this.f40831e, n64Var);
            c16229h.f40828b = obj;
            return c16229h;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16229h) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40827a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40828b = null;
                this.f40827a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40828b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40828b = ogaVar2;
                this.f40827a = 1;
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
                    oga ogaVar3 = (oga) this.f40828b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40828b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Resources resources = this.f40829c;
            Optional optionalOfNullable = Optional.ofNullable(this.f40830d);
            final a aVar = a.f40832a;
            Object objM47698c = c8a.J2(resources, optionalOfNullable.filter(new Predicate() { // from class: o.tz7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pz7.C16229h.m44449h(aVar, obj2);
                }
            }), Optional.ofNullable(this.f40831e), 10).m47686M(b.f40833a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40828b = ogaVar;
            this.f40827a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class h0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40834a;

        /* renamed from: b */
        public /* synthetic */ Object f40835b;

        /* renamed from: d */
        public final /* synthetic */ String f40837d;

        /* renamed from: e */
        public final /* synthetic */ Resources f40838e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(String str, Resources resources, n64 n64Var) {
            super(2, n64Var);
            this.f40837d = str;
            this.f40838e = resources;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            h0 h0Var = pz7.this.new h0(this.f40837d, this.f40838e, n64Var);
            h0Var.f40835b = obj;
            return h0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((h0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40834a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40835b = null;
                this.f40834a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40835b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40835b = ogaVar2;
                this.f40834a = 1;
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
                    oga ogaVar3 = (oga) this.f40835b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40835b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = c8a.Q0(this.f40838e, Optional.empty(), ml1.m39301a(true), Optional.ofNullable(pz7.this.o0(this.f40837d, "ME"))).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f40835b = ogaVar;
            this.f40834a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$i */
    public static final class C16230i extends jgg implements nl7 {

        /* renamed from: a */
        public int f40839a;

        /* renamed from: b */
        public /* synthetic */ Object f40840b;

        /* renamed from: c */
        public final /* synthetic */ Resources f40841c;

        /* renamed from: d */
        public final /* synthetic */ String f40842d;

        /* renamed from: o.pz7$i$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f40843a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(String str) {
                return Boolean.valueOf(!StringUtils.isBlank(str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16230i(Resources resources, String str, n64 n64Var) {
            super(2, n64Var);
            this.f40841c = resources;
            this.f40842d = str;
        }

        /* renamed from: h */
        public static final boolean m44454h(xk7 xk7Var, Object obj) {
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16230i c16230i = new C16230i(this.f40841c, this.f40842d, n64Var);
            c16230i.f40840b = obj;
            return c16230i;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16230i) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40839a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40840b = null;
                this.f40839a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40840b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40840b = ogaVar2;
                this.f40839a = 1;
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
                    oga ogaVar3 = (oga) this.f40840b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40840b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Resources resources = this.f40841c;
            Optional optionalOfNullable = Optional.ofNullable(this.f40842d);
            final a aVar = a.f40843a;
            Object objM55727f = c8a.P0(resources, optionalOfNullable.filter(new Predicate() { // from class: o.uz7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pz7.C16230i.m44454h(aVar, obj2);
                }
            }), ml1.m39301a(false)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f40840b = ogaVar;
            this.f40839a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class i0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40844a;

        /* renamed from: b */
        public /* synthetic */ Object f40845b;

        /* renamed from: c */
        public final /* synthetic */ String f40846c;

        /* renamed from: o.pz7$i0$a */
        public static final class C16231a implements rl7 {

            /* renamed from: a */
            public static final C16231a f40847a = new C16231a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Overdue Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40846c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            i0 i0Var = new i0(this.f40846c, n64Var);
            i0Var.f40845b = obj;
            return i0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((i0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40844a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40845b = null;
                this.f40844a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40845b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40845b = ogaVar2;
                this.f40844a = 1;
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
                    oga ogaVar3 = (oga) this.f40845b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40845b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.l2(10, this.f40846c, true).m47686M(C16231a.f40847a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40845b = ogaVar;
            this.f40844a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$j */
    public static final class C16232j extends jgg implements nl7 {

        /* renamed from: a */
        public int f40848a;

        /* renamed from: b */
        public /* synthetic */ Object f40849b;

        /* renamed from: c */
        public final /* synthetic */ String f40850c;

        /* renamed from: o.pz7$j$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f40851a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Missed Visits", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16232j(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40850c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16232j c16232j = new C16232j(this.f40850c, n64Var);
            c16232j.f40849b = obj;
            return c16232j;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16232j) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40848a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40849b = null;
                this.f40848a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40849b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40849b = ogaVar2;
                this.f40848a = 1;
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
                    oga ogaVar3 = (oga) this.f40849b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40849b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.T1(this.f40850c, 10).m47686M(a.f40851a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40849b = ogaVar;
            this.f40848a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class j0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40852a;

        /* renamed from: b */
        public /* synthetic */ Object f40853b;

        /* renamed from: d */
        public final /* synthetic */ String f40855d;

        /* renamed from: e */
        public final /* synthetic */ Resources f40856e;

        /* renamed from: f */
        public final /* synthetic */ String f40857f;

        /* renamed from: o.pz7$j0$a */
        public static final class C16233a implements rl7 {

            /* renamed from: a */
            public static final C16233a f40858a = new C16233a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Leads - Attention", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str, Resources resources, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f40855d = str;
            this.f40856e = resources;
            this.f40857f = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            j0 j0Var = pz7.this.new j0(this.f40855d, this.f40856e, this.f40857f, n64Var);
            j0Var.f40853b = obj;
            return j0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((j0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40852a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40853b = null;
                this.f40852a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40853b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40853b = ogaVar2;
                this.f40852a = 1;
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
                    oga ogaVar3 = (oga) this.f40853b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40853b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = c8a.f3(this.f40856e, Optional.ofNullable(this.f40857f), Optional.ofNullable(pz7.this.p0(this.f40855d, "ME")), 10).m47686M(C16233a.f40858a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40853b = ogaVar;
            this.f40852a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$k */
    public static final class C16234k extends jgg implements nl7 {

        /* renamed from: a */
        public int f40859a;

        /* renamed from: b */
        public /* synthetic */ Object f40860b;

        /* renamed from: d */
        public final /* synthetic */ String f40862d;

        /* renamed from: e */
        public final /* synthetic */ String f40863e;

        /* renamed from: f */
        public final /* synthetic */ Resources f40864f;

        /* renamed from: g */
        public final /* synthetic */ String f40865g;

        /* renamed from: o.pz7$k$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f40866a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(String str) {
                return Boolean.valueOf(!StringUtils.isBlank(str));
            }
        }

        /* renamed from: o.pz7$k$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f40867a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads - Attention", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16234k(String str, String str2, Resources resources, String str3, n64 n64Var) {
            super(2, n64Var);
            this.f40862d = str;
            this.f40863e = str2;
            this.f40864f = resources;
            this.f40865g = str3;
        }

        /* renamed from: o */
        public static final boolean m44468o(xk7 xk7Var, Object obj) {
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        /* renamed from: q */
        public static final Leads m44469q(Contact contact) {
            sq8.m48646e(contact);
            return new LeadsSummary(contact).toLeads();
        }

        /* renamed from: r */
        public static final Leads m44470r(Contact contact) {
            sq8.m48646e(contact);
            return new LeadsSummary(contact).toLeads();
        }

        /* renamed from: s */
        public static final boolean m44471s(Leads leads) {
            return true;
        }

        /* renamed from: t */
        public static final Boolean m44472t(Leads leads, Leads leads2) {
            return Boolean.valueOf(sq8.m48644c(leads.getContactID(), leads2.getContactID()));
        }

        /* renamed from: u */
        public static final boolean m44473u(Leads leads) {
            String leadLifecycleStage = leads.getLeadLifecycleStage();
            if (leadLifecycleStage == null) {
                leadLifecycleStage = "";
            }
            return !e9g.m24597K(leadLifecycleStage, "UNCONTACTED", false, 2, null);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16234k c16234k = pz7.this.new C16234k(this.f40862d, this.f40863e, this.f40864f, this.f40865g, n64Var);
            c16234k.f40860b = obj;
            return c16234k;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:(3:(1:(1:7)(2:8|9))(3:10|50|11)|46|47)(1:15))(2:16|(1:18))|19|48|20|(1:26)(1:25)|(1:28)(1:29)|30|(1:34)|35|(1:37)|46|47|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00fe, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
        
            r4 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
        
            r7 = "Error Occurred!";
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
        
            return r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0118 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            l1 l1VarM39161k;
            Object objM51918f = uq8.m51918f();
            int i = this.f40859a;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f40860b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40860b = ogaVar;
                this.f40859a = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        oga ogaVar2 = (oga) this.f40860b;
                        try {
                            wre.m54934b(obj);
                        } catch (Exception e) {
                            e = e;
                            yne.C18447a c18447a = yne.f55736e;
                            String message = e.getMessage();
                            if (message == null) {
                            }
                            yne yneVarM58028a = c18447a.m58028a(null, message, e);
                            this.f40860b = null;
                            this.f40859a = 3;
                            if (ogaVar2.emit(yneVarM58028a, this) == objM51918f) {
                            }
                            return y3i.f54824a;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f40860b;
                wre.m54934b(obj);
            }
            oga ogaVar3 = ogaVar;
            pz7 pz7Var = pz7.this;
            String str = this.f40862d;
            String str2 = this.f40863e;
            ryh ryhVarO0 = pz7Var.o0(str, str2 == null || f9g.d0(str2) ? "ALL" : "TEAM");
            Resources resources = this.f40864f;
            Optional optionalOfNullable = Optional.ofNullable(this.f40863e);
            final a aVar = a.f40866a;
            Object objM47698c = c8a.K2(resources, optionalOfNullable.filter(new Predicate() { // from class: o.vz7
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pz7.C16234k.m44468o(aVar, obj2);
                }
            }), Optional.ofNullable(this.f40865g), Optional.ofNullable(ryhVarO0), 10).m47686M(b.f40867a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            PaginatedDataModel paginatedDataModel = (PaginatedDataModel) objM47698c;
            mii miiVarY0 = pz7.this.y0();
            if (miiVarY0 != null && (l1VarM39161k = miiVarY0.m39161k()) != null) {
                uni uniVarKC = uni.kC();
                paginatedDataModel.setPaginatedTokenResultsUpdater(new PaginatedTokenResultsUpdater(uniVarKC.bC().Q2(l1VarM39161k, new Function() { // from class: o.wz7
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return pz7.C16234k.m44469q((Contact) obj2);
                    }
                }), uniVarKC.bC().M2(l1VarM39161k, new Function() { // from class: o.xz7
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return pz7.C16234k.m44470r((Contact) obj2);
                    }
                }), new ggd() { // from class: o.yz7
                    @Override // p001o.ggd
                    public final boolean test(Object obj2) {
                        return pz7.C16234k.m44471s((Leads) obj2);
                    }
                }, new jh1() { // from class: o.zz7
                    @Override // p001o.jh1
                    public final Object apply(Object obj2, Object obj3) {
                        return pz7.C16234k.m44472t((Leads) obj2, (Leads) obj3);
                    }
                }, new ggd() { // from class: o.a08
                    @Override // p001o.ggd
                    public final boolean test(Object obj2) {
                        return pz7.C16234k.m44473u((Leads) obj2);
                    }
                }, ml1.m39301a(true), ml1.m39301a(false)));
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f40860b = ogaVar3;
            this.f40859a = 2;
            if (ogaVar3.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16234k) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final class k0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40868a;

        /* renamed from: b */
        public /* synthetic */ Object f40869b;

        /* renamed from: d */
        public final /* synthetic */ String f40871d;

        /* renamed from: e */
        public final /* synthetic */ Resources f40872e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String str, Resources resources, n64 n64Var) {
            super(2, n64Var);
            this.f40871d = str;
            this.f40872e = resources;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            k0 k0Var = pz7.this.new k0(this.f40871d, this.f40872e, n64Var);
            k0Var.f40869b = obj;
            return k0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((k0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40868a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40869b = null;
                this.f40868a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40869b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40869b = ogaVar2;
                this.f40868a = 1;
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
                    oga ogaVar3 = (oga) this.f40869b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40869b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = c8a.R0(this.f40872e, Optional.empty(), ml1.m39301a(true), Optional.ofNullable(pz7.this.p0(this.f40871d, "ME"))).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f40869b = ogaVar;
            this.f40868a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$l */
    public static final class C16235l extends jgg implements nl7 {

        /* renamed from: a */
        public int f40873a;

        /* renamed from: b */
        public /* synthetic */ Object f40874b;

        /* renamed from: d */
        public final /* synthetic */ String f40876d;

        /* renamed from: e */
        public final /* synthetic */ String f40877e;

        /* renamed from: f */
        public final /* synthetic */ Resources f40878f;

        /* renamed from: o.pz7$l$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f40879a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(String str) {
                return Boolean.valueOf(!StringUtils.isBlank(str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16235l(String str, String str2, Resources resources, n64 n64Var) {
            super(2, n64Var);
            this.f40876d = str;
            this.f40877e = str2;
            this.f40878f = resources;
        }

        /* renamed from: h */
        public static final boolean m44478h(xk7 xk7Var, Object obj) {
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16235l c16235l = pz7.this.new C16235l(this.f40876d, this.f40877e, this.f40878f, n64Var);
            c16235l.f40874b = obj;
            return c16235l;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16235l) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40873a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40874b = null;
                this.f40873a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40874b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40874b = ogaVar2;
                this.f40873a = 1;
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
                ogaVar = (oga) this.f40874b;
                wre.m54934b(obj);
            }
            pz7 pz7Var = pz7.this;
            String str = this.f40876d;
            String str2 = this.f40877e;
            if (str2 != null && !f9g.d0(str2)) {
                z = false;
            }
            ryh ryhVarO0 = pz7Var.o0(str, z ? "ALL" : "TEAM");
            Resources resources = this.f40878f;
            Optional optionalOfNullable = Optional.ofNullable(this.f40877e);
            final a aVar = a.f40879a;
            Object objM55727f = c8a.Q0(resources, optionalOfNullable.filter(new Predicate() { // from class: o.b08
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pz7.C16235l.m44478h(aVar, obj2);
                }
            }), ml1.m39301a(false), Optional.ofNullable(ryhVarO0)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f40874b = ogaVar;
            this.f40873a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class l0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40880a;

        /* renamed from: b */
        public /* synthetic */ Object f40881b;

        /* renamed from: c */
        public final /* synthetic */ String f40882c;

        /* renamed from: o.pz7$l0$a */
        public static final class C16236a implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ Map f40883a;

            /* renamed from: b */
            public final /* synthetic */ String f40884b;

            /* renamed from: o.pz7$l0$a$a */
            public static final class a extends kf9 implements xk7 {

                /* renamed from: a */
                public final /* synthetic */ Map f40885a;

                /* renamed from: b */
                public final /* synthetic */ String f40886b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Map map, String str) {
                    super(1);
                    this.f40885a = map;
                    this.f40886b = str;
                }

                @Override // p001o.xk7
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(LeadTeamMember leadTeamMember) {
                    return Boolean.valueOf(TeamMemberType.USER.name().equals(leadTeamMember.getMemberType()) && this.f40885a.containsKey(leadTeamMember.getUserId()) && !Objects.equals(leadTeamMember.getUserId(), this.f40886b));
                }
            }

            /* renamed from: o.pz7$l0$a$b */
            public static final class b extends kf9 implements xk7 {

                /* renamed from: a */
                public final /* synthetic */ Map f40887a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Map map) {
                    super(1);
                    this.f40887a = map;
                }

                @Override // p001o.xk7
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LeadsUser invoke(LeadTeamMember leadTeamMember) {
                    return (LeadsUser) this.f40887a.get(leadTeamMember.getUserId());
                }
            }

            public C16236a(Map map, String str) {
                this.f40883a = map;
                this.f40884b = str;
            }

            /* renamed from: d */
            public static final boolean m44487d(xk7 xk7Var, Object obj) {
                sq8.m48649h(xk7Var, "$tmp0");
                return ((Boolean) xk7Var.invoke(obj)).booleanValue();
            }

            /* renamed from: e */
            public static final LeadsUser m44488e(xk7 xk7Var, Object obj) {
                sq8.m48649h(xk7Var, "$tmp0");
                return (LeadsUser) xk7Var.invoke(obj);
            }

            @Override // p001o.rl7
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Set apply(List list) {
                sq8.m48649h(list, "it");
                Stream stream = list.stream();
                final a aVar = new a(this.f40883a, this.f40884b);
                Stream streamFilter = stream.filter(new Predicate() { // from class: o.p08
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return pz7.l0.C16236a.m44487d(aVar, obj);
                    }
                });
                final b bVar = new b(this.f40883a);
                return (Set) streamFilter.map(new Function() { // from class: o.q08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return pz7.l0.C16236a.m44488e(bVar, obj);
                    }
                }).collect(Collectors.toSet());
            }
        }

        /* renamed from: o.pz7$l0$b */
        public static final class C16237b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C16237b f40888a = new C16237b();

            public C16237b() {
                super(1);
            }

            @Override // p001o.xk7
            public final String invoke(LeadsUser leadsUser) {
                return leadsUser.getId();
            }
        }

        /* renamed from: o.pz7$l0$c */
        public static final class C16238c extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C16238c f40889a = new C16238c();

            public C16238c() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LeadsUser invoke(LeadsUser leadsUser) {
                return leadsUser;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40882c = str;
        }

        /* renamed from: i */
        public static final String m44482i(xk7 xk7Var, Object obj) {
            return (String) xk7Var.invoke(obj);
        }

        /* renamed from: k */
        public static final LeadsUser m44483k(xk7 xk7Var, Object obj) {
            return (LeadsUser) xk7Var.invoke(obj);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            l0 l0Var = new l0(this.f40882c, n64Var);
            l0Var.f40881b = obj;
            return l0Var;
        }

        @Override // p001o.nl7
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((l0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40880a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40881b = null;
                this.f40880a = 4;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40881b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40881b = ogaVar2;
                this.f40880a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3) {
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    if (r1 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f40881b;
                wre.m54934b(obj);
            }
            l1 l1VarTB = uni.kC().TB();
            String strEo = l1VarTB.Eo();
            AuthorizationLevel authorizationLevel = l1VarTB.oB().getAuthorizationLevel();
            if (authorizationLevel == AuthorizationLevel.ADMIN || authorizationLevel == AuthorizationLevel.SUPERADMIN) {
                yne yneVarM58030d = yne.f55736e.m58030d(lpi.m37621V(this.f40882c));
                this.f40881b = ogaVar;
                this.f40880a = 2;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                Stream stream = lpi.m37620U(this.f40882c).stream();
                final C16237b c16237b = C16237b.f40888a;
                Function function = new Function() { // from class: o.n08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return pz7.l0.m44482i(c16237b, obj2);
                    }
                };
                final C16238c c16238c = C16238c.f40889a;
                Set<LeadsUser> set = (Set) o4h.m41546J(strEo).d0(new C16236a((Map) stream.collect(Collectors.toMap(function, new Function() { // from class: o.o08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return pz7.l0.m44483k(c16238c, obj2);
                    }
                })), strEo)).m55727f();
                ArrayList arrayList = new ArrayList();
                sq8.m48646e(set);
                for (LeadsUser leadsUser : set) {
                    if (leadsUser != null) {
                        arrayList.add(leadsUser);
                    }
                }
                yne yneVarM58030d2 = yne.f55736e.m58030d(arrayList);
                this.f40881b = ogaVar;
                this.f40880a = 3;
                if (ogaVar.emit(yneVarM58030d2, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$m */
    public static final class C16239m extends jgg implements nl7 {

        /* renamed from: a */
        public int f40890a;

        /* renamed from: b */
        public /* synthetic */ Object f40891b;

        /* renamed from: c */
        public final /* synthetic */ String f40892c;

        /* renamed from: o.pz7$m$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f40893a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Overdue Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16239m(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40892c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16239m c16239m = new C16239m(this.f40892c, n64Var);
            c16239m.f40891b = obj;
            return c16239m;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16239m) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40890a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40891b = null;
                this.f40890a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40891b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40891b = ogaVar2;
                this.f40890a = 1;
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
                    oga ogaVar3 = (oga) this.f40891b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40891b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.l2(10, this.f40892c, false).m47686M(a.f40893a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40891b = ogaVar;
            this.f40890a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class m0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40894a;

        /* renamed from: b */
        public /* synthetic */ Object f40895b;

        /* renamed from: c */
        public final /* synthetic */ String f40896c;

        /* renamed from: d */
        public final /* synthetic */ ActivityMetrics.Period f40897d;

        /* renamed from: o.pz7$m0$a */
        public static final class C16240a implements rl7 {

            /* renamed from: a */
            public static final C16240a f40898a = new C16240a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Overdue Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(String str, ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f40896c = str;
            this.f40897d = period;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            m0 m0Var = new m0(this.f40896c, this.f40897d, n64Var);
            m0Var.f40895b = obj;
            return m0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((m0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40894a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40895b = null;
                this.f40894a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40895b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40895b = ogaVar2;
                this.f40894a = 1;
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
                    oga ogaVar3 = (oga) this.f40895b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40895b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.X1(10, this.f40896c, true, this.f40897d).m47686M(C16240a.f40898a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40895b = ogaVar;
            this.f40894a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$n */
    public static final class C16241n extends jgg implements nl7 {

        /* renamed from: a */
        public int f40899a;

        /* renamed from: b */
        public /* synthetic */ Object f40900b;

        /* renamed from: d */
        public final /* synthetic */ String f40902d;

        /* renamed from: e */
        public final /* synthetic */ String f40903e;

        /* renamed from: f */
        public final /* synthetic */ Resources f40904f;

        /* renamed from: g */
        public final /* synthetic */ String f40905g;

        /* renamed from: o.pz7$n$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f40906a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(String str) {
                return Boolean.valueOf(!StringUtils.isBlank(str));
            }
        }

        /* renamed from: o.pz7$n$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f40907a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads - Attention", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16241n(String str, String str2, Resources resources, String str3, n64 n64Var) {
            super(2, n64Var);
            this.f40902d = str;
            this.f40903e = str2;
            this.f40904f = resources;
            this.f40905g = str3;
        }

        /* renamed from: h */
        public static final boolean m44498h(xk7 xk7Var, Object obj) {
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16241n c16241n = pz7.this.new C16241n(this.f40902d, this.f40903e, this.f40904f, this.f40905g, n64Var);
            c16241n.f40900b = obj;
            return c16241n;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16241n) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40899a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40900b = null;
                this.f40899a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40900b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40900b = ogaVar2;
                this.f40899a = 1;
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
                ogaVar = (oga) this.f40900b;
                wre.m54934b(obj);
            }
            pz7 pz7Var = pz7.this;
            String str = this.f40902d;
            String str2 = this.f40903e;
            if (str2 != null && !f9g.d0(str2)) {
                z = false;
            }
            ryh ryhVarP0 = pz7Var.p0(str, z ? "ALL" : "TEAM");
            Resources resources = this.f40904f;
            Optional optionalOfNullable = Optional.ofNullable(this.f40903e);
            final a aVar = a.f40906a;
            Object objM47698c = c8a.L2(resources, optionalOfNullable.filter(new Predicate() { // from class: o.c08
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pz7.C16241n.m44498h(aVar, obj2);
                }
            }), Optional.ofNullable(this.f40905g), Optional.ofNullable(ryhVarP0), 10).m47686M(b.f40907a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40900b = ogaVar;
            this.f40899a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class n0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40908a;

        /* renamed from: b */
        public /* synthetic */ Object f40909b;

        /* renamed from: c */
        public final /* synthetic */ Integer f40910c;

        /* renamed from: o.pz7$n0$a */
        public static final class C16242a implements rl7 {

            /* renamed from: a */
            public static final C16242a f40911a = new C16242a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Activities", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(Integer num, n64 n64Var) {
            super(2, n64Var);
            this.f40910c = num;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            n0 n0Var = new n0(this.f40910c, n64Var);
            n0Var.f40909b = obj;
            return n0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((n0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40908a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40909b = null;
                this.f40908a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40909b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40909b = ogaVar2;
                this.f40908a = 1;
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
                    oga ogaVar3 = (oga) this.f40909b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40909b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Integer num = this.f40910c;
            sq8.m48646e(num);
            Object objM47698c = mrg.i2(num.intValue()).m47686M(C16242a.f40911a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40909b = ogaVar;
            this.f40908a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$o */
    public static final class C16243o extends jgg implements nl7 {

        /* renamed from: a */
        public int f40912a;

        /* renamed from: b */
        public /* synthetic */ Object f40913b;

        /* renamed from: d */
        public final /* synthetic */ String f40915d;

        /* renamed from: e */
        public final /* synthetic */ String f40916e;

        /* renamed from: f */
        public final /* synthetic */ Resources f40917f;

        /* renamed from: o.pz7$o$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f40918a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final Boolean invoke(String str) {
                return Boolean.valueOf(!StringUtils.isBlank(str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16243o(String str, String str2, Resources resources, n64 n64Var) {
            super(2, n64Var);
            this.f40915d = str;
            this.f40916e = str2;
            this.f40917f = resources;
        }

        /* renamed from: h */
        public static final boolean m44504h(xk7 xk7Var, Object obj) {
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16243o c16243o = pz7.this.new C16243o(this.f40915d, this.f40916e, this.f40917f, n64Var);
            c16243o.f40913b = obj;
            return c16243o;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16243o) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40912a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40913b = null;
                this.f40912a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40913b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40913b = ogaVar2;
                this.f40912a = 1;
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
                ogaVar = (oga) this.f40913b;
                wre.m54934b(obj);
            }
            pz7 pz7Var = pz7.this;
            String str = this.f40915d;
            String str2 = this.f40916e;
            if (str2 != null && !f9g.d0(str2)) {
                z = false;
            }
            ryh ryhVarP0 = pz7Var.p0(str, z ? "ALL" : "TEAM");
            Resources resources = this.f40917f;
            Optional optionalOfNullable = Optional.ofNullable(this.f40916e);
            final a aVar = a.f40918a;
            Object objM55727f = c8a.R0(resources, optionalOfNullable.filter(new Predicate() { // from class: o.d08
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pz7.C16243o.m44504h(aVar, obj2);
                }
            }), ml1.m39301a(false), Optional.ofNullable(ryhVarP0)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f40913b = ogaVar;
            this.f40912a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class o0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40919a;

        /* renamed from: b */
        public /* synthetic */ Object f40920b;

        /* renamed from: c */
        public final /* synthetic */ String f40921c;

        /* renamed from: o.pz7$o0$a */
        public static final class C16244a implements rl7 {

            /* renamed from: a */
            public static final C16244a f40922a = new C16244a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Unassigned Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40921c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            o0 o0Var = new o0(this.f40921c, n64Var);
            o0Var.f40920b = obj;
            return o0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((o0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40919a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40920b = null;
                this.f40919a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40920b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40920b = ogaVar2;
                this.f40919a = 1;
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
                    oga ogaVar3 = (oga) this.f40920b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40920b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.q2(10, this.f40921c, true).m47686M(C16244a.f40922a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40920b = ogaVar;
            this.f40919a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$p */
    public static final class C16245p extends jgg implements nl7 {

        /* renamed from: a */
        public int f40923a;

        /* renamed from: b */
        public /* synthetic */ Object f40924b;

        /* renamed from: c */
        public final /* synthetic */ String f40925c;

        /* renamed from: d */
        public final /* synthetic */ ActivityMetrics.Period f40926d;

        /* renamed from: o.pz7$p$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f40927a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Overdue Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16245p(String str, ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f40925c = str;
            this.f40926d = period;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16245p c16245p = new C16245p(this.f40925c, this.f40926d, n64Var);
            c16245p.f40924b = obj;
            return c16245p;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16245p) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40923a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40924b = null;
                this.f40923a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40924b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40924b = ogaVar2;
                this.f40923a = 1;
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
                    oga ogaVar3 = (oga) this.f40924b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40924b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.X1(10, this.f40925c, false, this.f40926d).m47686M(a.f40927a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40924b = ogaVar;
            this.f40923a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class p0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40928a;

        /* renamed from: b */
        public /* synthetic */ Object f40929b;

        /* renamed from: d */
        public final /* synthetic */ String f40931d;

        /* renamed from: e */
        public final /* synthetic */ ActivityMetrics.Period f40932e;

        /* renamed from: o.pz7$p0$a */
        public static final class C16246a implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ pz7 f40933a;

            /* renamed from: b */
            public final /* synthetic */ String f40934b;

            public C16246a(pz7 pz7Var, String str) {
                this.f40933a = pz7Var;
                this.f40934b = str;
            }

            /* renamed from: c */
            public static final ActivityMetrics m44514c(RealTimeMetrics realTimeMetrics) {
                return new ActivityMetrics(realTimeMetrics);
            }

            @Override // p001o.rl7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x8c apply(cz4 cz4Var) {
                sq8.m48649h(cz4Var, "it");
                l1 l1VarM44380N = this.f40933a.m44380N();
                String str = this.f40934b;
                return cz4Var.Y2(l1VarM44380N, str, Arrays.asList(str), new Function() { // from class: o.s08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return pz7.p0.C16246a.m44514c((RealTimeMetrics) obj);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(String str, ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f40931d = str;
            this.f40932e = period;
        }

        /* renamed from: h */
        public static final HomeTasksStatus m44511h(pz7 pz7Var, ActivityMetrics.Period period, ActivityMetrices activityMetrices) {
            sq8.m48646e(activityMetrices);
            return new HomeTasksStatus(pz7Var.m44392i(activityMetrices, period), pz7Var.m44395l(activityMetrices, period), pz7Var.m44396m(activityMetrices, period), pz7Var.m44393j(activityMetrices, period), period, false, 32, null);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            p0 p0Var = pz7.this.new p0(this.f40931d, this.f40932e, n64Var);
            p0Var.f40929b = obj;
            return p0Var;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((p0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40928a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40929b = null;
                this.f40928a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40929b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40929b = ogaVar2;
                this.f40928a = 1;
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
                    oga ogaVar3 = (oga) this.f40929b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40929b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = pz7.this.m44403u().m50381A(this.f40931d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            final pz7 pz7Var = pz7.this;
            final ActivityMetrics.Period period = this.f40932e;
            yne yneVarM58030d = yne.f55736e.m58030d(new nz7((ActivityMetrices) objM55727f, new Function() { // from class: o.r08
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return pz7.p0.m44511h(pz7Var, period, (ActivityMetrices) obj2);
                }
            }, pz7.this.m44382P().m55717M(new C16246a(pz7.this, this.f40931d))));
            this.f40929b = ogaVar;
            this.f40928a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$q */
    public static final class C16247q extends jgg implements nl7 {

        /* renamed from: a */
        public int f40935a;

        /* renamed from: b */
        public /* synthetic */ Object f40936b;

        /* renamed from: c */
        public final /* synthetic */ String f40937c;

        /* renamed from: o.pz7$q$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f40938a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Unassigned Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16247q(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40937c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16247q c16247q = new C16247q(this.f40937c, n64Var);
            c16247q.f40936b = obj;
            return c16247q;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16247q) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40935a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40936b = null;
                this.f40935a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40936b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40936b = ogaVar2;
                this.f40935a = 1;
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
                    oga ogaVar3 = (oga) this.f40936b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40936b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.q2(10, this.f40937c, false).m47686M(a.f40938a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40936b = ogaVar;
            this.f40935a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class q0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40939a;

        /* renamed from: b */
        public /* synthetic */ Object f40940b;

        /* renamed from: d */
        public final /* synthetic */ Resources f40942d;

        /* renamed from: e */
        public final /* synthetic */ String f40943e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(Resources resources, String str, n64 n64Var) {
            super(2, n64Var);
            this.f40942d = resources;
            this.f40943e = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            q0 q0Var = pz7.this.new q0(this.f40942d, this.f40943e, n64Var);
            q0Var.f40940b = obj;
            return q0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((q0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|37|(1:(3:(1:(1:7)(2:8|9))(2:10|11)|34|35)(1:15))(2:16|(1:18)(1:19))|40|20|(3:38|22|(1:24))|28|(1:30)|34|35|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            r9 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            yne yneVarM58030d;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40939a;
            try {
            } catch (Exception e) {
                r1.getClass();
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't load home progress list", e);
                this.f40940b = null;
                this.f40939a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40940b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40940b = ogaVar2;
                this.f40939a = 1;
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
                ogaVar = (oga) this.f40940b;
                wre.m54934b(obj);
            }
            ss9 ss9VarJ0 = PropertyDefinitionRepository.o0().j0();
            if (ss9VarJ0 != null) {
                try {
                    x6c x6cVarM48868k = ss9VarJ0.m48868k();
                    if (x6cVarM48868k != null) {
                    }
                } catch (Exception unused) {
                    ogaVar.getClass();
                    yneVarM58030d = yne.f55736e.m58030d(pz7.this.m44400q(this.f40942d, this.f40943e, ss9VarJ0));
                    this.f40940b = ogaVar;
                    this.f40939a = 2;
                    if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    }
                    return y3i.f54824a;
                }
            }
            yneVarM58030d = yne.f55736e.m58030d(pz7.this.m44400q(this.f40942d, this.f40943e, ss9VarJ0));
            this.f40940b = ogaVar;
            this.f40939a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$r */
    public static final class C16248r extends jgg implements nl7 {

        /* renamed from: a */
        public int f40944a;

        /* renamed from: b */
        public /* synthetic */ Object f40945b;

        /* renamed from: c */
        public final /* synthetic */ String f40946c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16248r(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40946c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16248r c16248r = new C16248r(this.f40946c, n64Var);
            c16248r.f40945b = obj;
            return c16248r;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16248r) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40944a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40945b = null;
                this.f40944a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40945b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40945b = ogaVar2;
                this.f40944a = 1;
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
                    oga ogaVar3 = (oga) this.f40945b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40945b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(lpi.m37621V(this.f40946c));
            this.f40945b = ogaVar;
            this.f40944a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class r0 implements rl7 {

        /* renamed from: a */
        public static final r0 f40947a = new r0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int[] apply(Object[] objArr) {
            sq8.m48649h(objArr, "results");
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                arrayList.add(Integer.valueOf(num != null ? num.intValue() : 0));
            }
            return kh3.P0(arrayList);
        }
    }

    /* renamed from: o.pz7$s */
    public static final class C16249s extends jgg implements nl7 {

        /* renamed from: a */
        public int f40948a;

        /* renamed from: b */
        public /* synthetic */ Object f40949b;

        /* renamed from: o.pz7$s$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f40950a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("Comments To Me", paginatedTokenResults);
            }
        }

        public C16249s(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16249s c16249s = new C16249s(n64Var);
            c16249s.f40949b = obj;
            return c16249s;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16249s) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40948a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40949b = null;
                this.f40948a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40949b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40949b = ogaVar2;
                this.f40948a = 1;
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
                    oga ogaVar3 = (oga) this.f40949b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40949b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = tj3.m49964n(vgf.m52765k().m27894u(), 10).m47686M(a.f40950a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            vgf.m52765k().a0();
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40949b = ogaVar;
            this.f40948a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class s0 implements rl7 {

        /* renamed from: a */
        public static final s0 f40951a = new s0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(th);
            return 0;
        }
    }

    /* renamed from: o.pz7$t */
    public static final class C16250t extends jgg implements nl7 {

        /* renamed from: a */
        public int f40952a;

        /* renamed from: b */
        public /* synthetic */ Object f40953b;

        /* renamed from: c */
        public final /* synthetic */ boolean f40954c;

        /* renamed from: d */
        public final /* synthetic */ pz7 f40955d;

        /* renamed from: e */
        public final /* synthetic */ String f40956e;

        /* renamed from: f */
        public final /* synthetic */ ActivityMetrics.Period f40957f;

        /* renamed from: o.pz7$t$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ pz7 f40958a;

            public a(pz7 pz7Var) {
                this.f40958a = pz7Var;
            }

            /* renamed from: c */
            public static final ActivityMetrics m44528c(RealTimeMetrics realTimeMetrics) {
                return new ActivityMetrics(realTimeMetrics);
            }

            @Override // p001o.rl7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x8c apply(cz4 cz4Var) {
                sq8.m48649h(cz4Var, "it");
                return cz4Var.W2(this.f40958a.m44380N(), new Function() { // from class: o.f08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return pz7.C16250t.a.m44528c((RealTimeMetrics) obj);
                    }
                });
            }
        }

        /* renamed from: o.pz7$t$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ pz7 f40959a;

            public b(pz7 pz7Var) {
                this.f40959a = pz7Var;
            }

            /* renamed from: c */
            public static final ActivityMetrics m44531c(RealTimeMetrics realTimeMetrics) {
                return new ActivityMetrics(realTimeMetrics);
            }

            @Override // p001o.rl7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x8c apply(cz4 cz4Var) {
                sq8.m48649h(cz4Var, "it");
                return cz4Var.X2(this.f40959a.m44380N(), new Function() { // from class: o.g08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return pz7.C16250t.b.m44531c((RealTimeMetrics) obj);
                    }
                });
            }
        }

        /* renamed from: o.pz7$t$c */
        public static final class c implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ pz7 f40960a;

            /* renamed from: b */
            public final /* synthetic */ String f40961b;

            public c(pz7 pz7Var, String str) {
                this.f40960a = pz7Var;
                this.f40961b = str;
            }

            /* renamed from: c */
            public static final ActivityMetrics m44534c(RealTimeMetrics realTimeMetrics) {
                return new ActivityMetrics(realTimeMetrics);
            }

            @Override // p001o.rl7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x8c apply(cz4 cz4Var) {
                sq8.m48649h(cz4Var, "it");
                l1 l1VarM44380N = this.f40960a.m44380N();
                String str = this.f40961b;
                return cz4Var.Y2(l1VarM44380N, str, Arrays.asList(str), new Function() { // from class: o.h08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return pz7.C16250t.c.m44534c((RealTimeMetrics) obj);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16250t(boolean z, pz7 pz7Var, String str, ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f40954c = z;
            this.f40955d = pz7Var;
            this.f40956e = str;
            this.f40957f = period;
        }

        /* renamed from: h */
        public static final HomeTasksStatus m44525h(pz7 pz7Var, ActivityMetrics.Period period, ActivityMetrices activityMetrices) {
            sq8.m48646e(activityMetrices);
            return new HomeTasksStatus(pz7Var.m44392i(activityMetrices, period), pz7Var.m44394k(activityMetrices, period), pz7Var.m44396m(activityMetrices, period), pz7Var.m44393j(activityMetrices, period), period, false, 32, null);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16250t c16250t = new C16250t(this.f40954c, this.f40955d, this.f40956e, this.f40957f, n64Var);
            c16250t.f40953b = obj;
            return c16250t;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16250t) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            ActivityMetrices activityMetrices;
            x6c x6cVarM55717M;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40952a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40953b = null;
                this.f40952a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40953b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40953b = ogaVar2;
                this.f40952a = 1;
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
                ogaVar = (oga) this.f40953b;
                wre.m54934b(obj);
            }
            if (this.f40954c) {
                Object objM55727f = this.f40955d.m44403u().m50385s().m55727f();
                sq8.m48648g(objM55727f, "blockingFirst(...)");
                activityMetrices = (ActivityMetrices) objM55727f;
            } else {
                String str = this.f40956e;
                if (str == null || f9g.d0(str)) {
                    Object objM55727f2 = this.f40955d.m44403u().m50391z().m55727f();
                    sq8.m48648g(objM55727f2, "blockingFirst(...)");
                    activityMetrices = (ActivityMetrices) objM55727f2;
                } else {
                    Object objM55727f3 = this.f40955d.m44403u().m50381A(this.f40956e).m55727f();
                    sq8.m48648g(objM55727f3, "blockingFirst(...)");
                    activityMetrices = (ActivityMetrices) objM55727f3;
                }
            }
            if (this.f40954c) {
                x6cVarM55717M = this.f40955d.m44382P().m55717M(new a(this.f40955d));
                sq8.m48648g(x6cVarM55717M, "flatMap(...)");
            } else {
                String str2 = this.f40956e;
                if (str2 != null && !f9g.d0(str2)) {
                    z = false;
                }
                if (z) {
                    x6cVarM55717M = this.f40955d.m44382P().m55717M(new b(this.f40955d));
                    sq8.m48648g(x6cVarM55717M, "flatMap(...)");
                } else {
                    x6cVarM55717M = this.f40955d.m44382P().m55717M(new c(this.f40955d, this.f40956e));
                    sq8.m48648g(x6cVarM55717M, "flatMap(...)");
                }
            }
            final pz7 pz7Var = this.f40955d;
            final ActivityMetrics.Period period = this.f40957f;
            yne yneVarM58030d = yne.f55736e.m58030d(new nz7(activityMetrices, new Function() { // from class: o.e08
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return pz7.C16250t.m44525h(pz7Var, period, (ActivityMetrices) obj2);
                }
            }, x6cVarM55717M));
            this.f40953b = ogaVar;
            this.f40952a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class t0 implements rl7 {

        /* renamed from: a */
        public static final t0 f40962a = new t0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(th);
            return 0;
        }
    }

    /* renamed from: o.pz7$u */
    public static final class C16251u extends jgg implements nl7 {

        /* renamed from: a */
        public int f40963a;

        /* renamed from: b */
        public /* synthetic */ Object f40964b;

        /* renamed from: d */
        public final /* synthetic */ Resources f40966d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16251u(Resources resources, n64 n64Var) {
            super(2, n64Var);
            this.f40966d = resources;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16251u c16251u = pz7.this.new C16251u(this.f40966d, n64Var);
            c16251u.f40964b = obj;
            return c16251u;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16251u) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|37|(1:(3:(1:(1:7)(2:8|9))(2:10|11)|34|35)(1:15))(2:16|(1:18)(1:19))|40|20|(3:38|22|(1:24))|28|(1:30)|34|35|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        
            r8 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            yne yneVarM58030d;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40963a;
            try {
            } catch (Exception e) {
                r1.getClass();
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't load home progress list", e);
                this.f40964b = null;
                this.f40963a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40964b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40964b = ogaVar2;
                this.f40963a = 1;
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
                ogaVar = (oga) this.f40964b;
                wre.m54934b(obj);
            }
            ss9 ss9VarJ0 = PropertyDefinitionRepository.o0().j0();
            if (ss9VarJ0 != null) {
                try {
                    x6c x6cVarM48868k = ss9VarJ0.m48868k();
                    if (x6cVarM48868k != null) {
                    }
                } catch (Exception unused) {
                    ogaVar.getClass();
                    yneVarM58030d = yne.f55736e.m58030d(pz7.this.m44399p(this.f40966d, ss9VarJ0));
                    this.f40964b = ogaVar;
                    this.f40963a = 2;
                    if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    }
                    return y3i.f54824a;
                }
            }
            yneVarM58030d = yne.f55736e.m58030d(pz7.this.m44399p(this.f40966d, ss9VarJ0));
            this.f40964b = ogaVar;
            this.f40963a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class u0 implements rl7 {

        /* renamed from: a */
        public static final u0 f40967a = new u0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(th);
            return 0;
        }
    }

    /* renamed from: o.pz7$v */
    public static final class C16252v implements rl7 {

        /* renamed from: a */
        public static final C16252v f40968a = new C16252v();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int[] apply(Object[] objArr) {
            sq8.m48649h(objArr, "results");
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                arrayList.add(Integer.valueOf(num != null ? num.intValue() : 0));
            }
            return kh3.P0(arrayList);
        }
    }

    public static final class v0 implements rl7 {

        /* renamed from: a */
        public static final v0 f40969a = new v0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(th);
            return 0;
        }
    }

    /* renamed from: o.pz7$w */
    public static final class C16253w implements rl7 {

        /* renamed from: a */
        public static final C16253w f40970a = new C16253w();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(th);
            return 0;
        }
    }

    public static final class w0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40971a;

        /* renamed from: b */
        public /* synthetic */ Object f40972b;

        /* renamed from: d */
        public final /* synthetic */ String f40974d;

        /* renamed from: e */
        public final /* synthetic */ ActivityMetrics.Period f40975e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str, ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f40974d = str;
            this.f40975e = period;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            w0 w0Var = pz7.this.new w0(this.f40974d, this.f40975e, n64Var);
            w0Var.f40972b = obj;
            return w0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((w0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40971a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40972b = null;
                this.f40971a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40972b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40972b = ogaVar2;
                this.f40971a = 1;
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
                    oga ogaVar3 = (oga) this.f40972b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40972b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = pz7.this.m44403u().m50390y(this.f40974d, this.f40975e).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((LeaderboardActivityMetrices) objM55727f);
            this.f40972b = ogaVar;
            this.f40971a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$x */
    public static final class C16254x implements rl7 {

        /* renamed from: a */
        public static final C16254x f40976a = new C16254x();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(th);
            return 0;
        }
    }

    public static final class x0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40977a;

        /* renamed from: b */
        public /* synthetic */ Object f40978b;

        /* renamed from: c */
        public final /* synthetic */ String f40979c;

        /* renamed from: o.pz7$x0$a */
        public static final class C16255a implements rl7 {

            /* renamed from: a */
            public static final C16255a f40980a = new C16255a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("Unassigned Leads", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(String str, n64 n64Var) {
            super(2, n64Var);
            this.f40979c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            x0 x0Var = new x0(this.f40979c, n64Var);
            x0Var.f40978b = obj;
            return x0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((x0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40977a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40978b = null;
                this.f40977a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40978b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40978b = ogaVar2;
                this.f40977a = 1;
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
                    oga ogaVar3 = (oga) this.f40978b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40978b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = iu9.k0(this.f40979c, 10).m47686M(C16255a.f40980a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f40978b = ogaVar;
            this.f40977a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$y */
    public static final class C16256y implements rl7 {

        /* renamed from: a */
        public static final C16256y f40981a = new C16256y();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(th);
            return 0;
        }
    }

    public static final class y0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f40982a;

        /* renamed from: b */
        public /* synthetic */ Object f40983b;

        /* renamed from: d */
        public final /* synthetic */ String f40985d;

        /* renamed from: e */
        public final /* synthetic */ ActivityMetrics.Period f40986e;

        /* renamed from: o.pz7$y0$a */
        public static final class C16257a implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ pz7 f40987a;

            /* renamed from: b */
            public final /* synthetic */ String f40988b;

            public C16257a(pz7 pz7Var, String str) {
                this.f40987a = pz7Var;
                this.f40988b = str;
            }

            /* renamed from: c */
            public static final ActivityMetrics m44551c(RealTimeMetrics realTimeMetrics) {
                return new ActivityMetrics(realTimeMetrics);
            }

            @Override // p001o.rl7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x8c apply(cz4 cz4Var) {
                sq8.m48649h(cz4Var, "it");
                return cz4Var.Z2(this.f40987a.m44380N(), this.f40988b, new Function() { // from class: o.u08
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return pz7.y0.C16257a.m44551c((RealTimeMetrics) obj);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(String str, ActivityMetrics.Period period, n64 n64Var) {
            super(2, n64Var);
            this.f40985d = str;
            this.f40986e = period;
        }

        /* renamed from: h */
        public static final HomeTasksStatus m44548h(pz7 pz7Var, ActivityMetrics.Period period, ActivityMetrices activityMetrices) {
            sq8.m48646e(activityMetrices);
            return new HomeTasksStatus(pz7Var.m44392i(activityMetrices, period), pz7Var.m44395l(activityMetrices, period), pz7Var.m44396m(activityMetrices, period), pz7Var.m44393j(activityMetrices, period), period, false, 32, null);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            y0 y0Var = pz7.this.new y0(this.f40985d, this.f40986e, n64Var);
            y0Var.f40983b = obj;
            return y0Var;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((y0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f40982a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f40983b = null;
                this.f40982a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f40983b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40983b = ogaVar2;
                this.f40982a = 1;
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
                    oga ogaVar3 = (oga) this.f40983b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f40983b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = pz7.this.m44403u().m50382B(this.f40985d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            final pz7 pz7Var = pz7.this;
            final ActivityMetrics.Period period = this.f40986e;
            yne yneVarM58030d = yne.f55736e.m58030d(new nz7((ActivityMetrices) objM55727f, new Function() { // from class: o.t08
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return pz7.y0.m44548h(pz7Var, period, (ActivityMetrices) obj2);
                }
            }, pz7.this.m44382P().m55717M(new C16257a(pz7.this, this.f40985d))));
            this.f40983b = ogaVar;
            this.f40982a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pz7$z */
    public static final class C16258z implements rl7 {

        /* renamed from: a */
        public static final C16258z f40989a = new C16258z();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Throwable th) {
            sq8.m48649h(th, "it");
            FirebaseCrashlytics.getInstance().recordException(th);
            return 0;
        }
    }

    public static final class z0 extends jgg implements nl7 {

        /* renamed from: a */
        public Object f40990a;

        /* renamed from: b */
        public int f40991b;

        /* renamed from: c */
        public /* synthetic */ Object f40992c;

        /* renamed from: d */
        public final /* synthetic */ Context f40993d;

        /* renamed from: e */
        public final /* synthetic */ pz7 f40994e;

        /* renamed from: f */
        public final /* synthetic */ String f40995f;

        /* renamed from: g */
        public final /* synthetic */ String f40996g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(Context context, pz7 pz7Var, String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f40993d = context;
            this.f40994e = pz7Var;
            this.f40995f = str;
            this.f40996g = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            z0 z0Var = new z0(this.f40993d, this.f40994e, this.f40995f, this.f40996g, n64Var);
            z0Var.f40992c = obj;
            return z0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((z0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:17:0x0036, B:30:0x0077, B:32:0x008a, B:34:0x0090, B:36:0x0097, B:38:0x009d), top: B:50:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:17:0x0036, B:30:0x0077, B:32:0x008a, B:34:0x0090, B:36:0x0097, B:38:0x009d), top: B:50:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            JsonObject jsonObject;
            oga ogaVar2;
            yne yneVarM58030d;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f40991b;
            try {
            } catch (Exception e) {
                e = e;
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar3 = (oga) this.f40992c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f40992c = ogaVar3;
                this.f40991b = 1;
                if (ogaVar3.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar3;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 == 3) {
                            wre.m54934b(obj);
                        } else {
                            if (r1 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            wre.m54934b(obj);
                        }
                        return y3i.f54824a;
                    }
                    jsonObject = (JsonObject) this.f40990a;
                    ogaVar2 = (oga) this.f40992c;
                    try {
                        wre.m54934b(obj);
                        jsonObject.addProperty("requestedDeviceId", (String) obj);
                        jq5 jq5VarM46258b = r6d.f43055a.m46258b(this.f40993d);
                        jsonObject.addProperty("deviceModel", jq5VarM46258b == null ? jq5VarM46258b.m34271a() : null);
                        jsonObject.addProperty("osVersion", jq5VarM46258b == null ? jq5VarM46258b.m34272b() : null);
                        Object objM55727f = this.f40994e.m44380N().Xw(this.f40994e.m44380N(), this.f40995f, this.f40996g, jsonObject.toString()).m55727f();
                        sq8.m48648g(objM55727f, "blockingFirst(...)");
                        yneVarM58030d = yne.f55736e.m58030d((SelfRegisterDeviceMutation.SelfRegisterDevice) objM55727f);
                        this.f40992c = ogaVar2;
                        this.f40990a = null;
                        this.f40991b = 3;
                        if (ogaVar2.emit(yneVarM58030d, this) == objM51918f) {
                            return objM51918f;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r1 = ogaVar2;
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "Error Occurred!";
                        }
                        yne yneVarM58028a = c18447a.m58028a(null, message, e);
                        this.f40992c = null;
                        this.f40990a = null;
                        this.f40991b = 4;
                        if (r1.emit(yneVarM58028a, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f40992c;
                wre.m54934b(obj);
            }
            JsonObject jsonObject2 = new JsonObject();
            s07 s07Var = s07.f44359a;
            this.f40992c = ogaVar;
            this.f40990a = jsonObject2;
            this.f40991b = 2;
            Object objM47375d = s07Var.m47375d(this);
            if (objM47375d == objM51918f) {
                return objM51918f;
            }
            oga ogaVar4 = ogaVar;
            jsonObject = jsonObject2;
            obj = objM47375d;
            ogaVar2 = ogaVar4;
            jsonObject.addProperty("requestedDeviceId", (String) obj);
            jq5 jq5VarM46258b2 = r6d.f43055a.m46258b(this.f40993d);
            jsonObject.addProperty("deviceModel", jq5VarM46258b2 == null ? jq5VarM46258b2.m34271a() : null);
            jsonObject.addProperty("osVersion", jq5VarM46258b2 == null ? jq5VarM46258b2.m34272b() : null);
            Object objM55727f2 = this.f40994e.m44380N().Xw(this.f40994e.m44380N(), this.f40995f, this.f40996g, jsonObject.toString()).m55727f();
            sq8.m48648g(objM55727f2, "blockingFirst(...)");
            yneVarM58030d = yne.f55736e.m58030d((SelfRegisterDeviceMutation.SelfRegisterDevice) objM55727f2);
            this.f40992c = ogaVar2;
            this.f40990a = null;
            this.f40991b = 3;
            if (ogaVar2.emit(yneVarM58030d, this) == objM51918f) {
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz7(Application application) {
        super(application);
        sq8.m48649h(application, "application");
        this.f40764c = 2592000000L;
        this.f40765d = 604800000L;
        tr trVarM50380x = tr.m50380x();
        sq8.m48648g(trVarM50380x, "getInstance(...)");
        this.f40766e = trVarM50380x;
        this.f40767f = new hpb();
    }

    public static /* synthetic */ AbstractC2145n B0(pz7 pz7Var, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return pz7Var.A0(context, str, str2);
    }

    /* renamed from: K */
    public static /* synthetic */ AbstractC2145n m44363K(pz7 pz7Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return pz7Var.m44378J(str);
    }

    /* renamed from: M */
    public static /* synthetic */ AbstractC2145n m44364M(pz7 pz7Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return pz7Var.m44379L(str);
    }

    /* renamed from: R */
    public static /* synthetic */ AbstractC2145n m44365R(pz7 pz7Var, String str, boolean z, ActivityMetrics.Period period, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            period = ActivityMetrics.Period.DAY;
        }
        return pz7Var.m44383Q(str, z, period);
    }

    /* renamed from: Z */
    public static /* synthetic */ AbstractC2145n m44366Z(pz7 pz7Var, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pz7Var.f40764c;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = pz7Var.f40765d;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = "";
        }
        return pz7Var.m44390Y(j3, j4, str);
    }

    public static /* synthetic */ AbstractC2145n e0(pz7 pz7Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return pz7Var.d0(str);
    }

    public static /* synthetic */ AbstractC2145n j0(pz7 pz7Var, String str, ActivityMetrics.Period period, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            period = ActivityMetrics.Period.DAY;
        }
        return pz7Var.i0(str, period);
    }

    public static /* synthetic */ AbstractC2145n l0(pz7 pz7Var, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = 10;
        }
        return pz7Var.k0(num);
    }

    public static /* synthetic */ AbstractC2145n n0(pz7 pz7Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return pz7Var.m0(str);
    }

    /* renamed from: r */
    public static final x8c m44368r() {
        return uni.LB().d0(C16220c.f40783a);
    }

    public static /* synthetic */ AbstractC2145n u0(pz7 pz7Var, String str, ActivityMetrics.Period period, int i, Object obj) {
        if ((i & 2) != 0) {
            period = ActivityMetrics.Period.DAY;
        }
        return pz7Var.t0(str, period);
    }

    /* renamed from: A */
    public final AbstractC2145n m44369A(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C16232j(str, null), 2, null);
    }

    public final AbstractC2145n A0(Context context, String str, String str2) {
        sq8.m48649h(str, "accountId");
        return e84.m24521b(eu5.m25611b(), 0L, new z0(context, this, str, str2, null), 2, null);
    }

    /* renamed from: B */
    public final AbstractC2145n m44370B(String str, String str2, String str3, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16234k(str3, str, resources, str2, null), 2, null);
    }

    /* renamed from: C */
    public final AbstractC2145n m44371C(String str, String str2, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16235l(str2, str, resources, null), 2, null);
    }

    public final void C0(String str, pt4 pt4Var, String str2, int i) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(pt4Var, "optionType");
        sq8.m48649h(str2, "teamId");
        vgf.m52765k().m27863L(str, pt4Var, str2, i);
    }

    /* renamed from: D */
    public final AbstractC2145n m44372D(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C16239m(str, null), 2, null);
    }

    public final String D0(String str) {
        sq8.m48649h(str, "accountID");
        try {
            new ho1().m30872b(str);
            uni.LB().v0(new a1(str), new b1());
            return "Account switched successfully";
        } catch (Exception e) {
            String message = e.getMessage();
            return message == null ? "" : message;
        }
    }

    /* renamed from: E */
    public final List m44373E() {
        return wi0.m54446L();
    }

    public final ActivityMetrics.Period E0(ActivityMetrics.Period period) {
        switch (C16217a.f40768a[period.ordinal()]) {
        }
        return ActivityMetrics.Period.PREVIOUS_DAY;
    }

    /* renamed from: F */
    public final AbstractC2145n m44374F() {
        AbstractC2145n abstractC2145nM54447M = wi0.m54447M();
        return abstractC2145nM54447M == null ? new hpb() : abstractC2145nM54447M;
    }

    /* renamed from: G */
    public final AbstractC2145n m44375G(String str, String str2, String str3, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16241n(str3, str, resources, str2, null), 2, null);
    }

    /* renamed from: H */
    public final AbstractC2145n m44376H(String str, String str2, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16243o(str2, str, resources, null), 2, null);
    }

    /* renamed from: I */
    public final AbstractC2145n m44377I(String str, ActivityMetrics.Period period) {
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new C16245p(str, period, null), 2, null);
    }

    /* renamed from: J */
    public final AbstractC2145n m44378J(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C16247q(str, null), 2, null);
    }

    /* renamed from: L */
    public final AbstractC2145n m44379L(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C16248r(str, null), 2, null);
    }

    /* renamed from: N */
    public final l1 m44380N() {
        l1 l1VarTB = uni.kC().TB();
        sq8.m48648g(l1VarTB, "getActiveService(...)");
        return l1VarTB;
    }

    /* renamed from: O */
    public final AbstractC2145n m44381O() {
        return e84.m24521b(eu5.m25611b(), 0L, new C16249s(null), 2, null);
    }

    /* renamed from: P */
    public final x6c m44382P() {
        x6c x6cVarM55707t = x6c.m55707t(new idg() { // from class: o.oz7
            @Override // p001o.idg
            public final Object get() {
                return pz7.m44368r();
            }
        });
        sq8.m48648g(x6cVarM55707t, "defer(...)");
        return x6cVarM55707t;
    }

    /* renamed from: Q */
    public final AbstractC2145n m44383Q(String str, boolean z, ActivityMetrics.Period period) {
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new C16250t(z, this, str, period, null), 2, null);
    }

    /* renamed from: S */
    public final AbstractC2145n m44384S(Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16251u(resources, null), 2, null);
    }

    /* renamed from: T */
    public final int[] m44385T(Resources resources) {
        sq8.m48649h(resources, "resources");
        try {
            x6c x6cVarJ0 = c8a.g1(null, Optional.empty(), Optional.empty()).j0(C16254x.f40976a);
            sq8.m48648g(x6cVarJ0, "onErrorReturn(...)");
            x6c x6cVarJ02 = c8a.h1(null, Optional.empty(), Optional.empty()).j0(C16258z.f40989a);
            sq8.m48648g(x6cVarJ02, "onErrorReturn(...)");
            x6c x6cVarJ03 = l35.m36495L("Active Deals", "All Deals", "").j0(C16256y.f40981a);
            sq8.m48648g(x6cVarJ03, "onErrorReturn(...)");
            x6c x6cVarJ04 = c8a.f1(null, Optional.empty()).j0(C16253w.f40970a);
            sq8.m48648g(x6cVarJ04, "onErrorReturn(...)");
            Object objM55727f = x6c.H0(ch3.m21249n(x6cVarJ0, x6cVarJ02, x6cVarJ03, x6cVarJ04), C16252v.f40968a).m55727f();
            sq8.m48646e(objM55727f);
            return (int[]) objM55727f;
        } catch (Throwable th) {
            FirebaseCrashlytics.getInstance().recordException(th);
            return new int[]{0, 0, 0, 0};
        }
    }

    /* renamed from: U */
    public final AbstractC2145n m44386U(String str, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new a0(resources, str, null), 2, null);
    }

    /* renamed from: V */
    public final AbstractC2145n m44387V(Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new b0(resources, null), 2, null);
    }

    /* renamed from: W */
    public final AbstractC2145n m44388W(String str, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new c0(resources, str, null), 2, null);
    }

    /* renamed from: X */
    public final AbstractC2145n m44389X(Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new d0(resources, null), 2, null);
    }

    /* renamed from: Y */
    public final AbstractC2145n m44390Y(long j, long j2, String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new e0(j, j2, null), 2, null);
    }

    public final AbstractC2145n a0() {
        return e84.m24521b(eu5.m25611b(), 0L, new f0(null), 2, null);
    }

    public final AbstractC2145n b0(String str, String str2, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new g0(str2, resources, str, null), 2, null);
    }

    public final AbstractC2145n c0(String str, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new h0(str, resources, null), 2, null);
    }

    public final AbstractC2145n d0(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new i0(str, null), 2, null);
    }

    public final AbstractC2145n f0(String str, String str2, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new j0(str2, resources, str, null), 2, null);
    }

    public final AbstractC2145n g0(String str, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new k0(str, resources, null), 2, null);
    }

    /* renamed from: h */
    public final int m44391h(long j, long j2) {
        if (j2 == 0 && j == 0) {
            return 0;
        }
        if (j == 0) {
            return -100;
        }
        if (j2 == 0) {
            return 100;
        }
        return (int) (((j - j2) / (j2 * 1.0d)) * 100.0d);
    }

    public final AbstractC2145n h0(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new l0(str, null), 2, null);
    }

    /* renamed from: i */
    public final ArrayList m44392i(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        long jLongValue;
        long jLongValue2;
        sq8.m48649h(activityMetrices, "activities");
        sq8.m48649h(period, "period");
        ArrayList arrayList = new ArrayList();
        ActivityMetrics.Period periodE0 = E0(period);
        ActivityMetrics.MetricsName metricsName = ActivityMetrics.MetricsName.CALL_LOGGED;
        ActivityMetrics activityMetrics = activityMetrices.getActivityMetrics(metricsName.name(), period);
        ActivityMetrics activityMetrics2 = activityMetrices.getActivityMetrics(metricsName.name(), periodE0);
        Long metricsValue = activityMetrics.getMetricsValue();
        sq8.m48648g(metricsValue, "getMetricsValue(...)");
        long jLongValue3 = metricsValue.longValue();
        Long metricsValue2 = activityMetrics2.getMetricsValue();
        sq8.m48648g(metricsValue2, "getMetricsValue(...)");
        int iM44391h = m44391h(jLongValue3, metricsValue2.longValue());
        int i = w7e.ic_home_calls_all;
        Long metricsValue3 = activityMetrics.getMetricsValue();
        StringBuilder sb = new StringBuilder();
        sb.append(metricsValue3);
        String string = sb.toString();
        int iAbs = Math.abs(iM44391h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iAbs);
        arrayList.add(new HomeActivity(1, "All Calls", string, sb2.toString(), iM44391h > 0, 0, false, 0, i, 224, null));
        ActivityMetrics.MetricsName metricsName2 = ActivityMetrics.MetricsName.CONNECTED_CALL_LOGGED;
        ActivityMetrics activityMetrics3 = activityMetrices.getActivityMetrics(metricsName2.name(), period);
        ActivityMetrics activityMetrics4 = activityMetrices.getActivityMetrics(metricsName2.name(), periodE0);
        Long metricsValue4 = activityMetrics3.getMetricsValue();
        sq8.m48648g(metricsValue4, "getMetricsValue(...)");
        long jLongValue4 = metricsValue4.longValue();
        Long metricsValue5 = activityMetrics4.getMetricsValue();
        sq8.m48648g(metricsValue5, "getMetricsValue(...)");
        int iM44391h2 = m44391h(jLongValue4, metricsValue5.longValue());
        int i2 = w7e.ic_home_calls_outgoing;
        Long metricsValue6 = activityMetrics3.getMetricsValue();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(metricsValue6);
        String string2 = sb3.toString();
        int iAbs2 = Math.abs(iM44391h2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(iAbs2);
        arrayList.add(new HomeActivity(2, "Connected Calls", string2, sb4.toString(), iM44391h2 > 0, 0, false, 0, i2, 224, null));
        ActivityMetrics.MetricsName metricsName3 = ActivityMetrics.MetricsName.OUTGOING_CALL_LOGGED;
        ActivityMetrics activityMetrics5 = activityMetrices.getActivityMetrics(metricsName3.name(), period);
        ActivityMetrics activityMetrics6 = activityMetrices.getActivityMetrics(metricsName3.name(), periodE0);
        Long metricsValue7 = activityMetrics5.getMetricsValue();
        sq8.m48648g(metricsValue7, "getMetricsValue(...)");
        long jLongValue5 = metricsValue7.longValue();
        Long metricsValue8 = activityMetrics6.getMetricsValue();
        sq8.m48648g(metricsValue8, "getMetricsValue(...)");
        int iM44391h3 = m44391h(jLongValue5, metricsValue8.longValue());
        int i3 = w7e.ic_home_calls_outgoing;
        Long metricsValue9 = activityMetrics5.getMetricsValue();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(metricsValue9);
        String string3 = sb5.toString();
        int iAbs3 = Math.abs(iM44391h3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(iAbs3);
        arrayList.add(new HomeActivity(3, "Outgoing Calls", string3, sb6.toString(), iM44391h3 > 0, 0, false, 0, i3, 224, null));
        ActivityMetrics.MetricsName metricsName4 = ActivityMetrics.MetricsName.CONNECTED_OUTGOING_CALL_LOGGED;
        ActivityMetrics activityMetrics7 = activityMetrices.getActivityMetrics(metricsName4.name(), period);
        ActivityMetrics activityMetrics8 = activityMetrices.getActivityMetrics(metricsName4.name(), periodE0);
        Long metricsValue10 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue10, "getMetricsValue(...)");
        long jLongValue6 = metricsValue10.longValue();
        Long metricsValue11 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue11, "getMetricsValue(...)");
        int iM44391h4 = m44391h(jLongValue6, metricsValue11.longValue());
        int i4 = w7e.ic_home_calls_outgoing;
        Long metricsValue12 = activityMetrics7.getMetricsValue();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(metricsValue12);
        String string4 = sb7.toString();
        int iAbs4 = Math.abs(iM44391h4);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(iAbs4);
        arrayList.add(new HomeActivity(4, "Outgoing Connected", string4, sb8.toString(), iM44391h4 > 0, 0, false, 0, i4, 224, null));
        ActivityMetrics.MetricsName metricsName5 = ActivityMetrics.MetricsName.INCOMING_CALL_LOGGED;
        ActivityMetrics activityMetrics9 = activityMetrices.getActivityMetrics(metricsName5.name(), period);
        ActivityMetrics activityMetrics10 = activityMetrices.getActivityMetrics(metricsName5.name(), periodE0);
        Long metricsValue13 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue13, "getMetricsValue(...)");
        long jLongValue7 = metricsValue13.longValue();
        Long metricsValue14 = activityMetrics10.getMetricsValue();
        sq8.m48648g(metricsValue14, "getMetricsValue(...)");
        int iM44391h5 = m44391h(jLongValue7, metricsValue14.longValue());
        int i5 = w7e.ic_home_calls_incoming;
        Long metricsValue15 = activityMetrics9.getMetricsValue();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(metricsValue15);
        String string5 = sb9.toString();
        int iAbs5 = Math.abs(iM44391h5);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(iAbs5);
        arrayList.add(new HomeActivity(5, "Incoming Calls", string5, sb10.toString(), iM44391h5 > 0, 0, false, 0, i5, 224, null));
        ActivityMetrics.MetricsName metricsName6 = ActivityMetrics.MetricsName.CONNECTED_INCOMING_CALL_LOGGED;
        ActivityMetrics activityMetrics11 = activityMetrices.getActivityMetrics(metricsName6.name(), period);
        ActivityMetrics activityMetrics12 = activityMetrices.getActivityMetrics(metricsName6.name(), periodE0);
        Long metricsValue16 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue16, "getMetricsValue(...)");
        long jLongValue8 = metricsValue16.longValue();
        Long metricsValue17 = activityMetrics12.getMetricsValue();
        sq8.m48648g(metricsValue17, "getMetricsValue(...)");
        int iM44391h6 = m44391h(jLongValue8, metricsValue17.longValue());
        int i6 = w7e.ic_home_calls_incoming;
        Long metricsValue18 = activityMetrics11.getMetricsValue();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(metricsValue18);
        String string6 = sb11.toString();
        int iAbs6 = Math.abs(iM44391h6);
        StringBuilder sb12 = new StringBuilder();
        sb12.append(iAbs6);
        arrayList.add(new HomeActivity(6, "Incoming Connected", string6, sb12.toString(), iM44391h6 > 0, 0, false, 0, i6, 224, null));
        long jLongValue9 = activityMetrics9.getMetricsValue().longValue();
        Long metricsValue19 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue19, "getMetricsValue(...)");
        long jLongValue10 = jLongValue9 - metricsValue19.longValue();
        long jLongValue11 = activityMetrics10.getMetricsValue().longValue();
        Long metricsValue20 = activityMetrics12.getMetricsValue();
        sq8.m48648g(metricsValue20, "getMetricsValue(...)");
        int iM44391h7 = m44391h(jLongValue10, jLongValue11 - metricsValue20.longValue());
        int i7 = w7e.ic_home_calls_missed;
        long jLongValue12 = activityMetrics9.getMetricsValue().longValue();
        Long metricsValue21 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue21, "getMetricsValue(...)");
        long jLongValue13 = jLongValue12 - metricsValue21.longValue();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(jLongValue13);
        String string7 = sb13.toString();
        int iAbs7 = Math.abs(iM44391h7);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(iAbs7);
        arrayList.add(new HomeActivity(7, "Missed Calls", string7, sb14.toString(), iM44391h7 > 0, 0, false, 0, i7, 224, null));
        long jLongValue14 = activityMetrics5.getMetricsValue().longValue();
        Long metricsValue22 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue22, "getMetricsValue(...)");
        long jLongValue15 = jLongValue14 - metricsValue22.longValue();
        long jLongValue16 = activityMetrics6.getMetricsValue().longValue();
        Long metricsValue23 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue23, "getMetricsValue(...)");
        int iM44391h8 = m44391h(jLongValue15, jLongValue16 - metricsValue23.longValue());
        int i8 = w7e.ic_home_calls_missed;
        long jLongValue17 = activityMetrics5.getMetricsValue().longValue();
        Long metricsValue24 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue24, "getMetricsValue(...)");
        long jLongValue18 = jLongValue17 - metricsValue24.longValue();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(jLongValue18);
        String string8 = sb15.toString();
        int iAbs8 = Math.abs(iM44391h8);
        StringBuilder sb16 = new StringBuilder();
        sb16.append(iAbs8);
        arrayList.add(new HomeActivity(8, "Unanswered Calls", string8, sb16.toString(), iM44391h8 > 0, 0, false, 0, i8, 224, null));
        ActivityMetrics.MetricsName metricsName7 = ActivityMetrics.MetricsName.CALL_DURATION;
        ActivityMetrics activityMetrics13 = activityMetrices.getActivityMetrics(metricsName7.name(), period);
        ActivityMetrics activityMetrics14 = activityMetrices.getActivityMetrics(metricsName7.name(), periodE0);
        long jLongValue19 = activityMetrics13.getMetricsValue().longValue();
        h8g h8gVar = h8g.f26398a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String str = String.format("%dh:%02dm", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(jLongValue19)), Long.valueOf(timeUnit.toMinutes(jLongValue19) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(jLongValue19)))}, 2));
        sq8.m48648g(str, "format(...)");
        Long metricsValue25 = activityMetrics13.getMetricsValue();
        sq8.m48648g(metricsValue25, "getMetricsValue(...)");
        long jLongValue20 = metricsValue25.longValue();
        Long metricsValue26 = activityMetrics14.getMetricsValue();
        sq8.m48648g(metricsValue26, "getMetricsValue(...)");
        int iM44391h9 = m44391h(jLongValue20, metricsValue26.longValue());
        int i9 = w7e.ic_home_calls_total_min;
        int iAbs9 = Math.abs(iM44391h9);
        StringBuilder sb17 = new StringBuilder();
        sb17.append(iAbs9);
        arrayList.add(new HomeActivity(9, "Total Call Time", str, sb17.toString(), iM44391h9 > 0, 0, true, 0, i9, Opcodes.IF_ICMPNE, null));
        Long metricsValue27 = activityMetrics3.getMetricsValue();
        if (metricsValue27 != null && metricsValue27.longValue() == 0) {
            jLongValue = 0;
        } else {
            long jLongValue21 = activityMetrics13.getMetricsValue().longValue();
            Long metricsValue28 = activityMetrics3.getMetricsValue();
            sq8.m48648g(metricsValue28, "getMetricsValue(...)");
            jLongValue = jLongValue21 / metricsValue28.longValue();
        }
        String str2 = String.format("%dm:%02ds", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(jLongValue)), Long.valueOf(timeUnit.toSeconds(jLongValue) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(jLongValue)))}, 2));
        sq8.m48648g(str2, "format(...)");
        Long metricsValue29 = activityMetrics4.getMetricsValue();
        if (metricsValue29 != null && metricsValue29.longValue() == 0) {
            jLongValue2 = 0;
        } else {
            long jLongValue22 = activityMetrics14.getMetricsValue().longValue();
            Long metricsValue30 = activityMetrics4.getMetricsValue();
            sq8.m48648g(metricsValue30, "getMetricsValue(...)");
            jLongValue2 = jLongValue22 / metricsValue30.longValue();
        }
        int iM44391h10 = m44391h(jLongValue, jLongValue2);
        int i10 = w7e.ic_home_calls_total_min;
        int iAbs10 = Math.abs(iM44391h10);
        StringBuilder sb18 = new StringBuilder();
        sb18.append(iAbs10);
        arrayList.add(new HomeActivity(10, "Avg Call Time", str2, sb18.toString(), iM44391h10 > 0, 0, true, 0, i10, Opcodes.IF_ICMPNE, null));
        ActivityMetrics.MetricsName metricsName8 = ActivityMetrics.MetricsName.POSITIVE_CALL_DISPOSITION;
        ActivityMetrics activityMetrics15 = activityMetrices.getActivityMetrics(metricsName8.name(), period);
        ActivityMetrics activityMetrics16 = activityMetrices.getActivityMetrics(metricsName8.name(), periodE0);
        Long metricsValue31 = activityMetrics15.getMetricsValue();
        sq8.m48648g(metricsValue31, "getMetricsValue(...)");
        long jLongValue23 = metricsValue31.longValue();
        Long metricsValue32 = activityMetrics16.getMetricsValue();
        sq8.m48648g(metricsValue32, "getMetricsValue(...)");
        int iM44391h11 = m44391h(jLongValue23, metricsValue32.longValue());
        int i11 = w7e.ic_thumb_up;
        Long metricsValue33 = activityMetrics15.getMetricsValue();
        StringBuilder sb19 = new StringBuilder();
        sb19.append(metricsValue33);
        String string9 = sb19.toString();
        int iAbs11 = Math.abs(iM44391h11);
        StringBuilder sb20 = new StringBuilder();
        sb20.append(iAbs11);
        arrayList.add(new HomeActivity(11, "+ve Call Outcomes", string9, sb20.toString(), iM44391h11 > 0, 0, false, 0, i11, 224, null));
        ActivityMetrics.MetricsName metricsName9 = ActivityMetrics.MetricsName.NEGATIVE_CALL_DISPOSITION;
        ActivityMetrics activityMetrics17 = activityMetrices.getActivityMetrics(metricsName9.name(), period);
        ActivityMetrics activityMetrics18 = activityMetrices.getActivityMetrics(metricsName9.name(), periodE0);
        Long metricsValue34 = activityMetrics17.getMetricsValue();
        sq8.m48648g(metricsValue34, "getMetricsValue(...)");
        long jLongValue24 = metricsValue34.longValue();
        Long metricsValue35 = activityMetrics18.getMetricsValue();
        sq8.m48648g(metricsValue35, "getMetricsValue(...)");
        int iM44391h12 = m44391h(jLongValue24, metricsValue35.longValue());
        int i12 = w7e.ic_thumb_down;
        Long metricsValue36 = activityMetrics17.getMetricsValue();
        StringBuilder sb21 = new StringBuilder();
        sb21.append(metricsValue36);
        String string10 = sb21.toString();
        int iAbs12 = Math.abs(iM44391h12);
        StringBuilder sb22 = new StringBuilder();
        sb22.append(iAbs12);
        arrayList.add(new HomeActivity(12, "-ve Call Outcomes", string10, sb22.toString(), iM44391h12 > 0, 0, false, 0, i12, 224, null));
        return arrayList;
    }

    public final AbstractC2145n i0(String str, ActivityMetrics.Period period) {
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new m0(str, period, null), 2, null);
    }

    /* renamed from: j */
    public final ArrayList m44393j(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        sq8.m48649h(activityMetrices, "activities");
        sq8.m48649h(period, "period");
        ArrayList arrayList = new ArrayList();
        ActivityMetrics.Period periodE0 = E0(period);
        ActivityMetrics.MetricsName metricsName = ActivityMetrics.MetricsName.NOTE_ADDED;
        ActivityMetrics activityMetrics = activityMetrices.getActivityMetrics(metricsName.name(), period);
        ActivityMetrics activityMetrics2 = activityMetrices.getActivityMetrics(metricsName.name(), periodE0);
        Long metricsValue = activityMetrics.getMetricsValue();
        sq8.m48648g(metricsValue, "getMetricsValue(...)");
        long jLongValue = metricsValue.longValue();
        Long metricsValue2 = activityMetrics2.getMetricsValue();
        sq8.m48648g(metricsValue2, "getMetricsValue(...)");
        int iM44391h = m44391h(jLongValue, metricsValue2.longValue());
        int i = u6e.backgroundAssigned;
        Long metricsValue3 = activityMetrics.getMetricsValue();
        StringBuilder sb = new StringBuilder();
        sb.append(metricsValue3);
        String string = sb.toString();
        int iAbs = Math.abs(iM44391h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iAbs);
        arrayList.add(new HomeActivity(1, "Notes Added", string, sb2.toString(), iM44391h > 0, 0, false, i, 0, 352, null));
        ActivityMetrics.MetricsName metricsName2 = ActivityMetrics.MetricsName.WHATSAPP_MESSAGE_SENT;
        ActivityMetrics activityMetrics3 = activityMetrices.getActivityMetrics(metricsName2.name(), period);
        ActivityMetrics activityMetrics4 = activityMetrices.getActivityMetrics(metricsName2.name(), periodE0);
        Long metricsValue4 = activityMetrics3.getMetricsValue();
        sq8.m48648g(metricsValue4, "getMetricsValue(...)");
        long jLongValue2 = metricsValue4.longValue();
        Long metricsValue5 = activityMetrics4.getMetricsValue();
        sq8.m48648g(metricsValue5, "getMetricsValue(...)");
        int iM44391h2 = m44391h(jLongValue2, metricsValue5.longValue());
        int i2 = u6e.backgroundAssigned;
        Long metricsValue6 = activityMetrics3.getMetricsValue();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(metricsValue6);
        String string2 = sb3.toString();
        int iAbs2 = Math.abs(iM44391h2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(iAbs2);
        arrayList.add(new HomeActivity(2, "Whatsapp Sent", string2, sb4.toString(), iM44391h2 > 0, 0, false, i2, 0, 352, null));
        ActivityMetrics.MetricsName metricsName3 = ActivityMetrics.MetricsName.EMAIL_SENT;
        ActivityMetrics activityMetrics5 = activityMetrices.getActivityMetrics(metricsName3.name(), period);
        ActivityMetrics activityMetrics6 = activityMetrices.getActivityMetrics(metricsName3.name(), periodE0);
        Long metricsValue7 = activityMetrics5.getMetricsValue();
        sq8.m48648g(metricsValue7, "getMetricsValue(...)");
        long jLongValue3 = metricsValue7.longValue();
        Long metricsValue8 = activityMetrics6.getMetricsValue();
        sq8.m48648g(metricsValue8, "getMetricsValue(...)");
        int iM44391h3 = m44391h(jLongValue3, metricsValue8.longValue());
        int i3 = u6e.backgroundAssigned;
        Long metricsValue9 = activityMetrics5.getMetricsValue();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(metricsValue9);
        String string3 = sb5.toString();
        int iAbs3 = Math.abs(iM44391h3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(iAbs3);
        arrayList.add(new HomeActivity(3, "Email Sent", string3, sb6.toString(), iM44391h3 > 0, 0, false, i3, 0, 352, null));
        ActivityMetrics.MetricsName metricsName4 = ActivityMetrics.MetricsName.SMS_SENT;
        ActivityMetrics activityMetrics7 = activityMetrices.getActivityMetrics(metricsName4.name(), period);
        ActivityMetrics activityMetrics8 = activityMetrices.getActivityMetrics(metricsName4.name(), periodE0);
        Long metricsValue10 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue10, "getMetricsValue(...)");
        long jLongValue4 = metricsValue10.longValue();
        Long metricsValue11 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue11, "getMetricsValue(...)");
        int iM44391h4 = m44391h(jLongValue4, metricsValue11.longValue());
        int i4 = u6e.backgroundAssigned;
        Long metricsValue12 = activityMetrics7.getMetricsValue();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(metricsValue12);
        String string4 = sb7.toString();
        int iAbs4 = Math.abs(iM44391h4);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(iAbs4);
        arrayList.add(new HomeActivity(2, "SMS Sent", string4, sb8.toString(), iM44391h4 > 0, 0, false, i4, 0, 352, null));
        ActivityMetrics.MetricsName metricsName5 = ActivityMetrics.MetricsName.VISIT_LOGGED;
        ActivityMetrics activityMetrics9 = activityMetrices.getActivityMetrics(metricsName5.name(), period);
        ActivityMetrics activityMetrics10 = activityMetrices.getActivityMetrics(metricsName5.name(), periodE0);
        Long metricsValue13 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue13, "getMetricsValue(...)");
        long jLongValue5 = metricsValue13.longValue();
        Long metricsValue14 = activityMetrics10.getMetricsValue();
        sq8.m48648g(metricsValue14, "getMetricsValue(...)");
        int iM44391h5 = m44391h(jLongValue5, metricsValue14.longValue());
        int i5 = u6e.backgroundAssigned;
        Long metricsValue15 = activityMetrics9.getMetricsValue();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(metricsValue15);
        String string5 = sb9.toString();
        int iAbs5 = Math.abs(iM44391h5);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(iAbs5);
        arrayList.add(new HomeActivity(4, "Total Visits", string5, sb10.toString(), iM44391h5 > 0, 0, false, i5, 0, 352, null));
        ActivityMetrics.MetricsName metricsName6 = ActivityMetrics.MetricsName.VISIT_OUTCOME_LOGGED;
        ActivityMetrics activityMetrics11 = activityMetrices.getActivityMetrics(metricsName6.name(), period);
        ActivityMetrics activityMetrics12 = activityMetrices.getActivityMetrics(metricsName6.name(), periodE0);
        Long metricsValue16 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue16, "getMetricsValue(...)");
        long jLongValue6 = metricsValue16.longValue();
        Long metricsValue17 = activityMetrics12.getMetricsValue();
        sq8.m48648g(metricsValue17, "getMetricsValue(...)");
        int iM44391h6 = m44391h(jLongValue6, metricsValue17.longValue());
        int i6 = u6e.backgroundTasks;
        Long metricsValue18 = activityMetrics11.getMetricsValue();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(metricsValue18);
        String string6 = sb11.toString();
        int iAbs6 = Math.abs(iM44391h6);
        StringBuilder sb12 = new StringBuilder();
        sb12.append(iAbs6);
        arrayList.add(new HomeActivity(5, "Completed Visits", string6, sb12.toString(), iM44391h6 > 0, 0, false, i6, 0, 352, null));
        ActivityMetrics.MetricsName metricsName7 = ActivityMetrics.MetricsName.POSITIVE_VISIT_DISPOSITION;
        ActivityMetrics activityMetrics13 = activityMetrices.getActivityMetrics(metricsName7.name(), period);
        ActivityMetrics activityMetrics14 = activityMetrices.getActivityMetrics(metricsName7.name(), periodE0);
        Long metricsValue19 = activityMetrics13.getMetricsValue();
        sq8.m48648g(metricsValue19, "getMetricsValue(...)");
        long jLongValue7 = metricsValue19.longValue();
        Long metricsValue20 = activityMetrics14.getMetricsValue();
        sq8.m48648g(metricsValue20, "getMetricsValue(...)");
        int iM44391h7 = m44391h(jLongValue7, metricsValue20.longValue());
        int i7 = w7e.lb_ic_thumb_up;
        Long metricsValue21 = activityMetrics13.getMetricsValue();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(metricsValue21);
        String string7 = sb13.toString();
        int iAbs7 = Math.abs(iM44391h7);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(iAbs7);
        arrayList.add(new HomeActivity(7, "+ve Visit Outcomes", string7, sb14.toString(), iM44391h7 > 0, 0, false, 0, i7, 224, null));
        ActivityMetrics.MetricsName metricsName8 = ActivityMetrics.MetricsName.NEGATIVE_VISIT_DISPOSITION;
        ActivityMetrics activityMetrics15 = activityMetrices.getActivityMetrics(metricsName8.name(), period);
        ActivityMetrics activityMetrics16 = activityMetrices.getActivityMetrics(metricsName8.name(), periodE0);
        Long metricsValue22 = activityMetrics15.getMetricsValue();
        sq8.m48648g(metricsValue22, "getMetricsValue(...)");
        long jLongValue8 = metricsValue22.longValue();
        Long metricsValue23 = activityMetrics16.getMetricsValue();
        sq8.m48648g(metricsValue23, "getMetricsValue(...)");
        int iM44391h8 = m44391h(jLongValue8, metricsValue23.longValue());
        int i8 = w7e.lb_ic_thumb_down;
        Long metricsValue24 = activityMetrics15.getMetricsValue();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(metricsValue24);
        String string8 = sb15.toString();
        int iAbs8 = Math.abs(iM44391h8);
        StringBuilder sb16 = new StringBuilder();
        sb16.append(iAbs8);
        arrayList.add(new HomeActivity(8, "-ve Visit Outcomes", string8, sb16.toString(), iM44391h8 > 0, 0, false, 0, i8, 224, null));
        ActivityMetrics.MetricsName metricsName9 = ActivityMetrics.MetricsName.CONTACT_CREATED;
        ActivityMetrics activityMetrics17 = activityMetrices.getActivityMetrics(metricsName9.name(), period);
        ActivityMetrics activityMetrics18 = activityMetrices.getActivityMetrics(metricsName9.name(), periodE0);
        Long metricsValue25 = activityMetrics17.getMetricsValue();
        sq8.m48648g(metricsValue25, "getMetricsValue(...)");
        long jLongValue9 = metricsValue25.longValue();
        Long metricsValue26 = activityMetrics18.getMetricsValue();
        sq8.m48648g(metricsValue26, "getMetricsValue(...)");
        int iM44391h9 = m44391h(jLongValue9, metricsValue26.longValue());
        int i9 = w7e.ic_home_leads_created;
        Long metricsValue27 = activityMetrics17.getMetricsValue();
        StringBuilder sb17 = new StringBuilder();
        sb17.append(metricsValue27);
        String string9 = sb17.toString();
        int iAbs9 = Math.abs(iM44391h9);
        StringBuilder sb18 = new StringBuilder();
        sb18.append(iAbs9);
        arrayList.add(new HomeActivity(9, "Leads created", string9, sb18.toString(), iM44391h9 > 0, 0, false, 0, i9, 224, null));
        return arrayList;
    }

    /* renamed from: k */
    public final ArrayList m44394k(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        long jLongValue;
        long jLongValue2;
        sq8.m48649h(activityMetrices, "activities");
        sq8.m48649h(period, "period");
        ArrayList arrayList = new ArrayList();
        ActivityMetrics.Period periodE0 = E0(period);
        ActivityMetrics.MetricsName metricsName = ActivityMetrics.MetricsName.UNIQUE_CALL_LOGGED;
        ActivityMetrics activityMetrics = activityMetrices.getActivityMetrics(metricsName.name(), period);
        ActivityMetrics activityMetrics2 = activityMetrices.getActivityMetrics(metricsName.name(), periodE0);
        Long metricsValue = activityMetrics.getMetricsValue();
        sq8.m48648g(metricsValue, "getMetricsValue(...)");
        long jLongValue3 = metricsValue.longValue();
        Long metricsValue2 = activityMetrics2.getMetricsValue();
        sq8.m48648g(metricsValue2, "getMetricsValue(...)");
        int iM44391h = m44391h(jLongValue3, metricsValue2.longValue());
        int i = w7e.ic_home_calls_all;
        Long metricsValue3 = activityMetrics.getMetricsValue();
        StringBuilder sb = new StringBuilder();
        sb.append(metricsValue3);
        String string = sb.toString();
        int iAbs = Math.abs(iM44391h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iAbs);
        arrayList.add(new HomeActivity(1, "All Calls", string, sb2.toString(), iM44391h > 0, 0, false, 0, i, 224, null));
        ActivityMetrics.MetricsName metricsName2 = ActivityMetrics.MetricsName.CONNECTED_CALL_LOGGED;
        ActivityMetrics activityMetrics3 = activityMetrices.getActivityMetrics(metricsName2.name(), period);
        ActivityMetrics activityMetrics4 = activityMetrices.getActivityMetrics(metricsName2.name(), periodE0);
        ActivityMetrics.MetricsName metricsName3 = ActivityMetrics.MetricsName.UNIQUE_CONNECTED_CALL_LOGGED;
        ActivityMetrics activityMetrics5 = activityMetrices.getActivityMetrics(metricsName3.name(), period);
        ActivityMetrics activityMetrics6 = activityMetrices.getActivityMetrics(metricsName3.name(), periodE0);
        Long metricsValue4 = activityMetrics5.getMetricsValue();
        sq8.m48648g(metricsValue4, "getMetricsValue(...)");
        long jLongValue4 = metricsValue4.longValue();
        Long metricsValue5 = activityMetrics6.getMetricsValue();
        sq8.m48648g(metricsValue5, "getMetricsValue(...)");
        int iM44391h2 = m44391h(jLongValue4, metricsValue5.longValue());
        int i2 = w7e.ic_home_calls_outgoing;
        Long metricsValue6 = activityMetrics5.getMetricsValue();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(metricsValue6);
        String string2 = sb3.toString();
        int iAbs2 = Math.abs(iM44391h2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(iAbs2);
        arrayList.add(new HomeActivity(2, "Connected Calls", string2, sb4.toString(), iM44391h2 > 0, 0, false, 0, i2, 224, null));
        ActivityMetrics.MetricsName metricsName4 = ActivityMetrics.MetricsName.UNIQUE_OUTGOING_CALL_LOGGED;
        ActivityMetrics activityMetrics7 = activityMetrices.getActivityMetrics(metricsName4.name(), period);
        ActivityMetrics activityMetrics8 = activityMetrices.getActivityMetrics(metricsName4.name(), periodE0);
        Long metricsValue7 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue7, "getMetricsValue(...)");
        long jLongValue5 = metricsValue7.longValue();
        Long metricsValue8 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue8, "getMetricsValue(...)");
        int iM44391h3 = m44391h(jLongValue5, metricsValue8.longValue());
        int i3 = w7e.ic_home_calls_outgoing;
        Long metricsValue9 = activityMetrics7.getMetricsValue();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(metricsValue9);
        String string3 = sb5.toString();
        int iAbs3 = Math.abs(iM44391h3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(iAbs3);
        arrayList.add(new HomeActivity(3, "Outgoing Calls", string3, sb6.toString(), iM44391h3 > 0, 0, false, 0, i3, 224, null));
        ActivityMetrics.MetricsName metricsName5 = ActivityMetrics.MetricsName.UNIQUE_CONNECTED_OUTGOING_CALL_LOGGED;
        ActivityMetrics activityMetrics9 = activityMetrices.getActivityMetrics(metricsName5.name(), period);
        ActivityMetrics activityMetrics10 = activityMetrices.getActivityMetrics(metricsName5.name(), periodE0);
        Long metricsValue10 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue10, "getMetricsValue(...)");
        long jLongValue6 = metricsValue10.longValue();
        Long metricsValue11 = activityMetrics10.getMetricsValue();
        sq8.m48648g(metricsValue11, "getMetricsValue(...)");
        int iM44391h4 = m44391h(jLongValue6, metricsValue11.longValue());
        int i4 = w7e.ic_home_calls_outgoing;
        Long metricsValue12 = activityMetrics9.getMetricsValue();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(metricsValue12);
        String string4 = sb7.toString();
        int iAbs4 = Math.abs(iM44391h4);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(iAbs4);
        arrayList.add(new HomeActivity(4, "Outgoing Connected", string4, sb8.toString(), iM44391h4 > 0, 0, false, 0, i4, 224, null));
        ActivityMetrics.MetricsName metricsName6 = ActivityMetrics.MetricsName.UNIQUE_INCOMING_CALL_LOGGED;
        ActivityMetrics activityMetrics11 = activityMetrices.getActivityMetrics(metricsName6.name(), period);
        ActivityMetrics activityMetrics12 = activityMetrices.getActivityMetrics(metricsName6.name(), periodE0);
        Long metricsValue13 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue13, "getMetricsValue(...)");
        long jLongValue7 = metricsValue13.longValue();
        Long metricsValue14 = activityMetrics12.getMetricsValue();
        sq8.m48648g(metricsValue14, "getMetricsValue(...)");
        int iM44391h5 = m44391h(jLongValue7, metricsValue14.longValue());
        int i5 = w7e.ic_home_calls_incoming;
        Long metricsValue15 = activityMetrics11.getMetricsValue();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(metricsValue15);
        String string5 = sb9.toString();
        int iAbs5 = Math.abs(iM44391h5);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(iAbs5);
        arrayList.add(new HomeActivity(5, "Incoming Calls", string5, sb10.toString(), iM44391h5 > 0, 0, false, 0, i5, 224, null));
        ActivityMetrics.MetricsName metricsName7 = ActivityMetrics.MetricsName.UNIQUE_CONNECTED_INCOMING_CALL_LOGGED;
        ActivityMetrics activityMetrics13 = activityMetrices.getActivityMetrics(metricsName7.name(), period);
        ActivityMetrics activityMetrics14 = activityMetrices.getActivityMetrics(metricsName7.name(), periodE0);
        Long metricsValue16 = activityMetrics13.getMetricsValue();
        sq8.m48648g(metricsValue16, "getMetricsValue(...)");
        long jLongValue8 = metricsValue16.longValue();
        Long metricsValue17 = activityMetrics14.getMetricsValue();
        sq8.m48648g(metricsValue17, "getMetricsValue(...)");
        int iM44391h6 = m44391h(jLongValue8, metricsValue17.longValue());
        int i6 = w7e.ic_home_calls_incoming;
        Long metricsValue18 = activityMetrics13.getMetricsValue();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(metricsValue18);
        String string6 = sb11.toString();
        int iAbs6 = Math.abs(iM44391h6);
        StringBuilder sb12 = new StringBuilder();
        sb12.append(iAbs6);
        arrayList.add(new HomeActivity(6, "Incoming Connected", string6, sb12.toString(), iM44391h6 > 0, 0, false, 0, i6, 224, null));
        long jLongValue9 = activityMetrics11.getMetricsValue().longValue();
        Long metricsValue19 = activityMetrics13.getMetricsValue();
        sq8.m48648g(metricsValue19, "getMetricsValue(...)");
        long jLongValue10 = jLongValue9 - metricsValue19.longValue();
        long jLongValue11 = activityMetrics12.getMetricsValue().longValue();
        Long metricsValue20 = activityMetrics14.getMetricsValue();
        sq8.m48648g(metricsValue20, "getMetricsValue(...)");
        int iM44391h7 = m44391h(jLongValue10, jLongValue11 - metricsValue20.longValue());
        int i7 = w7e.ic_home_calls_missed;
        long jLongValue12 = activityMetrics11.getMetricsValue().longValue();
        Long metricsValue21 = activityMetrics13.getMetricsValue();
        sq8.m48648g(metricsValue21, "getMetricsValue(...)");
        long jLongValue13 = jLongValue12 - metricsValue21.longValue();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(jLongValue13);
        String string7 = sb13.toString();
        int iAbs7 = Math.abs(iM44391h7);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(iAbs7);
        arrayList.add(new HomeActivity(7, "Missed Calls", string7, sb14.toString(), iM44391h7 > 0, 0, false, 0, i7, 224, null));
        long jLongValue14 = activityMetrics7.getMetricsValue().longValue();
        Long metricsValue22 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue22, "getMetricsValue(...)");
        long jLongValue15 = jLongValue14 - metricsValue22.longValue();
        long jLongValue16 = activityMetrics8.getMetricsValue().longValue();
        Long metricsValue23 = activityMetrics10.getMetricsValue();
        sq8.m48648g(metricsValue23, "getMetricsValue(...)");
        int iM44391h8 = m44391h(jLongValue15, jLongValue16 - metricsValue23.longValue());
        int i8 = w7e.ic_home_calls_missed;
        long jLongValue17 = activityMetrics7.getMetricsValue().longValue();
        Long metricsValue24 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue24, "getMetricsValue(...)");
        long jLongValue18 = jLongValue17 - metricsValue24.longValue();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(jLongValue18);
        String string8 = sb15.toString();
        int iAbs8 = Math.abs(iM44391h8);
        StringBuilder sb16 = new StringBuilder();
        sb16.append(iAbs8);
        arrayList.add(new HomeActivity(8, "Unanswered Calls", string8, sb16.toString(), iM44391h8 > 0, 0, false, 0, i8, 224, null));
        ActivityMetrics.MetricsName metricsName8 = ActivityMetrics.MetricsName.CALL_DURATION;
        ActivityMetrics activityMetrics15 = activityMetrices.getActivityMetrics(metricsName8.name(), period);
        ActivityMetrics activityMetrics16 = activityMetrices.getActivityMetrics(metricsName8.name(), periodE0);
        long jLongValue19 = activityMetrics15.getMetricsValue().longValue();
        h8g h8gVar = h8g.f26398a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String str = String.format("%dh:%02dm", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(jLongValue19)), Long.valueOf(timeUnit.toMinutes(jLongValue19) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(jLongValue19)))}, 2));
        sq8.m48648g(str, "format(...)");
        Long metricsValue25 = activityMetrics15.getMetricsValue();
        sq8.m48648g(metricsValue25, "getMetricsValue(...)");
        long jLongValue20 = metricsValue25.longValue();
        Long metricsValue26 = activityMetrics16.getMetricsValue();
        sq8.m48648g(metricsValue26, "getMetricsValue(...)");
        int iM44391h9 = m44391h(jLongValue20, metricsValue26.longValue());
        int i9 = w7e.ic_home_calls_total_min;
        int iAbs9 = Math.abs(iM44391h9);
        StringBuilder sb17 = new StringBuilder();
        sb17.append(iAbs9);
        arrayList.add(new HomeActivity(9, "Total Call Time", str, sb17.toString(), iM44391h9 > 0, 0, true, 0, i9, Opcodes.IF_ICMPNE, null));
        Long metricsValue27 = activityMetrics3.getMetricsValue();
        if (metricsValue27 != null && metricsValue27.longValue() == 0) {
            jLongValue = 0;
        } else {
            long jLongValue21 = activityMetrics15.getMetricsValue().longValue();
            Long metricsValue28 = activityMetrics3.getMetricsValue();
            sq8.m48648g(metricsValue28, "getMetricsValue(...)");
            jLongValue = jLongValue21 / metricsValue28.longValue();
        }
        String str2 = String.format("%dm:%02ds", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(jLongValue)), Long.valueOf(timeUnit.toSeconds(jLongValue) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(jLongValue)))}, 2));
        sq8.m48648g(str2, "format(...)");
        Long metricsValue29 = activityMetrics4.getMetricsValue();
        if (metricsValue29 != null && metricsValue29.longValue() == 0) {
            jLongValue2 = 0;
        } else {
            long jLongValue22 = activityMetrics16.getMetricsValue().longValue();
            Long metricsValue30 = activityMetrics4.getMetricsValue();
            sq8.m48648g(metricsValue30, "getMetricsValue(...)");
            jLongValue2 = jLongValue22 / metricsValue30.longValue();
        }
        int iM44391h10 = m44391h(jLongValue, jLongValue2);
        int i10 = w7e.ic_home_calls_total_min;
        int iAbs10 = Math.abs(iM44391h10);
        StringBuilder sb18 = new StringBuilder();
        sb18.append(iAbs10);
        arrayList.add(new HomeActivity(10, "Avg Call Time", str2, sb18.toString(), iM44391h10 > 0, 0, true, 0, i10, Opcodes.IF_ICMPNE, null));
        ActivityMetrics.MetricsName metricsName9 = ActivityMetrics.MetricsName.UNIQUE_POSITIVE_CALL_DISPOSITION;
        ActivityMetrics activityMetrics17 = activityMetrices.getActivityMetrics(metricsName9.name(), period);
        ActivityMetrics activityMetrics18 = activityMetrices.getActivityMetrics(metricsName9.name(), periodE0);
        Long metricsValue31 = activityMetrics17.getMetricsValue();
        sq8.m48648g(metricsValue31, "getMetricsValue(...)");
        long jLongValue23 = metricsValue31.longValue();
        Long metricsValue32 = activityMetrics18.getMetricsValue();
        sq8.m48648g(metricsValue32, "getMetricsValue(...)");
        int iM44391h11 = m44391h(jLongValue23, metricsValue32.longValue());
        int i11 = w7e.ic_thumb_up;
        Long metricsValue33 = activityMetrics17.getMetricsValue();
        StringBuilder sb19 = new StringBuilder();
        sb19.append(metricsValue33);
        String string9 = sb19.toString();
        int iAbs11 = Math.abs(iM44391h11);
        StringBuilder sb20 = new StringBuilder();
        sb20.append(iAbs11);
        arrayList.add(new HomeActivity(11, "+ve Call Outcomes", string9, sb20.toString(), iM44391h11 > 0, 0, false, 0, i11, 224, null));
        ActivityMetrics.MetricsName metricsName10 = ActivityMetrics.MetricsName.UNIQUE_NEGATIVE_CALL_DISPOSITION;
        ActivityMetrics activityMetrics19 = activityMetrices.getActivityMetrics(metricsName10.name(), period);
        ActivityMetrics activityMetrics20 = activityMetrices.getActivityMetrics(metricsName10.name(), periodE0);
        Long metricsValue34 = activityMetrics19.getMetricsValue();
        sq8.m48648g(metricsValue34, "getMetricsValue(...)");
        long jLongValue24 = metricsValue34.longValue();
        Long metricsValue35 = activityMetrics20.getMetricsValue();
        sq8.m48648g(metricsValue35, "getMetricsValue(...)");
        int iM44391h12 = m44391h(jLongValue24, metricsValue35.longValue());
        int i12 = w7e.ic_thumb_down;
        Long metricsValue36 = activityMetrics19.getMetricsValue();
        StringBuilder sb21 = new StringBuilder();
        sb21.append(metricsValue36);
        String string10 = sb21.toString();
        int iAbs12 = Math.abs(iM44391h12);
        StringBuilder sb22 = new StringBuilder();
        sb22.append(iAbs12);
        arrayList.add(new HomeActivity(12, "-ve Call Outcomes", string10, sb22.toString(), iM44391h12 > 0, 0, false, 0, i12, 224, null));
        return arrayList;
    }

    public final AbstractC2145n k0(Integer num) {
        return e84.m24521b(eu5.m25611b(), 0L, new n0(num, null), 2, null);
    }

    /* renamed from: l */
    public final ArrayList m44395l(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        sq8.m48649h(activityMetrices, "activities");
        sq8.m48649h(period, "period");
        ArrayList arrayList = new ArrayList();
        ActivityMetrics.Period periodE0 = E0(period);
        ActivityMetrics.MetricsName metricsName = ActivityMetrics.MetricsName.UNIQUE_CALL_LOGGED;
        ActivityMetrics activityMetrics = activityMetrices.getActivityMetrics(metricsName.name(), period);
        ActivityMetrics activityMetrics2 = activityMetrices.getActivityMetrics(metricsName.name(), periodE0);
        Long metricsValue = activityMetrics.getMetricsValue();
        sq8.m48648g(metricsValue, "getMetricsValue(...)");
        long jLongValue = metricsValue.longValue();
        Long metricsValue2 = activityMetrics2.getMetricsValue();
        sq8.m48648g(metricsValue2, "getMetricsValue(...)");
        int iM44391h = m44391h(jLongValue, metricsValue2.longValue());
        int i = w7e.ic_home_calls_all;
        Long metricsValue3 = activityMetrics.getMetricsValue();
        StringBuilder sb = new StringBuilder();
        sb.append(metricsValue3);
        String string = sb.toString();
        int iAbs = Math.abs(iM44391h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iAbs);
        arrayList.add(new HomeActivity(1, "All Unique Calls", string, sb2.toString(), iM44391h > 0, 0, false, 0, i, 224, null));
        ActivityMetrics.MetricsName metricsName2 = ActivityMetrics.MetricsName.UNIQUE_CONNECTED_CALL_LOGGED;
        ActivityMetrics activityMetrics3 = activityMetrices.getActivityMetrics(metricsName2.name(), period);
        ActivityMetrics activityMetrics4 = activityMetrices.getActivityMetrics(metricsName2.name(), periodE0);
        Long metricsValue4 = activityMetrics3.getMetricsValue();
        sq8.m48648g(metricsValue4, "getMetricsValue(...)");
        long jLongValue2 = metricsValue4.longValue();
        Long metricsValue5 = activityMetrics4.getMetricsValue();
        sq8.m48648g(metricsValue5, "getMetricsValue(...)");
        int iM44391h2 = m44391h(jLongValue2, metricsValue5.longValue());
        int i2 = w7e.ic_home_calls_outgoing;
        Long metricsValue6 = activityMetrics3.getMetricsValue();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(metricsValue6);
        String string2 = sb3.toString();
        int iAbs2 = Math.abs(iM44391h2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(iAbs2);
        arrayList.add(new HomeActivity(2, "Unique Connected Calls", string2, sb4.toString(), iM44391h2 > 0, 0, false, 0, i2, 224, null));
        ActivityMetrics.MetricsName metricsName3 = ActivityMetrics.MetricsName.UNIQUE_OUTGOING_CALL_LOGGED;
        ActivityMetrics activityMetrics5 = activityMetrices.getActivityMetrics(metricsName3.name(), period);
        ActivityMetrics activityMetrics6 = activityMetrices.getActivityMetrics(metricsName3.name(), periodE0);
        Long metricsValue7 = activityMetrics5.getMetricsValue();
        sq8.m48648g(metricsValue7, "getMetricsValue(...)");
        long jLongValue3 = metricsValue7.longValue();
        Long metricsValue8 = activityMetrics6.getMetricsValue();
        sq8.m48648g(metricsValue8, "getMetricsValue(...)");
        int iM44391h3 = m44391h(jLongValue3, metricsValue8.longValue());
        int i3 = w7e.ic_home_calls_outgoing;
        Long metricsValue9 = activityMetrics5.getMetricsValue();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(metricsValue9);
        String string3 = sb5.toString();
        int iAbs3 = Math.abs(iM44391h3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(iAbs3);
        arrayList.add(new HomeActivity(3, "Unique Outgoing Calls", string3, sb6.toString(), iM44391h3 > 0, 0, false, 0, i3, 224, null));
        ActivityMetrics.MetricsName metricsName4 = ActivityMetrics.MetricsName.UNIQUE_CONNECTED_OUTGOING_CALL_LOGGED;
        ActivityMetrics activityMetrics7 = activityMetrices.getActivityMetrics(metricsName4.name(), period);
        ActivityMetrics activityMetrics8 = activityMetrices.getActivityMetrics(metricsName4.name(), periodE0);
        Long metricsValue10 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue10, "getMetricsValue(...)");
        long jLongValue4 = metricsValue10.longValue();
        Long metricsValue11 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue11, "getMetricsValue(...)");
        int iM44391h4 = m44391h(jLongValue4, metricsValue11.longValue());
        int i4 = w7e.ic_home_calls_outgoing;
        Long metricsValue12 = activityMetrics7.getMetricsValue();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(metricsValue12);
        String string4 = sb7.toString();
        int iAbs4 = Math.abs(iM44391h4);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(iAbs4);
        arrayList.add(new HomeActivity(4, "Unique Outgoing Connected", string4, sb8.toString(), iM44391h4 > 0, 0, false, 0, i4, 224, null));
        ActivityMetrics.MetricsName metricsName5 = ActivityMetrics.MetricsName.UNIQUE_INCOMING_CALL_LOGGED;
        ActivityMetrics activityMetrics9 = activityMetrices.getActivityMetrics(metricsName5.name(), period);
        ActivityMetrics activityMetrics10 = activityMetrices.getActivityMetrics(metricsName5.name(), periodE0);
        Long metricsValue13 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue13, "getMetricsValue(...)");
        long jLongValue5 = metricsValue13.longValue();
        Long metricsValue14 = activityMetrics10.getMetricsValue();
        sq8.m48648g(metricsValue14, "getMetricsValue(...)");
        int iM44391h5 = m44391h(jLongValue5, metricsValue14.longValue());
        int i5 = w7e.ic_home_calls_incoming;
        Long metricsValue15 = activityMetrics9.getMetricsValue();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(metricsValue15);
        String string5 = sb9.toString();
        int iAbs5 = Math.abs(iM44391h5);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(iAbs5);
        arrayList.add(new HomeActivity(5, "Unique Incoming Calls", string5, sb10.toString(), iM44391h5 > 0, 0, false, 0, i5, 224, null));
        ActivityMetrics.MetricsName metricsName6 = ActivityMetrics.MetricsName.UNIQUE_CONNECTED_INCOMING_CALL_LOGGED;
        ActivityMetrics activityMetrics11 = activityMetrices.getActivityMetrics(metricsName6.name(), period);
        ActivityMetrics activityMetrics12 = activityMetrices.getActivityMetrics(metricsName6.name(), periodE0);
        Long metricsValue16 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue16, "getMetricsValue(...)");
        long jLongValue6 = metricsValue16.longValue();
        Long metricsValue17 = activityMetrics12.getMetricsValue();
        sq8.m48648g(metricsValue17, "getMetricsValue(...)");
        int iM44391h6 = m44391h(jLongValue6, metricsValue17.longValue());
        int i6 = w7e.ic_home_calls_incoming;
        Long metricsValue18 = activityMetrics11.getMetricsValue();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(metricsValue18);
        String string6 = sb11.toString();
        int iAbs6 = Math.abs(iM44391h6);
        StringBuilder sb12 = new StringBuilder();
        sb12.append(iAbs6);
        arrayList.add(new HomeActivity(6, "Unique Incoming Connected", string6, sb12.toString(), iM44391h6 > 0, 0, false, 0, i6, 224, null));
        long jLongValue7 = activityMetrics9.getMetricsValue().longValue();
        Long metricsValue19 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue19, "getMetricsValue(...)");
        long jLongValue8 = jLongValue7 - metricsValue19.longValue();
        long jLongValue9 = activityMetrics10.getMetricsValue().longValue();
        Long metricsValue20 = activityMetrics12.getMetricsValue();
        sq8.m48648g(metricsValue20, "getMetricsValue(...)");
        int iM44391h7 = m44391h(jLongValue8, jLongValue9 - metricsValue20.longValue());
        int i7 = w7e.ic_home_calls_missed;
        long jLongValue10 = activityMetrics9.getMetricsValue().longValue();
        Long metricsValue21 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue21, "getMetricsValue(...)");
        long jLongValue11 = jLongValue10 - metricsValue21.longValue();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(jLongValue11);
        String string7 = sb13.toString();
        int iAbs7 = Math.abs(iM44391h7);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(iAbs7);
        arrayList.add(new HomeActivity(7, "Unique Missed Calls", string7, sb14.toString(), iM44391h7 > 0, 0, false, 0, i7, 224, null));
        long jLongValue12 = activityMetrics5.getMetricsValue().longValue();
        Long metricsValue22 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue22, "getMetricsValue(...)");
        long jLongValue13 = jLongValue12 - metricsValue22.longValue();
        long jLongValue14 = activityMetrics6.getMetricsValue().longValue();
        Long metricsValue23 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue23, "getMetricsValue(...)");
        int iM44391h8 = m44391h(jLongValue13, jLongValue14 - metricsValue23.longValue());
        int i8 = w7e.ic_home_calls_missed;
        long jLongValue15 = activityMetrics5.getMetricsValue().longValue();
        Long metricsValue24 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue24, "getMetricsValue(...)");
        long jLongValue16 = jLongValue15 - metricsValue24.longValue();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(jLongValue16);
        String string8 = sb15.toString();
        int iAbs8 = Math.abs(iM44391h8);
        StringBuilder sb16 = new StringBuilder();
        sb16.append(iAbs8);
        arrayList.add(new HomeActivity(8, "Unique Unanswered Calls", string8, sb16.toString(), iM44391h8 > 0, 0, false, 0, i8, 224, null));
        ActivityMetrics.MetricsName metricsName7 = ActivityMetrics.MetricsName.UNIQUE_POSITIVE_CALL_DISPOSITION;
        ActivityMetrics activityMetrics13 = activityMetrices.getActivityMetrics(metricsName7.name(), period);
        ActivityMetrics activityMetrics14 = activityMetrices.getActivityMetrics(metricsName7.name(), periodE0);
        Long metricsValue25 = activityMetrics13.getMetricsValue();
        sq8.m48648g(metricsValue25, "getMetricsValue(...)");
        long jLongValue17 = metricsValue25.longValue();
        Long metricsValue26 = activityMetrics14.getMetricsValue();
        sq8.m48648g(metricsValue26, "getMetricsValue(...)");
        int iM44391h9 = m44391h(jLongValue17, metricsValue26.longValue());
        int i9 = w7e.ic_thumb_up;
        Long metricsValue27 = activityMetrics13.getMetricsValue();
        StringBuilder sb17 = new StringBuilder();
        sb17.append(metricsValue27);
        String string9 = sb17.toString();
        int iAbs9 = Math.abs(iM44391h9);
        StringBuilder sb18 = new StringBuilder();
        sb18.append(iAbs9);
        arrayList.add(new HomeActivity(11, "+ve Call Unique", string9, sb18.toString(), iM44391h9 > 0, 0, false, 0, i9, 224, null));
        ActivityMetrics.MetricsName metricsName8 = ActivityMetrics.MetricsName.UNIQUE_NEGATIVE_CALL_DISPOSITION;
        ActivityMetrics activityMetrics15 = activityMetrices.getActivityMetrics(metricsName8.name(), period);
        ActivityMetrics activityMetrics16 = activityMetrices.getActivityMetrics(metricsName8.name(), periodE0);
        Long metricsValue28 = activityMetrics15.getMetricsValue();
        sq8.m48648g(metricsValue28, "getMetricsValue(...)");
        long jLongValue18 = metricsValue28.longValue();
        Long metricsValue29 = activityMetrics16.getMetricsValue();
        sq8.m48648g(metricsValue29, "getMetricsValue(...)");
        int iM44391h10 = m44391h(jLongValue18, metricsValue29.longValue());
        int i10 = w7e.ic_thumb_down;
        Long metricsValue30 = activityMetrics15.getMetricsValue();
        StringBuilder sb19 = new StringBuilder();
        sb19.append(metricsValue30);
        String string10 = sb19.toString();
        int iAbs10 = Math.abs(iM44391h10);
        StringBuilder sb20 = new StringBuilder();
        sb20.append(iAbs10);
        arrayList.add(new HomeActivity(12, "-ve Call Unique", string10, sb20.toString(), iM44391h10 > 0, 0, false, 0, i10, 224, null));
        return arrayList;
    }

    /* renamed from: m */
    public final ArrayList m44396m(ActivityMetrices activityMetrices, ActivityMetrics.Period period) {
        sq8.m48649h(activityMetrices, "activities");
        sq8.m48649h(period, "period");
        ArrayList arrayList = new ArrayList();
        ActivityMetrics.Period periodE0 = E0(period);
        ActivityMetrics.MetricsName metricsName = ActivityMetrics.MetricsName.TASK_COMPLETED;
        ActivityMetrics activityMetrics = activityMetrices.getActivityMetrics(metricsName.name(), period);
        ActivityMetrics activityMetrics2 = activityMetrices.getActivityMetrics(metricsName.name(), periodE0);
        Long metricsValue = activityMetrics.getMetricsValue();
        sq8.m48648g(metricsValue, "getMetricsValue(...)");
        long jLongValue = metricsValue.longValue();
        Long metricsValue2 = activityMetrics2.getMetricsValue();
        sq8.m48648g(metricsValue2, "getMetricsValue(...)");
        int iM44391h = m44391h(jLongValue, metricsValue2.longValue());
        int i = u6e.backgroundAssigned;
        Long metricsValue3 = activityMetrics.getMetricsValue();
        StringBuilder sb = new StringBuilder();
        sb.append(metricsValue3);
        String string = sb.toString();
        int iAbs = Math.abs(iM44391h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iAbs);
        arrayList.add(new HomeActivity(1, "Tasks Completed", string, sb2.toString(), iM44391h > 0, 0, false, i, 0, 352, null));
        ActivityMetrics.MetricsName metricsName2 = ActivityMetrics.MetricsName.TASK_EXPIRED;
        ActivityMetrics activityMetrics3 = activityMetrices.getActivityMetrics(metricsName2.name(), period);
        ActivityMetrics activityMetrics4 = activityMetrices.getActivityMetrics(metricsName2.name(), periodE0);
        Long metricsValue4 = activityMetrics3.getMetricsValue();
        sq8.m48648g(metricsValue4, "getMetricsValue(...)");
        long jLongValue2 = metricsValue4.longValue();
        Long metricsValue5 = activityMetrics4.getMetricsValue();
        sq8.m48648g(metricsValue5, "getMetricsValue(...)");
        int iM44391h2 = m44391h(jLongValue2, metricsValue5.longValue());
        int i2 = u6e.backgroundTasks;
        Long metricsValue6 = activityMetrics3.getMetricsValue();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(metricsValue6);
        String string2 = sb3.toString();
        int iAbs2 = Math.abs(iM44391h2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(iAbs2);
        arrayList.add(new HomeActivity(2, "Tasks Expired", string2, sb4.toString(), iM44391h2 > 0, 0, false, i2, 0, 352, null));
        ActivityMetrics.MetricsName metricsName3 = ActivityMetrics.MetricsName.TASK_COMPLETE_SUCCESS;
        ActivityMetrics activityMetrics5 = activityMetrices.getActivityMetrics(metricsName3.name(), period);
        ActivityMetrics activityMetrics6 = activityMetrices.getActivityMetrics(metricsName3.name(), periodE0);
        Long metricsValue7 = activityMetrics5.getMetricsValue();
        sq8.m48648g(metricsValue7, "getMetricsValue(...)");
        long jLongValue3 = metricsValue7.longValue();
        Long metricsValue8 = activityMetrics6.getMetricsValue();
        sq8.m48648g(metricsValue8, "getMetricsValue(...)");
        int iM44391h3 = m44391h(jLongValue3, metricsValue8.longValue());
        int i3 = u6e.backgroundTasks;
        Long metricsValue9 = activityMetrics5.getMetricsValue();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(metricsValue9);
        String string3 = sb5.toString();
        int iAbs3 = Math.abs(iM44391h3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(iAbs3);
        arrayList.add(new HomeActivity(3, "Tasks Succeeded", string3, sb6.toString(), iM44391h3 > 0, 0, false, i3, 0, 352, null));
        ActivityMetrics.MetricsName metricsName4 = ActivityMetrics.MetricsName.TASK_COMPLETE_FAILRE;
        ActivityMetrics activityMetrics7 = activityMetrices.getActivityMetrics(metricsName4.name(), period);
        ActivityMetrics activityMetrics8 = activityMetrices.getActivityMetrics(metricsName4.name(), periodE0);
        Long metricsValue10 = activityMetrics7.getMetricsValue();
        sq8.m48648g(metricsValue10, "getMetricsValue(...)");
        long jLongValue4 = metricsValue10.longValue();
        Long metricsValue11 = activityMetrics8.getMetricsValue();
        sq8.m48648g(metricsValue11, "getMetricsValue(...)");
        int iM44391h4 = m44391h(jLongValue4, metricsValue11.longValue());
        int i4 = u6e.backgroundTasks;
        Long metricsValue12 = activityMetrics7.getMetricsValue();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(metricsValue12);
        String string4 = sb7.toString();
        int iAbs4 = Math.abs(iM44391h4);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(iAbs4);
        arrayList.add(new HomeActivity(4, "Tasks Failed", string4, sb8.toString(), iM44391h4 > 0, 0, false, i4, 0, 352, null));
        ActivityMetrics.MetricsName metricsName5 = ActivityMetrics.MetricsName.TASK_CREATED;
        ActivityMetrics activityMetrics9 = activityMetrices.getActivityMetrics(metricsName5.name(), period);
        ActivityMetrics activityMetrics10 = activityMetrices.getActivityMetrics(metricsName5.name(), periodE0);
        Long metricsValue13 = activityMetrics9.getMetricsValue();
        sq8.m48648g(metricsValue13, "getMetricsValue(...)");
        long jLongValue5 = metricsValue13.longValue();
        Long metricsValue14 = activityMetrics10.getMetricsValue();
        sq8.m48648g(metricsValue14, "getMetricsValue(...)");
        int iM44391h5 = m44391h(jLongValue5, metricsValue14.longValue());
        int i5 = u6e.backgroundTasks;
        Long metricsValue15 = activityMetrics9.getMetricsValue();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(metricsValue15);
        String string5 = sb9.toString();
        int iAbs5 = Math.abs(iM44391h5);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(iAbs5);
        arrayList.add(new HomeActivity(5, "Tasks Created", string5, sb10.toString(), iM44391h5 > 0, 0, false, i5, 0, 352, null));
        ActivityMetrics.MetricsName metricsName6 = ActivityMetrics.MetricsName.TASK_UPDATED;
        ActivityMetrics activityMetrics11 = activityMetrices.getActivityMetrics(metricsName6.name(), period);
        ActivityMetrics activityMetrics12 = activityMetrices.getActivityMetrics(metricsName6.name(), periodE0);
        Long metricsValue16 = activityMetrics11.getMetricsValue();
        sq8.m48648g(metricsValue16, "getMetricsValue(...)");
        long jLongValue6 = metricsValue16.longValue();
        Long metricsValue17 = activityMetrics12.getMetricsValue();
        sq8.m48648g(metricsValue17, "getMetricsValue(...)");
        int iM44391h6 = m44391h(jLongValue6, metricsValue17.longValue());
        int i6 = u6e.backgroundTasks;
        Long metricsValue18 = activityMetrics11.getMetricsValue();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(metricsValue18);
        String string6 = sb11.toString();
        int iAbs6 = Math.abs(iM44391h6);
        StringBuilder sb12 = new StringBuilder();
        sb12.append(iAbs6);
        arrayList.add(new HomeActivity(6, "Tasks Updated", string6, sb12.toString(), iM44391h6 > 0, 0, false, i6, 0, 352, null));
        ActivityMetrics.MetricsName metricsName7 = ActivityMetrics.MetricsName.DEAL_CREATED;
        ActivityMetrics activityMetrics13 = activityMetrices.getActivityMetrics(metricsName7.name(), period);
        activityMetrices.getActivityMetrics(metricsName7.name(), periodE0);
        Long metricsValue19 = activityMetrics13.getMetricsValue();
        sq8.m48648g(metricsValue19, "getMetricsValue(...)");
        long jLongValue7 = metricsValue19.longValue();
        Long metricsValue20 = activityMetrics12.getMetricsValue();
        sq8.m48648g(metricsValue20, "getMetricsValue(...)");
        int iM44391h7 = m44391h(jLongValue7, metricsValue20.longValue());
        int i7 = u6e.backgroundTasks;
        Long metricsValue21 = activityMetrics13.getMetricsValue();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(metricsValue21);
        String string7 = sb13.toString();
        int iAbs7 = Math.abs(iM44391h7);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(iAbs7);
        arrayList.add(new HomeActivity(7, "Deals Created", string7, sb14.toString(), iM44391h7 > 0, 0, false, i7, 0, 352, null));
        ActivityMetrics.MetricsName metricsName8 = ActivityMetrics.MetricsName.DEAL_STAGE_CHANGED;
        ActivityMetrics activityMetrics14 = activityMetrices.getActivityMetrics(metricsName8.name(), period);
        ActivityMetrics activityMetrics15 = activityMetrices.getActivityMetrics(metricsName8.name(), periodE0);
        Long metricsValue22 = activityMetrics14.getMetricsValue();
        sq8.m48648g(metricsValue22, "getMetricsValue(...)");
        long jLongValue8 = metricsValue22.longValue();
        Long metricsValue23 = activityMetrics15.getMetricsValue();
        sq8.m48648g(metricsValue23, "getMetricsValue(...)");
        int iM44391h8 = m44391h(jLongValue8, metricsValue23.longValue());
        int i8 = u6e.backgroundTasks;
        Long metricsValue24 = activityMetrics14.getMetricsValue();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(metricsValue24);
        String string8 = sb15.toString();
        int iAbs8 = Math.abs(iM44391h8);
        StringBuilder sb16 = new StringBuilder();
        sb16.append(iAbs8);
        arrayList.add(new HomeActivity(8, "Deals Moved", string8, sb16.toString(), iM44391h8 > 0, 0, false, i8, 0, 352, null));
        ActivityMetrics activityMetrics16 = activityMetrices.getActivityMetrics(ActivityMetrics.MetricsName.DEAL_WIN.name(), period);
        ActivityMetrics activityMetrics17 = activityMetrices.getActivityMetrics(metricsName8.name(), periodE0);
        Long metricsValue25 = activityMetrics16.getMetricsValue();
        sq8.m48648g(metricsValue25, "getMetricsValue(...)");
        long jLongValue9 = metricsValue25.longValue();
        Long metricsValue26 = activityMetrics17.getMetricsValue();
        sq8.m48648g(metricsValue26, "getMetricsValue(...)");
        int iM44391h9 = m44391h(jLongValue9, metricsValue26.longValue());
        int i9 = u6e.backgroundTasks;
        Long metricsValue27 = activityMetrics16.getMetricsValue();
        StringBuilder sb17 = new StringBuilder();
        sb17.append(metricsValue27);
        String string9 = sb17.toString();
        int iAbs9 = Math.abs(iM44391h9);
        StringBuilder sb18 = new StringBuilder();
        sb18.append(iAbs9);
        arrayList.add(new HomeActivity(9, "Deals Won", string9, sb18.toString(), iM44391h9 > 0, 0, false, i9, 0, 352, null));
        ActivityMetrics.MetricsName metricsName9 = ActivityMetrics.MetricsName.DEAL_LOSS;
        ActivityMetrics activityMetrics18 = activityMetrices.getActivityMetrics(metricsName9.name(), period);
        ActivityMetrics activityMetrics19 = activityMetrices.getActivityMetrics(metricsName9.name(), periodE0);
        Long metricsValue28 = activityMetrics18.getMetricsValue();
        sq8.m48648g(metricsValue28, "getMetricsValue(...)");
        long jLongValue10 = metricsValue28.longValue();
        Long metricsValue29 = activityMetrics19.getMetricsValue();
        sq8.m48648g(metricsValue29, "getMetricsValue(...)");
        int iM44391h10 = m44391h(jLongValue10, metricsValue29.longValue());
        int i10 = u6e.backgroundTasks;
        Long metricsValue30 = activityMetrics18.getMetricsValue();
        StringBuilder sb19 = new StringBuilder();
        sb19.append(metricsValue30);
        String string10 = sb19.toString();
        int iAbs10 = Math.abs(iM44391h10);
        StringBuilder sb20 = new StringBuilder();
        sb20.append(iAbs10);
        arrayList.add(new HomeActivity(10, "Deals Lost", string10, sb20.toString(), iM44391h10 > 0, 0, false, i10, 0, 352, null));
        return arrayList;
    }

    public final AbstractC2145n m0(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new o0(str, null), 2, null);
    }

    /* renamed from: n */
    public final HomeProgressList m44397n(Resources resources, ss9 ss9Var) {
        sq8.m48649h(resources, "resources");
        HomeProgressList homeProgressListM29676b = gz7.m29676b(m44398o(resources, null, ss9Var), pt4.ALL, null);
        sq8.m48648g(homeProgressListM29676b, "enrichHomeProgressList(...)");
        return homeProgressListM29676b;
    }

    /* renamed from: o */
    public final HomeProgressList m44398o(Resources resources, String str, ss9 ss9Var) {
        sq8.m48649h(resources, "resources");
        int[] iArrS0 = s0(resources, str);
        String strM48864g = ss9Var != null ? ss9Var.m48864g(LeadLifecycleStage.UNCONTACTED_NEW.name()) : null;
        if (strM48864g == null) {
            strM48864g = "New";
        }
        String strM38996h = new mge("(?i)\\s*lead\\s*").m38996h(strM48864g, "");
        Locale locale = Locale.ROOT;
        String lowerCase = strM38996h.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        String strM49850b = th1.m49850b(lowerCase);
        String strM48864g2 = ss9Var != null ? ss9Var.m48864g(LeadLifecycleStage.PROSPECTING.name()) : null;
        if (strM48864g2 == null) {
            strM48864g2 = "Prospecting";
        }
        String lowerCase2 = new mge("(?i)\\s*lead\\s*").m38996h(strM48864g2, "").toLowerCase(locale);
        sq8.m48648g(lowerCase2, "toLowerCase(...)");
        String strM49850b2 = th1.m49850b(lowerCase2);
        String strM48864g3 = ss9Var != null ? ss9Var.m48864g(LeadLifecycleStage.OPPORTUNITY.name()) : null;
        if (strM48864g3 == null) {
            strM48864g3 = "Opportunity";
        }
        String lowerCase3 = new mge("(?i)\\s*lead\\s*").m38996h(strM48864g3, "").toLowerCase(locale);
        sq8.m48648g(lowerCase3, "toLowerCase(...)");
        String strM49850b3 = th1.m49850b(lowerCase3);
        return new HomeProgressList(new HomeProgress(u6e.backgroundTasks, w7e.ic_leads, iArrS0[0], strM49850b + "\nLeads", 0, 16, null), new HomeProgress(u6e.backgroundCalls, w7e.ic_star, iArrS0[1], strM49850b2 + "\nLeads", 0, 16, null), new HomeProgress(u6e.backgroundAssigned, w7e.ic_deal_won, iArrS0[2], strM49850b3 + "\nLeads", 0, 16, null), new HomeProgress(u6e.backgroundVisits, w7e.ic_home_task_overdue, iArrS0[3], "All\nFollowups", 0, 16, null));
    }

    public final ryh o0(String str, String str2) {
        ryh searchableContactSortInput;
        LeadFilter leadFilterM27880f = vgf.m52765k().m27880f();
        sq8.m48648g(leadFilterM27880f, "getDashboardNewLeadFilter(...)");
        leadFilterM27880f.setSearchText(str);
        if (str2 != null) {
            leadFilterM27880f.setLeadFilterType(str2);
        }
        SearchableContactFilterInput searchableContactFilterInput$default = leadFilterM27880f.isFilterEmpty() ? null : LeadFilter.getSearchableContactFilterInput$default(leadFilterM27880f, null, 1, null);
        if (leadFilterM27880f.isSortEmpty()) {
            searchableContactSortInput = uyh.of(searchableContactFilterInput$default, null);
            sq8.m48648g(searchableContactSortInput, "of(...)");
        } else {
            searchableContactSortInput = leadFilterM27880f.getSearchableContactSortInput(searchableContactFilterInput$default);
        }
        ryh ryhVarOf = uyh.of(searchableContactSortInput.f44265a, searchableContactSortInput.f44266b);
        sq8.m48648g(ryhVarOf, "of(...)");
        leadFilterM27880f.setSearchText(null);
        return ryhVarOf;
    }

    /* renamed from: p */
    public final HomeProgressList m44399p(Resources resources, ss9 ss9Var) {
        sq8.m48649h(resources, "resources");
        int[] iArrM44385T = m44385T(resources);
        String strM48864g = ss9Var != null ? ss9Var.m48864g(LeadLifecycleStage.UNCONTACTED_NEW.name()) : null;
        if (strM48864g == null) {
            strM48864g = "New";
        }
        String strM38996h = new mge("(?i)\\s*lead\\s*").m38996h(strM48864g, "");
        Locale locale = Locale.ROOT;
        String lowerCase = strM38996h.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        String strM49850b = th1.m49850b(lowerCase);
        String strM48864g2 = ss9Var != null ? ss9Var.m48864g(LeadLifecycleStage.PROSPECTING.name()) : null;
        if (strM48864g2 == null) {
            strM48864g2 = "Prospecting";
        }
        String lowerCase2 = new mge("(?i)\\s*lead\\s*").m38996h(strM48864g2, "").toLowerCase(locale);
        sq8.m48648g(lowerCase2, "toLowerCase(...)");
        String strM49850b2 = th1.m49850b(lowerCase2);
        String strM48864g3 = ss9Var != null ? ss9Var.m48864g(LeadLifecycleStage.OPPORTUNITY.name()) : null;
        if (strM48864g3 == null) {
            strM48864g3 = "Opportunity";
        }
        String lowerCase3 = new mge("(?i)\\s*lead\\s*").m38996h(strM48864g3, "").toLowerCase(locale);
        sq8.m48648g(lowerCase3, "toLowerCase(...)");
        String strM49850b3 = th1.m49850b(lowerCase3);
        HomeProgressList homeProgressListM29676b = gz7.m29676b(new HomeProgressList(new HomeProgress(u6e.backgroundTasks, w7e.ic_leads, iArrM44385T[0], strM49850b + "\nLeads", 0, 16, null), new HomeProgress(u6e.backgroundCalls, w7e.ic_star, iArrM44385T[1], strM49850b2 + "\nLeads", 0, 16, null), new HomeProgress(u6e.backgroundAssigned, w7e.ic_deal_won, iArrM44385T[2], strM49850b3 + "\nLeads", 0, 16, null), new HomeProgress(u6e.backgroundVisits, w7e.ic_home_task_overdue, iArrM44385T[3], "My\nFollowups", 0, 16, null)), pt4.ME, null);
        sq8.m48648g(homeProgressListM29676b, "enrichHomeProgressList(...)");
        return homeProgressListM29676b;
    }

    public final ryh p0(String str, String str2) {
        ryh searchableContactSortInput;
        LeadFilter leadFilterM27881g = vgf.m52765k().m27881g();
        sq8.m48648g(leadFilterM27881g, "getDashboardProspectingLeadFilter(...)");
        leadFilterM27881g.setSearchText(str);
        SearchableContactFilterInput searchableContactFilterInput$default = leadFilterM27881g.isFilterEmpty() ? null : LeadFilter.getSearchableContactFilterInput$default(leadFilterM27881g, null, 1, null);
        if (leadFilterM27881g.isSortEmpty()) {
            searchableContactSortInput = uyh.of(searchableContactFilterInput$default, null);
            sq8.m48648g(searchableContactSortInput, "of(...)");
        } else {
            searchableContactSortInput = leadFilterM27881g.getSearchableContactSortInput(searchableContactFilterInput$default);
        }
        ryh ryhVarOf = uyh.of(searchableContactSortInput.f44265a, searchableContactSortInput.f44266b);
        sq8.m48648g(ryhVarOf, "of(...)");
        leadFilterM27881g.setSearchText(null);
        return ryhVarOf;
    }

    /* renamed from: q */
    public final HomeProgressList m44400q(Resources resources, String str, ss9 ss9Var) {
        sq8.m48649h(resources, "resources");
        HomeProgressList homeProgressListM29676b = gz7.m29676b(m44398o(resources, str, ss9Var), pt4.ALL, str);
        sq8.m48648g(homeProgressListM29676b, "enrichHomeProgressList(...)");
        return homeProgressListM29676b;
    }

    public final AbstractC2145n q0(String str, ActivityMetrics.Period period) {
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new p0(str, period, null), 2, null);
    }

    public final AbstractC2145n r0(Resources resources, String str) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new q0(resources, str, null), 2, null);
    }

    /* renamed from: s */
    public final AbstractC2145n m44401s(Context context, String str) {
        sq8.m48649h(str, "taskInput");
        return e84.m24521b(eu5.m25611b(), 0L, new C16219b(str, null), 2, null);
    }

    public final int[] s0(Resources resources, String str) {
        sq8.m48649h(resources, "resources");
        try {
            Optional optionalOfNullable = Optional.ofNullable(str);
            sq8.m48648g(optionalOfNullable, "ofNullable(...)");
            x6c x6cVarJ0 = c8a.N0(null, optionalOfNullable, Optional.empty(), Optional.empty()).j0(t0.f40962a);
            sq8.m48648g(x6cVarJ0, "onErrorReturn(...)");
            x6c x6cVarJ02 = c8a.S0(null, optionalOfNullable, Optional.empty(), Optional.empty()).j0(v0.f40969a);
            sq8.m48648g(x6cVarJ02, "onErrorReturn(...)");
            x6c x6cVarJ03 = l35.m36493J(str, "Active Deals", "All Deals", "").j0(u0.f40967a);
            sq8.m48648g(x6cVarJ03, "onErrorReturn(...)");
            x6c x6cVarJ04 = c8a.M0(null, optionalOfNullable, Optional.empty()).j0(s0.f40951a);
            sq8.m48648g(x6cVarJ04, "onErrorReturn(...)");
            Object objM55727f = x6c.H0(ch3.m21249n(x6cVarJ0, x6cVarJ02, x6cVarJ03, x6cVarJ04), r0.f40947a).m55727f();
            sq8.m48646e(objM55727f);
            return (int[]) objM55727f;
        } catch (Throwable th) {
            FirebaseCrashlytics.getInstance().recordException(th);
            return new int[]{0, 0, 0, 0};
        }
    }

    /* renamed from: t */
    public final AbstractC2145n m44402t(int i) {
        return e84.m24521b(eu5.m25611b(), 0L, new C16222d(i, null), 2, null);
    }

    public final AbstractC2145n t0(String str, ActivityMetrics.Period period) {
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new w0(str, period, null), 2, null);
    }

    /* renamed from: u */
    public final tr m44403u() {
        return this.f40766e;
    }

    /* renamed from: v */
    public final AbstractC2145n m44404v(Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16223e(resources, null), 2, null);
    }

    public final AbstractC2145n v0(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new x0(str, null), 2, null);
    }

    /* renamed from: w */
    public final AbstractC2145n m44405w(String str, String str2, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16225f(resources, str, str2, null), 2, null);
    }

    public final AbstractC2145n w0(String str, ActivityMetrics.Period period) {
        sq8.m48649h(period, "period");
        return e84.m24521b(eu5.m25611b(), 0L, new y0(str, period, null), 2, null);
    }

    /* renamed from: x */
    public final AbstractC2145n m44406x(String str, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16227g(resources, str, null), 2, null);
    }

    public final LeadsUser x0(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return lpi.a0(str);
    }

    /* renamed from: y */
    public final AbstractC2145n m44407y(String str, String str2, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16229h(resources, str, str2, null), 2, null);
    }

    public final mii y0() {
        return wi0.m54444J();
    }

    /* renamed from: z */
    public final AbstractC2145n m44408z(String str, Resources resources) {
        sq8.m48649h(resources, "resources");
        return e84.m24521b(eu5.m25611b(), 0L, new C16230i(resources, str, null), 2, null);
    }

    public final boolean z0() {
        Boolean boolD0 = lpi.d0();
        sq8.m48648g(boolD0, "isDummyProfileActive(...)");
        return boolD0.booleanValue();
    }
}
