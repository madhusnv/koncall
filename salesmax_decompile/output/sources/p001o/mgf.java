package p001o;

import java.util.Optional;
import java.util.function.Consumer;
import p001o.lu4;
import p001o.mgf;
import retrofit2.C18795f;
import retrofit2.Call;
import retrofit2.Callback;

/* loaded from: classes.dex */
public class mgf {

    /* renamed from: o.mgf$a */
    public class C15319a implements Callback {

        /* renamed from: a */
        public final /* synthetic */ lu4.InterfaceC15153a f35411a;

        public C15319a(lu4.InterfaceC15153a interfaceC15153a) {
            this.f35411a = interfaceC15153a;
        }

        /* renamed from: b */
        public static /* synthetic */ void m39005b(lu4.InterfaceC15153a interfaceC15153a, cre creVar) {
            interfaceC15153a.mo17836f(creVar.m21613a());
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, bre breVar) {
            Optional optionalOfNullable = Optional.ofNullable((cre) breVar.m19663a());
            final lu4.InterfaceC15153a interfaceC15153a = this.f35411a;
            optionalOfNullable.ifPresent(new Consumer() { // from class: o.lgf
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    mgf.C15319a.m39005b(interfaceC15153a, (cre) obj);
                }
            });
        }
    }

    /* renamed from: a */
    public void m39003a(hd8 hd8Var, String str, lu4.InterfaceC15153a interfaceC15153a) {
        ((ed8) new C18795f.b().m60267a("https://superfone.ai/").m60269c().m60258b(ed8.class)).m24786a(str).enqueue(new C15319a(interfaceC15153a));
    }
}
