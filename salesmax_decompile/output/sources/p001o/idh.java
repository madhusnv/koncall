package p001o;

import ai.salesmax.model.FilterData;
import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.amplifyframework.datastore.generated.model.Team;
import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.datastore.generated.model.UserStatus;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.objectweb.asm.Opcodes;
import p001o.yne;
import type.ActivityType;
import type.TeamRole;

/* loaded from: classes2.dex */
public final class idh extends zf0 {

    /* renamed from: o.idh$a */
    public static final class C14260a extends jgg implements nl7 {

        /* renamed from: a */
        public int f28500a;

        /* renamed from: b */
        public /* synthetic */ Object f28501b;

        /* renamed from: d */
        public final /* synthetic */ String f28503d;

        /* renamed from: e */
        public final /* synthetic */ String f28504e;

        /* renamed from: f */
        public final /* synthetic */ List f28505f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14260a(String str, String str2, List list, n64 n64Var) {
            super(2, n64Var);
            this.f28503d = str;
            this.f28504e = str2;
            this.f28505f = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14260a c14260a = idh.this.new C14260a(this.f28503d, this.f28504e, this.f28505f, n64Var);
            c14260a.f28501b = obj;
            return c14260a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14260a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28500a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f28501b = null;
                this.f28500a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28501b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28501b = ogaVar2;
                this.f28500a = 1;
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
                    oga ogaVar3 = (oga) this.f28501b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f28501b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            l1 l1VarM31942g = idh.this.m31942g();
            Object objM55727f = l1VarM31942g.Dt(this.f28503d, TeamRole.valueOf(this.f28504e), l1VarM31942g.on(), this.f28505f).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f28501b = ogaVar;
            this.f28500a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$b */
    public static final class C14261b extends jgg implements nl7 {

        /* renamed from: a */
        public int f28506a;

        /* renamed from: b */
        public /* synthetic */ Object f28507b;

        /* renamed from: d */
        public final /* synthetic */ String f28509d;

        /* renamed from: e */
        public final /* synthetic */ Map f28510e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14261b(String str, Map map, n64 n64Var) {
            super(2, n64Var);
            this.f28509d = str;
            this.f28510e = map;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14261b c14261b = idh.this.new C14261b(this.f28509d, this.f28510e, n64Var);
            c14261b.f28507b = obj;
            return c14261b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14261b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f28506a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f28507b = null;
                this.f28506a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28507b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28507b = ogaVar2;
                this.f28506a = 1;
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
                ogaVar = (oga) this.f28507b;
                wre.m54934b(obj);
            }
            l1 l1VarM31942g = idh.this.m31942g();
            String str2 = this.f28509d;
            String strOn = l1VarM31942g.on();
            Map map = this.f28510e;
            LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map.size()));
            for (Object obj2 : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj2).getKey(), TeamRole.valueOf((String) ((Map.Entry) obj2).getValue()));
            }
            Object objM55727f = l1VarM31942g.Yo(str2, strOn, linkedHashMap).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f28507b = ogaVar;
            this.f28506a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$c */
    public static final class C14262c extends jgg implements nl7 {

        /* renamed from: a */
        public int f28511a;

        /* renamed from: b */
        public /* synthetic */ Object f28512b;

        /* renamed from: d */
        public final /* synthetic */ String f28514d;

        /* renamed from: e */
        public final /* synthetic */ String f28515e;

        /* renamed from: f */
        public final /* synthetic */ String f28516f;

        /* renamed from: g */
        public final /* synthetic */ boolean f28517g;

        /* renamed from: o.idh$c$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f28518a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LeadsTeam apply(Team team) {
                sq8.m48649h(team, "x");
                return new LeadsTeam(team);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14262c(String str, String str2, String str3, boolean z, n64 n64Var) {
            super(2, n64Var);
            this.f28514d = str;
            this.f28515e = str2;
            this.f28516f = str3;
            this.f28517g = z;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14262c c14262c = idh.this.new C14262c(this.f28514d, this.f28515e, this.f28516f, this.f28517g, n64Var);
            c14262c.f28512b = obj;
            return c14262c;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14262c) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28511a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f28512b = null;
                this.f28511a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28512b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28512b = ogaVar2;
                this.f28511a = 1;
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
                    oga ogaVar3 = (oga) this.f28512b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f28512b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = idh.this.m31942g().Hl(this.f28514d, this.f28515e, this.f28516f, this.f28517g).d0(a.f28518a).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((LeadsTeam) objM55727f);
            this.f28512b = ogaVar;
            this.f28511a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$d */
    public static final class C14263d extends jgg implements nl7 {

        /* renamed from: a */
        public int f28519a;

        /* renamed from: b */
        public /* synthetic */ Object f28520b;

        /* renamed from: d */
        public final /* synthetic */ String f28522d;

        /* renamed from: o.idh$d$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f28523a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LeadsTeam apply(Team team) {
                sq8.m48649h(team, "x");
                return new LeadsTeam(team);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14263d(String str, n64 n64Var) {
            super(2, n64Var);
            this.f28522d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14263d c14263d = idh.this.new C14263d(this.f28522d, n64Var);
            c14263d.f28520b = obj;
            return c14263d;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14263d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28519a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f28520b = null;
                this.f28519a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28520b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28520b = ogaVar2;
                this.f28519a = 1;
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
                    oga ogaVar3 = (oga) this.f28520b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f28520b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = idh.this.m31942g().Ag(this.f28522d).d0(a.f28523a).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((LeadsTeam) objM55727f);
            this.f28520b = ogaVar;
            this.f28519a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$e */
    public static final class C14264e extends jgg implements nl7 {

        /* renamed from: a */
        public int f28524a;

        /* renamed from: b */
        public /* synthetic */ Object f28525b;

        /* renamed from: c */
        public final /* synthetic */ String f28526c;

        /* renamed from: d */
        public final /* synthetic */ String f28527d;

        /* renamed from: e */
        public final /* synthetic */ List f28528e;

        /* renamed from: o.idh$e$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f28529a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("User Activities", paginatedTokenResults);
            }
        }

        /* renamed from: o.idh$e$b */
        public static final class b implements rl7 {

            /* renamed from: a */
            public static final b f28530a = new b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("Team Activities", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14264e(String str, String str2, List list, n64 n64Var) {
            super(2, n64Var);
            this.f28526c = str;
            this.f28527d = str2;
            this.f28528e = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14264e c14264e = new C14264e(this.f28526c, this.f28527d, this.f28528e, n64Var);
            c14264e.f28525b = obj;
            return c14264e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14264e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28524a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f28525b = null;
                this.f28524a = 4;
                Object objEmit = r1.emit(yneVarM58027b, this);
                r1 = r1;
                if (objEmit == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28525b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28525b = ogaVar2;
                this.f28524a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3) {
                        oga ogaVar3 = (oga) this.f28525b;
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
                oga ogaVar4 = (oga) this.f28525b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            ActivityType activityTypeM40812i = no.m40812i(this.f28526c);
            if (activityTypeM40812i == null) {
                Object objM47698c = tt.m50467z(this.f28527d, this.f28528e, 10).m47686M(a.f28529a).m47698c();
                sq8.m48648g(objM47698c, "blockingFirst(...)");
                yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
                this.f28525b = ogaVar;
                this.f28524a = 2;
                Object objEmit2 = ogaVar.emit(yneVarM58030d, this);
                r1 = ogaVar;
                if (objEmit2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                Object objM47698c2 = gt.m29466q(this.f28527d, this.f28528e, ch3.m21242g(activityTypeM40812i), 10).m47686M(b.f28530a).m47698c();
                sq8.m48648g(objM47698c2, "blockingFirst(...)");
                yne yneVarM58030d2 = yne.f55736e.m58030d((PaginatedDataModel) objM47698c2);
                this.f28525b = ogaVar;
                this.f28524a = 3;
                Object objEmit3 = ogaVar.emit(yneVarM58030d2, this);
                r1 = ogaVar;
                if (objEmit3 == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$f */
    public static final class C14265f extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14265f f28531a = new C14265f();

        public C14265f() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(yne yneVar) {
            List listM21246k;
            sq8.m48649h(yneVar, "it");
            List list = (List) yneVar.m58023a();
            if (list != null) {
                listM21246k = new ArrayList(dh3.m23088v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    listM21246k.add(((LeadTeamMember) it.next()).getTeamMember().getUserId());
                }
            } else {
                listM21246k = null;
            }
            if (listM21246k == null) {
                listM21246k = ch3.m21246k();
            }
            Collection collectionM37619T = lpi.m37619T();
            sq8.m48648g(collectionM37619T, "getAllUsers(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionM37619T) {
                LeadsUser leadsUser = (LeadsUser) obj;
                if (!listM21246k.contains(leadsUser.getId()) && sq8.m48644c(leadsUser.getUserAccountStatus(), UserStatus.ACTIVE.name())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: o.idh$g */
    public static final class C14266g extends jgg implements nl7 {

        /* renamed from: a */
        public int f28532a;

        /* renamed from: b */
        public /* synthetic */ Object f28533b;

        /* renamed from: c */
        public final /* synthetic */ String f28534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14266g(String str, n64 n64Var) {
            super(2, n64Var);
            this.f28534c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14266g c14266g = new C14266g(this.f28534c, n64Var);
            c14266g.f28533b = obj;
            return c14266g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14266g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28532a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f28533b = null;
                this.f28532a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28533b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28533b = ogaVar2;
                this.f28532a = 1;
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
                    oga ogaVar3 = (oga) this.f28533b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f28533b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = o4h.m41546J(this.f28534c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f28533b = ogaVar;
            this.f28532a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$h */
    public static final class C14267h extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14267h f28535a = new C14267h();

        public C14267h() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(yne yneVar) {
            ArrayList arrayList;
            sq8.m48649h(yneVar, "it");
            List list = (List) yneVar.m58023a();
            if (list != null) {
                arrayList = new ArrayList(dh3.m23088v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((LeadTeamMember) it.next()).toLeadsUser());
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? ch3.m21246k() : arrayList;
        }
    }

    /* renamed from: o.idh$i */
    public static final class C14268i extends jgg implements nl7 {

        /* renamed from: a */
        public int f28536a;

        /* renamed from: b */
        public /* synthetic */ Object f28537b;

        /* renamed from: c */
        public final /* synthetic */ String f28538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14268i(String str, n64 n64Var) {
            super(2, n64Var);
            this.f28538c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14268i c14268i = new C14268i(this.f28538c, n64Var);
            c14268i.f28537b = obj;
            return c14268i;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14268i) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28536a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f28537b = null;
                this.f28536a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28537b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28537b = ogaVar2;
                this.f28536a = 1;
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
                    oga ogaVar3 = (oga) this.f28537b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f28537b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = o4h.m41549M(this.f28538c).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM47698c);
            this.f28537b = ogaVar;
            this.f28536a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$j */
    public static final class C14269j extends jgg implements nl7 {

        /* renamed from: a */
        public int f28539a;

        /* renamed from: b */
        public /* synthetic */ Object f28540b;

        /* renamed from: c */
        public final /* synthetic */ String f28541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14269j(String str, n64 n64Var) {
            super(2, n64Var);
            this.f28541c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14269j c14269j = new C14269j(this.f28541c, n64Var);
            c14269j.f28540b = obj;
            return c14269j;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14269j) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28539a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f28540b = null;
                this.f28539a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28540b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28540b = ogaVar2;
                this.f28539a = 1;
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
                    oga ogaVar3 = (oga) this.f28540b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f28540b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = o4h.m41547K(this.f28541c).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM47698c);
            this.f28540b = ogaVar;
            this.f28539a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$k */
    public static final class C14270k extends jgg implements nl7 {

        /* renamed from: a */
        public int f28542a;

        /* renamed from: b */
        public /* synthetic */ Object f28543b;

        /* renamed from: d */
        public final /* synthetic */ String f28545d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14270k(String str, n64 n64Var) {
            super(2, n64Var);
            this.f28545d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14270k c14270k = idh.this.new C14270k(this.f28545d, n64Var);
            c14270k.f28543b = obj;
            return c14270k;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14270k) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28542a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f28543b = null;
                this.f28542a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28543b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28543b = ogaVar2;
                this.f28542a = 1;
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
                    oga ogaVar3 = (oga) this.f28543b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f28543b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = idh.this.m31942g().H6(this.f28545d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((TeamMember) objM55727f);
            this.f28543b = ogaVar;
            this.f28542a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$l */
    public static final class C14271l extends jgg implements nl7 {

        /* renamed from: a */
        public int f28546a;

        /* renamed from: b */
        public /* synthetic */ Object f28547b;

        /* renamed from: d */
        public final /* synthetic */ String f28549d;

        /* renamed from: e */
        public final /* synthetic */ List f28550e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14271l(String str, List list, n64 n64Var) {
            super(2, n64Var);
            this.f28549d = str;
            this.f28550e = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14271l c14271l = idh.this.new C14271l(this.f28549d, this.f28550e, n64Var);
            c14271l.f28547b = obj;
            return c14271l;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14271l) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f28546a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f28547b = null;
                this.f28546a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28547b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28547b = ogaVar2;
                this.f28546a = 1;
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
                    oga ogaVar3 = (oga) this.f28547b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f28547b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            l1 l1VarM31942g = idh.this.m31942g();
            Object objM55728g = l1VarM31942g.yc(this.f28549d, this.f28550e, l1VarM31942g.on()).m55728g();
            sq8.m48648g(objM55728g, "blockingLast(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((TeamMember) objM55728g);
            this.f28547b = ogaVar;
            this.f28546a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.idh$m */
    public static final class C14272m extends jgg implements nl7 {

        /* renamed from: a */
        public int f28551a;

        /* renamed from: b */
        public /* synthetic */ Object f28552b;

        /* renamed from: d */
        public final /* synthetic */ Map f28554d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14272m(Map map, n64 n64Var) {
            super(2, n64Var);
            this.f28554d = map;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14272m c14272m = idh.this.new C14272m(this.f28554d, n64Var);
            c14272m.f28552b = obj;
            return c14272m;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14272m) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f28551a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f28552b = null;
                this.f28551a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f28552b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f28552b = ogaVar2;
                this.f28551a = 1;
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
                ogaVar = (oga) this.f28552b;
                wre.m54934b(obj);
            }
            l1 l1VarM31942g = idh.this.m31942g();
            Map map = this.f28554d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map.size()));
            for (Object obj2 : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj2).getKey(), TeamRole.valueOf((String) ((Map.Entry) obj2).getValue()));
            }
            Object objM55727f = l1VarM31942g.m48216n(linkedHashMap).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f28552b = ogaVar;
            this.f28551a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idh(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: g */
    public final l1 m31942g() {
        l1 l1VarTB = uni.kC().TB();
        sq8.m48648g(l1VarTB, "getActiveService(...)");
        return l1VarTB;
    }

    /* renamed from: h */
    public final AbstractC2145n m31943h(List list, String str, String str2) {
        sq8.m48649h(list, "userIds");
        sq8.m48649h(str, "teamId");
        sq8.m48649h(str2, "teamRole");
        return e84.m24521b(eu5.m25611b(), 0L, new C14260a(str, str2, list, null), 2, null);
    }

    /* renamed from: i */
    public final AbstractC2145n m31944i(Map map, String str) {
        sq8.m48649h(map, "userIdAndRoles");
        sq8.m48649h(str, "teamId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14261b(str, map, null), 2, null);
    }

    /* renamed from: j */
    public final AbstractC2145n m31945j(String str, String str2, boolean z, String str3) {
        sq8.m48649h(str, "teamName");
        sq8.m48649h(str2, "leadUserId");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        return e84.m24521b(eu5.m25611b(), 0L, new C14262c(str, str2, str3, z, null), 2, null);
    }

    /* renamed from: k */
    public final AbstractC2145n m31946k(String str) {
        sq8.m48649h(str, "teamId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14263d(str, null), 2, null);
    }

    /* renamed from: l */
    public final AbstractC2145n m31947l(String str, List list, String str2) {
        sq8.m48649h(str, "teamId");
        sq8.m48649h(list, "teamIds");
        return e84.m24521b(eu5.m25611b(), 0L, new C14264e(str2, str, list, null), 2, null);
    }

    /* renamed from: m */
    public final ArrayList m31948m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FilterData(false, "leadFilterLeadType", "All Activities", false, null, null, null, Opcodes.LSHL, null));
        Iterator it = m31949n().iterator();
        while (it.hasNext()) {
            arrayList.add(new FilterData(false, "leadFilterLeadType", (String) it.next(), false, null, null, null, Opcodes.LSHL, null));
        }
        return arrayList;
    }

    /* renamed from: n */
    public final List m31949n() {
        return new ArrayList(no.m40815l());
    }

    /* renamed from: o */
    public final AbstractC2145n m31950o(String str) {
        sq8.m48649h(str, "teamId");
        return avh.m17882a(m31956u(str), C14265f.f28531a);
    }

    /* renamed from: p */
    public final AbstractC2145n m31951p(String str) {
        sq8.m48649h(str, "userId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14266g(str, null), 2, null);
    }

    /* renamed from: q */
    public final Optional m31952q(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return lpi.m37625Z(str);
    }

    /* renamed from: r */
    public final AbstractC2145n m31953r(String str) {
        sq8.m48649h(str, "teamId");
        return avh.m17882a(m31956u(str), C14267h.f28535a);
    }

    /* renamed from: s */
    public final mii m31954s() {
        return wi0.m54444J();
    }

    /* renamed from: t */
    public final AbstractC2145n m31955t(String str) {
        sq8.m48649h(str, "userId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14268i(str, null), 2, null);
    }

    /* renamed from: u */
    public final AbstractC2145n m31956u(String str) {
        sq8.m48649h(str, "teamId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14269j(str, null), 2, null);
    }

    /* renamed from: v */
    public final AbstractC2145n m31957v(String str) {
        sq8.m48649h(str, "teamMembershipId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14270k(str, null), 2, null);
    }

    /* renamed from: w */
    public final AbstractC2145n m31958w(List list, String str) {
        sq8.m48649h(list, "userIds");
        sq8.m48649h(str, "teamId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14271l(str, list, null), 2, null);
    }

    /* renamed from: x */
    public final AbstractC2145n m31959x(Map map) {
        sq8.m48649h(map, "memberIdAndRoles");
        return e84.m24521b(eu5.m25611b(), 0L, new C14272m(map, null), 2, null);
    }
}
