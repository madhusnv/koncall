package p001o;

import ai.salesmax.model.ProductServiceSummary;
import androidx.lifecycle.AbstractC2145n;
import java.util.List;

/* loaded from: classes.dex */
public final class eld extends dxi {

    /* renamed from: o.eld$a */
    public static final class C13213a extends jgg implements nl7 {

        /* renamed from: a */
        public int f21805a;

        /* renamed from: b */
        public /* synthetic */ Object f21806b;

        /* renamed from: c */
        public final /* synthetic */ String f21807c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13213a(String str, n64 n64Var) {
            super(2, n64Var);
            this.f21807c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13213a c13213a = new C13213a(this.f21807c, n64Var);
            c13213a.f21806b = obj;
            return c13213a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13213a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f21805a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save productService", e);
                this.f21806b = null;
                this.f21805a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f21806b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f21806b = ogaVar2;
                this.f21805a = 1;
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
                ogaVar = (oga) this.f21806b;
                wre.m54934b(obj);
            }
            String str = this.f21807c;
            Object objM55727f = (str == null ? ald.m17383f() : ald.m17384g(str)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f21806b = ogaVar;
            this.f21805a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.eld$b */
    public static final class C13214b extends jgg implements nl7 {

        /* renamed from: a */
        public int f21808a;

        /* renamed from: b */
        public /* synthetic */ Object f21809b;

        /* renamed from: c */
        public final /* synthetic */ ProductServiceSummary f21810c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13214b(ProductServiceSummary productServiceSummary, n64 n64Var) {
            super(2, n64Var);
            this.f21810c = productServiceSummary;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13214b c13214b = new C13214b(this.f21810c, n64Var);
            c13214b.f21809b = obj;
            return c13214b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13214b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f21808a;
            try {
            } catch (Exception e) {
                r1.getClass();
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save productService", e);
                this.f21809b = null;
                this.f21808a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f21809b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f21809b = ogaVar2;
                this.f21808a = 1;
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
                    oga ogaVar3 = (oga) this.f21809b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f21809b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = ald.m17385h(this.f21810c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((ProductServiceSummary) objM55727f);
            this.f21809b = ogaVar;
            this.f21808a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ AbstractC2145n m25210g(eld eldVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return eldVar.m25211f(str);
    }

    /* renamed from: f */
    public final AbstractC2145n m25211f(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C13213a(str, null), 2, null);
    }

    /* renamed from: h */
    public final AbstractC2145n m25212h(ProductServiceSummary productServiceSummary) {
        sq8.m48649h(productServiceSummary, "productServiceSummary");
        return e84.m24521b(eu5.m25611b(), 0L, new C13214b(productServiceSummary, null), 2, null);
    }
}
