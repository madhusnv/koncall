package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.TaskCategoryList;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.TodoFilter;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.amplifyframework.datastore.generated.model.Team;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import p001o.yne;

/* loaded from: classes2.dex */
public final class tph extends zf0 {

    /* renamed from: o.tph$a */
    public static final class C17174a extends jgg implements nl7 {

        /* renamed from: a */
        public int f47537a;

        /* renamed from: b */
        public /* synthetic */ Object f47538b;

        /* renamed from: d */
        public final /* synthetic */ String f47540d;

        /* renamed from: e */
        public final /* synthetic */ String f47541e;

        /* renamed from: f */
        public final /* synthetic */ List f47542f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17174a(String str, String str2, List list, n64 n64Var) {
            super(2, n64Var);
            this.f47540d = str;
            this.f47541e = str2;
            this.f47542f = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17174a c17174a = tph.this.new C17174a(this.f47540d, this.f47541e, this.f47542f, n64Var);
            c17174a.f47538b = obj;
            return c17174a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17174a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f47537a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f47538b = null;
                this.f47537a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f47538b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f47538b = ogaVar2;
                this.f47537a = 1;
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
                ogaVar = (oga) this.f47538b;
                wre.m54934b(obj);
            }
            tph tphVar = tph.this;
            String str = this.f47540d;
            wqh wqhVar = wqh.ALL;
            tphVar.m50310w(str, wqhVar);
            vqh vqhVarC0 = vqh.c0(wqhVar);
            sq8.m48648g(vqhVarC0, "of(...)");
            vqhVarC0.h0(this.f47541e);
            Object objM55727f = mrg.y0(this.f47542f).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            List<ryh> list = (List) objM55727f;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            for (ryh ryhVar : list) {
                TaskCategoryList taskCategoryList = new TaskCategoryList(null, false, null, 7, null);
                Object obj2 = ryhVar.f44265a;
                sq8.m48648g(obj2, "_1");
                taskCategoryList.setKey((String) obj2);
                taskCategoryList.setDisplayWithCount(String.valueOf(ryhVar.f44266b));
                taskCategoryList.setSelected(false);
                arrayList.add(taskCategoryList);
            }
            yne yneVarM58030d = yne.f55736e.m58030d(kh3.Q0(arrayList));
            this.f47538b = ogaVar;
            this.f47537a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.tph$b */
    public static final class C17175b extends jgg implements nl7 {

        /* renamed from: a */
        public int f47543a;

        /* renamed from: b */
        public /* synthetic */ Object f47544b;

        /* renamed from: d */
        public final /* synthetic */ String f47546d;

        /* renamed from: e */
        public final /* synthetic */ String f47547e;

        /* renamed from: o.tph$b$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f47548a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Tasks", paginatedTokenResults);
            }
        }

        /* renamed from: o.tph$b$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f47549a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17175b(String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f47546d = str;
            this.f47547e = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17175b c17175b = tph.this.new C17175b(this.f47546d, this.f47547e, n64Var);
            c17175b.f47544b = obj;
            return c17175b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17175b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f47543a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f47544b = null;
                this.f47543a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f47544b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f47544b = ogaVar2;
                this.f47543a = 1;
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
                ogaVar = (oga) this.f47544b;
                wre.m54934b(obj);
            }
            tph tphVar = tph.this;
            String str = this.f47546d;
            wqh wqhVar = wqh.ALL;
            tphVar.m50310w(str, wqhVar);
            vqh vqhVarC0 = vqh.c0(wqhVar);
            sq8.m48648g(vqhVarC0, "of(...)");
            vqhVarC0.h0(this.f47547e);
            if (vqhVarC0.m53287G()) {
                Object objM47698c = jyg.Y2(10).m47686M(b.f47549a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Object objM47698c2 = mrg.V1(10).m47686M(a.f47548a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f47544b = ogaVar;
            this.f47543a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.tph$c */
    public static final class C17176c extends jgg implements nl7 {

        /* renamed from: a */
        public int f47550a;

        /* renamed from: b */
        public /* synthetic */ Object f47551b;

        /* renamed from: c */
        public final /* synthetic */ String f47552c;

        /* renamed from: d */
        public final /* synthetic */ String f47553d;

        /* renamed from: e */
        public final /* synthetic */ String f47554e;

        /* renamed from: o.tph$c$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f47555a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17176c(String str, String str2, String str3, n64 n64Var) {
            super(2, n64Var);
            this.f47552c = str;
            this.f47553d = str2;
            this.f47554e = str3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17176c c17176c = new C17176c(this.f47552c, this.f47553d, this.f47554e, n64Var);
            c17176c.f47551b = obj;
            return c17176c;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17176c) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f47550a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f47551b = null;
                this.f47550a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f47551b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f47551b = ogaVar2;
                this.f47550a = 1;
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
                    oga ogaVar3 = (oga) this.f47551b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f47551b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = mrg.W1(this.f47552c, this.f47553d, this.f47554e, 10).m47686M(a.f47555a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f47551b = ogaVar;
            this.f47550a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.tph$d */
    public static final class C17177d extends jgg implements nl7 {

        /* renamed from: a */
        public int f47556a;

        /* renamed from: b */
        public /* synthetic */ Object f47557b;

        /* renamed from: d */
        public final /* synthetic */ String f47559d;

        /* renamed from: e */
        public final /* synthetic */ String f47560e;

        /* renamed from: f */
        public final /* synthetic */ List f47561f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17177d(String str, String str2, List list, n64 n64Var) {
            super(2, n64Var);
            this.f47559d = str;
            this.f47560e = str2;
            this.f47561f = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17177d c17177d = tph.this.new C17177d(this.f47559d, this.f47560e, this.f47561f, n64Var);
            c17177d.f47557b = obj;
            return c17177d;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17177d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f47556a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f47557b = null;
                this.f47556a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f47557b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f47557b = ogaVar2;
                this.f47556a = 1;
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
                ogaVar = (oga) this.f47557b;
                wre.m54934b(obj);
            }
            tph tphVar = tph.this;
            String str = this.f47559d;
            wqh wqhVar = wqh.ME;
            tphVar.m50310w(str, wqhVar);
            vqh vqhVarC0 = vqh.c0(wqhVar);
            sq8.m48648g(vqhVarC0, "of(...)");
            vqhVarC0.h0(this.f47560e);
            Object objM55727f = mrg.z0(this.f47561f).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            List<ryh> list = (List) objM55727f;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            for (ryh ryhVar : list) {
                TaskCategoryList taskCategoryList = new TaskCategoryList(null, false, null, 7, null);
                Object obj2 = ryhVar.f44265a;
                sq8.m48648g(obj2, "_1");
                taskCategoryList.setKey((String) obj2);
                taskCategoryList.setDisplayWithCount(String.valueOf(ryhVar.f44266b));
                taskCategoryList.setSelected(false);
                arrayList.add(taskCategoryList);
            }
            yne yneVarM58030d = yne.f55736e.m58030d(kh3.Q0(arrayList));
            this.f47557b = ogaVar;
            this.f47556a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.tph$e */
    public static final class C17178e extends jgg implements nl7 {

        /* renamed from: a */
        public int f47562a;

        /* renamed from: b */
        public /* synthetic */ Object f47563b;

        /* renamed from: d */
        public final /* synthetic */ String f47565d;

        /* renamed from: e */
        public final /* synthetic */ String f47566e;

        /* renamed from: o.tph$e$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f47567a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Tasks", paginatedTokenResults);
            }
        }

        /* renamed from: o.tph$e$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f47568a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("My Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17178e(String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f47565d = str;
            this.f47566e = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17178e c17178e = tph.this.new C17178e(this.f47565d, this.f47566e, n64Var);
            c17178e.f47563b = obj;
            return c17178e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17178e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f47562a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f47563b = null;
                this.f47562a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f47563b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f47563b = ogaVar2;
                this.f47562a = 1;
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
                ogaVar = (oga) this.f47563b;
                wre.m54934b(obj);
            }
            tph tphVar = tph.this;
            String str = this.f47565d;
            wqh wqhVar = wqh.ME;
            tphVar.m50310w(str, wqhVar);
            vqh vqhVarC0 = vqh.c0(wqhVar);
            sq8.m48648g(vqhVarC0, "of(...)");
            vqhVarC0.h0(this.f47566e);
            if (vqhVarC0.m53287G()) {
                Object objM47698c = jyg.a3(10).m47686M(b.f47568a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Object objM47698c2 = mrg.h2(10).m47686M(a.f47567a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f47563b = ogaVar;
            this.f47562a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.tph$f */
    public static final class C17179f extends jgg implements nl7 {

        /* renamed from: a */
        public int f47569a;

        /* renamed from: b */
        public /* synthetic */ Object f47570b;

        /* renamed from: d */
        public final /* synthetic */ String f47572d;

        /* renamed from: e */
        public final /* synthetic */ String f47573e;

        /* renamed from: f */
        public final /* synthetic */ String f47574f;

        /* renamed from: g */
        public final /* synthetic */ List f47575g;

        /* renamed from: h */
        public final /* synthetic */ List f47576h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17179f(String str, String str2, String str3, List list, List list2, n64 n64Var) {
            super(2, n64Var);
            this.f47572d = str;
            this.f47573e = str2;
            this.f47574f = str3;
            this.f47575g = list;
            this.f47576h = list2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17179f c17179f = tph.this.new C17179f(this.f47572d, this.f47573e, this.f47574f, this.f47575g, this.f47576h, n64Var);
            c17179f.f47570b = obj;
            return c17179f;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17179f) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f47569a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f47570b = null;
                this.f47569a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f47570b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f47570b = ogaVar2;
                this.f47569a = 1;
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
                ogaVar = (oga) this.f47570b;
                wre.m54934b(obj);
            }
            tph tphVar = tph.this;
            String str = this.f47572d;
            wqh wqhVar = wqh.MY_TEAM;
            tphVar.m50310w(str, wqhVar);
            vqh vqhVarC0 = vqh.c0(wqhVar);
            sq8.m48648g(vqhVarC0, "of(...)");
            vqhVarC0.h0(this.f47573e);
            Team teamJustId = Team.justId(this.f47574f);
            sq8.m48648g(teamJustId, "justId(...)");
            List list = this.f47575g;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Team.justId((String) it.next()));
            }
            vqhVarC0.i0(teamJustId);
            vqhVarC0.g0(arrayList);
            Object objM55727f = mrg.A0(this.f47576h).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            List<ryh> list2 = (List) objM55727f;
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(list2, 10));
            for (ryh ryhVar : list2) {
                TaskCategoryList taskCategoryList = new TaskCategoryList(null, false, null, 7, null);
                Object obj2 = ryhVar.f44265a;
                sq8.m48648g(obj2, "_1");
                taskCategoryList.setKey((String) obj2);
                taskCategoryList.setDisplayWithCount(String.valueOf(ryhVar.f44266b));
                taskCategoryList.setSelected(false);
                arrayList2.add(taskCategoryList);
            }
            yne yneVarM58030d = yne.f55736e.m58030d(kh3.Q0(arrayList2));
            this.f47570b = ogaVar;
            this.f47569a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.tph$g */
    public static final class C17180g extends jgg implements nl7 {

        /* renamed from: a */
        public int f47577a;

        /* renamed from: b */
        public /* synthetic */ Object f47578b;

        /* renamed from: d */
        public final /* synthetic */ String f47580d;

        /* renamed from: e */
        public final /* synthetic */ String f47581e;

        /* renamed from: f */
        public final /* synthetic */ String f47582f;

        /* renamed from: g */
        public final /* synthetic */ List f47583g;

        /* renamed from: o.tph$g$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f47584a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("Team Tasks", paginatedTokenResults);
            }
        }

        /* renamed from: o.tph$g$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f47585a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("Team Tasks", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17180g(String str, String str2, String str3, List list, n64 n64Var) {
            super(2, n64Var);
            this.f47580d = str;
            this.f47581e = str2;
            this.f47582f = str3;
            this.f47583g = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17180g c17180g = tph.this.new C17180g(this.f47580d, this.f47581e, this.f47582f, this.f47583g, n64Var);
            c17180g.f47578b = obj;
            return c17180g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17180g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            PaginatedDataModel paginatedDataModel;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f47577a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f47578b = null;
                this.f47577a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f47578b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f47578b = ogaVar2;
                this.f47577a = 1;
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
                ogaVar = (oga) this.f47578b;
                wre.m54934b(obj);
            }
            tph tphVar = tph.this;
            String str = this.f47580d;
            wqh wqhVar = wqh.MY_TEAM;
            tphVar.m50310w(str, wqhVar);
            vqh vqhVarC0 = vqh.c0(wqhVar);
            sq8.m48648g(vqhVarC0, "of(...)");
            vqhVarC0.h0(this.f47581e);
            if (vqhVarC0.m53287G()) {
                Object objM47698c = jyg.c3(this.f47582f, this.f47583g, 10).m47686M(b.f47585a).m47698c();
                sq8.m48646e(objM47698c);
                paginatedDataModel = (PaginatedDataModel) objM47698c;
            } else {
                Team teamJustId = Team.justId(this.f47582f);
                sq8.m48648g(teamJustId, "justId(...)");
                List list = this.f47583g;
                ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Team.justId((String) it.next()));
                }
                vqhVarC0.i0(teamJustId);
                vqhVarC0.g0(arrayList);
                Object objM47698c2 = mrg.j2(10).m47686M(a.f47584a).m47698c();
                sq8.m48646e(objM47698c2);
                paginatedDataModel = (PaginatedDataModel) objM47698c2;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(paginatedDataModel);
            this.f47578b = ogaVar;
            this.f47577a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.tph$h */
    public static final class C17181h extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17181h f47586a = new C17181h();

        public C17181h() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TodoFilter invoke(eoh eohVar) {
            return eohVar.m25401o();
        }
    }

    /* renamed from: o.tph$i */
    public static final class C17182i extends jgg implements nl7 {

        /* renamed from: a */
        public int f47587a;

        /* renamed from: b */
        public /* synthetic */ Object f47588b;

        /* renamed from: c */
        public final /* synthetic */ String f47589c;

        /* renamed from: d */
        public final /* synthetic */ Tasks f47590d;

        /* renamed from: e */
        public final /* synthetic */ String f47591e;

        /* renamed from: o.tph$i$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ String f47592a;

            /* renamed from: b */
            public final /* synthetic */ Tasks f47593b;

            /* renamed from: c */
            public final /* synthetic */ String f47594c;

            public a(String str, Tasks tasks, String str2) {
                this.f47592a = str;
                this.f47593b = tasks;
                this.f47594c = str2;
            }

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x8c apply(uni uniVar) {
                sq8.m48649h(uniVar, "it");
                return uniVar.TB().e0(this.f47592a, th1.m49863o(this.f47593b, null, 1, null).getEngagement(), this.f47594c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17182i(String str, Tasks tasks, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f47589c = str;
            this.f47590d = tasks;
            this.f47591e = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17182i c17182i = new C17182i(this.f47589c, this.f47590d, this.f47591e, n64Var);
            c17182i.f47588b = obj;
            return c17182i;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17182i) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f47587a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f47588b = null;
                this.f47587a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f47588b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f47588b = ogaVar2;
                this.f47587a = 1;
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
                    oga ogaVar3 = (oga) this.f47588b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f47588b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = uni.LB().m55717M(new a(this.f47589c, this.f47590d, this.f47591e)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((String) objM55727f);
            this.f47588b = ogaVar;
            this.f47587a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tph(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: p */
    public static final TodoFilter m50295p(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (TodoFilter) xk7Var.invoke(obj);
    }

    /* renamed from: v */
    public static /* synthetic */ void m50296v(tph tphVar, TodoFilter todoFilter, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tphVar.m50309u(todoFilter, str);
    }

    /* renamed from: h */
    public final AbstractC2145n m50297h(String str, String str2, List list) {
        sq8.m48649h(str, "searchText");
        sq8.m48649h(str2, "selectedFilterType");
        return e84.m24521b(eu5.m25611b(), 0L, new C17174a(str2, str, list, null), 2, null);
    }

    /* renamed from: i */
    public final AbstractC2145n m50298i(String str, String str2) {
        sq8.m48649h(str, "searchText");
        sq8.m48649h(str2, "selectedFilterType");
        return e84.m24521b(eu5.m25611b(), 0L, new C17175b(str2, str, null), 2, null);
    }

    /* renamed from: j */
    public final AbstractC2145n m50299j(String str, String str2, String str3) {
        sq8.m48649h(str, "leadId");
        sq8.m48649h(str2, "searchText");
        sq8.m48649h(str3, "status");
        return e84.m24521b(eu5.m25611b(), 0L, new C17176c(str, str2, str3, null), 2, null);
    }

    /* renamed from: k */
    public final AbstractC2145n m50300k(String str, String str2, List list) {
        sq8.m48649h(str, "searchText");
        sq8.m48649h(str2, "selectedFilterType");
        return e84.m24521b(eu5.m25611b(), 0L, new C17177d(str2, str, list, null), 2, null);
    }

    /* renamed from: l */
    public final AbstractC2145n m50301l(String str, String str2) {
        sq8.m48649h(str, "searchText");
        sq8.m48649h(str2, "selectedFilterType");
        return e84.m24521b(eu5.m25611b(), 0L, new C17178e(str2, str, null), 2, null);
    }

    /* renamed from: m */
    public final AbstractC2145n m50302m(String str, List list, String str2, String str3, List list2) {
        sq8.m48649h(str, "teamID");
        sq8.m48649h(list, "teamIds");
        sq8.m48649h(str2, "searchText");
        sq8.m48649h(str3, "selectedFilterType");
        return e84.m24521b(eu5.m25611b(), 0L, new C17179f(str3, str2, str, list, list2, null), 2, null);
    }

    /* renamed from: n */
    public final AbstractC2145n m50303n(String str, List list, String str2, String str3) {
        sq8.m48649h(str, "teamID");
        sq8.m48649h(list, "teamIds");
        sq8.m48649h(str2, "searchText");
        sq8.m48649h(str3, "selectedFilterType");
        return e84.m24521b(eu5.m25611b(), 0L, new C17180g(str3, str2, str, list, null), 2, null);
    }

    /* renamed from: o */
    public final Optional m50304o() {
        Optional optionalM53282B = m50306r().m53282B();
        final C17181h c17181h = C17181h.f47586a;
        Optional map = optionalM53282B.map(new Function() { // from class: o.sph
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return tph.m50295p(c17181h, obj);
            }
        });
        sq8.m48648g(map, "map(...)");
        return map;
    }

    /* renamed from: q */
    public final List m50305q() {
        return new ArrayList(eoh.m25397l());
    }

    /* renamed from: r */
    public final vqh m50306r() {
        vqh vqhVarC0 = vqh.c0(wqh.ME);
        sq8.m48648g(vqhVarC0, "of(...)");
        return vqhVarC0;
    }

    /* renamed from: s */
    public final mii m50307s() {
        return wi0.m54444J();
    }

    /* renamed from: t */
    public final AbstractC2145n m50308t(String str, Tasks tasks, String str2) {
        sq8.m48649h(str, "purpose");
        sq8.m48649h(tasks, "task");
        sq8.m48649h(str2, "action");
        return e84.m24521b(eu5.m25611b(), 0L, new C17182i(str, tasks, str2, null), 2, null);
    }

    /* renamed from: u */
    public final void m50309u(TodoFilter todoFilter, String str) {
        sq8.m48649h(todoFilter, "todoFilter");
        Object objOrElse = m50306r().m53282B().orElse(new eoh());
        sq8.m48648g(objOrElse, "orElse(...)");
        eoh eohVar = (eoh) objOrElse;
        eohVar.m25404s(todoFilter);
        if (str != null) {
            vqh.b0(str).f0(eohVar);
            return;
        }
        vqh.c0(wqh.ME).f0(eohVar);
        vqh.c0(wqh.MY_TEAM).f0(eohVar);
        vqh.c0(wqh.ALL).f0(eohVar);
    }

    /* renamed from: w */
    public final void m50310w(String str, wqh wqhVar) {
        if (wqhVar != null) {
            Object objOrElse = vqh.c0(wqhVar).m53282B().orElse(new eoh());
            sq8.m48648g(objOrElse, "orElse(...)");
            eoh eohVar = (eoh) objOrElse;
            eohVar.m25403r(str);
            vqh.c0(wqhVar).f0(eohVar);
            return;
        }
        wqh wqhVar2 = wqh.ME;
        Object objOrElse2 = vqh.c0(wqhVar2).m53282B().orElse(new eoh());
        sq8.m48648g(objOrElse2, "orElse(...)");
        eoh eohVar2 = (eoh) objOrElse2;
        eohVar2.m25403r(str);
        wqh wqhVar3 = wqh.MY_TEAM;
        Object objOrElse3 = vqh.c0(wqhVar3).m53282B().orElse(new eoh());
        sq8.m48648g(objOrElse3, "orElse(...)");
        eoh eohVar3 = (eoh) objOrElse3;
        eohVar3.m25403r(str);
        wqh wqhVar4 = wqh.ALL;
        Object objOrElse4 = vqh.c0(wqhVar4).m53282B().orElse(new eoh());
        sq8.m48648g(objOrElse4, "orElse(...)");
        eoh eohVar4 = (eoh) objOrElse4;
        eohVar4.m25403r(str);
        vqh.c0(wqhVar2).f0(eohVar2);
        vqh.c0(wqhVar3).f0(eohVar3);
        vqh.c0(wqhVar4).f0(eohVar4);
    }
}
