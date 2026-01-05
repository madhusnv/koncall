package p001o;

import ai.salesmax.model.SearchAPiResult;
import android.content.Context;
import androidx.lifecycle.AbstractC2145n;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import p001o.ule;
import p001o.yne;

/* loaded from: classes.dex */
public abstract class h40 {

    /* renamed from: o.h40$a */
    public static final class C13846a implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f26179a;

        public C13846a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f26179a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f26179a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof n9c) && (obj instanceof am7)) {
                return sq8.m48644c(mo37a(), ((am7) obj).mo37a());
            }
            return false;
        }

        public final int hashCode() {
            return mo37a().hashCode();
        }

        @Override // p001o.n9c
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26179a.invoke(obj);
        }
    }

    /* renamed from: o.h40$b */
    public static final class C13847b extends jgg implements nl7 {

        /* renamed from: a */
        public int f26180a;

        /* renamed from: b */
        public /* synthetic */ Object f26181b;

        /* renamed from: c */
        public final /* synthetic */ String f26182c;

        /* renamed from: d */
        public final /* synthetic */ Context f26183d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13847b(String str, Context context, n64 n64Var) {
            super(2, n64Var);
            this.f26182c = str;
            this.f26183d = context;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13847b c13847b = new C13847b(this.f26182c, this.f26183d, n64Var);
            c13847b.f26181b = obj;
            return c13847b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C13847b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.oga] */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f26180a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f26181b = null;
                this.f26180a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f26181b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f26181b = ogaVar2;
                this.f26180a = 1;
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
                ogaVar = (oga) this.f26181b;
                wre.m54934b(obj);
            }
            zqe zqeVarM29787b = h40.m29787b(this.f26182c, this.f26183d);
            Gson gson = new Gson();
            cre creVarM59735c = zqeVarM29787b.m59735c();
            yne yneVarM58030d = yne.f55736e.m58030d((SearchAPiResult) gson.fromJson(creVarM59735c != null ? creVarM59735c.m21615d() : null, SearchAPiResult.class));
            this.f26181b = ogaVar;
            this.f26180a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final zqe m29787b(String str, Context context) {
        String string = context.getString(hae.google_maps_key);
        sq8.m48648g(string, "getString(...)");
        return FirebasePerfOkHttpClient.execute(new hac().m30051A().m30116c().mo19702a(new ule.C17397a().m51769z("https://maps.googleapis.com/maps/api/place/textsearch/json?query=" + str + "&region=in&fields=formatted_address%2Cname&key=" + string).m51759p("GET", null).m51746b()));
    }

    /* renamed from: c */
    public static final AbstractC2145n m29788c(String str, Context context) {
        sq8.m48649h(str, "input");
        sq8.m48649h(context, "context");
        return e84.m24521b(eu5.m25611b(), 0L, new C13847b(str, context, null), 2, null);
    }
}
