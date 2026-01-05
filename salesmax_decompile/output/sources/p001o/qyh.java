package p001o;

import android.text.style.TtsSpan;

/* loaded from: classes2.dex */
public abstract class qyh {
    /* renamed from: a */
    public static final TtsSpan m45984a(pyh pyhVar) {
        sq8.m48649h(pyhVar, "<this>");
        if (pyhVar instanceof psi) {
            return m45985b((psi) pyhVar);
        }
        throw new szb();
    }

    /* renamed from: b */
    public static final TtsSpan m45985b(psi psiVar) {
        sq8.m48649h(psiVar, "<this>");
        TtsSpan ttsSpanBuild = new TtsSpan.VerbatimBuilder(psiVar.m44135a()).build();
        sq8.m48648g(ttsSpanBuild, "builder.build()");
        return ttsSpanBuild;
    }
}
