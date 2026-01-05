package p001o;

import ai.salesmax.model.FilterData;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.yne;
import type.ActivityType;

/* loaded from: classes2.dex */
public final class spi extends zf0 {

    /* renamed from: o.spi$a */
    public static final class C16889a extends jgg implements nl7 {

        /* renamed from: a */
        public int f45746a;

        /* renamed from: b */
        public /* synthetic */ Object f45747b;

        /* renamed from: c */
        public final /* synthetic */ String f45748c;

        /* renamed from: d */
        public final /* synthetic */ String f45749d;

        /* renamed from: o.spi$a$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f45750a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("User Activities", paginatedTokenResults);
            }
        }

        /* renamed from: o.spi$a$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f45751a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("User Activities", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16889a(String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f45748c = str;
            this.f45749d = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16889a c16889a = new C16889a(this.f45748c, this.f45749d, n64Var);
            c16889a.f45747b = obj;
            return c16889a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16889a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d3 -> B:39:0x00d6). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f45746a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f45747b = null;
                this.f45746a = 4;
                Object objEmit = r1.emit(yneVarM58027b, this);
                r1 = r1;
                if (objEmit == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f45747b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f45747b = ogaVar2;
                this.f45746a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3) {
                        oga ogaVar3 = (oga) this.f45747b;
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
                oga ogaVar4 = (oga) this.f45747b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            ActivityType activityTypeM40812i = no.m40812i(this.f45748c);
            if (activityTypeM40812i == null) {
                Object objM47698c = tt.m50464w(this.f45749d, 10, x6c.m55693G()).m47686M(a.f45750a).m47698c();
                sq8.m48648g(objM47698c, "blockingFirst(...)");
                yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
                this.f45747b = ogaVar;
                this.f45746a = 2;
                Object objEmit2 = ogaVar.emit(yneVarM58030d, this);
                r1 = ogaVar;
                if (objEmit2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                Object objM47698c2 = gt.m29465p(this.f45749d, ch3.m21242g(activityTypeM40812i), 10).m47686M(b.f45751a).m47698c();
                sq8.m48648g(objM47698c2, "blockingFirst(...)");
                yne yneVarM58030d2 = yne.f55736e.m58030d((PaginatedDataModel) objM47698c2);
                this.f45747b = ogaVar;
                this.f45746a = 3;
                Object objEmit3 = ogaVar.emit(yneVarM58030d2, this);
                r1 = ogaVar;
                if (objEmit3 == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spi(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: g */
    public final AbstractC2145n m48618g(String str, String str2) {
        sq8.m48649h(str, "ownerId");
        return e84.m24521b(eu5.m25611b(), 0L, new C16889a(str2, str, null), 2, null);
    }

    /* renamed from: h */
    public final ArrayList m48619h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FilterData(false, "leadFilterLeadType", "All Activities", false, null, null, null, Opcodes.LSHL, null));
        Iterator it = m48620i().iterator();
        while (it.hasNext()) {
            arrayList.add(new FilterData(false, "leadFilterLeadType", (String) it.next(), false, null, null, null, Opcodes.LSHL, null));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List m48620i() {
        return new ArrayList(no.m40815l());
    }

    /* renamed from: j */
    public final LeadsUser m48621j(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return lpi.a0(str);
    }

    /* renamed from: k */
    public final mii m48622k() {
        return wi0.m54444J();
    }
}
