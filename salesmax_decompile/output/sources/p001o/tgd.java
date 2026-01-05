package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.dx7;
import p001o.z81;

/* loaded from: classes3.dex */
public abstract class tgd {
    /* renamed from: c */
    public static final Object m49839c(final mdd mddVar, final aig aigVar, v81 v81Var, final xk7 xk7Var, n64 n64Var) {
        jl6 jl6Var = new jl6();
        jl6Var.mo34002p(e7f.f21127a.m24497d(), "SynthesizeSpeech");
        jl6Var.mo34002p(s38.f44646a.m47571g(), aigVar);
        z38 z38VarMo16700b = new yhg().mo16700b(jl6Var, aigVar);
        o86 o86Var = new o86(mddVar.getConfig());
        z38VarMo16700b.m58673j(o38.GET);
        z38VarMo16700b.m58671h().m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.pgd
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return tgd.m49841e(aigVar, (kpb) obj);
            }
        });
        z38VarMo16700b.m58668e().m59800h();
        return ngd.m40545a(z38VarMo16700b, jl6Var, mddVar.getConfig().m38772g(), o86Var, v81Var, new xk7() { // from class: o.rgd
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return tgd.m49842f(mddVar, xk7Var, (z81.C18572a) obj);
            }
        }, n64Var);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m49840d(mdd mddVar, aig aigVar, v81 v81Var, xk7 xk7Var, n64 n64Var, int i, Object obj) {
        if ((i & 2) != 0) {
            v81Var = cc5.m20837c();
        }
        return m49839c(mddVar, aigVar, v81Var, xk7Var, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y3i m49841e(aig aigVar, kpb kpbVar) {
        boolean z;
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (aigVar.m17165a() != null) {
            kpbVar.mo20265E("Engine", aigVar.m17165a().mo56209a());
        }
        if (aigVar.m17166b() != null) {
            kpbVar.mo20265E("LanguageCode", aigVar.m17166b().mo49828a());
        }
        List listM17167c = aigVar.m17167c();
        boolean z2 = false;
        if (listM17167c != null && (listM17167c.isEmpty() ^ true)) {
            List listM17167c2 = aigVar.m17167c();
            ArrayList arrayList = new ArrayList(dh3.m23088v(listM17167c2, 10));
            Iterator it = listM17167c2.iterator();
            while (it.hasNext()) {
                arrayList.add(tx7.m50746a((String) it.next()));
            }
            kpbVar.mo20278m("LexiconNames", arrayList);
        }
        if (aigVar.m17168d() != null) {
            kpbVar.mo20265E("OutputFormat", aigVar.m17168d().mo33800a());
        }
        String strM17169e = aigVar.m17169e();
        if (strM17169e == null) {
            z = false;
        } else {
            if (strM17169e.length() > 0) {
                z = true;
            }
        }
        if (z) {
            kpbVar.mo20265E("SampleRate", aigVar.m17169e());
        }
        List listM17170f = aigVar.m17170f();
        if (listM17170f != null && (listM17170f.isEmpty() ^ true)) {
            List listM17170f2 = aigVar.m17170f();
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(listM17170f2, 10));
            Iterator it2 = listM17170f2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(tx7.m50746a(((k0g) it2.next()).mo34846a()));
            }
            kpbVar.mo20278m("SpeechMarkTypes", arrayList2);
        }
        String strM17171g = aigVar.m17171g();
        if (strM17171g != null) {
            if (strM17171g.length() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            kpbVar.mo20265E("Text", aigVar.m17171g());
        }
        if (aigVar.m17172h() != null) {
            kpbVar.mo20265E("TextType", aigVar.m17172h().mo57856a());
        }
        if (aigVar.m17173i() != null) {
            kpbVar.mo20265E("VoiceId", aigVar.m17173i().mo36461a());
        }
        return y3i.f54824a;
    }

    /* renamed from: f */
    public static final y3i m49842f(mdd mddVar, xk7 xk7Var, z81.C18572a c18572a) {
        sq8.m48649h(c18572a, "$this$presignRequest");
        if (c18572a.m58910k() == null) {
            c18572a.m58924y("polly");
        }
        if (c18572a.m58909j() == null) {
            c18572a.m58923x(mddVar.getConfig().m38777l());
        }
        c18572a.m58919t(dx7.C13050a.f20620a);
        xk7Var.invoke(c18572a);
        return y3i.f54824a;
    }
}
