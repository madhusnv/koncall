package p001o;

import ai.salesmax.model.LeadsDeal;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.List;
import java.util.Map;
import p001o.yne;

/* loaded from: classes.dex */
public final class j75 extends zf0 {

    /* renamed from: o.j75$a */
    public static final class C14462a extends jgg implements nl7 {

        /* renamed from: a */
        public int f29880a;

        /* renamed from: b */
        public /* synthetic */ Object f29881b;

        /* renamed from: c */
        public final /* synthetic */ String f29882c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14462a(String str, n64 n64Var) {
            super(2, n64Var);
            this.f29882c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14462a c14462a = new C14462a(this.f29882c, n64Var);
            c14462a.f29881b = obj;
            return c14462a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14462a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ae -> B:38:0x00b1). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f29880a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f29881b = null;
                this.f29880a = 4;
                Object objEmit = r1.emit(yneVarM58027b, this);
                r1 = r1;
                if (objEmit == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29881b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29881b = ogaVar2;
                this.f29880a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3) {
                        oga ogaVar3 = (oga) this.f29881b;
                        wre.m54934b(obj);
                        r1 = ogaVar3;
                        return y3i.f54824a;
                    }
                    if (r1 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f29881b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = l35.m36490G(this.f29882c, 10).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            List list = (List) objM55727f;
            if (list.size() >= 1) {
                yne yneVarM58030d = yne.f55736e.m58030d(list.get(0));
                this.f29881b = ogaVar;
                this.f29880a = 2;
                Object objEmit2 = ogaVar.emit(yneVarM58030d, this);
                r1 = ogaVar;
                if (objEmit2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                yne yneVarM58030d2 = yne.f55736e.m58030d(null);
                this.f29881b = ogaVar;
                this.f29880a = 3;
                Object objEmit3 = ogaVar.emit(yneVarM58030d2, this);
                r1 = ogaVar;
                if (objEmit3 == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.j75$b */
    public static final class C14463b extends jgg implements nl7 {

        /* renamed from: a */
        public int f29883a;

        /* renamed from: b */
        public /* synthetic */ Object f29884b;

        /* renamed from: c */
        public final /* synthetic */ String f29885c;

        /* renamed from: d */
        public final /* synthetic */ String f29886d;

        /* renamed from: e */
        public final /* synthetic */ String f29887e;

        /* renamed from: f */
        public final /* synthetic */ String f29888f;

        /* renamed from: o.j75$b$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f29889a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Deals", paginatedTokenResults);
            }
        }

        /* renamed from: o.j75$b$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f29890a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Team Deals", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14463b(String str, String str2, String str3, String str4, n64 n64Var) {
            super(2, n64Var);
            this.f29885c = str;
            this.f29886d = str2;
            this.f29887e = str3;
            this.f29888f = str4;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14463b c14463b = new C14463b(this.f29885c, this.f29886d, this.f29887e, this.f29888f, n64Var);
            c14463b.f29884b = obj;
            return c14463b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14463b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f29883a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f29884b = null;
                this.f29883a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29884b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29884b = ogaVar2;
                this.f29883a = 1;
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
                ogaVar = (oga) this.f29884b;
                wre.m54934b(obj);
            }
            String str = this.f29885c;
            String string = str != null ? f9g.Z0(str).toString() : null;
            if (string != null && !f9g.d0(string)) {
                z = false;
            }
            PaginatedDataModel paginatedDataModel = z ? (PaginatedDataModel) l35.m36491H(this.f29886d, this.f29887e, 10, this.f29888f).m47686M(a.f29889a).m47698c() : (PaginatedDataModel) l35.m36496M(this.f29885c, this.f29886d, this.f29887e, 10, this.f29888f).m47686M(b.f29890a).m47698c();
            sq8.m48646e(paginatedDataModel);
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f29884b = ogaVar;
            this.f29883a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.j75$c */
    public static final class C14464c extends jgg implements nl7 {

        /* renamed from: a */
        public int f29891a;

        /* renamed from: b */
        public /* synthetic */ Object f29892b;

        /* renamed from: c */
        public final /* synthetic */ String f29893c;

        /* renamed from: d */
        public final /* synthetic */ String[] f29894d;

        /* renamed from: e */
        public final /* synthetic */ String f29895e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14464c(String str, String[] strArr, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f29893c = str;
            this.f29894d = strArr;
            this.f29895e = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14464c c14464c = new C14464c(this.f29893c, this.f29894d, this.f29895e, n64Var);
            c14464c.f29892b = obj;
            return c14464c;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14464c) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f29891a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f29892b = null;
                this.f29891a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29892b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29892b = ogaVar2;
                this.f29891a = 1;
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
                    oga ogaVar3 = (oga) this.f29892b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f29892b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = l35.m36519q(this.f29893c, this.f29894d, ml1.m39301a(false), this.f29895e).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f29892b = ogaVar;
            this.f29891a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.j75$d */
    public static final class C14465d extends jgg implements nl7 {

        /* renamed from: a */
        public int f29896a;

        /* renamed from: b */
        public /* synthetic */ Object f29897b;

        /* renamed from: c */
        public final /* synthetic */ String f29898c;

        /* renamed from: d */
        public final /* synthetic */ String f29899d;

        /* renamed from: e */
        public final /* synthetic */ String f29900e;

        /* renamed from: o.j75$d$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f29901a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Deals", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14465d(String str, String str2, String str3, n64 n64Var) {
            super(2, n64Var);
            this.f29898c = str;
            this.f29899d = str2;
            this.f29900e = str3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14465d c14465d = new C14465d(this.f29898c, this.f29899d, this.f29900e, n64Var);
            c14465d.f29897b = obj;
            return c14465d;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14465d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f29896a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f29897b = null;
                this.f29896a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29897b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29897b = ogaVar2;
                this.f29896a = 1;
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
                    oga ogaVar3 = (oga) this.f29897b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f29897b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = l35.m36494K(this.f29898c, this.f29899d, 10, this.f29900e).m47686M(a.f29901a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f29897b = ogaVar;
            this.f29896a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.j75$e */
    public static final class C14466e extends jgg implements nl7 {

        /* renamed from: a */
        public int f29902a;

        /* renamed from: b */
        public /* synthetic */ Object f29903b;

        /* renamed from: c */
        public final /* synthetic */ String[] f29904c;

        /* renamed from: d */
        public final /* synthetic */ String f29905d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14466e(String[] strArr, String str, n64 n64Var) {
            super(2, n64Var);
            this.f29904c = strArr;
            this.f29905d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14466e c14466e = new C14466e(this.f29904c, this.f29905d, n64Var);
            c14466e.f29903b = obj;
            return c14466e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14466e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f29902a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f29903b = null;
                this.f29902a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29903b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29903b = ogaVar2;
                this.f29902a = 1;
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
                    oga ogaVar3 = (oga) this.f29903b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f29903b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = l35.m36519q(null, this.f29904c, ml1.m39301a(true), this.f29905d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f29903b = ogaVar;
            this.f29902a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.j75$f */
    public static final class C14467f extends jgg implements nl7 {

        /* renamed from: a */
        public int f29906a;

        /* renamed from: b */
        public /* synthetic */ Object f29907b;

        /* renamed from: c */
        public final /* synthetic */ LeadsDeal f29908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14467f(LeadsDeal leadsDeal, n64 n64Var) {
            super(2, n64Var);
            this.f29908c = leadsDeal;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14467f c14467f = new C14467f(this.f29908c, n64Var);
            c14467f.f29907b = obj;
            return c14467f;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14467f) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f29906a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f29907b = null;
                this.f29906a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29907b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29907b = ogaVar2;
                this.f29906a = 1;
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
                    oga ogaVar3 = (oga) this.f29907b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f29907b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = l35.m36498O(this.f29908c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((LeadsDeal) objM55727f);
            this.f29907b = ogaVar;
            this.f29906a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.j75$g */
    public static final class C14468g extends jgg implements nl7 {

        /* renamed from: a */
        public int f29909a;

        /* renamed from: b */
        public /* synthetic */ Object f29910b;

        /* renamed from: c */
        public final /* synthetic */ LeadsDeal f29911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14468g(LeadsDeal leadsDeal, n64 n64Var) {
            super(2, n64Var);
            this.f29911c = leadsDeal;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14468g c14468g = new C14468g(this.f29911c, n64Var);
            c14468g.f29910b = obj;
            return c14468g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14468g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f29909a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f29910b = null;
                this.f29909a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29910b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29910b = ogaVar2;
                this.f29909a = 1;
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
                    oga ogaVar3 = (oga) this.f29910b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f29910b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = l35.m36499P(this.f29911c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((String) objM55727f);
            this.f29910b = ogaVar;
            this.f29909a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j75(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: g */
    public final AbstractC2145n m33324g(String str) {
        sq8.m48649h(str, "contactId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14462a(str, null), 2, null);
    }

    /* renamed from: h */
    public final AbstractC2145n m33325h(String str, String str2, String str3, String str4) {
        sq8.m48649h(str4, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C14463b(str, str2, str3, str4, null), 2, null);
    }

    /* renamed from: i */
    public final AbstractC2145n m33326i(String str, String[] strArr, String str2) {
        sq8.m48649h(strArr, "dealStageFilter");
        return e84.m24521b(eu5.m25611b(), 0L, new C14464c(str, strArr, str2, null), 2, null);
    }

    /* renamed from: j */
    public final AbstractC2145n m33327j(String str, String str2, String str3) {
        sq8.m48649h(str3, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C14465d(str, str2, str3, null), 2, null);
    }

    /* renamed from: k */
    public final AbstractC2145n m33328k(String[] strArr, String str) {
        sq8.m48649h(strArr, "dealStageFilter");
        return e84.m24521b(eu5.m25611b(), 0L, new C14466e(strArr, str, null), 2, null);
    }

    /* renamed from: l */
    public final AbstractC2145n m33329l(LeadsDeal leadsDeal) {
        sq8.m48649h(leadsDeal, "deal");
        return e84.m24521b(eu5.m25611b(), 0L, new C14467f(leadsDeal, null), 2, null);
    }

    /* renamed from: m */
    public final AbstractC2145n m33330m(LeadsDeal leadsDeal) {
        sq8.m48649h(leadsDeal, "deal");
        return e84.m24521b(eu5.m25611b(), 0L, new C14468g(leadsDeal, null), 2, null);
    }
}
