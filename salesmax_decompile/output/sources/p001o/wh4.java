package p001o;

import ai.salesmax.model.FormDefinition;
import androidx.lifecycle.AbstractC2145n;
import java.util.Arrays;
import java.util.List;
import p001o.yne;

/* loaded from: classes.dex */
public final class wh4 extends dxi {

    /* renamed from: o.wh4$a */
    public static final class C17866a extends jgg implements nl7 {

        /* renamed from: a */
        public int f51987a;

        /* renamed from: b */
        public /* synthetic */ Object f51988b;

        /* renamed from: c */
        public final /* synthetic */ FormDefinition f51989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17866a(FormDefinition formDefinition, n64 n64Var) {
            super(2, n64Var);
            this.f51989c = formDefinition;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17866a c17866a = new C17866a(this.f51989c, n64Var);
            c17866a.f51988b = obj;
            return c17866a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17866a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f51987a;
            try {
            } catch (Exception e) {
                r1.getClass();
                yne.C18447a c18447a = yne.f55736e;
                String str = String.format("Couldn't save property definitions %s", Arrays.copyOf(new Object[]{e.getMessage()}, 1));
                sq8.m48648g(str, "format(...)");
                yne yneVarM58028a = c18447a.m58028a(null, str, e);
                this.f51988b = null;
                this.f51987a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f51988b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f51988b = ogaVar2;
                this.f51987a = 1;
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
                    oga ogaVar3 = (oga) this.f51988b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f51988b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = swd.K0(this.f51989c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((FormDefinition) objM55727f);
            this.f51988b = ogaVar;
            this.f51987a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wh4$b */
    public static final class C17867b extends jgg implements nl7 {

        /* renamed from: a */
        public int f51990a;

        /* renamed from: b */
        public /* synthetic */ Object f51991b;

        /* renamed from: c */
        public final /* synthetic */ List f51992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17867b(List list, n64 n64Var) {
            super(2, n64Var);
            this.f51992c = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17867b c17867b = new C17867b(this.f51992c, n64Var);
            c17867b.f51991b = obj;
            return c17867b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C17867b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f51990a;
            try {
            } catch (Exception e) {
                r1.getClass();
                yne.C18447a c18447a = yne.f55736e;
                String str = String.format("Couldn't save property definitions %s", Arrays.copyOf(new Object[]{e.getMessage()}, 1));
                sq8.m48648g(str, "format(...)");
                yne yneVarM58028a = c18447a.m58028a(null, str, e);
                this.f51991b = null;
                this.f51990a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f51991b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f51991b = ogaVar2;
                this.f51990a = 1;
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
                    oga ogaVar3 = (oga) this.f51991b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f51991b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = swd.M0(this.f51992c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f51991b = ogaVar;
            this.f51990a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: f */
    public final AbstractC2145n m54397f(FormDefinition formDefinition) {
        sq8.m48649h(formDefinition, "formDefinition");
        return e84.m24521b(eu5.m25611b(), 0L, new C17866a(formDefinition, null), 2, null);
    }

    /* renamed from: g */
    public final AbstractC2145n m54398g(List list) {
        sq8.m48649h(list, "propertyDefinitions");
        return e84.m24521b(eu5.m25611b(), 0L, new C17867b(list, null), 2, null);
    }
}
