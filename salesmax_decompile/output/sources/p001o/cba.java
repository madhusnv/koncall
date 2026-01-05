package p001o;

import ai.salesmax.model.LeadFilter;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.UserContactDetail;
import ai.salesmax.services.model.SavedTableViewInfo;
import ai.salesmax.services.model.SavedTableViewSummary;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.amplifyframework.datastore.generated.model.Team;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.cba;
import p001o.yne;

/* loaded from: classes.dex */
public final class cba extends zf0 {

    /* renamed from: c */
    public ArrayList f17693c;

    /* renamed from: o.cba$a */
    public static final class C12606a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C12606a f17694a = new C12606a();

        public C12606a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional invoke(mw9 mw9Var) {
            return mw9Var.m39735e();
        }
    }

    /* renamed from: o.cba$b */
    public static final class C12607b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C12607b f17695a = new C12607b();

        public C12607b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional invoke(Optional optional) {
            return optional;
        }
    }

    /* renamed from: o.cba$c */
    public static final class C12608c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C12608c f17696a = new C12608c();

        public C12608c() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(ryh ryhVar) {
            return (String) ryhVar.f44265a;
        }
    }

    /* renamed from: o.cba$d */
    public static final class C12609d extends jgg implements nl7 {

        /* renamed from: a */
        public int f17697a;

        /* renamed from: b */
        public /* synthetic */ Object f17698b;

        /* renamed from: o.cba$d$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f17699a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SavedTableViewInfo invoke(SavedTableViewSummary savedTableViewSummary) {
                return savedTableViewSummary.toSavedTableViewInfo();
            }
        }

        public C12609d(n64 n64Var) {
            super(2, n64Var);
        }

        /* renamed from: h */
        public static final SavedTableViewInfo m20688h(xk7 xk7Var, Object obj) {
            return (SavedTableViewInfo) xk7Var.invoke(obj);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12609d c12609d = new C12609d(n64Var);
            c12609d.f17698b = obj;
            return c12609d;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12609d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f17697a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't fetch saved table views", e);
                this.f17698b = null;
                this.f17697a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17698b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17698b = ogaVar2;
                this.f17697a = 1;
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
                    oga ogaVar3 = (oga) this.f17698b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f17698b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = v1f.m52251m(100).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            Stream stream = ((List) objM55727f).stream();
            final a aVar = a.f17699a;
            yne yneVarM58030d = yne.f55736e.m58030d((List) stream.map(new Function() { // from class: o.dba
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return cba.C12609d.m20688h(aVar, obj2);
                }
            }).collect(Collectors.toList()));
            this.f17698b = ogaVar;
            this.f17697a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$e */
    public static final class C12610e extends jgg implements nl7 {

        /* renamed from: a */
        public int f17700a;

        /* renamed from: b */
        public /* synthetic */ Object f17701b;

        /* renamed from: c */
        public final /* synthetic */ String f17702c;

        /* renamed from: o.cba$e$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f17703a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12610e(String str, n64 n64Var) {
            super(2, n64Var);
            this.f17702c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12610e c12610e = new C12610e(this.f17702c, n64Var);
            c12610e.f17701b = obj;
            return c12610e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12610e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f17700a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f17701b = null;
                this.f17700a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17701b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17701b = ogaVar2;
                this.f17700a = 1;
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
                    oga ogaVar3 = (oga) this.f17701b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f17701b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = iu9.i0(this.f17702c, 10).m47686M(a.f17703a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f17701b = ogaVar;
            this.f17700a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$f */
    public static final class C12611f extends jgg implements nl7 {

        /* renamed from: a */
        public int f17704a;

        /* renamed from: b */
        public /* synthetic */ Object f17705b;

        /* renamed from: c */
        public final /* synthetic */ String f17706c;

        /* renamed from: o.cba$f$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f17707a = new a();

            public a() {
                super(1);
            }

            /* renamed from: a */
            public final void m20696a(ls9 ls9Var) {
                sq8.m48649h(ls9Var, "it");
                ls9Var.m37859i().setLeadFilterType("ALL");
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m20696a((ls9) obj);
                return y3i.f54824a;
            }
        }

        /* renamed from: o.cba$f$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f17708a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads", paginatedTokenResults);
            }
        }

        /* renamed from: o.cba$f$c */
        public static final class c implements rl7 {

            /* renamed from: a */
            public static final c f17709a = new c();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12611f(String str, n64 n64Var) {
            super(2, n64Var);
            this.f17706c = str;
        }

        /* renamed from: h */
        public static final void m20694h(xk7 xk7Var, Object obj) {
            xk7Var.invoke(obj);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12611f c12611f = new C12611f(this.f17706c, n64Var);
            c12611f.f17705b = obj;
            return c12611f;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12611f) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f17704a;
            try {
            } catch (Exception e) {
                r1.getClass();
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f17705b = null;
                this.f17704a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17705b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17705b = ogaVar2;
                this.f17704a = 1;
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
                ogaVar = (oga) this.f17705b;
                wre.m54934b(obj);
            }
            vx9 vx9VarB0 = vx9.b0(wx9.ALL);
            sq8.m48648g(vx9VarB0, "of(...)");
            Optional optionalM53587z = vx9VarB0.m53587z();
            final a aVar = a.f17707a;
            optionalM53587z.ifPresent(new Consumer() { // from class: o.eba
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    cba.C12611f.m20694h(aVar, obj2);
                }
            });
            vx9VarB0.h0(this.f17706c);
            if (vx9VarB0.m53582F()) {
                Object objM47698c = lw9.b1(null, 10).m47686M(c.f17709a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Object objM47698c2 = iu9.f0(10).m47686M(b.f17708a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f17705b = ogaVar;
            this.f17704a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$g */
    public static final class C12612g extends jgg implements nl7 {

        /* renamed from: a */
        public int f17710a;

        /* renamed from: b */
        public /* synthetic */ Object f17711b;

        /* renamed from: c */
        public final /* synthetic */ SavedTableViewInfo f17712c;

        /* renamed from: d */
        public final /* synthetic */ String f17713d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12612g(SavedTableViewInfo savedTableViewInfo, String str, n64 n64Var) {
            super(2, n64Var);
            this.f17712c = savedTableViewInfo;
            this.f17713d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12612g c12612g = new C12612g(this.f17712c, this.f17713d, n64Var);
            c12612g.f17711b = obj;
            return c12612g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12612g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(3:(1:(1:7)(2:8|9))(3:10|33|11)|31|32)(1:15))(2:16|(1:18))|19|35|20|(1:22)|31|32|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
        
            r5 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e5 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            int i = this.f17710a;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f17711b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17711b = ogaVar;
                this.f17710a = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        oga ogaVar2 = (oga) this.f17711b;
                        try {
                            wre.m54934b(obj);
                        } catch (Exception e) {
                            e = e;
                            yne.C18447a c18447a = yne.f55736e;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "Error Occurred!";
                            }
                            yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                            this.f17711b = null;
                            this.f17710a = 3;
                            if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
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
                ogaVar = (oga) this.f17711b;
                wre.m54934b(obj);
            }
            oga ogaVar3 = ogaVar;
            Object objM47698c = iu9.g0(new LeadFilter(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, this.f17712c, this.f17713d, null, false, null, null, null, null, null, null, -58720257, 3, null), 10).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d(new PaginatedDataModel("My Saved Table Leads", (PaginatedTokenResults) objM47698c));
            this.f17711b = ogaVar3;
            this.f17710a = 2;
            if (ogaVar3.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$h */
    public static final class C12613h extends jgg implements nl7 {

        /* renamed from: a */
        public int f17714a;

        /* renamed from: b */
        public /* synthetic */ Object f17715b;

        /* renamed from: c */
        public final /* synthetic */ String f17716c;

        /* renamed from: o.cba$h$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f17717a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads", paginatedTokenResults);
            }
        }

        /* renamed from: o.cba$h$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f17718a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Leads", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12613h(String str, n64 n64Var) {
            super(2, n64Var);
            this.f17716c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12613h c12613h = new C12613h(this.f17716c, n64Var);
            c12613h.f17715b = obj;
            return c12613h;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12613h) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f17714a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f17715b = null;
                this.f17714a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17715b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17715b = ogaVar2;
                this.f17714a = 1;
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
                ogaVar = (oga) this.f17715b;
                wre.m54934b(obj);
            }
            vx9 vx9VarB0 = vx9.b0(wx9.ALL);
            sq8.m48648g(vx9VarB0, "of(...)");
            vx9VarB0.h0(this.f17716c);
            if (this.f17716c.length() != 0) {
                z = false;
            }
            if (z) {
                Object objM47698c = lw9.b1(null, 10).m47686M(b.f17718a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Object objM47698c2 = iu9.j0(vx9VarB0, this.f17716c, 10).m47686M(a.f17717a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f17715b = ogaVar;
            this.f17714a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$i */
    public static final class C12614i extends jgg implements nl7 {

        /* renamed from: a */
        public int f17719a;

        /* renamed from: b */
        public /* synthetic */ Object f17720b;

        /* renamed from: c */
        public final /* synthetic */ String f17721c;

        /* renamed from: o.cba$i$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f17722a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Blocked Numbers", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12614i(String str, n64 n64Var) {
            super(2, n64Var);
            this.f17721c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12614i c12614i = new C12614i(this.f17721c, n64Var);
            c12614i.f17720b = obj;
            return c12614i;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12614i) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f17719a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f17720b = null;
                this.f17719a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17720b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17720b = ogaVar2;
                this.f17719a = 1;
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
                    oga ogaVar3 = (oga) this.f17720b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f17720b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = ny3.m41221f(this.f17721c, 10).m47686M(a.f17722a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f17720b = ogaVar;
            this.f17719a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$j */
    public static final class C12615j extends jgg implements nl7 {

        /* renamed from: a */
        public Object f17723a;

        /* renamed from: b */
        public int f17724b;

        /* renamed from: c */
        public /* synthetic */ Object f17725c;

        /* renamed from: d */
        public final /* synthetic */ String f17726d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12615j(String str, n64 n64Var) {
            super(2, n64Var);
            this.f17726d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12615j c12615j = new C12615j(this.f17726d, n64Var);
            c12615j.f17725c = obj;
            return c12615j;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12615j) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(3:7|33|34)(2:8|9))(6:10|35|11|23|33|34))(1:15))(2:16|(1:18))|37|19|(1:21)(4:22|23|33|34)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        
            r4 = r8;
            r8 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            LeadsSummary leadsSummary;
            Object objM51918f = uq8.m51918f();
            int i = this.f17724b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f17725c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17725c = ogaVar;
                this.f17724b = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    leadsSummary = (LeadsSummary) this.f17723a;
                    ogaVar2 = (oga) this.f17725c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("getContactByPhoneNumber " + leadsSummary));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("getContactByPhoneNumber " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error Occurred!";
                        }
                        yne yneVarM58028a = c18447a.m58028a(null, message, e2);
                        this.f17725c = null;
                        this.f17723a = null;
                        this.f17724b = 3;
                        if (ogaVar2.emit(yneVarM58028a, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f17725c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            leadsSummary = (LeadsSummary) lw9.e1(this.f17726d).orElse(null);
            yne yneVarM58030d = yne.f55736e.m58030d(leadsSummary);
            this.f17725c = ogaVar;
            this.f17723a = leadsSummary;
            this.f17724b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("getContactByPhoneNumber " + leadsSummary));
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$k */
    public static final class C12616k extends jgg implements nl7 {

        /* renamed from: a */
        public Object f17727a;

        /* renamed from: b */
        public int f17728b;

        /* renamed from: c */
        public /* synthetic */ Object f17729c;

        /* renamed from: d */
        public final /* synthetic */ String f17730d;

        /* renamed from: o.cba$k$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f17731a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Optional apply(LeadsSummary leadsSummary) {
                sq8.m48649h(leadsSummary, "it");
                return Optional.ofNullable(leadsSummary);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12616k(String str, n64 n64Var) {
            super(2, n64Var);
            this.f17730d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12616k c12616k = new C12616k(this.f17730d, n64Var);
            c12616k.f17729c = obj;
            return c12616k;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12616k) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(1:(1:(3:7|40|41)(2:8|9))(6:10|44|11|30|40|41))(1:15))(2:16|(1:18))|42|19|(1:21)(1:22)|(1:24)(1:25)|26|(1:28)(4:29|30|40|41)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
        
            r4 = r8;
            r8 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
        
            r2 = "Error Occurred!";
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e1 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            LeadsSummary leadsSummary;
            Object objM51918f = uq8.m51918f();
            int i = this.f17728b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f17729c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17729c = ogaVar;
                this.f17728b = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    leadsSummary = (LeadsSummary) this.f17727a;
                    ogaVar2 = (oga) this.f17729c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("getContactByPhoneNumber " + leadsSummary));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("getContactByPhoneNumber " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                        }
                        yne yneVarM58028a = c18447a.m58028a(null, message, e2);
                        this.f17729c = null;
                        this.f17727a = null;
                        this.f17728b = 3;
                        if (ogaVar2.emit(yneVarM58028a, this) == objM51918f) {
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f17729c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            Object objM55729h = lw9.f1(this.f17730d).d0(a.f17731a).z0(x6c.c0(Optional.empty())).m55729h();
            sq8.m48648g(objM55729h, "blockingSingle(...)");
            Optional optional = (Optional) objM55729h;
            if (!optional.isPresent()) {
                optional = null;
            }
            leadsSummary = optional != null ? (LeadsSummary) optional.get() : null;
            yne yneVarM58030d = yne.f55736e.m58030d(leadsSummary);
            this.f17729c = ogaVar;
            this.f17727a = leadsSummary;
            this.f17728b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("getContactByPhoneNumber " + leadsSummary));
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$l */
    public static final class C12617l extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C12617l f17732a = new C12617l();

        public C12617l() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeadFilter invoke(ls9 ls9Var) {
            return ls9Var.m37859i();
        }
    }

    /* renamed from: o.cba$m */
    public static final class C12618m extends jgg implements nl7 {

        /* renamed from: a */
        public int f17733a;

        /* renamed from: b */
        public /* synthetic */ Object f17734b;

        /* renamed from: c */
        public final /* synthetic */ String f17735c;

        /* renamed from: o.cba$m$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f17736a = new a();

            public a() {
                super(1);
            }

            /* renamed from: a */
            public final void m20712a(ls9 ls9Var) {
                sq8.m48649h(ls9Var, "it");
                ls9Var.m37859i().setLeadFilterType("ME");
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m20712a((ls9) obj);
                return y3i.f54824a;
            }
        }

        /* renamed from: o.cba$m$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f17737a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Leads", paginatedTokenResults);
            }
        }

        /* renamed from: o.cba$m$c */
        public static final class c implements rl7 {

            /* renamed from: a */
            public static final c f17738a = new c();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Leads", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12618m(String str, n64 n64Var) {
            super(2, n64Var);
            this.f17735c = str;
        }

        /* renamed from: h */
        public static final void m20710h(xk7 xk7Var, Object obj) {
            xk7Var.invoke(obj);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12618m c12618m = new C12618m(this.f17735c, n64Var);
            c12618m.f17734b = obj;
            return c12618m;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12618m) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f17733a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f17734b = null;
                this.f17733a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17734b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17734b = ogaVar2;
                this.f17733a = 1;
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
                ogaVar = (oga) this.f17734b;
                wre.m54934b(obj);
            }
            vx9 vx9VarB0 = vx9.b0(wx9.ME);
            sq8.m48648g(vx9VarB0, "of(...)");
            vx9VarB0.h0(this.f17735c);
            Optional optionalM53587z = vx9VarB0.m53587z();
            final a aVar = a.f17736a;
            optionalM53587z.ifPresent(new Consumer() { // from class: o.fba
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    cba.C12618m.m20710h(aVar, obj2);
                }
            });
            if (vx9VarB0.m53582F()) {
                Object objM47698c = lw9.j1(null, 10).m47686M(c.f17738a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Object objM47698c2 = iu9.o0(10).m47686M(b.f17737a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f17734b = ogaVar;
            this.f17733a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$n */
    public static final class C12619n extends jgg implements nl7 {

        /* renamed from: a */
        public int f17739a;

        /* renamed from: b */
        public /* synthetic */ Object f17740b;

        /* renamed from: c */
        public final /* synthetic */ SavedTableViewInfo f17741c;

        /* renamed from: d */
        public final /* synthetic */ String f17742d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12619n(SavedTableViewInfo savedTableViewInfo, String str, n64 n64Var) {
            super(2, n64Var);
            this.f17741c = savedTableViewInfo;
            this.f17742d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12619n c12619n = new C12619n(this.f17741c, this.f17742d, n64Var);
            c12619n.f17740b = obj;
            return c12619n;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12619n) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(3:(1:(1:7)(2:8|9))(3:10|33|11)|31|32)(1:15))(2:16|(1:18))|19|35|20|(1:22)|31|32|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
        
            r5 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e5 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            int i = this.f17739a;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f17740b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17740b = ogaVar;
                this.f17739a = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        oga ogaVar2 = (oga) this.f17740b;
                        try {
                            wre.m54934b(obj);
                        } catch (Exception e) {
                            e = e;
                            yne.C18447a c18447a = yne.f55736e;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "Error Occurred!";
                            }
                            yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                            this.f17740b = null;
                            this.f17739a = 3;
                            if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
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
                ogaVar = (oga) this.f17740b;
                wre.m54934b(obj);
            }
            oga ogaVar3 = ogaVar;
            Object objM47698c = iu9.q0(new LeadFilter(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, this.f17741c, this.f17742d, null, false, null, null, null, null, null, null, -58720257, 3, null), 10).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d(new PaginatedDataModel("My Saved Table Leads", (PaginatedTokenResults) objM47698c));
            this.f17740b = ogaVar3;
            this.f17739a = 2;
            if (ogaVar3.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$o */
    public static final class C12620o extends jgg implements nl7 {

        /* renamed from: a */
        public int f17743a;

        /* renamed from: b */
        public /* synthetic */ Object f17744b;

        /* renamed from: c */
        public final /* synthetic */ String f17745c;

        /* renamed from: d */
        public final /* synthetic */ String f17746d;

        /* renamed from: e */
        public final /* synthetic */ List f17747e;

        /* renamed from: o.cba$o$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f17748a = new a();

            public a() {
                super(1);
            }

            /* renamed from: a */
            public final void m20719a(ls9 ls9Var) {
                sq8.m48649h(ls9Var, "it");
                ls9Var.m37859i().setLeadFilterType("TEAM");
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m20719a((ls9) obj);
                return y3i.f54824a;
            }
        }

        /* renamed from: o.cba$o$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f17749a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Team Leads", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12620o(String str, String str2, List list, n64 n64Var) {
            super(2, n64Var);
            this.f17745c = str;
            this.f17746d = str2;
            this.f17747e = list;
        }

        /* renamed from: h */
        public static final void m20717h(xk7 xk7Var, Object obj) {
            xk7Var.invoke(obj);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12620o c12620o = new C12620o(this.f17745c, this.f17746d, this.f17747e, n64Var);
            c12620o.f17744b = obj;
            return c12620o;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12620o) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f17743a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f17744b = null;
                this.f17743a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17744b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17744b = ogaVar2;
                this.f17743a = 1;
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
                ogaVar = (oga) this.f17744b;
                wre.m54934b(obj);
            }
            vx9 vx9VarB0 = vx9.b0(wx9.MY_TEAM);
            sq8.m48648g(vx9VarB0, "of(...)");
            vx9VarB0.h0(this.f17745c);
            Optional optionalM53587z = vx9VarB0.m53587z();
            final a aVar = a.f17748a;
            optionalM53587z.ifPresent(new Consumer() { // from class: o.gba
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    cba.C12620o.m20717h(aVar, obj2);
                }
            });
            Team teamJustId = Team.justId(this.f17746d);
            sq8.m48648g(teamJustId, "justId(...)");
            List list = this.f17747e;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Team.justId((String) it.next()));
            }
            vx9VarB0.i0(teamJustId);
            vx9VarB0.g0(arrayList);
            Object objM47698c = iu9.s0(10).m47686M(b.f17749a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f17744b = ogaVar;
            this.f17743a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$p */
    public static final class C12621p extends jgg implements nl7 {

        /* renamed from: a */
        public int f17750a;

        /* renamed from: b */
        public /* synthetic */ Object f17751b;

        /* renamed from: d */
        public final /* synthetic */ String f17753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12621p(String str, n64 n64Var) {
            super(2, n64Var);
            this.f17753d = str;
        }

        /* renamed from: h */
        public static final List m20722h(List list) {
            return (List) iu9.m32800D(list).m47698c();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12621p c12621p = cba.this.new C12621p(this.f17753d, n64Var);
            c12621p.f17751b = obj;
            return c12621p;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12621p) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            boolean z;
            Object next;
            Object next2;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f17750a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f17751b = null;
                this.f17750a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17751b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17751b = ogaVar2;
                this.f17750a = 1;
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
                ogaVar = (oga) this.f17751b;
                wre.m54934b(obj);
            }
            ArrayList arrayList = new ArrayList();
            if (arrayList.isEmpty()) {
                arrayList = !j4d.m33224l(cba.this.m59366f()) ? new ArrayList() : jm7.m34022H(cba.this.m59366f());
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                arrayList2.add(obj2);
            }
            if (!f9g.d0(this.f17753d)) {
                String str = this.f17753d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    UserContactDetail userContactDetail = (UserContactDetail) obj3;
                    if (!f9g.m26304N(userContactDetail.getName(), str, true)) {
                        Iterator<T> it = userContactDetail.getPhoneNumber().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (f9g.m26304N((String) next, str, true)) {
                                break;
                            }
                        }
                        if (next == null) {
                            Iterator<T> it2 = userContactDetail.getEmailId().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                if (f9g.m26304N((String) next2, str, true)) {
                                    break;
                                }
                            }
                            z = next2 != null;
                        }
                    }
                    if (z) {
                        arrayList3.add(obj3);
                    }
                }
                arrayList2 = arrayList3;
            }
            PaginatedTokenResults paginatedTokenResultsBatchMap = PaginatedTokenResults.fromList(arrayList2, 10).batchMap(new Function() { // from class: o.hba
                @Override // java.util.function.Function
                public final Object apply(Object obj4) {
                    return cba.C12621p.m20722h((List) obj4);
                }
            });
            paginatedTokenResultsBatchMap.loadInitial();
            yne yneVarM58030d = yne.f55736e.m58030d(new PaginatedDataModel("My Phone Contacts", paginatedTokenResultsBatchMap));
            this.f17751b = ogaVar;
            this.f17750a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cba$q */
    public static final class C12622q extends jgg implements nl7 {

        /* renamed from: a */
        public int f17754a;

        /* renamed from: b */
        public /* synthetic */ Object f17755b;

        /* renamed from: c */
        public final /* synthetic */ SavedTableViewInfo f17756c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12622q(SavedTableViewInfo savedTableViewInfo, n64 n64Var) {
            super(2, n64Var);
            this.f17756c = savedTableViewInfo;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12622q c12622q = new C12622q(this.f17756c, n64Var);
            c12622q.f17755b = obj;
            return c12622q;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C12622q) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f17754a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't fetch saved table views", e);
                this.f17755b = null;
                this.f17754a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f17755b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f17755b = ogaVar2;
                this.f17754a = 1;
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
                    oga ogaVar3 = (oga) this.f17755b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f17755b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = v1f.m52238C(this.f17756c.toSavedTableViewSummary()).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d(((SavedTableViewSummary) objM55727f).toSavedTableViewInfo());
            this.f17755b = ogaVar;
            this.f17754a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cba(Application application) {
        super(application);
        sq8.m48649h(application, "application");
        this.f17693c = new ArrayList();
    }

    /* renamed from: G */
    public static /* synthetic */ void m20657G(cba cbaVar, LeadFilter leadFilter, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        cbaVar.m20671F(leadFilter, str);
    }

    /* renamed from: l */
    public static final Optional m20662l(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Optional) xk7Var.invoke(obj);
    }

    /* renamed from: m */
    public static final Optional m20663m(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Optional) xk7Var.invoke(obj);
    }

    /* renamed from: n */
    public static final String m20664n(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* renamed from: x */
    public static final LeadFilter m20665x(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadFilter) xk7Var.invoke(obj);
    }

    /* renamed from: A */
    public final AbstractC2145n m20666A(String str, SavedTableViewInfo savedTableViewInfo) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12619n(savedTableViewInfo, str, null), 2, null);
    }

    /* renamed from: B */
    public final AbstractC2145n m20667B(String str, List list, String str2) {
        sq8.m48649h(str, "teamID");
        sq8.m48649h(list, "teamIds");
        sq8.m48649h(str2, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12620o(str2, str, list, null), 2, null);
    }

    /* renamed from: C */
    public final AbstractC2145n m20668C(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12621p(str, null), 2, null);
    }

    /* renamed from: D */
    public final mii m20669D() {
        return wi0.m54444J();
    }

    /* renamed from: E */
    public final boolean m20670E() {
        Boolean boolC0 = lpi.c0();
        sq8.m48648g(boolC0, "isCloudTelephonyEnabled(...)");
        return boolC0.booleanValue();
    }

    /* renamed from: F */
    public final void m20671F(LeadFilter leadFilter, String str) {
        sq8.m48649h(leadFilter, "leadFilter");
        Object objOrElse = m20683y().m53587z().orElse(new ls9());
        sq8.m48648g(objOrElse, "orElse(...)");
        ls9 ls9Var = (ls9) objOrElse;
        ls9Var.m37860j(leadFilter);
        if (str != null) {
            vx9.a0(str).f0(ls9Var);
            return;
        }
        vx9.b0(wx9.ME).f0(ls9Var);
        vx9.b0(wx9.MY_TEAM).f0(ls9Var);
        vx9.b0(wx9.ALL).f0(ls9Var);
    }

    /* renamed from: H */
    public final AbstractC2145n m20672H(SavedTableViewInfo savedTableViewInfo) {
        sq8.m48649h(savedTableViewInfo, "savedTableViewInfo");
        return e84.m24521b(eu5.m25611b(), 0L, new C12622q(savedTableViewInfo, null), 2, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: k */
    public final void m20673k(Leads leads, Leads leads2, wx9 wx9Var) {
        sq8.m48649h(leads, "lead");
        sq8.m48649h(wx9Var, "leadViewOptionType");
        Optional optionalM53580D = vx9.b0(wx9Var).m53580D();
        final C12606a c12606a = C12606a.f17694a;
        Optional map = optionalM53580D.map(new Function() { // from class: o.zaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cba.m20662l(c12606a, obj);
            }
        });
        final C12607b c12607b = C12607b.f17695a;
        Optional optionalFlatMap = map.flatMap(new Function() { // from class: o.aba
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cba.m20663m(c12607b, obj);
            }
        });
        final C12608c c12608c = C12608c.f17696a;
        leads.setSortedByField((String) optionalFlatMap.map(new Function() { // from class: o.bba
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cba.m20664n(c12608c, obj);
            }
        }).orElse("updatedAt"));
        String sortedByField = leads.getSortedByField();
        if (sortedByField != null) {
            switch (sortedByField.hashCode()) {
                case -1997679840:
                    if (sortedByField.equals("lastCalledTime")) {
                        leads.setCurrentSortByValue(leads.getLastCalledTime());
                        leads.setOldSortByValue(leads2 != null ? leads2.getLastCalledTime() : null);
                        leads.setSortedByDataType(zfe.DATE_TIME_TYPE);
                        break;
                    }
                    break;
                case -1949194674:
                    if (sortedByField.equals("updatedAt")) {
                        leads.setCurrentSortByValue(leads.getUpdatedAt());
                        leads.setOldSortByValue(leads2 != null ? leads2.getUpdatedAt() : null);
                        leads.setSortedByDataType(zfe.DATE_TIME_TYPE);
                        break;
                    }
                    break;
                case -1662824338:
                    if (sortedByField.equals("lastEngagementFromAccount")) {
                        leads.setCurrentSortByValue(leads.getLastEngagementTimeFromAccount());
                        leads.setOldSortByValue(leads2 != null ? leads2.getLastEngagementTimeFromAccount() : null);
                        leads.setSortedByDataType(zfe.DATE_TIME_TYPE);
                        break;
                    }
                    break;
                case -6208454:
                    if (sortedByField.equals("lastLeadAssignmentDateTime")) {
                        leads.setCurrentSortByValue(Long.valueOf(leads.getLastLeadAssignmentDateTimeInMillis()));
                        leads.setOldSortByValue(leads2 != null ? Long.valueOf(leads2.getLastLeadAssignmentDateTimeInMillis()) : null);
                        leads.setSortedByDataType(zfe.DATE_TIME_TYPE);
                        break;
                    }
                    break;
                case 3373707:
                    if (sortedByField.equals("name")) {
                        leads.setCurrentSortByValue(leads.getName());
                        leads.setOldSortByValue(leads2 != null ? leads2.getName() : null);
                        leads.setSortedByDataType(zfe.INITIAL);
                        break;
                    }
                    break;
                case 598371643:
                    if (sortedByField.equals("createdAt")) {
                        leads.setCurrentSortByValue(leads.getCreatedAt());
                        leads.setOldSortByValue(leads2 != null ? leads2.getCreatedAt() : null);
                        leads.setSortedByDataType(zfe.DATE_TIME_TYPE);
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: o */
    public final AbstractC2145n m20674o() {
        return e84.m24521b(eu5.m25611b(), 0L, new C12609d(null), 2, null);
    }

    /* renamed from: p */
    public final AbstractC2145n m20675p(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12610e(str, null), 2, null);
    }

    /* renamed from: q */
    public final AbstractC2145n m20676q(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12611f(str, null), 2, null);
    }

    /* renamed from: r */
    public final AbstractC2145n m20677r(String str, SavedTableViewInfo savedTableViewInfo) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12612g(savedTableViewInfo, str, null), 2, null);
    }

    /* renamed from: s */
    public final AbstractC2145n m20678s(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12613h(str, null), 2, null);
    }

    /* renamed from: t */
    public final AbstractC2145n m20679t(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12614i(str, null), 2, null);
    }

    /* renamed from: u */
    public final AbstractC2145n m20680u(String str) {
        sq8.m48649h(str, "phoneNumber");
        return e84.m24521b(eu5.m25611b(), 0L, new C12615j(str, null), 2, null);
    }

    /* renamed from: v */
    public final AbstractC2145n m20681v(String str) {
        sq8.m48649h(str, "phoneNumber");
        return e84.m24521b(eu5.m25611b(), 0L, new C12616k(str, null), 2, null);
    }

    /* renamed from: w */
    public final Optional m20682w() {
        Optional optionalM53587z = m20683y().m53587z();
        final C12617l c12617l = C12617l.f17732a;
        Optional map = optionalM53587z.map(new Function() { // from class: o.yaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cba.m20665x(c12617l, obj);
            }
        });
        sq8.m48648g(map, "map(...)");
        return map;
    }

    /* renamed from: y */
    public final vx9 m20683y() {
        vx9 vx9VarB0 = vx9.b0(wx9.ME);
        sq8.m48648g(vx9VarB0, "of(...)");
        return vx9VarB0;
    }

    /* renamed from: z */
    public final AbstractC2145n m20684z(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C12618m(str, null), 2, null);
    }
}
