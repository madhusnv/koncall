package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import p001o.yne;

/* loaded from: classes.dex */
public final class q4c extends zf0 {

    /* renamed from: o.q4c$a */
    public static final class C16290a extends jgg implements nl7 {

        /* renamed from: a */
        public int f41290a;

        /* renamed from: b */
        public /* synthetic */ Object f41291b;

        /* renamed from: o.q4c$a$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f41292a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Notification Stagings", paginatedTokenResults);
            }
        }

        public C16290a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16290a c16290a = new C16290a(n64Var);
            c16290a.f41291b = obj;
            return c16290a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16290a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f41290a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f41291b = null;
                this.f41290a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f41291b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f41291b = ogaVar2;
                this.f41290a = 1;
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
                    oga ogaVar3 = (oga) this.f41291b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f41291b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = o4c.m41524c(10).m47686M(a.f41292a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f41291b = ogaVar;
            this.f41290a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4c(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: h */
    public static /* synthetic */ AbstractC2145n m44801h(q4c q4cVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return q4cVar.m44802g(i);
    }

    /* renamed from: g */
    public final AbstractC2145n m44802g(int i) {
        return e84.m24521b(eu5.m25611b(), 0L, new C16290a(null), 2, null);
    }
}
