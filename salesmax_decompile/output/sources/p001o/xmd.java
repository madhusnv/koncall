package p001o;

import ai.salesmax.model.ProfileView;
import androidx.lifecycle.AbstractC2145n;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.User;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p001o.yne;

/* loaded from: classes.dex */
public final class xmd extends dxi {

    /* renamed from: o.xmd$a */
    public static final class C18184a implements rl7 {

        /* renamed from: a */
        public static final C18184a f53922a = new C18184a();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.ED();
        }
    }

    /* renamed from: o.xmd$b */
    public static final class C18185b implements rl7 {

        /* renamed from: a */
        public static final C18185b f53923a = new C18185b();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.xmd$c */
    public static final class C18186c implements rl7 {

        /* renamed from: a */
        public static final C18186c f53924a = new C18186c();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProfileView apply(mii miiVar) {
            User userM39171u = miiVar.m39171u();
            String name = userM39171u != null ? userM39171u.getName() : null;
            if (name == null) {
                name = "";
            }
            Account accountM39156f = miiVar.m39156f();
            String accountName = accountM39156f != null ? accountM39156f.getAccountName() : null;
            String str = accountName != null ? accountName : "";
            Account accountM39156f2 = miiVar.m39156f();
            return new ProfileView(name, str, accountM39156f2 != null ? accountM39156f2.getBusinessLogoUrl() : null);
        }
    }

    /* renamed from: o.xmd$d */
    public static final class C18187d implements gu3 {

        /* renamed from: a */
        public static final C18187d f53925a = new C18187d();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        }
    }

    /* renamed from: o.xmd$e */
    public static final class C18188e extends jgg implements nl7 {

        /* renamed from: a */
        public int f53926a;

        /* renamed from: b */
        public /* synthetic */ Object f53927b;

        /* renamed from: c */
        public final /* synthetic */ String f53928c;

        /* renamed from: d */
        public final /* synthetic */ String f53929d;

        /* renamed from: e */
        public final /* synthetic */ String f53930e;

        /* renamed from: f */
        public final /* synthetic */ String f53931f;

        /* renamed from: g */
        public final /* synthetic */ String f53932g;

        /* renamed from: h */
        public final /* synthetic */ String f53933h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18188e(String str, String str2, String str3, String str4, String str5, String str6, n64 n64Var) {
            super(2, n64Var);
            this.f53928c = str;
            this.f53929d = str2;
            this.f53930e = str3;
            this.f53931f = str4;
            this.f53932g = str5;
            this.f53933h = str6;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C18188e c18188e = new C18188e(this.f53928c, this.f53929d, this.f53930e, this.f53931f, this.f53932g, this.f53933h, n64Var);
            c18188e.f53927b = obj;
            return c18188e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C18188e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            ?? r1 = this.f53926a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f53927b = null;
                this.f53926a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f53927b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f53927b = ogaVar2;
                this.f53926a = 1;
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
                    oga ogaVar3 = (oga) this.f53927b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f53927b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(lpi.S0(this.f53928c, this.f53929d, this.f53930e, this.f53931f, this.f53932g, this.f53933h));
            this.f53927b = ogaVar;
            this.f53926a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.xmd$f */
    public static final class C18189f implements rl7 {

        /* renamed from: a */
        public static final C18189f f53934a = new C18189f();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: f */
    public final x6c m56474f() {
        x6c x6cVarD0 = uni.LB().d0(C18184a.f53922a);
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    /* renamed from: g */
    public final wtf m56475g() {
        wtf wtfVarM55013f = uni.LB().d0(C18185b.f53923a).d0(C18186c.f53924a).m55716L().m55013f(C18187d.f53925a);
        sq8.m48648g(wtfVarM55013f, "doOnError(...)");
        return wtfVarM55013f;
    }

    /* renamed from: h */
    public final x6c m56476h() {
        x6c x6cVarD0 = uni.LB().d0(C18189f.f53934a);
        sq8.m48648g(x6cVarD0, "map(...)");
        return x6cVarD0;
    }

    /* renamed from: i */
    public final AbstractC2145n m56477i(String str, String str2, String str3, String str4, String str5, String str6) {
        sq8.m48649h(str, "accountId");
        return e84.m24521b(eu5.m25611b(), 0L, new C18188e(str, str4, str2, str3, str5, str6, null), 2, null);
    }
}
