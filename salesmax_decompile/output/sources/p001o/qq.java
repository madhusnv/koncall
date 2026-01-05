package p001o;

import android.app.Application;
import androidx.lifecycle.AbstractC2145n;
import java.util.List;

/* loaded from: classes.dex */
public final class qq extends zf0 {

    /* renamed from: o.qq$a */
    public static final class C16443a extends jgg implements nl7 {

        /* renamed from: a */
        public int f42278a;

        /* renamed from: b */
        public /* synthetic */ Object f42279b;

        /* renamed from: c */
        public final /* synthetic */ String f42280c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16443a(String str, n64 n64Var) {
            super(2, n64Var);
            this.f42280c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16443a c16443a = new C16443a(this.f42280c, n64Var);
            c16443a.f42279b = obj;
            return c16443a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C16443a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f42278a;
            try {
            } catch (Exception e) {
                yne yneVarM58028a = yne.f55736e.m58028a(null, "Couldn't save payment data " + e.getMessage(), e);
                this.f42279b = null;
                this.f42278a = 3;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f42279b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f42279b = ogaVar2;
                this.f42278a = 1;
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
                    oga ogaVar3 = (oga) this.f42279b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f42279b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = uni.kC().TB().lastKnownLocation(this.f42280c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f);
            this.f42279b = ogaVar;
            this.f42278a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: g */
    public final AbstractC2145n m45761g(String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C16443a(str, null), 2, null);
    }
}
