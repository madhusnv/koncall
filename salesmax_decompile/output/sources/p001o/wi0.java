package p001o;

import ai.salesmax.AbstractC0059a;
import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.AssignmentOutcome;
import ai.salesmax.model.AutoCallConfig;
import ai.salesmax.model.CallOutcome;
import ai.salesmax.model.ChatLabel;
import ai.salesmax.model.DealStageDefinition;
import ai.salesmax.model.DocTypeDefinition;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.FileData;
import ai.salesmax.model.FileObjectRelationshipSummary;
import ai.salesmax.model.LeadTag;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.PropertyOptions;
import ai.salesmax.model.TaskTypeDefinition;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.TemplateTag;
import ai.salesmax.model.UploadedFileSummary;
import ai.salesmax.model.VisitOutcome;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.AbstractC2145n;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.VerifyEmailOutput;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.wi0;
import p001o.yne;

/* loaded from: classes2.dex */
public abstract class wi0 {

    /* renamed from: o.wi0$a */
    public static final class C17871a extends jgg implements nl7 {

        /* renamed from: a */
        public int f52016a;

        /* renamed from: b */
        public /* synthetic */ Object f52017b;

        /* renamed from: c */
        public final /* synthetic */ EngagementSummary f52018c;

        /* renamed from: d */
        public final /* synthetic */ String f52019d;

        /* renamed from: e */
        public final /* synthetic */ EngagementSummary f52020e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17871a(EngagementSummary engagementSummary, String str, EngagementSummary engagementSummary2, n64 n64Var) {
            super(2, n64Var);
            this.f52018c = engagementSummary;
            this.f52019d = str;
            this.f52020e = engagementSummary2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17871a c17871a = new C17871a(this.f52018c, this.f52019d, this.f52020e, n64Var);
            c17871a.f52017b = obj;
            return c17871a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17871a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52016a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f52017b = null;
                this.f52016a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52017b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52017b = ogaVar2;
                this.f52016a = 1;
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
                ogaVar = (oga) this.f52017b;
                wre.m54934b(obj);
            }
            this.f52018c.setEngagementType(this.f52019d);
            if (!"TASK".equals(this.f52019d) && !"VIDEO".equals(this.f52019d)) {
                this.f52018c.setEngagementStatus("COMPLETED");
            }
            ArrayList arrayListM3231S = AbstractC0059a.m132a().m3231S();
            if (!arrayListM3231S.contains(this.f52018c)) {
                arrayListM3231S.add(this.f52018c);
                AbstractC0059a.m132a().v1(arrayListM3231S);
            }
            EngagementSummary engagementSummary = this.f52020e;
            EngagementSummary engagementSummary2 = engagementSummary == null ? (EngagementSummary) jyg.a1(this.f52018c).m55729h() : (EngagementSummary) jyg.b1(this.f52018c, engagementSummary).m55729h();
            sq8.m48646e(engagementSummary2);
            arrayListM3231S.remove(this.f52018c);
            AbstractC0059a.m132a().v1(arrayListM3231S);
            yne yneVarM58030d = yne.f55736e.m58030d(engagementSummary2);
            this.f52017b = ogaVar;
            this.f52016a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class a0 implements rl7 {

        /* renamed from: a */
        public static final a0 f52021a = new a0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List list) {
            sq8.m48649h(list, "it");
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PropertyDefinition) it.next()).getPossibleValues());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hh3.m30441A(arrayList2, (List) it2.next());
            }
            return arrayList2;
        }
    }

    public static final class a1 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52022a;

        /* renamed from: b */
        public /* synthetic */ Object f52023b;

        /* renamed from: c */
        public final /* synthetic */ String f52024c;

        /* renamed from: d */
        public final /* synthetic */ String f52025d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f52024c = str;
            this.f52025d = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            a1 a1Var = new a1(this.f52024c, this.f52025d, n64Var);
            a1Var.f52023b = obj;
            return a1Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((a1) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fd -> B:38:0x0100). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52022a;
            try {
            } catch (Exception e) {
                System.out.println((Object) ("requestVerifyAccountEmail " + e));
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f52023b = null;
                this.f52022a = 4;
                Object objEmit = r1.emit(yneVarM58028a, this);
                r1 = r1;
                if (objEmit == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52023b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52023b = ogaVar2;
                this.f52022a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3) {
                        oga ogaVar3 = (oga) this.f52023b;
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
                oga ogaVar4 = (oga) this.f52023b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            l1 l1VarM39161k = uni.kC().SB().m39161k();
            sq8.m48648g(l1VarM39161k, "getApiService(...)");
            Object objM55727f = l1VarM39161k.db(l1VarM39161k.on(), this.f52024c, this.f52025d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            VerifyEmailOutput verifyEmailOutput = (VerifyEmailOutput) objM55727f;
            Boolean isVerified = verifyEmailOutput.getIsVerified();
            sq8.m48648g(isVerified, "getIsVerified(...)");
            if (isVerified.booleanValue()) {
                LeadsUser leadsUserA0 = lpi.a0(l1VarM39161k.Eo());
                leadsUserA0.setRegisteredNumber(this.f52024c);
                lpi.R0(leadsUserA0.getUser());
                yne yneVarM58030d = yne.f55736e.m58030d(verifyEmailOutput);
                this.f52023b = ogaVar;
                this.f52022a = 2;
                Object objEmit2 = ogaVar.emit(yneVarM58030d, this);
                r1 = ogaVar;
                if (objEmit2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                yne.C18447a c18447a2 = yne.f55736e;
                String onErrorMessage = verifyEmailOutput.getOnErrorMessage();
                sq8.m48648g(onErrorMessage, "getOnErrorMessage(...)");
                yne yneVarM58028a2 = c18447a2.m58028a(null, onErrorMessage, new RuntimeException("User verification failed"));
                this.f52023b = ogaVar;
                this.f52022a = 3;
                Object objEmit3 = ogaVar.emit(yneVarM58028a2, this);
                r1 = ogaVar;
                if (objEmit3 == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$b */
    public static final class C17872b extends jgg implements nl7 {

        /* renamed from: a */
        public Object f52026a;

        /* renamed from: b */
        public int f52027b;

        /* renamed from: c */
        public /* synthetic */ Object f52028c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f52029d;

        /* renamed from: e */
        public final /* synthetic */ AssignmentOutcome f52030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17872b(ArrayList arrayList, AssignmentOutcome assignmentOutcome, n64 n64Var) {
            super(2, n64Var);
            this.f52029d = arrayList;
            this.f52030e = assignmentOutcome;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17872b c17872b = new C17872b(this.f52029d, this.f52030e, n64Var);
            c17872b.f52028c = obj;
            return c17872b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17872b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(1:(1:(3:7|37|38)(2:8|9))(6:10|39|11|27|37|38))(1:15))(2:16|(1:18))|41|19|(2:22|20)|43|23|(1:25)(4:26|27|37|38)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
        
            r4 = r14;
            r14 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            LeadsSummary leadsSummary;
            Object objM51918f = uq8.m51918f();
            int i = this.f52027b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52028c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52028c = ogaVar;
                this.f52027b = 1;
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
                    leadsSummary = (LeadsSummary) this.f52026a;
                    ogaVar2 = (oga) this.f52028c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("updateLead " + leadsSummary));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("updateLead " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error Occurred!";
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                        this.f52028c = null;
                        this.f52026a = null;
                        this.f52027b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52028c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            ArrayList arrayList = this.f52029d;
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(th1.m49865q((Leads) it.next(), null, 1, null));
            }
            leadsSummary = (LeadsSummary) lw9.m38019V(arrayList2, this.f52030e).m55728g();
            yne yneVarM58030d = yne.f55736e.m58030d(leadsSummary);
            this.f52028c = ogaVar;
            this.f52026a = leadsSummary;
            this.f52027b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("updateLead " + leadsSummary));
            return y3i.f54824a;
        }
    }

    public static final class b0 implements rl7 {

        /* renamed from: a */
        public static final b0 f52031a = new b0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(List list) {
            sq8.m48649h(list, "it");
            HashMap map = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PropertyOptions propertyOptions = (PropertyOptions) it.next();
                String value = propertyOptions.getValue();
                String viewValue = propertyOptions.getViewValue();
                if (viewValue == null) {
                    viewValue = "";
                }
                String upperCase = viewValue.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
                map.put(value, upperCase);
            }
            return map;
        }
    }

    /* renamed from: o.wi0$c */
    public static final class C17873c extends jgg implements nl7 {

        /* renamed from: a */
        public int f52032a;

        /* renamed from: b */
        public /* synthetic */ Object f52033b;

        /* renamed from: c */
        public final /* synthetic */ List f52034c;

        /* renamed from: d */
        public final /* synthetic */ AssignmentOutcome f52035d;

        /* renamed from: o.wi0$c$a */
        public static final class a implements ggd {

            /* renamed from: a */
            public final /* synthetic */ ArrayList f52036a;

            public a(ArrayList arrayList) {
                this.f52036a = arrayList;
            }

            @Override // p001o.ggd
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(EngagementSummary engagementSummary) {
                sq8.m48649h(engagementSummary, "a");
                this.f52036a.add(engagementSummary);
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17873c(List list, AssignmentOutcome assignmentOutcome, n64 n64Var) {
            super(2, n64Var);
            this.f52034c = list;
            this.f52035d = assignmentOutcome;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17873c c17873c = new C17873c(this.f52034c, this.f52035d, n64Var);
            c17873c.f52033b = obj;
            return c17873c;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17873c) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52032a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f52033b = null;
                this.f52032a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52033b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52033b = ogaVar2;
                this.f52032a = 1;
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
                ogaVar = (oga) this.f52033b;
                wre.m54934b(obj);
            }
            List list = this.f52034c;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(th1.m49863o((Tasks) it.next(), null, 1, null));
            }
            yne yneVarM58030d = yne.f55736e.m58030d((EngagementSummary) jyg.X0(arrayList, this.f52035d).m55714J(new a(new ArrayList())).m55728g());
            this.f52033b = ogaVar;
            this.f52032a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    public static final class c0 implements rl7 {

        /* renamed from: a */
        public static final c0 f52037a = new c0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB().m39161k();
        }
    }

    /* renamed from: o.wi0$d */
    public static final class C17874d extends jgg implements nl7 {

        /* renamed from: a */
        public Object f52038a;

        /* renamed from: b */
        public int f52039b;

        /* renamed from: c */
        public /* synthetic */ Object f52040c;

        /* renamed from: d */
        public final /* synthetic */ List f52041d;

        /* renamed from: e */
        public final /* synthetic */ String f52042e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17874d(List list, String str, n64 n64Var) {
            super(2, n64Var);
            this.f52041d = list;
            this.f52042e = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17874d c17874d = new C17874d(this.f52041d, this.f52042e, n64Var);
            c17874d.f52040c = obj;
            return c17874d;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17874d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(3:7|33|34)(2:8|9))(6:10|35|11|23|33|34))(1:15))(2:16|(1:18))|37|19|(1:21)(4:22|23|33|34)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        
            r4 = r14;
            r14 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            List list;
            Object objM51918f = uq8.m51918f();
            int i = this.f52039b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52040c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52040c = ogaVar;
                this.f52039b = 1;
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
                    list = (List) this.f52038a;
                    ogaVar2 = (oga) this.f52040c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("closeLead " + list));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("closeLead " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error Occurred!";
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                        this.f52040c = null;
                        this.f52038a = null;
                        this.f52039b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52040c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            Object objM55727f = lw9.m38021X(this.f52041d, this.f52042e).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            list = (List) objM55727f;
            yne yneVarM58030d = yne.f55736e.m58030d(list);
            this.f52040c = ogaVar;
            this.f52038a = list;
            this.f52039b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("closeLead " + list));
            return y3i.f54824a;
        }
    }

    public static final class d0 implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f52043a;

        public d0(String str) {
            this.f52043a = str;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            return l1Var.na(this.f52043a);
        }
    }

    /* renamed from: o.wi0$e */
    public static final class C17875e extends jgg implements nl7 {

        /* renamed from: a */
        public Object f52044a;

        /* renamed from: b */
        public int f52045b;

        /* renamed from: c */
        public /* synthetic */ Object f52046c;

        /* renamed from: d */
        public final /* synthetic */ LeadsSummary f52047d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17875e(LeadsSummary leadsSummary, n64 n64Var) {
            super(2, n64Var);
            this.f52047d = leadsSummary;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17875e c17875e = new C17875e(this.f52047d, n64Var);
            c17875e.f52046c = obj;
            return c17875e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17875e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(3:7|33|34)(2:8|9))(6:10|35|11|23|33|34))(1:15))(2:16|(1:18))|37|19|(1:21)(4:22|23|33|34)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        
            r4 = r14;
            r14 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            LeadsSummary leadsSummary;
            Object objM51918f = uq8.m51918f();
            int i = this.f52045b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52046c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52046c = ogaVar;
                this.f52045b = 1;
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
                    leadsSummary = (LeadsSummary) this.f52044a;
                    ogaVar2 = (oga) this.f52046c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("createLead " + leadsSummary));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("createLead " + e2));
                        ogaVar2.getClass();
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't create lead ");
                        sb.append(message);
                        yne.C18447a c18447a = yne.f55736e;
                        String message2 = e2.getMessage();
                        if (message2 == null) {
                            message2 = "Error Occurred!";
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message2, null, 4, null);
                        this.f52046c = null;
                        this.f52044a = null;
                        this.f52045b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52046c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            leadsSummary = (LeadsSummary) lw9.m38022Y(this.f52047d).m55727f();
            yne yneVarM58030d = yne.f55736e.m58030d(leadsSummary);
            this.f52046c = ogaVar;
            this.f52044a = leadsSummary;
            this.f52045b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("createLead " + leadsSummary));
            return y3i.f54824a;
        }
    }

    public static final class e0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52048a;

        /* renamed from: b */
        public /* synthetic */ Object f52049b;

        /* renamed from: c */
        public final /* synthetic */ String f52050c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String str, n64 n64Var) {
            super(2, n64Var);
            this.f52050c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            e0 e0Var = new e0(this.f52050c, n64Var);
            e0Var.f52049b = obj;
            return e0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((e0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52048a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't load property definitions", e);
                this.f52049b = null;
                this.f52048a = 5;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52049b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52049b = ogaVar2;
                this.f52048a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3 || r1 == 4) {
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    if (r1 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f52049b;
                wre.m54934b(obj);
            }
            l1 l1VarTB = uni.kC().TB();
            sq8.m48648g(l1VarTB, "getActiveService(...)");
            Object objM55727f = l1VarTB.sC().j1().m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            Map map = (Map) objM55727f;
            String str = this.f52050c;
            if (str != null && !f9g.d0(str)) {
                z = false;
            }
            if (z) {
                yne yneVarM58030d = yne.f55736e.m58030d(kh3.Q0(map.values()));
                this.f52049b = ogaVar;
                this.f52048a = 2;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    return objM51918f;
                }
            } else if (map.containsKey(this.f52050c)) {
                yne yneVarM58030d2 = yne.f55736e.m58030d(Collections.singletonList(map.getOrDefault(this.f52050c, null)));
                this.f52049b = ogaVar;
                this.f52048a = 3;
                if (ogaVar.emit(yneVarM58030d2, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                yne yneVarM58028a2 = yne.f55736e.m58028a(null, "Couldn't load property definition for name " + this.f52050c, new RuntimeException("Property " + this.f52050c + " not found"));
                this.f52049b = ogaVar;
                this.f52048a = 4;
                if (ogaVar.emit(yneVarM58028a2, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$f */
    public static final class C17876f extends jgg implements nl7 {

        /* renamed from: a */
        public Object f52051a;

        /* renamed from: b */
        public int f52052b;

        /* renamed from: c */
        public /* synthetic */ Object f52053c;

        /* renamed from: d */
        public final /* synthetic */ String f52054d;

        /* renamed from: e */
        public final /* synthetic */ Context f52055e;

        /* renamed from: f */
        public final /* synthetic */ LeadsSummary f52056f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17876f(String str, Context context, LeadsSummary leadsSummary, n64 n64Var) {
            super(2, n64Var);
            this.f52054d = str;
            this.f52055e = context;
            this.f52056f = leadsSummary;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17876f c17876f = new C17876f(this.f52054d, this.f52055e, this.f52056f, n64Var);
            c17876f.f52053c = obj;
            return c17876f;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17876f) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(1:(3:7|53|54)(2:8|9))(6:10|57|11|43|53|54))(1:15))(2:16|(1:18))|55|19|(11:21|(1:23)(1:24)|25|26|(1:28)|29|59|30|(1:32)(1:33)|34|(1:36))|39|(1:41)(4:42|43|53|54)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
        
            r4 = r14;
            r14 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
        
            r14 = "Error Occurred!";
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x014a A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            LeadsSummary leadsSummary;
            Object next;
            Object objM51918f = uq8.m51918f();
            int i = this.f52052b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52053c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52053c = ogaVar;
                this.f52052b = 1;
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
                    leadsSummary = (LeadsSummary) this.f52051a;
                    ogaVar2 = (oga) this.f52053c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("createLead " + leadsSummary));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("createLead " + e2));
                        ogaVar2.getClass();
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't create lead ");
                        sb.append(message);
                        yne.C18447a c18447a = yne.f55736e;
                        String message2 = e2.getMessage();
                        if (message2 == null) {
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message2, null, 4, null);
                        this.f52053c = null;
                        this.f52051a = null;
                        this.f52052b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52053c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            if (!f9g.d0(this.f52054d)) {
                Uri uri = Uri.parse(this.f52054d);
                this.f52055e.getContentResolver();
                Iterator<T> it = this.f52056f.getContactNumbers().iterator();
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                }
                String str = (String) next;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                uz6 uz6Var = uz6.f49700a;
                Context context = this.f52055e;
                sq8.m48646e(uri);
                try {
                    String fileUrl = ((UploadedFileSummary) gq9.m29277B(this.f52055e, uri, str, uz6Var.m52179c(context, uri)).m55727f()).getFileUrl();
                    if (fileUrl != null) {
                        str2 = fileUrl;
                    }
                    if (!StringUtils.isBlank(this.f52054d)) {
                        this.f52056f.setProfilePicURL(str2);
                    }
                } catch (Exception unused) {
                    System.out.println((Object) ("exception while upload lead profile pic " + this.f52054d));
                }
            }
            leadsSummary = (LeadsSummary) lw9.m38022Y(this.f52056f).m55727f();
            yne yneVarM58030d = yne.f55736e.m58030d(leadsSummary);
            this.f52053c = ogaVar;
            this.f52051a = leadsSummary;
            this.f52052b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("createLead " + leadsSummary));
            return y3i.f54824a;
        }
    }

    public static final class f0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52057a;

        /* renamed from: b */
        public /* synthetic */ Object f52058b;

        /* renamed from: c */
        public final /* synthetic */ String f52059c;

        /* renamed from: d */
        public final /* synthetic */ String f52060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f52059c = str;
            this.f52060d = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            f0 f0Var = new f0(this.f52059c, this.f52060d, n64Var);
            f0Var.f52058b = obj;
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
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e4 -> B:35:0x00e7). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52057a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't load property definitions", e);
                this.f52058b = null;
                this.f52057a = 4;
                Object objEmit = r1.emit(yneVarM58028a, this);
                r1 = r1;
                if (objEmit == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52058b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52058b = ogaVar2;
                this.f52057a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3) {
                        oga ogaVar3 = (oga) this.f52058b;
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
                oga ogaVar4 = (oga) this.f52058b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            l1 l1VarTB = uni.kC().TB();
            sq8.m48648g(l1VarTB, "getActiveService(...)");
            Object objM55727f = l1VarTB.sC().l0(this.f52059c, this.f52060d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            Optional optional = (Optional) objM55727f;
            if (hq9.m30994a(optional)) {
                yne yneVarM58028a2 = yne.f55736e.m58028a(null, "Couldn't load property definition for name " + this.f52060d, new RuntimeException("Property " + this.f52060d + " not found"));
                this.f52058b = ogaVar;
                this.f52057a = 2;
                Object objEmit2 = ogaVar.emit(yneVarM58028a2, this);
                r1 = ogaVar;
                if (objEmit2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                yne yneVarM58030d = yne.f55736e.m58030d(optional.get());
                this.f52058b = ogaVar;
                this.f52057a = 3;
                Object objEmit3 = ogaVar.emit(yneVarM58030d, this);
                r1 = ogaVar;
                if (objEmit3 == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$g */
    public static final class C17877g extends jgg implements nl7 {

        /* renamed from: a */
        public Object f52061a;

        /* renamed from: b */
        public int f52062b;

        /* renamed from: c */
        public /* synthetic */ Object f52063c;

        /* renamed from: d */
        public final /* synthetic */ List f52064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17877g(List list, n64 n64Var) {
            super(2, n64Var);
            this.f52064d = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17877g c17877g = new C17877g(this.f52064d, n64Var);
            c17877g.f52063c = obj;
            return c17877g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17877g) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(3:7|33|34)(2:8|9))(6:10|35|11|23|33|34))(1:15))(2:16|(1:18))|37|19|(1:21)(4:22|23|33|34)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        
            r4 = r14;
            r14 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            Set setV0;
            Object objM51918f = uq8.m51918f();
            int i = this.f52062b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52063c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52063c = ogaVar;
                this.f52062b = 1;
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
                    setV0 = (Set) this.f52061a;
                    ogaVar2 = (oga) this.f52063c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("deleteContactNumber " + setV0));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("deleteContactNumber " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error Occurred!";
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                        this.f52063c = null;
                        this.f52061a = null;
                        this.f52062b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52063c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            Iterable iterableM47702i = ny3.m41219d(this.f52064d).m47702i();
            sq8.m48648g(iterableM47702i, "blockingIterable(...)");
            setV0 = kh3.V0(iterableM47702i);
            yne yneVarM58030d = yne.f55736e.m58030d(setV0);
            this.f52063c = ogaVar;
            this.f52061a = setV0;
            this.f52062b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("deleteContactNumber " + setV0));
            return y3i.f54824a;
        }
    }

    public static final class g0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52065a;

        /* renamed from: b */
        public /* synthetic */ Object f52066b;

        /* renamed from: o.wi0$g0$a */
        public static final class C17878a implements rl7 {

            /* renamed from: a */
            public static final C17878a f52067a = new C17878a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PropertyDefinition apply(List list) {
                sq8.m48649h(list, "it");
                return PropertyDefinitionRepository.g1(list);
            }
        }

        /* renamed from: o.wi0$g0$b */
        public static final class C17879b implements rl7 {

            /* renamed from: a */
            public static final C17879b f52068a = new C17879b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList apply(PropertyDefinition propertyDefinition) {
                return ch3.m21242g(propertyDefinition);
            }
        }

        public g0(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            g0 g0Var = new g0(n64Var);
            g0Var.f52066b = obj;
            return g0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((g0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f52065a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't load property definitions", e);
                this.f52066b = null;
                this.f52065a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52066b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52066b = ogaVar2;
                this.f52065a = 1;
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
                    oga ogaVar3 = (oga) this.f52066b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f52066b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = uw9.m52080i().d0(C17878a.f52067a).d0(C17879b.f52068a).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((ArrayList) objM55727f);
            this.f52066b = ogaVar;
            this.f52065a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$h */
    public static final class C17880h extends jgg implements nl7 {

        /* renamed from: a */
        public Object f52069a;

        /* renamed from: b */
        public int f52070b;

        /* renamed from: c */
        public /* synthetic */ Object f52071c;

        /* renamed from: d */
        public final /* synthetic */ String f52072d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17880h(String str, n64 n64Var) {
            super(2, n64Var);
            this.f52072d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17880h c17880h = new C17880h(this.f52072d, n64Var);
            c17880h.f52071c = obj;
            return c17880h;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17880h) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(3:7|33|34)(2:8|9))(6:10|35|11|23|33|34))(1:15))(2:16|(1:18))|37|19|(1:21)(4:22|23|33|34)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        
            r4 = r14;
            r14 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            EngagementSummary engagementSummary;
            Object objM51918f = uq8.m51918f();
            int i = this.f52070b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52071c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52071c = ogaVar;
                this.f52070b = 1;
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
                    engagementSummary = (EngagementSummary) this.f52069a;
                    ogaVar2 = (oga) this.f52071c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("deleteEngagement " + engagementSummary));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("deleteEngagement " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error Occurred!";
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                        this.f52071c = null;
                        this.f52069a = null;
                        this.f52070b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52071c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            engagementSummary = (EngagementSummary) jyg.d1(this.f52072d).m55727f();
            yne yneVarM58030d = yne.f55736e.m58030d(engagementSummary);
            this.f52071c = ogaVar;
            this.f52069a = engagementSummary;
            this.f52070b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("deleteEngagement " + engagementSummary));
            return y3i.f54824a;
        }
    }

    public static final class h0 implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f52073a;

        /* renamed from: b */
        public final /* synthetic */ l1 f52074b;

        public h0(String str, l1 l1Var) {
            this.f52073a = str;
            this.f52074b = l1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyDefinition apply(Map map) {
            sq8.m48649h(map, "it");
            String str = this.f52073a;
            String strOn = this.f52074b.on();
            sq8.m48648g(strOn, "getAccountId(...)");
            return (PropertyDefinition) map.getOrDefault(str, new PropertyDefinition(null, strOn, this.f52073a, null, null, null, null, null, false, false, null, null, null, false, 16377, null));
        }
    }

    /* renamed from: o.wi0$i */
    public static final class C17881i extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17881i f52075a = new C17881i();

        public C17881i() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CallOutcome invoke(PropertyOptions propertyOptions) {
            Object objTu = ja8.Tu(propertyOptions.getOtherAttributes(), CallOutcome.class);
            sq8.m48648g(objTu, "convertResponseBackground(...)");
            CallOutcome callOutcome = (CallOutcome) objTu;
            String viewValue = propertyOptions.getViewValue();
            if (viewValue == null) {
                viewValue = "";
            }
            callOutcome.setOutcomeTitle(viewValue);
            String value = propertyOptions.getValue();
            callOutcome.setOutcomeValue(value != null ? value : "");
            return callOutcome;
        }
    }

    public static final class i0 implements rl7 {

        /* renamed from: a */
        public static final i0 f52076a = new i0();

        /* renamed from: o.wi0$i0$a */
        public static final class C17882a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17882a f52077a = new C17882a();

            public C17882a() {
                super(1);
            }

            @Override // p001o.xk7
            public final String invoke(ryh ryhVar) {
                sq8.m48649h(ryhVar, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                String str = (String) ryhVar.f44265a;
                return str == null ? "" : str;
            }
        }

        /* renamed from: o.wi0$i0$b */
        public static final class C17883b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17883b f52078a = new C17883b();

            public C17883b() {
                super(1);
            }

            @Override // p001o.xk7
            public final String invoke(ryh ryhVar) {
                sq8.m48649h(ryhVar, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                String str = (String) ryhVar.f44266b;
                return str == null ? "" : str;
            }
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(PropertyDefinition propertyDefinition) {
            C17882a c17882a = C17882a.f52077a;
            C17883b c17883b = C17883b.f52078a;
            List<PropertyOptions> possibleValues = propertyDefinition.getPossibleValues();
            ArrayList arrayList = new ArrayList(dh3.m23088v(possibleValues, 10));
            for (PropertyOptions propertyOptions : possibleValues) {
                String value = propertyOptions.getValue();
                String viewValue = propertyOptions.getViewValue();
                if (viewValue == null) {
                    viewValue = "";
                }
                String upperCase = viewValue.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
                arrayList.add(uyh.of(value, upperCase));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                Object objInvoke = c17882a.invoke(obj);
                Object arrayList2 = linkedHashMap.get(objInvoke);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(objInvoke, arrayList2);
                }
                ((List) arrayList2).add(c17883b.invoke(obj));
            }
            return linkedHashMap;
        }
    }

    /* renamed from: o.wi0$j */
    public static final class C17884j extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17884j f52079a = new C17884j();

        public C17884j() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChatLabel invoke(PropertyOptions propertyOptions) {
            Object objTu = ja8.Tu(propertyOptions.getOtherAttributes(), ChatLabel.class);
            sq8.m48648g(objTu, "convertResponseBackground(...)");
            ChatLabel chatLabel = (ChatLabel) objTu;
            String viewValue = propertyOptions.getViewValue();
            if (viewValue == null) {
                viewValue = "";
            }
            chatLabel.setLabel(viewValue);
            return chatLabel;
        }
    }

    public static final class j0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52080a;

        /* renamed from: b */
        public /* synthetic */ Object f52081b;

        /* renamed from: c */
        public final /* synthetic */ String f52082c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str, n64 n64Var) {
            super(2, n64Var);
            this.f52082c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            j0 j0Var = new j0(this.f52082c, n64Var);
            j0Var.f52081b = obj;
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
            ?? r1 = this.f52080a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                String str = message != null ? message : null;
                sq8.m48646e(str);
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f52081b = null;
                this.f52080a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52081b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52081b = ogaVar2;
                this.f52080a = 1;
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
                    oga ogaVar3 = (oga) this.f52081b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f52081b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = o4h.m41546J(this.f52082c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f52081b = ogaVar;
            this.f52080a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$k */
    public static final class C17885k extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17885k f52083a = new C17885k();

        public C17885k() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DealStageDefinition invoke(PropertyOptions propertyOptions) {
            Object objTu = ja8.Tu(propertyOptions.getOtherAttributes(), DealStageDefinition.class);
            sq8.m48648g(objTu, "convertResponseBackground(...)");
            DealStageDefinition dealStageDefinition = (DealStageDefinition) objTu;
            String viewValue = propertyOptions.getViewValue();
            if (viewValue == null) {
                viewValue = "";
            }
            dealStageDefinition.setName(viewValue);
            return dealStageDefinition;
        }
    }

    public static final class k0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52084a;

        /* renamed from: b */
        public /* synthetic */ Object f52085b;

        /* renamed from: c */
        public final /* synthetic */ String f52086c;

        /* renamed from: d */
        public final /* synthetic */ String f52087d;

        /* renamed from: e */
        public final /* synthetic */ String f52088e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String str, String str2, String str3, n64 n64Var) {
            super(2, n64Var);
            this.f52086c = str;
            this.f52087d = str2;
            this.f52088e = str3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            k0 k0Var = new k0(this.f52086c, this.f52087d, this.f52088e, n64Var);
            k0Var.f52085b = obj;
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
            ?? r1 = this.f52084a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "couldn't find linked files for given contact", e);
                this.f52085b = null;
                this.f52084a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52085b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52085b = ogaVar2;
                this.f52084a = 1;
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
                    oga ogaVar3 = (oga) this.f52085b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f52085b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = fz6.m27785C(this.f52086c, this.f52087d, this.f52088e).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f52085b = ogaVar;
            this.f52084a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$l */
    public static final class C17886l extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17886l f52089a = new C17886l();

        public C17886l() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [ai.salesmax.model.DocTypeDefinition, java.lang.Object[], lombok.launch.PatchFixesHider$Util] */
        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocTypeDefinition invoke(PropertyOptions propertyOptions) {
            Object objTu = ja8.Tu(propertyOptions.getOtherAttributes(), DocTypeDefinition.class);
            sq8.m48648g(objTu, "convertResponseBackground(...)");
            ?? r0 = (DocTypeDefinition) objTu;
            r0.setValue(propertyOptions.getValue());
            String viewValue = propertyOptions.getViewValue();
            Method method = viewValue;
            if (viewValue == null) {
                method = "";
            }
            r0.invokeMethod(method, r0);
            return r0;
        }
    }

    public static final class l0 implements rl7 {

        /* renamed from: a */
        public static final l0 f52090a = new l0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(u03 u03Var) {
            sq8.m48649h(u03Var, "it");
            return mfh.m38955b().m38958d(u03Var);
        }
    }

    /* renamed from: o.wi0$m */
    public static final class C17887m extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17887m f52091a = new C17887m();

        public C17887m() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeadTag invoke(PropertyOptions propertyOptions) {
            Object objTu = ja8.Tu(propertyOptions.getOtherAttributes(), LeadTag.class);
            sq8.m48648g(objTu, "convertResponseBackground(...)");
            LeadTag leadTag = (LeadTag) objTu;
            String viewValue = propertyOptions.getViewValue();
            if (viewValue == null) {
                viewValue = "";
            }
            leadTag.setOutcomeTitle(viewValue);
            String value = propertyOptions.getValue();
            leadTag.setOutcomeValue(value != null ? value : "");
            return leadTag;
        }
    }

    public static final class m0 implements rl7 {

        /* renamed from: a */
        public static final m0 f52092a = new m0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.wi0$n */
    public static final class C17888n extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17888n f52093a = new C17888n();

        public C17888n() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TaskTypeDefinition invoke(PropertyOptions propertyOptions) {
            Object objTu = ja8.Tu(propertyOptions.getOtherAttributes(), TaskTypeDefinition.class);
            sq8.m48648g(objTu, "convertResponseBackground(...)");
            TaskTypeDefinition taskTypeDefinition = (TaskTypeDefinition) objTu;
            String viewValue = propertyOptions.getViewValue();
            if (viewValue == null) {
                viewValue = "";
            }
            taskTypeDefinition.setName(viewValue);
            return taskTypeDefinition;
        }
    }

    public static final class n0 implements rl7 {

        /* renamed from: a */
        public static final n0 f52094a = new n0();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u03 apply(mii miiVar) {
            return miiVar.m39161k();
        }
    }

    /* renamed from: o.wi0$o */
    public static final class C17889o extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17889o f52095a = new C17889o();

        public C17889o() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VisitOutcome invoke(PropertyOptions propertyOptions) {
            Object objTu = ja8.Tu(propertyOptions.getOtherAttributes(), VisitOutcome.class);
            sq8.m48648g(objTu, "convertResponseBackground(...)");
            VisitOutcome visitOutcome = (VisitOutcome) objTu;
            String viewValue = propertyOptions.getViewValue();
            if (viewValue == null) {
                viewValue = "";
            }
            visitOutcome.setOutcomeTitle(viewValue);
            return visitOutcome;
        }
    }

    public static final class o0 implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f52096a;

        /* renamed from: o.wi0$o0$a */
        public static final class C17890a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17890a f52097a = new C17890a();

            public C17890a() {
                super(1);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 1, list:
                  (r1v1 ?? I:boolean) from 0x0004: INVOKE (r1v2 ?? I:java.lang.Boolean) = (r1v1 ?? I:boolean) STATIC call: java.lang.Boolean.valueOf(boolean):java.lang.Boolean A[MD:(boolean):java.lang.Boolean (c)] (LINE:5)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(ai.salesmax.model.DealStageDefinition r1) {
                /*
                    r0 = this;
                    void r1 = r1.<init>()
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: o.wi0.o0.C17890a.invoke(ai.salesmax.model.DealStageDefinition):java.lang.Boolean");
            }
        }

        /* renamed from: o.wi0$o0$b */
        public static final class C17891b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17891b f52098a = new C17891b();

            public C17891b() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(DealStageDefinition dealStageDefinition) {
                return Boolean.valueOf(dealStageDefinition.isTerminalStateInSuccess());
            }
        }

        /* renamed from: o.wi0$o0$c */
        public static final class C17892c extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17892c f52099a = new C17892c();

            public C17892c() {
                super(1);
            }

            @Override // p001o.xk7
            public final Stream invoke(List list) {
                return list.stream();
            }
        }

        /* renamed from: o.wi0$o0$d */
        public static final class C17893d extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17893d f52100a = new C17893d();

            public C17893d() {
                super(1);
            }

            @Override // p001o.xk7
            public final String invoke(String str) {
                sq8.m48646e(str);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                return lowerCase;
            }
        }

        /* renamed from: o.wi0$o0$e */
        public static final class C17894e extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17894e f52101a = new C17894e();

            public C17894e() {
                super(1);
            }

            @Override // p001o.xk7
            public final Stream invoke(List list) {
                return list.stream();
            }
        }

        /* renamed from: o.wi0$o0$f */
        public static final class C17895f extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17895f f52102a = new C17895f();

            public C17895f() {
                super(1);
            }

            @Override // p001o.xk7
            public final String invoke(String str) {
                sq8.m48646e(str);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                return lowerCase;
            }
        }

        public o0(String str) {
            this.f52096a = str;
        }

        /* renamed from: h */
        public static final boolean m54526h(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        /* renamed from: i */
        public static final boolean m54527i(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return ((Boolean) xk7Var.invoke(obj)).booleanValue();
        }

        /* renamed from: j */
        public static final Stream m54528j(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (Stream) xk7Var.invoke(obj);
        }

        /* renamed from: k */
        public static final String m54529k(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (String) xk7Var.invoke(obj);
        }

        /* renamed from: l */
        public static final Stream m54530l(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (Stream) xk7Var.invoke(obj);
        }

        /* renamed from: m */
        public static final String m54531m(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (String) xk7Var.invoke(obj);
        }

        @Override // p001o.rl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final syh apply(List list) {
            sq8.m48649h(list, "it2");
            Stream stream = list.stream();
            final C17890a c17890a = C17890a.f52097a;
            List list2 = (List) stream.filter(new Predicate() { // from class: o.xi0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return wi0.o0.m54526h(c17890a, obj);
                }
            }).collect(Collectors.toList());
            Stream stream2 = list.stream();
            final C17891b c17891b = C17891b.f52098a;
            List list3 = (List) stream2.filter(new Predicate() { // from class: o.yi0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return wi0.o0.m54527i(c17891b, obj);
                }
            }).collect(Collectors.toList());
            sq8.m48646e(list2);
            ArrayList arrayList = new ArrayList(dh3.m23088v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((DealStageDefinition) it.next()).getCreateIfTaskCompletedInFailure());
            }
            Stream stream3 = arrayList.stream();
            final C17892c c17892c = C17892c.f52099a;
            Stream streamFlatMap = stream3.flatMap(new Function() { // from class: o.zi0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return wi0.o0.m54528j(c17892c, obj);
                }
            });
            final C17893d c17893d = C17893d.f52100a;
            Object objCollect = streamFlatMap.map(new Function() { // from class: o.aj0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return wi0.o0.m54529k(c17893d, obj);
                }
            }).collect(Collectors.toList());
            sq8.m48648g(objCollect, "collect(...)");
            boolean zContains = kh3.V0((Iterable) objCollect).contains(this.f52096a);
            sq8.m48646e(list3);
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((DealStageDefinition) it2.next()).getCreateIfTaskCompletedSuccessfully());
            }
            Stream stream4 = arrayList2.stream();
            final C17894e c17894e = C17894e.f52101a;
            Stream streamFlatMap2 = stream4.flatMap(new Function() { // from class: o.bj0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return wi0.o0.m54530l(c17894e, obj);
                }
            });
            final C17895f c17895f = C17895f.f52102a;
            Object objCollect2 = streamFlatMap2.map(new Function() { // from class: o.cj0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return wi0.o0.m54531m(c17895f, obj);
                }
            }).collect(Collectors.toList());
            sq8.m48648g(objCollect2, "collect(...)");
            boolean zContains2 = kh3.V0((Iterable) objCollect2).contains(this.f52096a);
            return uyh.of(Boolean.valueOf((zContains || zContains2) ? false : true), Boolean.valueOf(zContains2), Boolean.valueOf(zContains));
        }
    }

    /* renamed from: o.wi0$p */
    public static final class C17896p extends jgg implements nl7 {

        /* renamed from: a */
        public int f52103a;

        /* renamed from: b */
        public /* synthetic */ Object f52104b;

        /* renamed from: c */
        public final /* synthetic */ String f52105c;

        /* renamed from: d */
        public final /* synthetic */ List f52106d;

        /* renamed from: e */
        public final /* synthetic */ String f52107e;

        /* renamed from: o.wi0$p$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public static final a f52108a = new a();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaginatedDataModel apply(PaginatedTokenResults paginatedTokenResults) {
                sq8.m48649h(paginatedTokenResults, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                return new PaginatedDataModel("All Templates", paginatedTokenResults);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17896p(String str, List list, String str2, n64 n64Var) {
            super(2, n64Var);
            this.f52105c = str;
            this.f52106d = list;
            this.f52107e = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17896p c17896p = new C17896p(this.f52105c, this.f52106d, this.f52107e, n64Var);
            c17896p.f52104b = obj;
            return c17896p;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17896p) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f52103a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String str = String.format("Couldn't fetch templates by ownerId and templateType %s", Arrays.copyOf(new Object[]{e.getMessage()}, 1));
                sq8.m48648g(str, "format(...)");
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, str, null, 4, null);
                this.f52104b = null;
                this.f52103a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52104b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52104b = ogaVar2;
                this.f52103a = 1;
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
                    oga ogaVar3 = (oga) this.f52104b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f52104b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM47698c = kfh.m35634l(this.f52105c, this.f52106d, 10, this.f52107e).m47686M(a.f52108a).m47698c();
            sq8.m48648g(objM47698c, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaginatedDataModel) objM47698c);
            this.f52104b = ogaVar;
            this.f52103a = 2;
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
        public int f52109a;

        /* renamed from: b */
        public /* synthetic */ Object f52110b;

        /* renamed from: c */
        public final /* synthetic */ PaginatedDataModel f52111c;

        /* renamed from: o.wi0$p0$a */
        public static final class C17897a extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ PaginatedDataModel f52112a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17897a(PaginatedDataModel paginatedDataModel) {
                super(0);
                this.f52112a = paginatedDataModel;
            }

            @Override // p001o.uk7
            public final Boolean invoke() {
                return (Boolean) this.f52112a.isEmpty().m55727f();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(PaginatedDataModel paginatedDataModel, n64 n64Var) {
            super(2, n64Var);
            this.f52111c = paginatedDataModel;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            p0 p0Var = new p0(this.f52111c, n64Var);
            p0Var.f52110b = obj;
            return p0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((p0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            boolean zBooleanValue;
            yne yneVarM58030d;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52109a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f52110b = null;
                this.f52109a = 5;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52110b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52110b = ogaVar2;
                this.f52109a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                    } else {
                        if (r1 == 3) {
                            ogaVar = (oga) this.f52110b;
                            wre.m54934b(obj);
                            sq8.m48648g(obj, "runInterruptible(...)");
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            yne.C18447a c18447a2 = yne.f55736e;
                            if (zBooleanValue) {
                                z = false;
                            }
                            yneVarM58030d = c18447a2.m58030d(ml1.m39301a(z));
                            this.f52110b = ogaVar;
                            this.f52109a = 4;
                            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                                return objM51918f;
                            }
                            return y3i.f54824a;
                        }
                        if (r1 != 4) {
                            if (r1 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            wre.m54934b(obj);
                            return y3i.f54824a;
                        }
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f52110b;
                wre.m54934b(obj);
            }
            if (this.f52111c == null) {
                yne yneVarM58030d2 = yne.f55736e.m58030d(ml1.m39301a(true));
                this.f52110b = ogaVar;
                this.f52109a = 2;
                if (ogaVar.emit(yneVarM58030d2, this) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            z74 z74VarM25611b = eu5.m25611b();
            C17897a c17897a = new C17897a(this.f52111c);
            this.f52110b = ogaVar;
            this.f52109a = 3;
            obj = qq8.m45766b(z74VarM25611b, c17897a, this);
            if (obj == objM51918f) {
                return objM51918f;
            }
            sq8.m48648g(obj, "runInterruptible(...)");
            zBooleanValue = ((Boolean) obj).booleanValue();
            yne.C18447a c18447a22 = yne.f55736e;
            if (zBooleanValue) {
            }
            yneVarM58030d = c18447a22.m58030d(ml1.m39301a(z));
            this.f52110b = ogaVar;
            this.f52109a = 4;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$q */
    public static final class C17898q implements rl7 {

        /* renamed from: a */
        public static final C17898q f52113a = new C17898q();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB().m39161k();
        }
    }

    public static final class q0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52114a;

        /* renamed from: b */
        public /* synthetic */ Object f52115b;

        /* renamed from: o.wi0$q0$a */
        public static final class C17899a implements ggd {

            /* renamed from: a */
            public final /* synthetic */ l1 f52116a;

            public C17899a(l1 l1Var) {
                this.f52116a = l1Var;
            }

            @Override // p001o.ggd
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Account account) {
                sq8.m48649h(account, "it");
                Boolean boolDC = this.f52116a.DC(account);
                sq8.m48648g(boolDC, "updateUnderlyingAccount(...)");
                return boolDC.booleanValue();
            }
        }

        public q0(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            q0 q0Var = new q0(n64Var);
            q0Var.f52115b = obj;
            return q0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((q0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f52114a;
            try {
            } catch (Exception e) {
                String message = e.getMessage();
                yne yneVarM58028a = message != null ? yne.f55736e.m58028a(null, message, e) : null;
                this.f52115b = null;
                this.f52114a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52115b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52115b = ogaVar2;
                this.f52114a = 1;
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
                    oga ogaVar3 = (oga) this.f52115b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f52115b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            l1 l1VarTB = uni.kC().TB();
            Object objM55727f = l1VarTB.ys(l1VarTB.on()).m55714J(new C17899a(l1VarTB)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((Account) objM55727f);
            this.f52115b = ogaVar;
            this.f52114a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$r */
    public static final class C17900r implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f52117a;

        public C17900r(String str) {
            this.f52117a = str;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            return l1Var.Eq(this.f52117a);
        }
    }

    public static final class r0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52118a;

        /* renamed from: b */
        public /* synthetic */ Object f52119b;

        /* renamed from: c */
        public final /* synthetic */ String f52120c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(String str, n64 n64Var) {
            super(2, n64Var);
            this.f52120c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            r0 r0Var = new r0(this.f52120c, n64Var);
            r0Var.f52119b = obj;
            return r0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((r0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f52118a;
            try {
            } catch (Exception e) {
                System.out.println((Object) ("requestPhonenumberChange " + e));
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58028a = c18447a.m58028a(null, message, e);
                this.f52119b = null;
                this.f52118a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52119b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52119b = ogaVar2;
                this.f52118a = 1;
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
                    oga ogaVar3 = (oga) this.f52119b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f52119b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            l1 l1VarM39161k = uni.kC().SB().m39161k();
            sq8.m48648g(l1VarM39161k, "getApiService(...)");
            Object objM55727f = l1VarM39161k.Xg(this.f52120c, l1VarM39161k.on(), l1VarM39161k.nB().getName()).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((VerifyEmailOutput) objM55727f);
            this.f52119b = ogaVar;
            this.f52118a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$s */
    public static final class C17901s implements rl7 {

        /* renamed from: a */
        public static final C17901s f52121a = new C17901s();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB().m39161k();
        }
    }

    public static final class s0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52122a;

        /* renamed from: b */
        public /* synthetic */ Object f52123b;

        /* renamed from: o.wi0$s0$a */
        public static final class C17902a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17902a f52124a = new C17902a();

            public C17902a() {
                super(1);
            }

            @Override // p001o.xk7
            public final String invoke(AccountMembership accountMembership) {
                return accountMembership.getAccountEmail();
            }
        }

        public s0(n64 n64Var) {
            super(2, n64Var);
        }

        /* renamed from: h */
        public static final String m54545h(xk7 xk7Var, Object obj) {
            return (String) xk7Var.invoke(obj);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            s0 s0Var = new s0(n64Var);
            s0Var.f52123b = obj;
            return s0Var;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((s0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            x6c x6cVarXt;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52122a;
            try {
            } catch (Exception e) {
                System.out.println((Object) ("requestVerifyAccountEmail " + e));
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f52123b = null;
                this.f52122a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52123b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52123b = ogaVar2;
                this.f52122a = 1;
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
                ogaVar = (oga) this.f52123b;
                wre.m54934b(obj);
            }
            mii miiVarSB = uni.kC().SB();
            l1 l1VarM39161k = miiVarSB.m39161k();
            sq8.m48648g(l1VarM39161k, "getApiService(...)");
            Optional optionalM39158h = miiVarSB.m39158h();
            final C17902a c17902a = C17902a.f52124a;
            String str = (String) optionalM39158h.map(new Function() { // from class: o.dj0
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return wi0.s0.m54545h(c17902a, obj2);
                }
            }).orElse(null);
            yne yneVarM58030d = yne.f55736e.m58030d((str == null || (x6cVarXt = l1VarM39161k.Xt(str, l1VarM39161k.on(), l1VarM39161k.nB().getName())) == null) ? null : (VerifyEmailOutput) x6cVarXt.m55728g());
            this.f52123b = ogaVar;
            this.f52122a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$t */
    public static final class C17903t implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f52125a;

        public C17903t(String str) {
            this.f52125a = str;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            return l1Var.Cc(this.f52125a);
        }
    }

    public static final class t0 extends jgg implements nl7 {

        /* renamed from: a */
        public boolean f52126a;

        /* renamed from: b */
        public int f52127b;

        /* renamed from: c */
        public /* synthetic */ Object f52128c;

        /* renamed from: d */
        public final /* synthetic */ List f52129d;

        /* renamed from: e */
        public final /* synthetic */ String f52130e;

        /* renamed from: f */
        public final /* synthetic */ boolean f52131f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(List list, String str, boolean z, n64 n64Var) {
            super(2, n64Var);
            this.f52129d = list;
            this.f52130e = str;
            this.f52131f = z;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            t0 t0Var = new t0(this.f52129d, this.f52130e, this.f52131f, n64Var);
            t0Var.f52128c = obj;
            return t0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((t0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(1:(3:7|39|40)(2:8|9))(7:10|43|11|(1:28)|29|39|40))(1:15))(2:16|(1:18))|41|19|(1:21)(1:22)|23|(1:25)(5:26|(0)|29|39|40)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
        
            r6 = r14;
            r14 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        
            r14 = "Error Occurred!";
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d2 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            boolean zBooleanValue;
            Object objM51918f = uq8.m51918f();
            int i = this.f52127b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52128c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52128c = ogaVar;
                this.f52127b = 1;
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
                    zBooleanValue = this.f52126a;
                    ogaVar2 = (oga) this.f52128c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("deleteLead " + (zBooleanValue)));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("deleteLead " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                        this.f52128c = null;
                        this.f52127b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52128c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            Object objM55727f = lw9.o1(this.f52129d, this.f52130e, this.f52131f).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            zBooleanValue = ((Boolean) objM55727f).booleanValue();
            yne yneVarM58030d = yne.f55736e.m58030d(ml1.m39301a(zBooleanValue));
            this.f52128c = ogaVar;
            this.f52126a = zBooleanValue;
            this.f52127b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            if (zBooleanValue) {
            }
            System.out.println((Object) ("deleteLead " + (zBooleanValue)));
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$u */
    public static final class C17904u implements rl7 {

        /* renamed from: a */
        public static final C17904u f52132a = new C17904u();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB().m39161k();
        }
    }

    public static final class u0 extends jgg implements nl7 {

        /* renamed from: a */
        public boolean f52133a;

        /* renamed from: b */
        public int f52134b;

        /* renamed from: c */
        public /* synthetic */ Object f52135c;

        /* renamed from: d */
        public final /* synthetic */ List f52136d;

        /* renamed from: e */
        public final /* synthetic */ boolean f52137e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(List list, boolean z, n64 n64Var) {
            super(2, n64Var);
            this.f52136d = list;
            this.f52137e = z;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            u0 u0Var = new u0(this.f52136d, this.f52137e, n64Var);
            u0Var.f52135c = obj;
            return u0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((u0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(1:(3:7|39|40)(2:8|9))(7:10|43|11|(1:28)|29|39|40))(1:15))(2:16|(1:18))|41|19|(1:21)(1:22)|23|(1:25)(5:26|(0)|29|39|40)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
        
            r6 = r14;
            r14 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        
            r14 = "Error Occurred!";
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d0 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            boolean zBooleanValue;
            Object objM51918f = uq8.m51918f();
            int i = this.f52134b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52135c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52135c = ogaVar;
                this.f52134b = 1;
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
                    zBooleanValue = this.f52133a;
                    ogaVar2 = (oga) this.f52135c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("deleteLead " + (zBooleanValue)));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("deleteLead " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                        this.f52135c = null;
                        this.f52134b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52135c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            Object objM55727f = lw9.p1(this.f52136d, this.f52137e).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            zBooleanValue = ((Boolean) objM55727f).booleanValue();
            yne yneVarM58030d = yne.f55736e.m58030d(ml1.m39301a(zBooleanValue));
            this.f52135c = ogaVar;
            this.f52133a = zBooleanValue;
            this.f52134b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            if (zBooleanValue) {
            }
            System.out.println((Object) ("deleteLead " + (zBooleanValue)));
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$v */
    public static final class C17905v implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f52138a;

        public C17905v(String str) {
            this.f52138a = str;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            return l1Var.ry(this.f52138a).h0();
        }
    }

    public static final class v0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52139a;

        /* renamed from: b */
        public /* synthetic */ Object f52140b;

        /* renamed from: c */
        public final /* synthetic */ EngagementSummary f52141c;

        /* renamed from: d */
        public final /* synthetic */ String f52142d;

        /* renamed from: e */
        public final /* synthetic */ boolean f52143e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(EngagementSummary engagementSummary, String str, boolean z, n64 n64Var) {
            super(2, n64Var);
            this.f52141c = engagementSummary;
            this.f52142d = str;
            this.f52143e = z;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            v0 v0Var = new v0(this.f52141c, this.f52142d, this.f52143e, n64Var);
            v0Var.f52140b = obj;
            return v0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((v0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:11:0x0023, B:20:0x004c, B:22:0x0063, B:23:0x006f, B:25:0x0073, B:27:0x007b, B:32:0x0085, B:34:0x009e, B:33:0x0092), top: B:45:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            EngagementSummary engagementSummary;
            yne yneVarM58030d;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52139a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f52140b = null;
                this.f52139a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52140b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52140b = ogaVar2;
                this.f52139a = 1;
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
                ogaVar = (oga) this.f52140b;
                wre.m54934b(obj);
            }
            this.f52141c.setEngagementType(this.f52142d);
            ArrayList arrayListM3231S = AbstractC0059a.m132a().m3231S();
            if (!arrayListM3231S.contains(this.f52141c)) {
                arrayListM3231S.add(this.f52141c);
                AbstractC0059a.m132a().v1(arrayListM3231S);
            }
            if (this.f52143e) {
                String id = this.f52141c.getId();
                if (id != null && !f9g.d0(id)) {
                    z = false;
                }
                if (z) {
                    engagementSummary = (EngagementSummary) jyg.a1(this.f52141c).m55729h();
                }
                arrayListM3231S.remove(this.f52141c);
                AbstractC0059a.m132a().v1(arrayListM3231S);
                yneVarM58030d = yne.f55736e.m58030d(engagementSummary);
                this.f52140b = ogaVar;
                this.f52139a = 2;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                }
            } else {
                engagementSummary = (EngagementSummary) jyg.e3(this.f52141c).m55729h();
                arrayListM3231S.remove(this.f52141c);
                AbstractC0059a.m132a().v1(arrayListM3231S);
                yneVarM58030d = yne.f55736e.m58030d(engagementSummary);
                this.f52140b = ogaVar;
                this.f52139a = 2;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$w */
    public static final class C17906w extends jgg implements nl7 {

        /* renamed from: a */
        public int f52144a;

        /* renamed from: b */
        public /* synthetic */ Object f52145b;

        /* renamed from: c */
        public final /* synthetic */ String f52146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17906w(String str, n64 n64Var) {
            super(2, n64Var);
            this.f52146c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17906w c17906w = new C17906w(this.f52146c, n64Var);
            c17906w.f52145b = obj;
            return c17906w;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17906w) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52144a;
            boolean z = true;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't load property definitions", e);
                this.f52145b = null;
                this.f52144a = 5;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52145b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52145b = ogaVar2;
                this.f52144a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3 || r1 == 4) {
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    if (r1 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f52145b;
                wre.m54934b(obj);
            }
            l1 l1VarTB = uni.kC().TB();
            sq8.m48648g(l1VarTB, "getActiveService(...)");
            Object objM55727f = l1VarTB.sC().i1().m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            Map map = (Map) objM55727f;
            String str = this.f52146c;
            if (str != null && !f9g.d0(str)) {
                z = false;
            }
            if (z) {
                yne yneVarM58030d = yne.f55736e.m58030d(kh3.Q0(map.values()));
                this.f52145b = ogaVar;
                this.f52144a = 2;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    return objM51918f;
                }
            } else if (map.containsKey(this.f52146c)) {
                yne yneVarM58030d2 = yne.f55736e.m58030d(Collections.singletonList(map.getOrDefault(this.f52146c, null)));
                this.f52145b = ogaVar;
                this.f52144a = 3;
                if (ogaVar.emit(yneVarM58030d2, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                yne yneVarM58028a2 = yne.f55736e.m58028a(null, "Couldn't load property definition for name " + this.f52146c, new RuntimeException("Property " + this.f52146c + " not found"));
                this.f52145b = ogaVar;
                this.f52144a = 4;
                if (ogaVar.emit(yneVarM58028a2, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    public static final class w0 extends jgg implements nl7 {

        /* renamed from: a */
        public Object f52147a;

        /* renamed from: b */
        public int f52148b;

        /* renamed from: c */
        public /* synthetic */ Object f52149c;

        /* renamed from: d */
        public final /* synthetic */ LeadsSummary f52150d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(LeadsSummary leadsSummary, n64 n64Var) {
            super(2, n64Var);
            this.f52150d = leadsSummary;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            w0 w0Var = new w0(this.f52150d, n64Var);
            w0Var.f52149c = obj;
            return w0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((w0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(3:7|33|34)(2:8|9))(6:10|35|11|23|33|34))(1:15))(2:16|(1:18))|37|19|(1:21)(4:22|23|33|34)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        
            r4 = r14;
            r14 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            oga ogaVar2;
            LeadsSummary leadsSummary;
            Object objM51918f = uq8.m51918f();
            int i = this.f52148b;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f52149c;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52149c = ogaVar;
                this.f52148b = 1;
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
                    leadsSummary = (LeadsSummary) this.f52147a;
                    ogaVar2 = (oga) this.f52149c;
                    try {
                        wre.m54934b(obj);
                        System.out.println((Object) ("updateLead " + leadsSummary));
                    } catch (Exception e) {
                        Exception e2 = e;
                        System.out.println((Object) ("updateLead " + e2));
                        yne.C18447a c18447a = yne.f55736e;
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error Occurred!";
                        }
                        yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                        this.f52149c = null;
                        this.f52147a = null;
                        this.f52148b = 3;
                        if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f52149c;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            leadsSummary = (LeadsSummary) lw9.t1(this.f52150d).m55727f();
            yne yneVarM58030d = yne.f55736e.m58030d(leadsSummary);
            this.f52149c = ogaVar;
            this.f52147a = leadsSummary;
            this.f52148b = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            ogaVar2 = ogaVar;
            System.out.println((Object) ("updateLead " + leadsSummary));
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$x */
    public static final class C17907x implements rl7 {

        /* renamed from: a */
        public static final C17907x f52151a = new C17907x();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(Map map) {
            sq8.m48649h(map, "it");
            PropertyDefinition propertyDefinition = (PropertyDefinition) map.getOrDefault("dealStage", null);
            ArrayList arrayListM21242g = propertyDefinition != null ? ch3.m21242g(propertyDefinition) : null;
            return arrayListM21242g == null ? ch3.m21246k() : arrayListM21242g;
        }
    }

    public static final class x0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52152a;

        /* renamed from: b */
        public /* synthetic */ Object f52153b;

        /* renamed from: c */
        public final /* synthetic */ Uri f52154c;

        /* renamed from: d */
        public final /* synthetic */ Context f52155d;

        /* renamed from: e */
        public final /* synthetic */ String f52156e;

        /* renamed from: f */
        public final /* synthetic */ String f52157f;

        /* renamed from: g */
        public final /* synthetic */ String f52158g;

        /* renamed from: o.wi0$x0$a */
        public static final class C17908a implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ String f52159a;

            public C17908a(String str) {
                this.f52159a = str;
            }

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x8c apply(UploadedFileSummary uploadedFileSummary) {
                sq8.m48649h(uploadedFileSummary, "it");
                return fz6.m27786D(this.f52159a, null, ch3.m21242g(FileData.toFileObjectRelationshipSummary$default(uploadedFileSummary.toFileData(), null, 1, null)));
            }
        }

        /* renamed from: o.wi0$x0$b */
        public static final class C17909b implements rl7 {

            /* renamed from: a */
            public static final C17909b f52160a = new C17909b();

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List apply(List list) {
                sq8.m48649h(list, "fileObjectRelationshipIds");
                ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FileObjectRelationshipSummary) it.next()).getId());
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(Uri uri, Context context, String str, String str2, String str3, n64 n64Var) {
            super(2, n64Var);
            this.f52154c = uri;
            this.f52155d = context;
            this.f52156e = str;
            this.f52157f = str2;
            this.f52158g = str3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            x0 x0Var = new x0(this.f52154c, this.f52155d, this.f52156e, this.f52157f, this.f52158g, n64Var);
            x0Var.f52153b = obj;
            return x0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((x0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Context context;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52152a;
            try {
            } catch (Exception e) {
                r1.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("Save document failed ");
                sb.append(e);
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f52153b = null;
                this.f52152a = 4;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52153b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52153b = ogaVar2;
                this.f52152a = 1;
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
                ogaVar = (oga) this.f52153b;
                wre.m54934b(obj);
            }
            Uri uri = this.f52154c;
            if (uri == null || (context = this.f52155d) == null) {
                yne yneVarM58027b2 = yne.C18447a.m58027b(yne.f55736e, new ArrayList(), "No file or context specified", null, 4, null);
                this.f52153b = ogaVar;
                this.f52152a = 2;
                if (ogaVar.emit(yneVarM58027b2, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                ContentResolver contentResolver = context.getContentResolver();
                sq8.m48646e(contentResolver);
                String strK0 = jm7.k0(contentResolver, uri);
                if (strK0 == null) {
                    strK0 = uz6.f49700a.m52177a();
                }
                Object objM55727f = gq9.m29278C(this.f52155d, uri, strK0, uz6.f49700a.m52179c(this.f52155d, this.f52154c), this.f52156e, this.f52157f).m55717M(new C17908a(this.f52158g)).d0(C17909b.f52160a).m55727f();
                sq8.m48648g(objM55727f, "blockingFirst(...)");
                yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
                this.f52153b = ogaVar;
                this.f52152a = 3;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$y */
    public static final class C17910y implements rl7 {

        /* renamed from: a */
        public static final C17910y f52161a = new C17910y();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List list) {
            sq8.m48649h(list, "it");
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(wi0.m54485y((PropertyDefinition) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hh3.m30441A(arrayList2, (List) it2.next());
            }
            return arrayList2;
        }
    }

    public static final class y0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52162a;

        /* renamed from: b */
        public /* synthetic */ Object f52163b;

        /* renamed from: c */
        public final /* synthetic */ Context f52164c;

        /* renamed from: d */
        public final /* synthetic */ Uri f52165d;

        /* renamed from: e */
        public final /* synthetic */ String f52166e;

        /* renamed from: f */
        public final /* synthetic */ String f52167f;

        /* renamed from: g */
        public final /* synthetic */ String f52168g;

        /* renamed from: h */
        public final /* synthetic */ String f52169h;

        /* renamed from: q */
        public final /* synthetic */ String f52170q;

        /* renamed from: s */
        public final /* synthetic */ String f52171s;

        /* renamed from: x */
        public final /* synthetic */ String f52172x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(Context context, Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, n64 n64Var) {
            super(2, n64Var);
            this.f52164c = context;
            this.f52165d = uri;
            this.f52166e = str;
            this.f52167f = str2;
            this.f52168g = str3;
            this.f52169h = str4;
            this.f52170q = str5;
            this.f52171s = str6;
            this.f52172x = str7;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            y0 y0Var = new y0(this.f52164c, this.f52165d, this.f52166e, this.f52167f, this.f52168g, this.f52169h, this.f52170q, this.f52171s, this.f52172x, n64Var);
            y0Var.f52163b = obj;
            return y0Var;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
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
            ?? r1 = this.f52162a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f52163b = null;
                this.f52162a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52163b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52163b = ogaVar2;
                this.f52162a = 1;
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
                    oga ogaVar3 = (oga) this.f52163b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f52163b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = gq9.m29279D(this.f52164c, this.f52165d, this.f52166e, this.f52167f, this.f52168g, this.f52169h, this.f52170q, this.f52171s, this.f52172x).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((UploadedFileSummary) objM55727f);
            this.f52163b = ogaVar;
            this.f52162a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wi0$z */
    public static final class C17911z implements rl7 {

        /* renamed from: a */
        public static final C17911z f52173a = new C17911z();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(Map map) {
            sq8.m48649h(map, "it");
            PropertyDefinition propertyDefinition = (PropertyDefinition) map.getOrDefault("dealStage", null);
            ArrayList arrayListM21242g = propertyDefinition != null ? ch3.m21242g(propertyDefinition) : null;
            return arrayListM21242g == null ? ch3.m21246k() : arrayListM21242g;
        }
    }

    public static final class z0 extends jgg implements nl7 {

        /* renamed from: a */
        public int f52174a;

        /* renamed from: b */
        public /* synthetic */ Object f52175b;

        /* renamed from: c */
        public final /* synthetic */ String f52176c;

        /* renamed from: o.wi0$z0$a */
        public static final class C17912a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C17912a f52177a = new C17912a();

            public C17912a() {
                super(1);
            }

            @Override // p001o.xk7
            public final String invoke(AccountMembership accountMembership) {
                return accountMembership.getAccountEmail();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(String str, n64 n64Var) {
            super(2, n64Var);
            this.f52176c = str;
        }

        /* renamed from: h */
        public static final String m54563h(xk7 xk7Var, Object obj) {
            return (String) xk7Var.invoke(obj);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            z0 z0Var = new z0(this.f52176c, n64Var);
            z0Var.f52175b = obj;
            return z0Var;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((z0) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f52174a;
            try {
            } catch (Exception e) {
                System.out.println((Object) ("requestVerifyAccountEmail " + e));
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f52175b = null;
                this.f52174a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f52175b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f52175b = ogaVar2;
                this.f52174a = 1;
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
                ogaVar = (oga) this.f52175b;
                wre.m54934b(obj);
            }
            mii miiVarSB = uni.kC().SB();
            l1 l1VarM39161k = miiVarSB.m39161k();
            sq8.m48648g(l1VarM39161k, "getApiService(...)");
            Optional optionalM39158h = miiVarSB.m39158h();
            final C17912a c17912a = C17912a.f52177a;
            String str = (String) optionalM39158h.map(new Function() { // from class: o.ej0
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return wi0.z0.m54563h(c17912a, obj2);
                }
            }).orElse(null);
            if (str != null) {
                x6c x6cVarW1 = l1VarM39161k.W1(l1VarM39161k.on(), str, this.f52176c);
                VerifyEmailOutput verifyEmailOutput = x6cVarW1 != null ? (VerifyEmailOutput) x6cVarW1.m55728g() : null;
                yne yneVarM58030d = yne.f55736e.m58030d(verifyEmailOutput);
                this.f52175b = ogaVar;
                this.f52174a = 2;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: A */
    public static final List m54435A(PropertyDefinition propertyDefinition) {
        sq8.m48649h(propertyDefinition, "docTypePropertyDefinition");
        Stream<PropertyOptions> stream = propertyDefinition.getPossibleValues().stream();
        final C17886l c17886l = C17886l.f52089a;
        Object objCollect = stream.map(new Function() { // from class: o.vi0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wi0.m54436B(c17886l, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public static final boolean A0() {
        try {
            Boolean boolP0 = lpi.P0();
            sq8.m48648g(boolP0, "shouldHideLeadSource(...)");
            return boolP0.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: B */
    public static final DocTypeDefinition m54436B(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (DocTypeDefinition) xk7Var.invoke(obj);
    }

    public static final AbstractC2145n B0(List list, String str, boolean z) {
        sq8.m48649h(list, "leadIds");
        sq8.m48649h(str, "closeReason");
        return e84.m24521b(eu5.m25611b(), 0L, new t0(list, str, z, null), 2, null);
    }

    /* renamed from: C */
    public static final List m54437C(PropertyDefinition propertyDefinition) {
        sq8.m48649h(propertyDefinition, "leadTagPropertyDefinition");
        Stream<PropertyOptions> stream = propertyDefinition.getPossibleValues().stream();
        final C17887m c17887m = C17887m.f52091a;
        Object objCollect = stream.map(new Function() { // from class: o.ui0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wi0.m54438D(c17887m, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public static final AbstractC2145n C0(List list, boolean z) {
        sq8.m48649h(list, "leadIds");
        return e84.m24521b(eu5.m25611b(), 0L, new u0(list, z, null), 2, null);
    }

    /* renamed from: D */
    public static final LeadTag m54438D(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadTag) xk7Var.invoke(obj);
    }

    public static final AbstractC2145n D0(EngagementSummary engagementSummary, String str, boolean z) {
        sq8.m48649h(engagementSummary, "engagementSummary");
        sq8.m48649h(str, "engagementType");
        return e84.m24521b(eu5.m25611b(), 0L, new v0(engagementSummary, str, z, null), 2, null);
    }

    /* renamed from: E */
    public static final List m54439E(PropertyDefinition propertyDefinition) {
        sq8.m48649h(propertyDefinition, "taskTypePropertyDefinition");
        Stream<PropertyOptions> stream = propertyDefinition.getPossibleValues().stream();
        final C17888n c17888n = C17888n.f52093a;
        Object objCollect = stream.map(new Function() { // from class: o.si0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wi0.m54440F(c17888n, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public static /* synthetic */ AbstractC2145n E0(EngagementSummary engagementSummary, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return D0(engagementSummary, str, z);
    }

    /* renamed from: F */
    public static final TaskTypeDefinition m54440F(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (TaskTypeDefinition) xk7Var.invoke(obj);
    }

    public static final AbstractC2145n F0(LeadsSummary leadsSummary) {
        sq8.m48649h(leadsSummary, "leadsSummary");
        return e84.m24521b(eu5.m25611b(), 0L, new w0(leadsSummary, null), 2, null);
    }

    /* renamed from: G */
    public static final List m54441G(PropertyDefinition propertyDefinition) {
        sq8.m48649h(propertyDefinition, "visitOutcomePropertyDefinition");
        Stream<PropertyOptions> stream = propertyDefinition.getPossibleValues().stream();
        final C17889o c17889o = C17889o.f52095a;
        Object objCollect = stream.map(new Function() { // from class: o.ri0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wi0.m54442H(c17889o, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public static final AbstractC2145n G0(String str, Context context, Uri uri, String str2, String str3) {
        sq8.m48649h(str, "leadId");
        sq8.m48649h(context, "context");
        return e84.m24521b(eu5.m25611b(), 0L, new x0(uri, context, str2, str3, str, null), 2, null);
    }

    /* renamed from: H */
    public static final VisitOutcome m54442H(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (VisitOutcome) xk7Var.invoke(obj);
    }

    public static final AbstractC2145n H0(Context context, Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        sq8.m48649h(context, "context");
        sq8.m48649h(uri, "uri");
        sq8.m48649h(str, "fileName");
        sq8.m48649h(str2, "contentType");
        return e84.m24521b(eu5.m25611b(), 0L, new y0(context, uri, str, str2, str3, str4, str5, str6, str7, null), 2, null);
    }

    /* renamed from: I */
    public static final AutoCallConfig m54443I() {
        return AutoCallConfig.Companion.instance();
    }

    /* renamed from: J */
    public static final mii m54444J() {
        try {
            return uni.kC().SB();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final AbstractC2145n J0(String str) {
        sq8.m48649h(str, "code");
        return e84.m24521b(eu5.m25611b(), 0L, new z0(str, null), 2, null);
    }

    /* renamed from: K */
    public static final AuthorizationLevel m54445K() {
        mii miiVarM54444J = m54444J();
        if (miiVarM54444J != null) {
            return miiVarM54444J.m39162l();
        }
        return null;
    }

    public static final AbstractC2145n K0(String str, String str2) {
        sq8.m48649h(str, "phonenumber");
        sq8.m48649h(str2, "code");
        return e84.m24521b(eu5.m25611b(), 0L, new a1(str, str2, null), 2, null);
    }

    /* renamed from: L */
    public static final List m54446L() {
        try {
            List listED = uni.kC().ED();
            sq8.m48648g(listED, "listProfiles(...)");
            return listED;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: M */
    public static final AbstractC2145n m54447M() {
        try {
            return uni.kC().FD();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: N */
    public static final List m54448N(String str) {
        sq8.m48649h(str, "searchText");
        List listM37620U = lpi.m37620U(str);
        sq8.m48648g(listM37620U, "getAllUsers(...)");
        return listM37620U;
    }

    /* renamed from: O */
    public static /* synthetic */ List m54449O(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return m54448N(str);
    }

    /* renamed from: P */
    public static final List m54450P() {
        AuthorizationLevel authorizationLevelM39162l;
        mii miiVarM54444J = m54444J();
        List listM54451Q = (miiVarM54444J == null || (authorizationLevelM39162l = miiVarM54444J.m39162l()) == null) ? null : (AuthorizationLevel.SUPERADMIN == authorizationLevelM39162l || AuthorizationLevel.ADMIN == authorizationLevelM39162l) ? m54451Q() : m54453S();
        return listM54451Q == null ? ch3.m21246k() : listM54451Q;
    }

    /* renamed from: Q */
    public static final List m54451Q() {
        List listM37615P = lpi.m37615P();
        sq8.m48648g(listM37615P, "getAllTeams(...)");
        return listM37615P;
    }

    /* renamed from: R */
    public static final List m54452R(String str) {
        sq8.m48649h(str, "searchText");
        List listM37616Q = lpi.m37616Q(str);
        sq8.m48648g(listM37616Q, "getAllTeams(...)");
        return listM37616Q;
    }

    /* renamed from: S */
    public static final List m54453S() {
        List listM37623X = lpi.m37623X();
        sq8.m48648g(listM37623X, "getTeamAsLead(...)");
        return listM37623X;
    }

    /* renamed from: T */
    public static final List m54454T() {
        List listM37624Y = lpi.m37624Y();
        sq8.m48648g(listM37624Y, "getTeamAsReportee(...)");
        return listM37624Y;
    }

    /* renamed from: U */
    public static final List m54455U() {
        List listM37617R = lpi.m37617R();
        sq8.m48648g(listM37617R, "getAllTeamsMemberOf(...)");
        return listM37617R;
    }

    /* renamed from: V */
    public static final AbstractC2145n m54456V(String str, List list, String str2) {
        sq8.m48649h(str, "templateType");
        sq8.m48649h(list, "eligibleCallOutcomeTplIds");
        sq8.m48649h(str2, "searchTerm");
        return e84.m24521b(eu5.m25611b(), 0L, new C17896p(str, list, str2, null), 2, null);
    }

    /* renamed from: W */
    public static /* synthetic */ AbstractC2145n m54457W(String str, List list, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = ch3.m21246k();
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return m54456V(str, list, str2);
    }

    /* renamed from: X */
    public static final u91 m54458X() {
        try {
            return uni.UB();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Y */
    public static final x6c m54459Y(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        x6c x6cVarM55717M = uni.LB().d0(C17898q.f52113a).m55717M(new C17900r(str));
        sq8.m48648g(x6cVarM55717M, "flatMap(...)");
        return x6cVarM55717M;
    }

    /* renamed from: Z */
    public static final x6c m54460Z(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        x6c x6cVarM55717M = uni.LB().d0(C17901s.f52121a).m55717M(new C17903t(str));
        sq8.m48648g(x6cVarM55717M, "flatMap(...)");
        return x6cVarM55717M;
    }

    public static final x6c a0(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        x6c x6cVarM55717M = uni.LB().d0(C17904u.f52132a).m55717M(new C17905v(str));
        sq8.m48648g(x6cVarM55717M, "flatMap(...)");
        return x6cVarM55717M;
    }

    public static final AbstractC2145n b0(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C17906w(str, null), 2, null);
    }

    public static /* synthetic */ AbstractC2145n c0(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return b0(str);
    }

    public static final x6c d0() {
        l1 l1VarTB = uni.kC().TB();
        sq8.m48648g(l1VarTB, "getActiveService(...)");
        x6c x6cVarD0 = l1VarTB.sC().i1().d0(C17907x.f52151a).d0(C17910y.f52161a);
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    public static final x6c e0() {
        l1 l1VarTB = uni.kC().TB();
        sq8.m48648g(l1VarTB, "getActiveService(...)");
        x6c x6cVarD0 = l1VarTB.sC().i1().d0(C17911z.f52173a).d0(a0.f52021a).d0(b0.f52031a);
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    public static final x6c f0(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        x6c x6cVarM55717M = uni.LB().d0(c0.f52037a).m55717M(new d0(str));
        sq8.m48648g(x6cVarM55717M, "flatMap(...)");
        return x6cVarM55717M;
    }

    public static final AbstractC2145n g0(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new e0(str, null), 2, null);
    }

    /* renamed from: h */
    public static final AbstractC2145n m54468h(EngagementSummary engagementSummary, String str, EngagementSummary engagementSummary2) {
        sq8.m48649h(engagementSummary, "engagementSummary");
        sq8.m48649h(str, "engagementType");
        return e84.m24521b(eu5.m25611b(), 0L, new C17871a(engagementSummary, str, engagementSummary2, null), 2, null);
    }

    public static final AbstractC2145n h0(String str, String str2) {
        sq8.m48649h(str, "parentObjectType");
        sq8.m48649h(str2, "propertyName");
        return e84.m24521b(eu5.m25611b(), 0L, new f0(str, str2, null), 2, null);
    }

    /* renamed from: i */
    public static /* synthetic */ AbstractC2145n m54469i(EngagementSummary engagementSummary, String str, EngagementSummary engagementSummary2, int i, Object obj) {
        if ((i & 4) != 0) {
            engagementSummary2 = null;
        }
        return m54468h(engagementSummary, str, engagementSummary2);
    }

    public static final AbstractC2145n i0() {
        return e84.m24521b(eu5.m25611b(), 0L, new g0(null), 2, null);
    }

    /* renamed from: j */
    public static final AbstractC2145n m54470j(ArrayList arrayList, AssignmentOutcome assignmentOutcome) {
        sq8.m48649h(arrayList, "selectedLeadsList");
        sq8.m48649h(assignmentOutcome, "assignmentOutcome");
        return e84.m24521b(eu5.m25611b(), 0L, new C17872b(arrayList, assignmentOutcome, null), 2, null);
    }

    public static final x6c j0(String str) {
        sq8.m48649h(str, "propertyName");
        l1 l1VarTB = uni.kC().TB();
        sq8.m48648g(l1VarTB, "getActiveService(...)");
        x6c x6cVarD0 = l1VarTB.sC().j1().d0(new h0(str, l1VarTB)).d0(i0.f52076a);
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    /* renamed from: k */
    public static final AbstractC2145n m54471k(List list, AssignmentOutcome assignmentOutcome) {
        sq8.m48649h(list, "selectedTasksList");
        sq8.m48649h(assignmentOutcome, "assignmentOutcome");
        return e84.m24521b(eu5.m25611b(), 0L, new C17873c(list, assignmentOutcome, null), 2, null);
    }

    public static final AbstractC2145n k0(String str) {
        sq8.m48649h(str, "userId");
        return e84.m24521b(eu5.m25611b(), 0L, new j0(str, null), 2, null);
    }

    /* renamed from: l */
    public static final boolean m54472l() {
        try {
            Boolean boolIB = uni.kC().SB().m39161k().iB();
            sq8.m48648g(boolIB, "canAssignLead(...)");
            return boolIB.booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public static final List l0(boolean z, boolean z2) {
        List listM38957c = mfh.m38955b().m38957c(z, z2);
        sq8.m48648g(listM38957c, "getSelectableTemplateTypes(...)");
        return listM38957c;
    }

    /* renamed from: m */
    public static final boolean m54473m() {
        try {
            Boolean boolM37612M = lpi.m37612M();
            sq8.m48648g(boolM37612M, "canDeleteLead(...)");
            return boolM37612M.booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public static /* synthetic */ List m0(boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return l0(z, z2);
    }

    /* renamed from: n */
    public static final boolean m54474n() {
        try {
            Boolean boolAC = uni.kC().SB().m39161k().AC();
            sq8.m48648g(boolAC, "shouldSaveWhatsAppOpenAsCallLog(...)");
            return boolAC.booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public static final LeadsTeam n0(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return (LeadsTeam) lpi.m37625Z(str).orElse(null);
    }

    /* renamed from: o */
    public static final boolean m54475o() {
        try {
            Boolean boolKB = uni.kC().SB().m39161k().kB();
            sq8.m48648g(boolKB, "canNotViewUserDirectory(...)");
            return boolKB.booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public static final List o0() {
        return TemplateTag.Companion.allTemplateTags();
    }

    /* renamed from: p */
    public static final AbstractC2145n m54476p(List list, String str) {
        sq8.m48649h(list, "leadIds");
        return e84.m24521b(eu5.m25611b(), 0L, new C17874d(list, str, null), 2, null);
    }

    public static final AbstractC2145n p0(String str, String str2, String str3) {
        sq8.m48649h(str, "leadId");
        return e84.m24521b(eu5.m25611b(), 0L, new k0(str, str2, str3, null), 2, null);
    }

    /* renamed from: q */
    public static final AbstractC2145n m54477q(LeadsSummary leadsSummary) {
        sq8.m48649h(leadsSummary, "leadsSummary");
        return e84.m24521b(eu5.m25611b(), 0L, new C17875e(leadsSummary, null), 2, null);
    }

    public static final x6c q0(u03 u03Var) {
        x6c x6cVarC0 = u03Var != null ? x6c.c0(u03Var) : null;
        if (x6cVarC0 == null) {
            x6cVarC0 = uni.LB().d0(m0.f52092a).d0(n0.f52094a);
            sq8.m48648g(x6cVarC0, "map(...)");
        }
        x6c x6cVarM55717M = x6cVarC0.m55717M(l0.f52090a);
        sq8.m48648g(x6cVarM55717M, "flatMap(...)");
        return x6cVarM55717M;
    }

    /* renamed from: r */
    public static final AbstractC2145n m54478r(LeadsSummary leadsSummary, Context context, String str) {
        sq8.m48649h(leadsSummary, "leadsSummary");
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "photoUri");
        return e84.m24521b(eu5.m25611b(), 0L, new C17876f(str, context, leadsSummary, null), 2, null);
    }

    public static /* synthetic */ x6c r0(u03 u03Var, int i, Object obj) {
        if ((i & 1) != 0) {
            u03Var = null;
        }
        return q0(u03Var);
    }

    /* renamed from: s */
    public static final AbstractC2145n m54479s(List list) {
        sq8.m48649h(list, "contactNumberIds");
        return e84.m24521b(eu5.m25611b(), 0L, new C17877g(list, null), 2, null);
    }

    public static final x6c s0(String str) {
        sq8.m48649h(str, "taskType");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        x6c x6cVarD0 = d0().d0(new o0(lowerCase));
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    /* renamed from: t */
    public static final AbstractC2145n m54480t(String str) {
        sq8.m48649h(str, "engagementId");
        return e84.m24521b(eu5.m25611b(), 0L, new C17880h(str, null), 2, null);
    }

    public static final AbstractC2145n t0(PaginatedDataModel paginatedDataModel) {
        return e84.m24521b(null, 0L, new p0(paginatedDataModel, null), 3, null);
    }

    /* renamed from: u */
    public static final List m54481u(PropertyDefinition propertyDefinition) {
        sq8.m48649h(propertyDefinition, "callOutcomePropertyDefinition");
        Stream<PropertyOptions> stream = propertyDefinition.getPossibleValues().stream();
        final C17881i c17881i = C17881i.f52075a;
        Object objCollect = stream.map(new Function() { // from class: o.qi0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wi0.m54482v(c17881i, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public static final boolean u0() {
        try {
            Boolean boolN0 = lpi.N0();
            sq8.m48648g(boolN0, "onlyCamera(...)");
            return boolN0.booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: v */
    public static final CallOutcome m54482v(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (CallOutcome) xk7Var.invoke(obj);
    }

    public static final AbstractC2145n v0() {
        return e84.m24521b(eu5.m25611b(), 0L, new q0(null), 2, null);
    }

    /* renamed from: w */
    public static final List m54483w(PropertyDefinition propertyDefinition) {
        sq8.m48649h(propertyDefinition, "chatLabelPropertyDefinition");
        Stream<PropertyOptions> stream = propertyDefinition.getPossibleValues().stream();
        final C17884j c17884j = C17884j.f52079a;
        Object objCollect = stream.map(new Function() { // from class: o.ti0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wi0.m54484x(c17884j, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public static final AbstractC2145n w0(String str) {
        sq8.m48649h(str, "phonenumber");
        return e84.m24521b(eu5.m25611b(), 0L, new r0(str, null), 2, null);
    }

    /* renamed from: x */
    public static final ChatLabel m54484x(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (ChatLabel) xk7Var.invoke(obj);
    }

    public static final AbstractC2145n x0() {
        return e84.m24521b(eu5.m25611b(), 0L, new s0(null), 2, null);
    }

    /* renamed from: y */
    public static final List m54485y(PropertyDefinition propertyDefinition) {
        sq8.m48649h(propertyDefinition, "dealStagePropertyDefinition");
        Stream<PropertyOptions> stream = propertyDefinition.getPossibleValues().stream();
        final C17885k c17885k = C17885k.f52083a;
        Object objCollect = stream.map(new Function() { // from class: o.pi0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wi0.m54486z(c17885k, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public static final void y0() {
        AutoCallConfig.Companion.resetInstance();
    }

    /* renamed from: z */
    public static final DealStageDefinition m54486z(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (DealStageDefinition) xk7Var.invoke(obj);
    }

    public static final boolean z0() {
        try {
            Boolean boolXC = uni.kC().SB().m39161k().xC();
            sq8.m48648g(boolXC, "shouldDisableTrackAllCall(...)");
            return boolXC.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
