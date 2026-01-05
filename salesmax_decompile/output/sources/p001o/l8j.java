package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.amazonaws.util.StringUtils;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import p001o.yne;

/* loaded from: classes.dex */
public final class l8j extends zf0 {

    /* renamed from: o.l8j$a */
    public static final class C15038a extends jgg implements nl7 {

        /* renamed from: a */
        public int f33484a;

        /* renamed from: b */
        public /* synthetic */ Object f33485b;

        /* renamed from: c */
        public final /* synthetic */ String f33486c;

        /* renamed from: d */
        public final /* synthetic */ String f33487d;

        /* renamed from: o.l8j$a$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f33488a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Templates", paginatedTokenResults);
            }
        }

        /* renamed from: o.l8j$a$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f33489a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Templates", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15038a(String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f33486c = str;
            this.f33487d = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15038a c15038a = new C15038a(this.f33486c, this.f33487d, n64Var);
            c15038a.f33485b = obj;
            return c15038a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C15038a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f33484a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f33485b = null;
                this.f33484a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f33485b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f33485b = ogaVar2;
                this.f33484a = 1;
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
                ogaVar = (oga) this.f33485b;
                wre.m54934b(obj);
            }
            yne yneVarM58030d = yne.f55736e.m58030d((StringUtils.isBlank(this.f33486c) && StringUtils.isBlank(this.f33487d)) ? (PaginatedDataModel) r7j.m46326n(10).d0(a.f33488a).m55727f() : (PaginatedDataModel) r7j.m46327o(this.f33486c, 10, this.f33487d).d0(b.f33489a).m55727f());
            this.f33485b = ogaVar;
            this.f33484a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8j(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: g */
    public final AbstractC2145n m36800g(String str, String str2) {
        sq8.m48649h(str2, "searchTerm");
        return e84.m24521b(eu5.m25611b(), 0L, new C15038a(str, str2, null), 2, null);
    }

    /* renamed from: h */
    public final mii m36801h() {
        return wi0.m54444J();
    }
}
