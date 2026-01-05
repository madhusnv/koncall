package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.PaymentDataInfo;
import ai.salesmax.model.PaymentDataSummary;
import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import p001o.y2d;

/* loaded from: classes.dex */
public final class y2d extends zf0 {

    /* renamed from: o.y2d$a */
    public static final class C18304a extends jgg implements nl7 {

        /* renamed from: a */
        public int f54770a;

        /* renamed from: b */
        public /* synthetic */ Object f54771b;

        /* renamed from: c */
        public final /* synthetic */ PaymentDataInfo f54772c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18304a(PaymentDataInfo paymentDataInfo, n64 n64Var) {
            super(2, n64Var);
            this.f54772c = paymentDataInfo;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C18304a c18304a = new C18304a(this.f54772c, n64Var);
            c18304a.f54771b = obj;
            return c18304a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C18304a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f54770a;
            try {
            } catch (Exception e) {
                r1.getClass();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't save payment data ");
                sb.append(message);
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save payment data " + e.getMessage(), e);
                this.f54771b = null;
                this.f54770a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f54771b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f54771b = ogaVar2;
                this.f54770a = 1;
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
                    oga ogaVar3 = (oga) this.f54771b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f54771b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = x2d.m55599f(this.f54772c.toPaymentDataSummary()).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaymentDataSummary) objM55727f);
            this.f54771b = ogaVar;
            this.f54770a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.y2d$b */
    public static final class C18305b extends jgg implements nl7 {

        /* renamed from: a */
        public int f54773a;

        /* renamed from: b */
        public /* synthetic */ Object f54774b;

        /* renamed from: c */
        public final /* synthetic */ List f54775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18305b(List list, n64 n64Var) {
            super(2, n64Var);
            this.f54775c = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C18305b c18305b = new C18305b(this.f54775c, n64Var);
            c18305b.f54774b = obj;
            return c18305b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C18305b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f54773a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't request payment provider linkage " + e.getMessage(), e);
                this.f54774b = null;
                this.f54773a = 4;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f54774b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f54774b = ogaVar2;
                this.f54773a = 1;
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
                ogaVar = (oga) this.f54774b;
                wre.m54934b(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f54775c.iterator();
            while (it.hasNext()) {
                Object objM55727f = uw9.m52081j((String) it.next()).m55727f();
                sq8.m48648g(objM55727f, "blockingFirst(...)");
                List list = (List) objM55727f;
                if (!list.isEmpty()) {
                    arrayList.addAll(list);
                }
            }
            if (true ^ arrayList.isEmpty()) {
                yne yneVarM58030d = yne.f55736e.m58030d(arrayList);
                this.f54774b = ogaVar;
                this.f54773a = 2;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                yne yneVarM58030d2 = yne.f55736e.m58030d(ch3.m21246k());
                this.f54774b = ogaVar;
                this.f54773a = 3;
                if (ogaVar.emit(yneVarM58030d2, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.y2d$c */
    public static final class C18306c extends jgg implements nl7 {

        /* renamed from: a */
        public int f54776a;

        /* renamed from: b */
        public /* synthetic */ Object f54777b;

        /* renamed from: c */
        public final /* synthetic */ PaymentDataInfo f54778c;

        /* renamed from: d */
        public final /* synthetic */ String f54779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18306c(PaymentDataInfo paymentDataInfo, String str, n64 n64Var) {
            super(2, n64Var);
            this.f54778c = paymentDataInfo;
            this.f54779d = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C18306c c18306c = new C18306c(this.f54778c, this.f54779d, n64Var);
            c18306c.f54777b = obj;
            return c18306c;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C18306c) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f54776a;
            try {
            } catch (Exception e) {
                r1.getClass();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't save payment data ");
                sb.append(message);
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save payment data " + e.getMessage(), e);
                this.f54777b = null;
                this.f54776a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f54777b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f54777b = ogaVar2;
                this.f54776a = 1;
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
                    oga ogaVar3 = (oga) this.f54777b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f54777b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = x2d.m55604k(this.f54778c.toPaymentDataSummary(), this.f54779d).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaymentDataSummary) objM55727f);
            this.f54777b = ogaVar;
            this.f54776a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.y2d$d */
    public static final class C18307d extends jgg implements nl7 {

        /* renamed from: a */
        public int f54780a;

        /* renamed from: b */
        public /* synthetic */ Object f54781b;

        /* renamed from: c */
        public final /* synthetic */ String f54782c;

        /* renamed from: d */
        public final /* synthetic */ y2d f54783d;

        /* renamed from: e */
        public final /* synthetic */ String f54784e;

        /* renamed from: f */
        public final /* synthetic */ String f54785f;

        /* renamed from: g */
        public final /* synthetic */ int f54786g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18307d(String str, y2d y2dVar, String str2, String str3, int i, n64 n64Var) {
            super(2, n64Var);
            this.f54782c = str;
            this.f54783d = y2dVar;
            this.f54784e = str2;
            this.f54785f = str3;
            this.f54786g = i;
        }

        /* renamed from: h */
        public static final PaymentDataInfo m57153h(PaymentDataSummary paymentDataSummary) {
            return paymentDataSummary.toPaymentDataInfo();
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C18307d c18307d = new C18307d(this.f54782c, this.f54783d, this.f54784e, this.f54785f, this.f54786g, n64Var);
            c18307d.f54781b = obj;
            return c18307d;
        }

        @Override // p001o.nl7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C18307d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f54780a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't search payment data " + e.getMessage(), e);
                this.f54781b = null;
                this.f54780a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f54781b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f54781b = ogaVar2;
                this.f54780a = 1;
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
                ogaVar = (oga) this.f54781b;
                wre.m54934b(obj);
            }
            String strM57143g = this.f54782c;
            if (strM57143g == null) {
                strM57143g = this.f54783d.m57143g(this.f54784e);
            }
            PaginatedTokenResults map = ((PaginatedTokenResults) x2d.m55605l(Optional.ofNullable(this.f54785f), Optional.ofNullable(strM57143g), this.f54786g).m47698c()).map(new Function() { // from class: o.z2d
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return y2d.C18307d.m57153h((PaymentDataSummary) obj2);
                }
            });
            sq8.m48648g(map, "map(...)");
            map.loadInitial();
            yne yneVarM58030d = yne.f55736e.m58030d(new PaginatedDataModel("All Payments", map));
            this.f54781b = ogaVar;
            this.f54780a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.y2d$e */
    public static final class C18308e extends jgg implements nl7 {

        /* renamed from: a */
        public int f54787a;

        /* renamed from: b */
        public /* synthetic */ Object f54788b;

        /* renamed from: c */
        public final /* synthetic */ PaymentDataInfo f54789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18308e(PaymentDataInfo paymentDataInfo, n64 n64Var) {
            super(2, n64Var);
            this.f54789c = paymentDataInfo;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C18308e c18308e = new C18308e(this.f54789c, n64Var);
            c18308e.f54788b = obj;
            return c18308e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C18308e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f54787a;
            try {
            } catch (Exception e) {
                r1.getClass();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't save payment data ");
                sb.append(message);
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save payment data " + e.getMessage(), e);
                this.f54788b = null;
                this.f54787a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f54788b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f54788b = ogaVar2;
                this.f54787a = 1;
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
                    oga ogaVar3 = (oga) this.f54788b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f54788b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = x2d.m55604k(this.f54789c.toPaymentDataSummary(), null).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((PaymentDataSummary) objM55727f);
            this.f54788b = ogaVar;
            this.f54787a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2d(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: j */
    public static /* synthetic */ AbstractC2145n m57141j(y2d y2dVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ch3.m21249n("RAZORPAY", "CASHFREE");
        }
        return y2dVar.m57145i(list);
    }

    /* renamed from: m */
    public static /* synthetic */ AbstractC2145n m57142m(y2d y2dVar, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 10;
        }
        return y2dVar.m57147l(str, str2, str3, i);
    }

    /* renamed from: g */
    public final String m57143g(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case 3433164:
                str2 = "paid";
                if (!lowerCase.equals("paid")) {
                    return str;
                }
                break;
            case 476588369:
                str2 = "cancelled";
                if (!lowerCase.equals("cancelled")) {
                    return str;
                }
                break;
            case 693933934:
                return !lowerCase.equals("requested") ? str : "created";
            case 1779001566:
                return !lowerCase.equals("partially paid") ? str : "partial_paid";
            default:
                return str;
        }
        return str2;
    }

    /* renamed from: h */
    public final AbstractC2145n m57144h(PaymentDataInfo paymentDataInfo) {
        sq8.m48649h(paymentDataInfo, "paymentDataInfo");
        return e84.m24521b(eu5.m25611b(), 0L, new C18304a(paymentDataInfo, null), 2, null);
    }

    /* renamed from: i */
    public final AbstractC2145n m57145i(List list) {
        sq8.m48649h(list, "paymentProviders");
        return e84.m24521b(eu5.m25611b(), 0L, new C18305b(list, null), 2, null);
    }

    /* renamed from: k */
    public final AbstractC2145n m57146k(PaymentDataInfo paymentDataInfo, String str) {
        sq8.m48649h(paymentDataInfo, "paymentDataInfo");
        return e84.m24521b(eu5.m25611b(), 0L, new C18306c(paymentDataInfo, str, null), 2, null);
    }

    /* renamed from: l */
    public final AbstractC2145n m57147l(String str, String str2, String str3, int i) {
        return e84.m24521b(eu5.m25611b(), 0L, new C18307d(str2, this, str3, str, i, null), 2, null);
    }

    /* renamed from: n */
    public final AbstractC2145n m57148n(PaymentDataInfo paymentDataInfo) {
        sq8.m48649h(paymentDataInfo, "paymentDataInfo");
        return e84.m24521b(eu5.m25611b(), 0L, new C18308e(paymentDataInfo, null), 2, null);
    }
}
