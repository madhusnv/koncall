package p001o;

import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.AccountMemberInvitation;
import ai.salesmax.model.CallOutcome;
import ai.salesmax.model.ChatLabel;
import ai.salesmax.model.DealStageDefinition;
import ai.salesmax.model.FormDefinition;
import ai.salesmax.model.IntegrationList;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.PropertyOptions;
import ai.salesmax.model.Recordingapp;
import ai.salesmax.model.TaskTypeDefinition;
import ai.salesmax.model.UserContactDetail;
import ai.salesmax.model.UserManagementActionType;
import ai.salesmax.model.VisitOutcome;
import ai.salesmax.services.model.IntegratedNetworkConnection;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.Team;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.jkf;
import p001o.yne;
import type.AuthorizationLevel;

/* loaded from: classes.dex */
public final class jkf extends zf0 {

    /* renamed from: o.jkf$a */
    public static final class C14555a extends jgg implements nl7 {

        /* renamed from: a */
        public int f30550a;

        /* renamed from: b */
        public /* synthetic */ Object f30551b;

        /* renamed from: c */
        public final /* synthetic */ String f30552c;

        /* renamed from: d */
        public final /* synthetic */ String f30553d;

        /* renamed from: e */
        public final /* synthetic */ boolean f30554e;

        /* renamed from: f */
        public final /* synthetic */ boolean f30555f;

        /* renamed from: g */
        public final /* synthetic */ String f30556g;

        /* renamed from: h */
        public final /* synthetic */ String f30557h;

        /* renamed from: q */
        public final /* synthetic */ boolean f30558q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14555a(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3, n64 n64Var) {
            super(2, n64Var);
            this.f30552c = str;
            this.f30553d = str2;
            this.f30554e = z;
            this.f30555f = z2;
            this.f30556g = str3;
            this.f30557h = str4;
            this.f30558q = z3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14555a c14555a = new C14555a(this.f30552c, this.f30553d, this.f30554e, this.f30555f, this.f30556g, this.f30557h, this.f30558q, n64Var);
            c14555a.f30551b = obj;
            return c14555a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14555a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o.oga] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f30550a;
            try {
            } catch (Exception e) {
                r1.getClass();
                e.getMessage();
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f30551b = null;
                this.f30550a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30551b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30551b = ogaVar2;
                this.f30550a = 1;
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
                    oga ogaVar3 = (oga) this.f30551b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30551b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = im.m32271c(this.f30552c, this.f30553d, this.f30554e, this.f30555f, this.f30556g, this.f30557h, this.f30558q).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Account) objM55727f);
            this.f30551b = ogaVar;
            this.f30550a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class a0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f30559a;

        /* renamed from: b */
        public /* synthetic */ Object f30560b;

        /* renamed from: c */
        public final /* synthetic */ String f30561c;

        /* renamed from: d */
        public final /* synthetic */ String f30562d;

        /* renamed from: e */
        public final /* synthetic */ String f30563e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, String str2, String str3, n64 n64Var) {
            super(2, n64Var);
            this.f30561c = str;
            this.f30562d = str2;
            this.f30563e = str3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            a0 a0Var = new a0(this.f30561c, this.f30562d, this.f30563e, n64Var);
            a0Var.f30560b = obj;
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
            ?? r1 = this.f30559a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f30560b = null;
                this.f30559a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30560b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30560b = ogaVar2;
                this.f30559a = 1;
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
                    oga ogaVar3 = (oga) this.f30560b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30560b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Boolean boolQ0 = lpi.Q0(this.f30561c, this.f30562d, this.f30563e);
            sq8.m48648g(boolQ0, "updateRoleDesignation(...)");
            boolean zBooleanValue = boolQ0.booleanValue();
            yne.C18447a c18447a2 = yne.f55736e;
            if (!zBooleanValue) {
                z = false;
            }
            yne yneVarM58030d = c18447a2.m58030d(ml1.m39301a(z));
            this.f30560b = ogaVar;
            this.f30559a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$b */
    public static final class C14556b extends jgg implements nl7 {

        /* renamed from: a */
        public int f30564a;

        /* renamed from: b */
        public /* synthetic */ Object f30565b;

        /* renamed from: d */
        public final /* synthetic */ String f30567d;

        /* renamed from: e */
        public final /* synthetic */ String f30568e;

        /* renamed from: f */
        public final /* synthetic */ String f30569f;

        /* renamed from: g */
        public final /* synthetic */ boolean f30570g;

        /* renamed from: o.jkf$b$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f30571a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LeadsTeam apply(Team team) {
                sq8.m48649h(team, "x");
                return new LeadsTeam(team);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14556b(String str, String str2, String str3, boolean z, n64 n64Var) {
            super(2, n64Var);
            this.f30567d = str;
            this.f30568e = str2;
            this.f30569f = str3;
            this.f30570g = z;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14556b c14556b = jkf.this.new C14556b(this.f30567d, this.f30568e, this.f30569f, this.f30570g, n64Var);
            c14556b.f30565b = obj;
            return c14556b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14556b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30564a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f30565b = null;
                this.f30564a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30565b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30565b = ogaVar2;
                this.f30564a = 1;
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
                    oga ogaVar3 = (oga) this.f30565b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30565b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = jkf.this.m33935l().Hl(this.f30567d, this.f30568e, this.f30569f, this.f30570g).d0(a.f30571a).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((LeadsTeam) objM55727f);
            this.f30565b = ogaVar;
            this.f30564a = 2;
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
        public int f30572a;

        /* renamed from: b */
        public /* synthetic */ Object f30573b;

        /* renamed from: d */
        public final /* synthetic */ String f30575d;

        /* renamed from: e */
        public final /* synthetic */ String f30576e;

        /* renamed from: f */
        public final /* synthetic */ String f30577f;

        /* renamed from: o.jkf$b0$a */
        public static final class C14557a implements rl7 {

            /* renamed from: a */
            public static final C14557a f30578a = new C14557a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LeadsTeam apply(Team team) {
                sq8.m48649h(team, "x");
                return new LeadsTeam(team);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str, String str2, String str3, n64 n64Var) {
            super(2, n64Var);
            this.f30575d = str;
            this.f30576e = str2;
            this.f30577f = str3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            b0 b0Var = jkf.this.new b0(this.f30575d, this.f30576e, this.f30577f, n64Var);
            b0Var.f30573b = obj;
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
            ?? r1 = this.f30572a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f30573b = null;
                this.f30572a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30573b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30573b = ogaVar2;
                this.f30572a = 1;
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
                    oga ogaVar3 = (oga) this.f30573b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30573b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = jkf.this.m33935l().l2(this.f30575d, this.f30576e, this.f30577f).d0(C14557a.f30578a).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((LeadsTeam) objM55727f);
            this.f30573b = ogaVar;
            this.f30572a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$c */
    public static final class C14558c extends jgg implements nl7 {

        /* renamed from: a */
        public int f30579a;

        /* renamed from: b */
        public /* synthetic */ Object f30580b;

        /* renamed from: d */
        public final /* synthetic */ String f30582d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14558c(String str, n64 n64Var) {
            super(2, n64Var);
            this.f30582d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14558c c14558c = jkf.this.new C14558c(this.f30582d, n64Var);
            c14558c.f30580b = obj;
            return c14558c;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14558c) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o.oga] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f30579a;
            try {
            } catch (Exception e) {
                r1.getClass();
                yne yneVarM58028a = yne.f55736e.m58028a(null, "couldn't resolve input query", e);
                this.f30580b = null;
                this.f30579a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30580b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30580b = ogaVar2;
                this.f30579a = 1;
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
                    oga ogaVar3 = (oga) this.f30580b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30580b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = jkf.this.m33935l().sw(this.f30582d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((ryh) objM55727f);
            this.f30580b = ogaVar;
            this.f30579a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$d */
    public static final class C14559d extends jgg implements nl7 {

        /* renamed from: a */
        public int f30583a;

        /* renamed from: b */
        public /* synthetic */ Object f30584b;

        /* renamed from: d */
        public final /* synthetic */ String f30586d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14559d(String str, n64 n64Var) {
            super(2, n64Var);
            this.f30586d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14559d c14559d = jkf.this.new C14559d(this.f30586d, n64Var);
            c14559d.f30584b = obj;
            return c14559d;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14559d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30583a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "couldn't invoke lead source integration", e);
                this.f30584b = null;
                this.f30583a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30584b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30584b = ogaVar2;
                this.f30583a = 1;
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
                    oga ogaVar3 = (oga) this.f30584b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30584b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = jkf.this.m33935l().Ni(this.f30586d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((IntegratedNetworkConnection) objM55727f);
            this.f30584b = ogaVar;
            this.f30583a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$e */
    public static final class C14560e extends jgg implements nl7 {

        /* renamed from: a */
        public int f30587a;

        /* renamed from: b */
        public /* synthetic */ Object f30588b;

        /* renamed from: d */
        public final /* synthetic */ String f30590d;

        /* renamed from: o.jkf$e$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f30591a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            public final String invoke(LeadsUser leadsUser) {
                return leadsUser.getRegisteredNumber();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14560e(String str, n64 n64Var) {
            super(2, n64Var);
            this.f30590d = str;
        }

        /* renamed from: h */
        public static final String m33959h(xk7 xk7Var, Object obj) {
            return (String) xk7Var.invoke(obj);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14560e c14560e = jkf.this.new C14560e(this.f30590d, n64Var);
            c14560e.f30588b = obj;
            return c14560e;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14560e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(1:(3:(1:(1:7)(2:8|9))(3:10|90|11)|88|89)(1:15))(2:16|(1:18))|19|92|20|(4:22|(1:24)(1:25)|(1:31)(1:30)|(1:33)(1:34))|35|(7:38|(4:41|(2:43|98)(1:99)|44|39)|97|45|(2:47|95)(1:96)|48|36)|94|49|(3:51|(5:54|(3:56|(2:57|(2:59|(2:106|61)(1:107))(2:105|62))|(3:64|(2:65|(2:67|(2:109|69)(1:110))(2:108|70))|(2:72|74)(1:73))(1:74))(0)|(3:100|76|104)(1:103)|102|52)|101)|77|(1:79)|88|89|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x018b, code lost:
        
            r4 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01aa A[RETURN] */
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
            int i = this.f30587a;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f30588b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30588b = ogaVar;
                this.f30587a = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        oga ogaVar2 = (oga) this.f30588b;
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
                            this.f30588b = null;
                            this.f30587a = 3;
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
                ogaVar = (oga) this.f30588b;
                wre.m54934b(obj);
            }
            oga ogaVar3 = ogaVar;
            ArrayList arrayList = new ArrayList();
            if (arrayList.isEmpty()) {
                arrayList = !j4d.m33224l(jkf.this.m59366f()) ? new ArrayList() : jm7.m34022H(jkf.this.m59366f());
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
            }
            gge ggeVar = new gge();
            Stream stream = lpi.m37619T().stream();
            final a aVar = a.f30591a;
            ggeVar.f25106a = stream.map(new Function() { // from class: o.kkf
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return jkf.C14560e.m33959h(aVar, obj2);
                }
            }).collect(Collectors.toSet());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                ArrayList<String> phoneNumber = ((UserContactDetail) obj2).getPhoneNumber();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : phoneNumber) {
                    if (((Set) ggeVar.f25106a).contains((String) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList2.add(obj2);
                }
            }
            if (!f9g.d0(this.f30590d)) {
                String str = this.f30590d;
                arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    UserContactDetail userContactDetail = (UserContactDetail) obj4;
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
                        arrayList2.add(obj4);
                    }
                }
            }
            PaginatedTokenResults paginatedTokenResultsFromList = PaginatedTokenResults.fromList(arrayList2, 10);
            paginatedTokenResultsFromList.loadInitial();
            yne yneVarM58030d = yne.f55736e.m58030d(new PaginatedDataModel("My Phone Contacts", paginatedTokenResultsFromList));
            this.f30588b = ogaVar3;
            this.f30587a = 2;
            if (ogaVar3.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$f */
    public static final class C14561f extends jgg implements nl7 {

        /* renamed from: a */
        public int f30592a;

        /* renamed from: b */
        public /* synthetic */ Object f30593b;

        public C14561f(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14561f c14561f = new C14561f(n64Var);
            c14561f.f30593b = obj;
            return c14561f;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14561f) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30592a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't get working hours", e);
                this.f30593b = null;
                this.f30592a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30593b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30593b = ogaVar2;
                this.f30592a = 1;
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
                    oga ogaVar3 = (oga) this.f30593b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30593b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = nd.m40353n().m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f30593b = ogaVar;
            this.f30592a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$g */
    public static final class C14562g extends jgg implements nl7 {

        /* renamed from: a */
        public int f30594a;

        /* renamed from: b */
        public /* synthetic */ Object f30595b;

        /* renamed from: d */
        public final /* synthetic */ String f30597d;

        /* renamed from: e */
        public final /* synthetic */ String f30598e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14562g(String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f30597d = str;
            this.f30598e = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14562g c14562g = jkf.this.new C14562g(this.f30597d, this.f30598e, n64Var);
            c14562g.f30595b = obj;
            return c14562g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14562g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30594a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "couldn't invoke lead source integration", e);
                this.f30595b = null;
                this.f30594a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30595b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30595b = ogaVar2;
                this.f30594a = 1;
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
                    oga ogaVar3 = (oga) this.f30595b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30595b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = jkf.this.m33935l().oz(this.f30597d, this.f30598e).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Map) objM55727f);
            this.f30595b = ogaVar;
            this.f30594a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$h */
    public static final class C14563h extends jgg implements nl7 {

        /* renamed from: a */
        public int f30599a;

        /* renamed from: b */
        public /* synthetic */ Object f30600b;

        /* renamed from: d */
        public final /* synthetic */ AccountMemberInvitation f30602d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14563h(AccountMemberInvitation accountMemberInvitation, n64 n64Var) {
            super(2, n64Var);
            this.f30602d = accountMemberInvitation;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14563h c14563h = jkf.this.new C14563h(this.f30602d, n64Var);
            c14563h.f30600b = obj;
            return c14563h;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14563h) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f30599a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f30600b = null;
                this.f30599a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30600b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30600b = ogaVar2;
                this.f30599a = 1;
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
                ogaVar = (oga) this.f30600b;
                wre.m54934b(obj);
            }
            l1 l1VarM33935l = jkf.this.m33935l();
            LeadsUser leadsUser = new LeadsUser(null, null, null, null, 15, null);
            String name = this.f30602d.getName();
            String str2 = "";
            if (name == null) {
                name = "";
            }
            AccountMemberInvitation accountMemberInvitation = this.f30602d;
            if (StringUtils.isBlank(name)) {
                name = accountMemberInvitation.getPhoneNumber();
            }
            leadsUser.setName(name);
            leadsUser.setRegisteredNumber(this.f30602d.getPhoneNumber());
            String emailId = this.f30602d.getEmailId();
            if (emailId == null) {
                emailId = "";
            }
            leadsUser.setEmail(emailId);
            String profilePic = this.f30602d.getProfilePic();
            if (profilePic != null) {
                str2 = profilePic;
            }
            leadsUser.setProfilePic(str2);
            Object objM55727f = l1VarM33935l.m40608v(leadsUser, l1VarM33935l.on(), this.f30602d.getAuthorizationLevel(), AuthorizationLevel.valueOf(l1VarM33935l.oB().getAuthorizationLevel().name())).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((AccountMembership) objM55727f);
            this.f30600b = ogaVar;
            this.f30599a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$i */
    public static final class C14564i extends jgg implements nl7 {

        /* renamed from: a */
        public int f30603a;

        /* renamed from: b */
        public /* synthetic */ Object f30604b;

        /* renamed from: d */
        public final /* synthetic */ String f30606d;

        /* renamed from: e */
        public final /* synthetic */ String f30607e;

        /* renamed from: f */
        public final /* synthetic */ boolean f30608f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14564i(String str, String str2, boolean z, n64 n64Var) {
            super(2, n64Var);
            this.f30606d = str;
            this.f30607e = str2;
            this.f30608f = z;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14564i c14564i = jkf.this.new C14564i(this.f30606d, this.f30607e, this.f30608f, n64Var);
            c14564i.f30604b = obj;
            return c14564i;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14564i) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30603a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f30604b = null;
                this.f30603a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30604b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30604b = ogaVar2;
                this.f30603a = 1;
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
                    oga ogaVar3 = (oga) this.f30604b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30604b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            l1 l1VarM33935l = jkf.this.m33935l();
            Object objM55727f = l1VarM33935l.Up(l1VarM33935l.on(), this.f30606d, this.f30607e, l1VarM33935l.Eo(), ml1.m39301a(this.f30608f)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            boolean zBooleanValue = ((Boolean) objM55727f).booleanValue();
            yne.C18447a c18447a2 = yne.f55736e;
            if (!zBooleanValue) {
                z = false;
            }
            yne yneVarM58030d = c18447a2.m58030d(ml1.m39301a(z));
            this.f30604b = ogaVar;
            this.f30603a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$j */
    public static final class C14565j implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ uk7 f30609a;

        public C14565j(uk7 uk7Var) {
            this.f30609a = uk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            uniVar.RD();
            this.f30609a.invoke();
        }
    }

    /* renamed from: o.jkf$k */
    public static final class C14566k implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ uk7 f30611b;

        public C14566k(uk7 uk7Var) {
            this.f30611b = uk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            jkf.this.getClass();
            this.f30611b.invoke();
        }
    }

    /* renamed from: o.jkf$l */
    public static final class C14567l extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C14567l f30612a = new C14567l();

        public C14567l() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69019invoke() {
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69019invoke();
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$m */
    public static final class C14568m extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C14568m f30613a = new C14568m();

        public C14568m() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69020invoke() {
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69020invoke();
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$n */
    public static final class C14569n implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ uk7 f30614a;

        public C14569n(uk7 uk7Var) {
            this.f30614a = uk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            uniVar.eE();
            this.f30614a.invoke();
        }
    }

    /* renamed from: o.jkf$o */
    public static final class C14570o implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ uk7 f30616b;

        public C14570o(uk7 uk7Var) {
            this.f30616b = uk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            jkf.this.getClass();
            this.f30616b.invoke();
        }
    }

    /* renamed from: o.jkf$p */
    public static final class C14571p extends jgg implements nl7 {

        /* renamed from: a */
        public int f30617a;

        /* renamed from: b */
        public /* synthetic */ Object f30618b;

        /* renamed from: c */
        public final /* synthetic */ String f30619c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14571p(String str, n64 n64Var) {
            super(2, n64Var);
            this.f30619c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14571p c14571p = new C14571p(this.f30619c, n64Var);
            c14571p.f30618b = obj;
            return c14571p;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14571p) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30617a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save default currency", e);
                this.f30618b = null;
                this.f30617a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30618b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30618b = ogaVar2;
                this.f30617a = 1;
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
                    oga ogaVar3 = (oga) this.f30618b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30618b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = nd.m40335D(this.f30619c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Account) objM55727f);
            this.f30618b = ogaVar;
            this.f30617a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$q */
    public static final class C14572q extends jgg implements nl7 {

        /* renamed from: a */
        public int f30620a;

        /* renamed from: b */
        public /* synthetic */ Object f30621b;

        /* renamed from: c */
        public final /* synthetic */ String f30622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14572q(String str, n64 n64Var) {
            super(2, n64Var);
            this.f30622c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14572q c14572q = new C14572q(this.f30622c, n64Var);
            c14572q.f30621b = obj;
            return c14572q;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14572q) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30620a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save date format", e);
                this.f30621b = null;
                this.f30620a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30621b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30621b = ogaVar2;
                this.f30620a = 1;
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
                    oga ogaVar3 = (oga) this.f30621b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30621b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = nd.m40334C(this.f30622c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Account) objM55727f);
            this.f30621b = ogaVar;
            this.f30620a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$r */
    public static final class C14573r extends jgg implements nl7 {

        /* renamed from: a */
        public int f30623a;

        /* renamed from: b */
        public /* synthetic */ Object f30624b;

        /* renamed from: c */
        public final /* synthetic */ String f30625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14573r(String str, n64 n64Var) {
            super(2, n64Var);
            this.f30625c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14573r c14573r = new C14573r(this.f30625c, n64Var);
            c14573r.f30624b = obj;
            return c14573r;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14573r) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30623a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save denomination", e);
                this.f30624b = null;
                this.f30623a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30624b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30624b = ogaVar2;
                this.f30623a = 1;
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
                    oga ogaVar3 = (oga) this.f30624b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30624b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = nd.m40336E(this.f30625c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Account) objM55727f);
            this.f30624b = ogaVar;
            this.f30623a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$s */
    public static final class C14574s extends jgg implements nl7 {

        /* renamed from: a */
        public int f30626a;

        /* renamed from: b */
        public /* synthetic */ Object f30627b;

        /* renamed from: c */
        public final /* synthetic */ String f30628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14574s(String str, n64 n64Var) {
            super(2, n64Var);
            this.f30628c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14574s c14574s = new C14574s(this.f30628c, n64Var);
            c14574s.f30627b = obj;
            return c14574s;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14574s) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30626a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save time zone", e);
                this.f30627b = null;
                this.f30626a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30627b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30627b = ogaVar2;
                this.f30626a = 1;
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
                    oga ogaVar3 = (oga) this.f30627b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30627b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = nd.m40337F(this.f30628c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Account) objM55727f);
            this.f30627b = ogaVar;
            this.f30626a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$t */
    public static final class C14575t extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14575t f30629a = new C14575t();

        public C14575t() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyOptions invoke(CallOutcome callOutcome) {
            return PropertyDefinitionRepository.d0(callOutcome);
        }
    }

    /* renamed from: o.jkf$u */
    public static final class C14576u extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14576u f30630a = new C14576u();

        public C14576u() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyOptions invoke(ChatLabel chatLabel) {
            return PropertyDefinitionRepository.e0(chatLabel);
        }
    }

    /* renamed from: o.jkf$v */
    public static final class C14577v extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14577v f30631a = new C14577v();

        public C14577v() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyOptions invoke(DealStageDefinition dealStageDefinition) {
            return PropertyDefinitionRepository.f0(dealStageDefinition);
        }
    }

    /* renamed from: o.jkf$w */
    public static final class C14578w extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14578w f30632a = new C14578w();

        public C14578w() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyOptions invoke(TaskTypeDefinition taskTypeDefinition) {
            return PropertyDefinitionRepository.h0(taskTypeDefinition);
        }
    }

    /* renamed from: o.jkf$x */
    public static final class C14579x extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14579x f30633a = new C14579x();

        public C14579x() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyOptions invoke(VisitOutcome visitOutcome) {
            return PropertyDefinitionRepository.i0(visitOutcome);
        }
    }

    /* renamed from: o.jkf$y */
    public static final class C14580y extends jgg implements nl7 {

        /* renamed from: a */
        public int f30634a;

        /* renamed from: b */
        public /* synthetic */ Object f30635b;

        /* renamed from: c */
        public final /* synthetic */ List f30636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14580y(List list, n64 n64Var) {
            super(2, n64Var);
            this.f30636c = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14580y c14580y = new C14580y(this.f30636c, n64Var);
            c14580y.f30635b = obj;
            return c14580y;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14580y) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f30634a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save working hours", e);
                this.f30635b = null;
                this.f30634a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30635b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30635b = ogaVar2;
                this.f30634a = 1;
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
                    oga ogaVar3 = (oga) this.f30635b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f30635b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = nd.m40338G(this.f30636c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Account) objM55727f);
            this.f30635b = ogaVar;
            this.f30634a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jkf$z */
    public static final class C14581z extends jgg implements nl7 {

        /* renamed from: a */
        public int f30637a;

        /* renamed from: b */
        public /* synthetic */ Object f30638b;

        /* renamed from: d */
        public final /* synthetic */ Account f30640d;

        /* renamed from: o.jkf$z$a */
        public static final class a implements ggd {

            /* renamed from: a */
            public final /* synthetic */ l1 f30641a;

            public a(l1 l1Var) {
                this.f30641a = l1Var;
            }

            @Override // p001o.ggd
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Account account) {
                sq8.m48649h(account, "it");
                Boolean boolDC = this.f30641a.DC(account);
                sq8.m48648g(boolDC, "updateUnderlyingAccount(...)");
                return boolDC.booleanValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14581z(Account account, n64 n64Var) {
            super(2, n64Var);
            this.f30640d = account;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14581z c14581z = jkf.this.new C14581z(this.f30640d, n64Var);
            c14581z.f30638b = obj;
            return c14581z;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14581z) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00be -> B:38:0x00c1). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f30637a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f30638b = null;
                this.f30637a = 4;
                Object objEmit = r1.emit(yneVarM58028a, this);
                r1 = r1;
                if (objEmit == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f30638b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f30638b = ogaVar2;
                this.f30637a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3) {
                        oga ogaVar3 = (oga) this.f30638b;
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
                oga ogaVar4 = (oga) this.f30638b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            l1 l1VarM33935l = jkf.this.m33935l();
            if (StringUtils.isBlank(this.f30640d.getId())) {
                yne yneVarM58027b = yne.C18447a.m58027b(yne.f55736e, null, "You must provide account id for update", null, 4, null);
                this.f30638b = ogaVar;
                this.f30637a = 2;
                Object objEmit2 = ogaVar.emit(yneVarM58027b, this);
                r1 = ogaVar;
                if (objEmit2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                Object objM55727f = l1VarM33935l.Bb(this.f30640d).m55714J(new a(l1VarM33935l)).m55727f();
                sq8.m48648g(objM55727f, "blockingFirst(...)");
                yne yneVarM58030d = yne.f55736e.m58030d((Account) objM55727f);
                this.f30638b = ogaVar;
                this.f30637a = 3;
                Object objEmit3 = ogaVar.emit(yneVarM58030d, this);
                r1 = ogaVar;
                if (objEmit3 == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkf(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: D */
    public static /* synthetic */ void m33907D(jkf jkfVar, uk7 uk7Var, uk7 uk7Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            uk7Var = C14567l.f30612a;
        }
        if ((i & 2) != 0) {
            uk7Var2 = C14568m.f30613a;
        }
        jkfVar.m33920C(uk7Var, uk7Var2);
    }

    /* renamed from: K */
    public static final PropertyOptions m33908K(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (PropertyOptions) xk7Var.invoke(obj);
    }

    /* renamed from: M */
    public static final PropertyOptions m33909M(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (PropertyOptions) xk7Var.invoke(obj);
    }

    /* renamed from: O */
    public static final PropertyOptions m33910O(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (PropertyOptions) xk7Var.invoke(obj);
    }

    /* renamed from: Q */
    public static final PropertyOptions m33911Q(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (PropertyOptions) xk7Var.invoke(obj);
    }

    /* renamed from: S */
    public static final PropertyOptions m33912S(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (PropertyOptions) xk7Var.invoke(obj);
    }

    /* renamed from: A */
    public final AbstractC2145n m33918A(String str, String str2, boolean z) {
        sq8.m48649h(str, "userId");
        return e84.m24521b(eu5.m25611b(), 0L, new C14564i(str, str2, z, null), 2, null);
    }

    /* renamed from: B */
    public final void m33919B(uk7 uk7Var, uk7 uk7Var2) {
        sq8.m48649h(uk7Var, "onSuccessCallback");
        sq8.m48649h(uk7Var2, "onErrorCallback");
        uni.LB().v0(new C14565j(uk7Var), new C14566k(uk7Var2));
    }

    /* renamed from: C */
    public final void m33920C(uk7 uk7Var, uk7 uk7Var2) {
        sq8.m48649h(uk7Var, "onSuccessCallback");
        sq8.m48649h(uk7Var2, "onErrorCallback");
        uni.LB().v0(new C14569n(uk7Var), new C14570o(uk7Var2));
    }

    /* renamed from: E */
    public final String m33921E(Integer num) {
        int i = z8e.tvIndustryEducation;
        if (num != null && num.intValue() == i) {
            return "edtech";
        }
        int i2 = z8e.tvIndustryInstallation;
        if (num != null && num.intValue() == i2) {
            return "installations";
        }
        int i3 = z8e.tvIndustryLoan;
        if (num != null && num.intValue() == i3) {
            return "loan_dsa";
        }
        int i4 = z8e.tvIndustryLegal;
        if (num != null && num.intValue() == i4) {
            return "legal";
        }
        int i5 = z8e.tvIndustryRealEstate;
        if (num != null && num.intValue() == i5) {
            return "real_estate";
        }
        int i6 = z8e.tvIndustrySolar;
        if (num != null && num.intValue() == i6) {
            return "solar";
        }
        int i7 = z8e.tvIndustryTravel;
        if (num != null && num.intValue() == i7) {
            return "travel";
        }
        int i8 = z8e.tvIndustryGeneric;
        if (num != null) {
            num.intValue();
        }
        return "generic";
    }

    /* renamed from: F */
    public final AbstractC2145n m33922F(String str) {
        sq8.m48649h(str, FirebaseAnalytics.Param.CURRENCY);
        return e84.m24521b(eu5.m25611b(), 0L, new C14571p(str, null), 2, null);
    }

    /* renamed from: G */
    public final AbstractC2145n m33923G(String str) {
        sq8.m48649h(str, "dateFormat");
        return e84.m24521b(eu5.m25611b(), 0L, new C14572q(str, null), 2, null);
    }

    /* renamed from: H */
    public final AbstractC2145n m33924H(String str) {
        sq8.m48649h(str, "denomination");
        return e84.m24521b(eu5.m25611b(), 0L, new C14573r(str, null), 2, null);
    }

    /* renamed from: I */
    public final AbstractC2145n m33925I(String str) {
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
        return e84.m24521b(eu5.m25611b(), 0L, new C14574s(str, null), 2, null);
    }

    /* renamed from: J */
    public final PropertyDefinition m33926J(PropertyDefinition propertyDefinition, List list) {
        sq8.m48649h(propertyDefinition, "callOutcomePropertyDefinition");
        sq8.m48649h(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Stream stream = list.stream();
        final C14575t c14575t = C14575t.f30629a;
        List<PropertyOptions> list2 = (List) stream.map(new Function() { // from class: o.fkf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jkf.m33908K(c14575t, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48646e(list2);
        propertyDefinition.setPossibleValues(list2);
        return propertyDefinition;
    }

    /* renamed from: L */
    public final PropertyDefinition m33927L(PropertyDefinition propertyDefinition, List list) {
        sq8.m48649h(propertyDefinition, "chatLabelPropertyDefinition");
        sq8.m48649h(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Stream stream = list.stream();
        final C14576u c14576u = C14576u.f30630a;
        List<PropertyOptions> list2 = (List) stream.map(new Function() { // from class: o.gkf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jkf.m33909M(c14576u, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48646e(list2);
        propertyDefinition.setPossibleValues(list2);
        return propertyDefinition;
    }

    /* renamed from: N */
    public final PropertyDefinition m33928N(PropertyDefinition propertyDefinition, List list) {
        sq8.m48649h(propertyDefinition, "dealStagePropertyDefinition");
        sq8.m48649h(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Stream stream = list.stream();
        final C14577v c14577v = C14577v.f30631a;
        List<PropertyOptions> list2 = (List) stream.map(new Function() { // from class: o.ekf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jkf.m33910O(c14577v, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48646e(list2);
        propertyDefinition.setPossibleValues(list2);
        return propertyDefinition;
    }

    /* renamed from: P */
    public final PropertyDefinition m33929P(PropertyDefinition propertyDefinition, List list) {
        sq8.m48649h(propertyDefinition, "taskTypePropertyDefinition");
        sq8.m48649h(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Stream stream = list.stream();
        final C14578w c14578w = C14578w.f30632a;
        List<PropertyOptions> list2 = (List) stream.map(new Function() { // from class: o.hkf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jkf.m33911Q(c14578w, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48646e(list2);
        propertyDefinition.setPossibleValues(list2);
        return propertyDefinition;
    }

    /* renamed from: R */
    public final PropertyDefinition m33930R(PropertyDefinition propertyDefinition, List list) {
        sq8.m48649h(propertyDefinition, "visitOutcomePropertyDefinition");
        sq8.m48649h(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Stream stream = list.stream();
        final C14579x c14579x = C14579x.f30633a;
        List<PropertyOptions> list2 = (List) stream.map(new Function() { // from class: o.ikf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return jkf.m33912S(c14579x, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48646e(list2);
        propertyDefinition.setPossibleValues(list2);
        return propertyDefinition;
    }

    /* renamed from: T */
    public final AbstractC2145n m33931T(List list) {
        sq8.m48649h(list, "workingHours");
        return e84.m24521b(eu5.m25611b(), 0L, new C14580y(list, null), 2, null);
    }

    /* renamed from: U */
    public final AbstractC2145n m33932U(Account account) {
        sq8.m48649h(account, "account");
        return e84.m24521b(eu5.m25611b(), 0L, new C14581z(account, null), 2, null);
    }

    /* renamed from: V */
    public final AbstractC2145n m33933V(String str, String str2, String str3) {
        return e84.m24521b(eu5.m25611b(), 0L, new a0(str, str2, str3, null), 2, null);
    }

    /* renamed from: W */
    public final AbstractC2145n m33934W(String str, String str2, String str3) {
        sq8.m48649h(str, "teamId");
        sq8.m48649h(str2, "teamName");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        return e84.m24521b(eu5.m25611b(), 0L, new b0(str, str2, str3, null), 2, null);
    }

    /* renamed from: l */
    public final l1 m33935l() {
        l1 l1VarTB = uni.kC().TB();
        sq8.m48648g(l1VarTB, "getActiveService(...)");
        return l1VarTB;
    }

    /* renamed from: m */
    public final AbstractC2145n m33936m(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3) {
        sq8.m48649h(str, "accountName");
        sq8.m48649h(str2, "accountEmail");
        return e84.m24521b(eu5.m25611b(), 0L, new C14555a(str, str2, z, z2, str3, str4, z3, null), 2, null);
    }

    /* renamed from: n */
    public final AbstractC2145n m33937n(String str, String str2, boolean z, String str3) {
        sq8.m48649h(str, "teamName");
        sq8.m48649h(str2, "leadUserId");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        return e84.m24521b(eu5.m25611b(), 0L, new C14556b(str, str2, str3, z, null), 2, null);
    }

    /* renamed from: o */
    public final AbstractC2145n m33938o(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C14558c(str, null), 2, null);
    }

    /* renamed from: p */
    public final List m33939p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntegrationList("FACEBOOK", "Facebook", "Automatically Capture Leads from Facebook", "Source", "", "", "Connect", 0, new ArrayList()));
        arrayList.add(new IntegrationList("WHATSAPP_BUSINESS_LOGIN", "Whatsapp API", "Integrate Whatsapp Cloud Api", "Chat", "", "", "Connect", 0, new ArrayList()));
        arrayList.add(new IntegrationList("GOOGLELEADFORM", "Google Ads Lead Form", "Automatically Capture Leads from Google Ads Lead Forms", "Source", "", "", "Connect", 0, new ArrayList()));
        arrayList.add(new IntegrationList("INDIAMART", "Indiamart", "Automatically Capture Leads from Indiamart", "Source", "", "", "Connect", 0, new ArrayList()));
        arrayList.add(new IntegrationList("TRADEINDIA", "Trade India", "Automatically Capture Leads from Trade India", "Source", "", "", "Connect", 0, new ArrayList()));
        arrayList.add(new IntegrationList("JUSTDIAL", "Justdial", "Automatically Capture Leads from Justdial", "Source", "", "", "Connect", 0, new ArrayList()));
        arrayList.add(new IntegrationList("WEBFORM", "Web Contact Form", "Automatically Capture Leads from your website Contact Forms", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("COMMONFLOOR", "Commonfloor", "Automatically Capture Leads from Commonfloor", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("HOUSING", "Housing", "Automatically Capture Leads from Housing.com", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("RAZORPAY", "Razorpay", "Integrate Razorpay & Manage Payments", "Payment", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("CASHFREE", "Cashfree", "Integrate Cashfree & Manage Payments", "Payment", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("SHARED_MAILBOX", "Leads from Email to Salesmax", "Forward leads you receive on Email to Salesmax", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("SALESMAXAPI", "Leads Through API Call", "Call our API to create a lead", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("URBANPRO", "UrbanPro", "Automatically Capture Leads from UrbanPro", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("AAJJO", "AAJJO", "Automatically Capture Leads from aajjo.com", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("WIX", "Wix Contact Form", "Capture Leads from Wix Website Contact Form", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("CALENDLY", "Calendly", "Automatically Capture Leads from Calendly", "Source", "", "", "Detail", 0, new ArrayList()));
        arrayList.add(new IntegrationList("JOTFORM", "Jotform", "Automatically Capture Leads from Jotform", "Source", "", "", "Detail", 0, new ArrayList()));
        return arrayList;
    }

    /* renamed from: q */
    public final List m33940q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntegrationList("NEW_STANDARD", "New Standard Form", "Automatically Capture Leads from Facebook", "Source", "", "", "Connect", 0, null, 384, null));
        arrayList.add(new IntegrationList("NEW_CONVERSATIONAL", "New Conversational Form", "Automatically Capture Leads from Indiamart", "Source", "", "", "Connect", 0, null, 384, null));
        arrayList.add(new IntegrationList("EXISING_STANDARD", "Existing Form - Html, Javascript", "Automatically Capture Leads from Indiamart", "Source", "", "", "Connect", 0, null, 384, null));
        arrayList.add(new IntegrationList("WORDPRESS_FORM_7", "Wordpress Contact Form 7", "Automatically Capture Leads from various Contact Forms", "Source", "", "", "Detail", 0, null, 384, null));
        arrayList.add(new IntegrationList("GODADDY_FORM", "GoDaddy Website Form", "Automatically Capture Leads from various Contact Forms", "Source", "", "", "Detail", 0, null, 384, null));
        arrayList.add(new IntegrationList("WIX_FORM", "WIX Website Form", "Automatically Capture Leads from various Contact Forms", "Source", "", "", "Detail", 0, null, 384, null));
        arrayList.add(new IntegrationList("JOTFORM", "Jotform", "Automatically Capture Leads from various Contact Forms", "Source", "", "", "Detail", 0, null, 384, null));
        arrayList.add(new IntegrationList("TYPEFORM", "TypeForm", "Automatically Capture Leads from various Contact Forms", "Source", "", "", "Detail", 0, null, 384, null));
        arrayList.add(new IntegrationList("GOOGLE_FORM", "Google Form", "Automatically Capture Leads from various Contact Forms", "Source", "", "", "Detail", 0, null, 384, null));
        arrayList.add(new IntegrationList("WEBHOOK", "Send To Webhook", "Automatically Capture Leads from various Contact Forms", "Source", "", "", "Detail", 0, null, 384, null));
        return arrayList;
    }

    /* renamed from: r */
    public final List m33941r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        arrayList.add(new FormDefinition("1", "123", "Call Outcome - Interested", "Call Outcome - Interested", "Please enter call outcome", null, null, null, 224, null));
        return arrayList;
    }

    /* renamed from: s */
    public final AbstractC2145n m33942s(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C14559d(str, null), 2, null);
    }

    /* renamed from: t */
    public final AbstractC2145n m33943t(String str) {
        sq8.m48649h(str, "searchText");
        return e84.m24521b(eu5.m25611b(), 0L, new C14560e(str, null), 2, null);
    }

    /* renamed from: u */
    public final List m33944u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Recordingapp("TRUE_CALLER", "True Caller App for Call Recording", "True Caller", false, 8, null));
        return arrayList;
    }

    /* renamed from: v */
    public final List m33945v() {
        ArrayList arrayList = new ArrayList();
        mii miiVarM33946w = m33946w();
        sq8.m48646e(miiVarM33946w);
        if (miiVarM33946w.m39156f().getAccountType() != AccountType.INDIVIDUAL) {
            arrayList.add(new UserManagementActionType("Create New Workspace", Integer.valueOf(w7e.ic_company), null));
            arrayList.add(new UserManagementActionType("Edit Workspace", Integer.valueOf(w7e.ic_edit), null));
            arrayList.add(new UserManagementActionType("Invite User", Integer.valueOf(w7e.ic_plus), null));
            arrayList.add(new UserManagementActionType("Edit Membership", Integer.valueOf(w7e.ic_edit), null));
            arrayList.add(new UserManagementActionType("Migrate User Data", Integer.valueOf(w7e.ic_user_migrate), null));
            arrayList.add(new UserManagementActionType("Remove User", Integer.valueOf(w7e.ic_delete_engagement), null));
            arrayList.add(new UserManagementActionType("View All Users", Integer.valueOf(w7e.ic_detail_icon), null));
            arrayList.add(new UserManagementActionType("Create Team", Integer.valueOf(w7e.ic_team), null));
            arrayList.add(new UserManagementActionType("Edit Team Info", Integer.valueOf(w7e.ic_team_modify), null));
            arrayList.add(new UserManagementActionType("Add Member To Team", Integer.valueOf(w7e.ic_user_add), null));
            arrayList.add(new UserManagementActionType("Modify Team Member Role", Integer.valueOf(w7e.ic_edit), null));
            arrayList.add(new UserManagementActionType("Remove Member From Team", Integer.valueOf(w7e.ic_remove_user), null));
            arrayList.add(new UserManagementActionType("Delete Team", Integer.valueOf(w7e.ic_delete_engagement), null));
            arrayList.add(new UserManagementActionType("View All Teams", Integer.valueOf(w7e.ic_home_userstatus), null));
        } else {
            arrayList.add(new UserManagementActionType("Invite User", Integer.valueOf(w7e.ic_plus), null));
            arrayList.add(new UserManagementActionType("Delete Account", Integer.valueOf(w7e.ic_admin), null));
        }
        return arrayList;
    }

    /* renamed from: w */
    public final mii m33946w() {
        return wi0.m54444J();
    }

    /* renamed from: x */
    public final AbstractC2145n m33947x() {
        return e84.m24521b(eu5.m25611b(), 0L, new C14561f(null), 2, null);
    }

    /* renamed from: y */
    public final AbstractC2145n m33948y(String str, String str2, String str3) {
        sq8.m48649h(str, "action");
        sq8.m48649h(str2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        sq8.m48649h(str3, "networkType");
        return e84.m24521b(eu5.m25611b(), 0L, new C14562g(str2, str3, null), 2, null);
    }

    /* renamed from: z */
    public final AbstractC2145n m33949z(AccountMemberInvitation accountMemberInvitation) {
        sq8.m48649h(accountMemberInvitation, "invitation");
        return e84.m24521b(eu5.m25611b(), 0L, new C14563h(accountMemberInvitation, null), 2, null);
    }
}
